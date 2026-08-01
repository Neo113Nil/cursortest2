package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Lg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2656Lg implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final ByteBuffer f26126n;

    public C2656Lg(ByteBuffer byteBuffer) {
        this.f26126n = byteBuffer.duplicate();
    }

    public final int a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f26126n;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final long b() {
        return this.f26126n.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
