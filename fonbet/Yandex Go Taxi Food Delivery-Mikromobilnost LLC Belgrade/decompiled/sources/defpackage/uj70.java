package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class uj70 extends wys {
    public static final /* synthetic */ int T = 0;
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int R;
    public final View S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uj70(View view, int i) {
        super(view);
        this.R = i;
        this.S = view;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 0:
                return true;
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
                ol70 ol70Var = (ol70) obj;
                UiStateDrawableWrapper uiStateDrawableWrapper = ol70Var.a;
                Drawable drawable = uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null;
                String str = ol70Var.b;
                boolean z = ol70Var.d;
                ListItemComponent listItemComponent = (ListItemComponent) view;
                if (drawable == null) {
                    cma1.M(listItemComponent.getLeadImageView());
                } else {
                    listItemComponent.setLeadImage(drawable);
                    cma1.J(listItemComponent.getLeadImageView());
                }
                listItemComponent.setTitle(str);
                listItemComponent.setEnabled(!z);
                if (!z) {
                    listItemComponent.stopProgressAnimation();
                    break;
                } else {
                    listItemComponent.startProgressAnimation();
                    break;
                }
            case 1:
                ((ListItemComponent) view).setSubtitle(((slr0) obj).a);
                break;
            default:
                ((ImageView) view).setImageDrawable(((u2j) obj).a);
                break;
        }
    }
}
