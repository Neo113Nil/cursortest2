package a4;

import D.x;
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
public final class f implements X3.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f4305f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final X3.c f4306g = new X3.c("key", x.r(x.q(e.class, new C0437a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final X3.c f4307h = new X3.c("value", x.r(x.q(e.class, new C0437a(2))));
    public static final Z3.a i = new Z3.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f4308a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4309b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4310c;

    /* renamed from: d, reason: collision with root package name */
    public final Z3.a f4311d;

    /* renamed from: e, reason: collision with root package name */
    public final h f4312e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, Z3.a aVar) {
        this.f4308a = byteArrayOutputStream;
        this.f4309b = hashMap;
        this.f4310c = hashMap2;
        this.f4311d = aVar;
    }

    public static int g(X3.c cVar) {
        e eVar = (e) ((Annotation) cVar.f3765b.get(e.class));
        if (eVar != null) {
            return ((C0437a) eVar).f4301a;
        }
        throw new X3.b("Field has no @Protobuf config");
    }

    @Override // X3.e
    public final X3.e a(X3.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    @Override // X3.e
    public final X3.e b(X3.c cVar, long j6) {
        if (j6 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f3765b.get(e.class));
        if (eVar == null) {
            throw new X3.b("Field has no @Protobuf config");
        }
        h(((C0437a) eVar).f4301a << 3);
        i(j6);
        return this;
    }

    @Override // X3.e
    public final X3.e c(X3.c cVar, int i4) {
        d(cVar, i4, true);
        return this;
    }

    public final void d(X3.c cVar, int i4, boolean z6) {
        if (z6 && i4 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f3765b.get(e.class));
        if (eVar == null) {
            throw new X3.b("Field has no @Protobuf config");
        }
        h(((C0437a) eVar).f4301a << 3);
        h(i4);
    }

    public final void e(X3.c cVar, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f4305f);
            h(bytes.length);
            this.f4308a.write(bytes);
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
            if (z6 && doubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f4308a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z6 && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f4308a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z6 && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f3765b.get(e.class));
            if (eVar == null) {
                throw new X3.b("Field has no @Protobuf config");
            }
            h(((C0437a) eVar).f4301a << 3);
            i(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f4308a.write(bArr);
            return;
        }
        X3.d dVar = (X3.d) this.f4309b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z6);
            return;
        }
        X3.f fVar = (X3.f) this.f4310c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f4312e;
            hVar.f4314a = false;
            hVar.f4316c = cVar;
            hVar.f4315b = z6;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof InterfaceC0439c) {
            d(cVar, ((InterfaceC0439c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            d(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f4311d, cVar, obj, z6);
        }
    }

    public final void f(X3.d dVar, X3.c cVar, Object obj, boolean z6) {
        C0438b c0438b = new C0438b();
        c0438b.f4302n = 0L;
        try {
            OutputStream outputStream = this.f4308a;
            this.f4308a = c0438b;
            try {
                dVar.a(obj, this);
                this.f4308a = outputStream;
                long j6 = c0438b.f4302n;
                c0438b.close();
                if (z6 && j6 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j6);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f4308a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0438b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void h(int i4) {
        while ((i4 & (-128)) != 0) {
            this.f4308a.write((i4 & com.anythink.expressad.video.module.a.a.f22515R) | 128);
            i4 >>>= 7;
        }
        this.f4308a.write(i4 & com.anythink.expressad.video.module.a.a.f22515R);
    }

    public final void i(long j6) {
        while (((-128) & j6) != 0) {
            this.f4308a.write((((int) j6) & com.anythink.expressad.video.module.a.a.f22515R) | 128);
            j6 >>>= 7;
        }
        this.f4308a.write(((int) j6) & com.anythink.expressad.video.module.a.a.f22515R);
    }
}
