package io.appmetrica.analytics.impl;

import defpackage.u75;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class F {
    public final AdRevenue a;
    public final boolean b;
    public final InterfaceC0677u c;
    public final C0156bq d;
    public final Yp e;

    public F(AdRevenue adRevenue, boolean z, C0386jq c0386jq, PublicLogger publicLogger) {
        this.a = adRevenue;
        this.b = z;
        this.c = c0386jq;
        this.d = new C0156bq(100, "ad revenue strings", publicLogger);
        this.e = new Yp(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        C0648t c0648t = new C0648t();
        int i = 0;
        for (Pair pair : u75.h(new Pair(this.a.adNetwork, new C0792y(c0648t)), new Pair(this.a.adPlacementId, new C0820z(c0648t)), new Pair(this.a.adPlacementName, new A(c0648t)), new Pair(this.a.adUnitId, new B(c0648t)), new Pair(this.a.adUnitName, new C(c0648t)), new Pair(this.a.precision, new D(c0648t)), new Pair(this.a.currency.getCurrencyCode(), new E(c0648t)))) {
            String str = (String) pair.a;
            Function1 function1 = (Function1) pair.b;
            C0156bq c0156bq = this.d;
            c0156bq.getClass();
            String a = c0156bq.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a);
            function1.invoke(stringToBytesForProtobuf2);
            i += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) G.a.get(this.a.adType);
        c0648t.d = num != null ? num.intValue() : 0;
        C0619s c0619s = new C0619s();
        BigDecimal bigDecimal = this.a.adRevenue;
        BigInteger bigInteger = AbstractC0571q8.a;
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0571q8.a) <= 0 && unscaledValue.compareTo(AbstractC0571q8.b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i2++;
        }
        Long valueOf = Long.valueOf(unscaledValue.longValue());
        Integer valueOf2 = Integer.valueOf(i2);
        long longValue = valueOf.longValue();
        int intValue = valueOf2.intValue();
        c0619s.a = longValue;
        c0619s.b = intValue;
        c0648t.b = c0619s;
        Map<String, String> map = this.a.payload;
        String c = Fc.c(this.c.a(map != null ? new LinkedHashMap(map) : new LinkedHashMap()));
        Yp yp = this.e;
        yp.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(yp.a(c));
        c0648t.k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(c).length - stringToBytesForProtobuf3.length) + i;
        if (this.b) {
            c0648t.a = "autocollected".getBytes(Charsets.UTF_8);
        }
        return new Pair(MessageNano.toByteArray(c0648t), Integer.valueOf(length));
    }
}
