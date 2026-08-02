package defpackage;

import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;
import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.go.navigator.settings.BaseSettingsModalView;
import ru.yandex.taxi.delivery.ui.form.DeliveryFormModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

/* loaded from: classes12.dex */
public final /* synthetic */ class x95 implements nn50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x95(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nn50
    public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        Object obj = this.b;
        switch (i5) {
            case 0:
                ((BaseSettingsModalView) obj).updateShadowVisibility();
                break;
            case 1:
                hc6 hc6Var = (hc6) obj;
                ImageView imageView = hc6Var.b;
                NestedScrollViewAdvanced nestedScrollViewAdvanced = hc6Var.a;
                if (nestedScrollViewAdvanced.canScrollVertically(1) && imageView.getVisibility() != 0) {
                    imageView.setVisibility(0);
                    break;
                } else if (!nestedScrollViewAdvanced.canScrollVertically(1) && imageView.getVisibility() == 0) {
                    imageView.setVisibility(8);
                    break;
                }
                break;
            case 2:
                DeliveryFormModalView.onScrollListener$lambda$0((DeliveryFormModalView) obj, nestedScrollView, i, i2, i3, i4);
                break;
            case 3:
                ((DrivingModalView) obj).updateShadowVisibility();
                break;
            case 4:
                ((lls) obj).a();
                break;
            case 5:
                ((GasStationsFiltersListModalView) obj).updateShadowVisibility();
                break;
            case 6:
                ((GasStationsFiltersModalView) obj).updateShadowVisibility();
                break;
            case 7:
                ((PreGeoAuthOnboardingModalView) obj).updateAgreementScrollFadeVisibility();
                break;
            case 8:
                RateRouteModalView.addShadowScrollListener$lambda$0((RateRouteModalView) obj, nestedScrollView, i, i2, i3, i4);
                break;
            case 9:
                ((ShadowScrollIndicator) obj).checkScrollPosition();
                break;
            default:
                ((hlx0) obj).z();
                break;
        }
    }
}
