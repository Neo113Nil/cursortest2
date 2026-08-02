package ru.CryptoPro.ssl;

import defpackage.dy31;
import java.security.AccessController;
import ru.CryptoPro.JCP.tools.JarVersionHolder;

/* loaded from: classes4.dex */
public abstract class cl_39 extends java.security.Provider {
    public static final String ALGORITHM = "GostTLS";
    public static final String ALGORITHM_11 = "GostTLSv1.1";
    public static final String ALGORITHM_12 = "GostTLSv1.2";
    public static final String HD_FILE_NAME = "HDImageFile";
    public static final String KEYMANGER_ALG = "GostX509";
    public static final String PARAM_KEY_MANAGER_FACTORY_ALGORITHM = "ssl.KeyManagerFactory.algorithm";
    public static final String PARAM_SERVER_SOCKET_PROVIDER = "ssl.ServerSocketFactory.provider";
    public static final String PARAM_SOCKET_PROVIDER = "ssl.SocketFactory.provider";
    public static final String PARAM_TRUST_MANAGER_FACTORY_ALGORITHM = "ssl.TrustManagerFactory.algorithm";
    public static final String PROVIDER_NAME = "JTLS";
    public static final String SERVER_SOCKET_FACTORY = "ru.CryptoPro.ssl.SSLServerSocketFactoryImpl";
    public static final String SOCKET_FACTORY = "ru.CryptoPro.ssl.SSLSocketFactoryImpl";
    public static final String TRUSTMANGER_ALG = "GostX509";

    public cl_39() {
        super("JTLS", getJarVersion().getProductVersion().doubleValue(), "Java TLS provider(GostX509 key/trust factories, GostTLS, GostTLSv1.1, GostTLSv1.2, TLSv1, TLSv1.1, TLSv1.2)");
        if (getClass() == Provider.class) {
            AccessController.doPrivileged(new cl_40(this));
        } else {
            dy31.p(getClass(), "Illegal subclass: ");
            throw null;
        }
    }

    public static JarVersionHolder getJarVersion() {
        return cl_41.a;
    }

    public final void finalize() {
        super.finalize();
    }
}
