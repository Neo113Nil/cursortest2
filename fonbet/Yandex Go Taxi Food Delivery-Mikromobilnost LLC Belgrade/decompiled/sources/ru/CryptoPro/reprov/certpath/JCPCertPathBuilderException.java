package ru.CryptoPro.reprov.certpath;

import java.security.cert.CertPathBuilderException;

/* loaded from: classes4.dex */
public class JCPCertPathBuilderException extends CertPathBuilderException {
    public final transient AdjacencyList a;

    public JCPCertPathBuilderException(String str, Throwable th, AdjacencyList adjacencyList) {
        this(str, th);
        this.a = adjacencyList;
    }

    public AdjacencyList getAdjacencyList() {
        return this.a;
    }

    public JCPCertPathBuilderException(String str) {
        super(str);
    }

    public JCPCertPathBuilderException(String str, Throwable th) {
        super(str, th);
    }

    public JCPCertPathBuilderException() {
    }

    public JCPCertPathBuilderException(String str, AdjacencyList adjacencyList) {
        this(str);
        this.a = adjacencyList;
    }

    public JCPCertPathBuilderException(Throwable th) {
        super(th);
    }
}
