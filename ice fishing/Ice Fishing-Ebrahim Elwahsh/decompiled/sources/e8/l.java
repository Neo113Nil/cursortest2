package e8;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import q7.C4942k;
import r7.AbstractC4981l;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final A f37423a;

    /* renamed from: b, reason: collision with root package name */
    public final f f37424b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37425c;

    /* renamed from: d, reason: collision with root package name */
    public final C4942k f37426d;

    public l(A a9, f fVar, List list, E7.a aVar) {
        this.f37423a = a9;
        this.f37424b = fVar;
        this.f37425c = list;
        this.f37426d = com.bumptech.glide.e.q(new Y5.l(1, aVar));
    }

    public final List a() {
        return (List) this.f37426d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f37423a == this.f37423a && kotlin.jvm.internal.h.a(lVar.f37424b, this.f37424b) && kotlin.jvm.internal.h.a(lVar.a(), a()) && kotlin.jvm.internal.h.a(lVar.f37425c, this.f37425c);
    }

    public final int hashCode() {
        return this.f37425c.hashCode() + ((a().hashCode() + ((this.f37424b.hashCode() + ((this.f37423a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a9 = a();
        ArrayList arrayList = new ArrayList(AbstractC4981l.E(a9, 10));
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
        sb.append(this.f37423a);
        sb.append(" cipherSuite=");
        sb.append(this.f37424b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f37425c;
        ArrayList arrayList2 = new ArrayList(AbstractC4981l.E(list, 10));
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
