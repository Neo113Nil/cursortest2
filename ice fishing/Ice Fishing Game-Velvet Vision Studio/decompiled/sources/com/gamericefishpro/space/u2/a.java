package com.gamericefishpro.space.u2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    public final int d;

    public a(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.d == ((a) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final String toString() {
        return com.gamericefishpro.space.m5.a.i(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.d, ')');
    }
}
