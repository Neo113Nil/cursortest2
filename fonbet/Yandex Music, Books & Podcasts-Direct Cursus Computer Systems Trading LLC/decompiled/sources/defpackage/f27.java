package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.viewpager2.widget.ViewPager2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class f27 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f27(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                TransitionManager.endTransitions((LinearLayout) obj);
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ((oc9) obj).getViewPager().c();
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ((ViewPager2) obj).c();
                break;
            case 3:
                view.removeOnLayoutChangeListener(this);
                ((dc9) obj).d();
                break;
            case 4:
                view.removeOnLayoutChangeListener(this);
                ((s2e) obj).p(view);
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
                View view2 = searchView.x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = zhu.a;
                    boolean z2 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.v0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i10 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    break;
                }
                break;
        }
    }
}
