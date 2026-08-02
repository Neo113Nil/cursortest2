package com.anythink.basead.exoplayer.c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f7546c;

    /* renamed from: d, reason: collision with root package name */
    private final g<?, h, ?> f7547d;

    private h(g<?, h, ?> gVar) {
        this.f7547d = gVar;
    }

    private ByteBuffer a(long j6, int i) {
        ((f) this).f7531a = j6;
        ByteBuffer byteBuffer = this.f7546c;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f7546c = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f7546c.position(0);
        this.f7546c.limit(i);
        return this.f7546c;
    }

    @Override // com.anythink.basead.exoplayer.c.f
    public final void e() {
        this.f7547d.a((g<?, h, ?>) this);
    }

    @Override // com.anythink.basead.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f7546c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
