package z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements d, g {

    /* renamed from: a, reason: collision with root package name */
    public final float f8949a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8950b;

    public e(float f10) {
        this.f8949a = f10;
        this.f8950b = f10;
    }

    @Override // z.d, z.g
    public final float a() {
        return this.f8950b;
    }

    @Override // z.g
    public final void b(v1.g0 g0Var, int i10, int[] iArr, int[] iArr2) {
        c(g0Var, i10, iArr, s2.l.f6396g, iArr2);
    }

    @Override // z.d
    public final void c(s2.c cVar, int i10, int[] iArr, s2.l lVar, int[] iArr2) {
        int i11;
        int i12;
        if (iArr.length == 0) {
            return;
        }
        int D = cVar.D(this.f8949a);
        boolean z10 = lVar == s2.l.f6397h;
        f fVar = i.f8959a;
        if (z10) {
            i11 = 0;
            i12 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i13 = iArr[length];
                int min = Math.min(i11, i10 - i13);
                iArr2[length] = min;
                i12 = Math.min(D, (i10 - min) - i13);
                i11 = iArr2[length] + i13 + i12;
            }
        } else {
            int length2 = iArr.length;
            int i14 = 0;
            i11 = 0;
            i12 = 0;
            int i15 = 0;
            while (i14 < length2) {
                int i16 = iArr[i14];
                int min2 = Math.min(i11, i10 - i16);
                iArr2[i15] = min2;
                int min3 = Math.min(D, (i10 - min2) - i16);
                int i17 = iArr2[i15] + i16 + min3;
                i14++;
                i12 = min3;
                i11 = i17;
                i15++;
            }
        }
        if (i11 - i12 < i10) {
            int round = Math.round((1 + (lVar != s2.l.f6396g ? (-1.0f) * (-1) : -1.0f)) * ((i10 - r5) / 2.0f));
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + round;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e) || !s2.f.a(this.f8949a, ((e) obj).f8949a)) {
            return false;
        }
        Object obj2 = h.f8954g;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return h.f8954g.hashCode() + a4.d.d(Float.hashCode(this.f8949a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) s2.f.b(this.f8949a)) + ", " + h.f8954g + ')';
    }
}
