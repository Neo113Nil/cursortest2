package defpackage;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dde {
    public final Resources.Theme a;
    public final int b;

    public dde(int i, Resources.Theme theme) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dde)) {
            return false;
        }
        dde ddeVar = (dde) obj;
        return Intrinsics.d(this.a, ddeVar.a) && this.b == ddeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return vz1.r(sb, this.b, ')');
    }
}
