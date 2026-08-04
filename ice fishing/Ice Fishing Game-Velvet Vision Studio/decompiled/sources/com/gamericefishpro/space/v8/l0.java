package com.gamericefishpro.space.v8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public final String a;
    public final String b;
    public final boolean c;

    public l0(String str, boolean z) {
        c0.d(str);
        this.a = str;
        c0.d("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return c0.j(this.a, l0Var.a) && c0.j(this.b, l0Var.b) && c0.j(null, null) && this.c == l0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        c0.g(null);
        throw null;
    }
}
