package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ResourceEvent$Path$Companion$fromJsonElement$message$1;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public abstract class zzjb {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: JsonParseException -> 0x0082, TRY_LEAVE, TryCatch #3 {JsonParseException -> 0x0082, blocks: (B:11:0x004a, B:13:0x004e, B:15:0x0055, B:17:0x005b, B:31:0x006e, B:32:0x0075, B:42:0x0076, B:39:0x007a, B:35:0x007e, B:43:0x0085, B:44:0x008c), top: B:10:0x004a, inners: #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[EDGE_INSN: B:30:0x00a5->B:25:0x00a5 BREAK  A[LOOP:0: B:19:0x009a->B:22:0x00a2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085 A[Catch: JsonParseException -> 0x0082, TryCatch #3 {JsonParseException -> 0x0082, blocks: (B:11:0x004a, B:13:0x004e, B:15:0x0055, B:17:0x005b, B:31:0x006e, B:32:0x0075, B:42:0x0076, B:39:0x007a, B:35:0x007e, B:43:0x0085, B:44:0x008c), top: B:10:0x004a, inners: #5, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ResourceEvent.Path fromJsonElement(JsonElement jsonElement) {
        ResourceEvent.Path.String string2;
        ResourceEvent.Path.Long r0;
        int i;
        jsonElement.getClass();
        ArrayList arrayList = new ArrayList();
        ResourceEvent.Path path = null;
        try {
        } catch (JsonParseException e) {
            arrayList.add(e);
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new JsonParseException("Unable to parse json into type kotlin.String");
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        jsonPrimitive.getClass();
        try {
            try {
            } catch (IllegalStateException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type String", e2);
                string2 = null;
                try {
                    if (!(jsonElement instanceof JsonPrimitive)) {
                    }
                } catch (JsonParseException e3) {
                    arrayList.add(e3);
                }
            }
        } catch (UnsupportedOperationException e4) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type String", e4);
            string2 = null;
            if (!(jsonElement instanceof JsonPrimitive)) {
            }
        }
        if (!jsonPrimitive.isString()) {
            throw new JsonParseException("Can't convert jsonPrimitive to String");
        }
        String asString = jsonPrimitive.getAsString();
        asString.getClass();
        string2 = new ResourceEvent.Path.String(asString);
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new JsonParseException("Unable to parse json into type kotlin.Long");
        }
        JsonPrimitive jsonPrimitive2 = (JsonPrimitive) jsonElement;
        jsonPrimitive2.getClass();
        try {
            try {
            } catch (IllegalStateException e5) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Long", e5);
                r0 = null;
                i = 0;
                ResourceEvent.Path[] pathArr = {string2, r0};
                while (true) {
                    if (i >= 2) {
                    }
                    i++;
                }
                if (path == null) {
                }
            }
        } catch (NumberFormatException e6) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Long", e6);
            r0 = null;
            i = 0;
            ResourceEvent.Path[] pathArr2 = {string2, r0};
            while (true) {
                if (i >= 2) {
                }
                i++;
            }
            if (path == null) {
            }
        } catch (UnsupportedOperationException e7) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Long", e7);
            r0 = null;
            i = 0;
            ResourceEvent.Path[] pathArr22 = {string2, r0};
            while (true) {
                if (i >= 2) {
                }
                i++;
            }
            if (path == null) {
            }
        }
        if (!jsonPrimitive2.isNumber()) {
            throw new JsonParseException("Can't convert jsonPrimitive to Long");
        }
        r0 = new ResourceEvent.Path.Long(jsonPrimitive2.getAsLong());
        i = 0;
        ResourceEvent.Path[] pathArr222 = {string2, r0};
        while (true) {
            if (i >= 2) {
                break;
            }
            ResourceEvent.Path path2 = pathArr222[i];
            if (path2 != null) {
                path = path2;
                break;
            }
            i++;
        }
        if (path == null) {
            return path;
        }
        throw new JsonParseException("Unable to parse json into one of type \nPath\n".concat(CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, ResourceEvent$Path$Companion$fromJsonElement$message$1.INSTANCE, 30)));
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewTaxesHub.deepLinkSpecs;
    }
}
