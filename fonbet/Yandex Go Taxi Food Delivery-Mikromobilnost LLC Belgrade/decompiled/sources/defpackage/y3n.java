package defpackage;

import kotlin.time.DurationUnit;

/* loaded from: classes9.dex */
public class y3n {
    public static final double a(double d, DurationUnit durationUnit, DurationUnit durationUnit2) {
        long convert = durationUnit2.getTimeUnit().convert(1L, durationUnit.getTimeUnit());
        return convert > 0 ? d * convert : d / durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
    }
}
