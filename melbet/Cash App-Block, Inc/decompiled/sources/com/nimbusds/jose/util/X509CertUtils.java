package com.nimbusds.jose.util;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;

/* loaded from: classes9.dex */
public abstract class X509CertUtils {
    public static Object castToSuppLibClass(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(X509CertUtils.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static X509Certificate parseWithException(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
    }

    public static boolean unwrapValueAsBoolean(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof Number ? ((Number) obj).doubleValue() != 0.0d : obj instanceof String ? (((CharSequence) obj).length() <= 0 || obj.equals("[]") || obj.equals("null")) ? false : true : obj instanceof Collection ? !((Collection) obj).isEmpty() : ((obj instanceof Object[]) && ((Object[]) obj).length == 0) ? false : true;
    }
}
