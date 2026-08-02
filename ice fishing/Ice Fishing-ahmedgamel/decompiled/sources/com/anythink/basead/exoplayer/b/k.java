package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class k implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f7300b;

    /* renamed from: c, reason: collision with root package name */
    private int f7301c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f7302d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7303e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f7304f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f7305g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f7306h;
    private boolean i;

    public k() {
        ByteBuffer byteBuffer = f.f7226a;
        this.f7305g = byteBuffer;
        this.f7306h = byteBuffer;
        this.f7300b = -1;
        this.f7301c = -1;
    }

    public final void a(int[] iArr) {
        this.f7302d = iArr;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        int[] iArr = this.f7304f;
        return iArr == null ? this.f7300b : iArr.length;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f7301c;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.i = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7306h;
        this.f7306h = f.f7226a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.i && this.f7306h == f.f7226a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f7306h = f.f7226a;
        this.i = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f7305g = f.f7226a;
        this.f7300b = -1;
        this.f7301c = -1;
        this.f7304f = null;
        this.f7302d = null;
        this.f7303e = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i6) {
        boolean equals = Arrays.equals(this.f7302d, this.f7304f);
        boolean z6 = !equals;
        int[] iArr = this.f7302d;
        this.f7304f = iArr;
        if (iArr == null) {
            this.f7303e = false;
            return z6;
        }
        if (i6 != 2) {
            throw new f.a(i, i4, i6);
        }
        if (equals && this.f7301c == i && this.f7300b == i4) {
            return false;
        }
        this.f7301c = i;
        this.f7300b = i4;
        this.f7303e = i4 != iArr.length;
        int i9 = 0;
        while (true) {
            int[] iArr2 = this.f7304f;
            if (i9 >= iArr2.length) {
                return true;
            }
            int i10 = iArr2[i9];
            if (i10 >= i4) {
                throw new f.a(i, i4, i6);
            }
            this.f7303e = (i10 != i9) | this.f7303e;
            i9++;
        }
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f7303e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        com.anythink.basead.exoplayer.k.a.b(this.f7304f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f7300b * 2)) * this.f7304f.length * 2;
        if (this.f7305g.capacity() < length) {
            this.f7305g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7305g.clear();
        }
        while (position < limit) {
            for (int i : this.f7304f) {
                this.f7305g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f7300b * 2;
        }
        byteBuffer.position(limit);
        this.f7305g.flip();
        this.f7306h = this.f7305g;
    }
}
