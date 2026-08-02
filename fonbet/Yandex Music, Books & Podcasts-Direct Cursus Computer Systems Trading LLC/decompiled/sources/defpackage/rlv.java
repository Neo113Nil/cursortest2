package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rlv extends tlv {
    public final String a;
    public final llv b;

    public rlv(String str, llv llvVar) {
        this.a = str;
        this.b = llvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlv)) {
            return false;
        }
        rlv rlvVar = (rlv) obj;
        return Intrinsics.d(this.a, rlvVar.a) && this.b.equals(rlvVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Loading(averageCoverColor=" + this.a + ", widgetButtons=" + this.b + ")";
    }
}
