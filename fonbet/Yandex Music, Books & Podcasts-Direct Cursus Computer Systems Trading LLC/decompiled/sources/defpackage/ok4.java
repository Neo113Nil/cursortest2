package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ok4 {
    public final ArrayList a;

    public ok4(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok4) && this.a.equals(((ok4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.h("ChromeDiscoveryResult(devices=", ")", this.a);
    }
}
