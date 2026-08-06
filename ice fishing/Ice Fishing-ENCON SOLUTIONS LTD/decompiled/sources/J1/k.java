package J1;

import F.U;
import h1.C0237g;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final B f889a;

    /* renamed from: b, reason: collision with root package name */
    public final g f890b;

    /* renamed from: c, reason: collision with root package name */
    public final List f891c;

    /* renamed from: d, reason: collision with root package name */
    public final C0237g f892d;

    public k(B b2, g gVar, List list, InterfaceC1046a interfaceC1046a) {
        this.f889a = b2;
        this.f890b = gVar;
        this.f891c = list;
        this.f892d = R1.d.y(new U(interfaceC1046a));
    }

    public final List a() {
        return (List) this.f892d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f889a == this.f889a && kotlin.jvm.internal.i.a(kVar.f890b, this.f890b) && kotlin.jvm.internal.i.a(kVar.a(), a()) && kotlin.jvm.internal.i.a(kVar.f891c, this.f891c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f891c.hashCode() + ((a().hashCode() + ((this.f890b.hashCode() + ((this.f889a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(i1.k.E(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.i.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f889a);
        sb.append(" cipherSuite=");
        sb.append(this.f890b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f891c;
        ArrayList arrayList2 = new ArrayList(i1.k.E(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.i.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
