package ru.CryptoPro.sspiSSL;

import defpackage.br61;
import defpackage.pt61;
import java.security.AccessController;
import java.security.Provider;
import ru.CryptoPro.JCP.tools.JarVersionHolder;

/* loaded from: classes4.dex */
public class SSPISSL extends Provider {
    public static final String ALGORITHM = "GostTLS";
    public static final String ALGORITHM_11 = "GostTLSv1.1";
    public static final String ALGORITHM_12 = "GostTLSv1.2";
    public static final String ALGORITHM_13 = "GostTLSv1.3";
    public static final String HD_FILE_NAME = "HDImageFile";
    public static final String KEYMANGER_ALG = "GostX509";
    public static final String PARAM_KEY_MANAGER_FACTORY_ALGORITHM = "ssl.KeyManagerFactory.algorithm";
    public static final String PARAM_SERVER_SOCKET_PROVIDER = "ssl.ServerSocketFactory.provider";
    public static final String PARAM_SOCKET_PROVIDER = "ssl.SocketFactory.provider";
    public static final String PARAM_TRUST_MANAGER_FACTORY_ALGORITHM = "ssl.TrustManagerFactory.algorithm";
    public static final String PROVIDER_NAME = "JTLS";
    public static final String SERVER_SOCKET_FACTORY = "ru.CryptoPro.sspiSSL.SSLServerSocketFactoryImpl";
    public static final String SOCKET_FACTORY = "ru.CryptoPro.sspiSSL.SSLSocketFactoryImpl";
    public static final String TRUSTMANGER_ALG = "GostX509";

    public SSPISSL() {
        super("JTLS", getJarVersion().getProductVersion().doubleValue(), "Java TLS SSPI provider(GostX509 key/trust factories, GostTLS, GostTLSv1.1, GostTLSv1.2, GostTLSv1.3, TLSv1, TLSv1.1, TLSv1.2, TLSv1.3)");
        AccessController.doPrivileged(new br61(2, this));
    }

    public static JarVersionHolder getJarVersion() {
        return pt61.w;
    }

    public final void finalize() {
        super.finalize();
    }
}
