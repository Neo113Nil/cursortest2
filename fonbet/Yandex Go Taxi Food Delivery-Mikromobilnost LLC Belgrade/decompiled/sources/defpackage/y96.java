package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
public final class y96 implements uyj0 {
    public final Status a;
    public final boolean b;

    public y96(Status status, boolean z) {
        cvw.m(status, "Status must not be null");
        this.a = status;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y96)) {
            return false;
        }
        y96 y96Var = (y96) obj;
        return this.a.equals(y96Var.a) && this.b == y96Var.b;
    }

    @Override // defpackage.uyj0
    public final Status getStatus() {
        return this.a;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + (this.b ? 1 : 0);
    }
}
