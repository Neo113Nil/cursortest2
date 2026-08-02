package com.anythink.basead.exoplayer.c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e extends com.anythink.basead.exoplayer.c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7524a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7525b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7526c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final b f7527d = new b();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f7528e;

    /* renamed from: f, reason: collision with root package name */
    public long f7529f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7530g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(int i) {
        this.f7530g = i;
    }

    public static e e() {
        return new e(0);
    }

    @Override // com.anythink.basead.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f7528e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.f7528e;
        if (byteBuffer == null) {
            this.f7528e = e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f7528e.position();
        int i4 = i + position;
        if (capacity >= i4) {
            return;
        }
        ByteBuffer e9 = e(i4);
        if (position > 0) {
            this.f7528e.position(0);
            this.f7528e.limit(position);
            e9.put(this.f7528e);
        }
        this.f7528e = e9;
    }

    public final boolean f() {
        return this.f7528e == null && this.f7530g == 0;
    }

    public final boolean g() {
        return c(1073741824);
    }

    public final void h() {
        this.f7528e.flip();
    }

    private ByteBuffer e(int i) {
        int i4 = this.f7530g;
        if (i4 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i4 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f7528e;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }
}
