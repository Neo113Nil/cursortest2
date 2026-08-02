package defpackage;

import android.os.Handler;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;
import ru.kinopoisk.sdk.easylogin.internal.F8;

/* loaded from: classes3.dex */
public final /* synthetic */ class f02 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f02(g06 g06Var, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Handler handler, t56 t56Var) {
        this.b = g06Var;
        this.c = atomicBoolean;
        this.d = atomicBoolean2;
        this.e = handler;
        this.f = t56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                h02 h02Var = (h02) this.d;
                String str2 = (String) this.c;
                g02 g02Var = (g02) this.e;
                JSONObject jSONObject = (JSONObject) this.f;
                if (str == null) {
                    ((jzi) g02Var.b).u(new IllegalArgumentException(f1d.g("can't parse token from backend answer, body = ", jSONObject != null ? jSONObject.toString() : null)));
                    return;
                }
                String concat = "YAMBAUTH ".concat(str);
                h02Var.c.sendEvent("wm_auth_anonymous_registered", tah.b(new Pair("guid", str2 == null ? "" : str2)));
                wn0 wn0Var = h02Var.e;
                wn0Var.getClass();
                wn0Var.d = System.currentTimeMillis();
                wn0Var.c = concat;
                wn0Var.a.edit().putString("ANONYMOUS_TOKEN_KEY", concat).putString("ANONYMOUS_GUID_KEY", str2).putLong("ANONYMOUS_TOKEN_GENERATED_TIME_KEY", wn0Var.d).apply();
                hfj hfjVar = h02Var.a;
                hfjVar.i.post(new zvh(4, hfjVar, r5));
                ((jzi) g02Var.b).v(concat);
                h02Var.b();
                return;
            case 1:
                g06 g06Var = (g06) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.d;
                Handler handler = (Handler) this.e;
                t56 t56Var = (t56) this.f;
                synchronized (g06Var.a) {
                    try {
                        z = true;
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    dvt.c0(handler, new qf0(15, g06Var, t56Var));
                    return;
                }
                return;
            case 2:
                ogp ogpVar = (ogp) this.c;
                String str3 = (String) this.b;
                Function0 function0 = (Function0) this.d;
                voi voiVar = (voi) this.e;
                vs3 vs3Var = (vs3) this.f;
                ogpVar.getClass();
                boolean H = y7g.H();
                if (H) {
                    try {
                        Trace.beginSection(y7g.X(str3));
                    } finally {
                        if (H) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    function0.invoke();
                    huj hujVar = xzi.b;
                    voiVar.m(hujVar);
                    vs3Var.a(hujVar);
                } catch (Throwable th2) {
                    voiVar.m(new guj(th2));
                    vs3Var.b(th2);
                }
                if (H) {
                    return;
                } else {
                    return;
                }
            default:
                C1121l6.a((C1121l6) this.c, (C1121l6.a) this.d, (String) this.b, this.e, (Throwable) this.f);
                return;
        }
    }

    public /* synthetic */ f02(ogp ogpVar, String str, Function0 function0, voi voiVar, vs3 vs3Var) {
        this.c = ogpVar;
        this.b = str;
        this.d = function0;
        this.e = voiVar;
        this.f = vs3Var;
    }

    public /* synthetic */ f02(String str, h02 h02Var, String str2, g02 g02Var, JSONObject jSONObject) {
        this.b = str;
        this.d = h02Var;
        this.c = str2;
        this.e = g02Var;
        this.f = jSONObject;
    }

    public /* synthetic */ f02(C1121l6 c1121l6, C1121l6.a aVar, String str, F8.a aVar2, Throwable th) {
        this.c = c1121l6;
        this.d = aVar;
        this.b = str;
        this.e = aVar2;
        this.f = th;
    }
}
