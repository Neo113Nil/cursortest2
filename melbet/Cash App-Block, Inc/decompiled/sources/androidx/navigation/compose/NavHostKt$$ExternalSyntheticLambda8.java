package androidx.navigation.compose;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationKt;
import app.cash.local.primitives.LocationMenuKt;
import app.cash.local.primitives.OrderingMode;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.PerformanceMetrics;
import com.squareup.cash.graphics.views.effect.LightSource;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class NavHostKt$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ NavHostKt$$ExternalSyntheticLambda8(LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter, State state) {
        this.$r8$classId = 8;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LocalLocationDetail localLocationDetail;
        LocalLocationDetail localLocationDetail2;
        LocalMenu localMenu;
        List list;
        LocalLocationDetail localLocationDetail3;
        LocalLocationDetail localLocationDetail4;
        Money money;
        Long l;
        int i = this.$r8$classId;
        State state = this.f$0;
        switch (i) {
            case 0:
                List list2 = (List) state.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (Intrinsics.areEqual(((NavBackStackEntry) obj).destination.navigatorName, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return new Offset(((Offset) state.getValue()).packedValue);
            case 2:
                AnimationVector2D animationVector2D = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
                return new Offset(((Offset) state.getValue()).packedValue);
            case 3:
                return Boolean.valueOf(((Number) state.getValue()).floatValue() > RecyclerView.DECELERATION_RATE);
            case 4:
                return Boolean.valueOf(((Number) state.getValue()).floatValue() > RecyclerView.DECELERATION_RATE);
            case 5:
                LocalBrand localBrand = (LocalBrand) state.getValue();
                if (localBrand == null || (localLocationDetail = localBrand.selected_location) == null) {
                    return null;
                }
                return LocationKt.toLocation(localLocationDetail);
            case 6:
                return Boolean.valueOf(!((((Location.LocationDetail) state.getValue()) != null ? r7.summary.orderingMode : null) instanceof OrderingMode.Unavailable));
            case 7:
                Location.LocationDetail locationDetail = (Location.LocationDetail) state.getValue();
                if (locationDetail != null) {
                    return locationDetail.menu;
                }
                return null;
            case 8:
                LocalMoney localMoney = (LocalMoney) state.getValue();
                if (localMoney != null) {
                    return LocalMenuItemDetailsPresenter.prettyPrintOrBlank$1(localMoney, "");
                }
                return null;
            case 9:
                LocalBrand localBrand2 = (LocalBrand) state.getValue();
                if (localBrand2 == null || (localLocationDetail2 = localBrand2.selected_location) == null || (localMenu = localLocationDetail2.menu) == null) {
                    return null;
                }
                return LocationMenuKt.toLocationMenu(localMenu);
            case 10:
                LocalBrand localBrand3 = (LocalBrand) state.getValue();
                if (localBrand3 != null) {
                    return BrandKt.toBrand(localBrand3);
                }
                return null;
            case 11:
                Brand brand = (Brand) state.getValue();
                if (brand != null) {
                    return brand.fulfillmentSelection;
                }
                return null;
            case 12:
                LocalBrand.FulfillmentSelection fulfillmentSelection = (LocalBrand.FulfillmentSelection) state.getValue();
                return (fulfillmentSelection == null || (list = fulfillmentSelection.available_fulfillment_types) == null) ? EmptyList.INSTANCE : list;
            case 13:
                LocalBrand localBrand4 = (LocalBrand) state.getValue();
                if (localBrand4 == null || (localLocationDetail3 = localBrand4.selected_location) == null) {
                    return null;
                }
                return (String) LocationKt.toLocation(localLocationDetail3).summary.freeFulfillmentLabels.get(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY);
            case 14:
                LocalBrand localBrand5 = (LocalBrand) state.getValue();
                if (localBrand5 == null || (localLocationDetail4 = localBrand5.selected_location) == null) {
                    return null;
                }
                return LocationKt.toLocation(localLocationDetail4);
            case 15:
                return (Map) state.getValue();
            case 16:
                return new Vector4(((LightSource) state.getValue()).x, ((LightSource) state.getValue()).y, 0.5f, RecyclerView.DECELERATION_RATE);
            case 17:
                WandPoseController.Output output = (WandPoseController.Output) state.getValue();
                Vector3 vector3 = output.positionOffset;
                return WandPoseController.Output.copy$default(output, new Vector3(vector3.x * 0.035700005f, vector3.y * 0.035700005f, vector3.z * 0.035700005f));
            case 18:
                return (List) state.getValue();
            case 19:
                return (ZoomLevel) state.getValue();
            case 20:
                return Integer.valueOf(((Number) state.getValue()).intValue());
            case 21:
                Boolean bool = (Boolean) state.getValue();
                bool.getClass();
                return bool;
            case 22:
                return Boolean.valueOf(((Number) state.getValue()).floatValue() < 0.999f);
            case 23:
                return Boolean.valueOf(((Number) state.getValue()).floatValue() > 0.001f);
            case 24:
                return Boolean.valueOf(((double) ((Number) state.getValue()).floatValue()) > 0.5d);
            case 25:
                return Boolean.valueOf(!((List) state.getValue()).isEmpty());
            case 26:
                Instrument instrument = (Instrument) state.getValue();
                return Long.valueOf((instrument == null || (money = instrument.available_balance) == null || (l = money.amount) == null) ? 0L : l.longValue());
            case 27:
                return new Vector4(((LightSource) state.getValue()).x, ((LightSource) state.getValue()).y, 0.5f, RecyclerView.DECELERATION_RATE);
            case 28:
                return Long.valueOf(((PerformanceMetrics) state.getValue()).timeToFirstFrameMs);
            default:
                return Float.valueOf(((PerformanceMetrics) state.getValue()).fps);
        }
    }

    public /* synthetic */ NavHostKt$$ExternalSyntheticLambda8(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }
}
