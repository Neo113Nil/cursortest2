package com.gamericefishpro.space.n9;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements Runnable {
    public final /* synthetic */ int d = 3;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;

    public k2(q2 q2Var, boolean z, Uri uri, String str, String str2) {
        this.v = z;
        this.w = uri;
        this.e = str;
        this.i = str2;
        this.y = q2Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0116 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x016d A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0174 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x018f A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0195 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:67:0x0154, B:70:0x016d, B:72:0x017c, B:71:0x0174, B:73:0x018f, B:75:0x0195, B:77:0x019b, B:79:0x01a1, B:81:0x01a7, B:83:0x01af, B:85:0x01b7, B:87:0x01bd, B:88:0x01cf, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:100:0x0094 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        v0 v0Var;
        Bundle bundleQ0;
        String str;
        v0 v0Var2;
        t0 t0Var;
        Bundle bundleQ1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o3 o3VarO = ((AppMeasurementDynamiteService) this.y).d.o();
                com.gamericefishpro.space.i9.l0 l0Var = (com.gamericefishpro.space.i9.l0) this.w;
                String str2 = (String) this.e;
                String str3 = (String) this.i;
                o3VarO.r();
                o3VarO.s();
                o3VarO.F(new f3(o3VarO, str2, str3, o3VarO.H(false), this.v, l0Var));
                break;
            case 1:
                String str4 = (String) this.e;
                String str5 = (String) this.i;
                o3 o3VarO2 = ((r1) ((t2) this.y).d).o();
                AtomicReference atomicReference = (AtomicReference) this.w;
                o3VarO2.r();
                o3VarO2.s();
                o3VarO2.F(new f3(o3VarO2, atomicReference, str4, str5, o3VarO2.H(false), this.v));
                break;
            case 2:
                q2 q2Var = (q2) this.y;
                t2 t2Var = (t2) q2Var.e;
                t2Var.r();
                r1 r1Var = (r1) t2Var.d;
                h1 h1Var = t2Var.K;
                String str6 = (String) this.i;
                Uri uri = (Uri) this.w;
                try {
                    r4 r4Var = r1Var.B;
                    v0 v0Var3 = r1Var.y;
                    r1.j(r4Var);
                    try {
                        String str7 = "Activity created with data 'referrer' without required params";
                        if (TextUtils.isEmpty(str6)) {
                            v0Var = v0Var3;
                        } else {
                            try {
                                if (!str6.contains("gclid")) {
                                    v0Var = v0Var3;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        v0 v0Var4 = ((r1) r4Var.d).y;
                                        r1.l(v0Var4);
                                        v0Var4.F.a("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) this.e;
                                    if (this.v) {
                                        r4 r4Var2 = r1Var.B;
                                        r1.j(r4Var2);
                                        bundleQ1 = r4Var2.q0(uri);
                                        if (bundleQ1 != null) {
                                            bundleQ1.putString("_cis", "intent");
                                            if (bundleQ1.containsKey("gclid") && bundleQ0 != null && bundleQ0.containsKey("gclid")) {
                                                bundleQ1.putString("_cer", "gclid=" + bundleQ0.getString("gclid"));
                                            }
                                            t2Var.y(str, "_cmp", bundleQ1);
                                            h1Var.c(str, bundleQ1);
                                        } else {
                                            str7 = "Activity created with data 'referrer' without required params";
                                        }
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        r1.l(v0Var);
                                        v0Var2 = v0Var;
                                        t0Var = v0Var2.F;
                                        t0Var.b(str6, "Activity created with referrer");
                                        if (r1Var.v.B(null, e0.G0)) {
                                            if (bundleQ0 != null) {
                                                t2Var.y(str, "_cmp", bundleQ0);
                                                h1Var.c(str, bundleQ0);
                                            } else {
                                                r1.l(v0Var2);
                                                t0Var.b(str6, "Referrer does not contain valid parameters");
                                            }
                                            r1Var.D.getClass();
                                            t2Var.B("auto", "_ldl", null, true, System.currentTimeMillis());
                                        } else if (str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                            r1.l(v0Var2);
                                            t0Var.a(str7);
                                        } else if (!TextUtils.isEmpty(str6)) {
                                            r1Var.D.getClass();
                                            t2Var.B("auto", "_ldl", str6, true, System.currentTimeMillis());
                                        }
                                    }
                                } else {
                                    v0Var = v0Var3;
                                }
                                bundleQ0 = r4Var.q0(Uri.parse("https://google.com/search?".concat(str6)));
                                if (bundleQ0 != null) {
                                    bundleQ0.putString("_cis", "referrer");
                                }
                                str = (String) this.e;
                                if (this.v) {
                                    r4 r4Var3 = r1Var.B;
                                    r1.j(r4Var3);
                                    bundleQ1 = r4Var3.q0(uri);
                                    if (bundleQ1 != null) {
                                        bundleQ1.putString("_cis", "intent");
                                        if (bundleQ1.containsKey("gclid")) {
                                        }
                                        t2Var.y(str, "_cmp", bundleQ1);
                                        h1Var.c(str, bundleQ1);
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                } else {
                                    str7 = "Activity created with data 'referrer' without required params";
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                    r1.l(v0Var);
                                    v0Var2 = v0Var;
                                    t0Var = v0Var2.F;
                                    t0Var.b(str6, "Activity created with referrer");
                                    if (r1Var.v.B(null, e0.G0)) {
                                        if (str6.contains("gclid")) {
                                        }
                                        r1.l(v0Var2);
                                        t0Var.a(str7);
                                    } else {
                                        if (bundleQ0 != null) {
                                            t2Var.y(str, "_cmp", bundleQ0);
                                            h1Var.c(str, bundleQ0);
                                        } else {
                                            r1.l(v0Var2);
                                            t0Var.b(str6, "Referrer does not contain valid parameters");
                                        }
                                        r1Var.D.getClass();
                                        t2Var.B("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                q2Var = q2Var;
                                v0 v0Var5 = ((r1) ((t2) q2Var.e).d).y;
                                r1.l(v0Var5);
                                v0Var5.y.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        bundleQ0 = null;
                        str = (String) this.e;
                        if (this.v) {
                            r4 r4Var4 = r1Var.B;
                            r1.j(r4Var4);
                            bundleQ1 = r4Var4.q0(uri);
                            if (bundleQ1 != null) {
                                bundleQ1.putString("_cis", "intent");
                                if (bundleQ1.containsKey("gclid")) {
                                }
                                t2Var.y(str, "_cmp", bundleQ1);
                                h1Var.c(str, bundleQ1);
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            r1.l(v0Var);
                            v0Var2 = v0Var;
                            t0Var = v0Var2.F;
                            t0Var.b(str6, "Activity created with referrer");
                            if (r1Var.v.B(null, e0.G0)) {
                                if (str6.contains("gclid")) {
                                }
                                r1.l(v0Var2);
                                t0Var.a(str7);
                            } else {
                                if (bundleQ0 != null) {
                                    t2Var.y(str, "_cmp", bundleQ0);
                                    h1Var.c(str, bundleQ0);
                                } else {
                                    r1.l(v0Var2);
                                    t0Var.b(str6, "Referrer does not contain valid parameters");
                                }
                                r1Var.D.getClass();
                                t2Var.B("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        v0 v0Var6 = ((r1) ((t2) q2Var.e).d).y;
                        r1.l(v0Var6);
                        v0Var6.y.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
                break;
            default:
                t4 t4Var = (t4) this.w;
                o3 o3Var = (o3) this.y;
                h0 h0Var = o3Var.v;
                r1 r1Var2 = (r1) o3Var.d;
                if (h0Var == null) {
                    v0 v0Var7 = r1Var2.y;
                    r1.l(v0Var7);
                    v0Var7.y.a("Failed to send default event parameters to service");
                } else if (r1Var2.v.B(null, e0.b1)) {
                    o3Var.J(h0Var, this.v ? null : (t) this.e, t4Var);
                } else {
                    try {
                        h0Var.u((Bundle) this.i, t4Var);
                        o3Var.E();
                    } catch (RemoteException e4) {
                        v0 v0Var8 = r1Var2.y;
                        r1.l(v0Var8);
                        v0Var8.y.b(e4, "Failed to send default event parameters to service");
                    }
                }
                break;
        }
    }

    public k2(t2 t2Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.w = atomicReference;
        this.e = str;
        this.i = str2;
        this.v = z;
        Objects.requireNonNull(t2Var);
        this.y = t2Var;
    }

    public k2(o3 o3Var, t4 t4Var, boolean z, t tVar, Bundle bundle) {
        this.w = t4Var;
        this.v = z;
        this.e = tVar;
        this.i = bundle;
        Objects.requireNonNull(o3Var);
        this.y = o3Var;
    }

    public k2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.gamericefishpro.space.i9.l0 l0Var, String str, String str2, boolean z) {
        this.w = l0Var;
        this.e = str;
        this.i = str2;
        this.v = z;
        this.y = appMeasurementDynamiteService;
    }
}
