package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import com.connectsdk.service.airplay.PListParser;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class rjp implements ruq, bmw, c2x, ag6 {
    public Object a;
    public Object b;

    public rjp(Context context, int i) {
        switch (i) {
            case 10:
                this.a = context;
                break;
            default:
                y1g.G(context);
                Resources resources = context.getResources();
                this.a = resources;
                this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
        }
    }

    public static rjp e(char c) {
        return new rjp(new z6n(11, new yd4(c)), ae4.b, false);
    }

    @Override // defpackage.ruq
    public void a(int i) {
        Object value;
        List list;
        xdr xdrVar = (xdr) this.a;
        if (i < 0 || i >= ((Collection) xdrVar.getValue()).size()) {
            return;
        }
        do {
            value = xdrVar.getValue();
            List list2 = (List) value;
            list = list2;
            if (i >= 0) {
                List list3 = list2;
                list = list2;
                if (i < list3.size()) {
                    ArrayList y0 = CollectionsKt.y0(list3);
                    nb6 nb6Var = (nb6) y0.get(i);
                    nb6Var.getClass();
                    y0.set(i, nb6.a(nb6Var, 27));
                    list = y0;
                }
            }
        } while (!xdrVar.k(value, list));
    }

    public void b(float f, float f2) {
        ((o57) this.b).invoke(new gn0(new bsa(f, f2, this, 2)));
    }

    public void c() {
        ((gyr) this.a).b = true;
        ((ScheduledFuture) this.b).cancel(false);
    }

    public String d(String str) {
        String str2 = (String) this.b;
        Resources resources = (Resources) this.a;
        int identifier = resources.getIdentifier(str, PListParser.TAG_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public List f(CharSequence charSequence) {
        charSequence.getClass();
        o8r o8rVar = new o8r((z6n) this.b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (o8rVar.hasNext()) {
            arrayList.add((String) o8rVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void g(boolean z, boolean z2) {
        if (z && ((PowerManager.WakeLock) this.b) == null) {
            PowerManager powerManager = (PowerManager) ((Context) this.a).getSystemService("power");
            if (powerManager == null) {
                vq1.n0("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.b;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    @Override // defpackage.ruq
    public void k(int i, Long l, mm6 mm6Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        xdr xdrVar = (xdr) this.a;
        if (i < 0 || i >= ((Collection) xdrVar.getValue()).size()) {
            return;
        }
        nb6 nb6Var = (nb6) ((List) xdrVar.getValue()).get(i);
        if (nb6Var.c || nb6Var.d) {
            return;
        }
        r2f r2fVar = (r2f) linkedHashMap.get(Integer.valueOf(i));
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        linkedHashMap.put(Integer.valueOf(i), x97.y(mm6Var, null, null, new rs(this, i, l, null), 3));
    }

    @Override // defpackage.c2x
    public void n(String str, long j, long j2, long j3) {
        c2x c2xVar = (c2x) this.a;
        if (c2xVar != null) {
            c2xVar.n(str, j, j2, j3);
        }
    }

    @Override // defpackage.ruq
    public xdr o() {
        return (xdr) this.a;
    }

    @Override // defpackage.bmw
    public void onError(Throwable th) {
        th.getClass();
        v3w.l("transition failed: ", th.getMessage(), 5, ysw.k, null);
        x97.y(cmd.a, null, null, new rhw((ysw) this.a, (ssw) this.b, (Continuation) null, 6), 3);
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        rho rhoVar = (rho) this.a;
        Bundle bundle = (Bundle) this.b;
        rhoVar.getClass();
        if (!task.l()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.h();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : rhoVar.a(bundle).m(f48.d, kjn.l);
    }

    @Override // defpackage.c2x
    public void v(String str, long j, int i, Object obj, long j2, long j3) {
        ((w1x) this.b).g = null;
        c2x c2xVar = (c2x) this.a;
        if (c2xVar != null) {
            c2xVar.v(str, j, i, obj, j2, j3);
        }
    }

    public /* synthetic */ rjp(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ rjp(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public rjp(String str, Function1 function1) {
        str.getClass();
        this.a = str;
        this.b = function1;
    }

    public /* synthetic */ rjp(String str) {
        this(str, (Function1) new srp(str, 13));
    }

    public rjp(cee ceeVar) {
        int i = e9p.a;
        this.a = new c9p();
        this.b = ceeVar;
    }

    public rjp(View view, o57 o57Var) {
        view.getClass();
        this.a = view;
        this.b = o57Var;
    }

    public rjp(gyr gyrVar, ScheduledFuture scheduledFuture) {
        this.a = gyrVar;
        o2g.O(scheduledFuture, "future");
        this.b = scheduledFuture;
    }
}
