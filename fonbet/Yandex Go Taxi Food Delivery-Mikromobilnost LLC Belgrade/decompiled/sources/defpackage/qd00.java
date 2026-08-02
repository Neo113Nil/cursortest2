package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationModalView;
import com.ybsdk.feature.banners.api.view.PrizeProgressView;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.ShimmeringPaint;

/* loaded from: classes13.dex */
public final /* synthetic */ class qd00 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ qd00(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ImageView fullSizeImage_delegate$lambda$0;
        ShimmeringBar shimmer_delegate$lambda$0;
        int transparentColor_delegate$lambda$0;
        ShimmeringPaint shimmeringPaint_delegate$lambda$0;
        int bookingImageSize_delegate$lambda$0;
        int bookingImageOverlapMargin_delegate$lambda$0;
        int middleMargin_delegate$lambda$0;
        int i;
        int bottomMargin_delegate$lambda$0;
        int categoriesMargin_delegate$lambda$0;
        int shimmeringColor_delegate$lambda$0;
        int defaultFilledColor_delegate$lambda$0;
        int defaultUnfilledColor_delegate$lambda$1;
        int productCardHeight_delegate$lambda$0;
        LinearLayoutManager layoutManager_delegate$lambda$0;
        LinearLayoutManager layoutManager_delegate$lambda$02;
        int i2 = this.a;
        Context context = this.b;
        switch (i2) {
            case 0:
                context.startActivity(new Intent("android.settings.SETTINGS"));
                return zy11.a;
            case 1:
                return (AudioManager) context.getApplicationContext().getSystemService(AudioManager.class);
            case 2:
                fullSizeImage_delegate$lambda$0 = OrderCancelModalView.fullSizeImage_delegate$lambda$0(context);
                return fullSizeImage_delegate$lambda$0;
            case 3:
                shimmer_delegate$lambda$0 = OrderCancelModalView.shimmer_delegate$lambda$0(context);
                return shimmer_delegate$lambda$0;
            case 4:
                transparentColor_delegate$lambda$0 = OrganizationCardsSliderModalView.transparentColor_delegate$lambda$0(context);
                return Integer.valueOf(transparentColor_delegate$lambda$0);
            case 5:
                return Integer.valueOf(tje.r(mrg0.go_design_s_space, context) / 2);
            case 6:
                return Integer.valueOf(tje.r(mrg0.go_design_m_space, context));
            case 7:
                return Float.valueOf(tje.r(mrg0.go_design_m_space, context));
            case 8:
                return Float.valueOf(tje.r(dug0.discovery_organizations_horizontal_delimiter_height, context));
            case 9:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(mrg0.go_design_l_space));
            case 10:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(mrg0.go_design_m_space));
            case 11:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(dug0.organizations_first_element_vertical_margin));
            case 12:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(dug0.organizations_placeholder_vertical_margin));
            case 13:
                return Float.valueOf(context.getResources().getDimensionPixelSize(dug0.discovery_organizations_horizontal_delimiter_height));
            case 14:
                shimmeringPaint_delegate$lambda$0 = PlaceholderView.shimmeringPaint_delegate$lambda$0(context);
                return shimmeringPaint_delegate$lambda$0;
            case 15:
                bookingImageSize_delegate$lambda$0 = PlacesCategoryFiltersModalView.bookingImageSize_delegate$lambda$0(context);
                return Integer.valueOf(bookingImageSize_delegate$lambda$0);
            case 16:
                bookingImageOverlapMargin_delegate$lambda$0 = PlacesCategoryFiltersModalView.bookingImageOverlapMargin_delegate$lambda$0(context);
                return Integer.valueOf(bookingImageOverlapMargin_delegate$lambda$0);
            case 17:
                middleMargin_delegate$lambda$0 = PlacesCategoryFiltersModalView.middleMargin_delegate$lambda$0(context);
                return Integer.valueOf(middleMargin_delegate$lambda$0);
            case 18:
                i = PlacesCategoryFiltersModalView.topMargin_delegate$lambda$0(context);
                return Integer.valueOf(i);
            case 19:
                bottomMargin_delegate$lambda$0 = PlacesCategoryFiltersModalView.bottomMargin_delegate$lambda$0(context);
                return Integer.valueOf(bottomMargin_delegate$lambda$0);
            case 20:
                categoriesMargin_delegate$lambda$0 = PlacesCategoryFiltersModalView.categoriesMargin_delegate$lambda$0(context);
                return Integer.valueOf(categoriesMargin_delegate$lambda$0);
            case 21:
                return Integer.valueOf(tje.r(mrg0.go_design_m_space, context));
            case 22:
                return Integer.valueOf(tje.r(mrg0.go_design_l_space, context));
            case 23:
                return Integer.valueOf(tje.r(dug0.discovery_organizations_map_focus_rect_bottom_margin, context));
            case 24:
                shimmeringColor_delegate$lambda$0 = PriceRecalculationModalView.shimmeringColor_delegate$lambda$0(context);
                return Integer.valueOf(shimmeringColor_delegate$lambda$0);
            case 25:
                defaultFilledColor_delegate$lambda$0 = PrizeProgressView.defaultFilledColor_delegate$lambda$0(context);
                return Integer.valueOf(defaultFilledColor_delegate$lambda$0);
            case 26:
                defaultUnfilledColor_delegate$lambda$1 = PrizeProgressView.defaultUnfilledColor_delegate$lambda$1(context);
                return Integer.valueOf(defaultUnfilledColor_delegate$lambda$1);
            case 27:
                productCardHeight_delegate$lambda$0 = ProductCardListView.productCardHeight_delegate$lambda$0(context);
                return Integer.valueOf(productCardHeight_delegate$lambda$0);
            case 28:
                layoutManager_delegate$lambda$0 = RideCardCompactView.layoutManager_delegate$lambda$0(context);
                return layoutManager_delegate$lambda$0;
            default:
                layoutManager_delegate$lambda$02 = RideCardModalView.layoutManager_delegate$lambda$0(context);
                return layoutManager_delegate$lambda$02;
        }
    }
}
