package ru.CryptoPro.ssl;

import defpackage.sq61;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
class cl_40 implements PrivilegedAction {
    public final /* synthetic */ cl_39 a;

    public cl_40(cl_39 cl_39Var) {
        this.a = cl_39Var;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        String str = cl_39.PARAM_KEY_MANAGER_FACTORY_ALGORITHM;
        cl_39 cl_39Var = this.a;
        cl_39Var.put("KeyManagerFactory.GostX509", "ru.CryptoPro.ssl.KeyManagerFactoryImpl$GostX509");
        cl_39Var.put("TrustManagerFactory.GostX509", "ru.CryptoPro.ssl.TrustManagerFactoryImpl$PKIXFactory");
        cl_39Var.put("Alg.Alias.TrustManagerFactory.GostPKIX", "GostX509");
        cl_39Var.put("Alg.Alias.TrustManagerFactory.X509", "GostX509");
        cl_39Var.put("Alg.Alias.TrustManagerFactory.X.509", "GostX509");
        cl_39Var.put("SSLContext.TLS", "ru.CryptoPro.ssl.SSLContextImpl$TLSContext");
        cl_39Var.put("SSLContext.TLSv1", "ru.CryptoPro.ssl.SSLContextImpl$TLS10Context");
        cl_39Var.put("SSLContext.TLSv1.1", "ru.CryptoPro.ssl.SSLContextImpl$TLS11Context");
        cl_39Var.put("SSLContext.TLSv1.2", "ru.CryptoPro.ssl.SSLContextImpl$TLS12Context");
        cl_39Var.put("SSLContext.Default", "ru.CryptoPro.ssl.SSLContextImpl$DefaultSSLContext");
        cl_39Var.put("SSLContext.GostTLS", "ru.CryptoPro.ssl.SSLContextImpl$TLS10Context");
        cl_39Var.put("SSLContext.GostTLSv1.1", "ru.CryptoPro.ssl.SSLContextImpl$TLS11Context");
        cl_39Var.put("SSLContext.GostTLSv1.2", "ru.CryptoPro.ssl.SSLContextImpl$TLS12Context");
        cl_39Var.put("Alg.Alias.SSLContext.TLS", "TLSv1");
        cl_39Var.put("Alg.Alias.SSLContext.GostTLS", "GostTLS");
        cl_39Var.put("Alg.Alias.SSLContext.GostTLSv1.1", "GostTLSv1.1");
        cl_39Var.put("Alg.Alias.SSLContext.GostTLSv1.2", "GostTLSv1.2");
        cl_39Var.put("KeyStore.HDImageFile", sq61.class.getName());
        return null;
    }
}
