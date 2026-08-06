package J1;

import a.AbstractC0083a;
import i1.AbstractC0252i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import k1.C0976a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f870e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f871f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f872a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f873b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f874c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f875d;

    static {
        g gVar = g.f863r;
        g gVar2 = g.f864s;
        g gVar3 = g.t;
        g gVar4 = g.f857l;
        g gVar5 = g.f859n;
        g gVar6 = g.f858m;
        g gVar7 = g.f860o;
        g gVar8 = g.f862q;
        g gVar9 = g.f861p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f855j, g.f856k, g.f853h, g.f854i, g.f851f, g.f852g, g.f850e};
        h hVar = new h(0);
        hVar.b((g[]) Arrays.copyOf(new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        B b2 = B.TLS_1_3;
        B b3 = B.TLS_1_2;
        hVar.e(b2, b3);
        if (!hVar.f866a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f867b = true;
        hVar.a();
        h hVar2 = new h(0);
        hVar2.b((g[]) Arrays.copyOf(gVarArr, 16));
        hVar2.e(b2, b3);
        if (!hVar2.f866a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f867b = true;
        f870e = hVar2.a();
        h hVar3 = new h(0);
        hVar3.b((g[]) Arrays.copyOf(gVarArr, 16));
        hVar3.e(b2, b3, B.TLS_1_1, B.TLS_1_0);
        if (!hVar3.f866a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f867b = true;
        hVar3.a();
        f871f = new i(false, false, null, null);
    }

    public i(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f872a = z2;
        this.f873b = z3;
        this.f874c = strArr;
        this.f875d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f874c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f847b.c(str));
        }
        return AbstractC0252i.R(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f872a) {
            return false;
        }
        String[] strArr = this.f875d;
        if (strArr != null && !K1.b.j(strArr, sSLSocket.getEnabledProtocols(), C0976a.f8063b)) {
            return false;
        }
        String[] strArr2 = this.f874c;
        return strArr2 == null || K1.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), g.f848c);
    }

    public final List c() {
        String[] strArr = this.f875d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0083a.h(str));
        }
        return AbstractC0252i.R(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z2 = iVar.f872a;
        boolean z3 = this.f872a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f874c, iVar.f874c) && Arrays.equals(this.f875d, iVar.f875d) && this.f873b == iVar.f873b);
    }

    public final int hashCode() {
        if (!this.f872a) {
            return 17;
        }
        String[] strArr = this.f874c;
        int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f875d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f873b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f872a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f873b + ')';
    }
}
