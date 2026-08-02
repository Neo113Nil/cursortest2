package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class HB extends AbstractC3469kC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HB)) {
            return false;
        }
        Object obj2 = C3027c.f30180y;
        ((HB) obj).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C3027c.f30180y.hashCode();
    }

    public final String toString() {
        return C3027c.f30180y.toString();
    }
}
