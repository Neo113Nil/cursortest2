package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bah implements a7f {
    public final List a;
    public int b;
    public Object c;
    public final Object[] d;
    public final Map[] e;
    public final Iterator[] f;
    public final int[] g;
    public int h;

    public bah(List list, Map map) {
        map.getClass();
        list.getClass();
        this.a = list;
        this.d = new Object[256];
        this.e = new Map[256];
        this.f = new Iterator[256];
        this.g = new int[256];
        this.b = 3;
        this.c = map;
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 10;
        }
        if (obj instanceof List) {
            return 1;
        }
        if (obj instanceof Map) {
            return 3;
        }
        if (obj instanceof Integer) {
            return 7;
        }
        if (obj instanceof Long) {
            return 8;
        }
        if ((obj instanceof Double) || (obj instanceof o5f)) {
            return 7;
        }
        if (obj instanceof String) {
            return 6;
        }
        return obj instanceof Boolean ? 9 : 12;
    }

    @Override // defpackage.a7f
    public final String L() {
        if (this.b != 5) {
            b6e.x(f1d.v(this.b), g(), "Expected NAME but was ");
            return null;
        }
        Object obj = this.c;
        obj.getClass();
        Map.Entry entry = (Map.Entry) obj;
        this.d[this.h - 1] = entry.getKey();
        this.c = entry.getValue();
        this.b = b(entry.getValue());
        return (String) entry.getKey();
    }

    public final void a() {
        int i = this.h;
        if (i == 0) {
            this.b = 11;
            return;
        }
        Iterator it = this.f[i - 1];
        it.getClass();
        int i2 = this.h - 1;
        Object[] objArr = this.d;
        Object obj = objArr[i2];
        if (obj instanceof Integer) {
            obj.getClass();
            objArr[i2] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.b = objArr[this.h + (-1)] instanceof Integer ? 2 : 4;
            return;
        }
        Object next = it.next();
        this.c = next;
        this.b = next instanceof Map.Entry ? 5 : b(next);
    }

    @Override // defpackage.a7f
    public final String f0() {
        int D = ouj.D(this.b);
        if (D != 5 && D != 6 && D != 7) {
            b6e.x(f1d.v(this.b), g(), "Expected a String but was ");
            return null;
        }
        Object obj = this.c;
        obj.getClass();
        String obj2 = obj.toString();
        a();
        return obj2;
    }

    public final String g() {
        return CollectionsKt.X(getPath(), ".", null, null, null, 62);
    }

    @Override // defpackage.a7f
    public final ArrayList getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.d[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.a7f
    public final boolean hasNext() {
        int D = ouj.D(this.b);
        return (D == 1 || D == 3) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a7f
    public final a7f j() {
        if (this.b != 3) {
            b6e.x(f1d.v(this.b), g(), "Expected BEGIN_OBJECT but was ");
            return null;
        }
        int i = this.h;
        if (i >= 256) {
            xq0.q("Nesting too deep");
            return null;
        }
        this.h = i + 1;
        Object obj = this.c;
        obj.getClass();
        this.e[i] = obj;
        k();
        return this;
    }

    @Override // defpackage.a7f
    public final void k() {
        int i = this.h - 1;
        Map map = this.e[i];
        this.d[i] = null;
        map.getClass();
        this.f[i] = map.entrySet().iterator();
        this.g[this.h - 1] = 0;
        a();
    }

    @Override // defpackage.a7f
    public final a7f l() {
        if (this.b != 2) {
            b6e.x(f1d.v(this.b), g(), "Expected END_ARRAY but was ");
            return null;
        }
        int i = this.h - 1;
        this.h = i;
        this.f[i] = null;
        this.d[i] = null;
        a();
        return this;
    }

    @Override // defpackage.a7f
    public final a7f m() {
        if (this.b != 1) {
            b6e.x(f1d.v(this.b), g(), "Expected BEGIN_ARRAY but was ");
            return null;
        }
        Object obj = this.c;
        obj.getClass();
        List list = (List) obj;
        int i = this.h;
        if (i >= 256) {
            xq0.q("Nesting too deep");
            return null;
        }
        this.h = i + 1;
        this.d[i] = -1;
        this.f[this.h - 1] = list.iterator();
        a();
        return this;
    }

    @Override // defpackage.a7f
    public final boolean nextBoolean() {
        if (this.b != 9) {
            b6e.x(f1d.v(this.b), g(), "Expected BOOLEAN but was ");
            return false;
        }
        Object obj = this.c;
        obj.getClass();
        a();
        return ((Boolean) obj).booleanValue();
    }

    @Override // defpackage.a7f
    public final double nextDouble() {
        double parseDouble;
        int D = ouj.D(this.b);
        if (D != 5 && D != 6 && D != 7) {
            b6e.x(f1d.v(this.b), g(), "Expected a Double but was ");
            return 0.0d;
        }
        Object obj = this.c;
        if (obj instanceof Integer) {
            parseDouble = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            double d = longValue;
            if (((long) d) != longValue) {
                throw new IllegalStateException((longValue + " cannot be converted to Double").toString());
            }
            parseDouble = d;
        } else if (obj instanceof Double) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            parseDouble = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof o5f)) {
                rj7.i(obj, " instead", "Expected a Double but got ");
                return 0.0d;
            }
            parseDouble = Double.parseDouble(((o5f) obj).a);
        }
        a();
        return parseDouble;
    }

    @Override // defpackage.a7f
    public final int nextInt() {
        int parseInt;
        int i;
        int D = ouj.D(this.b);
        if (D != 5 && D != 6 && D != 7) {
            b6e.x(f1d.v(this.b), g(), "Expected an Int but was ");
            return 0;
        }
        Object obj = this.c;
        if (obj instanceof Integer) {
            parseInt = ((Number) obj).intValue();
        } else {
            if (obj instanceof Long) {
                long longValue = ((Number) obj).longValue();
                i = (int) longValue;
                if (i != longValue) {
                    throw new IllegalStateException((longValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Number) obj).doubleValue();
                i = (int) doubleValue;
                if (i != doubleValue) {
                    throw new IllegalStateException((doubleValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof String) {
                parseInt = Integer.parseInt((String) obj);
            } else {
                if (!(obj instanceof o5f)) {
                    rj7.i(obj, " instead", "Expected an Int but got ");
                    return 0;
                }
                parseInt = Integer.parseInt(((o5f) obj).a);
            }
            parseInt = i;
        }
        a();
        return parseInt;
    }

    @Override // defpackage.a7f
    public final long nextLong() {
        long parseLong;
        int D = ouj.D(this.b);
        if (D != 5 && D != 6 && D != 7) {
            b6e.x(f1d.v(this.b), g(), "Expected a Long but was ");
            return 0L;
        }
        Object obj = this.c;
        if (obj instanceof Integer) {
            parseLong = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            double doubleValue = ((Number) obj).doubleValue();
            long j = (long) doubleValue;
            if (j != doubleValue) {
                throw new IllegalStateException((doubleValue + " cannot be converted to Long").toString());
            }
            parseLong = j;
        } else if (obj instanceof String) {
            parseLong = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof o5f)) {
                rj7.i(obj, " instead", "Expected Int but got ");
                return 0L;
            }
            parseLong = Long.parseLong(((o5f) obj).a);
        }
        a();
        return parseLong;
    }

    @Override // defpackage.a7f
    public final a7f p() {
        int i = this.h - 1;
        this.h = i;
        this.f[i] = null;
        this.d[i] = null;
        this.e[i] = null;
        a();
        return this;
    }

    @Override // defpackage.a7f
    public final int peek() {
        return this.b;
    }

    @Override // defpackage.a7f
    public final void u0() {
        if (this.b == 10) {
            a();
        } else {
            b6e.x(f1d.v(this.b), g(), "Expected NULL but was ");
        }
    }

    @Override // defpackage.a7f
    public final void w() {
        a();
    }

    @Override // defpackage.a7f
    public final o5f y0() {
        o5f o5fVar;
        int D = ouj.D(this.b);
        if (D != 5 && D != 6 && D != 7) {
            b6e.x(f1d.v(this.b), g(), "Expected a Number but was ");
            return null;
        }
        Object obj = this.c;
        if (obj instanceof Integer ? true : obj instanceof Long ? true : obj instanceof Double) {
            o5fVar = new o5f(obj.toString());
        } else if (obj instanceof String) {
            o5fVar = new o5f((String) obj);
        } else {
            if (!(obj instanceof o5f)) {
                rj7.i(obj, " instead", "Expected JsonNumber but got ");
                return null;
            }
            o5fVar = (o5f) obj;
        }
        a();
        return o5fVar;
    }

    @Override // defpackage.a7f
    public final int z0(List list) {
        list.getClass();
        while (hasNext()) {
            String L = L();
            int i = this.h - 1;
            int[] iArr = this.g;
            int i2 = iArr[i];
            if (i2 >= list.size() || !Intrinsics.d(list.get(i2), L)) {
                i2 = list.indexOf(L);
                if (i2 != -1) {
                    iArr[this.h - 1] = i2 + 1;
                }
            } else {
                int i3 = this.h - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            if (i2 != -1) {
                return i2;
            }
            a();
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
