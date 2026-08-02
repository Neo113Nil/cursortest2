package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zez extends afz {
    public final ArrayList a;

    public zez(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zez) && this.a.equals(((zez) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.m(new StringBuilder("Valid(servers="), this.a, ')');
    }
}
