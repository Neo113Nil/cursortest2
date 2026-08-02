package ru.domesticroots.certificatetransparency.internal.verifier;

import defpackage.afz;
import defpackage.b64;
import defpackage.flp0;
import defpackage.g5b1;
import defpackage.gw00;
import defpackage.ic51;
import defpackage.j73;
import defpackage.jih;
import defpackage.kfz;
import defpackage.mo91;
import defpackage.o831;
import defpackage.p831;
import defpackage.qc60;
import defpackage.r831;
import defpackage.s4b1;
import defpackage.s831;
import defpackage.sfz;
import defpackage.tbs0;
import defpackage.tcc;
import defpackage.tgz;
import defpackage.tje;
import defpackage.ua91;
import defpackage.vgb1;
import defpackage.w511;
import defpackage.wc4;
import defpackage.wez;
import defpackage.yez;
import defpackage.yo40;
import defpackage.zez;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.domesticroots.certificatetransparency.chaincleaner.CertificateChainCleaner;

/* loaded from: classes9.dex */
public final class b extends a implements X509TrustManager {
    public final X509TrustManager e;
    public final boolean f;
    public final yo40 g;

    public b(X509TrustManager x509TrustManager, Set set, Set set2, ru.domesticroots.certificatetransparency.loglist.a aVar, ru.domesticroots.certificatetransparency.cache.a aVar2, yo40 yo40Var) {
        super(set, set2, x509TrustManager, aVar, aVar2);
        this.e = x509TrustManager;
        this.f = true;
        this.g = yo40Var;
        try {
            x509TrustManager.getClass().getDeclaredMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
        }
        try {
            this.e.getClass().getDeclaredMethod("isSameTrustConfiguration", String.class, String.class);
        } catch (NoSuchMethodException unused2) {
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.e.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        afz wezVar;
        ua91 o831Var;
        g5b1 g5b1Var;
        this.e.checkServerTrusted(x509CertificateArr, str);
        String obj = new ic51(((X509Certificate) j73.C(x509CertificateArr)).getSubjectX500Principal().getName()).j(wc4.d)[0].h().i().toString();
        List d0 = j73.d0(x509CertificateArr);
        ua91 ua91Var = p831.k;
        Set set = this.a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                b64.D(it.next());
                throw null;
            }
        }
        if (!d0.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner = (CertificateChainCleaner) this.b.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : d0) {
                if (obj2 instanceof X509Certificate) {
                    arrayList.add(obj2);
                }
            }
            List<X509Certificate> clean = certificateChainCleaner.clean(arrayList, obj);
            if (!clean.isEmpty()) {
                try {
                    wezVar = (afz) tje.Y(EmptyCoroutineContext.a, new CertificateTransparencyBase$hasValidSignedCertificateTimestamp$result$1(this, null));
                } catch (Exception e) {
                    wezVar = new wez(e);
                }
                if (wezVar instanceof zez) {
                    List<kfz> a = ((zez) wezVar).a();
                    int d = gw00.d(tcc.n(a, 10));
                    int i = 16;
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (kfz kfzVar : a) {
                        linkedHashMap.put(s4b1.d(kfzVar.a()), new sfz(kfzVar));
                    }
                    X509Certificate x509Certificate = clean.get(0);
                    if (vgb1.c(x509Certificate)) {
                        try {
                            List i2 = mo91.i(x509Certificate);
                            int d2 = gw00.d(tcc.n(i2, 10));
                            if (d2 >= 16) {
                                i = d2;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                            for (Object obj3 : i2) {
                                linkedHashMap2.put(s4b1.d(((tbs0) obj3).a().a()), obj3);
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap2.size()));
                            for (Object obj4 : linkedHashMap2.entrySet()) {
                                Object key = ((Map.Entry) obj4).getKey();
                                Map.Entry entry = (Map.Entry) obj4;
                                String str2 = (String) entry.getKey();
                                tbs0 tbs0Var = (tbs0) entry.getValue();
                                sfz sfzVar = (sfz) linkedHashMap.get(str2);
                                if (sfzVar == null || (g5b1Var = sfzVar.g(tbs0Var, clean)) == null) {
                                    g5b1Var = flp0.c;
                                }
                                linkedHashMap3.put(key, g5b1Var);
                            }
                            this.d.getClass();
                            o831Var = jih.a(x509Certificate, linkedHashMap3);
                        } catch (IOException e2) {
                            o831Var = new r831(e2);
                        }
                    } else {
                        o831Var = p831.l;
                    }
                } else if (wezVar instanceof yez) {
                    o831Var = new o831((yez) wezVar);
                } else {
                    if (wezVar != null) {
                        w511.b();
                        return;
                    }
                    o831Var = new o831(qc60.a);
                }
                ua91Var = o831Var;
            }
        }
        yo40 yo40Var = this.g;
        if (yo40Var != null) {
            tgz tgzVar = (tgz) yo40Var.a;
            ua91Var.toString();
            tgzVar.getClass();
        }
        if ((ua91Var instanceof s831) && this.f) {
            throw new CertificateException("Certificate transparency failed. " + ua91Var);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.e.getAcceptedIssuers();
    }
}
