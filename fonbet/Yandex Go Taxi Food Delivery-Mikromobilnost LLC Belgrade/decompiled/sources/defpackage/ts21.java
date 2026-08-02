package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes14.dex */
public final class ts21 extends kr31 implements xv5 {
    public final DetailsCardListItem d;

    static {
        int i = DetailsCardListItem.$stable;
    }

    public ts21(DetailsCardListItem detailsCardListItem) {
        super(detailsCardListItem);
        this.d = detailsCardListItem;
    }

    @Override // defpackage.xv5
    public final void c(Object obj) {
        us21 us21Var = (us21) obj;
        CharSequence charSequence = us21Var.b;
        DetailsCardListItem detailsCardListItem = this.d;
        detailsCardListItem.setTitle(charSequence);
        detailsCardListItem.setSubtitle(us21Var.c);
        Drawable drawable = us21Var.d.getDrawable();
        detailsCardListItem.clearLeadView();
        detailsCardListItem.setLeadImage(drawable);
        detailsCardListItem.applyStyle(us21Var.e);
        if (us21Var.f) {
            detailsCardListItem.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
        } else {
            detailsCardListItem.setDividers(DividerPosition.NONE, DividerType.NONE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts21) && this.d == ((ts21) obj).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "UserRequirementHolder(view=" + this.d + Extension.C_BRAKE;
    }
}
