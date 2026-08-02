package defpackage;

import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class zcw extends xwy0 {
    public final ListItemCheckComponent O;
    public final pav P;
    public final k7x0 Q;
    public final xen R;
    public g18 S;

    public zcw(ListItemCheckComponent listItemCheckComponent, pav pavVar, k7x0 k7x0Var, xen xenVar) {
        super(listItemCheckComponent);
        this.O = listItemCheckComponent;
        this.P = pavVar;
        this.Q = k7x0Var;
        this.R = xenVar;
        this.S = g18.u1;
    }

    public final void W(ClickableImageView clickableImageView, String str) {
        if (evu0.J(str)) {
            clickableImageView.setImageDrawable(null);
            clickableImageView.setTag(null);
        } else {
            String a = ((m7x0) this.Q).a(str);
            this.S.cancel();
            this.S = ((nac) this.P.a(clickableImageView)).c(a);
            clickableImageView.setTag(str);
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ListItemCheckComponent listItemCheckComponent = this.O;
        String str = (String) listItemCheckComponent.getLeadImageView().getTag();
        if (str != null) {
            W(listItemCheckComponent.getLeadImageView(), str);
        }
    }
}
