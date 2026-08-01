package com.anythink.core.common.n.b.a.e;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    static final int f15327a = 65535;

    /* renamed from: b, reason: collision with root package name */
    static final int f15328b = 1;

    /* renamed from: c, reason: collision with root package name */
    static final int f15329c = 2;

    /* renamed from: d, reason: collision with root package name */
    static final int f15330d = 4;

    /* renamed from: e, reason: collision with root package name */
    static final int f15331e = 5;

    /* renamed from: f, reason: collision with root package name */
    static final int f15332f = 6;

    /* renamed from: g, reason: collision with root package name */
    static final int f15333g = 7;

    /* renamed from: h, reason: collision with root package name */
    static final int f15334h = 10;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f15335j = new int[10];

    public final void a() {
        this.i = 0;
        Arrays.fill(this.f15335j, 0);
    }

    public final int b(int i) {
        return this.f15335j[i];
    }

    public final int c() {
        if ((this.i & 2) != 0) {
            return this.f15335j[1];
        }
        return -1;
    }

    public final int d() {
        if ((this.i & 16) != 0) {
            return this.f15335j[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e() {
        return (this.i & 128) != 0 ? this.f15335j[7] : f15327a;
    }

    private int d(int i) {
        return (this.i & 64) != 0 ? this.f15335j[6] : i;
    }

    public final int b() {
        return Integer.bitCount(this.i);
    }

    public final int c(int i) {
        return (this.i & 32) != 0 ? this.f15335j[5] : i;
    }

    public final m a(int i, int i6) {
        if (i >= 0) {
            int[] iArr = this.f15335j;
            if (i < iArr.length) {
                this.i = (1 << i) | this.i;
                iArr[i] = i6;
            }
        }
        return this;
    }

    public final boolean a(int i) {
        return ((1 << i) & this.i) != 0;
    }

    private boolean a(boolean z3) {
        return ((this.i & 4) != 0 ? this.f15335j[2] : z3 ? 1 : 0) == 1;
    }

    public final void a(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.a(i)) {
                a(i, mVar.f15335j[i]);
            }
        }
    }
}
