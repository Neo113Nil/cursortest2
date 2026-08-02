package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public c f7914a;

    /* renamed from: b, reason: collision with root package name */
    public long f7915b;

    /* renamed from: c, reason: collision with root package name */
    public long f7916c;

    /* renamed from: d, reason: collision with root package name */
    public long f7917d;

    /* renamed from: e, reason: collision with root package name */
    public int f7918e;

    /* renamed from: f, reason: collision with root package name */
    public int f7919f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f7920g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f7921h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f7922j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f7923k;

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f7924l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7925m;

    /* renamed from: n, reason: collision with root package name */
    public boolean[] f7926n;

    /* renamed from: o, reason: collision with root package name */
    public k f7927o;

    /* renamed from: p, reason: collision with root package name */
    public int f7928p;

    /* renamed from: q, reason: collision with root package name */
    public s f7929q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7930r;

    /* renamed from: s, reason: collision with root package name */
    public long f7931s;

    public final void a() {
        this.f7918e = 0;
        this.f7931s = 0L;
        this.f7925m = false;
        this.f7930r = false;
        this.f7927o = null;
    }

    public final long b(int i) {
        return this.f7923k[i] + this.f7922j[i];
    }

    public final void a(int i, int i4) {
        this.f7918e = i;
        this.f7919f = i4;
        int[] iArr = this.f7921h;
        if (iArr == null || iArr.length < i) {
            this.f7920g = new long[i];
            this.f7921h = new int[i];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i4) {
            int i6 = (i4 * 125) / 100;
            this.i = new int[i6];
            this.f7922j = new int[i6];
            this.f7923k = new long[i6];
            this.f7924l = new boolean[i6];
            this.f7926n = new boolean[i6];
        }
    }

    public final void a(int i) {
        s sVar = this.f7929q;
        if (sVar == null || sVar.b() < i) {
            this.f7929q = new s(i);
        }
        this.f7928p = i;
        this.f7925m = true;
        this.f7930r = true;
    }

    private void a(com.anythink.basead.exoplayer.e.f fVar) {
        fVar.b(this.f7929q.f9288a, 0, this.f7928p);
        this.f7929q.c(0);
        this.f7930r = false;
    }

    public final void a(s sVar) {
        sVar.a(this.f7929q.f9288a, 0, this.f7928p);
        this.f7929q.c(0);
        this.f7930r = false;
    }
}
