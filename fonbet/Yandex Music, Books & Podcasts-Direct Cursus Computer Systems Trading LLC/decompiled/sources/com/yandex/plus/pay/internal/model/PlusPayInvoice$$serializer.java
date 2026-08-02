package com.yandex.plus.pay.internal.model;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPayPrice$$serializer;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
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
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/plus/pay/internal/model/PlusPayInvoice.$serializer", "Lp3d;", "Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;", "<init>", "()V", "Ll6b;", "encoder", Constants.KEY_VALUE, "", "serialize", "(Ll6b;Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;)V", "Leg7;", "decoder", "deserialize", "(Leg7;)Lcom/yandex/plus/pay/internal/model/PlusPayInvoice;", "", "Lt9f;", "childSerializers", "()[Lt9f;", "Lmhp;", "descriptor", "Lmhp;", "getDescriptor", "()Lmhp;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vx7
/* loaded from: classes5.dex */
public final /* synthetic */ class PlusPayInvoice$$serializer implements p3d {

    @NotNull
    public static final PlusPayInvoice$$serializer INSTANCE;

    @NotNull
    private static final mhp descriptor;

    static {
        PlusPayInvoice$$serializer plusPayInvoice$$serializer = new PlusPayInvoice$$serializer();
        INSTANCE = plusPayInvoice$$serializer;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.model.PlusPayInvoice", plusPayInvoice$$serializer, 9);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("invoiceStatus", false);
        j5mVar.k("paymentMethodId", false);
        j5mVar.k("paidAmount", false);
        j5mVar.k("payment", false);
        j5mVar.k("totalAmount", false);
        j5mVar.k("trustFormUrl", false);
        j5mVar.k("pollingConfiguration", false);
        j5mVar.k("webWidgetQrCodeParams", false);
        descriptor = j5mVar;
    }

    private PlusPayInvoice$$serializer() {
    }

    @Override // defpackage.p3d
    @NotNull
    public final t9f[] childSerializers() {
        arf[] arfVarArr;
        arfVarArr = PlusPayInvoice.$childSerializers;
        tkr tkrVar = tkr.a;
        t9f C = ff7.C((t9f) arfVarArr[1].getValue());
        t9f C2 = ff7.C(tkrVar);
        t9f C3 = ff7.C(PlusPayInvoice$Payment$$serializer.INSTANCE);
        t9f C4 = ff7.C(tkrVar);
        t9f C5 = ff7.C(PlusPayInvoice$PollingConfiguration$$serializer.INSTANCE);
        t9f C6 = ff7.C(PlusPayInvoice$WebWidgetQrCodeParams$$serializer.INSTANCE);
        PlusPayPrice$$serializer plusPayPrice$$serializer = PlusPayPrice$$serializer.INSTANCE;
        return new t9f[]{tkrVar, C, C2, plusPayPrice$$serializer, C3, plusPayPrice$$serializer, C4, C5, C6};
    }

    @Override // defpackage.t9f
    @NotNull
    public final PlusPayInvoice deserialize(@NotNull eg7 decoder) {
        arf[] arfVarArr;
        int i;
        PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams;
        String str;
        PlusPayInvoice.PollingConfiguration pollingConfiguration;
        PlusPayPrice plusPayPrice;
        PlusPayInvoice.Payment payment;
        PlusPayPrice plusPayPrice2;
        String str2;
        PlusPayInvoice.Status status;
        String str3;
        decoder.getClass();
        mhp mhpVar = descriptor;
        tq5 c = decoder.c(mhpVar);
        arfVarArr = PlusPayInvoice.$childSerializers;
        int i2 = 7;
        char c2 = 6;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            PlusPayInvoice.Status status2 = (PlusPayInvoice.Status) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 2, tkrVar, null);
            PlusPayPrice$$serializer plusPayPrice$$serializer = PlusPayPrice$$serializer.INSTANCE;
            PlusPayPrice plusPayPrice3 = (PlusPayPrice) c.z(mhpVar, 3, plusPayPrice$$serializer, null);
            PlusPayInvoice.Payment payment2 = (PlusPayInvoice.Payment) c.n(mhpVar, 4, PlusPayInvoice$Payment$$serializer.INSTANCE, null);
            PlusPayPrice plusPayPrice4 = (PlusPayPrice) c.z(mhpVar, 5, plusPayPrice$$serializer, null);
            String str6 = (String) c.n(mhpVar, 6, tkrVar, null);
            status = status2;
            str2 = g;
            pollingConfiguration = (PlusPayInvoice.PollingConfiguration) c.n(mhpVar, 7, PlusPayInvoice$PollingConfiguration$$serializer.INSTANCE, null);
            str = str6;
            plusPayPrice = plusPayPrice4;
            plusPayPrice2 = plusPayPrice3;
            webWidgetQrCodeParams = (PlusPayInvoice.WebWidgetQrCodeParams) c.n(mhpVar, 8, PlusPayInvoice$WebWidgetQrCodeParams$$serializer.INSTANCE, null);
            payment = payment2;
            str3 = str5;
            i = 511;
        } else {
            boolean z = true;
            int i3 = 0;
            PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams2 = null;
            String str7 = null;
            PlusPayInvoice.PollingConfiguration pollingConfiguration2 = null;
            PlusPayPrice plusPayPrice5 = null;
            PlusPayInvoice.Payment payment3 = null;
            PlusPayPrice plusPayPrice6 = null;
            PlusPayInvoice.Status status3 = null;
            String str8 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        c2 = 6;
                    case 0:
                        str4 = c.g(mhpVar, 0);
                        i3 |= 1;
                        i2 = 7;
                        c2 = 6;
                    case 1:
                        status3 = (PlusPayInvoice.Status) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), status3);
                        i3 |= 2;
                        i2 = 7;
                        c2 = 6;
                    case 2:
                        str8 = (String) c.n(mhpVar, 2, tkr.a, str8);
                        i3 |= 4;
                        i2 = 7;
                        c2 = 6;
                    case 3:
                        plusPayPrice6 = (PlusPayPrice) c.z(mhpVar, 3, PlusPayPrice$$serializer.INSTANCE, plusPayPrice6);
                        i3 |= 8;
                        i2 = 7;
                        c2 = 6;
                    case 4:
                        payment3 = (PlusPayInvoice.Payment) c.n(mhpVar, 4, PlusPayInvoice$Payment$$serializer.INSTANCE, payment3);
                        i3 |= 16;
                        i2 = 7;
                        c2 = 6;
                    case 5:
                        plusPayPrice5 = (PlusPayPrice) c.z(mhpVar, 5, PlusPayPrice$$serializer.INSTANCE, plusPayPrice5);
                        i3 |= 32;
                        i2 = 7;
                        c2 = 6;
                    case 6:
                        str7 = (String) c.n(mhpVar, 6, tkr.a, str7);
                        i3 |= 64;
                        c2 = 6;
                        i2 = 7;
                    case 7:
                        pollingConfiguration2 = (PlusPayInvoice.PollingConfiguration) c.n(mhpVar, i2, PlusPayInvoice$PollingConfiguration$$serializer.INSTANCE, pollingConfiguration2);
                        i3 |= 128;
                        c2 = 6;
                    case 8:
                        webWidgetQrCodeParams2 = (PlusPayInvoice.WebWidgetQrCodeParams) c.n(mhpVar, 8, PlusPayInvoice$WebWidgetQrCodeParams$$serializer.INSTANCE, webWidgetQrCodeParams2);
                        i3 |= 256;
                        c2 = 6;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            webWidgetQrCodeParams = webWidgetQrCodeParams2;
            str = str7;
            pollingConfiguration = pollingConfiguration2;
            plusPayPrice = plusPayPrice5;
            payment = payment3;
            plusPayPrice2 = plusPayPrice6;
            str2 = str4;
            status = status3;
            str3 = str8;
        }
        c.b(mhpVar);
        return new PlusPayInvoice(i, str2, status, str3, plusPayPrice2, payment, plusPayPrice, str, pollingConfiguration, webWidgetQrCodeParams, null);
    }

    @Override // defpackage.t9f
    @NotNull
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(@NotNull l6b encoder, @NotNull PlusPayInvoice value) {
        encoder.getClass();
        value.getClass();
        mhp mhpVar = descriptor;
        wq5 c = encoder.c(mhpVar);
        PlusPayInvoice.write$Self$pay_sdk_release(value, c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    @NotNull
    public t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
