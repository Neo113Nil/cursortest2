package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes6.dex */
public final class xu01 extends l1c {
    public static final /* synthetic */ int U = 0;

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        View view = (View) this.R;
        iij0 iij0Var = (iij0) k1cVar;
        ((ListItemComponent) view).setDividers(iij0Var.g ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
        ((ListItemComponent) view).setTitle(iij0Var.a);
        ((ListItemComponent) view).setSubtitle(iij0Var.b);
    }
}
