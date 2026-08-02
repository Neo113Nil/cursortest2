package com.yandex.plus.pay.internal.model;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.w;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.core.data.common.z;
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
import defpackage.xhp;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails.PaymentMethod.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails$PaymentMethod;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayCompositeOfferDetails$PaymentMethod$$serializer implements p3d {

    @NotNull
    public static final PlusPayCompositeOfferDetails$PaymentMethod$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayCompositeOfferDetails$PaymentMethod$$serializer plusPayCompositeOfferDetails$PaymentMethod$$serializer = new PlusPayCompositeOfferDetails$PaymentMethod$$serializer();
        INSTANCE = plusPayCompositeOfferDetails$PaymentMethod$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails.PaymentMethod", plusPayCompositeOfferDetails$PaymentMethod$$serializer, 10);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("type", false);
        j5mVar.k("bankName", false);
        j5mVar.k("title", false);
        j5mVar.k("icon", false);
        j5mVar.k("textColor", false);
        j5mVar.k("backgroundColor", false);
        j5mVar.k("buttonAsset", false);
        j5mVar.k("widgetUrls", true);
        j5mVar.k("timeoutParams", true);
        descriptor = j5mVar;
    }

    private PlusPayCompositeOfferDetails$PaymentMethod$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayCompositeOfferDetails.PaymentMethod.$childSerializers;
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, arfVarArr[1].getValue(), ff7.C(tkrVar), tkrVar, w.a, arfVarArr[5].getValue(), arfVarArr[6].getValue(), ff7.C(PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE), ff7.C(z.a), ff7.C(PlusPayWebPaymentWidgetTimeoutParams$$serializer.INSTANCE)};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayCompositeOfferDetails.PaymentMethod deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        v vVar;
        PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset;
        v vVar2;
        PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams;
        b0 b0Var;
        y yVar;
        String str;
        String str2;
        PlusPayCompositeOfferDetails.PaymentMethod.Type type;
        String str3;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayCompositeOfferDetails.PaymentMethod.$childSerializers;
        int i2 = 9;
        char c2 = 7;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            PlusPayCompositeOfferDetails.PaymentMethod.Type type2 = (PlusPayCompositeOfferDetails.PaymentMethod.Type) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String str5 = (String) c.n(mhpVar, 2, tkr.a, null);
            String g2 = c.g(mhpVar, 3);
            y yVar2 = (y) c.z(mhpVar, 4, w.a, null);
            v vVar3 = (v) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            v vVar4 = (v) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset2 = (PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset) c.n(mhpVar, 7, PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE, null);
            b0 b0Var2 = (b0) c.n(mhpVar, 8, z.a, null);
            vVar = vVar4;
            str2 = g;
            plusPayWebPaymentWidgetTimeoutParams = (PlusPayWebPaymentWidgetTimeoutParams) c.n(mhpVar, 9, PlusPayWebPaymentWidgetTimeoutParams$$serializer.INSTANCE, null);
            buttonAsset = buttonAsset2;
            str3 = g2;
            b0Var = b0Var2;
            yVar = yVar2;
            str = str5;
            i = 1023;
            vVar2 = vVar3;
            type = type2;
        } else {
            int i3 = 6;
            int i4 = 5;
            boolean z = true;
            int i5 = 0;
            v vVar5 = null;
            PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset3 = null;
            v vVar6 = null;
            PlusPayWebPaymentWidgetTimeoutParams plusPayWebPaymentWidgetTimeoutParams2 = null;
            b0 b0Var3 = null;
            y yVar3 = null;
            String str6 = null;
            PlusPayCompositeOfferDetails.PaymentMethod.Type type3 = null;
            String str7 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i4 = 5;
                        i3 = 6;
                    case 0:
                        str4 = c.g(mhpVar, 0);
                        i5 |= 1;
                        i2 = 9;
                        c2 = 7;
                        i4 = 5;
                        i3 = 6;
                    case 1:
                        type3 = (PlusPayCompositeOfferDetails.PaymentMethod.Type) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), type3);
                        i5 |= 2;
                        i2 = 9;
                        c2 = 7;
                        i4 = 5;
                        i3 = 6;
                    case 2:
                        str6 = (String) c.n(mhpVar, 2, tkr.a, str6);
                        i5 |= 4;
                        i2 = 9;
                        c2 = 7;
                        i4 = 5;
                        i3 = 6;
                    case 3:
                        str7 = c.g(mhpVar, 3);
                        i5 |= 8;
                        i2 = 9;
                        c2 = 7;
                        i4 = 5;
                        i3 = 6;
                    case 4:
                        yVar3 = (y) c.z(mhpVar, 4, w.a, yVar3);
                        i5 |= 16;
                        i2 = 9;
                        c2 = 7;
                        i4 = 5;
                        i3 = 6;
                    case 5:
                        vVar6 = (v) c.z(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), vVar6);
                        i5 |= 32;
                        i2 = 9;
                        c2 = 7;
                        i3 = 6;
                    case 6:
                        vVar5 = (v) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), vVar5);
                        i5 |= 64;
                        i2 = 9;
                        c2 = 7;
                    case 7:
                        buttonAsset3 = (PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset) c.n(mhpVar, 7, PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset$$serializer.INSTANCE, buttonAsset3);
                        i5 |= 128;
                        c2 = 7;
                        i2 = 9;
                    case 8:
                        b0Var3 = (b0) c.n(mhpVar, 8, z.a, b0Var3);
                        i5 |= 256;
                        c2 = 7;
                    case 9:
                        plusPayWebPaymentWidgetTimeoutParams2 = (PlusPayWebPaymentWidgetTimeoutParams) c.n(mhpVar, i2, PlusPayWebPaymentWidgetTimeoutParams$$serializer.INSTANCE, plusPayWebPaymentWidgetTimeoutParams2);
                        i5 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        c2 = 7;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            vVar = vVar5;
            buttonAsset = buttonAsset3;
            vVar2 = vVar6;
            plusPayWebPaymentWidgetTimeoutParams = plusPayWebPaymentWidgetTimeoutParams2;
            b0Var = b0Var3;
            yVar = yVar3;
            str = str6;
            str2 = str4;
            type = type3;
            str3 = str7;
        }
        c.b(mhpVar);
        return new PlusPayCompositeOfferDetails.PaymentMethod(i, str2, type, str, str3, yVar, vVar2, vVar, buttonAsset, b0Var, plusPayWebPaymentWidgetTimeoutParams, (xhp) null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayCompositeOfferDetails.PaymentMethod value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayCompositeOfferDetails.PaymentMethod.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
