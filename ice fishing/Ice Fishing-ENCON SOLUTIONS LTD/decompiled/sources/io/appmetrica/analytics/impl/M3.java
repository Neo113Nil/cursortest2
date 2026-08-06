package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import h1.C0234d;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M3 extends P5 {

    /* renamed from: q, reason: collision with root package name */
    public HashMap f4729q;

    /* renamed from: r, reason: collision with root package name */
    public Xm f4730r;

    /* renamed from: s, reason: collision with root package name */
    public Um f4731s;
    public Um t;

    /* renamed from: u, reason: collision with root package name */
    public Z2 f4732u;

    /* renamed from: v, reason: collision with root package name */
    public Xm f4733v;

    public M3(PublicLogger publicLogger) {
        this.f4729q = new HashMap();
        a(publicLogger);
    }

    public static P5 b(String str, String str2) {
        P5 p5 = new P5("", 0);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        p5.f4907d = 5376;
        p5.a(str, str2);
        return p5;
    }

    public static P5 n() {
        P5 p5 = new P5("", 0);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        p5.f4907d = 5632;
        return p5;
    }

    public static P5 o() {
        P5 p5 = new P5("", 0);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        p5.f4907d = 40961;
        return p5;
    }

    public final void a(String str, String str2, L3 l3) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f4729q.remove(l3);
        } else {
            this.f4729q.put(l3, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f4729q.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Integer) it.next()).intValue();
        }
        this.f4910g = i2;
    }

    @Override // io.appmetrica.analytics.impl.P5
    public final void c(String str) {
        Xm xm = this.f4733v;
        xm.getClass();
        this.f4911h = xm.a(str);
    }

    public final String d(String str) {
        Xm xm = this.f4730r;
        xm.getClass();
        String a2 = xm.a(str);
        a(str, a2, L3.NAME);
        return a2;
    }

    public final String e(String str) {
        Um um = this.f4731s;
        um.getClass();
        String a2 = um.a(str);
        a(str, a2, L3.VALUE);
        return a2;
    }

    public final M3 f(String str) {
        Um um = this.t;
        um.getClass();
        String a2 = um.a(str);
        a(str, a2, L3.VALUE);
        this.f4905b = a2;
        return this;
    }

    public final HashMap<L3, Integer> p() {
        return this.f4729q;
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f4904a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f4905b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.P5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public M3(String str, int i2, PublicLogger publicLogger) {
        this("", str, i2, publicLogger);
    }

    public M3(String str, String str2, int i2, PublicLogger publicLogger) {
        this(str, str2, i2, 0, publicLogger);
    }

    public M3(String str, String str2, int i2, int i3, PublicLogger publicLogger) {
        this.f4729q = new HashMap();
        a(publicLogger);
        this.f4905b = e(str);
        this.f4904a = d(str2);
        setType(i2);
        setCustomType(i3);
    }

    public final M3 a(HashMap<L3, Integer> hashMap) {
        this.f4729q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f4730r = new Xm(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "event name", publicLogger);
        this.f4731s = new Um(245760, "event value", publicLogger);
        this.t = new Um(1024000, "event extended value", publicLogger);
        this.f4732u = new Z2(245760, "event value bytes", publicLogger);
        this.f4733v = new Xm(200, "user profile id", publicLogger);
    }

    public M3(byte[] bArr, String str, int i2, PublicLogger publicLogger) {
        this.f4729q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f4904a = d(str);
        setType(i2);
    }

    public final void a(byte[] bArr) {
        Z2 z2 = this.f4732u;
        z2.getClass();
        byte[] a2 = z2.a(bArr);
        L3 l3 = L3.VALUE;
        if (bArr.length != a2.length) {
            this.f4729q.put(l3, Integer.valueOf(bArr.length - a2.length));
        } else {
            this.f4729q.remove(l3);
        }
        Iterator it = this.f4729q.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Integer) it.next()).intValue();
        }
        this.f4910g = i2;
        super.setValueBytes(a2);
    }

    public static P5 a(C0494io c0494io) {
        P5 o2 = o();
        o2.setValue(new String(Base64.encode(MessageNano.toByteArray(c0494io), 0)));
        return o2;
    }

    public static M3 a(PublicLogger publicLogger, Oi oi) {
        int i2;
        M3 m3 = new M3(publicLogger);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        m3.f4907d = 40976;
        Mi mi = new Mi();
        mi.f4774b = oi.f4868a.currency.getCurrencyCode().getBytes();
        mi.f4778f = oi.f4868a.priceMicros;
        mi.f4775c = StringUtils.stringToBytesForProtobuf(new Xm(200, "revenue productID", oi.f4872e).a(oi.f4868a.productID));
        mi.f4773a = ((Integer) WrapUtils.getOrDefault(oi.f4868a.quantity, 1)).intValue();
        Um um = oi.f4869b;
        String str = oi.f4868a.payload;
        um.getClass();
        mi.f4776d = StringUtils.stringToBytesForProtobuf(um.a(str));
        if (AbstractC0572lo.a(oi.f4868a.receipt)) {
            Hi hi = new Hi();
            String str2 = (String) oi.f4870c.a(oi.f4868a.receipt.data);
            i2 = !StringUtils.equalsNullSafety(oi.f4868a.receipt.data, str2) ? oi.f4868a.receipt.data.length() : 0;
            String str3 = (String) oi.f4871d.a(oi.f4868a.receipt.signature);
            hi.f4480a = StringUtils.stringToBytesForProtobuf(str2);
            hi.f4481b = StringUtils.stringToBytesForProtobuf(str3);
            mi.f4777e = hi;
        } else {
            i2 = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(mi), Integer.valueOf(i2));
        m3.f4905b = m3.e(new String(Base64.encode((byte[]) pair.first, 0)));
        m3.f4910g = ((Integer) pair.second).intValue();
        return m3;
    }

    public static M3 a(PublicLogger publicLogger, E e2) {
        M3 m3 = new M3(publicLogger);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        m3.f4907d = 40977;
        C0234d a2 = e2.a();
        m3.f4905b = m3.e(new String(Base64.encode((byte[]) a2.f3386a, 0)));
        m3.f4910g = ((Integer) a2.f3387b).intValue();
        return m3;
    }
}
