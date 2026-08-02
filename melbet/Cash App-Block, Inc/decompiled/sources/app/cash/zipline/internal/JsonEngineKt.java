package app.cash.zipline.internal;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public abstract class JsonEngineKt {
    public static final Object decodeFromStringFast(Json json, KSerializer kSerializer, String str) {
        json.getClass();
        kSerializer.getClass();
        str.getClass();
        return json.decodeFromString(str, kSerializer);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewExternalMapApplication.deepLinkSpecs;
    }
}
