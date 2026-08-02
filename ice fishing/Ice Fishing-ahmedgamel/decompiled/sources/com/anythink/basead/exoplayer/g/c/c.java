package com.anythink.basead.exoplayer.g.c;

import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.r;
import com.anythink.basead.exoplayer.k.s;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c implements com.anythink.basead.exoplayer.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8127a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8128b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8129c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8130d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8131e = 255;

    /* renamed from: f, reason: collision with root package name */
    private final s f8132f = new s();

    /* renamed from: g, reason: collision with root package name */
    private final r f8133g = new r();

    /* renamed from: h, reason: collision with root package name */
    private ac f8134h;

    @Override // com.anythink.basead.exoplayer.g.b
    public final com.anythink.basead.exoplayer.g.a a(com.anythink.basead.exoplayer.g.e eVar) {
        ac acVar = this.f8134h;
        if (acVar == null || eVar.f8166g != acVar.a()) {
            ac acVar2 = new ac(eVar.f7529f);
            this.f8134h = acVar2;
            acVar2.b(eVar.f7529f - eVar.f8166g);
        }
        ByteBuffer byteBuffer = eVar.f7528e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f8132f.a(array, limit);
        this.f8133g.a(array, limit);
        this.f8133g.b(39);
        long c9 = (this.f8133g.c(1) << 32) | this.f8133g.c(32);
        this.f8133g.b(20);
        int c10 = this.f8133g.c(12);
        int c11 = this.f8133g.c(8);
        this.f8132f.d(14);
        a.InterfaceC0025a a9 = c11 != 0 ? c11 != 255 ? c11 != 4 ? c11 != 5 ? c11 != 6 ? null : g.a(this.f8132f, c9, this.f8134h) : d.a(this.f8132f, c9, this.f8134h) : f.a(this.f8132f) : a.a(this.f8132f, c10, c9) : new e();
        return a9 == null ? new com.anythink.basead.exoplayer.g.a(new a.InterfaceC0025a[0]) : new com.anythink.basead.exoplayer.g.a(a9);
    }
}
