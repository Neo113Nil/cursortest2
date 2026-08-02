package defpackage;

import java.util.Calendar;

/* loaded from: classes12.dex */
public final class unf0 {
    public final Calendar a;

    public unf0(Calendar calendar) {
        this.a = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unf0) && this.a.equals(((unf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
