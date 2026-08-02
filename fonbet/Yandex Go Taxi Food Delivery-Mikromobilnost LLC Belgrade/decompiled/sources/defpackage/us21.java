package defpackage;

import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class us21 {
    public static final /* synthetic */ int g = 0;
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final UiStateDrawableWrapper d;
    public final DetailsCardListItem.a e;
    public final boolean f;

    static {
        DetailsCardListItem.a aVar = DetailsCardListItem.a.g;
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public us21(String str, CharSequence charSequence, CharSequence charSequence2, UiStateDrawableWrapper uiStateDrawableWrapper, DetailsCardListItem.a aVar, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = uiStateDrawableWrapper;
        this.e = aVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us21)) {
            return false;
        }
        us21 us21Var = (us21) obj;
        return jl40.l(this.a, us21Var.a) && jl40.l(this.b, us21Var.b) && jl40.l(this.c, us21Var.c) && this.d.equals(us21Var.d) && this.e.equals(us21Var.e) && this.f == us21Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "UserRequirementItem(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", icon=");
        t.append(this.d);
        t.append(", style=");
        t.append(this.e);
        t.append(", hasDivider=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
