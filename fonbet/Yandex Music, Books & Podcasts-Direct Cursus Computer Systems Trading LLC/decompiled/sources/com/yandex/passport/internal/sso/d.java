package com.yandex.passport.internal.sso;

import android.content.pm.Signature;
import com.yandex.passport.internal.entities.s;
import defpackage.t75;
import defpackage.uop;
import defpackage.v75;
import defpackage.xz0;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class d {
    public final String a;
    public final s b;
    public final s c;
    public final Object d;
    public final int e;
    public final X509Certificate f;

    public d(String str, s sVar, s sVar2, Map map, int i, X509Certificate x509Certificate) {
        str.getClass();
        this.a = str;
        this.b = sVar;
        this.c = sVar2;
        this.d = map;
        this.e = i;
        this.f = x509Certificate;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    public final boolean a(X509Certificate x509Certificate, Function1 function1) {
        CertPathValidatorResult certPathValidatorResult;
        byte[] bArr;
        x509Certificate.getClass();
        s sVar = this.b;
        s sVar2 = this.c;
        if (!sVar2.e(sVar)) {
            ?? r0 = this.d;
            String str = this.a;
            String str2 = (String) r0.get(str);
            if (!(str2 == null ? false : sVar2.a(str2))) {
                if (r0.isEmpty()) {
                    str.getClass();
                    String str3 = (String) s.h.get(str);
                    if (str3 == null ? false : sVar2.a(str3)) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isTrusted: true, reason: isSsoEnabledByFingerPrint()", 8);
                            return true;
                        }
                    }
                }
                X509Certificate x509Certificate2 = this.f;
                if (x509Certificate2 != null) {
                    String name = x509Certificate2.getSubjectX500Principal().getName("RFC2253");
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "checkCN: " + name, 8);
                    }
                    if (("CN=" + str).equals(name)) {
                        try {
                            CertPath generateCertPath = CertificateFactory.getInstance("X509").generateCertPath(t75.c(x509Certificate2));
                            PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) uop.b(new TrustAnchor(x509Certificate, null)));
                            pKIXParameters.setRevocationEnabled(false);
                            certPathValidatorResult = CertPathValidator.getInstance("PKIX").validate(generateCertPath, pKIXParameters);
                        } catch (GeneralSecurityException e) {
                            function1.invoke(e);
                            certPathValidatorResult = null;
                        }
                        if (certPathValidatorResult != null) {
                            PublicKey publicKey = x509Certificate2.getPublicKey();
                            publicKey.getClass();
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            byte[] digest = messageDigest.digest(publicKey.getEncoded());
                            List w = xz0.w(sVar2.b);
                            ArrayList arrayList = new ArrayList(v75.o(w, 10));
                            Iterator it = w.iterator();
                            while (it.hasNext()) {
                                byte[] byteArray = ((Signature) it.next()).toByteArray();
                                byteArray.getClass();
                                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
                                generateCertificate.getClass();
                                arrayList.add((X509Certificate) generateCertificate);
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    bArr = null;
                                    break;
                                }
                                X509Certificate x509Certificate3 = (X509Certificate) it2.next();
                                x509Certificate3.getClass();
                                bArr = messageDigest.digest(x509Certificate3.getPublicKey().getEncoded());
                                if (Arrays.equals(bArr, digest)) {
                                    break;
                                }
                            }
                            if (!(bArr != null)) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isTrusted=false, reason=checkPublicKey", 8);
                                }
                            }
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isTrusted=false, reason=verifyCertificate", 8);
                        }
                    } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isTrusted=false, reason=checkPackageName", 8);
                        return false;
                    }
                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isTrusted: false, reason: ssoCertificate=null", 8);
                    return false;
                }
                return false;
            }
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isTrusted: true, reason: isEnabledByConfig()", 8);
                return true;
            }
        }
        return true;
    }
}
