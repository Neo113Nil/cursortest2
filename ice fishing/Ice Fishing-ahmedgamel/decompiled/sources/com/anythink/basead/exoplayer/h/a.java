package com.anythink.basead.exoplayer.h;

import android.util.Pair;
import com.anythink.basead.exoplayer.ae;

/* loaded from: classes.dex */
abstract class a extends com.anythink.basead.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private final int f8187b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f8188c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8189d;

    public a(boolean z6, aa aaVar) {
        this.f8189d = z6;
        this.f8188c = aaVar;
        this.f8187b = aaVar.a();
    }

    public abstract int a(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(int i, int i4, boolean z6) {
        if (this.f8189d) {
            if (i4 == 1) {
                i4 = 2;
            }
            z6 = false;
        }
        int b9 = b(i);
        int e9 = e(b9);
        int a9 = c(b9).a(i - e9, i4 != 2 ? i4 : 0, z6);
        if (a9 != -1) {
            return e9 + a9;
        }
        int a10 = a(b9, z6);
        while (a10 != -1 && c(a10).a()) {
            a10 = a(a10, z6);
        }
        if (a10 != -1) {
            return c(a10).b(z6) + e(a10);
        }
        if (i4 == 2) {
            return b(z6);
        }
        return -1;
    }

    public abstract int b(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int b(int i, int i4, boolean z6) {
        if (this.f8189d) {
            if (i4 == 1) {
                i4 = 2;
            }
            z6 = false;
        }
        int b9 = b(i);
        int e9 = e(b9);
        int b10 = c(b9).b(i - e9, i4 != 2 ? i4 : 0, z6);
        if (b10 != -1) {
            return e9 + b10;
        }
        int b11 = b(b9, z6);
        while (b11 != -1 && c(b11).a()) {
            b11 = b(b11, z6);
        }
        if (b11 != -1) {
            return c(b11).a(z6) + e(b11);
        }
        if (i4 == 2) {
            return a(z6);
        }
        return -1;
    }

    public abstract int b(Object obj);

    public abstract com.anythink.basead.exoplayer.ae c(int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract Object f(int i);

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(boolean z6) {
        int i = this.f8187b;
        if (i == 0) {
            return -1;
        }
        if (this.f8189d) {
            z6 = false;
        }
        int b9 = z6 ? this.f8188c.b() : i - 1;
        while (c(b9).a()) {
            b9 = b(b9, z6);
            if (b9 == -1) {
                return -1;
            }
        }
        return c(b9).a(z6) + e(b9);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int b(boolean z6) {
        if (this.f8187b == 0) {
            return -1;
        }
        if (this.f8189d) {
            z6 = false;
        }
        int c9 = z6 ? this.f8188c.c() : 0;
        while (c(c9).a()) {
            c9 = a(c9, z6);
            if (c9 == -1) {
                return -1;
            }
        }
        return c(c9).b(z6) + e(c9);
    }

    private int b(int i, boolean z6) {
        if (z6) {
            return this.f8188c.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.b a(int i, ae.b bVar, boolean z6, long j6) {
        int b9 = b(i);
        int e9 = e(b9);
        int d9 = d(b9);
        c(b9).a(i - e9, bVar, z6, j6);
        bVar.f7139f += d9;
        bVar.f7140g += d9;
        return bVar;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z6) {
        int a9 = a(i);
        int e9 = e(a9);
        c(a9).a(i - d(a9), aVar, z6);
        aVar.f7130c += e9;
        if (z6) {
            aVar.f7129b = Pair.create(f(a9), aVar.f7129b);
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

    private int a(int i, boolean z6) {
        if (z6) {
            return this.f8188c.a(i);
        }
        if (i < this.f8187b - 1) {
            return i + 1;
        }
        return -1;
    }
}
