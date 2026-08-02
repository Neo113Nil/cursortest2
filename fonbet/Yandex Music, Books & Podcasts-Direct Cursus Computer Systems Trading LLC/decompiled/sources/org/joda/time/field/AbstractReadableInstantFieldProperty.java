package org.joda.time.field;

import defpackage.rk4;
import defpackage.xc7;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    public abstract rk4 a();

    public abstract xc7 b();

    public abstract long c();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbstractReadableInstantFieldProperty) {
                AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
                if (b().b(c()) == abstractReadableInstantFieldProperty.b().b(abstractReadableInstantFieldProperty.c()) && b().q().equals(abstractReadableInstantFieldProperty.b().q())) {
                    rk4 a = a();
                    rk4 a2 = abstractReadableInstantFieldProperty.a();
                    if (a == a2 ? true : (a == null || a2 == null) ? false : a.equals(a2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return a().hashCode() + b().q().hashCode() + (b().b(c()) * 17);
    }

    public final String toString() {
        return "Property[" + b().o() + "]";
    }
}
