package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public c f7128a;

    /* renamed from: b, reason: collision with root package name */
    public long f7129b;

    /* renamed from: c, reason: collision with root package name */
    public long f7130c;

    /* renamed from: d, reason: collision with root package name */
    public long f7131d;

    /* renamed from: e, reason: collision with root package name */
    public int f7132e;

    /* renamed from: f, reason: collision with root package name */
    public int f7133f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f7134g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f7135h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f7136j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f7137k;

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f7138l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7139m;

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f7140n;

    /* renamed from: o, reason: collision with root package name */
    public k f7141o;

    /* renamed from: p, reason: collision with root package name */
    public int f7142p;

    /* renamed from: q, reason: collision with root package name */
    public s f7143q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7144r;

    /* renamed from: s, reason: collision with root package name */
    public long f7145s;

    public final void a() {
        this.f7132e = 0;
        this.f7145s = 0L;
        this.f7139m = false;
        this.f7144r = false;
        this.f7141o = null;
    }

    public final long b(int i) {
        return this.f7137k[i] + this.f7136j[i];
    }

    public final void a(int i, int i6) {
        this.f7132e = i;
        this.f7133f = i6;
        int[] iArr = this.f7135h;
        if (iArr == null || iArr.length < i) {
            this.f7134g = new long[i];
            this.f7135h = new int[i];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i6) {
            int i9 = (i6 * 125) / 100;
            this.i = new int[i9];
            this.f7136j = new int[i9];
            this.f7137k = new long[i9];
            this.f7138l = new boolean[i9];
            this.f7140n = new boolean[i9];
        }
    }

    public final void a(int i) {
        s sVar = this.f7143q;
        if (sVar == null || sVar.b() < i) {
            this.f7143q = new s(i);
        }
        this.f7142p = i;
        this.f7139m = true;
        this.f7144r = true;
    }

    private void a(com.anythink.basead.exoplayer.e.f fVar) {
        fVar.b(this.f7143q.f8502a, 0, this.f7142p);
        this.f7143q.c(0);
        this.f7144r = false;
    }

    public final void a(s sVar) {
        sVar.a(this.f7143q.f8502a, 0, this.f7142p);
        this.f7143q.c(0);
        this.f7144r = false;
    }
}
