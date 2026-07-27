package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class n implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6590b = Float.floatToIntBits(Float.NaN);

    /* renamed from: c, reason: collision with root package name */
    private static final double f6591c = 4.656612875245797E-10d;

    /* renamed from: d, reason: collision with root package name */
    private int f6592d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f6593e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f6594f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f6595g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6596h;
    private boolean i;

    public n() {
        ByteBuffer byteBuffer = f.f6440a;
        this.f6595g = byteBuffer;
        this.f6596h = byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i6, int i9) {
        if (!af.c(i9)) {
            throw new f.a(i, i6, i9);
        }
        if (this.f6592d == i && this.f6593e == i6 && this.f6594f == i9) {
            return false;
        }
        this.f6592d = i;
        this.f6593e = i6;
        this.f6594f = i9;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f6593e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 4;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6592d;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.i = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6596h;
        this.f6596h = f.f6440a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.i && this.f6596h == f.f6440a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f6596h = f.f6440a;
        this.i = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f6592d = -1;
        this.f6593e = -1;
        this.f6594f = 0;
        this.f6595g = f.f6440a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return af.c(this.f6594f);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        boolean z3 = this.f6594f == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z3) {
            i = (i / 3) * 4;
        }
        if (this.f6595g.capacity() < i) {
            this.f6595g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f6595g.clear();
        }
        if (z3) {
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.f6595g);
                position += 4;
            }
        } else {
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.f6595g);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f6595g.flip();
        this.f6596h = this.f6595g;
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * f6591c));
        if (floatToIntBits == f6590b) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
