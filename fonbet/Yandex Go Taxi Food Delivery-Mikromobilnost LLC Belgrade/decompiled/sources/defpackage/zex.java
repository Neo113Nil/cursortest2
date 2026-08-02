package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zex implements jp60, i131 {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final ip60 e;
    public final boolean f;

    public zex(Writer writer, Map map, Map map2, ip60 ip60Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = ip60Var;
        this.f = z;
    }

    @Override // defpackage.i131
    public final i131 a(String str) {
        i();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.i131
    public final i131 add(boolean z) {
        i();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 b(lxq lxqVar, boolean z) {
        String str = lxqVar.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 c(lxq lxqVar, int i) {
        String str = lxqVar.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 d(lxq lxqVar, double d) {
        String str = lxqVar.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 e(lxq lxqVar, long j) {
        String str = lxqVar.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j);
        return this;
    }

    @Override // defpackage.jp60
    public final jp60 f(lxq lxqVar, Object obj) {
        h(obj, lxqVar.a);
        return this;
    }

    public final zex g(Object obj) {
        JsonWriter jsonWriter = this.b;
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
                    g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ip60 ip60Var = (ip60) this.c.get(obj.getClass());
            if (ip60Var != null) {
                jsonWriter.beginObject();
                ip60Var.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            h131 h131Var = (h131) this.d.get(obj.getClass());
            if (h131Var != null) {
                h131Var.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof yn60) {
                int number = ((yn60) obj).getNumber();
                i();
                jsonWriter.value(number);
                return this;
            }
            String name = ((Enum) obj).name();
            i();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            i();
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
                long j = jArr[i];
                i();
                jsonWriter.value(j);
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
                g(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                g(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final zex h(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            g(obj);
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        g(obj);
        return this;
    }

    public final void i() {
        if (this.a) {
            return;
        }
        ny61.r("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
