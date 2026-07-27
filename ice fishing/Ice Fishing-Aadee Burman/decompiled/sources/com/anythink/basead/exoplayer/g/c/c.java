package com.anythink.basead.exoplayer.g.c;

import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.r;
import com.anythink.basead.exoplayer.k.s;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c implements com.anythink.basead.exoplayer.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7341a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7342b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7343c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7344d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7345e = 255;

    /* renamed from: f, reason: collision with root package name */
    private final s f7346f = new s();

    /* renamed from: g, reason: collision with root package name */
    private final r f7347g = new r();

    /* renamed from: h, reason: collision with root package name */
    private ac f7348h;

    @Override // com.anythink.basead.exoplayer.g.b
    public final com.anythink.basead.exoplayer.g.a a(com.anythink.basead.exoplayer.g.e eVar) {
        ac acVar = this.f7348h;
        if (acVar == null || eVar.f7380g != acVar.a()) {
            ac acVar2 = new ac(eVar.f6743f);
            this.f7348h = acVar2;
            acVar2.b(eVar.f6743f - eVar.f7380g);
        }
        ByteBuffer byteBuffer = eVar.f6742e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f7346f.a(array, limit);
        this.f7347g.a(array, limit);
        this.f7347g.b(39);
        long c9 = (this.f7347g.c(1) << 32) | this.f7347g.c(32);
        this.f7347g.b(20);
        int c10 = this.f7347g.c(12);
        int c11 = this.f7347g.c(8);
        this.f7346f.d(14);
        a.InterfaceC0025a a9 = c11 != 0 ? c11 != 255 ? c11 != 4 ? c11 != 5 ? c11 != 6 ? null : g.a(this.f7346f, c9, this.f7348h) : d.a(this.f7346f, c9, this.f7348h) : f.a(this.f7346f) : a.a(this.f7346f, c10, c9) : new e();
        return a9 == null ? new com.anythink.basead.exoplayer.g.a(new a.InterfaceC0025a[0]) : new com.anythink.basead.exoplayer.g.a(a9);
    }
}
