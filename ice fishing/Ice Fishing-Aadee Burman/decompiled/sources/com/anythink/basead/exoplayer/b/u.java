package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class u implements f {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6708b;

    /* renamed from: c, reason: collision with root package name */
    private int f6709c;

    /* renamed from: d, reason: collision with root package name */
    private int f6710d;

    /* renamed from: e, reason: collision with root package name */
    private int f6711e;

    /* renamed from: f, reason: collision with root package name */
    private int f6712f;

    /* renamed from: g, reason: collision with root package name */
    private int f6713g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6714h;
    private ByteBuffer i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f6715j;

    /* renamed from: k, reason: collision with root package name */
    private int f6716k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6717l;

    public u() {
        ByteBuffer byteBuffer = f.f6440a;
        this.f6714h = byteBuffer;
        this.i = byteBuffer;
        this.f6711e = -1;
        this.f6712f = -1;
        this.f6715j = new byte[0];
    }

    public final void a(int i, int i6) {
        this.f6709c = i;
        this.f6710d = i6;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f6711e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6712f;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f6717l = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.i;
        this.i = f.f6440a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f6717l && this.i == f.f6440a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.i = f.f6440a;
        this.f6717l = false;
        this.f6713g = 0;
        this.f6716k = 0;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f6714h = f.f6440a;
        this.f6711e = -1;
        this.f6712f = -1;
        this.f6715j = new byte[0];
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i6, int i9) {
        if (i9 == 2) {
            this.f6711e = i6;
            this.f6712f = i;
            int i10 = this.f6710d;
            this.f6715j = new byte[i10 * i6 * 2];
            this.f6716k = 0;
            int i11 = this.f6709c;
            this.f6713g = i6 * i11 * 2;
            boolean z3 = this.f6708b;
            boolean z6 = (i11 == 0 && i10 == 0) ? false : true;
            this.f6708b = z6;
            return z3 != z6;
        }
        throw new f.a(i, i6, i9);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f6708b;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.f6713g);
        this.f6713g -= min;
        byteBuffer.position(position + min);
        if (this.f6713g > 0) {
            return;
        }
        int i6 = i - min;
        int length = (this.f6716k + i6) - this.f6715j.length;
        if (this.f6714h.capacity() < length) {
            this.f6714h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f6714h.clear();
        }
        int a9 = af.a(length, 0, this.f6716k);
        this.f6714h.put(this.f6715j, 0, a9);
        int a10 = af.a(length - a9, 0, i6);
        byteBuffer.limit(byteBuffer.position() + a10);
        this.f6714h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i6 - a10;
        int i10 = this.f6716k - a9;
        this.f6716k = i10;
        byte[] bArr = this.f6715j;
        System.arraycopy(bArr, a9, bArr, 0, i10);
        byteBuffer.get(this.f6715j, this.f6716k, i9);
        this.f6716k += i9;
        this.f6714h.flip();
        this.i = this.f6714h;
    }
}
