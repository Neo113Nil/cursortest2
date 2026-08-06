package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2434c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Y f2435a = Y.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2436b;

    static {
        new r(0);
    }

    public r() {
    }

    public static void b(C0113m c0113m, r0 r0Var, int i2, Object obj) {
        if (r0Var == r0.f2438d) {
            c0113m.z0(i2, 3);
            ((AbstractC0101a) obj).b(c0113m);
            c0113m.z0(i2, 4);
            return;
        }
        c0113m.z0(i2, r0Var.f2442b);
        switch (r0Var.ordinal()) {
            case 0:
                c0113m.u0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0113m.s0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0113m.D0(((Long) obj).longValue());
                break;
            case 3:
                c0113m.D0(((Long) obj).longValue());
                break;
            case 4:
                c0113m.w0(((Integer) obj).intValue());
                break;
            case 5:
                c0113m.u0(((Long) obj).longValue());
                break;
            case 6:
                c0113m.s0(((Integer) obj).intValue());
                break;
            case 7:
                c0113m.m0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0107g)) {
                    c0113m.y0((String) obj);
                    break;
                } else {
                    c0113m.q0((C0107g) obj);
                    break;
                }
            case 9:
                ((AbstractC0101a) obj).b(c0113m);
                break;
            case 10:
                AbstractC0101a abstractC0101a = (AbstractC0101a) obj;
                c0113m.getClass();
                c0113m.B0(((AbstractC0122w) abstractC0101a).a(null));
                abstractC0101a.b(c0113m);
                break;
            case 11:
                if (!(obj instanceof C0107g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0113m.B0(length);
                    c0113m.n0(bArr, 0, length);
                    break;
                } else {
                    c0113m.q0((C0107g) obj);
                    break;
                }
            case 12:
                c0113m.B0(((Integer) obj).intValue());
                break;
            case 13:
                c0113m.w0(((Integer) obj).intValue());
                break;
            case 14:
                c0113m.s0(((Integer) obj).intValue());
                break;
            case 15:
                c0113m.u0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0113m.B0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0113m.D0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f2436b) {
            return;
        }
        Y y2 = this.f2435a;
        int size = y2.f2359a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry c2 = y2.c(i2);
            if (c2.getValue() instanceof AbstractC0122w) {
                AbstractC0122w abstractC0122w = (AbstractC0122w) c2.getValue();
                abstractC0122w.getClass();
                T t = T.f2345c;
                t.getClass();
                t.a(abstractC0122w.getClass()).h(abstractC0122w);
                abstractC0122w.j();
            }
        }
        if (!y2.f2361c) {
            if (y2.f2359a.size() > 0) {
                y2.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y2.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y2.f2361c) {
            y2.f2360b = y2.f2360b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f2360b);
            y2.f2363e = y2.f2363e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(y2.f2363e);
            y2.f2361c = true;
        }
        this.f2436b = true;
    }

    public final Object clone() {
        r rVar = new r();
        Y y2 = this.f2435a;
        if (y2.f2359a.size() > 0) {
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
            return this.f2435a.equals(((r) obj).f2435a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2435a.hashCode();
    }

    public r(int i2) {
        a();
        a();
    }
}
