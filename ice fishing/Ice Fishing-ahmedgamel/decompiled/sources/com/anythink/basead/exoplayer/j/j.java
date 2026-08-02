package com.anythink.basead.exoplayer.j;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final h f8915a;

    /* renamed from: b, reason: collision with root package name */
    private final k f8916b;

    /* renamed from: f, reason: collision with root package name */
    private long f8920f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8918d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8919e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8917c = new byte[1];

    public j(h hVar, k kVar) {
        this.f8915a = hVar;
        this.f8916b = kVar;
    }

    private void c() {
        if (this.f8918d) {
            return;
        }
        this.f8915a.a(this.f8916b);
        this.f8918d = true;
    }

    public final long a() {
        return this.f8920f;
    }

    public final void b() {
        c();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8919e) {
            return;
        }
        this.f8915a.b();
        this.f8919e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f8917c) == -1) {
            return -1;
        }
        return this.f8917c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8919e);
        c();
        int a9 = this.f8915a.a(bArr, i, i4);
        if (a9 == -1) {
            return -1;
        }
        this.f8920f += a9;
        return a9;
    }
}
