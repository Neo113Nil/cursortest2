package com.gamericefishpro.space.f5;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {
    public final x d;
    public final Bundle e;
    public final boolean i;
    public final int v;
    public final boolean w;

    public w(x destination, Bundle bundle, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.d = destination;
        this.e = bundle;
        this.i = z;
        this.v = i;
        this.w = z2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(w other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z = this.i;
        if (z && !other.i) {
            return 1;
        }
        if (!z && other.i) {
            return -1;
        }
        int i = other.v;
        boolean z2 = other.w;
        Bundle source = other.e;
        int i2 = this.v - i;
        if (i2 > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        Bundle source2 = this.e;
        if (source2 != null && source == null) {
            return 1;
        }
        if (source2 == null && source != null) {
            return -1;
        }
        if (source2 != null) {
            Intrinsics.checkNotNullParameter(source2, "source");
            int size = source2.size();
            Intrinsics.b(source);
            Intrinsics.checkNotNullParameter(source, "source");
            int size2 = size - source.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z3 = this.w;
        if (!z3 || z2) {
            return (z3 || !z2) ? 0 : -1;
        }
        return 1;
    }
}
