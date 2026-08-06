package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o {
    public static byte[] a(ProductInfo productInfo) {
        String str;
        z zVar = new z();
        zVar.f3612a = productInfo.quantity;
        zVar.f3617f = productInfo.priceMicros;
        try {
            str = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
            str = "";
        }
        Charset charset = z1.a.f8620a;
        zVar.f3613b = str.getBytes(charset);
        zVar.f3614c = productInfo.sku.getBytes(charset);
        u uVar = new u();
        uVar.f3578a = productInfo.purchaseOriginalJson.getBytes(charset);
        uVar.f3579b = productInfo.signature.getBytes(charset);
        zVar.f3616e = uVar;
        zVar.f3618g = true;
        zVar.f3619h = 1;
        int i2 = n.f3565a[productInfo.type.ordinal()];
        zVar.f3620i = (i2 == 1 || i2 != 2) ? 1 : 2;
        y yVar = new y();
        yVar.f3601a = productInfo.purchaseToken.getBytes(charset);
        yVar.f3602b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zVar.f3621j = yVar;
        if (productInfo.type == ProductType.SUBS) {
            x xVar = new x();
            xVar.f3594a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                w wVar = new w();
                wVar.f3591a = period.number;
                int i3 = n.f3566b[period.timeUnit.ordinal()];
                wVar.f3592b = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 4 : 3 : 2 : 1;
                xVar.f3595b = wVar;
            }
            v vVar = new v();
            vVar.f3581a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                w wVar2 = new w();
                wVar2.f3591a = period2.number;
                int i4 = n.f3566b[period2.timeUnit.ordinal()];
                wVar2.f3592b = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? 0 : 4 : 3 : 2 : 1;
                vVar.f3582b = wVar2;
            }
            vVar.f3583c = productInfo.introductoryPriceCycles;
            xVar.f3596c = vVar;
            zVar.f3622k = xVar;
        }
        return MessageNano.toByteArray(zVar);
    }
}
