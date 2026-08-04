package com.gamericefishpro.space.i7;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;
    public final int b;
    public final b c;

    public a(int i, int i2, b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = i;
        this.b = i2;
        this.c = type;
    }

    public static a a(a aVar, int i, int i2) {
        b type = aVar.c;
        Intrinsics.checkNotNullParameter(type, "type");
        return new a(i, i2, type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + y0.c((this.c.hashCode() + com.gamericefishpro.space.m5.a.t(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "FishTile(row=" + this.a + ", col=" + this.b + ", type=" + this.c + ", isSelected=false, isMatched=false)";
    }
}
