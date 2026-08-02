package org.joda.time.field;

import defpackage.psa;
import defpackage.xq0;
import org.joda.time.DurationFieldType;

/* loaded from: classes5.dex */
public abstract class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final psa iField;

    public DecoratedDurationField(psa psaVar, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (psaVar.f()) {
            this.iField = psaVar;
        } else {
            xq0.x("The field must be supported");
            throw null;
        }
    }

    @Override // defpackage.psa
    public final boolean e() {
        return this.iField.e();
    }

    public final psa g() {
        return this.iField;
    }
}
