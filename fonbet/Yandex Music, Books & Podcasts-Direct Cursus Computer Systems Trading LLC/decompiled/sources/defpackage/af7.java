package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class af7 extends sro {

    @NotNull
    public static final ze7 Companion = new ze7();
    public final String a;
    public final String b;

    public af7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, ye7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!af7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        af7 af7Var = (af7) obj;
        return Intrinsics.d(this.a, af7Var.a) && Intrinsics.d(this.b, af7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return hrg.s("DebugScaffold(message='", this.a, "', details=", this.b, ")");
    }

    public af7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
