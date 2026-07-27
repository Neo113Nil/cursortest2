package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class u implements f {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6865b;

    /* renamed from: c, reason: collision with root package name */
    private int f6866c;

    /* renamed from: d, reason: collision with root package name */
    private int f6867d;

    /* renamed from: e, reason: collision with root package name */
    private int f6868e;

    /* renamed from: f, reason: collision with root package name */
    private int f6869f;

    /* renamed from: g, reason: collision with root package name */
    private int f6870g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6871h;
    private ByteBuffer i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f6872j;

    /* renamed from: k, reason: collision with root package name */
    private int f6873k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6874l;

    public u() {
        ByteBuffer byteBuffer = f.f6597a;
        this.f6871h = byteBuffer;
        this.i = byteBuffer;
        this.f6868e = -1;
        this.f6869f = -1;
        this.f6872j = new byte[0];
    }

    public final void a(int i, int i4) {
        this.f6866c = i;
        this.f6867d = i4;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f6868e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6869f;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f6874l = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.i;
        this.i = f.f6597a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f6874l && this.i == f.f6597a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.i = f.f6597a;
        this.f6874l = false;
        this.f6870g = 0;
        this.f6873k = 0;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f6871h = f.f6597a;
        this.f6868e = -1;
        this.f6869f = -1;
        this.f6872j = new byte[0];
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i9) {
        if (i9 == 2) {
            this.f6868e = i4;
            this.f6869f = i;
            int i10 = this.f6867d;
            this.f6872j = new byte[i10 * i4 * 2];
            this.f6873k = 0;
            int i11 = this.f6866c;
            this.f6870g = i4 * i11 * 2;
            boolean z8 = this.f6865b;
            boolean z9 = (i11 == 0 && i10 == 0) ? false : true;
            this.f6865b = z9;
            return z8 != z9;
        }
        throw new f.a(i, i4, i9);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f6865b;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.f6870g);
        this.f6870g -= min;
        byteBuffer.position(position + min);
        if (this.f6870g > 0) {
            return;
        }
        int i4 = i - min;
        int length = (this.f6873k + i4) - this.f6872j.length;
        if (this.f6871h.capacity() < length) {
            this.f6871h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f6871h.clear();
        }
        int a9 = af.a(length, 0, this.f6873k);
        this.f6871h.put(this.f6872j, 0, a9);
        int a10 = af.a(length - a9, 0, i4);
        byteBuffer.limit(byteBuffer.position() + a10);
        this.f6871h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i4 - a10;
        int i10 = this.f6873k - a9;
        this.f6873k = i10;
        byte[] bArr = this.f6872j;
        System.arraycopy(bArr, a9, bArr, 0, i10);
        byteBuffer.get(this.f6872j, this.f6873k, i9);
        this.f6873k += i9;
        this.f6871h.flip();
        this.i = this.f6871h;
    }
}
