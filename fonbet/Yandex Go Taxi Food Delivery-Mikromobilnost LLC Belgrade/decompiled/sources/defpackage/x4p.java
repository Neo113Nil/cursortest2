package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes6.dex */
public final class x4p extends l1c {
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public final /* synthetic */ int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4p(ListItemComponent listItemComponent, tls tlsVar, int i) {
        super(listItemComponent, tlsVar);
        this.U = i;
    }

    @Override // defpackage.l1c
    public final void c0(k1c k1cVar) {
        int i = this.U;
        Object obj = this.R;
        switch (i) {
            case 0:
                xhj0 xhj0Var = (xhj0) k1cVar;
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj);
                listItemComponent.setTitle(xhj0Var.a.a);
                listItemComponent.setSubtitle(xhj0Var.a.b);
                listItemComponent.setDividers(xhj0Var.d ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
                break;
            default:
                bij0 bij0Var = (bij0) k1cVar;
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) obj);
                listItemComponent2.setTitle(bij0Var.a.a);
                listItemComponent2.setSubtitle(bij0Var.a.b);
                listItemComponent2.setDividers(bij0Var.d ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
                break;
        }
    }
}
