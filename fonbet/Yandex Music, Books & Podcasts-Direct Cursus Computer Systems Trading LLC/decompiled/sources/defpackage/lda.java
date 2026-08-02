package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class lda implements mda {
    public final ArrayList a;

    public lda(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lda) && this.a.equals(((lda) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(albums=", ")", this.a);
    }
}
