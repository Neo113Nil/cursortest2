package com.gamericefishpro.space.n9;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ t2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(t2 t2Var, a2 a2Var, int i) {
        super(a2Var);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(t2Var);
                this.f = t2Var;
                super(a2Var);
                break;
            case 2:
                Objects.requireNonNull(t2Var);
                this.f = t2Var;
                super(a2Var);
                break;
            case 3:
                this.f = t2Var;
                super(a2Var);
                break;
            default:
                Objects.requireNonNull(t2Var);
                this.f = t2Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:66:0x018a  */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01af  */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x028a A[Catch: IllegalArgumentException -> 0x0291, MalformedURLException -> 0x0293, TryCatch #5 {IllegalArgumentException -> 0x0291, MalformedURLException -> 0x0293, blocks: (B:80:0x0242, B:82:0x028a, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:92:0x02a9, B:93:0x02ad), top: B:116:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x029b A[Catch: IllegalArgumentException -> 0x0291, MalformedURLException -> 0x0293, TryCatch #5 {IllegalArgumentException -> 0x0291, MalformedURLException -> 0x0293, blocks: (B:80:0x0242, B:82:0x028a, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:92:0x02a9, B:93:0x02ad), top: B:116:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a3 A[Catch: IllegalArgumentException -> 0x0291, MalformedURLException -> 0x0293, TryCatch #5 {IllegalArgumentException -> 0x0291, MalformedURLException -> 0x0293, blocks: (B:80:0x0242, B:82:0x028a, B:87:0x0295, B:89:0x029b, B:91:0x02a3, B:92:0x02a9, B:93:0x02ad), top: B:116:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c7  */
    @Override // com.gamericefishpro.space.n9.n
    public final void a() throws Throwable {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        o3 o3VarO;
        r1 r1Var;
        h0 h0Var;
        i iVarW;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        r1 r1Var2;
        URL url;
        String strConcat;
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t2 t2Var = ((r1) this.f.d).F;
                r1.k(t2Var);
                new Thread(new h2(t2Var, 0)).start();
                break;
            case 1:
                this.f.Q();
                break;
            case 2:
                this.f.x();
                break;
            default:
                t2 t2Var2 = this.f;
                r1 r1Var3 = (r1) t2Var2.d;
                f1 f1Var = r1Var3.w;
                v0 v0Var = r1Var3.y;
                p1 p1Var = r1Var3.z;
                r1.l(p1Var);
                p1Var.r();
                x2 x2Var = r1Var3.H;
                r1.l(x2Var);
                r1 r1Var4 = (r1) x2Var.d;
                r1.l(x2Var);
                String strX = r1Var3.q().x();
                Boolean boolD = r1Var3.v.D("google_analytics_adid_collection_enabled");
                boolean z = false;
                if (boolD == null || boolD.booleanValue()) {
                    r1.j(f1Var);
                    r1 r1Var5 = (r1) f1Var.d;
                    f1Var.r();
                    if (f1Var.y().i(d2.AD_STORAGE)) {
                        r1Var5.D.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = f1Var.A;
                        if (str3 == null || jElapsedRealtime >= f1Var.C) {
                            f1Var.C = r1Var5.v.y(strX, e0.b) + jElapsedRealtime;
                            try {
                                com.gamericefishpro.space.o8.a aVarA = com.gamericefishpro.space.o8.b.a(r1Var5.d);
                                f1Var.A = "";
                                String str4 = aVarA.c;
                                if (str4 != null) {
                                    f1Var.A = str4;
                                }
                                f1Var.B = aVarA.b;
                            } catch (Exception e) {
                                v0 v0Var2 = r1Var5.y;
                                r1.l(v0Var2);
                                v0Var2.F.b(e, "Unable to get advertising id");
                                f1Var.A = "";
                            }
                            pair = new Pair(f1Var.A, Boolean.valueOf(f1Var.B));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(f1Var.B));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        r1.l(x2Var);
                        x2Var.t();
                        ConnectivityManager connectivityManager = (ConnectivityManager) r1Var4.d.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            o3 o3VarO2 = r1Var3.o();
                            o3VarO2.r();
                            o3VarO2.s();
                            if (!o3VarO2.y()) {
                                t2 t2Var3 = r1Var3.F;
                                r1.k(t2Var3);
                                r1 r1Var6 = (r1) t2Var3.d;
                                t2Var3.r();
                                o3VarO = r1Var6.o();
                                r1Var = (r1) o3VarO.d;
                                o3VarO.r();
                                o3VarO.s();
                                h0Var = o3VarO.v;
                                if (h0Var == null) {
                                    o3VarO.x();
                                    v0 v0Var3 = r1Var.y;
                                    r1.l(v0Var3);
                                    v0Var3.F.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        iVarW = h0Var.w(o3VarO.H(false));
                                        o3VarO.E();
                                    } catch (RemoteException e2) {
                                        v0 v0Var4 = r1Var.y;
                                        r1.l(v0Var4);
                                        v0Var4.y.b(e2, "Failed to get consents; remote exception");
                                        iVarW = null;
                                    }
                                    if (iVarW != null) {
                                        bundle = iVarW.d;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = r1Var3.U;
                                        r1Var3.U = i + 1;
                                        z = i < 10;
                                        r1.l(v0Var);
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        v0Var.F.b(Integer.valueOf(r1Var3.U), com.gamericefishpro.space.m5.a.j(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        e2 e2VarB = e2.b(bundle, 100);
                                        sb.append("&gcs=");
                                        sb.append(e2VarB.f());
                                        o oVarC = o.c(bundle, 100);
                                        str = oVarC.d;
                                        sb.append("&dma=");
                                        Boolean bool2 = oVarC.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = e2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i2 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i2);
                                        r1.l(v0Var);
                                        v0Var.G.b(sb, "Consent query parameters to Bow");
                                        r4 r4Var = r1Var3.B;
                                        r1.j(r4Var);
                                        ((r1) r1Var3.q().d).v.w();
                                        String str5 = (String) pair.first;
                                        long jA = f1Var.N.a() - 1;
                                        string = sb.toString();
                                        r1Var2 = (r1) r4Var.d;
                                        try {
                                            com.gamericefishpro.space.v8.c0.d(str5);
                                            com.gamericefishpro.space.v8.c0.d(strX);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + r4Var.X()) + "&rdid=" + str5 + "&bundleid=" + strX + "&retry=" + jA;
                                            if (strX.equals(r1Var2.v.v("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            v0 v0Var5 = r1Var2.y;
                                            r1.l(v0Var5);
                                            v0Var5.y.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            v0 v0Var6 = r1Var2.y;
                                            r1.l(v0Var6);
                                            v0Var6.y.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            r1.l(x2Var);
                                            h1 h1Var = new h1(r1Var3, 1);
                                            x2Var.t();
                                            p1 p1Var2 = r1Var4.z;
                                            r1.l(p1Var2);
                                            p1Var2.D(new y0(x2Var, strX, url, (byte[]) null, (HashMap) null, h1Var));
                                        }
                                    }
                                }
                                iVarW = null;
                                if (iVarW != null) {
                                    bundle = iVarW.d;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = r1Var3.U;
                                    r1Var3.U = i + 1;
                                    if (i < 10) {
                                    }
                                    r1.l(v0Var);
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    v0Var.F.b(Integer.valueOf(r1Var3.U), com.gamericefishpro.space.m5.a.j(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                } else {
                                    e2 e2VarB2 = e2.b(bundle, 100);
                                    sb.append("&gcs=");
                                    sb.append(e2VarB2.f());
                                    o oVarC2 = o.c(bundle, 100);
                                    str = oVarC2.d;
                                    sb.append("&dma=");
                                    Boolean bool3 = oVarC2.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = e2.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i3 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i3);
                                    r1.l(v0Var);
                                    v0Var.G.b(sb, "Consent query parameters to Bow");
                                    r4 r4Var2 = r1Var3.B;
                                    r1.j(r4Var2);
                                    ((r1) r1Var3.q().d).v.w();
                                    String str6 = (String) pair.first;
                                    long jA2 = f1Var.N.a() - 1;
                                    string = sb.toString();
                                    r1Var2 = (r1) r4Var2.d;
                                    com.gamericefishpro.space.v8.c0.d(str6);
                                    com.gamericefishpro.space.v8.c0.d(strX);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + r4Var2.X()) + "&rdid=" + str6 + "&bundleid=" + strX + "&retry=" + jA2;
                                    if (strX.equals(r1Var2.v.v("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        r1.l(x2Var);
                                        h1 h1Var2 = new h1(r1Var3, 1);
                                        x2Var.t();
                                        p1 p1Var3 = r1Var4.z;
                                        r1.l(p1Var3);
                                        p1Var3.D(new y0(x2Var, strX, url, (byte[]) null, (HashMap) null, h1Var2));
                                    }
                                }
                                break;
                            } else {
                                r4 r4Var3 = ((r1) o3VarO2.d).B;
                                r1.j(r4Var3);
                                if (r4Var3.X() >= 234200) {
                                    t2 t2Var4 = r1Var3.F;
                                    r1.k(t2Var4);
                                    r1 r1Var7 = (r1) t2Var4.d;
                                    t2Var4.r();
                                    o3VarO = r1Var7.o();
                                    r1Var = (r1) o3VarO.d;
                                    o3VarO.r();
                                    o3VarO.s();
                                    h0Var = o3VarO.v;
                                    if (h0Var == null) {
                                        o3VarO.x();
                                        v0 v0Var7 = r1Var.y;
                                        r1.l(v0Var7);
                                        v0Var7.F.a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        iVarW = h0Var.w(o3VarO.H(false));
                                        o3VarO.E();
                                        if (iVarW != null) {
                                            bundle = iVarW.d;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = r1Var3.U;
                                            r1Var3.U = i + 1;
                                            if (i < 10) {
                                            }
                                            r1.l(v0Var);
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            v0Var.F.b(Integer.valueOf(r1Var3.U), com.gamericefishpro.space.m5.a.j(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                        } else {
                                            e2 e2VarB3 = e2.b(bundle, 100);
                                            sb.append("&gcs=");
                                            sb.append(e2VarB3.f());
                                            o oVarC3 = o.c(bundle, 100);
                                            str = oVarC3.d;
                                            sb.append("&dma=");
                                            Boolean bool4 = oVarC3.c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = e2.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i4);
                                            r1.l(v0Var);
                                            v0Var.G.b(sb, "Consent query parameters to Bow");
                                            r4 r4Var4 = r1Var3.B;
                                            r1.j(r4Var4);
                                            ((r1) r1Var3.q().d).v.w();
                                            String str7 = (String) pair.first;
                                            long jA3 = f1Var.N.a() - 1;
                                            string = sb.toString();
                                            r1Var2 = (r1) r4Var4.d;
                                            com.gamericefishpro.space.v8.c0.d(str7);
                                            com.gamericefishpro.space.v8.c0.d(strX);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + r4Var4.X()) + "&rdid=" + str7 + "&bundleid=" + strX + "&retry=" + jA3;
                                            if (strX.equals(r1Var2.v.v("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                r1.l(x2Var);
                                                h1 h1Var3 = new h1(r1Var3, 1);
                                                x2Var.t();
                                                p1 p1Var4 = r1Var4.z;
                                                r1.l(p1Var4);
                                                p1Var4.D(new y0(x2Var, strX, url, (byte[]) null, (HashMap) null, h1Var3));
                                            }
                                        }
                                    }
                                    iVarW = null;
                                    if (iVarW != null) {
                                        bundle = iVarW.d;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = r1Var3.U;
                                        r1Var3.U = i + 1;
                                        if (i < 10) {
                                        }
                                        r1.l(v0Var);
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        v0Var.F.b(Integer.valueOf(r1Var3.U), com.gamericefishpro.space.m5.a.j(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        e2 e2VarB4 = e2.b(bundle, 100);
                                        sb.append("&gcs=");
                                        sb.append(e2VarB4.f());
                                        o oVarC4 = o.c(bundle, 100);
                                        str = oVarC4.d;
                                        sb.append("&dma=");
                                        Boolean bool5 = oVarC4.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = e2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i5);
                                        r1.l(v0Var);
                                        v0Var.G.b(sb, "Consent query parameters to Bow");
                                        r4 r4Var5 = r1Var3.B;
                                        r1.j(r4Var5);
                                        ((r1) r1Var3.q().d).v.w();
                                        String str8 = (String) pair.first;
                                        long jA4 = f1Var.N.a() - 1;
                                        string = sb.toString();
                                        r1Var2 = (r1) r4Var5.d;
                                        com.gamericefishpro.space.v8.c0.d(str8);
                                        com.gamericefishpro.space.v8.c0.d(strX);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + r4Var5.X()) + "&rdid=" + str8 + "&bundleid=" + strX + "&retry=" + jA4;
                                        if (strX.equals(r1Var2.v.v("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            r1.l(x2Var);
                                            h1 h1Var4 = new h1(r1Var3, 1);
                                            x2Var.t();
                                            p1 p1Var5 = r1Var4.z;
                                            r1.l(p1Var5);
                                            p1Var5.D(new y0(x2Var, strX, url, (byte[]) null, (HashMap) null, h1Var4));
                                        }
                                    }
                                } else {
                                    r4 r4Var6 = r1Var3.B;
                                    r1.j(r4Var6);
                                    ((r1) r1Var3.q().d).v.w();
                                    String str9 = (String) pair.first;
                                    long jA5 = f1Var.N.a() - 1;
                                    string = sb.toString();
                                    r1Var2 = (r1) r4Var6.d;
                                    com.gamericefishpro.space.v8.c0.d(str9);
                                    com.gamericefishpro.space.v8.c0.d(strX);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + r4Var6.X()) + "&rdid=" + str9 + "&bundleid=" + strX + "&retry=" + jA5;
                                    if (strX.equals(r1Var2.v.v("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        r1.l(x2Var);
                                        h1 h1Var5 = new h1(r1Var3, 1);
                                        x2Var.t();
                                        p1 p1Var6 = r1Var4.z;
                                        r1.l(p1Var6);
                                        p1Var6.D(new y0(x2Var, strX, url, (byte[]) null, (HashMap) null, h1Var5));
                                    }
                                }
                            }
                        } else {
                            r1.l(v0Var);
                            v0Var.B.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        r1.l(v0Var);
                        v0Var.G.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    r1.l(v0Var);
                    v0Var.G.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (z) {
                    t2Var2.M.b(2000L);
                }
                break;
        }
    }
}
