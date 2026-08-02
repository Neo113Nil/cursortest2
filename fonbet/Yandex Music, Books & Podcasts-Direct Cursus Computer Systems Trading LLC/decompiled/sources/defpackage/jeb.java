package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class jeb implements keb {
    public final ArrayList a;

    public jeb(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jeb) && this.a.equals(((jeb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(episodes=", ")", this.a);
    }
}
