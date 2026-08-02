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
    public static final int f8807a = 20480;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.a.a f8808b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8809c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8810d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8811e;

    /* renamed from: f, reason: collision with root package name */
    private com.anythink.basead.exoplayer.j.k f8812f;

    /* renamed from: g, reason: collision with root package name */
    private File f8813g;

    /* renamed from: h, reason: collision with root package name */
    private OutputStream f8814h;
    private FileOutputStream i;

    /* renamed from: j, reason: collision with root package name */
    private long f8815j;

    /* renamed from: k, reason: collision with root package name */
    private long f8816k;

    /* renamed from: l, reason: collision with root package name */
    private x f8817l;

    public static class a extends a.C0034a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.anythink.basead.exoplayer.j.a.a aVar) {
        this(aVar, c.f8818a, f8807a, true);
    }

    private void b() {
        long j6 = this.f8812f.f8927g;
        if (j6 != -1) {
            Math.min(j6 - this.f8816k, this.f8809c);
        }
        com.anythink.basead.exoplayer.j.a.a aVar = this.f8808b;
        com.anythink.basead.exoplayer.j.k kVar = this.f8812f;
        this.f8813g = aVar.c(kVar.f8928h, kVar.f8925e + this.f8816k);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f8813g);
        this.i = fileOutputStream;
        if (this.f8810d > 0) {
            x xVar = this.f8817l;
            if (xVar == null) {
                this.f8817l = new x(this.i, this.f8810d);
            } else {
                xVar.a(fileOutputStream);
            }
            this.f8814h = this.f8817l;
        } else {
            this.f8814h = fileOutputStream;
        }
        this.f8815j = 0L;
    }

    private void c() {
        OutputStream outputStream = this.f8814h;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.f8811e) {
                this.i.getFD().sync();
            }
            af.a(this.f8814h);
            this.f8814h = null;
            File file = this.f8813g;
            this.f8813g = null;
            this.f8808b.a(file);
        } catch (Throwable th) {
            af.a(this.f8814h);
            this.f8814h = null;
            File file2 = this.f8813g;
            this.f8813g = null;
            file2.delete();
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a(com.anythink.basead.exoplayer.j.k kVar) {
        if (kVar.f8927g == -1 && !kVar.a(2)) {
            this.f8812f = null;
            return;
        }
        this.f8812f = kVar;
        this.f8816k = 0L;
        try {
            b();
        } catch (IOException e9) {
            throw new a(e9);
        }
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j6, boolean z6) {
        this(aVar, j6, f8807a, z6);
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j6, int i) {
        this(aVar, j6, i, true);
    }

    private b(com.anythink.basead.exoplayer.j.a.a aVar, long j6, int i, boolean z6) {
        this.f8808b = (com.anythink.basead.exoplayer.j.a.a) com.anythink.basead.exoplayer.k.a.a(aVar);
        this.f8809c = j6;
        this.f8810d = i;
        this.f8811e = z6;
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a(byte[] bArr, int i, int i4) {
        if (this.f8812f == null) {
            return;
        }
        int i6 = 0;
        while (i6 < i4) {
            try {
                if (this.f8815j == this.f8809c) {
                    c();
                    b();
                }
                int min = (int) Math.min(i4 - i6, this.f8809c - this.f8815j);
                this.f8814h.write(bArr, i + i6, min);
                i6 += min;
                long j6 = min;
                this.f8815j += j6;
                this.f8816k += j6;
            } catch (IOException e9) {
                throw new a(e9);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.g
    public final void a() {
        if (this.f8812f == null) {
            return;
        }
        try {
            c();
        } catch (IOException e9) {
            throw new a(e9);
        }
    }
}
