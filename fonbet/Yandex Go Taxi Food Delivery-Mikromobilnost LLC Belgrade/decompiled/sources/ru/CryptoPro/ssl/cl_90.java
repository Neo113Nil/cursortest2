package ru.CryptoPro.ssl;

import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import ru.CryptoPro.ssl.util.DisabledAlgorithmConstraints;

/* loaded from: classes4.dex */
final class cl_90 implements AlgorithmConstraints {
    public static final DisabledAlgorithmConstraints d = new DisabledAlgorithmConstraints("jdk.tls.disabledAlgorithms", new cl_92(false));
    public static final DisabledAlgorithmConstraints e = new DisabledAlgorithmConstraints("jdk.certpath.disabledAlgorithms", new cl_92(true));
    public static final AlgorithmConstraints f = new cl_90(null);
    public static final AlgorithmConstraints g = new cl_90((SSLSocket) null, false);
    public final AlgorithmConstraints a;
    public final AlgorithmConstraints b;
    public final boolean c;

    public cl_90(SSLEngine sSLEngine, String[] strArr, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLEngine != null) {
            this.a = sSLEngine.getSSLParameters().getAlgorithmConstraints();
            this.b = new cl_91(strArr);
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    @Override // java.security.AlgorithmConstraints
    public boolean permits(Set set, String str, AlgorithmParameters algorithmParameters) {
        AlgorithmConstraints algorithmConstraints;
        AlgorithmConstraints algorithmConstraints2 = this.b;
        boolean permits = algorithmConstraints2 != null ? algorithmConstraints2.permits(set, str, algorithmParameters) : true;
        if (permits && (algorithmConstraints = this.a) != null) {
            permits = algorithmConstraints.permits(set, str, algorithmParameters);
        }
        if (permits) {
            permits = d.permits(set, str, algorithmParameters);
        }
        return (permits && this.c) ? e.permits(set, str, algorithmParameters) : permits;
    }

    public cl_90(SSLEngine sSLEngine, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLEngine != null) {
            this.a = sSLEngine.getSSLParameters().getAlgorithmConstraints();
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    public cl_90(AlgorithmConstraints algorithmConstraints) {
        this.b = null;
        this.c = true;
        this.a = algorithmConstraints;
    }

    public cl_90(SSLSocket sSLSocket, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLSocket != null) {
            this.a = sSLSocket.getSSLParameters().getAlgorithmConstraints();
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    public cl_90(SSLSocket sSLSocket, String[] strArr, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLSocket != null) {
            this.a = sSLSocket.getSSLParameters().getAlgorithmConstraints();
            this.b = new cl_91(strArr);
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    @Override // java.security.AlgorithmConstraints
    public boolean permits(Set set, String str, Key key, AlgorithmParameters algorithmParameters) {
        AlgorithmConstraints algorithmConstraints;
        AlgorithmConstraints algorithmConstraints2 = this.b;
        boolean permits = algorithmConstraints2 != null ? algorithmConstraints2.permits(set, str, key, algorithmParameters) : true;
        if (permits && (algorithmConstraints = this.a) != null) {
            permits = algorithmConstraints.permits(set, str, key, algorithmParameters);
        }
        if (permits) {
            permits = d.permits(set, str, key, algorithmParameters);
        }
        return (permits && this.c) ? e.permits(set, str, key, algorithmParameters) : permits;
    }

    @Override // java.security.AlgorithmConstraints
    public boolean permits(Set set, Key key) {
        AlgorithmConstraints algorithmConstraints;
        AlgorithmConstraints algorithmConstraints2 = this.b;
        boolean permits = algorithmConstraints2 != null ? algorithmConstraints2.permits(set, key) : true;
        if (permits && (algorithmConstraints = this.a) != null) {
            permits = algorithmConstraints.permits(set, key);
        }
        if (permits) {
            permits = d.permits(set, key);
        }
        return (permits && this.c) ? e.permits(set, key) : permits;
    }
}
