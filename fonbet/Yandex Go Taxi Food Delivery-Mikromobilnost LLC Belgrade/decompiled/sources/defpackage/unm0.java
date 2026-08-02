package defpackage;

import com.yandex.go.due_timetable.domain.model.CalculationsStatus;
import java.util.Calendar;

/* loaded from: classes12.dex */
public final class unm0 {
    public final Calendar a;
    public final CalculationsStatus b;
    public final mp60 c;

    public unm0(Calendar calendar, CalculationsStatus calculationsStatus, mp60 mp60Var) {
        this.a = calendar;
        this.b = calculationsStatus;
        this.c = mp60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unm0)) {
            return false;
        }
        unm0 unm0Var = (unm0) obj;
        return jl40.l(this.a, unm0Var.a) && this.b == unm0Var.b && jl40.l(this.c, unm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
