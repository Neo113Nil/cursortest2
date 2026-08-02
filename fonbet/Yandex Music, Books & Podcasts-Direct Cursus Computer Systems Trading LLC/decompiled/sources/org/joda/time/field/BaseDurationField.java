package org.joda.time.field;

import defpackage.psa;
import defpackage.xq0;
import java.io.Serializable;
import org.joda.time.DurationFieldType;

/* loaded from: classes5.dex */
public abstract class BaseDurationField extends psa implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType != null) {
            this.iType = durationFieldType;
        } else {
            xq0.x("The type must not be null");
            throw null;
        }
    }

    @Override // defpackage.psa
    public final DurationFieldType c() {
        return this.iType;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long d = ((psa) obj).d();
        long d2 = d();
        if (d2 == d) {
            return 0;
        }
        return d2 < d ? -1 : 1;
    }

    @Override // defpackage.psa
    public final boolean f() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.iType.b() + ']';
    }
}
