package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class QK {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27807c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FL f27808a = new FL();

    /* renamed from: b, reason: collision with root package name */
    public boolean f27809b;

    static {
        new QK(0);
    }

    public QK() {
    }

    public static void b(OK ok, SL sl, int i, Object obj) {
        if (sl == SL.f28186w) {
            ok.Y(i, 3);
            ((VK) ((AbstractC4286zK) obj)).v(ok);
            ok.Y(i, 4);
            return;
        }
        ok.Y(i, sl.f28190u);
        TL tl = TL.f28508n;
        switch (sl.ordinal()) {
            case 0:
                ok.O1(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                ok.L1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                ok.N1(((Long) obj).longValue());
                break;
            case 3:
                ok.N1(((Long) obj).longValue());
                break;
            case 4:
                ok.H1(((Integer) obj).intValue());
                break;
            case 5:
                ok.O1(((Long) obj).longValue());
                break;
            case 6:
                ok.L1(((Integer) obj).intValue());
                break;
            case 7:
                ok.E1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof JK)) {
                    ok.P1((String) obj);
                    break;
                } else {
                    ok.z1((JK) obj);
                    break;
                }
            case 9:
                ((VK) ((AbstractC4286zK) obj)).v(ok);
                break;
            case 10:
                ok.D1((AbstractC4286zK) obj);
                break;
            case 11:
                if (!(obj instanceof JK)) {
                    byte[] bArr = (byte[]) obj;
                    ok.B1(bArr.length, bArr);
                    break;
                } else {
                    ok.z1((JK) obj);
                    break;
                }
            case 12:
                ok.J1(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof XK)) {
                    ok.H1(((Integer) obj).intValue());
                    break;
                } else {
                    ok.H1(((XK) obj).c());
                    break;
                }
            case 14:
                ok.L1(((Integer) obj).intValue());
                break;
            case 15:
                ok.O1(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                ok.J1((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                ok.N1((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f27809b) {
            return;
        }
        FL fl = this.f27808a;
        int i = fl.f25547u;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = fl.a(i4).f25758n;
            if (obj instanceof VK) {
                ((VK) obj).q();
            }
        }
        Iterator it = fl.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof VK) {
                ((VK) value).q();
            }
        }
        if (!fl.f25549w) {
            if (fl.f25547u > 0) {
                fl.a(0).getClass();
                throw null;
            }
            Iterator it2 = fl.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!fl.f25549w) {
            fl.f25548v = fl.f25548v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(fl.f25548v);
            fl.f25551y = fl.f25551y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(fl.f25551y);
            fl.f25549w = true;
        }
        this.f27809b = true;
    }

    public final Object clone() {
        QK qk = new QK();
        FL fl = this.f27808a;
        if (fl.f25547u > 0) {
            GL a9 = fl.a(0);
            a9.getClass();
            Object obj = a9.f25758n;
            throw null;
        }
        Iterator it = fl.b().iterator();
        if (!it.hasNext()) {
            return qk;
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
        if (obj instanceof QK) {
            return this.f27808a.equals(((QK) obj).f27808a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27808a.hashCode();
    }

    public QK(int i) {
        a();
        a();
    }
}
