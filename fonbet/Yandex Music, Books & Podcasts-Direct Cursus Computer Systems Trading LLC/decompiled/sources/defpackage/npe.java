package defpackage;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class npe {

    @NotNull
    public static final mpe Companion = new mpe();
    public final int[] a;

    public /* synthetic */ npe(int[] iArr, int i) {
        if (1 == (i & 1)) {
            this.a = iArr;
        } else {
            u7g.V(i, 1, lpe.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!npe.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Arrays.equals(this.a, ((npe) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public npe(int[] iArr) {
        this.a = iArr;
    }
}
