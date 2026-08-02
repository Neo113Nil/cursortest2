package com.yandex.plus.pay.data.acquisition.dto;

import com.yandex.plus.pay.data.mb.dto.k1;
import defpackage.mvg;
import defpackage.qy0;
import defpackage.tkr;
import defpackage.up6;
import defpackage.wsd;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new qy0(j.a, 2);
            case 1:
                return new qy0(mvg.a, 2);
            case 2:
                return new qy0(tkr.a, 2);
            case 3:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            case 4:
                return new qy0(tkr.a, 2);
            case 5:
                return new qy0(y.a, 0);
            case 6:
                return up6.q("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferVendorTypeDto", x.values(), new String[]{"GOOGLE_PLAY", "NATIVE_YANDEX", null}, new Annotation[][]{null, null, null});
            case 7:
                return x.Companion.serializer();
            case 8:
                tkr tkrVar2 = tkr.a;
                return new wsd(tkrVar2, tkrVar2, 1);
            case 9:
                return new com.yandex.passport.common.url.c(1);
            case 10:
                return new qy0(j0.a, 0);
            case 11:
                return new qy0(tkr.a, 2);
            case 12:
                return new qy0(p0.a, 0);
            case 13:
                tkr tkrVar3 = tkr.a;
                return new wsd(tkrVar3, tkrVar3, 1);
            case 14:
                return x.Companion.serializer();
            case 15:
                tkr tkrVar4 = tkr.a;
                return new wsd(tkrVar4, tkrVar4, 1);
            case 16:
                return new qy0(com.yandex.plus.pay.data.mb.dto.b.a, 0);
            case 17:
                return new qy0(tkr.a, 0);
            case 18:
                return com.yandex.plus.pay.data.mb.dto.b1.Companion.serializer();
            case 19:
                return new qy0(com.yandex.plus.pay.data.mb.dto.d1.a, 0);
            case 20:
                return new qy0(com.yandex.plus.pay.data.mb.dto.c0.a, 0);
            case 21:
                return new qy0(com.yandex.plus.pay.data.mb.dto.o.a, 0);
            case 22:
                return new qy0(com.yandex.plus.pay.data.mb.dto.t.a, 0);
            case 23:
                return com.yandex.plus.pay.data.mb.dto.z.Companion.serializer();
            case 24:
                return up6.q("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.LegalInfo.Item.Type", com.yandex.plus.pay.data.mb.dto.z.values(), new String[]{"LINK", "TEXT"}, new Annotation[][]{null, null});
            case 25:
                return k1.Companion.serializer();
            case 26:
                tkr tkrVar5 = tkr.a;
                return new wsd(tkrVar5, tkrVar5, 1);
            case 27:
                return new qy0(com.yandex.plus.pay.data.mb.dto.w0.Companion.serializer(), 0);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new com.yandex.passport.common.url.c(1);
            default:
                return up6.q("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.StructureType", com.yandex.plus.pay.data.mb.dto.b1.values(), new String[]{"TARIFF", "OPTION", "COMPOSITE"}, new Annotation[][]{null, null, null});
        }
    }
}
