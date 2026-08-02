package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class sdt {
    public final ges a;
    public final float b;

    public sdt(ges gesVar, float f) {
        gesVar.getClass();
        this.a = gesVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdt)) {
            return false;
        }
        sdt sdtVar = (sdt) obj;
        return Intrinsics.d(this.a, sdtVar.a) && Float.compare(this.b, sdtVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Typography(textStyle=");
        sb.append(this.a);
        sb.append(", labelSizeMultiplier=");
        return ouj.p(sb, this.b, ')');
    }
}
