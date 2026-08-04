package com.gamericefishpro.space.n9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.gamericefishpro.space.i9.r8;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends g0 {
    public long A;
    public final long B;
    public final long C;
    public List D;
    public String E;
    public int F;
    public String G;
    public String H;
    public long I;
    public String J;
    public String i;
    public String v;
    public int w;
    public String y;
    public String z;

    public m0(r1 r1Var, long j, long j2) {
        super(r1Var);
        this.I = 0L;
        this.J = null;
        this.B = j;
        this.C = j2;
    }

    @Override // com.gamericefishpro.space.n9.g0
    public final boolean u() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026b A[Catch: NameNotFoundException -> 0x0273, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0273, blocks: (B:99:0x0265, B:101:0x026b), top: B:132:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x026e A[PHI: r5 r37
      0x026e: PHI (r5v19 int) = (r5v18 int), (r5v20 int) binds: [B:105:0x0273, B:100:0x0269] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:105:0x0273, B:100:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:124:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134  */
    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0202  */
    /* JADX WARN: Code duplicated, block: B:79:0x0205  */
    /* JADX WARN: Code duplicated, block: B:81:0x021a  */
    /* JADX WARN: Code duplicated, block: B:88:0x022c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0239  */
    /* JADX WARN: Code duplicated, block: B:93:0x023b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0256  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final t4 v(String str) {
        String str2;
        String str3;
        boolean z;
        long j;
        boolean zB;
        boolean z2;
        Class<?> clsLoadClass;
        long j2;
        Object objInvoke;
        String str4;
        long jMin;
        long jA;
        int i;
        Boolean boolD;
        boolean z3;
        boolean z4;
        int i2;
        String str5;
        Boolean boolD2;
        boolean zBooleanValue;
        r1 r1Var;
        String strX;
        boolean z5;
        int i3;
        int i4;
        long j3;
        ApplicationInfo applicationInfoD;
        d0 d0Var;
        long j4;
        int extensionVersion;
        r();
        String strX2 = x();
        String strY = y();
        s();
        String str6 = this.v;
        s();
        long j5 = this.w;
        s();
        com.gamericefishpro.space.v8.c0.g(this.y);
        String str7 = this.y;
        r1 r1Var2 = (r1) this.d;
        g gVar = r1Var2.v;
        v0 v0Var = r1Var2.y;
        g gVar2 = r1Var2.v;
        Context context = r1Var2.d;
        r4 r4Var = r1Var2.B;
        f1 f1Var = r1Var2.w;
        gVar.w();
        s();
        r();
        long j6 = this.A;
        long jM = 0;
        if (j6 == 0) {
            r1.j(r4Var);
            r1 r1Var3 = (r1) r4Var.d;
            String packageName = context.getPackageName();
            r4Var.r();
            com.gamericefishpro.space.v8.c0.d(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestI = r4.I();
            long J = -1;
            if (messageDigestI == null) {
                v0 v0Var2 = r1Var3.y;
                r1.l(v0Var2);
                v0Var2.y.a("Could not get MD5 instance");
                str2 = strY;
                str3 = str6;
            } else {
                if (packageManager != null) {
                    try {
                        if (r4Var.U(context, packageName)) {
                            str2 = strY;
                            str3 = str6;
                            J = 0;
                        } else {
                            str2 = strY;
                            try {
                                str3 = str6;
                                try {
                                    Signature[] signatureArr = com.gamericefishpro.space.b9.c.a(context).e(64, r1Var3.d.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        v0 v0Var3 = r1Var3.y;
                                        r1.l(v0Var3);
                                        v0Var3.B.a("Could not get signatures");
                                    } else {
                                        J = r4.J(messageDigestI.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    v0 v0Var4 = r1Var3.y;
                                    r1.l(v0Var4);
                                    v0Var4.y.b(e, "Package name not found");
                                    j = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                str3 = str6;
                                v0 v0Var5 = r1Var3.y;
                                r1.l(v0Var5);
                                v0Var5.y.b(e, "Package name not found");
                                j = 0;
                                this.A = j;
                                zB = r1Var2.b();
                                r1.j(f1Var);
                                boolean z6 = !f1Var.K;
                                r();
                                if (r1Var2.b()) {
                                    z2 = zB;
                                    if (gVar2.B(null, e0.H0)) {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                j2 = j;
                                                try {
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                                                    if (objInvoke == null) {
                                                        str4 = null;
                                                    } else {
                                                        try {
                                                            str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            r1.l(v0Var);
                                                            v0Var.D.a("Failed to retrieve Firebase Instance Id");
                                                            str4 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    r1.l(v0Var);
                                                    v0Var.C.a("Failed to obtain Firebase Analytics instance");
                                                }
                                                jMin = r1Var2.W;
                                                r1.j(f1Var);
                                                jA = f1Var.y.a();
                                                if (jA != 0) {
                                                    jMin = Math.min(jMin, jA);
                                                }
                                                s();
                                                i = this.F;
                                                boolD = gVar2.D("google_analytics_adid_collection_enabled");
                                                if (boolD != null) {
                                                    z3 = true;
                                                } else {
                                                    z3 = true;
                                                }
                                                r1.j(f1Var);
                                                f1Var.r();
                                                String str8 = str4;
                                                long j7 = jMin;
                                                boolean z7 = f1Var.v().getBoolean("deferred_analytics_collection", z);
                                                if (gVar2.G("google_analytics_default_allow_ad_personalization_signals", true) != b2.GRANTED) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                Boolean boolValueOf = Boolean.valueOf(z4);
                                                List list = this.D;
                                                String strG = f1Var.y().g();
                                                if (this.E == null) {
                                                    r1.j(r4Var);
                                                    this.E = r4Var.j0();
                                                }
                                                String str9 = this.E;
                                                if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
                                                    r();
                                                    if (this.I == 0) {
                                                        i2 = i;
                                                    } else {
                                                        r1Var2.D.getClass();
                                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.I;
                                                        i2 = i;
                                                        if (this.H != null) {
                                                            w();
                                                        }
                                                    }
                                                    if (this.H == null) {
                                                        w();
                                                    }
                                                    str5 = this.H;
                                                } else {
                                                    i2 = i;
                                                    str5 = null;
                                                }
                                                boolD2 = gVar2.D("google_analytics_sgtm_upload_enabled");
                                                if (boolD2 == null) {
                                                    zBooleanValue = false;
                                                } else {
                                                    zBooleanValue = boolD2.booleanValue();
                                                }
                                                r1.j(r4Var);
                                                r1Var = (r1) r4Var.d;
                                                String str10 = str5;
                                                strX = x();
                                                boolean z8 = zBooleanValue;
                                                if (r1Var.d.getPackageManager() == null) {
                                                    z5 = z3;
                                                    j3 = 0;
                                                } else {
                                                    try {
                                                        z5 = z3;
                                                        i3 = 0;
                                                        try {
                                                            applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var.d).d(0, strX);
                                                            if (applicationInfoD != null) {
                                                                i4 = applicationInfoD.targetSdkVersion;
                                                            } else {
                                                                i4 = i3;
                                                            }
                                                        } catch (PackageManager.NameNotFoundException unused3) {
                                                            v0 v0Var6 = r1Var.y;
                                                            r1.l(v0Var6);
                                                            v0Var6.E.b(strX, "PackageManager failed to find running app: app_id");
                                                        }
                                                    } catch (PackageManager.NameNotFoundException unused4) {
                                                        z5 = z3;
                                                        i3 = 0;
                                                    }
                                                    j3 = i4;
                                                }
                                                r1.j(f1Var);
                                                int i5 = f1Var.y().b;
                                                r1.j(f1Var);
                                                f1Var.r();
                                                String str11 = o.b(f1Var.v().getString("dma_consent_settings", null)).b;
                                                r8.a();
                                                d0Var = e0.Q0;
                                                if (gVar2.B(null, d0Var)) {
                                                    r1.j(r4Var);
                                                    j4 = j3;
                                                    if (Build.VERSION.SDK_INT < 30) {
                                                    }
                                                    r8.a();
                                                    if (gVar2.B(null, d0Var)) {
                                                        r1.j(r4Var);
                                                        jM = r4Var.M();
                                                    }
                                                    String str12 = gVar2.i;
                                                    String strValueOf = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                                                    long j8 = r1Var2.W;
                                                    r1.i(r1Var2.N);
                                                    return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z6, str8, j7, i2, z5, z7, boolValueOf, this.B, list, strG, str9, str10, z8, j4, i5, str11, extensionVersion, jM, str12, strValueOf, j8, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                                                }
                                                j4 = j3;
                                                extensionVersion = 0;
                                                r8.a();
                                                if (gVar2.B(null, d0Var)) {
                                                    r1.j(r4Var);
                                                    jM = r4Var.M();
                                                }
                                                String str13 = gVar2.i;
                                                String strValueOf2 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                                                long j9 = r1Var2.W;
                                                r1.i(r1Var2.N);
                                                return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z6, str8, j7, i2, z5, z7, boolValueOf, this.B, list, strG, str9, str10, z8, j4, i5, str11, extensionVersion, jM, str13, strValueOf2, j9, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                                            }
                                        } catch (ClassNotFoundException unused5) {
                                        }
                                        str4 = null;
                                        jMin = r1Var2.W;
                                        r1.j(f1Var);
                                        jA = f1Var.y.a();
                                        if (jA != 0) {
                                            jMin = Math.min(jMin, jA);
                                        }
                                        s();
                                        i = this.F;
                                        boolD = gVar2.D("google_analytics_adid_collection_enabled");
                                        if (boolD != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        r1.j(f1Var);
                                        f1Var.r();
                                        String str14 = str4;
                                        long j10 = jMin;
                                        boolean z9 = f1Var.v().getBoolean("deferred_analytics_collection", z);
                                        if (gVar2.G("google_analytics_default_allow_ad_personalization_signals", true) != b2.GRANTED) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        Boolean boolValueOf2 = Boolean.valueOf(z4);
                                        List list2 = this.D;
                                        String strG2 = f1Var.y().g();
                                        if (this.E == null) {
                                            r1.j(r4Var);
                                            this.E = r4Var.j0();
                                        }
                                        String str15 = this.E;
                                        if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
                                            i2 = i;
                                            str5 = null;
                                        } else {
                                            r();
                                            if (this.I == 0) {
                                                i2 = i;
                                            } else {
                                                r1Var2.D.getClass();
                                                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.I;
                                                i2 = i;
                                                if (this.H != null) {
                                                    w();
                                                }
                                            }
                                            if (this.H == null) {
                                                w();
                                            }
                                            str5 = this.H;
                                        }
                                        boolD2 = gVar2.D("google_analytics_sgtm_upload_enabled");
                                        if (boolD2 == null) {
                                            zBooleanValue = false;
                                        } else {
                                            zBooleanValue = boolD2.booleanValue();
                                        }
                                        r1.j(r4Var);
                                        r1Var = (r1) r4Var.d;
                                        String str16 = str5;
                                        strX = x();
                                        boolean z10 = zBooleanValue;
                                        if (r1Var.d.getPackageManager() == null) {
                                            z5 = z3;
                                            j3 = 0;
                                        } else {
                                            z5 = z3;
                                            i3 = 0;
                                            applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var.d).d(0, strX);
                                            if (applicationInfoD != null) {
                                                i4 = applicationInfoD.targetSdkVersion;
                                            } else {
                                                i4 = i3;
                                            }
                                            j3 = i4;
                                        }
                                        r1.j(f1Var);
                                        int i6 = f1Var.y().b;
                                        r1.j(f1Var);
                                        f1Var.r();
                                        String str17 = o.b(f1Var.v().getString("dma_consent_settings", null)).b;
                                        r8.a();
                                        d0Var = e0.Q0;
                                        if (gVar2.B(null, d0Var)) {
                                            r1.j(r4Var);
                                            j4 = j3;
                                            if (Build.VERSION.SDK_INT < 30) {
                                            }
                                            r8.a();
                                            if (gVar2.B(null, d0Var)) {
                                                r1.j(r4Var);
                                                jM = r4Var.M();
                                            }
                                            String str18 = gVar2.i;
                                            String strValueOf3 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                                            long j11 = r1Var2.W;
                                            r1.i(r1Var2.N);
                                            return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z6, str14, j10, i2, z5, z9, boolValueOf2, this.B, list2, strG2, str15, str16, z10, j4, i6, str17, extensionVersion, jM, str18, strValueOf3, j11, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                                        }
                                        j4 = j3;
                                        extensionVersion = 0;
                                        r8.a();
                                        if (gVar2.B(null, d0Var)) {
                                            r1.j(r4Var);
                                            jM = r4Var.M();
                                        }
                                        String str19 = gVar2.i;
                                        String strValueOf4 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                                        long j12 = r1Var2.W;
                                        r1.i(r1Var2.N);
                                        return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z6, str14, j10, i2, z5, z9, boolValueOf2, this.B, list2, strG2, str15, str16, z10, j4, i6, str17, extensionVersion, jM, str19, strValueOf4, j12, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                                    }
                                    r1.l(v0Var);
                                    v0Var.G.a("Disabled IID for tests.");
                                } else {
                                    z2 = zB;
                                }
                                j2 = j;
                                str4 = null;
                                jMin = r1Var2.W;
                                r1.j(f1Var);
                                jA = f1Var.y.a();
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                s();
                                i = this.F;
                                boolD = gVar2.D("google_analytics_adid_collection_enabled");
                                if (boolD != null) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                r1.j(f1Var);
                                f1Var.r();
                                String str110 = str4;
                                long j13 = jMin;
                                boolean z11 = f1Var.v().getBoolean("deferred_analytics_collection", z);
                                if (gVar2.G("google_analytics_default_allow_ad_personalization_signals", true) != b2.GRANTED) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(z4);
                                List list3 = this.D;
                                String strG3 = f1Var.y().g();
                                if (this.E == null) {
                                    r1.j(r4Var);
                                    this.E = r4Var.j0();
                                }
                                String str111 = this.E;
                                if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
                                    i2 = i;
                                    str5 = null;
                                } else {
                                    r();
                                    if (this.I == 0) {
                                        i2 = i;
                                    } else {
                                        r1Var2.D.getClass();
                                        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.I;
                                        i2 = i;
                                        if (this.H != null) {
                                            w();
                                        }
                                    }
                                    if (this.H == null) {
                                        w();
                                    }
                                    str5 = this.H;
                                }
                                boolD2 = gVar2.D("google_analytics_sgtm_upload_enabled");
                                if (boolD2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolD2.booleanValue();
                                }
                                r1.j(r4Var);
                                r1Var = (r1) r4Var.d;
                                String str112 = str5;
                                strX = x();
                                boolean z12 = zBooleanValue;
                                if (r1Var.d.getPackageManager() == null) {
                                    z5 = z3;
                                    j3 = 0;
                                } else {
                                    z5 = z3;
                                    i3 = 0;
                                    applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var.d).d(0, strX);
                                    if (applicationInfoD != null) {
                                        i4 = applicationInfoD.targetSdkVersion;
                                    } else {
                                        i4 = i3;
                                    }
                                    j3 = i4;
                                }
                                r1.j(f1Var);
                                int i7 = f1Var.y().b;
                                r1.j(f1Var);
                                f1Var.r();
                                String str113 = o.b(f1Var.v().getString("dma_consent_settings", null)).b;
                                r8.a();
                                d0Var = e0.Q0;
                                if (gVar2.B(null, d0Var)) {
                                    r1.j(r4Var);
                                    j4 = j3;
                                    if (Build.VERSION.SDK_INT < 30) {
                                    }
                                    r8.a();
                                    if (gVar2.B(null, d0Var)) {
                                        r1.j(r4Var);
                                        jM = r4Var.M();
                                    }
                                    String str114 = gVar2.i;
                                    String strValueOf5 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j14 = r1Var2.W;
                                    r1.i(r1Var2.N);
                                    return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z6, str110, j13, i2, z5, z11, boolValueOf3, this.B, list3, strG3, str111, str112, z12, j4, i7, str113, extensionVersion, jM, str114, strValueOf5, j14, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                                }
                                j4 = j3;
                                extensionVersion = 0;
                                r8.a();
                                if (gVar2.B(null, d0Var)) {
                                    r1.j(r4Var);
                                    jM = r4Var.M();
                                }
                                String str115 = gVar2.i;
                                String strValueOf6 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j15 = r1Var2.W;
                                r1.i(r1Var2.N);
                                return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z6, str110, j13, i2, z5, z11, boolValueOf3, this.B, list3, strG3, str111, str112, z12, j4, i7, str113, extensionVersion, jM, str115, strValueOf6, j15, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = strY;
                    }
                } else {
                    str2 = strY;
                    str3 = str6;
                }
                j = 0;
                this.A = j;
            }
            j = J;
            this.A = j;
        } else {
            str2 = strY;
            str3 = str6;
            z = false;
            j = j6;
        }
        zB = r1Var2.b();
        r1.j(f1Var);
        boolean z13 = !f1Var.K;
        r();
        if (r1Var2.b()) {
            z2 = zB;
        } else {
            z2 = zB;
            if (gVar2.B(null, e0.H0)) {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    j2 = j;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                    if (objInvoke == null) {
                        str4 = null;
                    } else {
                        str4 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                    jMin = r1Var2.W;
                    r1.j(f1Var);
                    jA = f1Var.y.a();
                    if (jA != 0) {
                        jMin = Math.min(jMin, jA);
                    }
                    s();
                    i = this.F;
                    boolD = gVar2.D("google_analytics_adid_collection_enabled");
                    if (boolD != null || boolD.booleanValue()) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    r1.j(f1Var);
                    f1Var.r();
                    String str116 = str4;
                    long j16 = jMin;
                    boolean z14 = f1Var.v().getBoolean("deferred_analytics_collection", z);
                    if (gVar2.G("google_analytics_default_allow_ad_personalization_signals", true) != b2.GRANTED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Boolean boolValueOf4 = Boolean.valueOf(z4);
                    List list4 = this.D;
                    String strG4 = f1Var.y().g();
                    if (this.E == null) {
                        r1.j(r4Var);
                        this.E = r4Var.j0();
                    }
                    String str117 = this.E;
                    if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
                        i2 = i;
                        str5 = null;
                    } else {
                        r();
                        if (this.I == 0) {
                            i2 = i;
                        } else {
                            r1Var2.D.getClass();
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - this.I;
                            i2 = i;
                            if (this.H != null && jCurrentTimeMillis4 > 86400000 && this.J == null) {
                                w();
                            }
                        }
                        if (this.H == null) {
                            w();
                        }
                        str5 = this.H;
                    }
                    boolD2 = gVar2.D("google_analytics_sgtm_upload_enabled");
                    if (boolD2 == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolD2.booleanValue();
                    }
                    r1.j(r4Var);
                    r1Var = (r1) r4Var.d;
                    String str118 = str5;
                    strX = x();
                    boolean z15 = zBooleanValue;
                    if (r1Var.d.getPackageManager() == null) {
                        z5 = z3;
                        j3 = 0;
                    } else {
                        z5 = z3;
                        i3 = 0;
                        applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var.d).d(0, strX);
                        if (applicationInfoD != null) {
                            i4 = applicationInfoD.targetSdkVersion;
                        } else {
                            i4 = i3;
                        }
                        j3 = i4;
                    }
                    r1.j(f1Var);
                    int i8 = f1Var.y().b;
                    r1.j(f1Var);
                    f1Var.r();
                    String str119 = o.b(f1Var.v().getString("dma_consent_settings", null)).b;
                    r8.a();
                    d0Var = e0.Q0;
                    if (gVar2.B(null, d0Var)) {
                        r1.j(r4Var);
                        j4 = j3;
                        if (Build.VERSION.SDK_INT < 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
                        }
                        r8.a();
                        if (gVar2.B(null, d0Var)) {
                            r1.j(r4Var);
                            jM = r4Var.M();
                        }
                        String str1110 = gVar2.i;
                        String strValueOf7 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                        long j17 = r1Var2.W;
                        r1.i(r1Var2.N);
                        return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z13, str116, j16, i2, z5, z14, boolValueOf4, this.B, list4, strG4, str117, str118, z15, j4, i8, str119, extensionVersion, jM, str1110, strValueOf7, j17, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                    }
                    j4 = j3;
                    extensionVersion = 0;
                    r8.a();
                    if (gVar2.B(null, d0Var)) {
                        r1.j(r4Var);
                        jM = r4Var.M();
                    }
                    String str1111 = gVar2.i;
                    String strValueOf8 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j18 = r1Var2.W;
                    r1.i(r1Var2.N);
                    return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z13, str116, j16, i2, z5, z14, boolValueOf4, this.B, list4, strG4, str117, str118, z15, j4, i8, str119, extensionVersion, jM, str1111, strValueOf8, j18, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                }
                str4 = null;
                jMin = r1Var2.W;
                r1.j(f1Var);
                jA = f1Var.y.a();
                if (jA != 0) {
                    jMin = Math.min(jMin, jA);
                }
                s();
                i = this.F;
                boolD = gVar2.D("google_analytics_adid_collection_enabled");
                if (boolD != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                r1.j(f1Var);
                f1Var.r();
                String str1112 = str4;
                long j19 = jMin;
                boolean z16 = f1Var.v().getBoolean("deferred_analytics_collection", z);
                if (gVar2.G("google_analytics_default_allow_ad_personalization_signals", true) != b2.GRANTED) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z4);
                List list5 = this.D;
                String strG5 = f1Var.y().g();
                if (this.E == null) {
                    r1.j(r4Var);
                    this.E = r4Var.j0();
                }
                String str1113 = this.E;
                if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
                    i2 = i;
                    str5 = null;
                } else {
                    r();
                    if (this.I == 0) {
                        i2 = i;
                    } else {
                        r1Var2.D.getClass();
                        long jCurrentTimeMillis5 = System.currentTimeMillis() - this.I;
                        i2 = i;
                        if (this.H != null) {
                            w();
                        }
                    }
                    if (this.H == null) {
                        w();
                    }
                    str5 = this.H;
                }
                boolD2 = gVar2.D("google_analytics_sgtm_upload_enabled");
                if (boolD2 == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = boolD2.booleanValue();
                }
                r1.j(r4Var);
                r1Var = (r1) r4Var.d;
                String str1114 = str5;
                strX = x();
                boolean z17 = zBooleanValue;
                if (r1Var.d.getPackageManager() == null) {
                    z5 = z3;
                    j3 = 0;
                } else {
                    z5 = z3;
                    i3 = 0;
                    applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var.d).d(0, strX);
                    if (applicationInfoD != null) {
                        i4 = applicationInfoD.targetSdkVersion;
                    } else {
                        i4 = i3;
                    }
                    j3 = i4;
                }
                r1.j(f1Var);
                int i9 = f1Var.y().b;
                r1.j(f1Var);
                f1Var.r();
                String str1115 = o.b(f1Var.v().getString("dma_consent_settings", null)).b;
                r8.a();
                d0Var = e0.Q0;
                if (gVar2.B(null, d0Var)) {
                    r1.j(r4Var);
                    j4 = j3;
                    if (Build.VERSION.SDK_INT < 30) {
                    }
                    r8.a();
                    if (gVar2.B(null, d0Var)) {
                        r1.j(r4Var);
                        jM = r4Var.M();
                    }
                    String str1116 = gVar2.i;
                    String strValueOf9 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                    long j110 = r1Var2.W;
                    r1.i(r1Var2.N);
                    return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z13, str1112, j19, i2, z5, z16, boolValueOf5, this.B, list5, strG5, str1113, str1114, z17, j4, i9, str1115, extensionVersion, jM, str1116, strValueOf9, j110, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
                }
                j4 = j3;
                extensionVersion = 0;
                r8.a();
                if (gVar2.B(null, d0Var)) {
                    r1.j(r4Var);
                    jM = r4Var.M();
                }
                String str1117 = gVar2.i;
                String strValueOf10 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
                long j111 = r1Var2.W;
                r1.i(r1Var2.N);
                return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z13, str1112, j19, i2, z5, z16, boolValueOf5, this.B, list5, strG5, str1113, str1114, z17, j4, i9, str1115, extensionVersion, jM, str1117, strValueOf10, j111, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
            }
            r1.l(v0Var);
            v0Var.G.a("Disabled IID for tests.");
        }
        j2 = j;
        str4 = null;
        jMin = r1Var2.W;
        r1.j(f1Var);
        jA = f1Var.y.a();
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        s();
        i = this.F;
        boolD = gVar2.D("google_analytics_adid_collection_enabled");
        if (boolD != null) {
            z3 = true;
        } else {
            z3 = true;
        }
        r1.j(f1Var);
        f1Var.r();
        String str1118 = str4;
        long j112 = jMin;
        boolean z18 = f1Var.v().getBoolean("deferred_analytics_collection", z);
        if (gVar2.G("google_analytics_default_allow_ad_personalization_signals", true) != b2.GRANTED) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean boolValueOf6 = Boolean.valueOf(z4);
        List list6 = this.D;
        String strG6 = f1Var.y().g();
        if (this.E == null) {
            r1.j(r4Var);
            this.E = r4Var.j0();
        }
        String str1119 = this.E;
        if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
            i2 = i;
            str5 = null;
        } else {
            r();
            if (this.I == 0) {
                i2 = i;
            } else {
                r1Var2.D.getClass();
                long jCurrentTimeMillis6 = System.currentTimeMillis() - this.I;
                i2 = i;
                if (this.H != null) {
                    w();
                }
            }
            if (this.H == null) {
                w();
            }
            str5 = this.H;
        }
        boolD2 = gVar2.D("google_analytics_sgtm_upload_enabled");
        if (boolD2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolD2.booleanValue();
        }
        r1.j(r4Var);
        r1Var = (r1) r4Var.d;
        String str11110 = str5;
        strX = x();
        boolean z19 = zBooleanValue;
        if (r1Var.d.getPackageManager() == null) {
            z5 = z3;
            j3 = 0;
        } else {
            z5 = z3;
            i3 = 0;
            applicationInfoD = com.gamericefishpro.space.b9.c.a(r1Var.d).d(0, strX);
            if (applicationInfoD != null) {
                i4 = applicationInfoD.targetSdkVersion;
            } else {
                i4 = i3;
            }
            j3 = i4;
        }
        r1.j(f1Var);
        int i10 = f1Var.y().b;
        r1.j(f1Var);
        f1Var.r();
        String str11111 = o.b(f1Var.v().getString("dma_consent_settings", null)).b;
        r8.a();
        d0Var = e0.Q0;
        if (gVar2.B(null, d0Var)) {
            r1.j(r4Var);
            j4 = j3;
            if (Build.VERSION.SDK_INT < 30) {
            }
            r8.a();
            if (gVar2.B(null, d0Var)) {
                r1.j(r4Var);
                jM = r4Var.M();
            }
            String str11112 = gVar2.i;
            String strValueOf11 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
            long j113 = r1Var2.W;
            r1.i(r1Var2.N);
            return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z13, str1118, j112, i2, z5, z18, boolValueOf6, this.B, list6, strG6, str1119, str11110, z19, j4, i10, str11111, extensionVersion, jM, str11112, strValueOf11, j113, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
        }
        j4 = j3;
        extensionVersion = 0;
        r8.a();
        if (gVar2.B(null, d0Var)) {
            r1.j(r4Var);
            jM = r4Var.M();
        }
        String str11113 = gVar2.i;
        String strValueOf12 = String.valueOf(e2.h(gVar2.G("google_analytics_default_allow_ad_personalization_signals", true)));
        long j114 = r1Var2.W;
        r1.i(r1Var2.N);
        return new t4(strX2, str2, str3, j5, str7, 133005L, j2, str, z2, z13, str1118, j112, i2, z5, z18, boolValueOf6, this.B, list6, strG6, str1119, str11110, z19, j4, i10, str11111, extensionVersion, jM, str11113, strValueOf12, j114, com.gamericefishpro.space.m5.a.b(r1Var2.N.w()));
    }

    public final void w() {
        String str;
        r();
        r1 r1Var = (r1) this.d;
        f1 f1Var = r1Var.w;
        v0 v0Var = r1Var.y;
        r1.j(f1Var);
        if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            r4 r4Var = r1Var.B;
            r1.j(r4Var);
            r4Var.o0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            r1.l(v0Var);
            v0Var.F.a("Analytics Storage consent is not granted");
            str = null;
        }
        r1.l(v0Var);
        v0Var.F.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.H = str;
        r1Var.D.getClass();
        this.I = System.currentTimeMillis();
    }

    public final String x() {
        s();
        com.gamericefishpro.space.v8.c0.g(this.i);
        return this.i;
    }

    public final String y() {
        r();
        s();
        com.gamericefishpro.space.v8.c0.g(this.G);
        return this.G;
    }
}
