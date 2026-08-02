package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class e4o implements f4o {

    @NotNull
    public static final d4o Companion = new d4o();
    public final String a;

    public /* synthetic */ e4o(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4o) && Intrinsics.d(this.a, ((e4o) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Deeplink(link="), this.a, ')');
    }
}
