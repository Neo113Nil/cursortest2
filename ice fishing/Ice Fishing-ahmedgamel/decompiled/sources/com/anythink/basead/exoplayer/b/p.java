package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class p implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f7398b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f7399c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f7400d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f7401e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f7402f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7403g;

    public p() {
        ByteBuffer byteBuffer = f.f7226a;
        this.f7401e = byteBuffer;
        this.f7402f = byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i6) {
        if (i6 != 3 && i6 != 2 && i6 != Integer.MIN_VALUE && i6 != 1073741824) {
            throw new f.a(i, i4, i6);
        }
        if (this.f7398b == i && this.f7399c == i4 && this.f7400d == i6) {
            return false;
        }
        this.f7398b = i;
        this.f7399c = i4;
        this.f7400d = i6;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f7399c;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f7398b;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f7403g = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f7402f;
        this.f7402f = f.f7226a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f7403g && this.f7402f == f.f7226a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f7402f = f.f7226a;
        this.f7403g = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f7398b = -1;
        this.f7399c = -1;
        this.f7400d = 0;
        this.f7401e = f.f7226a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        int i = this.f7400d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[ADDED_TO_REGION, LOOP:2: B:24:0x0083->B:25:0x0085, LOOP_START, PHI: r0
      0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0043, B:25:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.anythink.basead.exoplayer.b.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
        int i;
        int i4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        int i9 = this.f7400d;
        if (i9 == Integer.MIN_VALUE) {
            i6 /= 3;
        } else if (i9 != 3) {
            if (i9 == 1073741824) {
                i = i6 / 2;
                if (this.f7401e.capacity() >= i) {
                    this.f7401e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                } else {
                    this.f7401e.clear();
                }
                i4 = this.f7400d;
                if (i4 != Integer.MIN_VALUE) {
                    while (position < limit) {
                        this.f7401e.put(byteBuffer.get(position + 1));
                        this.f7401e.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i4 == 3) {
                    while (position < limit) {
                        this.f7401e.put((byte) 0);
                        this.f7401e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else {
                    if (i4 != 1073741824) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        this.f7401e.put(byteBuffer.get(position + 2));
                        this.f7401e.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                this.f7401e.flip();
                this.f7402f = this.f7401e;
            }
            throw new IllegalStateException();
        }
        i = i6 * 2;
        if (this.f7401e.capacity() >= i) {
        }
        i4 = this.f7400d;
        if (i4 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.f7401e.flip();
        this.f7402f = this.f7401e;
    }
}
