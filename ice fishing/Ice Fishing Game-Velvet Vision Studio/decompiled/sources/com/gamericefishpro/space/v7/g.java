package com.gamericefishpro.space.v7;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.b7.a {
    public final int a;
    public final boolean b;

    public g(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static g a(g gVar, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = gVar.a;
        }
        if ((i2 & 2) != 0) {
            z = gVar.b;
        }
        gVar.getClass();
        return new g(i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "IceWebViewUiState(progress=" + this.a + ", shouldRequestPermission=" + this.b + ")";
    }
}
