package org.joda.time.field;

import defpackage.mq2;
import defpackage.psa;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;

/* loaded from: classes5.dex */
public abstract class a extends mq2 {
    public final long b;
    public final psa c;

    public a(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.b = j;
        final DurationFieldType a = dateTimeFieldType.a();
        this.c = new BaseDurationField(a) { // from class: org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField
            private static final long serialVersionUID = -203813474600094134L;

            @Override // defpackage.psa
            public final long a(int i, long j2) {
                return a.this.a(i, j2);
            }

            @Override // defpackage.psa
            public final long b(long j2, long j3) {
                return a.this.E(j2, j3);
            }

            @Override // defpackage.psa
            public final long d() {
                return a.this.b;
            }

            @Override // defpackage.psa
            public final boolean e() {
                return false;
            }
        };
    }

    public abstract long E(long j, long j2);

    @Override // defpackage.xc7
    public final psa g() {
        return this.c;
    }
}
