package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d, g {
    public final float a;
    public final b b;
    public final float c;

    public e(float f, b bVar) {
        this.a = f;
        this.b = bVar;
        this.c = f;
    }

    @Override // com.gamericefishpro.space.d0.d, com.gamericefishpro.space.d0.g
    public final float a() {
        return this.c;
    }

    @Override // com.gamericefishpro.space.d0.g
    public final void b(int i, com.gamericefishpro.space.f2.n0 n0Var, int[] iArr, int[] iArr2) {
        c(n0Var, i, iArr, com.gamericefishpro.space.c3.l.d, iArr2);
    }

    @Override // com.gamericefishpro.space.d0.d
    public final void c(com.gamericefishpro.space.c3.c cVar, int i, int[] iArr, com.gamericefishpro.space.c3.l lVar, int[] iArr2) {
        int i2;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iJ = cVar.J(this.a);
        boolean z = lVar == com.gamericefishpro.space.c3.l.e;
        f fVar = h.a;
        if (z) {
            i2 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i3 = iArr[length];
                int iMin2 = Math.min(i2, i - i3);
                iArr2[length] = iMin2;
                iMin = Math.min(iJ, (i - iMin2) - i3);
                i2 = iArr2[length] + i3 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i4 = 0;
            i2 = 0;
            iMin = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = iArr[i4];
                int iMin3 = Math.min(i2, i - i6);
                iArr2[i5] = iMin3;
                int iMin4 = Math.min(iJ, (i - iMin3) - i6);
                int i7 = iArr2[i5] + i6 + iMin4;
                i4++;
                iMin = iMin4;
                i2 = i7;
                i5++;
            }
        }
        int i8 = i2 - iMin;
        if (i8 < i) {
            int iIntValue = ((Number) this.b.invoke(Integer.valueOf(i - i8), lVar)).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.gamericefishpro.space.c3.f.b(this.a, eVar.a) && this.b.equals(eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + com.gamericefishpro.space.t0.y0.c(Float.hashCode(this.a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) com.gamericefishpro.space.c3.f.c(this.a)) + ", " + this.b + ')';
    }
}
