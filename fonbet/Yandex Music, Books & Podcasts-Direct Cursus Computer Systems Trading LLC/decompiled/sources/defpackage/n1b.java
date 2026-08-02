package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class n1b implements o1b {
    public final ArrayList a;

    public n1b(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1b) && this.a.equals(((n1b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(waveUiDataList=", ")", this.a);
    }
}
