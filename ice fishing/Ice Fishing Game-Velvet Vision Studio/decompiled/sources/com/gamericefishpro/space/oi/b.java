package com.gamericefishpro.space.oi;

import com.gamericefishpro.space.oh.w;
import com.gamericefishpro.space.oh.x;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable, Serializable {
    public static final b i = new b(0, 0);
    public final long d;
    public final long e;

    public b(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        long j = other.d;
        long j2 = this.d;
        if (j2 != j) {
            w wVar = x.d;
            return Long.compareUnsigned(j2, j);
        }
        w wVar2 = x.d;
        return Long.compareUnsigned(this.e, other.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.d ^ this.e);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        com.gamericefishpro.space.b9.a.q(this.d, bArr, 0, 0, 4);
        bArr[8] = 45;
        com.gamericefishpro.space.b9.a.q(this.d, bArr, 9, 4, 6);
        bArr[13] = 45;
        com.gamericefishpro.space.b9.a.q(this.d, bArr, 14, 6, 8);
        bArr[18] = 45;
        com.gamericefishpro.space.b9.a.q(this.e, bArr, 19, 0, 2);
        bArr[23] = 45;
        com.gamericefishpro.space.b9.a.q(this.e, bArr, 24, 2, 8);
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }
}
