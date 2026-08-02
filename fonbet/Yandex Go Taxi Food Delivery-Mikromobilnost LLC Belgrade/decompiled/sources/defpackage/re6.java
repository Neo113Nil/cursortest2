package defpackage;

import android.widget.ImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes14.dex */
public final class re6 extends wys {
    public final ListItemComponent R;
    public final pav S;
    public final tls T;

    public re6(ListItemComponent listItemComponent, pav pavVar, tls tlsVar) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = pavVar;
        this.T = tlsVar;
        int r = tje.r(pug0.order_card_default_icon_size, listItemComponent.getContext());
        listItemComponent.setDividers(DividerPosition.TOP, DividerType.NORMAL);
        int x = (int) tje.x(listItemComponent.getContext(), 8.0f);
        listItemComponent.setLeadImageSize(r);
        listItemComponent.setCenterFramePaddingStart(x);
        listItemComponent.setPadding(x, 0, 0, 0);
        listItemComponent.getLeadImageView().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        listItemComponent.setTrailTextSize(tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
    }

    @Override // defpackage.wys
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void c(qe6 qe6Var) {
        int i = qe6Var.e;
        ListItemComponent listItemComponent = this.R;
        listItemComponent.setBackgroundResource(i);
        listItemComponent.setTitle(qe6Var.a);
        listItemComponent.setTitleTextColor((kdc) null);
        listItemComponent.setSubtitle(qe6Var.b);
        listItemComponent.stopSubtitleProgressAnimation();
        pe6 pe6Var = qe6Var.c;
        pav pavVar = this.S;
        if (pe6Var != null) {
            nac nacVar = (nac) pavVar.a(listItemComponent.getLeadImageView());
            nacVar.i = new cc(listItemComponent, 1);
            nacVar.c(pe6Var.a);
        } else {
            listItemComponent.clearLeadView();
        }
        oe6 oe6Var = qe6Var.d;
        if (oe6Var != null) {
            listItemComponent.setTrailImage(oe6Var.a);
        } else {
            listItemComponent.clearTrailView();
        }
        listItemComponent.setTrailCompanionText((CharSequence) null);
        if (qe6Var.f == null) {
            listItemComponent.setDebounceClickListener(null);
        } else {
            listItemComponent.setDebounceClickListener(new mh3(15, this, qe6Var));
        }
    }
}
