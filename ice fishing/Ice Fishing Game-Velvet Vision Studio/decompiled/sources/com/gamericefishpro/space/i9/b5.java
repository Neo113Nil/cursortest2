package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 {
    public static final /* synthetic */ int c = 0;
    public final k6 a = new k6();
    public boolean b;

    static {
        new b5(0);
    }

    public b5() {
    }

    public static void b(x4 x4Var, w6 w6Var, int i, Object obj) throws y4 {
        if (w6Var == w6.v) {
            Charset charset = n5.a;
            x4Var.R(i, 3);
            ((g5) ((p4) obj)).d(x4Var);
            x4Var.R(i, 4);
            return;
        }
        x4Var.R(i, w6Var.e);
        x6 x6Var = x6.d;
        switch (w6Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                x4Var.d0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                x4Var.b0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                x4Var.c0(((Long) obj).longValue());
                break;
            case 3:
                x4Var.c0(((Long) obj).longValue());
                break;
            case 4:
                x4Var.Z(((Integer) obj).intValue());
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                x4Var.d0(((Long) obj).longValue());
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                x4Var.b0(((Integer) obj).intValue());
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                x4Var.Y(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof w4)) {
                    x4Var.f0((String) obj);
                } else {
                    x4Var.X((w4) obj);
                }
                break;
            case 9:
                ((g5) ((p4) obj)).d(x4Var);
                break;
            case 10:
                x4Var.getClass();
                g5 g5Var = (g5) ((p4) obj);
                x4Var.a0(g5Var.k());
                g5Var.d(x4Var);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!(obj instanceof w4)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    x4Var.a0(length);
                    x4Var.e0(length, bArr);
                } else {
                    x4Var.X((w4) obj);
                }
                break;
            case 12:
                x4Var.a0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof i5)) {
                    x4Var.Z(((Integer) obj).intValue());
                } else {
                    x4Var.Z(((i5) obj).a());
                }
                break;
            case 14:
                x4Var.b0(((Integer) obj).intValue());
                break;
            case 15:
                x4Var.d0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                x4Var.a0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                x4Var.c0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        k6 k6Var = this.a;
        int i = k6Var.e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = k6Var.a(i2).e;
            if (obj instanceof g5) {
                ((g5) obj).g();
            }
        }
        Iterator it = k6Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof g5) {
                ((g5) value).g();
            }
        }
        if (!k6Var.v) {
            if (k6Var.e > 0) {
                k6Var.a(0).d.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = k6Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!k6Var.v) {
            k6Var.i = k6Var.i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k6Var.i);
            k6Var.y = k6Var.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k6Var.y);
            k6Var.v = true;
        }
        this.b = true;
    }

    public final Object clone() {
        b5 b5Var = new b5();
        k6 k6Var = this.a;
        if (k6Var.e > 0) {
            k6Var.a(0).d.getClass();
            throw new ClassCastException();
        }
        Iterator it = k6Var.b().iterator();
        if (!it.hasNext()) {
            return b5Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b5) {
            return this.a.equals(((b5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public b5(int i) {
        a();
        a();
    }
}
