package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.connection.ConnectionManager;
import com.connectsdk.service.webos.lgcast.common.utils.JSONObjectEx;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import ru.yandex.music.phonoteka.playlist.SoMuchTracksException;

/* loaded from: classes.dex */
public final /* synthetic */ class qf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf0(kp6 kp6Var, Throwable th) {
        this.a = 21;
        Map map = Collections.EMPTY_MAP;
        this.b = kp6Var;
        this.c = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // java.lang.Runnable
    public final void run() {
        lu7 lu7Var;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Unit unit = null;
        switch (this.a) {
            case 0:
                rf0.h((tf0) this.b, (LongSparseArray) this.c);
                return;
            case 1:
                qhp qhpVar = (qhp) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    qhpVar.a();
                }
            case 2:
                Function1 function1 = (Function1) this.b;
                ?? r1 = (uif) this.c;
                function1.getClass();
                function1.invoke(r1.invoke());
                return;
            case 3:
                Context context = (Context) this.b;
                n20 n20Var = (n20) this.c;
                fx1.a = (AudioManager) context.getSystemService(CameraProperty.AUDIO);
                n20Var.h();
                return;
            case 4:
                xiu xiuVar = (xiu) this.b;
                String str = (String) this.c;
                fy1 fy1Var = (fy1) xiuVar.c;
                int i = dvt.a;
                fy1Var.d(str);
                return;
            case 5:
                h02 h02Var = (h02) this.b;
                jzi jziVar = (jzi) this.c;
                gs4 gs4Var = h02Var.b;
                g02 g02Var = new g02(objArr2 == true ? 1 : 0, h02Var, jziVar);
                gs4Var.getClass();
                qdc qdcVar = (qdc) gs4Var.b;
                k5r.t(qdcVar, qdcVar, "wm_auth_request_anonymous");
                b0o a = ((l0o) gs4Var.a).a();
                a.g("https://api.messenger.yandex.net/api/");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bind_phone_number", false);
                jSONObject.put("get_secret_sign", false);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("method", "request_user");
                jSONObject2.put("params", jSONObject);
                a.e(ServiceCommand.TYPE_POST, new dn7(jSONObject2));
                d0o b = a.b();
                mkn mknVar = (mkn) gs4Var.e;
                if (mknVar != null) {
                    mknVar.cancel();
                }
                OkHttpClient okHttpClient = (OkHttpClient) gs4Var.c;
                okHttpClient.getClass();
                mkn mknVar2 = new mkn(okHttpClient, b, false);
                gs4Var.e = mknVar2;
                ((List) gs4Var.d).add(g02Var);
                mknVar2.z(new oz1(objArr == true ? 1 : 0, gs4Var));
                return;
            case 6:
                ((jzi) ((g02) this.b).b).u((IOException) this.c);
                return;
            case 7:
                sj sjVar = (sj) this.b;
                Object apply = ((myc) this.c).apply(sjVar.f);
                sjVar.f = apply;
                ((hzr) sjVar.c).e(new wj2(sjVar, apply, objArr3 == true ? 1 : 0));
                return;
            case 8:
                g4w g4wVar = (g4w) this.b;
                String uuid = ((UUID) this.c).toString();
                uuid.getClass();
                leu.G(g4wVar, uuid);
                return;
            case 9:
                ((vw3) this.c).e(((CardNumberInput) this.b).n ? jw3.b : jw3.a);
                return;
            case 10:
                ((kb4) this.b).a((View) this.c);
                return;
            case 11:
                rb5 rb5Var = (rb5) this.b;
                ob5[] ob5VarArr = (ob5[]) this.c;
                rb5Var.getClass();
                pxi pxiVar = rb5Var.a;
                if (pxiVar != null) {
                    pxiVar.a(ob5VarArr);
                    unit = Unit.a;
                }
                if (unit == null) {
                    rb5Var.b.add(ob5VarArr);
                    return;
                }
                return;
            case 12:
                r0.getLifecycle().a(new an5(0, (qpj) this.c, (hn5) this.b));
                return;
            case 13:
                owj owjVar = (owj) this.b;
                uzm uzmVar = (uzm) this.c;
                if (owjVar.b != owj.d) {
                    xq0.q("provide() can be called only once.");
                    return;
                }
                synchronized (owjVar) {
                    lu7Var = owjVar.a;
                    owjVar.a = null;
                    owjVar.b = uzmVar;
                }
                lu7Var.j(uzmVar);
                return;
            case 14:
                tvf tvfVar = (tvf) this.b;
                uzm uzmVar2 = (uzm) this.c;
                synchronized (tvfVar) {
                    try {
                        if (tvfVar.b == null) {
                            tvfVar.a.add(uzmVar2);
                        } else {
                            tvfVar.b.add(uzmVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 15:
                ((g06) this.b).u((t56) this.c);
                return;
            case 16:
                ((ConnectionManager) this.b).lambda$callOnConnectionFailed$11((String) this.c);
                return;
            case 17:
                ((ConnectionManager) this.b).lambda$sendSetParameterResponse$5((JSONObjectEx) this.c);
                return;
            case 18:
                List list = (List) this.b;
                r96 r96Var = (r96) this.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((iq2) it.next()).a(r96Var.d);
                }
                return;
            case 19:
                ((gp6) this.b).c((String) this.c, Boolean.FALSE);
                return;
            case 20:
                kp6 kp6Var = (kp6) this.b;
                String str2 = (String) this.c;
                rn5 rn5Var = kp6Var.g.d;
                rn5Var.getClass();
                String a2 = jcf.a(1024, str2);
                synchronized (((AtomicMarkableReference) rn5Var.h)) {
                    try {
                        String str3 = (String) ((AtomicMarkableReference) rn5Var.h).getReference();
                        if (a2 != null) {
                            z = a2.equals(str3);
                        } else if (str3 == null) {
                            z = true;
                        }
                        if (z) {
                            return;
                        }
                        ((AtomicMarkableReference) rn5Var.h).set(a2, true);
                        ((vq6) ((osh) rn5Var.c).b).d(new bhp(17, rn5Var));
                        return;
                    } finally {
                    }
                }
            case 21:
                kp6 kp6Var2 = (kp6) this.b;
                Throwable th = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                gp6 gp6Var = kp6Var2.g;
                Thread currentThread = Thread.currentThread();
                gp6Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                uq6 uq6Var = gp6Var.n;
                if (uq6Var == null || !uq6Var.e.get()) {
                    long j = currentTimeMillis / 1000;
                    String e = gp6Var.e();
                    if (e == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    uib uibVar = new uib(e, j, map);
                    jac jacVar = gp6Var.m;
                    jacVar.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(e);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    jacVar.o(th, currentThread, "error", uibVar, false);
                    return;
                }
                return;
            case 22:
                rn5 rn5Var2 = (rn5) this.b;
                cvl cvlVar = (cvl) this.c;
                try {
                    oul oulVar = (oul) rn5Var2.h;
                    List list2 = (List) rn5Var2.f;
                    oulVar.getClass();
                    list2.getClass();
                    return;
                } catch (SoMuchTracksException unused) {
                    return;
                }
            case 23:
                ((ts6) this.b).e().onResult((o7d) this.c);
                return;
            case 24:
                ((ts6) this.b).e().f(((xqn) this.c).a);
                return;
            case 25:
                ((ts6) this.b).e().f((l7d) this.c);
                return;
            case 26:
                ((ls6) this.b).f(this.c);
                return;
            case 27:
                ws6 ws6Var = (ws6) this.b;
                zq6 zq6Var = (zq6) this.c;
                ls6 ls6Var = ws6Var.d;
                if (ls6Var != null) {
                    ls6Var.f(zq6Var);
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ws6 ws6Var2 = (ws6) this.b;
                cr6 cr6Var = (cr6) this.c;
                ls6 ls6Var2 = ws6Var2.d;
                if (ls6Var2 != null) {
                    ls6Var2.onResult(cr6Var);
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
            default:
                dt6 dt6Var = (dt6) this.b;
                cs6 cs6Var = (cs6) this.c;
                ls6 ls6Var3 = dt6Var.e;
                if (ls6Var3 != null) {
                    ls6Var3.onResult(cs6Var);
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
        }
    }

    public /* synthetic */ qf0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qf0(Function0 function0, Function1 function1) {
        this.a = 2;
        this.b = function1;
        this.c = (uif) function0;
    }
}
