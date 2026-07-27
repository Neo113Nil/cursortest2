package i8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import v7.AbstractC5130k;
import x7.C5200a;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f38126e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f38127f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38128a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38129b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f38130c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f38131d;

    static {
        f fVar = f.f38110r;
        f fVar2 = f.f38111s;
        f fVar3 = f.f38112t;
        f fVar4 = f.f38104l;
        f fVar5 = f.f38106n;
        f fVar6 = f.f38105m;
        f fVar7 = f.f38107o;
        f fVar8 = f.f38109q;
        f fVar9 = f.f38108p;
        List v9 = AbstractC5130k.v(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
        List v10 = AbstractC5130k.v(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f38102j, f.f38103k, f.f38101h, f.i, f.f38099f, f.f38100g, f.f38098e);
        h hVar = new h();
        f[] fVarArr = (f[]) v9.toArray(new f[0]);
        hVar.b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        z zVar = z.f38267v;
        z zVar2 = z.f38268w;
        hVar.d(zVar, zVar2);
        if (!hVar.f38122a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f38123b = true;
        hVar.a();
        h hVar2 = new h();
        f[] fVarArr2 = (f[]) v10.toArray(new f[0]);
        hVar2.b((f[]) Arrays.copyOf(fVarArr2, fVarArr2.length));
        hVar2.d(zVar, zVar2);
        if (!hVar2.f38122a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f38123b = true;
        f38126e = hVar2.a();
        h hVar3 = new h();
        f[] fVarArr3 = (f[]) v10.toArray(new f[0]);
        hVar3.b((f[]) Arrays.copyOf(fVarArr3, fVarArr3.length));
        hVar3.d(zVar, zVar2, z.f38269x, z.f38270y);
        if (!hVar3.f38122a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f38123b = true;
        hVar3.a();
        f38127f = new i(false, false, null, null);
    }

    public i(boolean z3, boolean z6, String[] strArr, String[] strArr2) {
        this.f38128a = z3;
        this.f38129b = z6;
        this.f38130c = strArr;
        this.f38131d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sSLSocket, boolean z3) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.h.b(enabledCipherSuites);
        String[] strArr = this.f38130c;
        if (strArr != null) {
            enabledCipherSuites = j8.c.h(f.f38096c, strArr, enabledCipherSuites);
        }
        ?? r22 = this.f38131d;
        if (r22 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.h.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = j8.c.h(C5200a.f41772u, enabledProtocols2, r22);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.h.b(supportedCipherSuites);
        e eVar = f.f38096c;
        byte[] bArr = j8.c.f38482a;
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
        if (z3 && i != -1) {
            String str = supportedCipherSuites[i];
            kotlin.jvm.internal.h.d(str, "get(...)");
            kotlin.jvm.internal.h.e(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        h hVar = new h();
        hVar.f38122a = this.f38128a;
        hVar.f38124c = strArr;
        hVar.f38125d = r22;
        hVar.f38123b = this.f38129b;
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i a9 = hVar.a();
        if (a9.c() != null) {
            sSLSocket.setEnabledProtocols(a9.f38131d);
        }
        if (a9.b() != null) {
            sSLSocket.setEnabledCipherSuites(a9.f38130c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f38130c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f38095b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f38131d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            z.f38266u.getClass();
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
        boolean z3 = iVar.f38128a;
        boolean z6 = this.f38128a;
        if (z6 != z3) {
            return false;
        }
        if (z6) {
            return Arrays.equals(this.f38130c, iVar.f38130c) && Arrays.equals(this.f38131d, iVar.f38131d) && this.f38129b == iVar.f38129b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f38128a) {
            return 17;
        }
        String[] strArr = this.f38130c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f38131d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f38129b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f38128a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f38129b + ')';
    }
}
