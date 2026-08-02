package com.yandex.music.shared.network.retrofit;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import defpackage.gfb;
import defpackage.hfb;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/music/shared/network/retrofit/NewBackendFormatErrorDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/shared/network/retrofit/NewBackendFormatError;", "shared-network"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class NewBackendFormatErrorDeserializer implements JsonDeserializer<NewBackendFormatError> {
    public final hfb a;

    public NewBackendFormatErrorDeserializer(hfb hfbVar) {
        this.a = hfbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String str;
        JsonElement v;
        String str2;
        JsonElement v2;
        String str3;
        JsonElement v3;
        Class cls;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonObject m = jsonElement.m();
        JsonElement v4 = m.v("name");
        gfb gfbVar = null;
        if (v4 != null) {
            if (v4 instanceof JsonNull) {
                v4 = null;
            }
            if (v4 != null) {
                str = v4.q();
                v = m.v(Constants.KEY_MESSAGE);
                if (v != null) {
                    if (v instanceof JsonNull) {
                        v = null;
                    }
                    if (v != null) {
                        str2 = v.q();
                        v2 = m.v("requestId");
                        if (v2 != null) {
                            if (v2 instanceof JsonNull) {
                                v2 = null;
                            }
                            if (v2 != null) {
                                str3 = v2.q();
                                v3 = m.v("details");
                                if (v3 != null || (v3 instanceof JsonNull)) {
                                    v3 = null;
                                }
                                cls = str == null ? (Class) this.a.a.get(str) : null;
                                if (v3 != null && cls != null) {
                                    gfbVar = (gfb) jsonDeserializationContext.a(v3, cls);
                                }
                                return new NewBackendFormatError(str, str2, str3, gfbVar);
                            }
                        }
                        str3 = null;
                        v3 = m.v("details");
                        if (v3 != null) {
                        }
                        v3 = null;
                        if (str == null) {
                        }
                        if (v3 != null) {
                            gfbVar = (gfb) jsonDeserializationContext.a(v3, cls);
                        }
                        return new NewBackendFormatError(str, str2, str3, gfbVar);
                    }
                }
                str2 = null;
                v2 = m.v("requestId");
                if (v2 != null) {
                }
                str3 = null;
                v3 = m.v("details");
                if (v3 != null) {
                }
                v3 = null;
                if (str == null) {
                }
                if (v3 != null) {
                }
                return new NewBackendFormatError(str, str2, str3, gfbVar);
            }
        }
        str = null;
        v = m.v(Constants.KEY_MESSAGE);
        if (v != null) {
        }
        str2 = null;
        v2 = m.v("requestId");
        if (v2 != null) {
        }
        str3 = null;
        v3 = m.v("details");
        if (v3 != null) {
        }
        v3 = null;
        if (str == null) {
        }
        if (v3 != null) {
        }
        return new NewBackendFormatError(str, str2, str3, gfbVar);
    }
}
