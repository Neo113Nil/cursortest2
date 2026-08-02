package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class db3 implements gb3 {
    public final ArrayList a;

    public db3(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.gb3
    public final List a(j0s j0sVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db3) && this.a.equals(((db3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("SingleBlockList(blocks=", ")", this.a);
    }
}
