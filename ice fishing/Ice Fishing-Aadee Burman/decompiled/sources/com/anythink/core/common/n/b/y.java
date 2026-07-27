package com.anythink.core.common.n.b;

import com.anythink.core.common.n.b.u;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class y extends ae {

    /* renamed from: a, reason: collision with root package name */
    public static final x f15758a = x.a("multipart/mixed");

    /* renamed from: b, reason: collision with root package name */
    public static final x f15759b = x.a("multipart/alternative");

    /* renamed from: c, reason: collision with root package name */
    public static final x f15760c = x.a("multipart/digest");

    /* renamed from: d, reason: collision with root package name */
    public static final x f15761d = x.a("multipart/parallel");

    /* renamed from: e, reason: collision with root package name */
    public static final x f15762e = x.a("multipart/form-data");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f15763f = {58, 32};

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f15764g = {13, 10};

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f15765h = {45, 45};
    private final com.anythink.core.common.n.c.f i;

    /* renamed from: j, reason: collision with root package name */
    private final x f15766j;

    /* renamed from: k, reason: collision with root package name */
    private final x f15767k;

    /* renamed from: l, reason: collision with root package name */
    private final List<b> f15768l;

    /* renamed from: m, reason: collision with root package name */
    private long f15769m = -1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.core.common.n.c.f f15770a;

        /* renamed from: b, reason: collision with root package name */
        private x f15771b;

        /* renamed from: c, reason: collision with root package name */
        private final List<b> f15772c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        private a a(x xVar) {
            if (xVar == null) {
                throw new NullPointerException("type == null");
            }
            if (!xVar.a().equals("multipart")) {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(xVar)));
            }
            this.f15771b = xVar;
            return this;
        }

        private a(String str) {
            this.f15771b = y.f15758a;
            this.f15772c = new ArrayList();
            this.f15770a = com.anythink.core.common.n.c.f.a(str);
        }

        private a a(u uVar, ae aeVar) {
            return a(b.a(uVar, aeVar));
        }

        private a a(String str, String str2, ae aeVar) {
            return a(b.a(str, str2, aeVar));
        }

        private a a(b bVar) {
            if (bVar != null) {
                this.f15772c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        private y a() {
            if (!this.f15772c.isEmpty()) {
                return new y(this.f15770a, this.f15771b, this.f15772c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        private a a(ae aeVar) {
            return a(b.a((u) null, aeVar));
        }

        private a a(String str, String str2) {
            return a(b.a(str, null, ae.a((x) null, str2.getBytes(StandardCharsets.UTF_8))));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final u f15773a;

        /* renamed from: b, reason: collision with root package name */
        final ae f15774b;

        private b(u uVar, ae aeVar) {
            this.f15773a = uVar;
            this.f15774b = aeVar;
        }

        private static b a(ae aeVar) {
            return a((u) null, aeVar);
        }

        private ae b() {
            return this.f15774b;
        }

        public static b a(u uVar, ae aeVar) {
            if (aeVar == null) {
                throw new NullPointerException("body == null");
            }
            if (uVar != null && uVar.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (uVar == null || uVar.a("Content-Length") == null) {
                return new b(uVar, aeVar);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static b a(String str, String str2, ae aeVar) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                y.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    y.a(sb, str2);
                }
                return a(new u.a().b("Content-Disposition", sb.toString()).a(), aeVar);
            }
            throw new NullPointerException("name == null");
        }

        private u a() {
            return this.f15773a;
        }

        private static b a(String str, String str2) {
            return a(str, null, ae.a((x) null, str2.getBytes(StandardCharsets.UTF_8)));
        }
    }

    public y(com.anythink.core.common.n.c.f fVar, x xVar, List<b> list) {
        this.i = fVar;
        this.f15766j = xVar;
        this.f15767k = x.a(xVar + "; boundary=" + fVar.a());
        this.f15768l = com.anythink.core.common.n.b.a.c.a(list);
    }

    private b a(int i) {
        return this.f15768l.get(i);
    }

    private x c() {
        return this.f15766j;
    }

    private String d() {
        return this.i.a();
    }

    private int e() {
        return this.f15768l.size();
    }

    private List<b> f() {
        return this.f15768l;
    }

    @Override // com.anythink.core.common.n.b.ae
    public final long b() {
        long j6 = this.f15769m;
        if (j6 != -1) {
            return j6;
        }
        long a9 = a((com.anythink.core.common.n.c.d) null, true);
        this.f15769m = a9;
        return a9;
    }

    @Override // com.anythink.core.common.n.b.ae
    public final x a() {
        return this.f15767k;
    }

    @Override // com.anythink.core.common.n.b.ae
    public final void a(com.anythink.core.common.n.c.d dVar) {
        a(dVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long a(com.anythink.core.common.n.c.d dVar, boolean z3) {
        com.anythink.core.common.n.c.c cVar;
        if (z3) {
            dVar = new com.anythink.core.common.n.c.c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.f15768l.size();
        long j6 = 0;
        for (int i = 0; i < size; i++) {
            b bVar = this.f15768l.get(i);
            u uVar = bVar.f15773a;
            ae aeVar = bVar.f15774b;
            dVar.d(f15765h);
            dVar.d(this.i);
            dVar.d(f15764g);
            if (uVar != null) {
                int a9 = uVar.a();
                for (int i6 = 0; i6 < a9; i6++) {
                    dVar.b(uVar.a(i6)).d(f15763f).b(uVar.b(i6)).d(f15764g);
                }
            }
            x a10 = aeVar.a();
            if (a10 != null) {
                dVar.b("Content-Type: ").b(a10.toString()).d(f15764g);
            }
            long b9 = aeVar.b();
            if (b9 != -1) {
                dVar.b("Content-Length: ").o(b9).d(f15764g);
            } else if (z3) {
                cVar.z();
                return -1L;
            }
            byte[] bArr = f15764g;
            dVar.d(bArr);
            if (z3) {
                j6 += b9;
            } else {
                aeVar.a(dVar);
            }
            dVar.d(bArr);
        }
        byte[] bArr2 = f15765h;
        dVar.d(bArr2);
        dVar.d(this.i);
        dVar.d(bArr2);
        dVar.d(f15764g);
        if (!z3) {
            return j6;
        }
        long b10 = cVar.b() + j6;
        cVar.z();
        return b10;
    }

    public static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }
}
