package com.squareup.cash.clientrouting;

import com.datadog.android.rum.model.ViewEvent;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.data.TargetDestination;
import java.net.URLDecoder;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class UtilsKt {
    public static final boolean containsCashAppPayGrantDeepLink(RoutingParams routingParams) {
        String str;
        String decode;
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        return (deepLinkMetadata == null || (str = deepLinkMetadata.originalUrl) == null || (decode = URLDecoder.decode(str, "utf-8")) == null || !StringsKt.contains((CharSequence) decode, (CharSequence) "GRANTLY_MANAGED_GRANT", false) || !StringsKt.contains((CharSequence) decode, (CharSequence) "request_id", false)) ? false : true;
    }

    public static ViewEvent.CiTest fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("test_execution_id").getAsString();
            asString.getClass();
            return new ViewEvent.CiTest(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type CiTest", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type CiTest", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type CiTest", e3);
            return null;
        }
    }

    public static final TargetDestination.RouteDestination toRouteDestination(ClientRoute clientRoute, RealClientRouteFormatter realClientRouteFormatter, RoutingParams routingParams) {
        clientRoute.getClass();
        return new TargetDestination.RouteDestination(routingParams, zzjm.format(realClientRouteFormatter, clientRoute));
    }
}
