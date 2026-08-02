package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class xd20 implements je20 {
    public final ArrayList a;

    public xd20(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd20) && this.a.equals(((xd20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("Combined(simpleBackgrounds="), this.a, ')');
    }
}
