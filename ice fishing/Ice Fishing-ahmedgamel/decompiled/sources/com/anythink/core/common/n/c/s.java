package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    static final int f16699a = 8192;

    /* renamed from: b, reason: collision with root package name */
    static final int f16700b = 1024;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f16701c;

    /* renamed from: d, reason: collision with root package name */
    int f16702d;

    /* renamed from: e, reason: collision with root package name */
    int f16703e;

    /* renamed from: f, reason: collision with root package name */
    boolean f16704f;

    /* renamed from: g, reason: collision with root package name */
    boolean f16705g;

    /* renamed from: h, reason: collision with root package name */
    s f16706h;
    s i;

    public s() {
        this.f16701c = new byte[f16699a];
        this.f16705g = true;
        this.f16704f = false;
    }

    public final s a() {
        this.f16704f = true;
        return new s(this.f16701c, this.f16702d, this.f16703e, true, false);
    }

    public final s b() {
        return new s((byte[]) this.f16701c.clone(), this.f16702d, this.f16703e, false, true);
    }

    public final s c() {
        s sVar = this.f16706h;
        s sVar2 = sVar != this ? sVar : null;
        s sVar3 = this.i;
        sVar3.f16706h = sVar;
        this.f16706h.i = sVar3;
        this.f16706h = null;
        this.i = null;
        return sVar2;
    }

    public final void d() {
        s sVar = this.i;
        if (sVar == this) {
            throw new IllegalStateException();
        }
        if (sVar.f16705g) {
            int i = this.f16703e - this.f16702d;
            if (i > (8192 - sVar.f16703e) + (sVar.f16704f ? 0 : sVar.f16702d)) {
                return;
            }
            a(sVar, i);
            c();
            t.a(this);
        }
    }

    public final s a(s sVar) {
        sVar.i = this;
        sVar.f16706h = this.f16706h;
        this.f16706h.i = sVar;
        this.f16706h = sVar;
        return sVar;
    }

    public s(byte[] bArr, int i, int i4, boolean z6, boolean z9) {
        this.f16701c = bArr;
        this.f16702d = i;
        this.f16703e = i4;
        this.f16704f = z6;
        this.f16705g = z9;
    }

    public final s a(int i) {
        s a9;
        if (i > 0 && i <= this.f16703e - this.f16702d) {
            if (i >= f16700b) {
                a9 = a();
            } else {
                a9 = t.a();
                System.arraycopy(this.f16701c, this.f16702d, a9.f16701c, 0, i);
            }
            a9.f16703e = a9.f16702d + i;
            this.f16702d += i;
            this.i.a(a9);
            return a9;
        }
        throw new IllegalArgumentException();
    }

    public final void a(s sVar, int i) {
        if (sVar.f16705g) {
            int i4 = sVar.f16703e;
            if (i4 + i > f16699a) {
                if (!sVar.f16704f) {
                    int i6 = sVar.f16702d;
                    if ((i4 + i) - i6 <= f16699a) {
                        byte[] bArr = sVar.f16701c;
                        System.arraycopy(bArr, i6, bArr, 0, i4 - i6);
                        sVar.f16703e -= sVar.f16702d;
                        sVar.f16702d = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f16701c, this.f16702d, sVar.f16701c, sVar.f16703e, i);
            sVar.f16703e += i;
            this.f16702d += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
