package com.anythink.basead.exoplayer.g.c;

import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.r;
import com.anythink.basead.exoplayer.k.s;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c implements com.anythink.basead.exoplayer.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7498a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7499b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7500c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7501d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7502e = 255;

    /* renamed from: f, reason: collision with root package name */
    private final s f7503f = new s();

    /* renamed from: g, reason: collision with root package name */
    private final r f7504g = new r();

    /* renamed from: h, reason: collision with root package name */
    private ac f7505h;

    @Override // com.anythink.basead.exoplayer.g.b
    public final com.anythink.basead.exoplayer.g.a a(com.anythink.basead.exoplayer.g.e eVar) {
        ac acVar = this.f7505h;
        if (acVar == null || eVar.f7537g != acVar.a()) {
            ac acVar2 = new ac(eVar.f6900f);
            this.f7505h = acVar2;
            acVar2.b(eVar.f6900f - eVar.f7537g);
        }
        ByteBuffer byteBuffer = eVar.f6899e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f7503f.a(array, limit);
        this.f7504g.a(array, limit);
        this.f7504g.b(39);
        long c4 = (this.f7504g.c(1) << 32) | this.f7504g.c(32);
        this.f7504g.b(20);
        int c9 = this.f7504g.c(12);
        int c10 = this.f7504g.c(8);
        this.f7503f.d(14);
        a.InterfaceC0024a a9 = c10 != 0 ? c10 != 255 ? c10 != 4 ? c10 != 5 ? c10 != 6 ? null : g.a(this.f7503f, c4, this.f7505h) : d.a(this.f7503f, c4, this.f7505h) : f.a(this.f7503f) : a.a(this.f7503f, c9, c4) : new e();
        return a9 == null ? new com.anythink.basead.exoplayer.g.a(new a.InterfaceC0024a[0]) : new com.anythink.basead.exoplayer.g.a(a9);
    }
}
