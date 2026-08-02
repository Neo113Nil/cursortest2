package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class uu6 {
    public final int a;
    public final String b;
    public final List c;

    public uu6(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu6)) {
            return false;
        }
        uu6 uu6Var = (uu6) obj;
        return this.a == uu6Var.a && jl40.l(this.b, uu6Var.b) && this.c.equals(uu6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiDataCategory(headerIconId=");
        sb.append(this.a);
        sb.append(", categoryName=");
        sb.append(this.b);
        sb.append(", emojiDataList=");
        return unr0.t(sb, this.c, ')');
    }
}
