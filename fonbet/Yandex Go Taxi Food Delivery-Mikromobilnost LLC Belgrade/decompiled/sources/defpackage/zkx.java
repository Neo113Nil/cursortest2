package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zkx {
    public final float a;
    public final int b;
    public alx d;
    public alx e;
    public final ArrayList c = new ArrayList();
    public int f = -1;
    public int g = -1;
    public float h = 0.0f;
    public int i = -1;

    public zkx(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final void a(float f, float f2, float f3, boolean z, boolean z2) {
        float f4;
        float f5 = f3 / 2.0f;
        float f6 = f - f5;
        float f7 = f5 + f;
        float f8 = this.b;
        if (f7 > f8) {
            f4 = Math.abs(f7 - Math.max(f7 - f3, f8));
        } else {
            f4 = 0.0f;
            if (f6 < 0.0f) {
                f4 = Math.abs(f6 - Math.min(f6 + f3, 0.0f));
            }
        }
        b(f, f2, f3, z, z2, f4, 0.0f, 0.0f);
    }

    public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
        if (f3 <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.c;
        if (z2) {
            if (z) {
                ny61.g("Anchor keylines cannot be focal.");
                return;
            }
            int i = this.i;
            if (i != -1 && i != 0) {
                ny61.g("Anchor keylines must be either the first or last keyline.");
                return;
            }
            this.i = arrayList.size();
        }
        alx alxVar = new alx(Float.MIN_VALUE, f, f2, f3, f4, f5, f6, z2);
        alx alxVar2 = this.d;
        if (z) {
            if (alxVar2 == null) {
                this.d = alxVar;
                this.f = arrayList.size();
            }
            if (this.g != -1 && arrayList.size() - this.g > 1) {
                ny61.g("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                return;
            } else if (f3 != this.d.d) {
                ny61.g("Keylines that are marked as focal must all have the same masked item size.");
                return;
            } else {
                this.e = alxVar;
                this.g = arrayList.size();
            }
        } else if (alxVar2 == null && f3 < this.h) {
            ny61.g("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            return;
        } else if (this.e != null && f3 > this.h) {
            ny61.g("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            return;
        }
        this.h = f3;
        arrayList.add(alxVar);
    }

    public final void c(float f, float f2, float f3, int i, boolean z) {
        if (i <= 0 || f3 <= 0.0f) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            a((i2 * f3) + f, f2, f3, z, false);
        }
    }

    public final blx d() {
        if (this.d == null) {
            ny61.r("There must be a keyline marked as focal.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i >= arrayList2.size()) {
                return new blx(this.a, arrayList, this.f, this.g, this.b);
            }
            alx alxVar = (alx) arrayList2.get(i);
            float f = this.d.b;
            float f2 = this.f;
            float f3 = this.a;
            arrayList.add(new alx((i * f3) + (f - (f2 * f3)), alxVar.b, alxVar.c, alxVar.d, alxVar.f, alxVar.g, alxVar.h, alxVar.e));
            i++;
        }
    }
}
