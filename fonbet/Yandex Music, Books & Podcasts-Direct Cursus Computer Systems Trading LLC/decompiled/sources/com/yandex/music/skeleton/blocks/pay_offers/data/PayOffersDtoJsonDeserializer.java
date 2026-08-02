package com.yandex.music.skeleton.blocks.pay_offers.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.yandex.music.skeleton.blocks.pay_offers.data.dto.PayOffersEntityDto;
import defpackage.uck;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/skeleton/blocks/pay_offers/data/PayOffersDtoJsonDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/yandex/music/skeleton/blocks/pay_offers/data/dto/PayOffersEntityDto;", "<init>", "()V", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class PayOffersDtoJsonDeserializer implements JsonDeserializer<PayOffersEntityDto> {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class cls;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonElement v = jsonElement.m().v("type");
        String q = v != null ? v.q() : null;
        if (q != null) {
            int hashCode = q.hashCode();
            if (hashCode != -1387419923) {
                if (hashCode != -819569498) {
                    if (hashCode == -612306658 && q.equals("offer_selected")) {
                        cls = PayOffersEntityDto.PayOfferSelectedDto.class;
                    }
                } else if (q.equals("offer_available")) {
                    cls = PayOffersEntityDto.PayOfferAvailableDto.class;
                }
            } else if (q.equals("offer_unavailable")) {
                cls = uck.class;
            }
            if (cls == null) {
                return (PayOffersEntityDto) jsonDeserializationContext.a(jsonElement, cls);
            }
            return null;
        }
        cls = null;
        if (cls == null) {
        }
    }
}
