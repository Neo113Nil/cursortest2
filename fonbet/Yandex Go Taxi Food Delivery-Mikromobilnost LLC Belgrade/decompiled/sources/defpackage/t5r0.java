package defpackage;

import android.view.View;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes12.dex */
public final class t5r0 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final View S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5r0(View view, int i) {
        super(view);
        this.R = i;
        this.S = view;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 1:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        View view = this.S;
        switch (i) {
            case 0:
                ListGroupHeaderComponent listGroupHeaderComponent = (ListGroupHeaderComponent) view;
                listGroupHeaderComponent.setTitle(((s5r0) obj).a.a);
                listGroupHeaderComponent.setTitleTypeface(3);
                break;
            case 1:
                ((DividerAwareComponent) view).setDividers(DividerPosition.BOTTOM, ((y3j) obj).a);
                break;
            default:
                int i2 = ((ci80) obj).a;
                View view2 = this.a;
                c.D(c.h(i2, view2), tje.u(36, view2.getContext()), (PlaceholderView) view);
                break;
        }
    }
}
