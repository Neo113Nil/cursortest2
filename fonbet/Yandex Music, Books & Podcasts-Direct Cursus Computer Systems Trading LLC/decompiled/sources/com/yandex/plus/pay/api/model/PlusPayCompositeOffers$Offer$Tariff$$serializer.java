package com.yandex.plus.pay.api.model;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.vx7;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/api/model/PlusPayCompositeOffers.Offer.Tariff.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/api/model/PlusPayCompositeOffers$Offer$Tariff;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOffers$Offer$Tariff$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOffers$Offer$Tariff$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOffers$Offer$Tariff$$serializer plusPayCompositeOffers$Offer$Tariff$$serializer = new PlusPayCompositeOffers$Offer$Tariff$$serializer();
        INSTANCE = plusPayCompositeOffers$Offer$Tariff$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.api.model.PlusPayCompositeOffers.Offer.Tariff", plusPayCompositeOffers$Offer$Tariff$$serializer, 11);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("name", false);
        j5mVar.k("title", false);
        j5mVar.k(DeviceService.KEY_DESC, false);
        j5mVar.k("text", false);
        j5mVar.k("additionalText", false);
        j5mVar.k("commonPrice", false);
        j5mVar.k("commonPeriod", false);
        j5mVar.k("plans", false);
        j5mVar.k("vendor", false);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOffers$Offer$Tariff$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCompositeOffers.Offer.Tariff.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), PlusPayPrice$$serializer.INSTANCE, tkrVar, arfVarArr[8].getValue(), arfVarArr[9].getValue(), ff7.C((t9f) arfVarArr[10].getValue())};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOffers.Offer.Tariff deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        Map map;
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusPayPrice plusPayPrice;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayCompositeOffers.Offer.Tariff.$childSerializers;
        int i2 = 7;
        int i3 = 10;
        String str8 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            tkr tkrVar = tkr.a;
            String str9 = (String) c.n(mhpVar, 3, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 4, tkrVar, null);
            String str11 = (String) c.n(mhpVar, 5, tkrVar, null);
            PlusPayPrice plusPayPrice2 = (PlusPayPrice) c.z(mhpVar, 6, PlusPayPrice$$serializer.INSTANCE, null);
            String g4 = c.g(mhpVar, 7);
            List list2 = (List) c.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            PlusPayCompositeOffers.Offer.Vendor vendor2 = (PlusPayCompositeOffers.Offer.Vendor) c.z(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            map = (Map) c.n(mhpVar, 10, (t9f) arfVarArr[10].getValue(), null);
            str4 = g;
            str7 = g4;
            plusPayPrice = plusPayPrice2;
            str = str11;
            str3 = str9;
            str2 = str10;
            str6 = g3;
            i = 2047;
            vendor = vendor2;
            list = list2;
            str5 = g2;
        } else {
            boolean z = true;
            int i4 = 0;
            Map map2 = null;
            PlusPayCompositeOffers.Offer.Vendor vendor3 = null;
            PlusPayPrice plusPayPrice3 = null;
            List list3 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        i4 |= 1;
                        str8 = c.g(mhpVar, 0);
                        i2 = 7;
                        i3 = 10;
                    case 1:
                        str15 = c.g(mhpVar, 1);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 10;
                    case 2:
                        str16 = c.g(mhpVar, 2);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 10;
                    case 3:
                        str14 = (String) c.n(mhpVar, 3, tkr.a, str14);
                        i4 |= 8;
                        i2 = 7;
                        i3 = 10;
                    case 4:
                        str13 = (String) c.n(mhpVar, 4, tkr.a, str13);
                        i4 |= 16;
                        i2 = 7;
                        i3 = 10;
                    case 5:
                        str12 = (String) c.n(mhpVar, 5, tkr.a, str12);
                        i4 |= 32;
                        i2 = 7;
                        i3 = 10;
                    case 6:
                        plusPayPrice3 = (PlusPayPrice) c.z(mhpVar, 6, PlusPayPrice$$serializer.INSTANCE, plusPayPrice3);
                        i4 |= 64;
                        i2 = 7;
                        i3 = 10;
                    case 7:
                        str17 = c.g(mhpVar, i2);
                        i4 |= 128;
                    case 8:
                        list3 = (List) c.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), list3);
                        i4 |= 256;
                        i2 = 7;
                    case 9:
                        vendor3 = (PlusPayCompositeOffers.Offer.Vendor) c.z(mhpVar, 9, (t9f) arfVarArr[9].getValue(), vendor3);
                        i4 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i2 = 7;
                    case 10:
                        map2 = (Map) c.n(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), map2);
                        i4 |= 1024;
                        i2 = 7;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i4;
            map = map2;
            vendor = vendor3;
            plusPayPrice = plusPayPrice3;
            list = list3;
            str = str12;
            str2 = str13;
            str3 = str14;
            str4 = str8;
            str5 = str15;
            str6 = str16;
            str7 = str17;
        }
        c.b(mhpVar);
        return new PlusPayCompositeOffers.Offer.Tariff(i, str4, str5, str6, str3, str2, str, plusPayPrice, str7, list, vendor, map, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOffers.Offer.Tariff value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOffers.Offer.Tariff.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
