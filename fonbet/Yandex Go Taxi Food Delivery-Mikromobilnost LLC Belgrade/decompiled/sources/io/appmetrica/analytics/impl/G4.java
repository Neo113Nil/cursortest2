package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class G4 extends K6 {
    public HashMap q;
    public C0749tq r;
    public C0663qq s;
    public C0663qq t;
    public R3 u;
    public C0749tq v;

    public G4(String str, String str2, int i, int i2, PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        this.b = e(str);
        this.a = d(str2);
        setType(i);
        setCustomType(i2);
    }

    public static G4 a(PublicLogger publicLogger, Hl hl) {
        int i;
        G4 g4 = new G4(publicLogger);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        g4.d = 40976;
        Fl fl = new Fl();
        fl.b = hl.a.currency.getCurrencyCode().getBytes();
        fl.f = hl.a.priceMicros;
        fl.c = StringUtils.stringToBytesForProtobuf(new C0749tq(200, "revenue productID", hl.e).a(hl.a.productID));
        fl.a = ((Integer) WrapUtils.getOrDefault(hl.a.quantity, 1)).intValue();
        C0663qq c0663qq = hl.b;
        String str = hl.a.payload;
        c0663qq.getClass();
        fl.d = StringUtils.stringToBytesForProtobuf(c0663qq.a(str));
        if (Or.a(hl.a.receipt)) {
            Al al = new Al();
            String str2 = (String) hl.c.a(hl.a.receipt.data);
            i = !StringUtils.equalsNullSafety(hl.a.receipt.data, str2) ? hl.a.receipt.data.length() : 0;
            String str3 = (String) hl.d.a(hl.a.receipt.signature);
            al.a = StringUtils.stringToBytesForProtobuf(str2);
            al.b = StringUtils.stringToBytesForProtobuf(str3);
            fl.e = al;
        } else {
            i = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(fl), Integer.valueOf(i));
        g4.b = g4.e(new String(Base64.encode((byte[]) pair.first, 0)));
        g4.g = ((Integer) pair.second).intValue();
        return g4;
    }

    public static K6 b(String str, String str2) {
        K6 k6 = new K6("", 0);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        k6.d = 5376;
        k6.a(str, str2);
        return k6;
    }

    public static K6 n() {
        K6 k6 = new K6("", 0);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        k6.d = 5632;
        return k6;
    }

    public static K6 o() {
        K6 k6 = new K6("", 0);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        k6.d = 40961;
        return k6;
    }

    @Override // io.appmetrica.analytics.impl.K6
    public final void c(String str) {
        C0749tq c0749tq = this.v;
        c0749tq.getClass();
        this.h = c0749tq.a(str);
    }

    public final String d(String str) {
        C0749tq c0749tq = this.r;
        c0749tq.getClass();
        String a = c0749tq.a(str);
        a(str, a, F4.NAME);
        return a;
    }

    public final String e(String str) {
        C0663qq c0663qq = this.s;
        c0663qq.getClass();
        String a = c0663qq.a(str);
        a(str, a, F4.VALUE);
        return a;
    }

    public final G4 f(String str) {
        C0663qq c0663qq = this.t;
        c0663qq.getClass();
        String a = c0663qq.a(str);
        a(str, a, F4.VALUE);
        this.b = a;
        return this;
    }

    public final HashMap<F4, Integer> p() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.K6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.K6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.K6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public G4(String str, int i, PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public G4(String str, String str2, int i, PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public G4(int i, PublicLogger publicLogger, long j) {
        this("", "", i, publicLogger);
        b(j);
    }

    public G4(byte[] bArr, String str, int i, PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.a = d(str);
        setType(i);
    }

    public G4(byte[] bArr, String str, int i, PublicLogger publicLogger, long j) {
        this(bArr, str, i, publicLogger);
        b(j);
    }

    public G4(PublicLogger publicLogger) {
        this("", "", 0, 0, publicLogger);
    }

    public final G4 a(HashMap<F4, Integer> hashMap) {
        this.q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.r = new C0749tq(1000, "event name", publicLogger);
        this.s = new C0663qq(245760, "event value", publicLogger);
        this.t = new C0663qq(1024000, "event extended value", publicLogger);
        this.u = new R3(245760, "event value bytes", publicLogger);
        this.v = new C0749tq(200, "user profile id", publicLogger);
    }

    public final void a(byte[] bArr) {
        R3 r3 = this.u;
        r3.getClass();
        byte[] a = r3.a(bArr);
        F4 f4 = F4.VALUE;
        int length = bArr.length;
        int length2 = a.length;
        HashMap hashMap = this.q;
        if (length != length2) {
            hashMap.put(f4, Integer.valueOf(bArr.length - a.length));
        } else {
            hashMap.remove(f4);
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
        super.setValueBytes(a);
    }

    public static K6 a(Lr lr) {
        K6 o = o();
        o.setValue(new String(Base64.encode(MessageNano.toByteArray(lr), 0)));
        return o;
    }

    public final void a(String str, String str2, F4 f4) {
        boolean equalsNullSafety = StringUtils.equalsNullSafety(str, str2);
        HashMap hashMap = this.q;
        if (!equalsNullSafety) {
            hashMap.put(f4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        } else {
            hashMap.remove(f4);
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
    }

    public static G4 a(PublicLogger publicLogger, G g) {
        G4 g4 = new G4(publicLogger);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        g4.d = 40977;
        kotlin.Pair a = g.a();
        g4.b = g4.e(new String(Base64.encode((byte[]) a.c(), 0)));
        g4.g = ((Integer) a.f()).intValue();
        return g4;
    }
}
