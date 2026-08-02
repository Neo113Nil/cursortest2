package Z3;

import X3.f;
import X3.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements X3.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4150a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f4151b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4152c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4153d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4154e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4155f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z6) {
        this.f4151b = new JsonWriter(bufferedWriter);
        this.f4152c = hashMap;
        this.f4153d = hashMap2;
        this.f4154e = aVar;
        this.f4155f = z6;
    }

    @Override // X3.e
    public final X3.e a(X3.c cVar, Object obj) {
        g(obj, cVar.f3764a);
        return this;
    }

    @Override // X3.e
    public final X3.e b(X3.c cVar, long j6) {
        String str = cVar.f3764a;
        h();
        JsonWriter jsonWriter = this.f4151b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j6);
        return this;
    }

    @Override // X3.e
    public final X3.e c(X3.c cVar, int i) {
        String str = cVar.f3764a;
        h();
        JsonWriter jsonWriter = this.f4151b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i);
        return this;
    }

    @Override // X3.g
    public final g d(String str) {
        h();
        this.f4151b.value(str);
        return this;
    }

    @Override // X3.g
    public final g e(boolean z6) {
        h();
        this.f4151b.value(z6);
        return this;
    }

    public final e f(Object obj) {
        JsonWriter jsonWriter = this.f4151b;
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
                    } catch (ClassCastException e9) {
                        throw new X3.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e9);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            X3.d dVar = (X3.d) this.f4152c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f4153d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f4154e.a(obj, this);
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
                long j6 = jArr[i];
                h();
                jsonWriter.value(j6);
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
        boolean z6 = this.f4155f;
        JsonWriter jsonWriter = this.f4151b;
        if (z6) {
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
        if (!this.f4150a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
