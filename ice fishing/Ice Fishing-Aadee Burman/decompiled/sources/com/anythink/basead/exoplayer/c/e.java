package com.anythink.basead.exoplayer.c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e extends com.anythink.basead.exoplayer.c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6738a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6739b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6740c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final b f6741d = new b();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f6742e;

    /* renamed from: f, reason: collision with root package name */
    public long f6743f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6744g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(int i) {
        this.f6744g = i;
    }

    public static e e() {
        return new e(0);
    }

    @Override // com.anythink.basead.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f6742e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void d(int i) {
        ByteBuffer byteBuffer = this.f6742e;
        if (byteBuffer == null) {
            this.f6742e = e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f6742e.position();
        int i6 = i + position;
        if (capacity >= i6) {
            return;
        }
        ByteBuffer e9 = e(i6);
        if (position > 0) {
            this.f6742e.position(0);
            this.f6742e.limit(position);
            e9.put(this.f6742e);
        }
        this.f6742e = e9;
    }

    public final boolean f() {
        return this.f6742e == null && this.f6744g == 0;
    }

    public final boolean g() {
        return c(1073741824);
    }

    public final void h() {
        this.f6742e.flip();
    }

    private ByteBuffer e(int i) {
        int i6 = this.f6744g;
        if (i6 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i6 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f6742e;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }
}
