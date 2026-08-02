package defpackage;

import android.util.Base64;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
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
import java.util.Vector;
import javax.net.ssl.X509TrustManager;
import kotlin.coroutines.g;
import ru.domesticroots.certificatetransparency.chaincleaner.CertificateChainCleaner;

/* loaded from: classes5.dex */
public final class la4 implements X509TrustManager {
    public final Set a;
    public final jyr b;
    public final cb7 c;
    public final ofc d;
    public final X509TrustManager e;
    public final boolean f;
    public final sml g;

    public la4(X509TrustManager x509TrustManager, Set set, Set set2, j6e j6eVar, yfx yfxVar, sml smlVar) {
        set.getClass();
        set2.getClass();
        this.a = set2;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        this.b = btf.b(new ia4(x509TrustManager, this));
        this.c = new qne((Object) new le3(new ya7(new h4b(), yfxVar).S(new qec(10, j6eVar)), new ybg(5, new j6e(24))), false);
        this.d = new ofc(20);
        this.e = x509TrustManager;
        this.f = true;
        this.g = smlVar;
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
        x509CertificateArr.getClass();
        str.getClass();
        this.e.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        qrg lrgVar;
        Object f0uVar;
        x509CertificateArr.getClass();
        str.getClass();
        this.e.checkServerTrusted(x509CertificateArr, str);
        String name = ((X509Certificate) xz0.y(x509CertificateArr)).getSubjectX500Principal().getName();
        zh2 zh2Var = q6w.f;
        zh2Var.getClass();
        r6w r6wVar = new r6w(name, ',');
        nur nurVar = new nur(9);
        nurVar.c = new Vector();
        nurVar.b = zh2Var;
        while (true) {
            if (!r6wVar.a()) {
                Vector vector = (Vector) nurVar.c;
                int size = vector.size();
                nen[] nenVarArr = new nen[size];
                for (int i = 0; i != size; i++) {
                    nenVarArr[i] = (nen) vector.elementAt(i);
                }
                q6w q6wVar = new q6w(zh2Var, (nen[]) new q6w((zh2) nurVar.b, nenVarArr).d.clone());
                q6wVar.c = zh2Var;
                n0 n0Var = zh2.t;
                nen[] nenVarArr2 = q6wVar.d;
                int length = nenVarArr2.length;
                nen[] nenVarArr3 = new nen[length];
                int i2 = 0;
                for (int i3 = 0; i3 != nenVarArr2.length; i3++) {
                    nen nenVar = nenVarArr2[i3];
                    w0 w0Var = nenVar.a;
                    int length2 = w0Var.a.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            break;
                        }
                        if (vu1.t(w0Var.a[i4]).a.x(n0Var)) {
                            nenVarArr3[i2] = nenVar;
                            i2++;
                            break;
                        }
                        i4++;
                    }
                }
                if (i2 < length) {
                    nen[] nenVarArr4 = new nen[i2];
                    System.arraycopy(nenVarArr3, 0, nenVarArr4, 0, i2);
                    nenVarArr3 = nenVarArr4;
                }
                String obj = nenVarArr3[0].t().b.toString();
                List X = xz0.X(x509CertificateArr);
                Object obj2 = g0u.b;
                obj.getClass();
                X.getClass();
                Set set = this.a;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        throw hrg.j(it);
                    }
                }
                if (!X.isEmpty()) {
                    CertificateChainCleaner certificateChainCleaner = (CertificateChainCleaner) this.b.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : X) {
                        if (obj3 instanceof X509Certificate) {
                            arrayList.add(obj3);
                        }
                    }
                    List<X509Certificate> clean = certificateChainCleaner.clean(arrayList, obj);
                    if (!clean.isEmpty()) {
                        try {
                            lrgVar = (qrg) x97.D(g.a, new ja4(this, null, 0));
                        } catch (Exception e) {
                            lrgVar = new lrg(e);
                        }
                        if (lrgVar instanceof prg) {
                            ArrayList<urg> arrayList2 = ((prg) lrgVar).a;
                            int a = tah.a(v75.o(arrayList2, 10));
                            int i5 = 16;
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            for (urg urgVar : arrayList2) {
                                String encodeToString = Base64.encodeToString(urgVar.c, 0);
                                encodeToString.getClass();
                                linkedHashMap.put(encodeToString, new csg(urgVar));
                            }
                            X509Certificate x509Certificate = clean.get(0);
                            x509Certificate.getClass();
                            Set<String> nonCriticalExtensionOIDs = x509Certificate.getNonCriticalExtensionOIDs();
                            if (nonCriticalExtensionOIDs == null || !nonCriticalExtensionOIDs.contains("1.3.6.1.4.1.11129.2.4.2")) {
                                f0uVar = g0u.c;
                            } else {
                                try {
                                    List I = a0g.I(x509Certificate);
                                    int a2 = tah.a(v75.o(I, 10));
                                    if (a2 >= 16) {
                                        i5 = a2;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
                                    for (Object obj4 : I) {
                                        String encodeToString2 = Base64.encodeToString(((yfq) obj4).b.a, 0);
                                        encodeToString2.getClass();
                                        linkedHashMap2.put(encodeToString2, obj4);
                                    }
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(linkedHashMap2.size()));
                                    for (Object obj5 : linkedHashMap2.entrySet()) {
                                        Object key = ((Map.Entry) obj5).getKey();
                                        Map.Entry entry = (Map.Entry) obj5;
                                        String str2 = (String) entry.getKey();
                                        yfq yfqVar = (yfq) entry.getValue();
                                        csg csgVar = (csg) linkedHashMap.get(str2);
                                        linkedHashMap3.put(key, csgVar != null ? csgVar.g(yfqVar, clean) : nyo.e);
                                    }
                                    this.d.getClass();
                                    f0uVar = ofc.F(x509Certificate, linkedHashMap3);
                                } catch (IOException e2) {
                                    f0uVar = new i0u(e2);
                                }
                            }
                        } else if (lrgVar instanceof org) {
                            f0uVar = new f0u((org) lrgVar);
                        } else {
                            if (lrgVar != null) {
                                b6e.s();
                                return;
                            }
                            f0uVar = new f0u(krg.c);
                        }
                        obj2 = f0uVar;
                    }
                }
                sml smlVar = this.g;
                if (smlVar != null) {
                    osg osgVar = (osg) smlVar.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj);
                    sb.append(StringUtil.SPACE);
                    sb.append(obj2);
                    osgVar.getClass();
                }
                if ((obj2 instanceof j0u) && this.f) {
                    throw new CertificateException("Certificate transparency failed. " + obj2);
                }
                return;
            }
            String b = r6wVar.b();
            if (b.indexOf(43) > 0) {
                r6w r6wVar2 = new r6w(b, '+');
                r6w r6wVar3 = new r6w(r6wVar2.b(), '=');
                String b2 = r6wVar3.b();
                if (!r6wVar3.a()) {
                    xq0.x("badly formatted directory string");
                    return;
                }
                String b3 = r6wVar3.b();
                n0 h0 = zh2Var.h0(b2.trim());
                if (r6wVar2.a()) {
                    Vector vector2 = new Vector();
                    Vector vector3 = new Vector();
                    vector2.addElement(h0);
                    vector3.addElement(xp3.l0(b3));
                    while (r6wVar2.a()) {
                        r6w r6wVar4 = new r6w(r6wVar2.b(), '=');
                        String b4 = r6wVar4.b();
                        if (!r6wVar4.a()) {
                            xq0.x("badly formatted directory string");
                            return;
                        } else {
                            String b5 = r6wVar4.b();
                            vector2.addElement(zh2Var.h0(b4.trim()));
                            vector3.addElement(xp3.l0(b5));
                        }
                    }
                    int size2 = vector2.size();
                    n0[] n0VarArr = new n0[size2];
                    for (int i6 = 0; i6 != size2; i6++) {
                        n0VarArr[i6] = (n0) vector2.elementAt(i6);
                    }
                    int size3 = vector3.size();
                    String[] strArr = new String[size3];
                    for (int i7 = 0; i7 != size3; i7++) {
                        strArr[i7] = (String) vector3.elementAt(i7);
                    }
                    d0[] d0VarArr = new d0[size3];
                    for (int i8 = 0; i8 != size3; i8++) {
                        zh2 zh2Var2 = (zh2) nurVar.b;
                        n0 n0Var2 = n0VarArr[i8];
                        String str3 = strArr[i8];
                        zh2Var2.getClass();
                        d0VarArr[i8] = jf0.Y(n0Var2, str3);
                    }
                    vu1[] vu1VarArr = new vu1[size2];
                    for (int i9 = 0; i9 != size2; i9++) {
                        n0 n0Var3 = n0VarArr[i9];
                        d0 d0Var = d0VarArr[i9];
                        vu1 vu1Var = new vu1();
                        vu1Var.a = n0Var3;
                        vu1Var.b = d0Var;
                        vu1VarArr[i9] = vu1Var;
                    }
                    Vector vector4 = (Vector) nurVar.c;
                    nen nenVar2 = new nen();
                    e07 e07Var = new e07(vu1VarArr);
                    e07Var.d = -1;
                    nenVar2.a = e07Var;
                    vector4.addElement(nenVar2);
                } else {
                    nurVar.a(h0, xp3.l0(b3));
                }
            } else {
                r6w r6wVar5 = new r6w(b, '=');
                String b6 = r6wVar5.b();
                if (!r6wVar5.a()) {
                    xq0.x("badly formatted directory string");
                    return;
                }
                nurVar.a(zh2Var.h0(b6.trim()), xp3.l0(r6wVar5.b()));
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.e.getAcceptedIssuers();
        acceptedIssuers.getClass();
        return acceptedIssuers;
    }
}
