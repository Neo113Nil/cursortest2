package i8;

import N3.C;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import u7.C5085k;
import v7.AbstractC5121l;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final z f38264a;

    /* renamed from: b, reason: collision with root package name */
    public final f f38265b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38266c;

    /* renamed from: d, reason: collision with root package name */
    public final C5085k f38267d;

    public k(z zVar, f fVar, List list, I7.a aVar) {
        this.f38264a = zVar;
        this.f38265b = fVar;
        this.f38266c = list;
        this.f38267d = C.O(new c6.l(1, aVar));
    }

    public final List a() {
        return (List) this.f38267d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f38264a == this.f38264a && kotlin.jvm.internal.h.a(kVar.f38265b, this.f38265b) && kotlin.jvm.internal.h.a(kVar.a(), a()) && kotlin.jvm.internal.h.a(kVar.f38266c, this.f38266c);
    }

    public final int hashCode() {
        return this.f38266c.hashCode() + ((a().hashCode() + ((this.f38265b.hashCode() + ((this.f38264a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a9 = a();
        ArrayList arrayList = new ArrayList(AbstractC5121l.w(a9, 10));
        for (Certificate certificate : a9) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.h.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f38264a);
        sb.append(" cipherSuite=");
        sb.append(this.f38265b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f38266c;
        ArrayList arrayList2 = new ArrayList(AbstractC5121l.w(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.h.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
