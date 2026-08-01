package Y3;

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
public final class f implements V3.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f3952f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final V3.c f3953g = new V3.c("key", y.u(y.t(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final V3.c f3954h = new V3.c("value", y.u(y.t(e.class, new a(2))));
    public static final X3.a i = new X3.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f3955a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3956b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3957c;

    /* renamed from: d, reason: collision with root package name */
    public final X3.a f3958d;

    /* renamed from: e, reason: collision with root package name */
    public final h f3959e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, X3.a aVar) {
        this.f3955a = byteArrayOutputStream;
        this.f3956b = hashMap;
        this.f3957c = hashMap2;
        this.f3958d = aVar;
    }

    public static int g(V3.c cVar) {
        e eVar = (e) ((Annotation) cVar.f3277b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f3948a;
        }
        throw new V3.b("Field has no @Protobuf config");
    }

    @Override // V3.e
    public final V3.e a(V3.c cVar, long j6) {
        if (j6 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f3277b.get(e.class));
        if (eVar == null) {
            throw new V3.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f3948a << 3);
        i(j6);
        return this;
    }

    @Override // V3.e
    public final V3.e b(V3.c cVar, int i6) {
        d(cVar, i6, true);
        return this;
    }

    @Override // V3.e
    public final V3.e c(V3.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    public final void d(V3.c cVar, int i6, boolean z3) {
        if (z3 && i6 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f3277b.get(e.class));
        if (eVar == null) {
            throw new V3.b("Field has no @Protobuf config");
        }
        h(((a) eVar).f3948a << 3);
        h(i6);
    }

    public final void e(V3.c cVar, Object obj, boolean z3) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z3 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3952f);
            h(bytes.length);
            this.f3955a.write(bytes);
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
            if (z3 && doubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f3955a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z3 && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f3955a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z3 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f3277b.get(e.class));
            if (eVar == null) {
                throw new V3.b("Field has no @Protobuf config");
            }
            h(((a) eVar).f3948a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z3 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f3955a.write(bArr);
            return;
        }
        V3.d dVar = (V3.d) this.f3956b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z3);
            return;
        }
        V3.f fVar = (V3.f) this.f3957c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f3959e;
            hVar.f3961a = false;
            hVar.f3963c = cVar;
            hVar.f3962b = z3;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            d(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            d(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f3958d, cVar, obj, z3);
        }
    }

    public final void f(V3.d dVar, V3.c cVar, Object obj, boolean z3) {
        b bVar = new b();
        bVar.f3949n = 0L;
        try {
            OutputStream outputStream = this.f3955a;
            this.f3955a = bVar;
            try {
                dVar.a(obj, this);
                this.f3955a = outputStream;
                long j6 = bVar.f3949n;
                bVar.close();
                if (z3 && j6 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j6);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f3955a = outputStream;
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

    public final void h(int i6) {
        while ((i6 & (-128)) != 0) {
            this.f3955a.write((i6 & com.anythink.expressad.video.module.a.a.f21728R) | 128);
            i6 >>>= 7;
        }
        this.f3955a.write(i6 & com.anythink.expressad.video.module.a.a.f21728R);
    }

    public final void i(long j6) {
        while (((-128) & j6) != 0) {
            this.f3955a.write((((int) j6) & com.anythink.expressad.video.module.a.a.f21728R) | 128);
            j6 >>>= 7;
        }
        this.f3955a.write(((int) j6) & com.anythink.expressad.video.module.a.a.f21728R);
    }
}
