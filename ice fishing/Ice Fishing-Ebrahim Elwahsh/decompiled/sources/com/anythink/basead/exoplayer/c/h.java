package com.anythink.basead.exoplayer.c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f6917c;

    /* renamed from: d, reason: collision with root package name */
    private final g<?, h, ?> f6918d;

    private h(g<?, h, ?> gVar) {
        this.f6918d = gVar;
    }

    private ByteBuffer a(long j9, int i) {
        ((f) this).f6902a = j9;
        ByteBuffer byteBuffer = this.f6917c;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f6917c = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f6917c.position(0);
        this.f6917c.limit(i);
        return this.f6917c;
    }

    @Override // com.anythink.basead.exoplayer.c.f
    public final void e() {
        this.f6918d.a((g<?, h, ?>) this);
    }

    @Override // com.anythink.basead.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f6917c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
