package com.anythink.core.common.n.c;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    static final int f15912a = 8192;

    /* renamed from: b, reason: collision with root package name */
    static final int f15913b = 1024;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f15914c;

    /* renamed from: d, reason: collision with root package name */
    int f15915d;

    /* renamed from: e, reason: collision with root package name */
    int f15916e;

    /* renamed from: f, reason: collision with root package name */
    boolean f15917f;

    /* renamed from: g, reason: collision with root package name */
    boolean f15918g;

    /* renamed from: h, reason: collision with root package name */
    s f15919h;
    s i;

    public s() {
        this.f15914c = new byte[f15912a];
        this.f15918g = true;
        this.f15917f = false;
    }

    public final s a() {
        this.f15917f = true;
        return new s(this.f15914c, this.f15915d, this.f15916e, true, false);
    }

    public final s b() {
        return new s((byte[]) this.f15914c.clone(), this.f15915d, this.f15916e, false, true);
    }

    public final s c() {
        s sVar = this.f15919h;
        s sVar2 = sVar != this ? sVar : null;
        s sVar3 = this.i;
        sVar3.f15919h = sVar;
        this.f15919h.i = sVar3;
        this.f15919h = null;
        this.i = null;
        return sVar2;
    }

    public final void d() {
        s sVar = this.i;
        if (sVar == this) {
            throw new IllegalStateException();
        }
        if (sVar.f15918g) {
            int i = this.f15916e - this.f15915d;
            if (i > (8192 - sVar.f15916e) + (sVar.f15917f ? 0 : sVar.f15915d)) {
                return;
            }
            a(sVar, i);
            c();
            t.a(this);
        }
    }

    public final s a(s sVar) {
        sVar.i = this;
        sVar.f15919h = this.f15919h;
        this.f15919h.i = sVar;
        this.f15919h = sVar;
        return sVar;
    }

    public s(byte[] bArr, int i, int i6, boolean z3, boolean z6) {
        this.f15914c = bArr;
        this.f15915d = i;
        this.f15916e = i6;
        this.f15917f = z3;
        this.f15918g = z6;
    }

    public final s a(int i) {
        s a9;
        if (i > 0 && i <= this.f15916e - this.f15915d) {
            if (i >= f15913b) {
                a9 = a();
            } else {
                a9 = t.a();
                System.arraycopy(this.f15914c, this.f15915d, a9.f15914c, 0, i);
            }
            a9.f15916e = a9.f15915d + i;
            this.f15915d += i;
            this.i.a(a9);
            return a9;
        }
        throw new IllegalArgumentException();
    }

    public final void a(s sVar, int i) {
        if (sVar.f15918g) {
            int i6 = sVar.f15916e;
            if (i6 + i > f15912a) {
                if (!sVar.f15917f) {
                    int i9 = sVar.f15915d;
                    if ((i6 + i) - i9 <= f15912a) {
                        byte[] bArr = sVar.f15914c;
                        System.arraycopy(bArr, i9, bArr, 0, i6 - i9);
                        sVar.f15916e -= sVar.f15915d;
                        sVar.f15915d = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f15914c, this.f15915d, sVar.f15914c, sVar.f15916e, i);
            sVar.f15916e += i;
            this.f15915d += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
