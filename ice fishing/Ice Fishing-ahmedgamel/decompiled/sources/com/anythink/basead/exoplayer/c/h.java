package com.anythink.basead.exoplayer.c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f6760c;

    /* renamed from: d, reason: collision with root package name */
    private final g<?, h, ?> f6761d;

    private h(g<?, h, ?> gVar) {
        this.f6761d = gVar;
    }

    private ByteBuffer a(long j6, int i) {
        ((f) this).f6745a = j6;
        ByteBuffer byteBuffer = this.f6760c;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f6760c = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f6760c.position(0);
        this.f6760c.limit(i);
        return this.f6760c;
    }

    @Override // com.anythink.basead.exoplayer.c.f
    public final void e() {
        this.f6761d.a((g<?, h, ?>) this);
    }

    @Override // com.anythink.basead.exoplayer.c.a
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f6760c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
