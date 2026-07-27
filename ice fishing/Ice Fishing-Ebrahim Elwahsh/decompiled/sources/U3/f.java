package U3;

import D.y;
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

/* loaded from: classes2.dex */
public final class f implements R3.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f3287f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final R3.c f3288g = new R3.c("key", y.q(y.p(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final R3.c f3289h = new R3.c("value", y.q(y.p(e.class, new a(2))));
    public static final T3.a i = new T3.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f3290a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3291b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3292c;

    /* renamed from: d, reason: collision with root package name */
    public final T3.a f3293d;

    /* renamed from: e, reason: collision with root package name */
    public final h f3294e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, T3.a aVar) {
        this.f3290a = byteArrayOutputStream;
        this.f3291b = hashMap;
        this.f3292c = hashMap2;
        this.f3293d = aVar;
    }

    public static int g(R3.c cVar) {
        e eVar = (e) ((Annotation) cVar.f2798b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f3283a;
        }
        throw new R3.b("Field has no @Protobuf config");
    }

    @Override // R3.e
    public final R3.e a(R3.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    @Override // R3.e
    public final R3.e b(R3.c cVar, int i4) {
        d(cVar, i4, true);
        return this;
    }

    @Override // R3.e
    public final R3.e c(R3.c cVar, long j9) {
        if (j9 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f2798b.get(e.class));
        if (eVar == null) {
            throw new R3.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f3283a << 3);
        i(j9);
        return this;
    }

    public final void d(R3.c cVar, int i4, boolean z8) {
        if (z8 && i4 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f2798b.get(e.class));
        if (eVar == null) {
            throw new R3.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f3283a << 3);
        h(i4);
    }

    public final void e(R3.c cVar, Object obj, boolean z8) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z8 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3287f);
            h(bytes.length);
            this.f3290a.write(bytes);
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
                f(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z8 && doubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f3290a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z8 && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f3290a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z8 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f2798b.get(e.class));
            if (eVar == null) {
                throw new R3.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f3283a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z8);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z8 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f3290a.write(bArr);
            return;
        }
        R3.d dVar = (R3.d) this.f3291b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z8);
            return;
        }
        R3.f fVar = (R3.f) this.f3292c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f3294e;
            hVar.f3296a = false;
            hVar.f3298c = cVar;
            hVar.f3297b = z8;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            d(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            d(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f3293d, cVar, obj, z8);
        }
    }

    public final void f(R3.d dVar, R3.c cVar, Object obj, boolean z8) {
        b bVar = new b();
        bVar.f3284n = 0L;
        try {
            OutputStream outputStream = this.f3290a;
            this.f3290a = bVar;
            try {
                dVar.a(obj, this);
                this.f3290a = outputStream;
                long j9 = bVar.f3284n;
                bVar.close();
                if (z8 && j9 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j9);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f3290a = outputStream;
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

    public final void h(int i4) {
        while ((i4 & (-128)) != 0) {
            this.f3290a.write((i4 & com.anythink.expressad.video.module.a.a.f21886R) | 128);
            i4 >>>= 7;
        }
        this.f3290a.write(i4 & com.anythink.expressad.video.module.a.a.f21886R);
    }

    public final void i(long j9) {
        while (((-128) & j9) != 0) {
            this.f3290a.write((((int) j9) & com.anythink.expressad.video.module.a.a.f21886R) | 128);
            j9 >>>= 7;
        }
        this.f3290a.write(((int) j9) & com.anythink.expressad.video.module.a.a.f21886R);
    }
}
