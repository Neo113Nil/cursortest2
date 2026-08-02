package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class n implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final int f7376b = Float.floatToIntBits(Float.NaN);

    /* renamed from: c, reason: collision with root package name */
    private static final double f7377c = 4.656612875245797E-10d;

    /* renamed from: d, reason: collision with root package name */
    private int f7378d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f7379e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f7380f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f7381g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f7382h;
    private boolean i;

    public n() {
        ByteBuffer byteBuffer = f.f7226a;
        this.f7381g = byteBuffer;
        this.f7382h = byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i6) {
        if (!af.c(i6)) {
            throw new f.a(i, i4, i6);
        }
        if (this.f7378d == i && this.f7379e == i4 && this.f7380f == i6) {
            return false;
        }
        this.f7378d = i;
        this.f7379e = i4;
        this.f7380f = i6;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f7379e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 4;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f7378d;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.i = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7382h;
        this.f7382h = f.f7226a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.i && this.f7382h == f.f7226a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f7382h = f.f7226a;
        this.i = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f7378d = -1;
        this.f7379e = -1;
        this.f7380f = 0;
        this.f7381g = f.f7226a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return af.c(this.f7380f);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        boolean z6 = this.f7380f == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z6) {
            i = (i / 3) * 4;
        }
        if (this.f7381g.capacity() < i) {
            this.f7381g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7381g.clear();
        }
        if (z6) {
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.f7381g);
                position += 4;
            }
        } else {
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.f7381g);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f7381g.flip();
        this.f7382h = this.f7381g;
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * f7377c));
        if (floatToIntBits == f7376b) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
