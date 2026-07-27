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
    private final ai f15716a;

    /* renamed from: b, reason: collision with root package name */
    private final i f15717b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f15718c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Certificate> f15719d;

    private t(ai aiVar, i iVar, List<Certificate> list, List<Certificate> list2) {
        this.f15716a = aiVar;
        this.f15717b = iVar;
        this.f15718c = list;
        this.f15719d = list2;
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
        if (this.f15718c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f15718c.get(0)).getSubjectX500Principal();
    }

    private Principal f() {
        if (this.f15719d.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f15719d.get(0)).getSubjectX500Principal();
    }

    public final i b() {
        return this.f15717b;
    }

    public final List<Certificate> c() {
        return this.f15718c;
    }

    public final List<Certificate> d() {
        return this.f15719d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f15716a.equals(tVar.f15716a) && this.f15717b.equals(tVar.f15717b) && this.f15718c.equals(tVar.f15718c) && this.f15719d.equals(tVar.f15719d);
    }

    public final int hashCode() {
        return this.f15719d.hashCode() + ((this.f15718c.hashCode() + ((this.f15717b.hashCode() + ((this.f15716a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.f15716a + " cipherSuite=" + this.f15717b + " peerCertificates=" + a(this.f15718c) + " localCertificates=" + a(this.f15719d) + '}';
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
        return this.f15716a;
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
