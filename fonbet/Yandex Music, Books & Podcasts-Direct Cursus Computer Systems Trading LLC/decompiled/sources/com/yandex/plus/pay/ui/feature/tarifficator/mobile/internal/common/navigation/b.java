package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation;

import android.graphics.PointF;
import defpackage.vz1;

/* loaded from: classes5.dex */
public final class b {
    public final PointF a;
    public final int b;

    public b(PointF pointF, int i) {
        this.a = pointF;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationParams(location=");
        sb.append(this.a);
        sb.append(", progress=");
        return vz1.r(sb, this.b, ')');
    }
}
