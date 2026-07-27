package com.anythink.basead.exoplayer.h;

import android.util.Pair;
import com.anythink.basead.exoplayer.ae;

/* loaded from: classes.dex */
abstract class a extends com.anythink.basead.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private final int f7401b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f7402c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7403d;

    public a(boolean z3, aa aaVar) {
        this.f7403d = z3;
        this.f7402c = aaVar;
        this.f7401b = aaVar.a();
    }

    public abstract int a(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(int i, int i6, boolean z3) {
        if (this.f7403d) {
            if (i6 == 1) {
                i6 = 2;
            }
            z3 = false;
        }
        int b9 = b(i);
        int e9 = e(b9);
        int a9 = c(b9).a(i - e9, i6 != 2 ? i6 : 0, z3);
        if (a9 != -1) {
            return e9 + a9;
        }
        int a10 = a(b9, z3);
        while (a10 != -1 && c(a10).a()) {
            a10 = a(a10, z3);
        }
        if (a10 != -1) {
            return c(a10).b(z3) + e(a10);
        }
        if (i6 == 2) {
            return b(z3);
        }
        return -1;
    }

    public abstract int b(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int b(int i, int i6, boolean z3) {
        if (this.f7403d) {
            if (i6 == 1) {
                i6 = 2;
            }
            z3 = false;
        }
        int b9 = b(i);
        int e9 = e(b9);
        int b10 = c(b9).b(i - e9, i6 != 2 ? i6 : 0, z3);
        if (b10 != -1) {
            return e9 + b10;
        }
        int b11 = b(b9, z3);
        while (b11 != -1 && c(b11).a()) {
            b11 = b(b11, z3);
        }
        if (b11 != -1) {
            return c(b11).a(z3) + e(b11);
        }
        if (i6 == 2) {
            return a(z3);
        }
        return -1;
    }

    public abstract int b(Object obj);

    public abstract com.anythink.basead.exoplayer.ae c(int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract Object f(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(boolean z3) {
        int i = this.f7401b;
        if (i == 0) {
            return -1;
        }
        if (this.f7403d) {
            z3 = false;
        }
        int b9 = z3 ? this.f7402c.b() : i - 1;
        while (c(b9).a()) {
            b9 = b(b9, z3);
            if (b9 == -1) {
                return -1;
            }
        }
        return c(b9).a(z3) + e(b9);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int b(boolean z3) {
        if (this.f7401b == 0) {
            return -1;
        }
        if (this.f7403d) {
            z3 = false;
        }
        int c9 = z3 ? this.f7402c.c() : 0;
        while (c(c9).a()) {
            c9 = a(c9, z3);
            if (c9 == -1) {
                return -1;
            }
        }
        return c(c9).b(z3) + e(c9);
    }

    private int b(int i, boolean z3) {
        if (z3) {
            return this.f7402c.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.b a(int i, ae.b bVar, boolean z3, long j6) {
        int b9 = b(i);
        int e9 = e(b9);
        int d2 = d(b9);
        c(b9).a(i - e9, bVar, z3, j6);
        bVar.f6353f += d2;
        bVar.f6354g += d2;
        return bVar;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z3) {
        int a9 = a(i);
        int e9 = e(a9);
        c(a9).a(i - d(a9), aVar, z3);
        aVar.f6344c += e9;
        if (z3) {
            aVar.f6343b = Pair.create(f(a9), aVar.f6343b);
        }
        return aVar;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(Object obj) {
        int a9;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int b9 = b(obj2);
        if (b9 == -1 || (a9 = c(b9).a(obj3)) == -1) {
            return -1;
        }
        return d(b9) + a9;
    }

    private int a(int i, boolean z3) {
        if (z3) {
            return this.f7402c.a(i);
        }
        if (i < this.f7401b - 1) {
            return i + 1;
        }
        return -1;
    }
}
