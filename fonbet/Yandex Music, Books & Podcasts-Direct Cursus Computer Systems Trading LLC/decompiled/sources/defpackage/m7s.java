package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m7s {
    public final View a;
    public final boolean b;
    public final boolean c;

    public m7s(View view, boolean z, boolean z2) {
        view.getClass();
        this.a = view;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7s)) {
            return false;
        }
        m7s m7sVar = (m7s) obj;
        return Intrinsics.d(this.a, m7sVar.a) && this.b == m7sVar.b && this.c == m7sVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewConfig(view=");
        sb.append(this.a);
        sb.append(", availableTextOverride=");
        sb.append(this.b);
        sb.append(", availableChangeVisibility=");
        return ouj.r(sb, this.c, ")");
    }
}
