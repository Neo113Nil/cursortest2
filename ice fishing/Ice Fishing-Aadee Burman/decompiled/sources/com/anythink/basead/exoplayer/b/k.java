package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class k implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f6514b;

    /* renamed from: c, reason: collision with root package name */
    private int f6515c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f6516d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6517e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f6518f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f6519g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6520h;
    private boolean i;

    public k() {
        ByteBuffer byteBuffer = f.f6440a;
        this.f6519g = byteBuffer;
        this.f6520h = byteBuffer;
        this.f6514b = -1;
        this.f6515c = -1;
    }

    public final void a(int[] iArr) {
        this.f6516d = iArr;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        int[] iArr = this.f6518f;
        return iArr == null ? this.f6514b : iArr.length;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6515c;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.i = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6520h;
        this.f6520h = f.f6440a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.i && this.f6520h == f.f6440a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f6520h = f.f6440a;
        this.i = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f6519g = f.f6440a;
        this.f6514b = -1;
        this.f6515c = -1;
        this.f6518f = null;
        this.f6516d = null;
        this.f6517e = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i6, int i9) {
        boolean equals = Arrays.equals(this.f6516d, this.f6518f);
        boolean z3 = !equals;
        int[] iArr = this.f6516d;
        this.f6518f = iArr;
        if (iArr == null) {
            this.f6517e = false;
            return z3;
        }
        if (i9 != 2) {
            throw new f.a(i, i6, i9);
        }
        if (equals && this.f6515c == i && this.f6514b == i6) {
            return false;
        }
        this.f6515c = i;
        this.f6514b = i6;
        this.f6517e = i6 != iArr.length;
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f6518f;
            if (i10 >= iArr2.length) {
                return true;
            }
            int i11 = iArr2[i10];
            if (i11 >= i6) {
                throw new f.a(i, i6, i9);
            }
            this.f6517e = (i11 != i10) | this.f6517e;
            i10++;
        }
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f6517e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        com.anythink.basead.exoplayer.k.a.b(this.f6518f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f6514b * 2)) * this.f6518f.length * 2;
        if (this.f6519g.capacity() < length) {
            this.f6519g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f6519g.clear();
        }
        while (position < limit) {
            for (int i : this.f6518f) {
                this.f6519g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f6514b * 2;
        }
        byteBuffer.position(limit);
        this.f6519g.flip();
        this.f6520h = this.f6519g;
    }
}
