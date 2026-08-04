package com.gamericefishpro.space.n9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.g1.b {
    public Boolean e;
    public String i;
    public f v;
    public Boolean w;

    public final double A(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
        String strB = this.v.b(str, d0Var.a);
        if (TextUtils.isEmpty(strB)) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) d0Var.a(Double.valueOf(Double.parseDouble(strB)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d0Var.a(null)).doubleValue();
        }
    }

    public final boolean B(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) d0Var.a(null)).booleanValue();
        }
        String strB = this.v.b(str, d0Var.a);
        return TextUtils.isEmpty(strB) ? ((Boolean) d0Var.a(null)).booleanValue() : ((Boolean) d0Var.a(Boolean.valueOf("1".equals(strB)))).booleanValue();
    }

    public final Bundle C() {
        r1 r1Var = (r1) this.d;
        try {
            Context context = r1Var.d;
            Context context2 = r1Var.d;
            v0 v0Var = r1Var.y;
            if (context.getPackageManager() == null) {
                r1.l(v0Var);
                v0Var.y.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoD = com.gamericefishpro.space.b9.c.a(context2).d(128, context2.getPackageName());
            if (applicationInfoD != null) {
                return applicationInfoD.metaData;
            }
            r1.l(v0Var);
            v0Var.y.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean D(String str) {
        com.gamericefishpro.space.v8.c0.d(str);
        Bundle bundleC = C();
        if (bundleC != null) {
            if (bundleC.containsKey(str)) {
                return Boolean.valueOf(bundleC.getBoolean(str));
            }
            return null;
        }
        v0 v0Var = ((r1) this.d).y;
        r1.l(v0Var);
        v0Var.y.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean E() {
        ((r1) this.d).getClass();
        Boolean boolD = D("firebase_analytics_collection_deactivated");
        return boolD != null && boolD.booleanValue();
    }

    public final boolean F() {
        Boolean boolD = D("google_analytics_automatic_screen_reporting_enabled");
        return boolD == null || boolD.booleanValue();
    }

    public final b2 G(String str, boolean z) {
        Object obj;
        com.gamericefishpro.space.v8.c0.d(str);
        r1 r1Var = (r1) this.d;
        Bundle bundleC = C();
        if (bundleC == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleC.get(str);
        }
        b2 b2Var = b2.UNINITIALIZED;
        if (obj == null) {
            return b2Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return b2.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return b2.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return b2.POLICY;
        }
        v0 v0Var2 = r1Var.y;
        r1.l(v0Var2);
        v0Var2.B.b(str, "Invalid manifest metadata for");
        return b2Var;
    }

    public final boolean s(String str) {
        return "1".equals(this.v.b(str, "gaia_collection_enabled"));
    }

    public final boolean t(String str) {
        return "1".equals(this.v.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean u() {
        if (this.e == null) {
            Boolean boolD = D("app_measurement_lite");
            this.e = boolD;
            if (boolD == null) {
                this.e = Boolean.FALSE;
            }
        }
        return this.e.booleanValue() || !((r1) this.d).e;
    }

    public final String v(String str) {
        r1 r1Var = (r1) this.d;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.gamericefishpro.space.v8.c0.g(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.y.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            v0 v0Var4 = r1Var.y;
            r1.l(v0Var4);
            v0Var4.y.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void w() {
        ((r1) this.d).getClass();
    }

    public final String x(String str, d0 d0Var) {
        return TextUtils.isEmpty(str) ? (String) d0Var.a(null) : (String) d0Var.a(this.v.b(str, d0Var.a));
    }

    public final long y(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) d0Var.a(null)).longValue();
        }
        String strB = this.v.b(str, d0Var.a);
        if (TextUtils.isEmpty(strB)) {
            return ((Long) d0Var.a(null)).longValue();
        }
        try {
            return ((Long) d0Var.a(Long.valueOf(Long.parseLong(strB)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d0Var.a(null)).longValue();
        }
    }

    public final int z(String str, d0 d0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) d0Var.a(null)).intValue();
        }
        String strB = this.v.b(str, d0Var.a);
        if (TextUtils.isEmpty(strB)) {
            return ((Integer) d0Var.a(null)).intValue();
        }
        try {
            return ((Integer) d0Var.a(Integer.valueOf(Integer.parseInt(strB)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d0Var.a(null)).intValue();
        }
    }
}
