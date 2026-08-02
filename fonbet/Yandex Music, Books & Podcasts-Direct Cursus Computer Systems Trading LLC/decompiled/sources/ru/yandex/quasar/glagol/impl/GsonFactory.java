package ru.yandex.quasar.glagol.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import defpackage.f1d;
import java.lang.reflect.Type;
import ru.yandex.quasar.glagol.ResponseMessage$Status;
import ru.yandex.quasar.glagol.State;
import ru.yandex.quasar.glagol.impl.GsonFactory;

/* loaded from: classes6.dex */
public class GsonFactory {
    /* JADX INFO: Access modifiers changed from: private */
    public static ResponseMessage$Status lambda$receievedMessagesParser$0(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String q = jsonElement.q();
        if ("SUCCESS".equalsIgnoreCase(q)) {
            return ResponseMessage$Status.SUCCESS;
        }
        if ("FAILURE".equalsIgnoreCase(q)) {
            return ResponseMessage$Status.FAILURE;
        }
        if ("UNSUPPORTED".equalsIgnoreCase(q)) {
            return ResponseMessage$Status.UNSUPPORTED;
        }
        throw new JsonParseException(f1d.g("Invalid status:", q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State.AliceState lambda$receievedMessagesParser$1(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String q = jsonElement.q();
        return "IDLE".equalsIgnoreCase(q) ? State.AliceState.IDLE : "BUSY".equalsIgnoreCase(q) ? State.AliceState.BUSY : "LISTENING".equalsIgnoreCase(q) ? State.AliceState.LISTENING : "SHAZAM".equalsIgnoreCase(q) ? State.AliceState.UNKNOWN : "SPEAKING".equalsIgnoreCase(q) ? State.AliceState.SPEAKING : State.AliceState.UNKNOWN;
    }

    public static Gson receievedMessagesParser() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        final int i = 0;
        gsonBuilder.b(ResponseMessage$Status.class, new JsonDeserializer() { // from class: zqd
            @Override // com.google.gson.JsonDeserializer
            public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                ResponseMessage$Status lambda$receievedMessagesParser$0;
                State.AliceState lambda$receievedMessagesParser$1;
                switch (i) {
                    case 0:
                        lambda$receievedMessagesParser$0 = GsonFactory.lambda$receievedMessagesParser$0(jsonElement, type, jsonDeserializationContext);
                        return lambda$receievedMessagesParser$0;
                    default:
                        lambda$receievedMessagesParser$1 = GsonFactory.lambda$receievedMessagesParser$1(jsonElement, type, jsonDeserializationContext);
                        return lambda$receievedMessagesParser$1;
                }
            }
        });
        final int i2 = 1;
        gsonBuilder.b(State.AliceState.class, new JsonDeserializer() { // from class: zqd
            @Override // com.google.gson.JsonDeserializer
            public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                ResponseMessage$Status lambda$receievedMessagesParser$0;
                State.AliceState lambda$receievedMessagesParser$1;
                switch (i2) {
                    case 0:
                        lambda$receievedMessagesParser$0 = GsonFactory.lambda$receievedMessagesParser$0(jsonElement, type, jsonDeserializationContext);
                        return lambda$receievedMessagesParser$0;
                    default:
                        lambda$receievedMessagesParser$1 = GsonFactory.lambda$receievedMessagesParser$1(jsonElement, type, jsonDeserializationContext);
                        return lambda$receievedMessagesParser$1;
                }
            }
        });
        return gsonBuilder.a();
    }
}
