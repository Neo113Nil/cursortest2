package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.j.r;
import com.anythink.basead.exoplayer.j.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class c implements com.anythink.basead.exoplayer.j.h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8032a = 2097152;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8033b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8034c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8035d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8036e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8037f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8038g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static final long f8039h = 102400;

    /* renamed from: A, reason: collision with root package name */
    private boolean f8040A;

    /* renamed from: B, reason: collision with root package name */
    private long f8041B;

    /* renamed from: C, reason: collision with root package name */
    private long f8042C;
    private final com.anythink.basead.exoplayer.j.a.a i;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f8043j;

    /* renamed from: k, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f8044k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f8045l;

    /* renamed from: m, reason: collision with root package name */
    private final b f8046m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f8047n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f8048o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f8049p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.j.h f8050q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8051r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f8052s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f8053t;

    /* renamed from: u, reason: collision with root package name */
    private int f8054u;

    /* renamed from: v, reason: collision with root package name */
    private String f8055v;

    /* renamed from: w, reason: collision with root package name */
    private long f8056w;

    /* renamed from: x, reason: collision with root package name */
    private long f8057x;

    /* renamed from: y, reason: collision with root package name */
    private e f8058y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8059z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a();

        void b();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.basead.exoplayer.j.a.c$c, reason: collision with other inner class name */
    public @interface InterfaceC0035c {
    }

    public c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar) {
        this(aVar, hVar, 0, (byte) 0);
    }

    private void c() {
        this.f8057x = 0L;
        if (g()) {
            this.i.d(this.f8055v, this.f8056w);
        }
    }

    private boolean d() {
        return !f();
    }

    private boolean e() {
        return this.f8050q == this.f8045l;
    }

    private boolean f() {
        return this.f8050q == this.f8043j;
    }

    private boolean g() {
        return this.f8050q == this.f8044k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h() {
        com.anythink.basead.exoplayer.j.h hVar = this.f8050q;
        if (hVar == null) {
            return;
        }
        try {
            hVar.b();
        } finally {
            this.f8050q = null;
            this.f8051r = false;
            e eVar = this.f8058y;
            if (eVar != null) {
                this.i.a(eVar);
                this.f8058y = null;
            }
        }
    }

    private static void i() {
    }

    private void j() {
        if (this.f8046m == null || this.f8041B <= 0) {
            return;
        }
        this.i.c();
        this.f8041B = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x0033, B:13:0x0047, B:17:0x0052, B:19:0x0060, B:22:0x006c, B:23:0x0071, B:25:0x0074, B:27:0x0072, B:28:0x003a, B:30:0x003e, B:34:0x001a), top: B:1:0x0000 }] */
    @Override // com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.anythink.basead.exoplayer.j.k kVar) {
        boolean z3;
        long j6;
        long b9;
        try {
            String a9 = f.a(kVar);
            this.f8055v = a9;
            Uri uri = kVar.f8137c;
            this.f8052s = uri;
            Uri uri2 = null;
            String a10 = this.i.c(a9).a("exo_redir", (String) null);
            if (a10 != null) {
                uri2 = Uri.parse(a10);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f8053t = uri;
            this.f8054u = kVar.i;
            this.f8056w = kVar.f8140f;
            if ((!this.f8048o || !this.f8059z) && (!this.f8049p || kVar.f8141g != -1)) {
                z3 = false;
                this.f8040A = z3;
                j6 = kVar.f8141g;
                if (j6 == -1 && !z3) {
                    b9 = this.i.b(this.f8055v);
                    this.f8057x = b9;
                    if (b9 != -1) {
                        long j9 = b9 - kVar.f8140f;
                        this.f8057x = j9;
                        if (j9 <= 0) {
                            throw new com.anythink.basead.exoplayer.j.i();
                        }
                    }
                    a(false);
                    return this.f8057x;
                }
                this.f8057x = j6;
                a(false);
                return this.f8057x;
            }
            z3 = true;
            this.f8040A = z3;
            j6 = kVar.f8141g;
            if (j6 == -1) {
                b9 = this.i.b(this.f8055v);
                this.f8057x = b9;
                if (b9 != -1) {
                }
                a(false);
                return this.f8057x;
            }
            this.f8057x = j6;
            a(false);
            return this.f8057x;
        } catch (IOException e9) {
            b(e9);
            throw e9;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8052s = null;
        this.f8053t = null;
        if (this.f8046m != null && this.f8041B > 0) {
            this.i.c();
            this.f8041B = 0L;
        }
        try {
            h();
        } catch (IOException e9) {
            b(e9);
            throw e9;
        }
    }

    private c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, int i) {
        this(aVar, hVar, i, (byte) 0);
    }

    private c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, int i, byte b9) {
        this(aVar, hVar, new r(), new com.anythink.basead.exoplayer.j.a.b(aVar), i, null);
    }

    private c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, com.anythink.basead.exoplayer.j.h hVar2, com.anythink.basead.exoplayer.j.g gVar, int i, b bVar) {
        this.i = aVar;
        this.f8043j = hVar2;
        this.f8047n = (i & 1) != 0;
        this.f8048o = (i & 2) != 0;
        this.f8049p = (i & 4) != 0;
        this.f8045l = hVar;
        this.f8044k = new z(hVar, gVar);
        this.f8046m = bVar;
    }

    private void b(IOException iOException) {
        if (f() || (iOException instanceof a.C0034a)) {
            this.f8059z = true;
        }
    }

    private int b(com.anythink.basead.exoplayer.j.k kVar) {
        if (this.f8048o && this.f8059z) {
            return 0;
        }
        return (this.f8049p && kVar.f8141g == -1) ? 1 : -1;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (this.f8057x == 0) {
            return -1;
        }
        try {
            if (this.f8056w >= this.f8042C) {
                a(true);
            }
            int a9 = this.f8050q.a(bArr, i, i6);
            if (a9 != -1) {
                if (f()) {
                    this.f8041B += a9;
                }
                long j6 = a9;
                this.f8056w += j6;
                long j9 = this.f8057x;
                if (j9 != -1) {
                    this.f8057x = j9 - j6;
                    return a9;
                }
            } else {
                if (this.f8051r) {
                    c();
                    return a9;
                }
                long j10 = this.f8057x;
                if (j10 <= 0) {
                    if (j10 == -1) {
                    }
                }
                h();
                a(false);
                return a(bArr, i, i6);
            }
            return a9;
        } catch (IOException e9) {
            if (this.f8051r) {
                for (Throwable th = e9; th != null; th = th.getCause()) {
                    if ((th instanceof com.anythink.basead.exoplayer.j.i) && ((com.anythink.basead.exoplayer.j.i) th).f8128b == 0) {
                        c();
                        return -1;
                    }
                }
            }
            b(e9);
            throw e9;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8053t;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(boolean z3) {
        e a9;
        long j6;
        com.anythink.basead.exoplayer.j.k kVar;
        e eVar;
        com.anythink.basead.exoplayer.j.h hVar;
        com.anythink.basead.exoplayer.j.k kVar2;
        long a10;
        k kVar3;
        if (this.f8040A) {
            a9 = null;
        } else if (this.f8047n) {
            try {
                a9 = this.i.a(this.f8055v, this.f8056w);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            a9 = this.i.b(this.f8055v, this.f8056w);
        }
        if (a9 == null) {
            hVar = this.f8045l;
            kVar2 = new com.anythink.basead.exoplayer.j.k(this.f8052s, this.f8056w, this.f8057x, this.f8055v, this.f8054u);
        } else if (a9.f8063d) {
            Uri fromFile = Uri.fromFile(a9.f8064e);
            long j9 = this.f8056w - a9.f8061b;
            long j10 = a9.f8062c - j9;
            long j11 = this.f8057x;
            if (j11 != -1) {
                j10 = Math.min(j10, j11);
            }
            kVar2 = new com.anythink.basead.exoplayer.j.k(fromFile, this.f8056w, j9, j10, this.f8055v, this.f8054u);
            hVar = this.f8043j;
        } else {
            if (a9.a()) {
                j6 = this.f8057x;
            } else {
                j6 = a9.f8062c;
                long j12 = this.f8057x;
                if (j12 != -1) {
                    j6 = Math.min(j6, j12);
                }
            }
            kVar = new com.anythink.basead.exoplayer.j.k(this.f8052s, this.f8056w, j6, this.f8055v, this.f8054u);
            com.anythink.basead.exoplayer.j.h hVar2 = this.f8044k;
            if (hVar2 == null) {
                com.anythink.basead.exoplayer.j.h hVar3 = this.f8045l;
                this.i.a(a9);
                eVar = null;
                hVar = hVar3;
                this.f8042C = (this.f8040A && hVar == this.f8045l) ? this.f8056w + f8039h : Long.MAX_VALUE;
                if (z3) {
                }
                if (eVar != null) {
                    this.f8058y = eVar;
                }
                this.f8050q = hVar;
                this.f8051r = kVar.f8141g == -1;
                a10 = hVar.a(kVar);
                kVar3 = new k();
                if (this.f8051r) {
                    this.f8057x = a10;
                    j.a(kVar3, this.f8056w + a10);
                }
                if (d()) {
                }
                if (g()) {
                }
            } else {
                hVar = hVar2;
                eVar = a9;
                this.f8042C = (this.f8040A && hVar == this.f8045l) ? this.f8056w + f8039h : Long.MAX_VALUE;
                if (z3) {
                    com.anythink.basead.exoplayer.k.a.b(e());
                    if (hVar == this.f8045l) {
                        return;
                    }
                    try {
                        h();
                    } catch (Throwable th) {
                        if (eVar.b()) {
                            this.i.a(eVar);
                        }
                        throw th;
                    }
                }
                if (eVar != null && eVar.b()) {
                    this.f8058y = eVar;
                }
                this.f8050q = hVar;
                this.f8051r = kVar.f8141g == -1;
                a10 = hVar.a(kVar);
                kVar3 = new k();
                if (this.f8051r && a10 != -1) {
                    this.f8057x = a10;
                    j.a(kVar3, this.f8056w + a10);
                }
                if (d()) {
                    Uri a11 = this.f8050q.a();
                    this.f8053t = a11;
                    if (!this.f8052s.equals(a11)) {
                        j.a(kVar3, this.f8053t);
                    } else {
                        kVar3.a("exo_redir");
                    }
                }
                if (g()) {
                    this.i.a(this.f8055v, kVar3);
                    return;
                }
                return;
            }
        }
        kVar = kVar2;
        eVar = a9;
        this.f8042C = (this.f8040A && hVar == this.f8045l) ? this.f8056w + f8039h : Long.MAX_VALUE;
        if (z3) {
        }
        if (eVar != null) {
        }
        this.f8050q = hVar;
        this.f8051r = kVar.f8141g == -1;
        a10 = hVar.a(kVar);
        kVar3 = new k();
        if (this.f8051r) {
        }
        if (d()) {
        }
        if (g()) {
        }
    }

    private static Uri a(com.anythink.basead.exoplayer.j.a.a aVar, String str, Uri uri) {
        String a9 = aVar.c(str).a("exo_redir", (String) null);
        Uri parse = a9 != null ? Uri.parse(a9) : null;
        return parse == null ? uri : parse;
    }

    private static boolean a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof com.anythink.basead.exoplayer.j.i) && ((com.anythink.basead.exoplayer.j.i) iOException2).f8128b == 0) {
                return true;
            }
        }
        return false;
    }
}
