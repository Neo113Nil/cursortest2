package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import com.yandex.pulse.metrics.o;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.C1109k8;

/* loaded from: classes.dex */
public final class x8x implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public x8x(t9 t9Var) {
        this.a = 1;
        this.c = t9Var;
        this.b = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae A[Catch: all -> 0x0297, TRY_LEAVE, TryCatch #12 {all -> 0x0297, blocks: (B:109:0x0257, B:110:0x0263, B:116:0x0274, B:117:0x0275, B:119:0x027c, B:123:0x0291, B:126:0x029a, B:130:0x02ae, B:133:0x02c5, B:135:0x02d9, B:142:0x02f1, B:149:0x02d6, B:155:0x02c1, B:161:0x02a8, B:164:0x02f6, B:151:0x02bc, B:158:0x02a4, B:138:0x02ed, B:112:0x0264, B:114:0x026d, B:146:0x02d2), top: B:108:0x0257, inners: #1, #4, #7, #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        long j;
        long j2;
        fxh fxhVar;
        ScheduledFuture scheduledFuture;
        ScheduledExecutorService scheduledExecutorService;
        int i = 0;
        Throwable th = null;
        r4 = null;
        q qVar = null;
        th = null;
        switch (this.a) {
            case 0:
                anx anxVar = (anx) this.c;
                a9x a9xVar = (a9x) this.b;
                if (a9xVar instanceof j8x) {
                    j8x j8xVar = (j8x) a9xVar;
                    if (j8xVar instanceof f8x) {
                        Object obj2 = j8xVar.a;
                        if (obj2 instanceof a8x) {
                            th = ((a8x) obj2).a;
                        }
                    }
                    if (th != null) {
                        anxVar.I(th);
                        return;
                    }
                }
                try {
                    if (!a9xVar.isDone()) {
                        throw new IllegalStateException(ocg.I("Future was expected to be done: %s", a9xVar));
                    }
                    while (true) {
                        try {
                            Object obj3 = a9xVar.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj3;
                            int intValue = num.intValue();
                            r5x r5xVar = (r5x) anxVar.d;
                            if (intValue <= 0) {
                                ((Runnable) anxVar.c).run();
                                return;
                            }
                            int i2 = anxVar.a;
                            uz2 a = b6x.a(num.intValue(), "Billing override value was set by a license tester.");
                            r5xVar.G(105, i2, a);
                            ((Consumer) anxVar.b).accept(a);
                            return;
                        } catch (InterruptedException unused) {
                            i = 1;
                        } catch (Throwable th2) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    }
                } catch (ExecutionException e) {
                    anxVar.I(e.getCause());
                    return;
                } catch (Throwable th3) {
                    anxVar.I(th3);
                    return;
                }
            case 1:
                ((ArrayList) this.b).clear();
                try {
                    ((ArrayList) this.b).addAll(((t9) this.c).getConnections());
                    obj = ((t9) this.c).syncConnectionLost;
                    synchronized (obj) {
                        double nanoTime = System.nanoTime();
                        j = ((t9) this.c).connectionLostTimeout;
                        j2 = (long) (nanoTime - (j * 1.5d));
                    }
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        t9.access$200((t9) this.c, (ocv) it.next(), j2);
                    }
                } catch (Exception unused2) {
                }
                ((ArrayList) this.b).clear();
                return;
            case 2:
                ag agVar = (ag) this.b;
                dg dgVar = (dg) this.c;
                hxh hxhVar = dgVar.c;
                if (hxhVar != null && (fxhVar = hxhVar.e) != null) {
                    fxhVar.a(hxhVar);
                }
                View view = (View) dgVar.h;
                if (view != null && view.getWindowToken() != null) {
                    if (!agVar.b()) {
                        if (agVar.e != null) {
                            agVar.d(0, 0, false, false);
                        }
                    }
                    dgVar.s = agVar;
                }
                dgVar.u = null;
                return;
            case 3:
                ((zd0) this.c).c.unregisterNetworkCallback((xd0) this.b);
                return;
            case 4:
                ((zd0) this.c).b.unregisterReceiver((yd0) this.b);
                return;
            case 5:
                Set set = bp6.a;
                if (set.contains(this)) {
                    return;
                }
                try {
                    pa7 a2 = lt0.a();
                    la laVar = (la) this.b;
                    ht0 ht0Var = (ht0) this.c;
                    synchronized (a2) {
                        laVar.getClass();
                        tlp c = a2.c(laVar);
                        if (c != null) {
                            c.a(ht0Var);
                        }
                    }
                    if (y9w.t() != 2) {
                        int b = lt0.a().b();
                        if (!set.contains(lt0.class)) {
                            i = 100;
                        }
                        if (b > i) {
                            lt0.e(5);
                            return;
                        }
                    }
                    if (!set.contains(lt0.class)) {
                        try {
                            scheduledFuture = lt0.c;
                        } catch (Throwable th4) {
                            bp6.a(lt0.class, th4);
                        }
                        if (scheduledFuture == null) {
                            return;
                        }
                        pa7 pa7Var = lt0.a;
                        if (!bp6.a.contains(lt0.class)) {
                            try {
                                scheduledExecutorService = lt0.b;
                            } catch (Throwable th5) {
                                bp6.a(lt0.class, th5);
                            }
                            pa7 pa7Var2 = lt0.a;
                            if (!bp6.a.contains(lt0.class)) {
                                try {
                                    qVar = lt0.d;
                                } catch (Throwable th6) {
                                    bp6.a(lt0.class, th6);
                                }
                            }
                            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(qVar, 15, TimeUnit.SECONDS);
                            if (bp6.a.contains(lt0.class)) {
                                try {
                                    lt0.c = schedule;
                                    return;
                                } catch (Throwable th7) {
                                    bp6.a(lt0.class, th7);
                                    return;
                                }
                            }
                            return;
                        }
                        scheduledExecutorService = null;
                        pa7 pa7Var22 = lt0.a;
                        if (!bp6.a.contains(lt0.class)) {
                        }
                        ScheduledFuture<?> schedule2 = scheduledExecutorService.schedule(qVar, 15, TimeUnit.SECONDS);
                        if (bp6.a.contains(lt0.class)) {
                        }
                    }
                    scheduledFuture = null;
                    if (scheduledFuture == null) {
                    }
                } catch (Throwable th8) {
                    bp6.a(this, th8);
                    return;
                }
            case 6:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    nt0.H((la) this.b, (tlp) this.c);
                    return;
                } catch (Throwable th9) {
                    bp6.a(this, th9);
                    return;
                }
            case 7:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i3 = 0;
                    for (int i4 = 0; i4 < 11; i4++) {
                        String str = strArr[i4];
                        String str2 = strArr2[i4];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i3 |= 1 << i4;
                        } catch (ClassNotFoundException unused3) {
                        }
                    }
                    SharedPreferences sharedPreferences = ((Context) this.b).getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if (sharedPreferences.getInt("kitsBitmask", 0) != i3) {
                        sharedPreferences.edit().putInt("kitsBitmask", i3).apply();
                        ((pt0) this.c).z(bundle, "fb_sdk_initialize");
                        return;
                    }
                    return;
                } catch (Throwable th10) {
                    bp6.a(this, th10);
                    return;
                }
            case 8:
                kr1 kr1Var = (kr1) this.c;
                ls1 ls1Var = (ls1) kr1Var.f;
                if (ls1Var.g == kr1Var.b) {
                    List list = (List) kr1Var.d;
                    e38 e38Var = (e38) this.b;
                    Runnable runnable = (Runnable) kr1Var.e;
                    ls1Var.e = list;
                    ls1Var.f = Collections.unmodifiableList(list);
                    e38Var.a(ls1Var.a);
                    ls1Var.a(runnable);
                    return;
                }
                return;
            case 9:
                ((ms1) this.c).e((om3) this.b);
                return;
            case 10:
                ((Runnable) this.b).run();
                ((Semaphore) this.c).release();
                return;
            case 11:
                ((viq) ((nud) this.c).c).k(null, (InetAddress[]) this.b);
                return;
            case 12:
                ((viq) ((nud) this.c).c).k((Exception) this.b, null);
                return;
            case 13:
                gao gaoVar = (gao) this.b;
                Typeface typeface = (Typeface) this.c;
                hag hagVar = (hag) gaoVar.a;
                if (hagVar != null) {
                    hagVar.u(typeface);
                    return;
                }
                return;
            case 14:
                C1109k8.a(((qvw) ((kc4) this.b)).a, (czh) this.c);
                return;
            case 15:
                v7o v7oVar = (v7o) this.b;
                if (v7oVar != null) {
                    v7oVar.onError((veb) this.c);
                    return;
                }
                return;
            case 16:
                v7o v7oVar2 = (v7o) this.b;
                if (v7oVar2 != null) {
                    v7oVar2.onSuccess(((gw0) this.c).d.A());
                    return;
                }
                return;
            case 17:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    Context b2 = j3c.b();
                    b2.getClass();
                    new pt0(b2, (String) null).w((Bundle) this.c, (String) this.b);
                    return;
                } catch (Throwable th11) {
                    bp6.a(this, th11);
                    return;
                }
            case 18:
                sf7 sf7Var = (sf7) this.b;
                if (Intrinsics.d(sf7Var.m.c, (i4e) this.c)) {
                    return;
                }
                sf7Var.c(pdr.a(sf7Var.m, false, false, (i4e) this.c, null, null, 27));
                return;
            case 19:
                ((f8h) this.c).g(sgr.i.i(((StringBuilder) this.b).toString()), true);
                return;
            case 20:
                vn4 vn4Var = ((f8h) this.c).f;
                sgr sgrVar = (sgr) this.b;
                vn4Var.a(sgrVar.b, sgrVar.c);
                return;
            case 21:
                ((f8h) this.c).f.e(this.b);
                return;
            case 22:
                ((jv7) this.c).t.R((s2i) this.b);
                return;
            case 23:
                ((jv7) this.c).t.S(this.b);
                return;
            case 24:
                o2g.U("Channel must have been shut down", ((j8h) ((mv7) this.c).h.b).F.get());
                return;
            case 25:
                ((lv7) this.c).c.r((nq4) this.b);
                return;
            case 26:
                ((lv7) this.c).c.a0((ch7) this.b);
                return;
            case 27:
                ((lv7) this.c).c.h0((ce7) this.b);
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((lv7) this.c).c.E((rym) this.b);
                return;
            default:
                ((lv7) this.c).c.f((sgr) this.b);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                z6u z6uVar = new z6u(x8x.class.getSimpleName(), 9);
                anx anxVar = (anx) this.c;
                apo apoVar = new apo(20);
                ((apo) z6uVar.d).c = apoVar;
                z6uVar.d = apoVar;
                apoVar.b = anxVar;
                return z6uVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x8x(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ x8x(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
