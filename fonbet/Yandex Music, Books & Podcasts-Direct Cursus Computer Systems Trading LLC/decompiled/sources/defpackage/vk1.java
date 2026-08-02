package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class vk1 implements wk1 {
    public final ArrayList a;

    public vk1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk1) && this.a.equals(((vk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("Success(tracks=", ")", this.a);
    }
}
