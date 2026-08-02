package app.cash.local.primitives;

import app.cash.local.primitives.Location;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface BaseLocationProperties {
    LocalAddress getAddress();

    List getAvailableFulfillmentTypes();

    String getName();

    Map getOpenStates();

    OrderingMode getOrderingMode();

    /* renamed from: getToken-QsI1X5w, reason: not valid java name */
    String mo1225getTokenQsI1X5w();

    ZoneId getZoneId();

    default Location.OpenState openState(LocalFulfillmentType localFulfillmentType) {
        localFulfillmentType.getClass();
        Location.OpenState openState = (Location.OpenState) getOpenStates().get(localFulfillmentType);
        if (openState != null) {
            return openState;
        }
        Location.OpenState openState2 = (Location.OpenState) getOpenStates().get(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED);
        return openState2 == null ? Location.OpenState.Unspecified.INSTANCE : openState2;
    }
}
