package yads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.monetization.ads.utils.logger.collectors.MobileAdsNetworkLogsCollector;
import defpackage.a081;
import defpackage.bm71;
import defpackage.cvu0;
import defpackage.dha1;
import defpackage.dn61;
import defpackage.eh71;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.ib71;
import defpackage.ie71;
import defpackage.iq71;
import defpackage.jb71;
import defpackage.jy61;
import defpackage.kt71;
import defpackage.kx6;
import defpackage.l581;
import defpackage.mj71;
import defpackage.n291;
import defpackage.nn71;
import defpackage.oyr;
import defpackage.qc71;
import defpackage.rk71;
import defpackage.su71;
import defpackage.tb71;
import defpackage.tcc;
import defpackage.tka1;
import defpackage.tv81;
import defpackage.ui71;
import defpackage.uja1;
import defpackage.wha1;
import defpackage.wls;
import defpackage.xga1;
import defpackage.yc71;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class xg extends SuspendLambda implements wls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ n291 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(Context context, n291 n291Var, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = n291Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new xg(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        xg xgVar = new xg(this.b, this.c, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        xgVar.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        jb71 jb71Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        Context context = this.b;
        Context context2 = this.c.a;
        bm71.a(context, wha1.c(context2, context2));
        Context context3 = this.b;
        Context context4 = this.c.a;
        yc71.a(context3, wha1.c(context4, context4));
        if (Build.VERSION.SDK_INT >= 30) {
            AtomicBoolean atomicBoolean = mj71.a;
            Context context5 = this.b;
            Context context6 = this.c.a;
            mj71.a(context5, wha1.c(context6, context6));
        }
        new l581();
        Boolean bool = (Boolean) l581.a(this.b, rg1.d.b);
        if (bool != null) {
            a081 f = dha1.f();
            synchronized (a081.f) {
                f.b = bool;
            }
        }
        Boolean bool2 = (Boolean) l581.a(this.b, rg1.e.b);
        if (bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            uja1.a = booleanValue;
            qc71.c = booleanValue;
            if (!booleanValue) {
                jb71 jb71Var2 = jb71.b;
                if (jb71Var2 == null) {
                    synchronized (jb71.c) {
                        jb71Var = jb71.b;
                        if (jb71Var == null) {
                            jb71Var = new jb71();
                            jb71.b = jb71Var;
                        }
                    }
                    jb71Var2 = jb71Var;
                }
                synchronized (jb71.c) {
                    jb71Var2.a.clear();
                }
                MobileAdsNetworkLogsCollector.INSTANCE.getInstance().clearAll();
            }
        }
        if (xga1.c(this.b)) {
            eh71 a = rk71.a(this.b);
            if (a instanceof ie71) {
                new ui71();
                qc71.a(a.X(((ie71) a).a, "\n", "Yandex Mobile Adsintegrated incorrectly\n", null, ia1.w, 28), new Object[0]);
            } else if (a instanceof ib71) {
                qc71.b("Yandex Mobile Ads 8.0.0-beta.1 integrated successfully", new Object[0]);
            }
            new kt71();
            ArrayList a2 = new tv81().a(tka1.b());
            ArrayList arrayList = new ArrayList();
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                iq71 iq71Var = (iq71) it.next();
                String str3 = iq71Var.a;
                List list = iq71Var.d;
                int max = Math.max(4, 44 - str3.length());
                int i = max / 2;
                String u = cvu0.u(i, "-");
                String u2 = cvu0.u((max % 2) + i, "-");
                String u3 = cvu0.u(1, " ");
                String q = oyr.q(u, u3, str3, u3, u2);
                br1 br1Var = br1.b;
                arrayList.add(new jy61(q, br1Var));
                String str4 = iq71Var.c;
                String str5 = ((nn71) a.P(list)).b;
                boolean a3 = kt71.a(iq71Var);
                if (a3) {
                    if (str4 != null && !evu0.J(str4)) {
                        arrayList.add(new jy61("SDK Version: ".concat(str4), br1Var));
                    }
                    if (str5 != null && !evu0.J(str5)) {
                        arrayList.add(new jy61("ADAPTERS Version: ".concat(str5), br1Var));
                    }
                }
                String str6 = iq71Var.a;
                if (a3) {
                    str = "ADAPTERS";
                    str2 = "INTEGRATED SUCCESSFULLY";
                } else {
                    br1Var = br1.c;
                    str = "MISSING ADAPTERS";
                    str2 = "NOT INTEGRATED";
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((nn71) it2.next()).a);
                }
                String X = a.X(arrayList2, null, str.concat(Extension.COLON_SPACE), null, null, 61);
                String p = g8e.p(str6, Extension.COLON_SPACE, str2);
                arrayList.add(new jy61(X, br1Var));
                arrayList.add(new jy61(p, br1Var));
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                jy61 jy61Var = (jy61) it3.next();
                br1 br1Var2 = jy61Var.b;
                String str7 = jy61Var.a;
                int ordinal = br1Var2.ordinal();
                if (ordinal == 0) {
                    qc71.b(str7, new Object[0]);
                } else if (ordinal == 1) {
                    qc71.a(str7, new Object[0]);
                }
            }
        }
        n291 n291Var = this.c;
        tb71.b(this.b);
        Context context7 = this.b;
        Boolean bool3 = (Boolean) l581.a(context7, rg1.c.b);
        if (bool3 != null ? bool3.booleanValue() : true) {
            su71 su71Var = new su71(5);
            dn61 dn61Var = new dn61();
            vt1 vt1Var = new vt1(context7, n291Var, su71Var);
            wt1 wt1Var = new wt1(context7, n291Var, su71Var);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dn61Var.a.a.post(new kx6(elapsedRealtime, vt1Var, wt1Var, 6));
        }
        return zy11.a;
    }
}
