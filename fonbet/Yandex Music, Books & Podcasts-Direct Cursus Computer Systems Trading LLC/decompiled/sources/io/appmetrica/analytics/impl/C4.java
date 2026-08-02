package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class C4 extends H6 {
    public HashMap q;
    public C0156bq r;
    public Yp s;
    public Yp t;
    public O3 u;
    public C0156bq v;

    public C4(String str, String str2, int i, int i2, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        this.b = e(str);
        this.a = d(str2);
        setType(i);
        setCustomType(i2);
    }

    public static C4 a(PublicLogger publicLogger, C0757wl c0757wl) {
        int i;
        C4 c4 = new C4(publicLogger);
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        c4.d = 40976;
        C0699ul c0699ul = new C0699ul();
        c0699ul.b = c0757wl.a.currency.getCurrencyCode().getBytes();
        c0699ul.f = c0757wl.a.priceMicros;
        c0699ul.c = StringUtils.stringToBytesForProtobuf(new C0156bq(200, "revenue productID", c0757wl.e).a(c0757wl.a.productID));
        c0699ul.a = ((Integer) WrapUtils.getOrDefault(c0757wl.a.quantity, 1)).intValue();
        Yp yp = c0757wl.b;
        String str = c0757wl.a.payload;
        yp.getClass();
        c0699ul.d = StringUtils.stringToBytesForProtobuf(yp.a(str));
        if (AbstractC0734vr.a(c0757wl.a.receipt)) {
            C0555pl c0555pl = new C0555pl();
            String str2 = (String) c0757wl.c.a(c0757wl.a.receipt.data);
            i = !StringUtils.equalsNullSafety(c0757wl.a.receipt.data, str2) ? c0757wl.a.receipt.data.length() : 0;
            String str3 = (String) c0757wl.d.a(c0757wl.a.receipt.signature);
            c0555pl.a = StringUtils.stringToBytesForProtobuf(str2);
            c0555pl.b = StringUtils.stringToBytesForProtobuf(str3);
            c0699ul.e = c0555pl;
        } else {
            i = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(c0699ul), Integer.valueOf(i));
        c4.b = c4.e(new String(Base64.encode((byte[]) pair.first, 0)));
        c4.g = ((Integer) pair.second).intValue();
        return c4;
    }

    public static H6 b(String str, String str2) {
        H6 h6 = new H6("", 0);
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        h6.d = 5376;
        h6.a(str, str2);
        return h6;
    }

    public static H6 n() {
        H6 h6 = new H6("", 0);
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        h6.d = 5632;
        return h6;
    }

    public static H6 o() {
        H6 h6 = new H6("", 0);
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        h6.d = 40961;
        return h6;
    }

    @Override // io.appmetrica.analytics.impl.H6
    @NonNull
    public final void c(String str) {
        C0156bq c0156bq = this.v;
        c0156bq.getClass();
        this.h = c0156bq.a(str);
    }

    public final String d(String str) {
        C0156bq c0156bq = this.r;
        c0156bq.getClass();
        String a = c0156bq.a(str);
        a(str, a, B4.NAME);
        return a;
    }

    public final String e(String str) {
        Yp yp = this.s;
        yp.getClass();
        String a = yp.a(str);
        a(str, a, B4.VALUE);
        return a;
    }

    public final C4 f(@NonNull String str) {
        Yp yp = this.t;
        yp.getClass();
        String a = yp.a(str);
        a(str, a, B4.VALUE);
        this.b = a;
        return this;
    }

    @NonNull
    public final HashMap<B4, Integer> p() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.H6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.H6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.H6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public C4(String str, int i, @NonNull PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public C4(String str, String str2, int i, @NonNull PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public C4(@NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
    }

    public C4(byte[] bArr, String str, int i, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.a = d(str);
        setType(i);
    }

    public final C4 a(@NonNull HashMap<B4, Integer> hashMap) {
        this.q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.r = new C0156bq(1000, "event name", publicLogger);
        this.s = new Yp(245760, "event value", publicLogger);
        this.t = new Yp(1024000, "event extended value", publicLogger);
        this.u = new O3(245760, "event value bytes", publicLogger);
        this.v = new C0156bq(200, "user profile id", publicLogger);
    }

    public final void a(byte[] bArr) {
        O3 o3 = this.u;
        o3.getClass();
        byte[] a = o3.a(bArr);
        B4 b4 = B4.VALUE;
        int length = bArr.length;
        int length2 = a.length;
        HashMap hashMap = this.q;
        if (length != length2) {
            hashMap.put(b4, Integer.valueOf(bArr.length - a.length));
        } else {
            hashMap.remove(b4);
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
        super.setValueBytes(a);
    }

    public static H6 a(@NonNull C0647sr c0647sr) {
        H6 o = o();
        o.setValue(new String(Base64.encode(MessageNano.toByteArray(c0647sr), 0)));
        return o;
    }

    public final void a(String str, String str2, B4 b4) {
        boolean equalsNullSafety = StringUtils.equalsNullSafety(str, str2);
        HashMap hashMap = this.q;
        if (!equalsNullSafety) {
            hashMap.put(b4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        } else {
            hashMap.remove(b4);
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
    }

    public static C4 a(PublicLogger publicLogger, F f) {
        C4 c4 = new C4(publicLogger);
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        c4.d = 40977;
        kotlin.Pair a = f.a();
        c4.b = c4.e(new String(Base64.encode((byte[]) a.a, 0)));
        c4.g = ((Integer) a.b).intValue();
        return c4;
    }
}
