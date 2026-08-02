package com.yandex.music.shared.splash.screen.cache.serialization;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.b6e;
import defpackage.cxb;
import defpackage.uve;
import defpackage.vve;
import defpackage.wve;
import defpackage.xve;
import defpackage.yve;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/music/shared/splash/screen/cache/serialization/InternalSplashScreenJsonAdapter;", "Lcom/google/gson/JsonSerializer;", "Lyve;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "shared-splash-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class InternalSplashScreenJsonAdapter implements JsonSerializer<yve>, JsonDeserializer<yve> {
    @Override // com.google.gson.JsonDeserializer
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject G;
        JsonElement v;
        String I;
        JsonElement v2;
        String I2;
        JsonElement v3;
        Long H;
        Boolean E;
        JsonObject G2;
        JsonElement v4;
        String I3;
        xve xveVar;
        xve xveVar2;
        JsonElement v5;
        Long H2;
        if (jsonElement == null || (G = cxb.G(jsonElement)) == null || (v = G.v("screenId")) == null || (I = cxb.I(v)) == null || (v2 = G.v("data")) == null || (I2 = cxb.I(v2)) == null || (v3 = G.v("duration")) == null || (H = cxb.H(v3)) == null) {
            return null;
        }
        long longValue = H.longValue();
        JsonElement v6 = G.v("isVibrationEnabled");
        if (v6 == null || (E = cxb.E(v6)) == null) {
            return null;
        }
        boolean booleanValue = E.booleanValue();
        JsonElement v7 = G.v("rule");
        if (v7 == null || (G2 = cxb.G(v7)) == null || (v4 = G2.v("type")) == null || (I3 = cxb.I(v4)) == null) {
            return null;
        }
        int hashCode = I3.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode == -1313911455) {
                if (!I3.equals("timeout") || (v5 = G2.v("timeout")) == null || (H2 = cxb.H(v5)) == null) {
                    return null;
                }
                xveVar2 = new wve(H2.longValue());
                return new yve(I, I2, xveVar2, longValue, booleanValue);
            }
            if (hashCode != 95346201 || !I3.equals("daily")) {
                return null;
            }
            xveVar = vve.a;
        } else {
            if (!I3.equals("always")) {
                return null;
            }
            xveVar = uve.a;
        }
        xveVar2 = xveVar;
        return new yve(I, I2, xveVar2, longValue, booleanValue);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        yve yveVar = (yve) obj;
        if (yveVar == null) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.u("screenId", yveVar.a);
        jsonObject.u("data", yveVar.b);
        jsonObject.s(Long.valueOf(yveVar.d), "duration");
        jsonObject.t("isVibrationEnabled", Boolean.valueOf(yveVar.e));
        JsonObject jsonObject2 = new JsonObject();
        xve xveVar = yveVar.c;
        if (Intrinsics.d(xveVar, uve.a)) {
            jsonObject2.u("type", "always");
        } else if (Intrinsics.d(xveVar, vve.a)) {
            jsonObject2.u("type", "daily");
        } else {
            if (!(xveVar instanceof wve)) {
                b6e.s();
                return null;
            }
            jsonObject2.u("type", "timeout");
            jsonObject2.s(Long.valueOf(((wve) xveVar).a), "timeout");
        }
        jsonObject.r("rule", jsonObject2);
        return jsonObject;
    }
}
