package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class u implements f {

    /* renamed from: b, reason: collision with root package name */
    private boolean f7494b;

    /* renamed from: c, reason: collision with root package name */
    private int f7495c;

    /* renamed from: d, reason: collision with root package name */
    private int f7496d;

    /* renamed from: e, reason: collision with root package name */
    private int f7497e;

    /* renamed from: f, reason: collision with root package name */
    private int f7498f;

    /* renamed from: g, reason: collision with root package name */
    private int f7499g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f7500h;
    private ByteBuffer i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f7501j;

    /* renamed from: k, reason: collision with root package name */
    private int f7502k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7503l;

    public u() {
        ByteBuffer byteBuffer = f.f7226a;
        this.f7500h = byteBuffer;
        this.i = byteBuffer;
        this.f7497e = -1;
        this.f7498f = -1;
        this.f7501j = new byte[0];
    }

    public final void a(int i, int i4) {
        this.f7495c = i;
        this.f7496d = i4;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f7497e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f7498f;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f7503l = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.i;
        this.i = f.f7226a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f7503l && this.i == f.f7226a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.i = f.f7226a;
        this.f7503l = false;
        this.f7499g = 0;
        this.f7502k = 0;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f7500h = f.f7226a;
        this.f7497e = -1;
        this.f7498f = -1;
        this.f7501j = new byte[0];
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i6) {
        if (i6 == 2) {
            this.f7497e = i4;
            this.f7498f = i;
            int i9 = this.f7496d;
            this.f7501j = new byte[i9 * i4 * 2];
            this.f7502k = 0;
            int i10 = this.f7495c;
            this.f7499g = i4 * i10 * 2;
            boolean z6 = this.f7494b;
            boolean z9 = (i10 == 0 && i9 == 0) ? false : true;
            this.f7494b = z9;
            return z6 != z9;
        }
        throw new f.a(i, i4, i6);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f7494b;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.f7499g);
        this.f7499g -= min;
        byteBuffer.position(position + min);
        if (this.f7499g > 0) {
            return;
        }
        int i4 = i - min;
        int length = (this.f7502k + i4) - this.f7501j.length;
        if (this.f7500h.capacity() < length) {
            this.f7500h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f7500h.clear();
        }
        int a9 = af.a(length, 0, this.f7502k);
        this.f7500h.put(this.f7501j, 0, a9);
        int a10 = af.a(length - a9, 0, i4);
        byteBuffer.limit(byteBuffer.position() + a10);
        this.f7500h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i6 = i4 - a10;
        int i9 = this.f7502k - a9;
        this.f7502k = i9;
        byte[] bArr = this.f7501j;
        System.arraycopy(bArr, a9, bArr, 0, i9);
        byteBuffer.get(this.f7501j, this.f7502k, i6);
        this.f7502k += i6;
        this.f7500h.flip();
        this.i = this.f7500h;
    }
}
