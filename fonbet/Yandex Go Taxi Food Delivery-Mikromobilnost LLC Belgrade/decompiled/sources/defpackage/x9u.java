package defpackage;

import ru.yandex.taxi.favorites.list.ui.HeaderView;

/* loaded from: classes5.dex */
public final class x9u extends wys {
    public static final /* synthetic */ int S = 0;
    public final HeaderView R;

    public x9u(HeaderView headerView) {
        super(headerView);
        this.R = headerView;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        q2x q2xVar = (q2x) obj;
        p2x p2xVar = q2xVar.b;
        CharSequence charSequence = p2xVar.a;
        HeaderView headerView = this.R;
        headerView.setTitle(charSequence);
        CharSequence charSequence2 = p2xVar.b;
        if (charSequence2 == null || evu0.J(charSequence2)) {
            headerView.hideBadge();
        } else {
            headerView.showBadge(charSequence2);
        }
        headerView.setSubtitle(q2xVar.c);
    }
}
