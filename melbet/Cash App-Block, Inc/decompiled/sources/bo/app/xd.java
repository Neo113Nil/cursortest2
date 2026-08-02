package bo.app;

import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class xd {
    public static final sd k = new sd();
    public final ue a;
    public final r7 b;
    public td c;
    public long d;
    public int e;
    public final ArrayList f;
    public int g;
    public final ReentrantLock h;
    public Job i;
    public final AtomicInteger j;

    public xd(ue ueVar, r7 r7Var, Context context) {
        ueVar.getClass();
        r7Var.getClass();
        context.getClass();
        this.a = ueVar;
        this.b = r7Var;
        this.c = new td();
        this.d = DateTimeUtils.nowInSeconds();
        this.f = new ArrayList();
        this.h = new ReentrantLock();
        final int i = 0;
        this.j = new AtomicInteger(0);
        if (g()) {
            c();
        }
        r7Var.c(zc.class, new IEventSubscriber(this) { // from class: bo.app.xd$$ExternalSyntheticLambda0
            public final /* synthetic */ xd f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                xd xdVar = this.f$0;
                switch (i2) {
                    case 0:
                        xd.a(xdVar, (zc) obj);
                        break;
                    default:
                        xd.a(xdVar, (yd) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        r7Var.c(yd.class, new IEventSubscriber(this) { // from class: bo.app.xd$$ExternalSyntheticLambda0
            public final /* synthetic */ xd f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i2;
                xd xdVar = this.f$0;
                switch (i22) {
                    case 0:
                        xd.a(xdVar, (zc) obj);
                        break;
                    default:
                        xd.a(xdVar, (yd) obj);
                        break;
                }
            }
        });
    }

    public static final String b() {
        return "Shutting down SDK Debugger due to being past expiration time";
    }

    public static final String d() {
        return "Initializing SDK Debugger";
    }

    public static final String e() {
        return "SDK Debugger transitioned from disabled to enabled. Initializing SDK Debugger.";
    }

    public static final String f() {
        return "SDK Debugger transitioned from enabled to disabled. Shutting down SDK Debugger.";
    }

    public static final String h() {
        return "Debugging session has expired. Disabling SDK Debugger.";
    }

    public static final String j() {
        return "Shutting down SDK Debugger";
    }

    public final Unit a() {
        Long l;
        td tdVar = this.c;
        if (!tdVar.a || tdVar.c == null || (l = tdVar.b) == null || l.longValue() == 0 || this.j.get() > 0) {
            return Unit.INSTANCE;
        }
        Long l2 = this.c.b;
        if (l2 != null) {
            if (DateTimeUtils.nowInSeconds() > l2.longValue()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(8), 7, (Object) null);
                i();
                return Unit.INSTANCE;
            }
        }
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        long j = this.d;
        td tdVar2 = this.c;
        long j2 = j + tdVar2.e;
        if (nowInSeconds > j2 || this.g > tdVar2.d) {
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                ArrayList arrayList2 = this.f;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    de deVar = (de) obj;
                    int i4 = this.e;
                    if (i4 != 0) {
                        String str = "Removed " + i4 + " logs due to buffer overflow";
                        arrayList.add(new de(str));
                        this.e = 0;
                        i3 += str.length();
                    }
                    int length = deVar.a.length() + i3;
                    if (length <= this.c.f) {
                        arrayList.add(deVar);
                        i3 = length;
                    }
                }
                int size2 = arrayList.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    this.f.remove((de) obj2);
                }
                ArrayList arrayList3 = this.f;
                int size3 = arrayList3.size();
                int i6 = 0;
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    i6 += ((de) obj3).a.length();
                }
                this.g = i6;
                this.d = DateTimeUtils.nowInSeconds();
                reentrantLock.unlock();
                Job job = this.i;
                if (job != null) {
                    job.cancel(null);
                }
                this.i = null;
                if (!arrayList.isEmpty()) {
                    this.j.incrementAndGet();
                    this.b.b(new fe(arrayList), fe.class);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else if (this.i == null) {
            this.i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, new Long(TimeUnit.SECONDS.toMillis(j2 - DateTimeUtils.nowInSeconds())), null, new ud(this, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void c() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(5), 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(new vd(this));
        this.b.b(new be(), be.class);
    }

    public final boolean g() {
        xd xdVar;
        this.c.a = this.a.N();
        td tdVar = this.c;
        if (tdVar.a) {
            tdVar.c = this.a.z();
            this.c.d = this.a.B();
            this.c.e = this.a.C();
            this.c.f = this.a.D();
            this.c.b = Long.valueOf(this.a.A());
        }
        Long l = this.c.b;
        if (l != null) {
            if (DateTimeUtils.nowInSeconds() > l.longValue()) {
                xdVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) xdVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(4), 7, (Object) null);
                xdVar.c = new td();
                return xdVar.c.a;
            }
        }
        xdVar = this;
        return xdVar.c.a;
    }

    public final void i() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(3), 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.c = new td();
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.f.clear();
            this.g = 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(yd ydVar) {
        return "Updating SDK Debugger config with " + ydVar.a;
    }

    public static final void a(xd xdVar, zc zcVar) {
        zcVar.getClass();
        if (zcVar.a instanceof ee) {
            xdVar.j.decrementAndGet();
            JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new rd(xdVar, null), 3);
        }
    }

    public static final String a(td tdVar) {
        return "updating expiration time to " + tdVar.b;
    }

    public static final void a(xd xdVar, yd ydVar) {
        ydVar.getClass();
        td tdVar = xdVar.c;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(3, ydVar, tdVar), 7, (Object) null);
        if (ydVar.a.b == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(tdVar, 27), 7, (Object) null);
            ydVar.a.b = tdVar.b;
        }
        td tdVar2 = ydVar.a;
        if (tdVar2.c == null) {
            tdVar2.c = tdVar.c;
        }
        xdVar.c = tdVar2;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, priority, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(ydVar, 28), 6, (Object) null);
        xdVar.a.a(ydVar.a);
        boolean z = tdVar.a;
        if (!z && xdVar.c.a) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, priority, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(6), 6, (Object) null);
            xdVar.c();
        } else {
            if (!z || xdVar.c.a) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, priority, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(7), 6, (Object) null);
            xdVar.i();
        }
    }

    public final void a(String str, BrazeLogger.Priority priority, String str2, Throwable th) {
        List<String> split$default;
        str.getClass();
        priority.getClass();
        str2.getClass();
        if (!this.c.a || StringsKt.contains((CharSequence) str2, (CharSequence) "Braze v42.2.0 .", false)) {
            return;
        }
        String str3 = "";
        Object obj = th;
        if (th == null) {
            obj = "";
        }
        split$default = StringsKt__StringsKt.split$default(priority + " " + str + ": " + str2 + " " + obj, new String[]{"\n"}, false, 0, 6, null);
        for (String str4 : split$default) {
            if (str4.length() + str3.length() > this.c.f) {
                a(priority + ": " + ((Object) str3));
                str3 = str4;
            } else {
                str3 = ((Object) str3) + "\n" + str4;
            }
        }
        if (str3.length() > 0) {
            a(str3);
        }
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new wd(this, null), 3);
    }

    public final void a(String str) {
        de deVar = new de(str);
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.f.add(deVar);
            int length = this.g + deVar.a.length();
            this.g = length;
            if (length > 1048576) {
                while (this.g > 838860) {
                    this.g -= ((de) this.f.remove(0)).a.length();
                    this.e++;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(yd ydVar, td tdVar) {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + ydVar.a + ".\nOld config " + tdVar;
    }
}
