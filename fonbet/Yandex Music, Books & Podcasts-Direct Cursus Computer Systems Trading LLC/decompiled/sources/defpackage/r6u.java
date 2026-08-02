package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r6u implements t6u {
    public final List a;
    public final wmn b;

    public r6u(List list, wmn wmnVar) {
        list.getClass();
        wmnVar.getClass();
        this.a = list;
        this.b = wmnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6u)) {
            return false;
        }
        r6u r6uVar = (r6u) obj;
        return Intrinsics.d(this.a, r6uVar.a) && this.b == r6uVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithClips(clips=" + this.a + ", recommendationType=" + this.b + ")";
    }
}
