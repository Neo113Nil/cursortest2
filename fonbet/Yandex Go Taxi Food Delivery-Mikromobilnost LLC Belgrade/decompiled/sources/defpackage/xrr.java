package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehiclesButtonAction;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.renderer.f;
import io.flutter.plugin.platform.d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;
import ru.yandex.taxi.locationsdk.core.utils.a;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason;
import yads.f5;
import yads.hm2;

/* loaded from: classes7.dex */
public final class xrr implements mb71 {
    public Object A;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object w;
    public final Object x;
    public final Object y;
    public Object z;

    public xrr(Set set, Set set2, Set set3, hz60 hz60Var) {
        this.a = 1;
        this.c = hz60Var;
        Set set4 = set;
        int d = gw00.d(tcc.n(set4, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : set4) {
            ((q6z) obj).getClass();
            linkedHashMap.put(obj, InputSourcePriority$Active.Normal);
        }
        this.w = linkedHashMap;
        Set set5 = set3;
        int d2 = gw00.d(tcc.n(set5, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 < 16 ? 16 : d2);
        for (Object obj2 : set5) {
            ((q6z) obj2).getClass();
            linkedHashMap2.put(obj2, ((hz60) this.c).a);
        }
        this.x = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.w;
        Set set6 = set2;
        int d3 = gw00.d(tcc.n(set6, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(d3 < 16 ? 16 : d3);
        for (Object obj3 : set6) {
            ((q6z) obj3).getClass();
            linkedHashMap4.put(obj3, InputSourcePriority$Active.Normal);
        }
        this.y = a.c(j73.v(new Map[]{linkedHashMap3, linkedHashMap2, linkedHashMap4}));
        LinkedHashMap linkedHashMap5 = (LinkedHashMap) this.w;
        LinkedHashMap linkedHashMap6 = (LinkedHashMap) this.x;
        int d4 = gw00.d(tcc.n(set6, 10));
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(d4 >= 16 ? d4 : 16);
        for (Object obj4 : set6) {
            ((q6z) obj4).getClass();
            linkedHashMap7.put(obj4, ((hz60) this.c).b);
        }
        this.z = a.c(j73.v(new Map[]{linkedHashMap5, linkedHashMap6, linkedHashMap7}));
        this.b = ((hz60) this.c).b != InputSourcePriority$Active.Normal;
        this.A = bvf0.c(Boolean.FALSE);
    }

    public void a() {
        switch (this.a) {
            case 4:
                HashMap p = x4e.p(ACSPConstants.STATUS, "success");
                p.put("durations", ((fc71) this.x).a());
                p.put("load_listener_available", Boolean.valueOf(this.b));
                d(p);
                break;
            default:
                rl71 rl71Var = (rl71) this.w;
                ArrayDeque arrayDeque = (ArrayDeque) this.z;
                ArrayDeque arrayDeque2 = (ArrayDeque) this.A;
                if (!arrayDeque2.isEmpty()) {
                    if (!rl71Var.a.hasMessages(0)) {
                        Handler handler = rl71Var.a;
                        fi71 a = rl71.a();
                        Message obtainMessage = handler.obtainMessage(0);
                        a.a = obtainMessage;
                        obtainMessage.getClass();
                        handler.sendMessageAtFrontOfQueue(obtainMessage);
                        a.a();
                    }
                    boolean isEmpty = arrayDeque.isEmpty();
                    arrayDeque.addAll(arrayDeque2);
                    arrayDeque2.clear();
                    if (isEmpty) {
                        while (!arrayDeque.isEmpty()) {
                            ((Runnable) arrayDeque.peekFirst()).run();
                            arrayDeque.removeFirst();
                        }
                        break;
                    }
                }
                break;
        }
    }

    public void b(int i, ov71 ov71Var) {
        ((ArrayDeque) this.A).add(new z50(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.y), i, ov71Var, 15));
    }

    public void c(String str, String str2) {
        HashMap u = g8e.u(ACSPConstants.STATUS, "error", "failure_reason", str);
        u.put(CRLReasonCodeExtension.REASON, str2);
        u.put("durations", ((fc71) this.x).a());
        u.put("load_listener_available", Boolean.valueOf(this.b));
        d(u);
    }

    public void d(HashMap hashMap) {
        hn71 hn71Var = new hn71(2, hashMap);
        a441 a441Var = (a441) this.z;
        if (a441Var != null) {
            fe81 fe81Var = (fe81) a441Var.b;
            LinkedHashMap l = b.l(new Pair("ad_type", fe81Var.a.b));
            String str = fe81Var.c.a;
            if (str != null) {
                l.put("ad_unit_id", str);
            }
            l.putAll((Map) ((pf71) a441Var.c).a(fe81Var.e).b);
            ((Map) hn71Var.b).putAll(l);
        }
        cr71 cr71Var = (cr71) this.A;
        if (cr71Var != null) {
            hn71Var = fga1.a(hn71Var, cr71Var.f());
        }
        Map map = (Map) hn71Var.b;
        no61 no61Var = (no61) hn71Var.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        ((ge71) this.w).c(new zj71("ad_loading_result", linkedHashMap, no61Var));
        if (jl40.l(hashMap.get(ACSPConstants.STATUS), "success")) {
            mj31 mj31Var = (mj31) this.y;
            hm2 hm2Var = hm2.c;
            String str2 = ((fe81) this.c).l;
            if (str2 == null) {
                str2 = g771.a;
            }
            mj31Var.t(hm2Var, linkedHashMap, str2, null);
        }
    }

    public void e(Object... objArr) {
        int length = objArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (objArr[i] != null) {
                z = true;
                break;
            }
            i++;
        }
        this.b = z;
    }

    public void f(tsr tsrVar) {
        HashMap hashMap = (HashMap) this.c;
        ozz0.c("FlutterEngineConnectionRegistry#add ".concat(tsrVar.getClass().getSimpleName()));
        try {
            if (hashMap.containsKey(tsrVar.getClass())) {
                tsrVar.toString();
                Objects.toString((FlutterEngine) this.x);
                Trace.endSection();
                return;
            }
            tsrVar.toString();
            hashMap.put(tsrVar.getClass(), tsrVar);
            tsrVar.onAttachedToEngine((ssr) this.y);
            if (tsrVar instanceof r30) {
                r30 r30Var = (r30) tsrVar;
                ((HashMap) this.w).put(tsrVar.getClass(), r30Var);
                if (n()) {
                    r30Var.onAttachedToActivity((wrr) this.A);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void g(Activity activity, Lifecycle lifecycle) {
        FlutterEngine flutterEngine = (FlutterEngine) this.x;
        this.A = new wrr(activity, lifecycle);
        boolean booleanExtra = activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        d dVar = flutterEngine.t;
        ufg ufgVar = flutterEngine.c;
        dVar.O = booleanExtra;
        f fVar = flutterEngine.b;
        if (dVar.c != null) {
            ny61.f("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
            return;
        }
        dVar.c = activity;
        dVar.y = fVar;
        y4a0 y4a0Var = new y4a0(ufgVar, 13);
        dVar.A = y4a0Var;
        y4a0Var.c = dVar.P;
        dxc0 dxc0Var = flutterEngine.u;
        if (dxc0Var.c != null) {
            ny61.f("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
            return;
        }
        dxc0Var.c = activity;
        oy80 oy80Var = new oy80(ufgVar);
        dxc0Var.z = oy80Var;
        oy80Var.c = dxc0Var.I;
        for (r30 r30Var : ((HashMap) this.w).values()) {
            boolean z = this.b;
            wrr wrrVar = (wrr) this.A;
            if (z) {
                r30Var.onReattachedToActivityForConfigChanges(wrrVar);
            } else {
                r30Var.onAttachedToActivity(wrrVar);
            }
        }
        this.b = false;
    }

    public void h() {
        k();
        HashMap hashMap = (HashMap) this.c;
        Iterator it = new HashSet(hashMap.keySet()).iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            tsr tsrVar = (tsr) hashMap.get(cls);
            if (tsrVar != null) {
                ozz0.c("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                try {
                    if (tsrVar instanceof r30) {
                        if (n()) {
                            ((r30) tsrVar).onDetachedFromActivity();
                        }
                        ((HashMap) this.w).remove(cls);
                    }
                    tsrVar.onDetachedFromEngine((ssr) this.y);
                    hashMap.remove(cls);
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        hashMap.clear();
    }

    public void i() {
        if (!n()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        ozz0.c("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.w).values().iterator();
            while (it.hasNext()) {
                ((r30) it.next()).onDetachedFromActivity();
            }
            j();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void j() {
        FlutterEngine flutterEngine = (FlutterEngine) this.x;
        d dVar = flutterEngine.t;
        y4a0 y4a0Var = dVar.A;
        if (y4a0Var != null) {
            y4a0Var.c = null;
        }
        dVar.e();
        dVar.A = null;
        dVar.c = null;
        dVar.y = null;
        dxc0 dxc0Var = flutterEngine.u;
        oy80 oy80Var = dxc0Var.z;
        if (oy80Var != null) {
            oy80Var.c = null;
        }
        Surface surface = dxc0Var.G;
        if (surface != null) {
            surface.release();
            dxc0Var.G = null;
            dxc0Var.H = null;
        }
        dxc0Var.z = null;
        dxc0Var.c = null;
        this.z = null;
        this.A = null;
    }

    public void k() {
        if (n()) {
            i();
        }
    }

    public tsr l(Class cls) {
        return (tsr) ((HashMap) this.c).get(cls);
    }

    public Object m(ml30 ml30Var, pk30 pk30Var, tse tseVar, n26 n26Var, a36 a36Var, SuspendLambda suspendLambda) {
        k26 k26Var;
        k26 k26Var2;
        MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason masstransitPaymentAnalytics$BleVehiclesScreenOpenReason;
        z26 z26Var = (z26) this.x;
        com.yandex.go.masstransit.sdk.ble.impl.domain.a aVar = (com.yandex.go.masstransit.sdk.ble.impl.domain.a) this.c;
        com.yandex.go.masstransit.sdk.ble.impl.repository.b bVar = aVar.a;
        p310 p310Var = (p310) this.y;
        u26 u26Var = null;
        r5 = null;
        u26 u26Var2 = null;
        LinkedHashMap linkedHashMap = null;
        u26Var = null;
        if (jl40.l(ml30Var, cl30.a)) {
            if (a36Var != null) {
                n310 n310Var = p310Var.a;
                int i = o310.a[a36Var.a.ordinal()];
                if (i == 1) {
                    masstransitPaymentAnalytics$BleVehiclesScreenOpenReason = MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason.Deeplink;
                } else if (i == 2) {
                    masstransitPaymentAnalytics$BleVehiclesScreenOpenReason = MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason.MasstransitMain;
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    masstransitPaymentAnalytics$BleVehiclesScreenOpenReason = MasstransitPaymentAnalytics$BleVehiclesScreenOpenReason.Other;
                }
                String str = a36Var.b;
                String str2 = a36Var.c;
                n310Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("source", masstransitPaymentAnalytics$BleVehiclesScreenOpenReason.getEventValue());
                if (str != null) {
                    hashMap.put("utm_source", str);
                }
                if (str2 != null) {
                    hashMap.put("utm_medium", str2);
                }
                n310Var.a.a("MasstransitPayment.BleVehicles.Shown", hashMap, 1, new HashMap());
            }
            return aVar.a().collect(new fre(this, pk30Var, n26Var, tseVar, 4), suspendLambda);
        }
        if (ml30Var instanceof kl30) {
            p310Var.a(BleVehiclesButtonAction.OpenSettings, null);
            z26Var.c();
        } else if (ml30Var instanceof il30) {
            p310Var.a(BleVehiclesButtonAction.OpenSettings, null);
            z26Var.a();
        } else if (ml30Var instanceof jl30) {
            p310Var.a(BleVehiclesButtonAction.OpenSettings, null);
            z26Var.b();
        } else if (ml30Var instanceof dl30) {
            p310Var.a(BleVehiclesButtonAction.Back, null);
            pk30Var.a();
        } else if (ml30Var instanceof gl30) {
            p310Var.a(BleVehiclesButtonAction.Qr, null);
            pk30Var.d();
        } else if (jl40.l(ml30Var, fl30.a)) {
            p310Var.a(BleVehiclesButtonAction.Refresh, null);
            r26 r26Var = n26Var.a;
            if (r26Var != null && (k26Var2 = r26Var.b) != null) {
                u26Var2 = k26Var2.f;
            }
            bVar.d(u26Var2, tseVar);
        } else if (ml30Var instanceof el30) {
            fd30 fd30Var = ((el30) ml30Var).b;
            Object obj = fd30Var.g;
            Map map = obj instanceof Map ? (Map) obj : null;
            BleVehiclesButtonAction bleVehiclesButtonAction = BleVehiclesButtonAction.VehicleItem;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
            p310Var.a(bleVehiclesButtonAction, linkedHashMap);
            pk30Var.b(fd30Var);
        } else {
            if (!jl40.l(ml30Var, hl30.a)) {
                w511.b();
                return null;
            }
            r26 r26Var2 = n26Var.a;
            if (r26Var2 != null && (k26Var = r26Var2.b) != null) {
                u26Var = k26Var.f;
            }
            bVar.d(u26Var, tseVar);
        }
        return zy11.a;
    }

    public boolean n() {
        return ((io.flutter.embedding.android.a) this.z) != null;
    }

    @Override // defpackage.mb71
    public void a(Context context) {
        switch (this.a) {
            case 3:
                this.b = true;
                ((w381) ((cf71) this.y).c).a();
                break;
            default:
                this.b = true;
                ((w381) ((cf71) this.y).c).a();
                break;
        }
    }

    @Override // defpackage.mb71
    public void a(Context context, d881 d881Var) {
        int i = this.a;
        Object obj = this.y;
        Object obj2 = this.w;
        switch (i) {
            case 3:
                if (!this.b) {
                    ((bq71) obj2).a.b(f5.c, null);
                    ((cf71) obj).n(d881Var, new ji41(23, this), new mj31(this, context, d881Var));
                    break;
                }
                break;
            default:
                if (!this.b) {
                    ((bq71) obj2).a.b(f5.c, null);
                    ((cf71) obj).n(d881Var, new nr41(16, this), new mj31(this, context, d881Var, (byte) 0));
                    break;
                }
                break;
        }
    }

    public xrr(Context context, fe81 fe81Var, e971 e971Var, v981 v981Var) {
        this.a = 4;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        fc71 fc71Var = new fc71(e971Var, 0);
        mj31 mj31Var = new mj31(context, 19);
        this.c = fe81Var;
        this.w = b;
        this.x = fc71Var;
        this.y = mj31Var;
    }

    public xrr(Context context, bt81 bt81Var, bq71 bq71Var, v981 v981Var) {
        this.a = 5;
        new fl71();
        this.c = bt81Var;
        this.w = bq71Var;
        fe81 fe81Var = bq71Var.b;
        this.z = fe81Var;
        this.A = new nr41(12, fe81Var);
        e971 e971Var = bq71Var.a;
        this.x = new mj31(fe81Var, v981Var);
        this.y = new cf71(context, fe81Var, e971Var, v981Var);
        Context context2 = ((n291) v981Var).a;
        wha1.c(context2, context2);
        new ij61();
    }

    public xrr(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, ut71 ut71Var, ly71 ly71Var) {
        this.a = 6;
        this.c = ut71Var;
        this.y = copyOnWriteArraySet;
        this.x = ly71Var;
        this.z = new ArrayDeque();
        this.A = new ArrayDeque();
        j7m j7mVar = new j7m(5, this);
        ((xb71) ut71Var).getClass();
        this.w = new rl71(new Handler(looper, j7mVar));
    }

    public xrr(Context context, zn71 zn71Var, bq71 bq71Var, v981 v981Var) {
        this.a = 3;
        new fl71();
        this.c = zn71Var;
        this.w = bq71Var;
        fe81 fe81Var = bq71Var.b;
        this.z = fe81Var;
        this.A = new nr41(12, fe81Var);
        e971 e971Var = bq71Var.a;
        this.x = new mj31(fe81Var, v981Var);
        this.y = new cf71(context, fe81Var, e971Var, v981Var);
        Context context2 = ((n291) v981Var).a;
        wha1.c(context2, context2);
        new ij61();
    }

    public xrr(com.yandex.go.masstransit.sdk.ble.impl.domain.a aVar, pl30 pl30Var, z26 z26Var, p310 p310Var, yk30 yk30Var, sr4 sr4Var) {
        this.a = 2;
        this.c = aVar;
        this.w = pl30Var;
        this.x = z26Var;
        this.y = p310Var;
        this.z = yk30Var;
        this.A = sr4Var;
    }

    public xrr(Context context, FlutterEngine flutterEngine, psr psrVar) {
        this.a = 0;
        this.c = new HashMap();
        this.w = new HashMap();
        this.b = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.x = flutterEngine;
        this.y = new ssr(context, flutterEngine, flutterEngine.c, flutterEngine.b, flutterEngine.t.a, new gym(psrVar));
    }
}
