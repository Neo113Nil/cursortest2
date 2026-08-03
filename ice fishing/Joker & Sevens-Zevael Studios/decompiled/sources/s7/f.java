package s7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements p7.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f6459f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final p7.c f6460g = new p7.c("key", a4.d.n(a4.d.m(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final p7.c f6461h = new p7.c("value", a4.d.n(a4.d.m(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final r7.a f6462i = new r7.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f6463a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6464b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6465c;

    /* renamed from: d, reason: collision with root package name */
    public final p7.d f6466d;

    /* renamed from: e, reason: collision with root package name */
    public final h f6467e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, p7.d dVar) {
        this.f6463a = byteArrayOutputStream;
        this.f6464b = hashMap;
        this.f6465c = hashMap2;
        this.f6466d = dVar;
    }

    public static int g(p7.c cVar) {
        e eVar = (e) ((Annotation) cVar.f5655b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f6455a;
        }
        throw new p7.b("Field has no @Protobuf config");
    }

    @Override // p7.e
    public final p7.e a(p7.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    public final void b(p7.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f5655b.get(e.class));
        if (eVar == null) {
            throw new p7.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f6455a << 3);
        h(i10);
    }

    @Override // p7.e
    public final p7.e c(p7.c cVar, int i10) {
        b(cVar, i10, true);
        return this;
    }

    @Override // p7.e
    public final p7.e d(p7.c cVar, long j3) {
        if (j3 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f5655b.get(e.class));
        if (eVar == null) {
            throw new p7.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f6455a << 3);
        i(j3);
        return this;
    }

    public final void e(p7.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6459f);
            h(bytes.length);
            this.f6463a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f6462i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z10 && doubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f6463a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z10 && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f6463a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z10 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f5655b.get(e.class));
            if (eVar == null) {
                throw new p7.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f6455a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f6463a.write(bArr);
            return;
        }
        p7.d dVar = (p7.d) this.f6464b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z10);
            return;
        }
        p7.f fVar = (p7.f) this.f6465c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f6467e;
            hVar.f6469a = false;
            hVar.f6471c = cVar;
            hVar.f6470b = z10;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f6466d, cVar, obj, z10);
        }
    }

    public final void f(p7.d dVar, p7.c cVar, Object obj, boolean z10) {
        b bVar = new b();
        bVar.f6456g = 0L;
        try {
            OutputStream outputStream = this.f6463a;
            this.f6463a = bVar;
            try {
                dVar.a(obj, this);
                this.f6463a = outputStream;
                long j3 = bVar.f6456g;
                bVar.close();
                if (z10 && j3 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j3);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f6463a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f6463a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f6463a.write(i10 & 127);
    }

    public final void i(long j3) {
        while (((-128) & j3) != 0) {
            this.f6463a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f6463a.write(((int) j3) & 127);
    }
}
