package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class ejg implements fjg {

    @NotNull
    public static final djg Companion = new djg();
    public final String a;

    public /* synthetic */ ejg(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, cjg.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejg) && Intrinsics.d(this.a, ((ejg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Deeplink(link="), this.a, ')');
    }

    public ejg(String str) {
        str.getClass();
        this.a = str;
    }
}
