package org.joda.time.field;

import defpackage.ghh;
import defpackage.psa;
import java.io.Serializable;
import org.joda.time.DurationFieldType;

/* loaded from: classes5.dex */
public final class MillisDurationField extends psa implements Serializable {
    public static final MillisDurationField a = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.psa
    public final long a(int i, long j) {
        return ghh.D(j, i);
    }

    @Override // defpackage.psa
    public final long b(long j, long j2) {
        return ghh.D(j, j2);
    }

    @Override // defpackage.psa
    public final DurationFieldType c() {
        return DurationFieldType.l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long d = ((psa) obj).d();
        if (1 == d) {
            return 0;
        }
        return 1 < d ? -1 : 1;
    }

    @Override // defpackage.psa
    public final long d() {
        return 1L;
    }

    @Override // defpackage.psa
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        return obj instanceof MillisDurationField;
    }

    @Override // defpackage.psa
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return (int) 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
