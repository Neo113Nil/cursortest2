package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m9v implements n9v {
    public final String a;

    public m9v(String str) {
        f6v f6vVar = f6v.a;
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9v) || !Intrinsics.d(this.a, ((m9v) obj).a)) {
            return false;
        }
        f6v f6vVar = f6v.a;
        return true;
    }

    public final int hashCode() {
        return f6v.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Offline(targetId=" + this.a + ", reason=" + f6v.b + ")";
    }
}
