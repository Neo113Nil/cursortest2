package defpackage;

import android.content.ComponentName;
import java.math.BigDecimal;

/* loaded from: classes10.dex */
public final class v30 {
    public final ComponentName a;
    public final long b;
    public final float c;

    public v30(ComponentName componentName, long j, float f) {
        this.a = componentName;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v30.class != obj.getClass()) {
            return false;
        }
        v30 v30Var = (v30) obj;
        ComponentName componentName = v30Var.a;
        ComponentName componentName2 = this.a;
        if (componentName2 == null) {
            if (componentName != null) {
                return false;
            }
        } else if (!componentName2.equals(componentName)) {
            return false;
        }
        return this.b == v30Var.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(v30Var.c);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int hashCode = componentName == null ? 0 : componentName.hashCode();
        long j = this.b;
        return Float.floatToIntBits(this.c) + ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + "]";
    }
}
