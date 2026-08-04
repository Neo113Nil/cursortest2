package com.gamericefishpro.space.y5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {
    public final int d;
    public final int e;
    public final String i;
    public final String v;

    public e(int i, int i2, String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.d = i;
        this.e = i2;
        this.i = from;
        this.v = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e other = (e) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.d - other.d;
        return i == 0 ? this.e - other.e : i;
    }
}
