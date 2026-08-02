package com.anythink.core.common.n.b;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f16453a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f16454b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f16455c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f16456d;
    private static final i[] i;

    /* renamed from: j, reason: collision with root package name */
    private static final i[] f16457j;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16458e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f16459f;

    /* renamed from: g, reason: collision with root package name */
    final String[] f16460g;

    /* renamed from: h, reason: collision with root package name */
    final String[] f16461h;

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
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.aI, i.aJ, i.ag, i.ah, i.f16407E, i.f16411I, i.i};
        f16457j = iVarArr2;
        a a9 = new a(true).a(iVarArr);
        ai aiVar = ai.TLS_1_3;
        ai aiVar2 = ai.TLS_1_2;
        f16453a = a9.a(aiVar, aiVar2).a().b();
        f16454b = new a(true).a(iVarArr2).a(aiVar, aiVar2).a().b();
        f16455c = new a(true).a(iVarArr2).a(aiVar, aiVar2, ai.TLS_1_1, ai.TLS_1_0).a().b();
        f16456d = new a(false).b();
    }

    public l(a aVar) {
        this.f16458e = aVar.f16462a;
        this.f16460g = aVar.f16463b;
        this.f16461h = aVar.f16464c;
        this.f16459f = aVar.f16465d;
    }

    private boolean b() {
        return this.f16458e;
    }

    private List<i> c() {
        String[] strArr = this.f16460g;
        if (strArr != null) {
            return i.a(strArr);
        }
        return null;
    }

    private List<ai> d() {
        String[] strArr = this.f16461h;
        if (strArr != null) {
            return ai.a(strArr);
        }
        return null;
    }

    public final boolean a() {
        return this.f16459f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l lVar = (l) obj;
        boolean z6 = this.f16458e;
        if (z6 != lVar.f16458e) {
            return false;
        }
        return !z6 || (Arrays.equals(this.f16460g, lVar.f16460g) && Arrays.equals(this.f16461h, lVar.f16461h) && this.f16459f == lVar.f16459f);
    }

    public final int hashCode() {
        if (this.f16458e) {
            return ((((Arrays.hashCode(this.f16460g) + 527) * 31) + Arrays.hashCode(this.f16461h)) * 31) + (!this.f16459f ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f16458e) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f16460g;
        sb.append(Objects.toString(strArr != null ? i.a(strArr) : null, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.f16461h;
        sb.append(Objects.toString(strArr2 != null ? ai.a(strArr2) : null, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f16459f);
        sb.append(")");
        return sb.toString();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f16462a;

        /* renamed from: b, reason: collision with root package name */
        String[] f16463b;

        /* renamed from: c, reason: collision with root package name */
        String[] f16464c;

        /* renamed from: d, reason: collision with root package name */
        boolean f16465d;

        public a(boolean z6) {
            this.f16462a = z6;
        }

        private a c() {
            if (!this.f16462a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.f16463b = null;
            return this;
        }

        private a d() {
            if (!this.f16462a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.f16464c = null;
            return this;
        }

        public final a a(i... iVarArr) {
            if (!this.f16462a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[iVarArr.length];
            for (int i = 0; i < iVarArr.length; i++) {
                strArr[i] = iVarArr[i].bq;
            }
            return a(strArr);
        }

        public final a b(String... strArr) {
            if (!this.f16462a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f16464c = (String[]) strArr.clone();
            return this;
        }

        public a(l lVar) {
            this.f16462a = lVar.f16458e;
            this.f16463b = lVar.f16460g;
            this.f16464c = lVar.f16461h;
            this.f16465d = lVar.f16459f;
        }

        public final l b() {
            return new l(this);
        }

        public final a a(String... strArr) {
            if (this.f16462a) {
                if (strArr.length != 0) {
                    this.f16463b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public final a a(ai... aiVarArr) {
            if (this.f16462a) {
                String[] strArr = new String[aiVarArr.length];
                for (int i = 0; i < aiVarArr.length; i++) {
                    strArr[i] = aiVarArr[i].f16328f;
                }
                return b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public final a a() {
            if (this.f16462a) {
                this.f16465d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    private l b(SSLSocket sSLSocket, boolean z6) {
        String[] a9 = this.f16460g != null ? com.anythink.core.common.n.b.a.c.a(i.f16427a, sSLSocket.getEnabledCipherSuites(), this.f16460g) : sSLSocket.getEnabledCipherSuites();
        String[] a10 = this.f16461h != null ? com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15829g, sSLSocket.getEnabledProtocols(), this.f16461h) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a11 = com.anythink.core.common.n.b.a.c.a(i.f16427a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z6 && a11 != -1) {
            a9 = com.anythink.core.common.n.b.a.c.a(a9, supportedCipherSuites[a11]);
        }
        return new a(this).a(a9).b(a10).b();
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f16458e) {
            return false;
        }
        String[] strArr = this.f16461h;
        if (strArr != null && !com.anythink.core.common.n.b.a.c.b(com.anythink.core.common.n.b.a.c.f15829g, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f16460g;
        return strArr2 == null || com.anythink.core.common.n.b.a.c.b(i.f16427a, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    private void a(SSLSocket sSLSocket, boolean z6) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f16460g != null) {
            enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(i.f16427a, sSLSocket.getEnabledCipherSuites(), this.f16460g);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f16461h != null) {
            enabledProtocols = com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15829g, sSLSocket.getEnabledProtocols(), this.f16461h);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a9 = com.anythink.core.common.n.b.a.c.a(i.f16427a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z6 && a9 != -1) {
            enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(enabledCipherSuites, supportedCipherSuites[a9]);
        }
        l b9 = new a(this).a(enabledCipherSuites).b(enabledProtocols).b();
        String[] strArr = b9.f16461h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b9.f16460g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }
}
