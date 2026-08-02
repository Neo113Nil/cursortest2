package ru.CryptoPro.reprov.certpath;

import defpackage.oyr;
import defpackage.qv10;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
class BuildStep {
    public static final int BACK = 2;
    public static final int FAIL = 4;
    public static final int FOLLOW = 3;
    public static final int POSSIBLE = 1;
    public static final int SUCCEED = 5;
    public final Vertex a;
    public final X509Certificate b;
    public final Throwable c;
    public final int d;

    public BuildStep(Vertex vertex, int i) {
        this.a = vertex;
        if (vertex != null) {
            this.b = (X509Certificate) vertex.getCertificate();
            this.c = vertex.getThrowable();
        }
        this.d = i;
    }

    public String fullToString() {
        StringBuilder t = qv10.t(resultToString(getResult()));
        t.append(this.a.toString());
        return t.toString();
    }

    public X509Certificate getCertificate() {
        return this.b;
    }

    public String getIssuerName() {
        X509Certificate x509Certificate = this.b;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getIssuerX500Principal().toString();
    }

    public int getResult() {
        return this.d;
    }

    public String getSubjectName() {
        X509Certificate x509Certificate = this.b;
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal().toString();
    }

    public Throwable getThrowable() {
        return this.c;
    }

    public Vertex getVertex() {
        return this.a;
    }

    public String resultToString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Internal error: Invalid step result value.\n" : "Certificate satisfies conditions.\n" : "Certificate backed out since path does not satisfy conditions.\n" : "Certificate satisfies conditions.\n" : "Certificate backed out since path does not satisfy build requirements.\n" : "Certificate to be tried.\n";
    }

    public String toString() {
        int i = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "Internal Error: Invalid step result\n";
                        }
                    }
                }
            }
            StringBuilder t = qv10.t(resultToString(i));
            t.append(this.a.throwableToString());
            return t.toString();
        }
        return resultToString(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3 != 5) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String verboseToString() {
        StringBuilder t;
        String throwableToString;
        String resultToString = resultToString(getResult());
        Vertex vertex = this.a;
        int i = this.d;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                }
            }
            t = qv10.t(resultToString);
            throwableToString = vertex.moreToString();
            t.append(throwableToString);
            resultToString = t.toString();
            StringBuilder v = oyr.v(resultToString, "Certificate contains:\n");
            v.append(vertex.certToString());
            return v.toString();
        }
        t = qv10.t(resultToString);
        throwableToString = vertex.throwableToString();
        t.append(throwableToString);
        resultToString = t.toString();
        StringBuilder v2 = oyr.v(resultToString, "Certificate contains:\n");
        v2.append(vertex.certToString());
        return v2.toString();
    }

    public String getIssuerName(String str) {
        X509Certificate x509Certificate = this.b;
        return x509Certificate == null ? str : x509Certificate.getIssuerX500Principal().toString();
    }

    public String getSubjectName(String str) {
        X509Certificate x509Certificate = this.b;
        return x509Certificate == null ? str : x509Certificate.getSubjectX500Principal().toString();
    }
}
