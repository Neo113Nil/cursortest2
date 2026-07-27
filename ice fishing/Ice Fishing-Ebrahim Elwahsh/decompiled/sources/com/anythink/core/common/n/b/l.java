package com.anythink.core.common.n.b;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f15824a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f15825b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f15826c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f15827d;
    private static final i[] i;

    /* renamed from: j, reason: collision with root package name */
    private static final i[] f15828j;

    /* renamed from: e, reason: collision with root package name */
    final boolean f15829e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f15830f;

    /* renamed from: g, reason: collision with root package name */
    final String[] f15831g;

    /* renamed from: h, reason: collision with root package name */
    final String[] f15832h;

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
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.aI, i.aJ, i.ag, i.ah, i.f15778E, i.f15782I, i.i};
        f15828j = iVarArr2;
        a a9 = new a(true).a(iVarArr);
        ai aiVar = ai.TLS_1_3;
        ai aiVar2 = ai.TLS_1_2;
        f15824a = a9.a(aiVar, aiVar2).a().b();
        f15825b = new a(true).a(iVarArr2).a(aiVar, aiVar2).a().b();
        f15826c = new a(true).a(iVarArr2).a(aiVar, aiVar2, ai.TLS_1_1, ai.TLS_1_0).a().b();
        f15827d = new a(false).b();
    }

    public l(a aVar) {
        this.f15829e = aVar.f15833a;
        this.f15831g = aVar.f15834b;
        this.f15832h = aVar.f15835c;
        this.f15830f = aVar.f15836d;
    }

    private boolean b() {
        return this.f15829e;
    }

    private List<i> c() {
        String[] strArr = this.f15831g;
        if (strArr != null) {
            return i.a(strArr);
        }
        return null;
    }

    private List<ai> d() {
        String[] strArr = this.f15832h;
        if (strArr != null) {
            return ai.a(strArr);
        }
        return null;
    }

    public final boolean a() {
        return this.f15830f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        boolean z8 = this.f15829e;
        if (z8 != lVar.f15829e) {
            return false;
        }
        return !z8 || (Arrays.equals(this.f15831g, lVar.f15831g) && Arrays.equals(this.f15832h, lVar.f15832h) && this.f15830f == lVar.f15830f);
    }

    public final int hashCode() {
        if (this.f15829e) {
            return ((((Arrays.hashCode(this.f15831g) + 527) * 31) + Arrays.hashCode(this.f15832h)) * 31) + (!this.f15830f ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f15829e) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f15831g;
        sb.append(Objects.toString(strArr != null ? i.a(strArr) : null, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.f15832h;
        sb.append(Objects.toString(strArr2 != null ? ai.a(strArr2) : null, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f15830f);
        sb.append(")");
        return sb.toString();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f15833a;

        /* renamed from: b, reason: collision with root package name */
        String[] f15834b;

        /* renamed from: c, reason: collision with root package name */
        String[] f15835c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15836d;

        public a(boolean z8) {
            this.f15833a = z8;
        }

        private a c() {
            if (!this.f15833a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.f15834b = null;
            return this;
        }

        private a d() {
            if (!this.f15833a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.f15835c = null;
            return this;
        }

        public final a a(i... iVarArr) {
            if (!this.f15833a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[iVarArr.length];
            for (int i = 0; i < iVarArr.length; i++) {
                strArr[i] = iVarArr[i].bq;
            }
            return a(strArr);
        }

        public final a b(String... strArr) {
            if (!this.f15833a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f15835c = (String[]) strArr.clone();
            return this;
        }

        public a(l lVar) {
            this.f15833a = lVar.f15829e;
            this.f15834b = lVar.f15831g;
            this.f15835c = lVar.f15832h;
            this.f15836d = lVar.f15830f;
        }

        public final l b() {
            return new l(this);
        }

        public final a a(String... strArr) {
            if (this.f15833a) {
                if (strArr.length != 0) {
                    this.f15834b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final a a(ai... aiVarArr) {
            if (this.f15833a) {
                String[] strArr = new String[aiVarArr.length];
                for (int i = 0; i < aiVarArr.length; i++) {
                    strArr[i] = aiVarArr[i].f15699f;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final a a() {
            if (this.f15833a) {
                this.f15836d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    private l b(SSLSocket sSLSocket, boolean z8) {
        String[] a9 = this.f15831g != null ? com.anythink.core.common.n.b.a.c.a(i.f15798a, sSLSocket.getEnabledCipherSuites(), this.f15831g) : sSLSocket.getEnabledCipherSuites();
        String[] a10 = this.f15832h != null ? com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15200g, sSLSocket.getEnabledProtocols(), this.f15832h) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a11 = com.anythink.core.common.n.b.a.c.a(i.f15798a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z8 && a11 != -1) {
            a9 = com.anythink.core.common.n.b.a.c.a(a9, supportedCipherSuites[a11]);
        }
        return new a(this).a(a9).b(a10).b();
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f15829e) {
            return false;
        }
        String[] strArr = this.f15832h;
        if (strArr != null && !com.anythink.core.common.n.b.a.c.b(com.anythink.core.common.n.b.a.c.f15200g, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f15831g;
        return strArr2 == null || com.anythink.core.common.n.b.a.c.b(i.f15798a, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    private void a(SSLSocket sSLSocket, boolean z8) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f15831g != null) {
            enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(i.f15798a, sSLSocket.getEnabledCipherSuites(), this.f15831g);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f15832h != null) {
            enabledProtocols = com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15200g, sSLSocket.getEnabledProtocols(), this.f15832h);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a9 = com.anythink.core.common.n.b.a.c.a(i.f15798a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z8 && a9 != -1) {
            enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(enabledCipherSuites, supportedCipherSuites[a9]);
        }
        l b9 = new a(this).a(enabledCipherSuites).b(enabledProtocols).b();
        String[] strArr = b9.f15832h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b9.f15831g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }
}
