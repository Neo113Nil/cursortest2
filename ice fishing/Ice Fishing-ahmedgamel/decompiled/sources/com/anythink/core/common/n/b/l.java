package com.anythink.core.common.n.b;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f15666a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f15667b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f15668c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f15669d;
    private static final i[] i;

    /* renamed from: j, reason: collision with root package name */
    private static final i[] f15670j;

    /* renamed from: e, reason: collision with root package name */
    final boolean f15671e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f15672f;

    /* renamed from: g, reason: collision with root package name */
    final String[] f15673g;

    /* renamed from: h, reason: collision with root package name */
    final String[] f15674h;

    static {
        i iVar = i.bl;
        i iVar2 = i.bm;
        i iVar3 = i.bn;
        i iVar4 = i.aX;
        i iVar5 = i.bb;
        i iVar6 = i.aY;
        i iVar7 = i.bc;
        i iVar8 = i.bi;
        i iVar9 = i.bh;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        i = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.aI, i.aJ, i.ag, i.ah, i.f15620E, i.f15624I, i.i};
        f15670j = iVarArr2;
        a a9 = new a(true).a(iVarArr);
        ai aiVar = ai.TLS_1_3;
        ai aiVar2 = ai.TLS_1_2;
        f15666a = a9.a(aiVar, aiVar2).a().b();
        f15667b = new a(true).a(iVarArr2).a(aiVar, aiVar2).a().b();
        f15668c = new a(true).a(iVarArr2).a(aiVar, aiVar2, ai.TLS_1_1, ai.TLS_1_0).a().b();
        f15669d = new a(false).b();
    }

    public l(a aVar) {
        this.f15671e = aVar.f15675a;
        this.f15673g = aVar.f15676b;
        this.f15674h = aVar.f15677c;
        this.f15672f = aVar.f15678d;
    }

    private boolean b() {
        return this.f15671e;
    }

    private List<i> c() {
        String[] strArr = this.f15673g;
        if (strArr != null) {
            return i.a(strArr);
        }
        return null;
    }

    private List<ai> d() {
        String[] strArr = this.f15674h;
        if (strArr != null) {
            return ai.a(strArr);
        }
        return null;
    }

    public final boolean a() {
        return this.f15672f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        boolean z3 = this.f15671e;
        if (z3 != lVar.f15671e) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f15673g, lVar.f15673g) && Arrays.equals(this.f15674h, lVar.f15674h) && this.f15672f == lVar.f15672f);
    }

    public final int hashCode() {
        if (this.f15671e) {
            return ((((Arrays.hashCode(this.f15673g) + 527) * 31) + Arrays.hashCode(this.f15674h)) * 31) + (!this.f15672f ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f15671e) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f15673g;
        sb.append(Objects.toString(strArr != null ? i.a(strArr) : null, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.f15674h;
        sb.append(Objects.toString(strArr2 != null ? ai.a(strArr2) : null, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f15672f);
        sb.append(")");
        return sb.toString();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f15675a;

        /* renamed from: b, reason: collision with root package name */
        String[] f15676b;

        /* renamed from: c, reason: collision with root package name */
        String[] f15677c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15678d;

        public a(boolean z3) {
            this.f15675a = z3;
        }

        private a c() {
            if (!this.f15675a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.f15676b = null;
            return this;
        }

        private a d() {
            if (!this.f15675a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.f15677c = null;
            return this;
        }

        public final a a(i... iVarArr) {
            if (!this.f15675a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[iVarArr.length];
            for (int i = 0; i < iVarArr.length; i++) {
                strArr[i] = iVarArr[i].bq;
            }
            return a(strArr);
        }

        public final a b(String... strArr) {
            if (!this.f15675a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f15677c = (String[]) strArr.clone();
            return this;
        }

        public a(l lVar) {
            this.f15675a = lVar.f15671e;
            this.f15676b = lVar.f15673g;
            this.f15677c = lVar.f15674h;
            this.f15678d = lVar.f15672f;
        }

        public final l b() {
            return new l(this);
        }

        public final a a(String... strArr) {
            if (this.f15675a) {
                if (strArr.length != 0) {
                    this.f15676b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final a a(ai... aiVarArr) {
            if (this.f15675a) {
                String[] strArr = new String[aiVarArr.length];
                for (int i = 0; i < aiVarArr.length; i++) {
                    strArr[i] = aiVarArr[i].f15541f;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final a a() {
            if (this.f15675a) {
                this.f15678d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    private l b(SSLSocket sSLSocket, boolean z3) {
        String[] a9 = this.f15673g != null ? com.anythink.core.common.n.b.a.c.a(i.f15640a, sSLSocket.getEnabledCipherSuites(), this.f15673g) : sSLSocket.getEnabledCipherSuites();
        String[] a10 = this.f15674h != null ? com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15042g, sSLSocket.getEnabledProtocols(), this.f15674h) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a11 = com.anythink.core.common.n.b.a.c.a(i.f15640a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z3 && a11 != -1) {
            a9 = com.anythink.core.common.n.b.a.c.a(a9, supportedCipherSuites[a11]);
        }
        return new a(this).a(a9).b(a10).b();
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f15671e) {
            return false;
        }
        String[] strArr = this.f15674h;
        if (strArr != null && !com.anythink.core.common.n.b.a.c.b(com.anythink.core.common.n.b.a.c.f15042g, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f15673g;
        return strArr2 == null || com.anythink.core.common.n.b.a.c.b(i.f15640a, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    private void a(SSLSocket sSLSocket, boolean z3) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f15673g != null) {
            enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(i.f15640a, sSLSocket.getEnabledCipherSuites(), this.f15673g);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f15674h != null) {
            enabledProtocols = com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15042g, sSLSocket.getEnabledProtocols(), this.f15674h);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a9 = com.anythink.core.common.n.b.a.c.a(i.f15640a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z3 && a9 != -1) {
            enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(enabledCipherSuites, supportedCipherSuites[a9]);
        }
        l b9 = new a(this).a(enabledCipherSuites).b(enabledProtocols).b();
        String[] strArr = b9.f15674h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b9.f15673g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }
}
