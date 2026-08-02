package com.plaid.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* renamed from: com.plaid.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0282s4 {
    public final String a;

    /* renamed from: com.plaid.internal.s4$a */
    public static final class a {
        public static AbstractC0282s4 a(String str) {
            Long l;
            JsonElement jsonElement;
            str.getClass();
            Json.Default r0 = Json.Default;
            r0.getClass();
            JsonObject jsonObject = JsonElementKt.getJsonObject((JsonElement) r0.decodeFromString(str, JsonElementSerializer.INSTANCE));
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("url");
            Integer num = null;
            String content = jsonElement2 != null ? JsonElementKt.getJsonPrimitive(jsonElement2).getContent() : null;
            content.getClass();
            JsonElement jsonElement3 = (JsonElement) jsonObject.get("mobile_sdk_url_open_message");
            JsonObject jsonObject2 = jsonElement3 != null ? JsonElementKt.getJsonObject(jsonElement3) : null;
            String content2 = (jsonObject2 == null || (jsonElement = (JsonElement) jsonObject2.get("android_url_open_behavior")) == null) ? null : JsonElementKt.getJsonPrimitive(jsonElement).getContent();
            if (content2 != null) {
                int hashCode = content2.hashCode();
                int i = 0;
                if (hashCode != -1436496974) {
                    if (hashCode != -844381507) {
                        if (hashCode != 1225038860) {
                            if (hashCode == 1926770975 && content2.equals("ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB")) {
                                return new c(content);
                            }
                        } else if (content2.equals("ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER")) {
                            return new b(content);
                        }
                    } else if (content2.equals("ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB")) {
                        JsonElement jsonElement4 = (JsonElement) jsonObject2.get("android_partial_custom_tab_screen_height_pixels");
                        if (jsonElement4 != null) {
                            try {
                                l = Long.valueOf(JsonElementKt.parseLongImpl(JsonElementKt.getJsonPrimitive(jsonElement4)));
                            } catch (JsonDecodingException unused) {
                                l = null;
                            }
                            if (l != null) {
                                long longValue = l.longValue();
                                if (-2147483648L <= longValue && longValue <= 2147483647L) {
                                    num = Integer.valueOf((int) longValue);
                                }
                            }
                            if (num != null) {
                                i = num.intValue();
                            }
                        }
                        return new d(content, i);
                    }
                } else if (content2.equals("ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN")) {
                    return new d(content, 0);
                }
            }
            throw new Exception(Recorder$$ExternalSyntheticOutline2.m("android_url_open_behavior not supported :", content2));
        }
    }

    /* renamed from: com.plaid.internal.s4$b */
    public static final class b extends AbstractC0282s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str);
            str.getClass();
        }
    }

    /* renamed from: com.plaid.internal.s4$c */
    public static final class c extends AbstractC0282s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(str);
            str.getClass();
        }
    }

    /* renamed from: com.plaid.internal.s4$d */
    public static final class d extends AbstractC0282s4 {
        public final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i) {
            super(str);
            str.getClass();
            this.b = i;
        }
    }

    public AbstractC0282s4(String str) {
        this.a = str;
    }
}
