package com.anythink.basead.exoplayer.j.a;

import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import com.anythink.basead.exoplayer.k.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b implements com.anythink.basead.exoplayer.j.g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8178a = 20480;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.a.a f8179b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8180c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8181d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8182e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.basead.exoplayer.j.k f8183f;

    /* renamed from: g, reason: collision with root package name */
    private File f8184g;

    /* renamed from: h, reason: collision with root package name */
    private OutputStream f8185h;
    private FileOutputStream i;

    /* renamed from: j, reason: collision with root package name */
    private long f8186j;

    /* renamed from: k, reason: collision with root package name */
    private long f8187k;

    /* renamed from: l, reason: collision with root package name */
    private x f8188l;

    public static class a extends a.C0033a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.anythink.basead.exoplayer.j.a.a aVar) {
        this(aVar, c.f8189a, f8178a, true);
    }

    private void b() {
        long j9 = this.f8183f.f8298g;
        if (j9 != -1) {
            Math.min(j9 - this.f8187k, this.f8180c);
        }
        com.anythink.basead.exoplayer.j.a.a aVar = this.f8179b;
        com.anythink.basead.exoplayer.j.k kVar = this.f8183f;
        this.f8184g = aVar.c(kVar.f8299h, kVar.f8296e + this.f8187k);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f8184g);
        this.i = fileOutputStream;
        if (this.f8181d > 0) {
            x xVar = this.f8188l;
            if (xVar == null) {
                this.f8188l = new x(this.i, this.f8181d);
            } else {
                xVar.a(fileOutputStream);
            }
            this.f8185h = this.f8188l;
        } else {
            this.f8185h = fileOutputStream;
        }
        this.f8186j = 0L;
    }

    private void c() {
        OutputStream outputStream = this.f8185h;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.f8182e) {
                this.i.getFD().sync();
            }
            af.a(this.f8185h);
            this.f8185h = null;
            File file = this.f8184g;
            this.f8184g = null;
            this.f8179b.a(file);
        } catch (Throwable th) {
            af.a(this.f8185h);
            this.f8185h = null;
            File file2 = this.f8184g;
            this.f8184g = null;
            file2.delete();
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a(com.anythink.basead.exoplayer.j.k kVar) {
        if (kVar.f8298g == -1 && !kVar.a(2)) {
            this.f8183f = null;
            return;
        }
        this.f8183f = kVar;
        this.f8187k = 0L;
        try {
            b();
        } catch (IOException e6) {
            throw new a(e6);
        }
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j9, boolean z8) {
        this(aVar, j9, f8178a, z8);
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j9, int i) {
        this(aVar, j9, i, true);
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j9, int i, boolean z8) {
        this.f8179b = (com.anythink.basead.exoplayer.j.a.a) C0544a.a(aVar);
        this.f8180c = j9;
        this.f8181d = i;
        this.f8182e = z8;
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a(byte[] bArr, int i, int i4) {
        if (this.f8183f == null) {
            return;
        }
        int i9 = 0;
        while (i9 < i4) {
            try {
                if (this.f8186j == this.f8180c) {
                    c();
                    b();
                }
                int min = (int) Math.min(i4 - i9, this.f8180c - this.f8186j);
                this.f8185h.write(bArr, i + i9, min);
                i9 += min;
                long j9 = min;
                this.f8186j += j9;
                this.f8187k += j9;
            } catch (IOException e6) {
                throw new a(e6);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a() {
        if (this.f8183f == null) {
            return;
        }
        try {
            c();
        } catch (IOException e6) {
            throw new a(e6);
        }
    }
}
