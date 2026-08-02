package defpackage;

import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zj00 implements xdx {
    public int B;
    public final Map a;
    public final List b;
    public Object w;
    public final Object[] x = new Object[256];
    public final Map[] y = new Map[256];
    public final Iterator[] z = new Iterator[256];
    public final int[] A = new int[256];
    public JsonReader$Token c = JsonReader$Token.BEGIN_OBJECT;

    public zj00(Map map, List list) {
        this.a = map;
        this.b = list;
        this.w = map;
    }

    public static JsonReader$Token c(Object obj) {
        if (obj == null) {
            return JsonReader$Token.NULL;
        }
        if (obj instanceof List) {
            return JsonReader$Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader$Token.BEGIN_OBJECT;
        }
        if (obj instanceof Integer) {
            return JsonReader$Token.NUMBER;
        }
        if (obj instanceof Long) {
            return JsonReader$Token.LONG;
        }
        if (!(obj instanceof Double) && !(obj instanceof hdx)) {
            return obj instanceof String ? JsonReader$Token.STRING : obj instanceof Boolean ? JsonReader$Token.BOOLEAN : JsonReader$Token.ANY;
        }
        return JsonReader$Token.NUMBER;
    }

    @Override // defpackage.xdx
    public final void B0() {
        if (this.c == JsonReader$Token.NULL) {
            a();
            return;
        }
        StringBuilder sb = new StringBuilder("Expected NULL but was ");
        sb.append(this.c);
        kbs.p(sb, d());
    }

    @Override // defpackage.xdx
    public final hdx J0() {
        hdx hdxVar;
        int i = yj00.a[this.c.ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            StringBuilder sb = new StringBuilder("Expected a Number but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return null;
        }
        Object obj = this.w;
        if (obj instanceof Integer ? true : obj instanceof Long ? true : obj instanceof Double) {
            hdxVar = new hdx(obj.toString());
        } else if (obj instanceof String) {
            hdxVar = new hdx((String) obj);
        } else {
            if (!(obj instanceof hdx)) {
                w511.j("Expected JsonNumber but got ", obj, " instead");
                return null;
            }
            hdxVar = (hdx) obj;
        }
        a();
        return hdxVar;
    }

    public final void a() {
        int i = this.B;
        if (i == 0) {
            this.c = JsonReader$Token.END_DOCUMENT;
            return;
        }
        int i2 = i - 1;
        Iterator it = this.z[i2];
        Object[] objArr = this.x;
        Object obj = objArr[i2];
        if (obj instanceof Integer) {
            objArr[i2] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.c = objArr[this.B + (-1)] instanceof Integer ? JsonReader$Token.END_ARRAY : JsonReader$Token.END_OBJECT;
            return;
        }
        Object next = it.next();
        this.w = next;
        this.c = next instanceof Map.Entry ? JsonReader$Token.NAME : c(next);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final String d() {
        return a.X(getPath(), Extension.DOT_CHAR, null, null, null, 62);
    }

    @Override // defpackage.xdx
    public final ArrayList getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        int i = this.B;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.x[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.xdx
    public final int h2(List list) {
        while (hasNext()) {
            String nextName = nextName();
            int i = this.B - 1;
            int[] iArr = this.A;
            int i2 = iArr[i];
            if (i2 >= list.size() || !jl40.l(list.get(i2), nextName)) {
                i2 = list.indexOf(nextName);
                if (i2 != -1) {
                    iArr[this.B - 1] = i2 + 1;
                }
            } else {
                int i3 = this.B - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            if (i2 != -1) {
                return i2;
            }
            a();
        }
        return -1;
    }

    @Override // defpackage.xdx
    public final boolean hasNext() {
        int i = yj00.a[this.c.ordinal()];
        return (i == 1 || i == 2) ? false : true;
    }

    @Override // defpackage.xdx
    public final xdx j() {
        if (this.c != JsonReader$Token.END_ARRAY) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return null;
        }
        int i = this.B - 1;
        this.B = i;
        this.z[i] = null;
        this.x[i] = null;
        a();
        return this;
    }

    @Override // defpackage.xdx
    public final xdx l() {
        if (this.c != JsonReader$Token.BEGIN_ARRAY) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return null;
        }
        List list = (List) this.w;
        int i = this.B;
        if (i >= 256) {
            ny61.r("Nesting too deep");
            return null;
        }
        this.B = i + 1;
        this.x[i] = -1;
        this.z[this.B - 1] = list.iterator();
        a();
        return this;
    }

    @Override // defpackage.xdx
    public final boolean nextBoolean() {
        if (this.c == JsonReader$Token.BOOLEAN) {
            Boolean bool = (Boolean) this.w;
            a();
            return bool.booleanValue();
        }
        StringBuilder sb = new StringBuilder("Expected BOOLEAN but was ");
        sb.append(this.c);
        kbs.p(sb, d());
        return false;
    }

    @Override // defpackage.xdx
    public final double nextDouble() {
        double parseDouble;
        int i = yj00.a[this.c.ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            StringBuilder sb = new StringBuilder("Expected a Double but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return 0.0d;
        }
        Object obj = this.w;
        if (obj instanceof Integer) {
            parseDouble = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseDouble = c991.c(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseDouble = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            parseDouble = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof hdx)) {
                w511.j("Expected a Double but got ", obj, " instead");
                return 0.0d;
            }
            parseDouble = Double.parseDouble(((hdx) obj).a());
        }
        a();
        return parseDouble;
    }

    @Override // defpackage.xdx
    public final int nextInt() {
        int parseInt;
        int i = yj00.a[this.c.ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            StringBuilder sb = new StringBuilder("Expected an Int but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return 0;
        }
        Object obj = this.w;
        if (obj instanceof Integer) {
            parseInt = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseInt = c991.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            parseInt = c991.a(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseInt = Integer.parseInt((String) obj);
        } else {
            if (!(obj instanceof hdx)) {
                w511.j("Expected an Int but got ", obj, " instead");
                return 0;
            }
            parseInt = Integer.parseInt(((hdx) obj).a());
        }
        a();
        return parseInt;
    }

    @Override // defpackage.xdx
    public final long nextLong() {
        long parseLong;
        int i = yj00.a[this.c.ordinal()];
        if (i != 3 && i != 4 && i != 5) {
            StringBuilder sb = new StringBuilder("Expected a Long but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return 0L;
        }
        Object obj = this.w;
        if (obj instanceof Integer) {
            parseLong = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            parseLong = c991.b(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            parseLong = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof hdx)) {
                w511.j("Expected Int but got ", obj, " instead");
                return 0L;
            }
            parseLong = Long.parseLong(((hdx) obj).a());
        }
        a();
        return parseLong;
    }

    @Override // defpackage.xdx
    public final String nextName() {
        if (this.c != JsonReader$Token.NAME) {
            StringBuilder sb = new StringBuilder("Expected NAME but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return null;
        }
        Map.Entry entry = (Map.Entry) this.w;
        this.x[this.B - 1] = entry.getKey();
        this.w = entry.getValue();
        this.c = c(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // defpackage.xdx
    public final String nextString() {
        int i = yj00.a[this.c.ordinal()];
        if (i == 3 || i == 4 || i == 5) {
            String obj = this.w.toString();
            a();
            return obj;
        }
        StringBuilder sb = new StringBuilder("Expected a String but was ");
        sb.append(this.c);
        kbs.p(sb, d());
        return null;
    }

    @Override // defpackage.xdx
    public final JsonReader$Token peek() {
        return this.c;
    }

    @Override // defpackage.xdx
    public final void rewind() {
        int i = this.B - 1;
        Map map = this.y[i];
        this.x[i] = null;
        this.z[i] = map.entrySet().iterator();
        this.A[this.B - 1] = 0;
        a();
    }

    @Override // defpackage.xdx
    public final void skipValue() {
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xdx
    public final xdx u() {
        if (this.c != JsonReader$Token.BEGIN_OBJECT) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(this.c);
            kbs.p(sb, d());
            return null;
        }
        int i = this.B;
        if (i >= 256) {
            ny61.r("Nesting too deep");
            return null;
        }
        this.B = i + 1;
        this.y[i] = this.w;
        rewind();
        return this;
    }

    @Override // defpackage.xdx
    public final xdx y() {
        int i = this.B - 1;
        this.B = i;
        this.z[i] = null;
        this.x[i] = null;
        this.y[i] = null;
        a();
        return this;
    }
}
