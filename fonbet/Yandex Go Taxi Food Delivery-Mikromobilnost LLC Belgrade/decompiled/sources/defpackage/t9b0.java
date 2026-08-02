package defpackage;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.pickup_from_photo.navigation.b;
import com.yandex.go.places.address.loader.impl.modal.PlacesAddressLoaderModalView;
import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.experiments.map.pin_war_v2.PlacesPinWarV2Experiment;
import com.yandex.go.places.experiments.map.pin_war_v2.o;
import com.yandex.go.places.impl.navigation.d;
import com.yandex.go.places.impl.ui.bookings.PlacesBookingsModalView;
import com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersModalView;
import com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView;
import com.yandex.go.places.searchbar.impl.experiments.PlacesSearchbarExperiment;
import com.yandex.mapkit.map.MapObject;
import com.yandex.plus.acquisition.sdk.ui.api.PlusAcquisitionErrorView;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.feature.pfm.internal.ui.PfmTransactionsDataSkeletonType;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmExpandedCategoryHeaderView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFiltersView;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationParams;
import com.ybsdk.widgets.common.PinCodeDotsView;
import flex.engine.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plaque.PlaqueView;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;
import ru.yandex.taxi.widget.map.SourceOnMapControl;
import ru.yandex.yandexmaps.multiplatform.pin.war.api.PinWarAnimationType;

