package defpackage;

import android.view.View;
import com.yandex.go.places.base.ui.modals.BasePlacesModalView;
import com.yandex.go.places.organization.card.impl.ui.card.common.BaseOrganizationCardModalView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

/* loaded from: classes13.dex */
public final class x55 implements t52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideableBindingModalView b;

    public /* synthetic */ x55(SlideableBindingModalView slideableBindingModalView, int i) {
        this.a = i;
        this.b = slideableBindingModalView;
    }

    @Override // defpackage.t52
    public final void d(int i, boolean z) {
        int i2 = this.a;
        SlideableBindingModalView slideableBindingModalView = this.b;
        switch (i2) {
            case 0:
                BaseOrganizationCardModalView baseOrganizationCardModalView = (BaseOrganizationCardModalView) slideableBindingModalView;
                baseOrganizationCardModalView.updateExpandedTopScrimForState(i);
                baseOrganizationCardModalView.onBottomSheetStateChanged(i);
                baseOrganizationCardModalView.updateCloseButtonVisibility(Integer.valueOf(i));
                break;
            default:
                BasePlacesModalView basePlacesModalView = (BasePlacesModalView) slideableBindingModalView;
                basePlacesModalView.updateExpandedTopScrimForState(i);
                basePlacesModalView.onBottomSheetStateChanged(i);
                break;
        }
    }

    @Override // defpackage.t52
    public final void i(float f, boolean z, View view) {
        float convertToOffsetFromAnchored;
        int expandedBottomSheetColor;
        int i = this.a;
        SlideableBindingModalView slideableBindingModalView = this.b;
        switch (i) {
            case 0:
                BaseOrganizationCardModalView baseOrganizationCardModalView = (BaseOrganizationCardModalView) slideableBindingModalView;
                convertToOffsetFromAnchored = baseOrganizationCardModalView.convertToOffsetFromAnchored(f);
                baseOrganizationCardModalView.updateExpandedTopScrimForSlide(f);
                expandedBottomSheetColor = baseOrganizationCardModalView.getExpandedBottomSheetColor();
                view.setBackgroundColor(cma1.m(convertToOffsetFromAnchored, expandedBottomSheetColor));
                baseOrganizationCardModalView.setItemsLayoutTranslationY(f);
                break;
            default:
                BasePlacesModalView basePlacesModalView = (BasePlacesModalView) slideableBindingModalView;
                basePlacesModalView.updateExpandedTopScrimForSlide(f);
                basePlacesModalView.onBottomSheetSlide(view, f);
                break;
        }
    }
}
