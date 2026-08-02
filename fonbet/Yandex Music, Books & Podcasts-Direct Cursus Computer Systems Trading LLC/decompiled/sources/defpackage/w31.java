package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class w31 implements x31 {
    public final ArrayList a;

    public w31(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w31) && this.a.equals(((w31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(concerts=", ")", this.a);
    }
}
