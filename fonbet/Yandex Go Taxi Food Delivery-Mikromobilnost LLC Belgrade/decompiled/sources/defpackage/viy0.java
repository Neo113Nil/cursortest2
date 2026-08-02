package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class viy0 extends lys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ viy0(View view, int i) {
        super(view);
        this.S = i;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                ListItemComponent listItemComponent = (ListItemComponent) ((View) obj2);
                listItemComponent.setTitle("Testing commands 🔧");
                listItemComponent.setDividers(((fij0) obj).b ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
                break;
            case 1:
                w8n0 w8n0Var = (w8n0) obj;
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) obj2);
                listItemComponent2.setLeadImage(w8n0Var.a);
                listItemComponent2.setTitle(w8n0Var.b);
                listItemComponent2.setSubtitle(w8n0Var.c);
                if (w8n0Var.d) {
                    listItemComponent2.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
                } else {
                    listItemComponent2.setDividers(DividerPosition.NONE, DividerType.NONE);
                }
                listItemComponent2.setTrailCompanionText(w8n0Var.e);
                break;
            default:
                ((RobotoTextView) ((View) obj2)).setText(((tqo0) obj).a);
                break;
        }
    }
}
