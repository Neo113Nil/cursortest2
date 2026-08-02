package androidx.compose.material3;

import androidx.camera.compose.ViewfinderArgs;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import app.cash.local.primitives.BrandKt;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.LocationKt;
import app.cash.local.primitives.LocationMenuKt;
import app.cash.local.primitives.OrderStatusKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TooltipKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LocalLocationDetail localLocationDetail;
        LocalLocationDetail localLocationDetail2;
        LocalBrand.FulfillmentSelection fulfillmentSelection;
        LocalLocationDetail localLocationDetail3;
        LocalLocationDetail localLocationDetail4;
        LocalMenu localMenu;
        int i = this.$r8$classId;
        List list = null;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                return (LayoutCoordinates) mutableState.getValue();
            case 1:
                return new Pair(((ViewfinderArgs) mutableState.getValue()).surfaceRequest, ((ViewfinderArgs) mutableState.getValue()).implementationMode);
            case 2:
                return (ImplementationMode) mutableState.getValue();
            case 3:
                return new LazyListIntervalContent((Function1) mutableState.getValue());
            case 4:
                return new LazyGridIntervalContent((Function1) mutableState.getValue());
            case 5:
                return (LazyLayoutItemProvider) ((Function0) mutableState.getValue()).invoke();
            case 6:
                if (mutableState != null) {
                    return (List) mutableState.getValue();
                }
                return null;
            case 7:
                Boolean bool = (Boolean) mutableState.getValue();
                bool.booleanValue();
                return bool;
            case 8:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) mutableState.getValue();
                if (layoutCoordinates != null) {
                    return layoutCoordinates;
                }
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 9:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) mutableState.getValue();
                if (layoutCoordinates2 != null) {
                    return layoutCoordinates2;
                }
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 10:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 11:
                LocalBrand localBrand = (LocalBrand) mutableState.getValue();
                localBrand.getClass();
                return BrandKt.toBrand(localBrand);
            case 12:
                LocalBrand localBrand2 = (LocalBrand) mutableState.getValue();
                localBrand2.getClass();
                LocalLocationDetail localLocationDetail5 = localBrand2.selected_location;
                localLocationDetail5.getClass();
                return LocationKt.toLocation(localLocationDetail5);
            case 13:
                LocalBrand localBrand3 = (LocalBrand) mutableState.getValue();
                localBrand3.getClass();
                LocalLocationDetail localLocationDetail6 = localBrand3.selected_location;
                localLocationDetail6.getClass();
                LocalMenu localMenu2 = localLocationDetail6.menu;
                localMenu2.getClass();
                return LocationMenuKt.toLocationMenu(localMenu2);
            case 14:
                LocalBrand localBrand4 = (LocalBrand) mutableState.getValue();
                if (localBrand4 == null || (localLocationDetail = localBrand4.selected_location) == null) {
                    return null;
                }
                return LocationKt.toLocation(localLocationDetail);
            case 15:
                LocalBrand localBrand5 = (LocalBrand) mutableState.getValue();
                if (localBrand5 == null || (localLocationDetail2 = localBrand5.selected_location) == null) {
                    return null;
                }
                return LocationKt.toLocation(localLocationDetail2);
            case 16:
                LocalFulfillment localFulfillment = ((LocalOrder) mutableState.getValue()).fulfillment;
                if (localFulfillment != null) {
                    return FulfillmentKt.toFulfillment(localFulfillment);
                }
                return null;
            case 17:
                LocalOrder.OrderStatus orderStatus = ((LocalOrder) mutableState.getValue()).order_status;
                if (orderStatus != null) {
                    return OrderStatusKt.toOrderStatus(orderStatus);
                }
                return null;
            case 18:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 19:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 20:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 21:
                LocalBrand localBrand6 = (LocalBrand) mutableState.getValue();
                localBrand6.getClass();
                return BrandKt.toBrand(localBrand6);
            case 22:
                LocalBrand localBrand7 = (LocalBrand) mutableState.getValue();
                localBrand7.getClass();
                LocalLocationDetail localLocationDetail7 = localBrand7.selected_location;
                if (localLocationDetail7 != null) {
                    return LocationKt.toLocation(localLocationDetail7);
                }
                return null;
            case 23:
                LocalBrand localBrand8 = (LocalBrand) mutableState.getValue();
                if (localBrand8 != null && (fulfillmentSelection = localBrand8.fulfillment_selection) != null) {
                    list = fulfillmentSelection.available_fulfillment_types;
                }
                return list == null ? EmptyList.INSTANCE : list;
            case 24:
                LocalBrand localBrand9 = (LocalBrand) mutableState.getValue();
                if (localBrand9 == null || (localLocationDetail3 = localBrand9.selected_location) == null) {
                    return null;
                }
                return LocationKt.toLocation(localLocationDetail3);
            case 25:
                LocalBrand localBrand10 = (LocalBrand) mutableState.getValue();
                if (localBrand10 == null || (localLocationDetail4 = localBrand10.selected_location) == null || (localMenu = localLocationDetail4.menu) == null) {
                    return null;
                }
                return LocationMenuKt.toLocationMenu(localMenu);
            case 26:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 27:
                return ((TextFieldState) mutableState.getValue()).getValue$foundation().text;
            case 28:
                mutableState.setValue("");
                return Unit.INSTANCE;
            default:
                mutableState.setValue(Boolean.FALSE);
                return Boolean.TRUE;
        }
    }
}
