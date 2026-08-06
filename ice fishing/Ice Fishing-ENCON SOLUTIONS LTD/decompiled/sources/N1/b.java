package N1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k1.C0976a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f1150a;

    /* renamed from: b, reason: collision with root package name */
    public int f1151b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1152c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1153d;

    public b(List connectionSpecs) {
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        this.f1150a = connectionSpecs;
    }

    public final J1.i a(SSLSocket sSLSocket) {
        J1.i iVar;
        int i2;
        boolean z2;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i3 = this.f1151b;
        List list = this.f1150a;
        int size = list.size();
        while (true) {
            if (i3 >= size) {
                iVar = null;
                break;
            }
            int i4 = i3 + 1;
            iVar = (J1.i) list.get(i3);
            if (iVar.b(sSLSocket)) {
                this.f1151b = i4;
                break;
            }
            i3 = i4;
        }
        if (iVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f1153d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.b(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.i.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f1151b;
        int size2 = list.size();
        while (true) {
            i2 = 0;
            if (i5 >= size2) {
                z2 = false;
                break;
            }
            int i6 = i5 + 1;
            if (((J1.i) list.get(i5)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i5 = i6;
        }
        this.f1152c = z2;
        boolean z3 = this.f1153d;
        String[] strArr = iVar.f874c;
        if (strArr != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.i.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = K1.b.p(enabledCipherSuites, strArr, J1.g.f848c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = iVar.f875d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.i.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = K1.b.p(enabledProtocols2, strArr2, C0976a.f8063b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.i.d(supportedCipherSuites, "supportedCipherSuites");
        J1.f fVar = J1.g.f848c;
        byte[] bArr = K1.b.f1051a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i2++;
        }
        if (z3 && i2 != -1) {
            kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i2];
            kotlin.jvm.internal.i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        J1.h hVar = new J1.h();
        hVar.f866a = iVar.f872a;
        hVar.f868c = strArr;
        hVar.f869d = strArr2;
        hVar.f867b = iVar.f873b;
        kotlin.jvm.internal.i.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        hVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.i.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        hVar.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        J1.i a2 = hVar.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.f875d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f874c);
        }
        return iVar;
    }
}
