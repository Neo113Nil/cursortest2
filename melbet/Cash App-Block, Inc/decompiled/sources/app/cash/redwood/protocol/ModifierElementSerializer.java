package app.cash.redwood.protocol;

import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonNull;
import okhttp3.internal.Tags;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ModifierElementSerializer implements KSerializer {
    public static final ModifierElementSerializer INSTANCE = new ModifierElementSerializer();
    public static final SerialDescriptorImpl descriptor = Tags.buildClassSerialDescriptor("ModifierElement", new SerialDescriptor[0], new Yoga$$ExternalSyntheticLambda0(25));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object obj;
        if (!(decoder instanceof JsonDecoder)) {
            a$$ExternalSyntheticBUOutline0.m$1("Can be deserialized only by JSON");
            return null;
        }
        JsonElement decodeJsonElement = ((JsonDecoder) decoder).decodeJsonElement();
        InlineClassDescriptor inlineClassDescriptor = JsonElementKt.jsonUnquotedLiteralDescriptor;
        decodeJsonElement.getClass();
        JsonArray jsonArray = decodeJsonElement instanceof JsonArray ? (JsonArray) decodeJsonElement : null;
        if (jsonArray == null) {
            JsonElementKt.error("JsonArray", decodeJsonElement);
            throw null;
        }
        List list = jsonArray.content;
        int size = list.size();
        if (1 > size || size >= 3) {
            Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "ModifierElement array may only have 1 or 2 values. Found: "));
            return null;
        }
        int parseInt = Integer.parseInt(JsonElementKt.getJsonPrimitive((JsonElement) list.get(0)).getContent());
        if (1 < list.size()) {
            obj = jsonArray.get(1);
        } else {
            ModifierElement.Companion.getClass();
            obj = JsonNull.INSTANCE;
        }
        return new ModifierElement(parseInt, (JsonElement) obj);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ModifierElement modifierElement = (ModifierElement) obj;
        modifierElement.getClass();
        if (!(encoder instanceof JsonEncoder)) {
            a$$ExternalSyntheticBUOutline0.m$1("Can be serialized only by JSON");
            return;
        }
        JsonEncoder jsonEncoder = (JsonEncoder) encoder;
        ArrayList arrayList = new ArrayList();
        int i = modifierElement.tag;
        JsonElement jsonElement = modifierElement.value;
        arrayList.add(JsonElementKt.JsonPrimitive(Integer.valueOf(i)));
        ModifierElement.Companion.getClass();
        if (!Intrinsics.areEqual(jsonElement, JsonNull.INSTANCE)) {
            jsonElement.getClass();
            arrayList.add(jsonElement);
        }
        jsonEncoder.encodeJsonElement(new JsonArray(arrayList));
    }
}
