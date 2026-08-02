package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import coil.view.Scale;
import com.arkivanov.mvikotlin.core.utils.internal.AtomicKt$atomic$1;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class tig0 implements m2m0, h3v0, la6 {
    public final Object a;
    public Object b;

    public tig0(Context context, String str, String str2) {
        if (str == null) {
            ny61.g("keysetName cannot be null");
            throw null;
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public static boolean i(hev hevVar, Bitmap.Config config) {
        if (!mga1.e(config)) {
            return true;
        }
        if (!hevVar.b()) {
            return false;
        }
        jax0 B = hevVar.B();
        if (!(B instanceof nv31)) {
            return true;
        }
        View view = ((nv31) B).getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    @Override // defpackage.m2m0
    public Object a(Object obj) {
        return ((tls) this.b).invoke(obj);
    }

    @Override // defpackage.m2m0
    public Object b(g1m0 g1m0Var, Object obj) {
        return ((wls) this.a).invoke(g1m0Var, obj);
    }

    @Override // defpackage.la6
    public void c(tls tlsVar) {
        kp50.A((AtomicKt$atomic$1) this.b, tlsVar);
    }

    public void d(xvf0 xvf0Var) {
        ((List) this.a).add(xvf0Var);
    }

    @Override // defpackage.la6
    public void dispose() {
    }

    public y2r0 e() {
        return new y2r0((List) this.a, (List) this.b);
    }

    public Object f() {
        if (this.b == null) {
            this.b = ((sls) this.a).invoke();
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    @Override // defpackage.h3v0
    public Task g(Object obj) {
        FileWriter fileWriter;
        a aVar = (a) this.b;
        ?? r2 = 2;
        JSONObject jSONObject = (JSONObject) ((ExecutorService) ((com.google.firebase.crashlytics.internal.concurrency.a) this.a).c.b).submit(new s2f((char) 2, this)).get();
        Closeable closeable = null;
        if (jSONObject != null) {
            m6r0 B = aVar.c.B(jSONObject);
            gp50 gp50Var = aVar.e;
            long j = B.c;
            gp50Var.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                try {
                    try {
                        jSONObject.put("expires_at", j);
                        try {
                            fileWriter = new FileWriter((File) gp50Var.b);
                        } catch (Exception e) {
                            e = e;
                            fileWriter = null;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r2 = fileWriter;
                            CommonUtils.b(r2, "Failed to close settings writer.");
                            jSONObject.toString();
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            String str = aVar.b.f;
                            SharedPreferences.Editor edit = aVar.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", str);
                            edit.apply();
                            aVar.h.set(B);
                            ((atx0) aVar.i.get()).c(B);
                            return udq0.p(null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = r2;
                        CommonUtils.b(closeable, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                    r2 = fileWriter;
                } catch (Exception e3) {
                    e = e3;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    r2 = fileWriter;
                    CommonUtils.b(r2, "Failed to close settings writer.");
                    jSONObject.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    String str2 = aVar.b.f;
                    SharedPreferences.Editor edit2 = aVar.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", str2);
                    edit2.apply();
                    aVar.h.set(B);
                    ((atx0) aVar.i.get()).c(B);
                    return udq0.p(null);
                }
                CommonUtils.b(r2, "Failed to close settings writer.");
                jSONObject.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                String str22 = aVar.b.f;
                SharedPreferences.Editor edit22 = aVar.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                edit22.putString("existing_instance_identifier", str22);
                edit22.apply();
                aVar.h.set(B);
                ((atx0) aVar.i.get()).c(B);
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.b(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return udq0.p(null);
    }

    public String h(String str) {
        String str2 = (String) this.b;
        Resources resources = (Resources) this.a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // defpackage.la6
    public void invoke() {
        ((tls) kp50.N((AtomicKt$atomic$1) this.b)).invoke(((Object[]) this.a)[0]);
    }

    public void j() {
        fga0 fga0Var = (fga0) this.a;
        fga0Var.a.u(fga0Var.z, true);
        qc20 qc20Var = (qc20) this.b;
        qwo0 qwo0Var = (qwo0) qc20Var.a;
        qdx qdxVar = qwo0Var.i;
        kgx[] kgxVarArr = qwo0.B;
        int intValue = ((Number) qdxVar.getValue(qwo0Var, kgxVarArr[7])).intValue();
        qwo0 qwo0Var2 = (qwo0) qc20Var.a;
        String str = (String) qwo0Var2.j.getValue(qwo0Var2, kgxVarArr[8]);
        cne0 cne0Var = fga0Var.a;
        cne0Var.p(intValue, fga0Var.A);
        cne0Var.r(fga0Var.B, str);
        qwo0Var2.i.setValue(qwo0Var2, kgxVarArr[7], -2);
        qwo0Var2.j.setValue(qwo0Var2, kgxVarArr[8], null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (i(r1, r18.d()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qg70 k(hev hevVar, wis0 wis0Var) {
        hev hevVar2;
        Bitmap.Config d;
        if (hevVar.D().isEmpty() || j73.y(m.a, hevVar.d())) {
            if (mga1.e(hevVar.d())) {
                hevVar2 = hevVar;
            } else {
                hevVar2 = hevVar;
            }
            d = hevVar2.d();
            Bitmap.Config config = d;
            jh91 b = wis0Var.b();
            nkj nkjVar = nkj.a;
            return new qg70(hevVar.e(), config, null, wis0Var, (!b.equals(nkjVar) || wis0Var.a().equals(nkjVar)) ? Scale.FIT : hevVar2.y(), i.a(hevVar), (hevVar2.c() || !hevVar2.D().isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true, hevVar.x(), hevVar.i(), hevVar.n(), hevVar.A(), hevVar.u(), hevVar.s(), hevVar.j(), hevVar.t());
        }
        hevVar2 = hevVar;
        d = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = d;
        jh91 b2 = wis0Var.b();
        nkj nkjVar2 = nkj.a;
        return new qg70(hevVar.e(), config2, null, wis0Var, (!b2.equals(nkjVar2) || wis0Var.a().equals(nkjVar2)) ? Scale.FIT : hevVar2.y(), i.a(hevVar), (hevVar2.c() || !hevVar2.D().isEmpty() || config2 == Bitmap.Config.ALPHA_8) ? false : true, hevVar.x(), hevVar.i(), hevVar.n(), hevVar.A(), hevVar.u(), hevVar.s(), hevVar.j(), hevVar.t());
    }

    public tig0(Context context) {
        cvw.l(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(hxh0.common_google_play_services_unknown_issue);
    }

    public tig0(dne0 dne0Var) {
        this.a = dne0Var;
        this.b = kotlin.a.a(new csf0(3, this));
    }

    public tig0(Object... objArr) {
        this.a = objArr;
        this.b = new AtomicKt$atomic$1(null);
    }

    public tig0(ExecutorService executorService) {
        this.b = new w53();
        this.a = executorService;
    }

    public /* synthetic */ tig0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public tig0(int i, int i2) {
        List arrayList;
        Object arrayList2;
        if (i == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(i);
        }
        this.a = arrayList;
        if (i2 == 0) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList(i2);
        }
        this.b = arrayList2;
    }

    public tig0(a aVar, com.google.firebase.crashlytics.internal.concurrency.a aVar2) {
        this.b = aVar;
        this.a = aVar2;
    }

    public tig0(sls slsVar) {
        this.a = slsVar;
    }
}
