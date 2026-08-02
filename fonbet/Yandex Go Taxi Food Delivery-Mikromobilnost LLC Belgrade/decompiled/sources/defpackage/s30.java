package defpackage;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* loaded from: classes10.dex */
public final class s30 implements Comparable {
    public final ResolveInfo a;
    public float b;

    public s30(ResolveInfo resolveInfo) {
        this.a = resolveInfo;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.floatToIntBits(((s30) obj).b) - Float.floatToIntBits(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && s30.class == obj.getClass() && Float.floatToIntBits(this.b) == Float.floatToIntBits(((s30) obj).b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + 31;
    }

    public final String toString() {
        return "[resolveInfo:" + this.a.toString() + "; weight:" + new BigDecimal(this.b) + "]";
    }
}
