package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScrollableItemBadge$Anchor;

/* loaded from: classes5.dex */
public final class xjp0 {
    public final FormattedText a;
    public final String b;
    public final ScrollableItemBadge$Anchor c;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public xjp0(FormattedText formattedText, String str, ScrollableItemBadge$Anchor scrollableItemBadge$Anchor) {
        this.a = formattedText;
        this.b = str;
        this.c = scrollableItemBadge$Anchor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjp0)) {
            return false;
        }
        xjp0 xjp0Var = (xjp0) obj;
        return this.a.equals(xjp0Var.a) && jl40.l(this.b, xjp0Var.b) && this.c == xjp0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ScrollableItemBadge$Anchor scrollableItemBadge$Anchor = this.c;
        return hashCode2 + (scrollableItemBadge$Anchor != null ? scrollableItemBadge$Anchor.hashCode() : 0);
    }

    public final String toString() {
        return "ScrollableItemBadge(text=" + this.a + ", backgroundColor=" + this.b + ", anchor=" + this.c + Extension.C_BRAKE;
    }
}
