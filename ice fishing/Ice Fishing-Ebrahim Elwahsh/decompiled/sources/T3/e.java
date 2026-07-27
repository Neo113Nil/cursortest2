package T3;

import R3.f;
import R3.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements R3.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3111a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f3112b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3113c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3114d;

    /* renamed from: e, reason: collision with root package name */
    public final a f3115e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3116f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z8) {
        this.f3112b = new JsonWriter(bufferedWriter);
        this.f3113c = hashMap;
        this.f3114d = hashMap2;
        this.f3115e = aVar;
        this.f3116f = z8;
    }

    @Override // R3.e
    public final R3.e a(R3.c cVar, Object obj) {
        g(obj, cVar.f2797a);
        return this;
    }

    @Override // R3.e
    public final R3.e b(R3.c cVar, int i) {
        String str = cVar.f2797a;
        h();
        JsonWriter jsonWriter = this.f3112b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i);
        return this;
    }

    @Override // R3.e
    public final R3.e c(R3.c cVar, long j9) {
        String str = cVar.f2797a;
        h();
        JsonWriter jsonWriter = this.f3112b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j9);
        return this;
    }

    @Override // R3.g
    public final g d(String str) {
        h();
        this.f3112b.value(str);
        return this;
    }

    @Override // R3.g
    public final g e(boolean z8) {
        h();
        this.f3112b.value(z8);
        return this;
    }

    public final e f(Object obj) {
        JsonWriter jsonWriter = this.f3112b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e6) {
                        throw new R3.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            R3.d dVar = (R3.d) this.f3113c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f3114d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f3115e.a(obj, this);
                throw null;
            }
            String name = ((Enum) obj).name();
            h();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j9 = jArr[i];
                h();
                jsonWriter.value(j9);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                f(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                f(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e g(Object obj, String str) {
        boolean z8 = this.f3116f;
        JsonWriter jsonWriter = this.f3112b;
        if (z8) {
            if (obj == null) {
                return this;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        f(obj);
        return this;
    }

    public final void h() {
        if (!this.f3111a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
