package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class uln0 {
    public final List a;
    public final boolean b;
    public final int c;
    public final CharSequence d;
    public final List e;

    public uln0(List list, boolean z, int i, CharSequence charSequence, List list2) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = charSequence;
        this.e = list2;
    }

    public static uln0 a(uln0 uln0Var, List list, boolean z, int i, CharSequence charSequence, List list2, int i2) {
        if ((i2 & 1) != 0) {
            list = uln0Var.a;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            z = uln0Var.b;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = uln0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            charSequence = uln0Var.d;
        }
        CharSequence charSequence2 = charSequence;
        if ((i2 & 16) != 0) {
            list2 = uln0Var.e;
        }
        uln0Var.getClass();
        return new uln0(list3, z2, i3, charSequence2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uln0)) {
            return false;
        }
        uln0 uln0Var = (uln0) obj;
        return jl40.l(this.a, uln0Var.a) && this.b == uln0Var.b && this.c == uln0Var.c && jl40.l(this.d, uln0Var.d) && jl40.l(this.e, uln0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + smw0.b(oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackInputState(selectedItems=");
        sb.append(this.a);
        sb.append(", requiresItemSelection=");
        sb.append(this.b);
        sb.append(", rating=");
        sb.append(this.c);
        sb.append(", comment=");
        sb.append((Object) this.d);
        sb.append(", photos=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }

    public uln0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ uln0(int i) {
        this(r1, false, 0, "", r1);
        EmptyList emptyList = EmptyList.a;
    }
}
