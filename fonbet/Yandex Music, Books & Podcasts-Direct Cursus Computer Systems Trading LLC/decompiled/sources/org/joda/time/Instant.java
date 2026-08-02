package org.joda.time;

import defpackage.rk4;
import defpackage.w6;
import java.io.Serializable;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes5.dex */
public final class Instant extends w6 implements Serializable {
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant(long j) {
        this.iMillis = j;
    }

    @Override // defpackage.w6
    public final rk4 b() {
        return ISOChronology.J;
    }

    @Override // defpackage.w6
    public final long c() {
        return this.iMillis;
    }
}
