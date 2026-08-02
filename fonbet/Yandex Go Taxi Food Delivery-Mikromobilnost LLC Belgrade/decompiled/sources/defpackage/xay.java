package defpackage;

import com.yandex.plus.core.graphql.type.LEGAL_ITEM_TYPE;

/* loaded from: classes2.dex */
public final class xay {
    public final LEGAL_ITEM_TYPE a;
    public final String b;
    public final way c;

    public xay(LEGAL_ITEM_TYPE legal_item_type, String str, way wayVar) {
        this.a = legal_item_type;
        this.b = str;
        this.c = wayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xay)) {
            return false;
        }
        xay xayVar = (xay) obj;
        return this.a == xayVar.a && this.b.equals(xayVar.b) && this.c.equals(xayVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Item(type=" + this.a + ", key=" + this.b + ", data=" + this.c + ')';
    }
}
