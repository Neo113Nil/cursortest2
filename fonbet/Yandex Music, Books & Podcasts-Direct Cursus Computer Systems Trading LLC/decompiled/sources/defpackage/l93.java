package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class l93 implements q93, qzn {
    public final ArrayList a;

    public l93(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l93) && this.a.equals(((l93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("AllChaptersBlock(trackItems=", ")", this.a);
    }
}
