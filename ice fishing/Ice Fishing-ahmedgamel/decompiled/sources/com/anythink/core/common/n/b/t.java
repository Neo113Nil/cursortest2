package com.anythink.core.common.n.b;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final ai f16503a;

    /* renamed from: b, reason: collision with root package name */
    private final i f16504b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f16505c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Certificate> f16506d;

    private t(ai aiVar, i iVar, List<Certificate> list, List<Certificate> list2) {
        this.f16503a = aiVar;
        this.f16504b = iVar;
        this.f16505c = list;
        this.f16506d = list2;
    }

    public static t a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        i a9 = i.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        ai a10 = ai.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List a11 = certificateArr != null ? com.anythink.core.common.n.b.a.c.a(certificateArr) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new t(a10, a9, a11, localCertificates != null ? com.anythink.core.common.n.b.a.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    private Principal e() {
        if (this.f16505c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f16505c.get(0)).getSubjectX500Principal();
    }

    private Principal f() {
        if (this.f16506d.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f16506d.get(0)).getSubjectX500Principal();
    }

    public final i b() {
        return this.f16504b;
    }

    public final List<Certificate> c() {
        return this.f16505c;
    }

    public final List<Certificate> d() {
        return this.f16506d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f16503a.equals(tVar.f16503a) && this.f16504b.equals(tVar.f16504b) && this.f16505c.equals(tVar.f16505c) && this.f16506d.equals(tVar.f16506d);
    }

    public final int hashCode() {
        return this.f16506d.hashCode() + ((this.f16505c.hashCode() + ((this.f16504b.hashCode() + ((this.f16503a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.f16503a + " cipherSuite=" + this.f16504b + " peerCertificates=" + a(this.f16505c) + " localCertificates=" + a(this.f16506d) + '}';
    }

    public static t a(ai aiVar, i iVar, List<Certificate> list, List<Certificate> list2) {
        if (aiVar == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (iVar != null) {
            return new t(aiVar, iVar, com.anythink.core.common.n.b.a.c.a(list), com.anythink.core.common.n.b.a.c.a(list2));
        }
        throw new NullPointerException("cipherSuite == null");
    }

    public final ai a() {
        return this.f16503a;
    }

    private static List<String> a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }
}
