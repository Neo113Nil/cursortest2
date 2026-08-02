package app.cash.zipline.internal;

import com.squareup.cash.clientroutes.ClientRoute;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class SignaturePayloadKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFamilyAccounts.deepLinkSpecs;
    }

    public static final String signaturePayload(String str) {
        Json.Default r0 = Json.Default;
        r0.getClass();
        JsonElement jsonElement = (JsonElement) r0.decodeFromString(str, JsonElementSerializer.INSTANCE);
        jsonElement.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(JsonElementKt.getJsonObject(jsonElement));
        linkedHashMap.remove("unsigned");
        return r0.encodeToString(JsonElement.Companion.serializer(), new JsonObject(linkedHashMap));
    }
}
