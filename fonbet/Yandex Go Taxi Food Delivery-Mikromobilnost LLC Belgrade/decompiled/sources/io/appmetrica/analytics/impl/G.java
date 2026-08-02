package io.appmetrica.analytics.impl;

import defpackage.scc;
import defpackage.tls;
import defpackage.uza;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class G {
    public final AdRevenue a;
    public final boolean b;
    public final InterfaceC0780v c;
    public final C0749tq d;
    public final C0663qq e;

    public G(AdRevenue adRevenue, boolean z, Aq aq, PublicLogger publicLogger) {
        this.a = adRevenue;
        this.b = z;
        this.c = aq;
        this.d = new C0749tq(100, "ad revenue strings", publicLogger);
        this.e = new C0663qq(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        C0722t c0722t = new C0722t();
        int i = 0;
        for (Pair pair : scc.g(new Pair(this.a.adNetwork, new C0896z(c0722t)), new Pair(this.a.adPlacementId, new A(c0722t)), new Pair(this.a.adPlacementName, new B(c0722t)), new Pair(this.a.adUnitId, new C(c0722t)), new Pair(this.a.adUnitName, new D(c0722t)), new Pair(this.a.precision, new E(c0722t)), new Pair(this.a.currency.getCurrencyCode(), new F(c0722t)))) {
            String str = (String) pair.c();
            tls tlsVar = (tls) pair.f();
            C0749tq c0749tq = this.d;
            c0749tq.getClass();
            String a = c0749tq.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a);
            tlsVar.invoke(stringToBytesForProtobuf2);
            i += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) H.a.get(this.a.adType);
        c0722t.d = num != null ? num.intValue() : 0;
        C0693s c0693s = new C0693s();
        BigDecimal bigDecimal = this.a.adRevenue;
        BigInteger bigInteger = AbstractC0789v8.a;
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0789v8.a) <= 0 && unscaledValue.compareTo(AbstractC0789v8.b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i2++;
        }
        Pair pair2 = new Pair(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i2));
        long longValue = ((Number) pair2.c()).longValue();
        int intValue = ((Number) pair2.f()).intValue();
        c0693s.a = longValue;
        c0693s.b = intValue;
        c0722t.b = c0693s;
        Map<String, String> map = this.a.payload;
        String c = Vc.c(this.c.a(map != null ? new LinkedHashMap(map) : new LinkedHashMap()));
        C0663qq c0663qq = this.e;
        c0663qq.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(c0663qq.a(c));
        c0722t.k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(c).length - stringToBytesForProtobuf3.length) + i;
        if (this.b) {
            EnumC0751u[] enumC0751uArr = EnumC0751u.a;
            c0722t.a = "autocollected".getBytes(uza.a);
        }
        return new Pair(MessageNano.toByteArray(c0722t), Integer.valueOf(length));
    }
}
