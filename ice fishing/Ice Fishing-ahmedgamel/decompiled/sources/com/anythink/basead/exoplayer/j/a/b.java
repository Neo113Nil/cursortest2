package com.anythink.basead.exoplayer.j.a;

import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b implements com.anythink.basead.exoplayer.j.g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8021a = 20480;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.a.a f8022b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8023c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8024d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8025e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.basead.exoplayer.j.k f8026f;

    /* renamed from: g, reason: collision with root package name */
    private File f8027g;

    /* renamed from: h, reason: collision with root package name */
    private OutputStream f8028h;
    private FileOutputStream i;

    /* renamed from: j, reason: collision with root package name */
    private long f8029j;

    /* renamed from: k, reason: collision with root package name */
    private long f8030k;

    /* renamed from: l, reason: collision with root package name */
    private x f8031l;

    public static class a extends a.C0034a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.anythink.basead.exoplayer.j.a.a aVar) {
        this(aVar, c.f8032a, f8021a, true);
    }

    private void b() {
        long j6 = this.f8026f.f8141g;
        if (j6 != -1) {
            Math.min(j6 - this.f8030k, this.f8023c);
        }
        com.anythink.basead.exoplayer.j.a.a aVar = this.f8022b;
        com.anythink.basead.exoplayer.j.k kVar = this.f8026f;
        this.f8027g = aVar.c(kVar.f8142h, kVar.f8139e + this.f8030k);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f8027g);
        this.i = fileOutputStream;
        if (this.f8024d > 0) {
            x xVar = this.f8031l;
            if (xVar == null) {
                this.f8031l = new x(this.i, this.f8024d);
            } else {
                xVar.a(fileOutputStream);
            }
            this.f8028h = this.f8031l;
        } else {
            this.f8028h = fileOutputStream;
        }
        this.f8029j = 0L;
    }

    private void c() {
        OutputStream outputStream = this.f8028h;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.f8025e) {
                this.i.getFD().sync();
            }
            af.a(this.f8028h);
            this.f8028h = null;
            File file = this.f8027g;
            this.f8027g = null;
            this.f8022b.a(file);
        } catch (Throwable th) {
            af.a(this.f8028h);
            this.f8028h = null;
            File file2 = this.f8027g;
            this.f8027g = null;
            file2.delete();
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a(com.anythink.basead.exoplayer.j.k kVar) {
        if (kVar.f8141g == -1 && !kVar.a(2)) {
            this.f8026f = null;
            return;
        }
        this.f8026f = kVar;
        this.f8030k = 0L;
        try {
            b();
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j6, boolean z3) {
        this(aVar, j6, f8021a, z3);
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j6, int i) {
        this(aVar, j6, i, true);
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j6, int i, boolean z3) {
        this.f8022b = (com.anythink.basead.exoplayer.j.a.a) com.anythink.basead.exoplayer.k.a.a(aVar);
        this.f8023c = j6;
        this.f8024d = i;
        this.f8025e = z3;
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a(byte[] bArr, int i, int i6) {
        if (this.f8026f == null) {
            return;
        }
        int i9 = 0;
        while (i9 < i6) {
            try {
                if (this.f8029j == this.f8023c) {
                    c();
                    b();
                }
                int min = (int) Math.min(i6 - i9, this.f8023c - this.f8029j);
                this.f8028h.write(bArr, i + i9, min);
                i9 += min;
                long j6 = min;
                this.f8029j += j6;
                this.f8030k += j6;
            } catch (IOException e9) {
                throw new a(e9);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a() {
        if (this.f8026f == null) {
            return;
        }
        try {
            c();
        } catch (IOException e9) {
            throw new a(e9);
        }
    }
}
