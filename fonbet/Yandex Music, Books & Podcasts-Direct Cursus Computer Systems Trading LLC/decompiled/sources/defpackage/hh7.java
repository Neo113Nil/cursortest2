package defpackage;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public abstract class hh7 extends mq2 {
    public final xc7 b;

    public hh7(xc7 xc7Var, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (xc7Var == null) {
            xq0.x("The field must not be null");
            throw null;
        }
        if (xc7Var.t()) {
            this.b = xc7Var;
        } else {
            xq0.x("The field must be supported");
            throw null;
        }
    }

    @Override // defpackage.xc7
    public psa g() {
        return this.b.g();
    }

    @Override // defpackage.xc7
    public psa p() {
        return this.b.p();
    }

    @Override // defpackage.xc7
    public final boolean s() {
        return this.b.s();
    }
}
