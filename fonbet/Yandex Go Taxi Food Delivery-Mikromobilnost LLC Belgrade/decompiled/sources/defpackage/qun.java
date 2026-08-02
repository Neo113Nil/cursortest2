package defpackage;

import androidx.emoji2.emojipicker.ItemType;

/* loaded from: classes10.dex */
public final class qun extends g3x {
    public String c;
    public final boolean d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qun(String str, int i, int i2) {
        super(ItemType.EMOJI);
        boolean z = (i2 & 2) != 0;
        i = (i2 & 4) != 0 ? 0 : i;
        this.c = str;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qun)) {
            return false;
        }
        qun qunVar = (qun) obj;
        return jl40.l(this.c, qunVar.c) && this.d == qunVar.d && this.e == qunVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + unr0.e(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiViewData(emoji=");
        sb.append(this.c);
        sb.append(", updateToSticky=");
        sb.append(this.d);
        sb.append(", dataIndex=");
        return oyr.s(sb, this.e, ')');
    }
}
