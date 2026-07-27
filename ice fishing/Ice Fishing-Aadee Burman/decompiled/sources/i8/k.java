package i8;

import a.AbstractC0422a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import u7.C5093k;
import v7.AbstractC5131l;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final z f38145a;

    /* renamed from: b, reason: collision with root package name */
    public final f f38146b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38147c;

    /* renamed from: d, reason: collision with root package name */
    public final C5093k f38148d;

    public k(z zVar, f fVar, List list, I7.a aVar) {
        this.f38145a = zVar;
        this.f38146b = fVar;
        this.f38147c = list;
        this.f38148d = AbstractC0422a.q(new c6.l(1, aVar));
    }

    public final List a() {
        return (List) this.f38148d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f38145a == this.f38145a && kotlin.jvm.internal.h.a(kVar.f38146b, this.f38146b) && kotlin.jvm.internal.h.a(kVar.a(), a()) && kotlin.jvm.internal.h.a(kVar.f38147c, this.f38147c);
    }

    public final int hashCode() {
        return this.f38147c.hashCode() + ((a().hashCode() + ((this.f38146b.hashCode() + ((this.f38145a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a9 = a();
        ArrayList arrayList = new ArrayList(AbstractC5131l.y(a9, 10));
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
        sb.append(this.f38145a);
        sb.append(" cipherSuite=");
        sb.append(this.f38146b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f38147c;
        ArrayList arrayList2 = new ArrayList(AbstractC5131l.y(list, 10));
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
