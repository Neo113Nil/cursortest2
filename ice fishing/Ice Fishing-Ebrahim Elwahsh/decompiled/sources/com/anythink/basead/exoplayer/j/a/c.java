package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.j.r;
import com.anythink.basead.exoplayer.j.z;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class c implements com.anythink.basead.exoplayer.j.h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8189a = 2097152;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8190b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8191c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8192d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8193e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8194f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8195g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static final long f8196h = 102400;

    /* renamed from: A, reason: collision with root package name */
    private boolean f8197A;

    /* renamed from: B, reason: collision with root package name */
    private long f8198B;

    /* renamed from: C, reason: collision with root package name */
    private long f8199C;
    private final com.anythink.basead.exoplayer.j.a.a i;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f8200j;

    /* renamed from: k, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f8201k;

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f8202l;

    /* renamed from: m, reason: collision with root package name */
    private final b f8203m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f8204n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f8205o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f8206p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.j.h f8207q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8208r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f8209s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f8210t;

    /* renamed from: u, reason: collision with root package name */
    private int f8211u;

    /* renamed from: v, reason: collision with root package name */
    private String f8212v;

    /* renamed from: w, reason: collision with root package name */
    private long f8213w;

    /* renamed from: x, reason: collision with root package name */
    private long f8214x;

    /* renamed from: y, reason: collision with root package name */
    private e f8215y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8216z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a();

        void b();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.anythink.basead.exoplayer.j.a.c$c, reason: collision with other inner class name */
    public @interface InterfaceC0034c {
    }

    public c(com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar) {
        this(aVar, hVar, 0, (byte) 0);
    }

    private void c() {
        this.f8214x = 0L;
        if (g()) {
            this.i.d(this.f8212v, this.f8213w);
        }
    }

    private boolean d() {
        return !f();
    }

    private boolean e() {
        return this.f8207q == this.f8202l;
    }

    private boolean f() {
        return this.f8207q == this.f8200j;
    }

    private boolean g() {
        return this.f8207q == this.f8201k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void h() {
        com.anythink.basead.exoplayer.j.h hVar = this.f8207q;
        if (hVar == null) {
            return;
        }
        try {
            hVar.b();
        } finally {
            this.f8207q = null;
            this.f8208r = false;
            e eVar = this.f8215y;
            if (eVar != null) {
                this.i.a(eVar);
                this.f8215y = null;
            }
        }
    }

    private static void i() {
    }

    private void j() {
        if (this.f8203m == null || this.f8198B <= 0) {
            return;
        }
        this.i.c();
        this.f8198B = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: IOException -> 0x0038, TryCatch #0 {IOException -> 0x0038, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x0033, B:13:0x0047, B:17:0x0052, B:19:0x0060, B:22:0x006c, B:23:0x0071, B:25:0x0074, B:27:0x0072, B:28:0x003a, B:30:0x003e, B:34:0x001a), top: B:1:0x0000 }] */
    @Override // com.anythink.basead.exoplayer.j.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(com.anythink.basead.exoplayer.j.k kVar) {
        boolean z8;
        long j9;
        long b9;
        try {
            String a9 = f.a(kVar);
            this.f8212v = a9;
            Uri uri = kVar.f8294c;
            this.f8209s = uri;
            Uri uri2 = null;
            String a10 = this.i.c(a9).a("exo_redir", (String) null);
            if (a10 != null) {
                uri2 = Uri.parse(a10);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f8210t = uri;
            this.f8211u = kVar.i;
            this.f8213w = kVar.f8297f;
            if ((!this.f8205o || !this.f8216z) && (!this.f8206p || kVar.f8298g != -1)) {
                z8 = false;
                this.f8197A = z8;
                j9 = kVar.f8298g;
                if (j9 == -1 && !z8) {
                    b9 = this.i.b(this.f8212v);
                    this.f8214x = b9;
                    if (b9 != -1) {
                        long j10 = b9 - kVar.f8297f;
                        this.f8214x = j10;
                        if (j10 <= 0) {
                            throw new com.anythink.basead.exoplayer.j.i();
                        }
                    }
                    a(false);
                    return this.f8214x;
                }
                this.f8214x = j9;
                a(false);
                return this.f8214x;
            }
            z8 = true;
            this.f8197A = z8;
            j9 = kVar.f8298g;
            if (j9 == -1) {
                b9 = this.i.b(this.f8212v);
                this.f8214x = b9;
                if (b9 != -1) {
                }
                a(false);
                return this.f8214x;
            }
            this.f8214x = j9;
            a(false);
            return this.f8214x;
        } catch (IOException e6) {
            b(e6);
            throw e6;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8209s = null;
        this.f8210t = null;
        if (this.f8203m != null && this.f8198B > 0) {
            this.i.c();
            this.f8198B = 0L;
        }
        try {
            h();
        } catch (IOException e6) {
            b(e6);
            throw e6;
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
        this.f8200j = hVar2;
        this.f8204n = (i & 1) != 0;
        this.f8205o = (i & 2) != 0;
        this.f8206p = (i & 4) != 0;
        this.f8202l = hVar;
        this.f8201k = new z(hVar, gVar);
        this.f8203m = bVar;
    }

    private void b(IOException iOException) {
        if (f() || (iOException instanceof a.C0033a)) {
            this.f8216z = true;
        }
    }

    private int b(com.anythink.basead.exoplayer.j.k kVar) {
        if (this.f8205o && this.f8216z) {
            return 0;
        }
        return (this.f8206p && kVar.f8298g == -1) ? 1 : -1;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (this.f8214x == 0) {
            return -1;
        }
        try {
            if (this.f8213w >= this.f8199C) {
                a(true);
            }
            int a9 = this.f8207q.a(bArr, i, i4);
            if (a9 != -1) {
                if (f()) {
                    this.f8198B += a9;
                }
                long j9 = a9;
                this.f8213w += j9;
                long j10 = this.f8214x;
                if (j10 != -1) {
                    this.f8214x = j10 - j9;
                    return a9;
                }
            } else {
                if (this.f8208r) {
                    c();
                    return a9;
                }
                long j11 = this.f8214x;
                if (j11 <= 0) {
                    if (j11 == -1) {
                    }
                }
                h();
                a(false);
                return a(bArr, i, i4);
            }
            return a9;
        } catch (IOException e6) {
            if (this.f8208r) {
                for (Throwable th = e6; th != null; th = th.getCause()) {
                    if ((th instanceof com.anythink.basead.exoplayer.j.i) && ((com.anythink.basead.exoplayer.j.i) th).f8285b == 0) {
                        c();
                        return -1;
                    }
                }
            }
            b(e6);
            throw e6;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8210t;
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
    private void a(boolean z8) {
        e a9;
        long j9;
        com.anythink.basead.exoplayer.j.k kVar;
        e eVar;
        com.anythink.basead.exoplayer.j.h hVar;
        com.anythink.basead.exoplayer.j.k kVar2;
        long a10;
        k kVar3;
        if (this.f8197A) {
            a9 = null;
        } else if (this.f8204n) {
            try {
                a9 = this.i.a(this.f8212v, this.f8213w);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            a9 = this.i.b(this.f8212v, this.f8213w);
        }
        if (a9 == null) {
            hVar = this.f8202l;
            kVar2 = new com.anythink.basead.exoplayer.j.k(this.f8209s, this.f8213w, this.f8214x, this.f8212v, this.f8211u);
        } else if (a9.f8220d) {
            Uri fromFile = Uri.fromFile(a9.f8221e);
            long j10 = this.f8213w - a9.f8218b;
            long j11 = a9.f8219c - j10;
            long j12 = this.f8214x;
            if (j12 != -1) {
                j11 = Math.min(j11, j12);
            }
            kVar2 = new com.anythink.basead.exoplayer.j.k(fromFile, this.f8213w, j10, j11, this.f8212v, this.f8211u);
            hVar = this.f8200j;
        } else {
            if (a9.a()) {
                j9 = this.f8214x;
            } else {
                j9 = a9.f8219c;
                long j13 = this.f8214x;
                if (j13 != -1) {
                    j9 = Math.min(j9, j13);
                }
            }
            kVar = new com.anythink.basead.exoplayer.j.k(this.f8209s, this.f8213w, j9, this.f8212v, this.f8211u);
            com.anythink.basead.exoplayer.j.h hVar2 = this.f8201k;
            if (hVar2 == null) {
                com.anythink.basead.exoplayer.j.h hVar3 = this.f8202l;
                this.i.a(a9);
                eVar = null;
                hVar = hVar3;
                this.f8199C = (this.f8197A && hVar == this.f8202l) ? this.f8213w + f8196h : Long.MAX_VALUE;
                if (z8) {
                }
                if (eVar != null) {
                    this.f8215y = eVar;
                }
                this.f8207q = hVar;
                this.f8208r = kVar.f8298g == -1;
                a10 = hVar.a(kVar);
                kVar3 = new k();
                if (this.f8208r) {
                    this.f8214x = a10;
                    j.a(kVar3, this.f8213w + a10);
                }
                if (d()) {
                }
                if (g()) {
                }
            } else {
                hVar = hVar2;
                eVar = a9;
                this.f8199C = (this.f8197A && hVar == this.f8202l) ? this.f8213w + f8196h : Long.MAX_VALUE;
                if (z8) {
                    C0544a.b(e());
                    if (hVar == this.f8202l) {
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
                    this.f8215y = eVar;
                }
                this.f8207q = hVar;
                this.f8208r = kVar.f8298g == -1;
                a10 = hVar.a(kVar);
                kVar3 = new k();
                if (this.f8208r && a10 != -1) {
                    this.f8214x = a10;
                    j.a(kVar3, this.f8213w + a10);
                }
                if (d()) {
                    Uri a11 = this.f8207q.a();
                    this.f8210t = a11;
                    if (!this.f8209s.equals(a11)) {
                        j.a(kVar3, this.f8210t);
                    } else {
                        kVar3.a("exo_redir");
                    }
                }
                if (g()) {
                    this.i.a(this.f8212v, kVar3);
                    return;
                }
                return;
            }
        }
        kVar = kVar2;
        eVar = a9;
        this.f8199C = (this.f8197A && hVar == this.f8202l) ? this.f8213w + f8196h : Long.MAX_VALUE;
        if (z8) {
        }
        if (eVar != null) {
        }
        this.f8207q = hVar;
        this.f8208r = kVar.f8298g == -1;
        a10 = hVar.a(kVar);
        kVar3 = new k();
        if (this.f8208r) {
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
            if ((iOException2 instanceof com.anythink.basead.exoplayer.j.i) && ((com.anythink.basead.exoplayer.j.i) iOException2).f8285b == 0) {
                return true;
            }
        }
        return false;
    }
}
