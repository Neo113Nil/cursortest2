package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vma1 extends u791 {
    public final /* synthetic */ int e;
    public final /* synthetic */ j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vma1(j jVar, tha1 tha1Var, int i) {
        super(tha1Var);
        this.e = i;
        switch (i) {
            case 1:
                this.f = jVar;
                super(tha1Var);
                break;
            default:
                Objects.requireNonNull(jVar);
                this.f = jVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        if (r0.lh() >= 234200) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0185  */
    @Override // defpackage.u791
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        Pair pair;
        NetworkInfo activeNetworkInfo;
        zzao zzw;
        Bundle bundle;
        URL url;
        int i = this.e;
        j jVar = this.f;
        switch (i) {
            case 0:
                jVar.Mg();
                break;
            default:
                g gVar = (g) jVar.b;
                o5a1 o5a1Var = gVar.x;
                y1a1 y1a1Var = gVar.y;
                aaa1 aaa1Var = gVar.z;
                g.g(aaa1Var);
                aaa1Var.Gg();
                hva1 hva1Var = gVar.H;
                g.g(hva1Var);
                g gVar2 = (g) hva1Var.b;
                g.g(hva1Var);
                String Mg = gVar.l().Mg();
                Boolean Sg = gVar.w.Sg("google_analytics_adid_collection_enabled");
                if (Sg == null || Sg.booleanValue()) {
                    g.e(o5a1Var);
                    g gVar3 = (g) o5a1Var.b;
                    o5a1Var.Gg();
                    if (o5a1Var.Ng().i(zzjk.AD_STORAGE)) {
                        gVar3.D.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str = o5a1Var.B;
                        z = true;
                        if (str == null || elapsedRealtime >= o5a1Var.D) {
                            o5a1Var.D = gVar3.w.Ng(Mg, nw91.b) + elapsedRealtime;
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(gVar3.a);
                                o5a1Var.B = "";
                                String id = advertisingIdInfo.getId();
                                if (id != null) {
                                    o5a1Var.B = id;
                                }
                                o5a1Var.C = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e) {
                                y1a1 y1a1Var2 = gVar3.y;
                                g.g(y1a1Var2);
                                y1a1Var2.G.b(e, "Unable to get advertising id");
                                o5a1Var.B = "";
                            }
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                            pair = new Pair(o5a1Var.B, Boolean.valueOf(o5a1Var.C));
                        } else {
                            pair = new Pair(str, Boolean.valueOf(o5a1Var.C));
                        }
                    } else {
                        z = true;
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        g.g(y1a1Var);
                        y1a1Var.H.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        g.g(hva1Var);
                        hva1Var.Ig();
                        ConnectivityManager connectivityManager = (ConnectivityManager) gVar2.a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                                StringBuilder sb = new StringBuilder();
                                j5b1 j = gVar.j();
                                j.Gg();
                                j.Hg();
                                if (j.Ng()) {
                                    ieb1 ieb1Var = ((g) j.b).B;
                                    g.e(ieb1Var);
                                    break;
                                }
                                j jVar2 = gVar.F;
                                g.f(jVar2);
                                g gVar4 = (g) jVar2.b;
                                jVar2.Gg();
                                j5b1 j2 = gVar4.j();
                                g gVar5 = (g) j2.b;
                                j2.Gg();
                                j2.Hg();
                                zzgb zzgbVar = j2.x;
                                if (zzgbVar == null) {
                                    j2.Mg();
                                    y1a1 y1a1Var3 = gVar5.y;
                                    g.g(y1a1Var3);
                                    y1a1Var3.G.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        zzw = zzgbVar.zzw(j2.Wg(false));
                                        j2.Tg();
                                    } catch (RemoteException e2) {
                                        y1a1 y1a1Var4 = gVar5.y;
                                        g.g(y1a1Var4);
                                        y1a1Var4.z.b(e2, "Failed to get consents; remote exception");
                                    }
                                    bundle = zzw == null ? zzw.zza : null;
                                    if (bundle != null) {
                                        int i2 = gVar.U;
                                        gVar.U = i2 + 1;
                                        r12 = i2 < 10 ? z : false;
                                        g.g(y1a1Var);
                                        String str2 = i2 < 10 ? "Retrying." : "Skipping.";
                                        y1a1Var.G.b(Integer.valueOf(gVar.U), unr0.r(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        wia1 b = wia1.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(b.f());
                                        x791 c = x791.c(100, bundle);
                                        String str3 = c.d;
                                        sb.append("&dma=");
                                        sb.append(!Objects.equals(c.c, Boolean.FALSE) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str3)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str3);
                                        }
                                        int i3 = !Objects.equals(x791.d(bundle), Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i3);
                                        g.g(y1a1Var);
                                        y1a1Var.H.b(sb, "Consent query parameters to Bow");
                                        ieb1 ieb1Var2 = gVar.B;
                                        g.e(ieb1Var2);
                                        ((g) gVar.l().b).w.Lg();
                                        String str4 = (String) pair.first;
                                        long a = o5a1Var.O.a() - 1;
                                        String sb2 = sb.toString();
                                        g gVar6 = (g) ieb1Var2.b;
                                        try {
                                            cvw.i(str4);
                                            cvw.i(Mg);
                                            String str5 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + ieb1Var2.lh()) + "&rdid=" + str4 + "&bundleid=" + Mg + "&retry=" + a;
                                            if (Mg.equals(gVar6.w.Kg("debug.deferred.deeplink"))) {
                                                str5 = str5.concat("&ddl_test=1");
                                            }
                                            if (!sb2.isEmpty()) {
                                                if (sb2.charAt(0) != '&') {
                                                    str5 = str5.concat("&");
                                                }
                                                str5 = str5.concat(sb2);
                                            }
                                            url = new URL(str5);
                                        } catch (IllegalArgumentException | MalformedURLException e3) {
                                            y1a1 y1a1Var5 = gVar6.y;
                                            g.g(y1a1Var5);
                                            y1a1Var5.z.b(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            g.g(hva1Var);
                                            lm71 lm71Var = new lm71(25, gVar);
                                            hva1Var.Ig();
                                            aaa1 aaa1Var2 = gVar2.z;
                                            g.g(aaa1Var2);
                                            aaa1Var2.Sg(new h3k(hva1Var, Mg, url, (byte[]) null, (HashMap) null, lm71Var));
                                        }
                                    }
                                }
                                zzw = null;
                                if (zzw == null) {
                                }
                                if (bundle != null) {
                                }
                            } else {
                                g.g(y1a1Var);
                                y1a1Var.C.a("Network is not available for Deferred Deep Link request. Skipping");
                            }
                        }
                        activeNetworkInfo = null;
                        if (activeNetworkInfo == null) {
                        }
                        g.g(y1a1Var);
                        y1a1Var.C.a("Network is not available for Deferred Deep Link request. Skipping");
                    }
                } else {
                    g.g(y1a1Var);
                    y1a1Var.H.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (r12) {
                    jVar.N.b(2000L);
                    break;
                }
                break;
        }
    }
}
