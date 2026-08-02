package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class v47 extends wys {
    public static final /* synthetic */ int S = 0;
    public final ListItemComponent R;

    public v47(ListItemComponent listItemComponent) {
        super(listItemComponent);
        this.R = listItemComponent;
    }

    @Override // defpackage.wys
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final void c(oz7 oz7Var) {
        kdc kdcVar = oz7Var.b;
        ListItemComponent listItemComponent = this.R;
        if (kdcVar != null) {
            listItemComponent.setRoundedBackground(s8o.m(kdcVar, listItemComponent.getContext()));
        }
        listItemComponent.setTitle(oz7Var.a);
        listItemComponent.setSubtitle(oz7Var.c);
        listItemComponent.setTitleTextSizePx(c.d(mrg0.component_text_size_body, this.a));
        listItemComponent.setTitleAlignment(1);
        listItemComponent.setSubtitleAlignment(1);
        listItemComponent.setTitleTypeface(0);
        listItemComponent.setVerticalPadding(0);
        if (u47.a[oz7Var.e.ordinal()] == 1) {
            listItemComponent.startProgressAnimation();
            listItemComponent.setEnabled(false);
        } else {
            listItemComponent.stopProgressAnimation();
            listItemComponent.setEnabled(true);
        }
    }
}
