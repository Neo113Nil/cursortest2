package com.anythink.basead.exoplayer.j;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final h f8129a;

    /* renamed from: b, reason: collision with root package name */
    private final k f8130b;

    /* renamed from: f, reason: collision with root package name */
    private long f8134f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8132d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8133e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8131c = new byte[1];

    public j(h hVar, k kVar) {
        this.f8129a = hVar;
        this.f8130b = kVar;
    }

    private void c() {
        if (this.f8132d) {
            return;
        }
        this.f8129a.a(this.f8130b);
        this.f8132d = true;
    }

    public final long a() {
        return this.f8134f;
    }

    public final void b() {
        c();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8133e) {
            return;
        }
        this.f8129a.b();
        this.f8133e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f8131c) == -1) {
            return -1;
        }
        return this.f8131c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8133e);
        c();
        int a9 = this.f8129a.a(bArr, i, i6);
        if (a9 == -1) {
            return -1;
        }
        this.f8134f += a9;
        return a9;
    }
}