/* loaded from: classes13.dex */
public final /* synthetic */ class t9b0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t9b0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 render$lambda$4;
        qa3 filtersAdapter_delegate$lambda$2;
        zy11 zy11Var;
        zy11 showLoading$lambda$23;
        View insetsType$lambda$0;
        o5c0 bookingsAdapter_delegate$lambda$0;
        rbc0 mapCategoryFiltersAdapter_delegate$lambda$0;
        a engine;
        zy11 initViews$lambda$0$0;
        ViewGroup sceneRoot_delegate$lambda$0;
        TextView errorAdditionalTextView_delegate$lambda$0;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var2 = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                render$lambda$4 = PfmExpandedCategoryHeaderView.render$lambda$4((PfmExpandedCategoryHeaderView) obj);
                return render$lambda$4;
            case 1:
                filtersAdapter_delegate$lambda$2 = PfmFiltersView.filtersAdapter_delegate$lambda$2((PfmFiltersView) obj);
                return filtersAdapter_delegate$lambda$2;
            case 2:
                List<YbMobileTabBarConfig.TabBarItem> items = ((bab0) ((ecb0) obj)).a.q().getItems();
                ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YbMobileTabBarConfig.TabBarItem) it.next()).toEntity());
                }
                t8j0 t8j0Var = new t8j0();
                yfq0 yfq0Var = new yfq0(i2);
                return new wcb0(arrayList, t8j0Var, EmptyList.a, PfmTransactionsDataSkeletonType.IDLE, null, null, EmptySet.a, null, yfq0Var);
            case 3:
                zy11Var = PhoneConfirmationFragment.setupViews$lambda$6((PhoneConfirmationFragment) obj);
                return zy11Var;
            case 4:
                return new heb0(((PhoneConfirmationParams) obj).getShowAgreement(), 191);
            case 5:
                ((b) obj).r(new dia0(29));
                return zy11Var2;
            case 6:
                dt20 dt20Var = (dt20) obj;
                View inflate = LayoutInflater.from(((FrameLayout) dt20Var.b).getContext()).inflate(muh0.pickup_from_photo_tooltip, (ViewGroup) null, false);
                int i3 = f6h0.tooltip_content;
                AccessibilityLiveRegionTextView accessibilityLiveRegionTextView = (AccessibilityLiveRegionTextView) cma1.O(i3, inflate);
                if (accessibilityLiveRegionTextView == null) {
                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    return null;
                }
                BubbleComponent bubbleComponent = (BubbleComponent) inflate;
                fpb0 fpb0Var = new fpb0(bubbleComponent, accessibilityLiveRegionTextView);
                bubbleComponent.setDecorator((rju) dt20Var.c);
                bubbleComponent.setVisibility(8);
                return fpb0Var;
            case 7:
                return new SourceOnMapControl.a(((r0c0) obj).d(), null, null, false, false, null, null, 2046);
            case 8:
                xv10 xv10Var = (xv10) obj;
                pgu pguVar = new pgu();
                qgu qguVar = new qgu();
                ((hpr0) xv10Var.b).a(pguVar, qguVar);
                return ((sey) xv10Var.c).a(new b700(22, xv10Var, pguVar, qguVar));
            case 9:
                showLoading$lambda$23 = PinCodeDotsView.showLoading$lambda$23((PinCodeDotsView) obj);
                return showLoading$lambda$23;
            case 10:
                l1c0 l1c0Var = m1c0.a;
                PinWarAnimationType pinWarAnimationType = PinWarAnimationType.Smooth;
                float c = y6i0.c(((ru.yandex.yandexmaps.multiplatform.pin.war.internal.painter.a) obj).b, 0.01f, 10.0f);
                l1c0Var.getClass();
                return new o1c0(pinWarAnimationType, c);
            case 11:
                MapObject mapObject = (MapObject) obj;
                if (mapObject.isValid() && mapObject.getParent().isValid()) {
                    mapObject.getParent().remove(mapObject);
                }
                return zy11Var2;
            case 12:
                insetsType$lambda$0 = PlacesAddressLoaderModalView.insetsType$lambda$0((PlacesAddressLoaderModalView) obj);
                return insetsType$lambda$0;
            case 13:
                return Integer.valueOf(c.d(dug0.discovery_booking_item_icon_size, ((com.yandex.go.places.impl.ui.bookings.adapter.a) obj).a));
            case 14:
                bookingsAdapter_delegate$lambda$0 = PlacesBookingsModalView.bookingsAdapter_delegate$lambda$0((PlacesBookingsModalView) obj);
                return bookingsAdapter_delegate$lambda$0;
            case 15:
                mapCategoryFiltersAdapter_delegate$lambda$0 = PlacesCategoryFiltersModalView.mapCategoryFiltersAdapter_delegate$lambda$0((PlacesCategoryFiltersModalView) obj);
                return mapCategoryFiltersAdapter_delegate$lambda$0;
            case 16:
                Set set = ((n8c0) obj).c;
                ArrayList arrayList2 = new ArrayList(tcc.n(set, 10));
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new m8c0((e9c0) it2.next()));
                }
                return arrayList2;
            case 17:
                com.yandex.go.places.flex.container.domain.interactors.a aVar = ((b9c0) obj).y;
                return aVar.c.c(aVar.e);
            case 18:
                engine = ((FeedSdkComponent) obj).getEngine();
                return engine;
            case 19:
                ((d) obj).l0();
                return zy11Var2;
            case 20:
                return ((jbh) ((j) obj).a).e(PlacesMapScreenExperiment.m);
            case 21:
                return ((jbh) ((kcc0) obj).a).f(SimplePersistentBooleanExperiment.PLACES_ORGANIZATION_SNIPPET_V2);
            case 22:
                initViews$lambda$0$0 = PlacesPaymentsCheckoutButtonsView.initViews$lambda$0$0((PlacesPaymentsCheckoutButtonsView) obj);
                return initViews$lambda$0$0;
            case 23:
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(((tcc0) obj).a.getColor(mqg0.transparent));
                return createBitmap;
            case 24:
                return ((jbh) ((o) obj).a).e(PlacesPinWarV2Experiment.m);
            case 25:
                return ((jbh) ((com.yandex.go.places.searchbar.impl.experiments.c) obj).a).e(PlacesSearchbarExperiment.i);
            case 26:
                return ((jbh) ((dgc0) obj).a).f(SimplePersistentBooleanExperiment.PLACES_USE_NATIVE_NAVIGATION);
            case 27:
                return ImageProvider.fromBitmap(u8b1.h(e3h0.places_user_location_arrow, ((mgc0) obj).b));
            case 28:
                sceneRoot_delegate$lambda$0 = PlaqueView.sceneRoot_delegate$lambda$0((PlaqueView) obj);
                return sceneRoot_delegate$lambda$0;
            default:
                errorAdditionalTextView_delegate$lambda$0 = PlusAcquisitionErrorView.errorAdditionalTextView_delegate$lambda$0((PlusAcquisitionErrorView) obj);
                return errorAdditionalTextView_delegate$lambda$0;
        }
    }
}
