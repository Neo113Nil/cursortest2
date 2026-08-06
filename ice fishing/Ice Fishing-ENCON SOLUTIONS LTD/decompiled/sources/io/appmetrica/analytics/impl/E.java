package io.appmetrica.analytics.impl;

import h1.C0234d;
import i1.AbstractC0253j;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f4331a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4332b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0754t f4333c;

    /* renamed from: d, reason: collision with root package name */
    public final Xm f4334d;

    /* renamed from: e, reason: collision with root package name */
    public final Um f4335e;

    public E(AdRevenue adRevenue, boolean z2, C0416fn c0416fn, PublicLogger publicLogger) {
        this.f4331a = adRevenue;
        this.f4332b = z2;
        this.f4333c = c0416fn;
        this.f4334d = new Xm(100, "ad revenue strings", publicLogger);
        this.f4335e = new Um(30720, "ad revenue payload", publicLogger);
    }

    public final C0234d a() {
        C0728s c0728s = new C0728s();
        int i2 = 0;
        for (C0234d c0234d : AbstractC0253j.B(new C0234d(this.f4331a.adNetwork, new C0858x(c0728s)), new C0234d(this.f4331a.adPlacementId, new C0884y(c0728s)), new C0234d(this.f4331a.adPlacementName, new C0910z(c0728s)), new C0234d(this.f4331a.adUnitId, new A(c0728s)), new C0234d(this.f4331a.adUnitName, new B(c0728s)), new C0234d(this.f4331a.precision, new C(c0728s)), new C0234d(this.f4331a.currency.getCurrencyCode(), new D(c0728s)))) {
            String str = (String) c0234d.f3386a;
            t1.l lVar = (t1.l) c0234d.f3387b;
            Xm xm = this.f4334d;
            xm.getClass();
            String a2 = xm.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a2);
            lVar.invoke(stringToBytesForProtobuf2);
            i2 += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f4368a.get(this.f4331a.adType);
        c0728s.f6867d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f4331a.adRevenue;
        BigInteger bigInteger = AbstractC0866x7.f7192a;
        int i3 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0866x7.f7192a) <= 0 && unscaledValue.compareTo(AbstractC0866x7.f7193b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i3++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(i3);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        rVar.f6795a = longValue;
        rVar.f6796b = intValue;
        c0728s.f6865b = rVar;
        Map<String, String> map = this.f4331a.payload;
        String b2 = AbstractC0430gb.b(this.f4333c.a(map != null ? i1.u.N(map) : new LinkedHashMap()));
        Um um = this.f4335e;
        um.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(um.a(b2));
        c0728s.f6874k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b2).length - stringToBytesForProtobuf3.length) + i2;
        if (this.f4332b) {
            c0728s.f6864a = "autocollected".getBytes(z1.a.f8620a);
        }
        return new C0234d(MessageNano.toByteArray(c0728s), Integer.valueOf(length));
    }
}
