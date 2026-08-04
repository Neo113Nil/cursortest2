package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {
    public final boolean d;

    public e(Boolean bool) {
        this.d = bool == null ? false : bool.booleanValue();
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Boolean b() {
        return Boolean.valueOf(this.d);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Double c() {
        return Double.valueOf(true != this.d ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.d == ((e) obj).d;
    }

    @Override // com.gamericefishpro.space.i9.n
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.d).hashCode();
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.d;
        if (zEquals) {
            return new q(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // com.gamericefishpro.space.i9.n
    public final String m() {
        return Boolean.toString(this.d);
    }

    @Override // com.gamericefishpro.space.i9.n
    public final n o() {
        return new e(Boolean.valueOf(this.d));
    }

    public final String toString() {
        return String.valueOf(this.d);
    }
}
