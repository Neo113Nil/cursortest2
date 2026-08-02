package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class sle {

    @NotNull
    public static final rle Companion = new rle();
    public final boolean a;

    public /* synthetic */ sle(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sle) && this.a == ((sle) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("InitFlags(blurHashOnOtherThread="), this.a, ')');
    }

    public sle() {
        this.a = false;
    }
}
