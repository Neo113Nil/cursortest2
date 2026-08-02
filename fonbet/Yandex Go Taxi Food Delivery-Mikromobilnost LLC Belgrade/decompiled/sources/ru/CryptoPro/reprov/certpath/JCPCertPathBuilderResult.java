package ru.CryptoPro.reprov.certpath;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;

/* loaded from: classes4.dex */
public class JCPCertPathBuilderResult extends PKIXCertPathBuilderResult {
    public final AdjacencyList a;

    public JCPCertPathBuilderResult(CertPath certPath, TrustAnchor trustAnchor, PolicyNode policyNode, PublicKey publicKey, AdjacencyList adjacencyList) {
        super(certPath, trustAnchor, policyNode, publicKey);
        this.a = adjacencyList;
    }

    public AdjacencyList getAdjacencyList() {
        return this.a;
    }
}
