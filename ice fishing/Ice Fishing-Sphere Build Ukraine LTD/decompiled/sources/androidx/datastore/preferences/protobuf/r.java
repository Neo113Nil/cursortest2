package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1482c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f1483a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1484b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0083m c0083m, r0 r0Var, int i2, Object obj) {
        if (r0Var == r0.f1486h) {
            c0083m.E0(i2, 3);
            ((AbstractC0071a) obj).b(c0083m);
            c0083m.E0(i2, 4);
            return;
        }
        c0083m.E0(i2, r0Var.f1490f);
        switch (r0Var.ordinal()) {
            case 0:
                c0083m.z0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0083m.x0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                c0083m.I0(((Long) obj).longValue());
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0083m.I0(((Long) obj).longValue());
                break;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                c0083m.B0(((Integer) obj).intValue());
                break;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                c0083m.z0(((Long) obj).longValue());
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0083m.x0(((Integer) obj).intValue());
                break;
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0083m.r0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0077g)) {
                    c0083m.D0((String) obj);
                    break;
                } else {
                    c0083m.v0((C0077g) obj);
                    break;
                }
            case 9:
                ((AbstractC0071a) obj).b(c0083m);
                break;
            case 10:
                AbstractC0071a abstractC0071a = (AbstractC0071a) obj;
                c0083m.getClass();
                c0083m.G0(((AbstractC0092w) abstractC0071a).a(null));
                abstractC0071a.b(c0083m);
                break;
            case 11:
                if (!(obj instanceof C0077g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0083m.G0(length);
                    c0083m.s0(bArr, 0, length);
                    break;
                } else {
                    c0083m.v0((C0077g) obj);
                    break;
                }
            case 12:
                c0083m.G0(((Integer) obj).intValue());
                break;
            case 13:
                c0083m.B0(((Integer) obj).intValue());
                break;
            case 14:
                c0083m.x0(((Integer) obj).intValue());
                break;
            case 15:
                c0083m.z0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0083m.G0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0083m.I0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1484b) {
            return;
        }
        Y y2 = this.f1483a;
        int size = y2.f1407e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry c2 = y2.c(i2);
            if (c2.getValue() instanceof AbstractC0092w) {
                AbstractC0092w abstractC0092w = (AbstractC0092w) c2.getValue();
                abstractC0092w.getClass();
                T t2 = T.f1393c;
                t2.getClass();
                t2.a(abstractC0092w.getClass()).g(abstractC0092w);
                abstractC0092w.j();
            }
        }
        if (!y2.f1409g) {
            if (y2.f1407e.size() > 0) {
                y2.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y2.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y2.f1409g) {
            y2.f1408f = y2.f1408f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f1408f);
            y2.f1411i = y2.f1411i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f1411i);
            y2.f1409g = true;
        }
        this.f1484b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y2 = this.f1483a;
        if (y2.f1407e.size() > 0) {
            Map.Entry c2 = y2.c(0);
            if (c2.getKey() != null) {
                throw new ClassCastException();
            }
            c2.getValue();
            throw null;
        }
        Iterator it = y2.d().iterator();
        if (!it.hasNext()) {
            return rVar;
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
        if (obj instanceof r) {
            return this.f1483a.equals(((r) obj).f1483a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1483a.hashCode();
    }

    public r(int i2) {
        a();
        a();
    }
}
