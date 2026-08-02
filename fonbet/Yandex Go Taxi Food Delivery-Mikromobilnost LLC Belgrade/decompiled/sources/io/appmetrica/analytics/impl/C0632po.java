package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.po, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0632po {
    public final InterfaceC0461jr a;
    public final InterfaceC0620pc b;

    public C0632po(R3 r3, C0313en c0313en) {
        this.a = r3;
        this.b = c0313en;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0860xl a(long j, C0762ua c0762ua, List list, Xj xj, int i, Ej ej) {
        boolean z;
        C0733ta c0733ta;
        int i2;
        C0444ja c0444ja;
        ArrayList arrayList = new ArrayList();
        int i3 = ej.a;
        int i4 = ej.b;
        Integer num = ej.c;
        Iterator it = list.iterator();
        int i5 = i4;
        C0579o0 c0579o0 = null;
        int i6 = i3;
        Integer num2 = num;
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            if (i5 >= 100) {
                break;
            }
            C0243ca c0243ca = new C0243ca(contentValues);
            try {
                Hc hc = c0243ca.h;
                if (hc != null) {
                    c0444ja = (C0444ja) Di.d.get(hc);
                } else {
                    Map map = Di.a;
                    c0444ja = null;
                }
                if (c0444ja == null) {
                    c0444ja = C0444ja.i;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                c0733ta = c0444ja.a(c0243ca, xj);
            } catch (Throwable th2) {
                th = th2;
                this.b.reportError("protobuf_serialization_error", th);
                c0733ta = null;
                if (c0733ta == null) {
                }
                i5++;
            }
            if (c0733ta == null) {
                String str = c0243ca.u;
                C0579o0 c0579o02 = new C0579o0(str, c0243ca.v);
                if (c0579o0 != null) {
                    if (!c0579o0.equals(c0579o02)) {
                        z = true;
                        break;
                    }
                } else {
                    if (num2 == null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            Iterator<String> keys = jSONObject.keys();
                            i2 = 0;
                            while (keys.hasNext()) {
                                String next = keys.next();
                                try {
                                    C0560na c0560na = new C0560na();
                                    c0560na.a = next;
                                    c0560na.b = jSONObject.getString(next);
                                    i2 += CodedOutputByteBufferNano.computeMessageSize(7, c0560na);
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                            i2 = 0;
                        }
                        num2 = Integer.valueOf(i2);
                        i6 += i2;
                    }
                    c0579o0 = c0579o02;
                }
                byte[] bArr = (byte[]) this.a.a(c0733ta.e);
                byte[] bArr2 = c0733ta.e;
                if (bArr2 != bArr) {
                    c0733ta.i = ((bArr2 != null ? bArr2.length : 0) - (bArr != null ? bArr.length : 0)) + c0733ta.i;
                    c0733ta.e = bArr;
                }
                i6 += CodedOutputByteBufferNano.computeMessageSize(3, c0733ta);
                if (arrayList.isEmpty() && i == 0) {
                    if (i6 >= 1048576) {
                        break;
                    }
                    arrayList.add(c0733ta);
                } else {
                    if (i6 >= 250880) {
                        break;
                    }
                    arrayList.add(c0733ta);
                }
            }
            i5++;
        }
        z = false;
        if (arrayList.isEmpty()) {
            return null;
        }
        C0791va c0791va = new C0791va();
        c0791va.a = j;
        c0791va.b = c0762ua;
        c0791va.c = (C0733ta[]) arrayList.toArray(new C0733ta[0]);
        return new C0860xl(c0791va, c0579o0, z, i6, i5, num2);
    }
}
