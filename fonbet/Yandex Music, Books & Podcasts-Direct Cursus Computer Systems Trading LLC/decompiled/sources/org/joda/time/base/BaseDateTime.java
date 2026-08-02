package org.joda.time.base;

import defpackage.c6;
import defpackage.rk4;
import defpackage.sd7;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes5.dex */
public abstract class BaseDateTime extends c6 implements Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile rk4 iChronology;
    private volatile long iMillis;

    public BaseDateTime(long j, ISOChronology iSOChronology) {
        AtomicReference atomicReference = sd7.a;
        this.iChronology = iSOChronology;
        this.iMillis = j;
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.H();
        }
    }

    @Override // defpackage.w6
    public final rk4 b() {
        return this.iChronology;
    }

    @Override // defpackage.w6
    public final long c() {
        return this.iMillis;
    }

    public void d(long j) {
        this.iMillis = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDateTime() {
        this(System.currentTimeMillis(), ISOChronology.U());
        AtomicReference atomicReference = sd7.a;
    }
}
