package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gy7 {
    public final String a;
    public final CharSequence b;
    public final String c;

    public gy7(String str, CharSequence charSequence, String str2) {
        str.getClass();
        charSequence.getClass();
        this.a = str;
        this.b = charSequence;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7Var = (gy7) obj;
        return Intrinsics.d(this.a, gy7Var.a) && Intrinsics.d(this.b, gy7Var.b) && Intrinsics.d(this.c, gy7Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionBottomSheetUiData(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append((Object) this.b);
        sb.append(", description=");
        return su4.o(sb, this.c, ")");
    }
}
