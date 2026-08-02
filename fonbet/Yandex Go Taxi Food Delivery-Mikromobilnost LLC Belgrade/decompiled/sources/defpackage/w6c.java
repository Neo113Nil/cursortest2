package defpackage;

import com.yandex.plus.core.data.common.PlusThemedImage;

/* loaded from: classes2.dex */
public final class w6c {
    public final CharSequence a;
    public final PlusThemedImage b;
    public final CharSequence c;
    public final CharSequence d;

    public w6c(CharSequence charSequence, PlusThemedImage plusThemedImage, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = charSequence;
        this.b = plusThemedImage;
        this.c = charSequence2;
        this.d = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6c)) {
            return false;
        }
        w6c w6cVar = (w6c) obj;
        return jl40.l(this.a, w6cVar.a) && jl40.l(this.b, w6cVar.b) && jl40.l(this.c, w6cVar.c) && jl40.l(this.d, w6cVar.d);
    }

    public final int hashCode() {
        int b = smw0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return b + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "ClosingOfferItem(titleText=" + ((Object) this.a) + ", logo=" + this.b + ", buttonText=" + ((Object) this.c) + ", buttonAdditionalText=" + ((Object) this.d) + ')';
    }
}
