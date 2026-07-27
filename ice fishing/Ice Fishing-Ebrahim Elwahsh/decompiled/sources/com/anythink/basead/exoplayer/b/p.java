package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class p implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f6769b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f6770c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f6771d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f6772e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f6773f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6774g;

    public p() {
        ByteBuffer byteBuffer = f.f6597a;
        this.f6772e = byteBuffer;
        this.f6773f = byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i9) {
        if (i9 != 3 && i9 != 2 && i9 != Integer.MIN_VALUE && i9 != 1073741824) {
            throw new f.a(i, i4, i9);
        }
        if (this.f6769b == i && this.f6770c == i4 && this.f6771d == i9) {
            return false;
        }
        this.f6769b = i;
        this.f6770c = i4;
        this.f6771d = i9;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f6770c;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6769b;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f6774g = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6773f;
        this.f6773f = f.f6597a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f6774g && this.f6773f == f.f6597a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f6773f = f.f6597a;
        this.f6774g = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f6769b = -1;
        this.f6770c = -1;
        this.f6771d = 0;
        this.f6772e = f.f6597a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        int i = this.f6771d;
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
        int i9 = limit - position;
        int i10 = this.f6771d;
        if (i10 == Integer.MIN_VALUE) {
            i9 /= 3;
        } else if (i10 != 3) {
            if (i10 == 1073741824) {
                i = i9 / 2;
                if (this.f6772e.capacity() >= i) {
                    this.f6772e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                } else {
                    this.f6772e.clear();
                }
                i4 = this.f6771d;
                if (i4 != Integer.MIN_VALUE) {
                    while (position < limit) {
                        this.f6772e.put(byteBuffer.get(position + 1));
                        this.f6772e.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i4 == 3) {
                    while (position < limit) {
                        this.f6772e.put((byte) 0);
                        this.f6772e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else {
                    if (i4 != 1073741824) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        this.f6772e.put(byteBuffer.get(position + 2));
                        this.f6772e.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                this.f6772e.flip();
                this.f6773f = this.f6772e;
            }
            throw new IllegalStateException();
        }
        i = i9 * 2;
        if (this.f6772e.capacity() >= i) {
        }
        i4 = this.f6771d;
        if (i4 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.f6772e.flip();
        this.f6773f = this.f6772e;
    }
}
