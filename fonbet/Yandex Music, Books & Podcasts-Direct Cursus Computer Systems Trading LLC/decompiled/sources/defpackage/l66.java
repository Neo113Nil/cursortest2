package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class l66 {
    public static final l66 e;
    public static final l66 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        el4 el4Var = el4.r;
        el4 el4Var2 = el4.s;
        el4 el4Var3 = el4.t;
        el4 el4Var4 = el4.l;
        el4 el4Var5 = el4.n;
        el4 el4Var6 = el4.m;
        el4 el4Var7 = el4.o;
        el4 el4Var8 = el4.q;
        el4 el4Var9 = el4.p;
        el4[] el4VarArr = {el4Var, el4Var2, el4Var3, el4Var4, el4Var5, el4Var6, el4Var7, el4Var8, el4Var9};
        el4[] el4VarArr2 = {el4Var, el4Var2, el4Var3, el4Var4, el4Var5, el4Var6, el4Var7, el4Var8, el4Var9, el4.j, el4.k, el4.h, el4.i, el4.f, el4.g, el4.e};
        k66 k66Var = new k66();
        k66Var.b((el4[]) Arrays.copyOf(el4VarArr, 9));
        sks sksVar = sks.TLS_1_3;
        sks sksVar2 = sks.TLS_1_2;
        k66Var.e(sksVar, sksVar2);
        k66Var.d = true;
        k66Var.a();
        k66 k66Var2 = new k66();
        k66Var2.b((el4[]) Arrays.copyOf(el4VarArr2, 16));
        k66Var2.e(sksVar, sksVar2);
        k66Var2.d = true;
        e = k66Var2.a();
        k66 k66Var3 = new k66();
        k66Var3.b((el4[]) Arrays.copyOf(el4VarArr2, 16));
        k66Var3.e(sksVar, sksVar2, sks.TLS_1_1, sks.TLS_1_0);
        k66Var3.d = true;
        k66Var3.a();
        f = new l66(false, false, null, null);
    }

    public l66(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(el4.b.P(str));
        }
        return CollectionsKt.w0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            cxi cxiVar = cxi.a;
            cxiVar.getClass();
            if (!cvt.j(strArr, enabledProtocols, cxiVar)) {
                return false;
            }
        }
        String[] strArr2 = this.c;
        return strArr2 == null || cvt.j(strArr2, sSLSocket.getEnabledCipherSuites(), el4.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a0g.y(str));
        }
        return CollectionsKt.w0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l66)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l66 l66Var = (l66) obj;
        boolean z = l66Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, l66Var.c) && Arrays.equals(this.d, l66Var.d) && this.b == l66Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return dfi.j(sb, this.b, ')');
    }
}
