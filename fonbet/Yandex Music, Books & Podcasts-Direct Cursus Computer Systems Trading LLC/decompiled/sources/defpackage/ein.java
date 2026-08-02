package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class ein {
    public final Context a;
    public final frt b;
    public final ku0 c;
    public final kij d;
    public final uaa e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final tf6 i;

    public ein(Context context, frt frtVar, ku0 ku0Var, kij kijVar, uaa uaaVar) {
        this.a = context;
        this.b = frtVar;
        this.c = ku0Var;
        this.d = kijVar;
        this.e = uaaVar;
        bdt I = hag.I(oq7.class);
        l18 l18Var = l18.b;
        this.f = l18Var.b(I, true);
        this.g = l18Var.b(hag.I(cjl.class), true);
        this.h = btf.b(new b6n(12, this));
        this.i = gld.e(ca8.b);
    }

    public static void b(ein einVar, Activity activity) {
        onx onxVar;
        int i = 0;
        if (einVar.a().a.getInt("dialog_display_times", 0) >= 3 || !einVar.b.c().a()) {
            return;
        }
        long j = einVar.a().a.getLong("last_dialog_show", 0L);
        Long valueOf = Long.valueOf(j);
        if (j == 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            long time = new Date(einVar.c.b.getLong("install_date_24026391", 0L)).getTime();
            valueOf = Long.valueOf(time);
            if (time == 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return;
            }
        }
        long longValue = valueOf.longValue();
        msa msaVar = nsa.b;
        long currentTimeMillis = System.currentTimeMillis();
        ssa ssaVar = ssa.MILLISECONDS;
        if (nsa.c(nsa.n(yd5.N(currentTimeMillis, ssaVar), yd5.N(longValue, ssaVar)), yd5.M(5, ssa.DAYS)) <= 0 || einVar.a().a.getInt("user_score", 0) < 100) {
            return;
        }
        WeakReference weakReference = new WeakReference(activity);
        ndx ndxVar = ((e7x) einVar.h.getValue()).a;
        jpc jpcVar = ndx.c;
        jpcVar.f("requestInAppReview (%s)", ndxVar.b);
        int i2 = 13;
        if (ndxVar.a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", jpc.g(jpcVar.b, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap hashMap = zzw.a;
            onxVar = ywf.v(new ooe(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !hashMap.containsKey(-1) ? "" : k5r.m((String) hashMap.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) zzw.b.get(-1), ")")), null, null)));
        } else {
            i8s i8sVar = new i8s();
            zlx zlxVar = ndxVar.a;
            i9x i9xVar = new i9x(ndxVar, i8sVar, i8sVar, i);
            synchronized (zlxVar.f) {
                zlxVar.e.add(i8sVar);
                i8sVar.a.addOnCompleteListener(new nur(i2, zlxVar, i8sVar));
            }
            synchronized (zlxVar.f) {
                try {
                    if (zlxVar.k.getAndIncrement() > 0) {
                        jpc jpcVar2 = zlxVar.b;
                        Object[] objArr2 = new Object[0];
                        jpcVar2.getClass();
                        if (Log.isLoggable("PlayCore", 3)) {
                            Log.d("PlayCore", jpc.g(jpcVar2.b, "Already connected to the service.", objArr2));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zlxVar.a().post(new i9x(zlxVar, i8sVar, i9xVar, 1));
            onxVar = i8sVar.a;
        }
        onxVar.addOnCompleteListener(new suh(i2, weakReference, einVar));
    }

    public final pst a() {
        xxq c = this.b.c();
        c.getClass();
        return new pst(this.a, c.a, "rate_app");
    }
}
