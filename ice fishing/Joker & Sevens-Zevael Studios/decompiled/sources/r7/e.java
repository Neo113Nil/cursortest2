package r7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p7.f;
import p7.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements p7.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6105a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f6106b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6107c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6108d;

    /* renamed from: e, reason: collision with root package name */
    public final p7.d f6109e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6110f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f6106b = new JsonWriter(bufferedWriter);
        this.f6107c = hashMap;
        this.f6108d = hashMap2;
        this.f6109e = aVar;
        this.f6110f = z10;
    }

    @Override // p7.e
    public final p7.e a(p7.c cVar, Object obj) {
        g(obj, cVar.f5654a);
        return this;
    }

    @Override // p7.g
    public final g b(String str) {
        h();
        this.f6106b.value(str);
        return this;
    }

    @Override // p7.e
    public final p7.e c(p7.c cVar, int i10) {
        String str = cVar.f5654a;
        h();
        JsonWriter jsonWriter = this.f6106b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i10);
        return this;
    }

    @Override // p7.e
    public final p7.e d(p7.c cVar, long j3) {
        String str = cVar.f5654a;
        h();
        JsonWriter jsonWriter = this.f6106b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j3);
        return this;
    }

    @Override // p7.g
    public final g e(boolean z10) {
        h();
        this.f6106b.value(z10);
        return this;
    }

    public final e f(Object obj) {
        JsonWriter jsonWriter = this.f6106b;
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
                    } catch (ClassCastException e10) {
                        throw new p7.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            p7.d dVar = (p7.d) this.f6107c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f6108d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.f6109e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i10 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                jsonWriter.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j3 = jArr[i10];
                h();
                jsonWriter.value(j3);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                f(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                f(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e g(Object obj, String str) {
        boolean z10 = this.f6110f;
        JsonWriter jsonWriter = this.f6106b;
        if (z10) {
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
        if (!this.f6105a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
