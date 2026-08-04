package com.gamericefishpro.space.u2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final b a;
    public final k b;
    public final int c;
    public final int d;
    public final Object e;

    public p(b bVar, k kVar, int i, int i2, Object obj) {
        this.a = bVar;
        this.b = kVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.a, pVar.a) && Intrinsics.a(this.b, pVar.b) && this.c == pVar.c && this.d == pVar.d && Intrinsics.a(this.e, pVar.e);
    }

    public final int hashCode() {
        b bVar = this.a;
        int iT = com.gamericefishpro.space.m5.a.t(this.d, com.gamericefishpro.space.m5.a.t(this.c, (((bVar == null ? 0 : bVar.hashCode()) * 31) + this.b.d) * 31, 31), 31);
        Object obj = this.e;
        return iT + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
