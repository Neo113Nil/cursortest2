package i8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import v7.AbstractC5120k;
import x7.C5195a;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f38245e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f38246f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38247a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38248b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f38249c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f38250d;

    static {
        f fVar = f.f38229r;
        f fVar2 = f.f38230s;
        f fVar3 = f.f38231t;
        f fVar4 = f.f38223l;
        f fVar5 = f.f38225n;
        f fVar6 = f.f38224m;
        f fVar7 = f.f38226o;
        f fVar8 = f.f38228q;
        f fVar9 = f.f38227p;
        List t6 = AbstractC5120k.t(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
        List t9 = AbstractC5120k.t(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f38221j, f.f38222k, f.f38220h, f.i, f.f38218f, f.f38219g, f.f38217e);
        h hVar = new h();
        f[] fVarArr = (f[]) t6.toArray(new f[0]);
        hVar.b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        z zVar = z.f38386v;
        z zVar2 = z.f38387w;
        hVar.d(zVar, zVar2);
        if (!hVar.f38241a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f38242b = true;
        hVar.a();
        h hVar2 = new h();
        f[] fVarArr2 = (f[]) t9.toArray(new f[0]);
        hVar2.b((f[]) Arrays.copyOf(fVarArr2, fVarArr2.length));
        hVar2.d(zVar, zVar2);
        if (!hVar2.f38241a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f38242b = true;
        f38245e = hVar2.a();
        h hVar3 = new h();
        f[] fVarArr3 = (f[]) t9.toArray(new f[0]);
        hVar3.b((f[]) Arrays.copyOf(fVarArr3, fVarArr3.length));
        hVar3.d(zVar, zVar2, z.f38388x, z.f38389y);
        if (!hVar3.f38241a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f38242b = true;
        hVar3.a();
        f38246f = new i(false, false, null, null);
    }

    public i(boolean z6, boolean z9, String[] strArr, String[] strArr2) {
        this.f38247a = z6;
        this.f38248b = z9;
        this.f38249c = strArr;
        this.f38250d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sSLSocket, boolean z6) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.h.b(enabledCipherSuites);
        String[] strArr = this.f38249c;
        if (strArr != null) {
            enabledCipherSuites = j8.c.h(f.f38215c, strArr, enabledCipherSuites);
        }
        ?? r22 = this.f38250d;
        if (r22 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.h.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = j8.c.h(C5195a.f41885u, enabledProtocols2, r22);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.h.b(supportedCipherSuites);
        e eVar = f.f38215c;
        byte[] bArr = j8.c.f38494a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (eVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z6 && i != -1) {
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.h.d(str, "get(...)");
            kotlin.jvm.internal.h.e(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        h hVar = new h();
        hVar.f38241a = this.f38247a;
        hVar.f38243c = strArr;
        hVar.f38244d = r22;
        hVar.f38242b = this.f38248b;
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i a9 = hVar.a();
        if (a9.c() != null) {
            sSLSocket.setEnabledProtocols(a9.f38250d);
        }
        if (a9.b() != null) {
            sSLSocket.setEnabledCipherSuites(a9.f38249c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f38249c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f38214b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f38250d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            z.f38385u.getClass();
            arrayList.add(b.c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z6 = iVar.f38247a;
        boolean z9 = this.f38247a;
        if (z9 != z6) {
            return false;
        }
        if (z9) {
            return Arrays.equals(this.f38249c, iVar.f38249c) && Arrays.equals(this.f38250d, iVar.f38250d) && this.f38248b == iVar.f38248b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f38247a) {
            return 17;
        }
        String[] strArr = this.f38249c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f38250d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f38248b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f38247a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f38248b + ')';
    }
}
