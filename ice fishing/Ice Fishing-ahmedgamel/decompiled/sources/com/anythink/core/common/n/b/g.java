package com.anythink.core.common.n.b;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f16392a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f16393b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.j.c f16394c;

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final String f16396e = "*.";

        /* renamed from: a, reason: collision with root package name */
        final String f16397a;

        /* renamed from: b, reason: collision with root package name */
        final String f16398b;

        /* renamed from: c, reason: collision with root package name */
        final String f16399c;

        /* renamed from: d, reason: collision with root package name */
        final com.anythink.core.common.n.c.f f16400d;

        public b(String str, String str2) {
            String str3;
            this.f16397a = str;
            if (str.startsWith(f16396e)) {
                str3 = v.d("http://" + str.substring(2)).f16521m;
            } else {
                str3 = v.d("http://".concat(str)).f16521m;
            }
            this.f16398b = str3;
            if (str2.startsWith("sha1/")) {
                this.f16399c = "sha1/";
                this.f16400d = com.anythink.core.common.n.c.f.b(str2.substring(5));
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                }
                this.f16399c = "sha256/";
                this.f16400d = com.anythink.core.common.n.c.f.b(str2.substring(7));
            }
            if (this.f16400d == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(str2));
            }
        }

        private boolean a(String str) {
            if (!this.f16397a.startsWith(f16396e)) {
                return str.equals(this.f16398b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 != this.f16398b.length()) {
                return false;
            }
            String str2 = this.f16398b;
            return str.regionMatches(false, indexOf + 1, str2, 0, str2.length());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16397a.equals(bVar.f16397a) && this.f16399c.equals(bVar.f16399c) && this.f16400d.equals(bVar.f16400d);
        }

        public final int hashCode() {
            return this.f16400d.hashCode() + AbstractC5128c.a(AbstractC5128c.a(527, 31, this.f16397a), 31, this.f16399c);
        }

        public final String toString() {
            return this.f16399c + this.f16400d.b();
        }
    }

    public g(Set<b> set, com.anythink.core.common.n.b.a.j.c cVar) {
        this.f16393b = set;
        this.f16394c = cVar;
    }

    private void a(String str, Certificate... certificateArr) {
        a(str, Arrays.asList(certificateArr));
    }

    private static com.anythink.core.common.n.c.f b(X509Certificate x509Certificate) {
        return com.anythink.core.common.n.c.f.a(x509Certificate.getPublicKey().getEncoded()).e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Objects.equals(this.f16394c, gVar.f16394c) && this.f16393b.equals(gVar.f16393b);
    }

    public final int hashCode() {
        return this.f16393b.hashCode() + (Objects.hashCode(this.f16394c) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r7.regionMatches(false, r3 + 1, r10, 0, r10.length()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<b> a(String str) {
        String str2;
        boolean equals;
        List<b> list = Collections.EMPTY_LIST;
        for (b bVar : this.f16393b) {
            if (bVar.f16397a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                equals = true;
                if ((str.length() - indexOf) - 1 == bVar.f16398b.length()) {
                    String str3 = bVar.f16398b;
                    str2 = str;
                } else {
                    str2 = str;
                }
                equals = false;
            } else {
                str2 = str;
                equals = str2.equals(bVar.f16398b);
            }
            if (equals) {
                if (list.isEmpty()) {
                    list = new ArrayList<>();
                }
                list.add(bVar);
            }
            str = str2;
        }
        return list;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f16395a = new ArrayList();

        private a a(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String str2 : strArr) {
                this.f16395a.add(new b(str, str2));
            }
            return this;
        }

        public final g a() {
            return new g(new LinkedHashSet(this.f16395a), null);
        }
    }

    public final g a(com.anythink.core.common.n.b.a.j.c cVar) {
        return Objects.equals(this.f16394c, cVar) ? this : new g(this.f16393b, cVar);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + b((X509Certificate) certificate).b();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static com.anythink.core.common.n.c.f a(X509Certificate x509Certificate) {
        return com.anythink.core.common.n.c.f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    public final void a(String str, List<Certificate> list) {
        int i;
        List list2 = Collections.EMPTY_LIST;
        Iterator<b> it = this.f16393b.iterator();
        while (true) {
            r3 = false;
            boolean equals = false;
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.f16397a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == next.f16398b.length()) {
                    String str2 = next.f16398b;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        equals = true;
                    }
                }
            } else {
                equals = str.equals(next.f16398b);
            }
            if (equals) {
                if (list2.isEmpty()) {
                    list2 = new ArrayList();
                }
                list2.add(next);
            }
        }
        if (list2.isEmpty()) {
            return;
        }
        com.anythink.core.common.n.b.a.j.c cVar = this.f16394c;
        List<Certificate> a9 = cVar != null ? cVar.a(list, str) : list;
        int size = a9.size();
        for (int i4 = 0; i4 < size; i4++) {
            X509Certificate x509Certificate = (X509Certificate) a9.get(i4);
            int size2 = list2.size();
            com.anythink.core.common.n.c.f fVar = null;
            com.anythink.core.common.n.c.f fVar2 = null;
            for (int i6 = 0; i6 < size2; i6++) {
                b bVar = (b) list2.get(i6);
                if (bVar.f16399c.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = b(x509Certificate);
                    }
                    if (bVar.f16400d.equals(fVar)) {
                        return;
                    }
                } else if (bVar.f16399c.equals("sha1/")) {
                    if (fVar2 == null) {
                        fVar2 = com.anythink.core.common.n.c.f.a(x509Certificate.getPublicKey().getEncoded()).d();
                    }
                    if (bVar.f16400d.equals(fVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + bVar.f16399c);
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = a9.size();
        for (int i9 = 0; i9 < size3; i9++) {
            X509Certificate x509Certificate2 = (X509Certificate) a9.get(i9);
            sb.append("\n    ");
            sb.append(a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = list2.size();
        for (i = 0; i < size4; i++) {
            b bVar2 = (b) list2.get(i);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
