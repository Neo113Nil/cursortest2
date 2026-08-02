package ru.yandex.taxi.preorder.suggested.selection;

import android.content.res.ColorStateList;
import defpackage.czo0;
import defpackage.g18;
import defpackage.hbp0;
import defpackage.hc;
import defpackage.hl0;
import defpackage.kdc;
import defpackage.nac;
import defpackage.pav;
import defpackage.s8o;
import defpackage.tls;
import defpackage.tse;
import defpackage.x9v0;
import defpackage.zn0;
import defpackage.zt;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class a extends c {
    public final ru.yandex.taxi.widget.c e0;
    public final hbp0 f0;
    public g18 g0;

    public a(tse tseVar, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, SuggestsView.a aVar, pav pavVar, ru.yandex.taxi.widget.c cVar) {
        super(tseVar, listItemComponent, listItemComponent2, aVar, pavVar, cVar);
        this.e0 = cVar;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.f0 = hbp0Var;
        hbp0Var.a();
        listItemComponent2.ellipsizeTitleMiddle(true);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.c
    public final void X(x9v0 x9v0Var, SuggestsView.State state, PointType pointType, boolean z, zt ztVar) {
        super.X(x9v0Var, state, pointType, z, ztVar);
        FormattedText formattedText = x9v0Var.g;
        boolean z2 = x9v0Var.N;
        ListItemComponent listItemComponent = this.O;
        if (z2 || x9v0Var.O || (x9v0Var.i == null && x9v0Var.j == null && !x9v0Var.M)) {
            listItemComponent.setAutoMinHeight();
            listItemComponent.setDividers(DividerPosition.NONE, DividerType.NONE);
        } else {
            listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
        }
        listItemComponent.setDebounceClickListener(new hc(6, x9v0Var, this));
        c0(formattedText, new zn0(this, 0));
        if (((formattedText == null || !formattedText.d()) ? 8 : state.getSubtitleVisibility()) == 0) {
            listItemComponent.showSubtitle();
        } else {
            listItemComponent.hideSubtitle();
        }
        this.P.Zd(x9v0Var.A, x9v0Var.B);
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.c
    public final void Y(x9v0 x9v0Var, boolean z, zt ztVar) {
        if (x9v0Var.M) {
            super.Y(x9v0Var, z, ztVar);
            return;
        }
        ListItemComponent listItemComponent = this.O;
        listItemComponent.clearTrailView();
        hl0 hl0Var = x9v0Var.C;
        if (hl0Var != null) {
            String str = x9v0Var.A;
            String str2 = x9v0Var.B;
            FormattedText formattedText = hl0Var.a;
            if (formattedText != null) {
                hbp0.e(this.f0, null, null, new AdditionalSuggestHolder$setTrailButton$1$1(this, formattedText, hl0Var, str, str2, null), 3);
                return;
            }
            return;
        }
        String str3 = x9v0Var.j;
        if (str3 != null) {
            this.g0 = ((nac) this.Q.a(listItemComponent.getTrailImageView())).c(str3);
        }
        kdc kdcVar = x9v0Var.z;
        if (kdcVar != null) {
            listItemComponent.setTrailTint(s8o.m(kdcVar, this.a.getContext()));
        }
        c0(x9v0Var.d, new zn0(this, 1));
        c0(x9v0Var.e, new zn0(this, 2));
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.c
    public final void a0(x9v0 x9v0Var) {
        String str = x9v0Var.i;
        ListItemComponent listItemComponent = this.O;
        if (str == null || str.length() == 0) {
            listItemComponent.getLeadImageView().setImageDrawable(null);
            listItemComponent.getLeadImageView().setVisibility(8);
        } else {
            this.g0 = ((nac) this.Q.a(listItemComponent.getLeadImageView())).c(str);
            listItemComponent.getLeadImageView().setVisibility(0);
        }
        kdc kdcVar = x9v0Var.y;
        if (kdcVar == null) {
            listItemComponent.setLeadTint((ColorStateList) null);
        } else {
            listItemComponent.setLeadTint(s8o.m(kdcVar, this.a.getContext()));
        }
    }

    @Override // ru.yandex.taxi.preorder.suggested.selection.c
    public final void b0() {
        super.b0();
        g18 g18Var = this.g0;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.f0.b();
    }

    public final void c0(FormattedText formattedText, tls tlsVar) {
        if (formattedText != null) {
            hbp0.e(this.f0, null, null, new AdditionalSuggestHolder$setText$1$1(this, formattedText, tlsVar, null), 3);
        }
    }
}
