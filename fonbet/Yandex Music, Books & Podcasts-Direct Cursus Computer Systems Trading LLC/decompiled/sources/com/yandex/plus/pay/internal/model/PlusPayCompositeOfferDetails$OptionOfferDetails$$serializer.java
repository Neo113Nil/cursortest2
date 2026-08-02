package com.yandex.plus.pay.internal.model;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
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
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails.OptionOfferDetails.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$OptionOfferDetails;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer plusPayCompositeOfferDetails$OptionOfferDetails$$serializer = new PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer();
        INSTANCE = plusPayCompositeOfferDetails$OptionOfferDetails$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails.OptionOfferDetails", plusPayCompositeOfferDetails$OptionOfferDetails$$serializer, 9);
        j5mVar.k("title", false);
        j5mVar.k("text", false);
        j5mVar.k(DeviceService.KEY_DESC, false);
        j5mVar.k("additionText", false);
        j5mVar.k("payload", false);
        j5mVar.k("images", false);
        j5mVar.k("offerName", false);
        j5mVar.k("optionName", false);
        j5mVar.k("backgroundTv", false);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOfferDetails$OptionOfferDetails$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCompositeOfferDetails.OptionOfferDetails.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C((t9f) arfVarArr[4].getValue()), arfVarArr[5].getValue(), tkrVar, tkrVar, ff7.C((t9f) arfVarArr[8].getValue())};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOfferDetails.OptionOfferDetails deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        k kVar;
        Map map;
        Map map2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayCompositeOfferDetails.OptionOfferDetails.$childSerializers;
        int i3 = 7;
        int i4 = 4;
        String str7 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            tkr tkrVar = tkr.a;
            String str8 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str9 = (String) c.n(mhpVar, 2, tkrVar, null);
            String str10 = (String) c.n(mhpVar, 3, tkrVar, null);
            Map map3 = (Map) c.n(mhpVar, 4, (t9f) arfVarArr[4].getValue(), null);
            Map map4 = (Map) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            String g2 = c.g(mhpVar, 6);
            String g3 = c.g(mhpVar, 7);
            kVar = (k) c.n(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            str2 = g;
            str6 = g3;
            str5 = g2;
            str = str10;
            str4 = str9;
            map = map4;
            i = 511;
            map2 = map3;
            str3 = str8;
        } else {
            boolean z = true;
            int i5 = 0;
            k kVar2 = null;
            Map map5 = null;
            Map map6 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i4 = 4;
                    case 0:
                        str7 = c.g(mhpVar, 0);
                        i5 |= 1;
                        i3 = 7;
                        i4 = 4;
                    case 1:
                        str12 = (String) c.n(mhpVar, 1, tkr.a, str12);
                        i5 |= 2;
                        i3 = 7;
                        i4 = 4;
                    case 2:
                        str13 = (String) c.n(mhpVar, 2, tkr.a, str13);
                        i5 |= 4;
                        i3 = 7;
                        i4 = 4;
                    case 3:
                        str11 = (String) c.n(mhpVar, 3, tkr.a, str11);
                        i5 |= 8;
                        i3 = 7;
                        i4 = 4;
                    case 4:
                        int i6 = i4;
                        map6 = (Map) c.n(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), map6);
                        i5 |= 16;
                        i4 = i6;
                        i3 = 7;
                    case 5:
                        i2 = i4;
                        map5 = (Map) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), map5);
                        i5 |= 32;
                        i4 = i2;
                    case 6:
                        str14 = c.g(mhpVar, 6);
                        i5 |= 64;
                    case 7:
                        str15 = c.g(mhpVar, i3);
                        i5 |= 128;
                    case 8:
                        i2 = i4;
                        kVar2 = (k) c.n(mhpVar, 8, (t9f) arfVarArr[8].getValue(), kVar2);
                        i5 |= 256;
                        i4 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            kVar = kVar2;
            map = map5;
            map2 = map6;
            str = str11;
            str2 = str7;
            str3 = str12;
            str4 = str13;
            str5 = str14;
            str6 = str15;
        }
        c.b(mhpVar);
        return new PlusPayCompositeOfferDetails.OptionOfferDetails(i, str2, str3, str4, str, map2, map, str5, str6, kVar, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOfferDetails.OptionOfferDetails value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOfferDetails.OptionOfferDetails.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
