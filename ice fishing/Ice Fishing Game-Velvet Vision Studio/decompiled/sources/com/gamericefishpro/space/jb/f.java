package com.gamericefishpro.space.jb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.gamericefishpro.space.gb.e {
    public static final Charset f = Charset.forName("UTF-8");
    public static final com.gamericefishpro.space.gb.c g = new com.gamericefishpro.space.gb.c("key", com.gamericefishpro.space.m5.a.n(com.gamericefishpro.space.m5.a.m(e.class, new a(1))));
    public static final com.gamericefishpro.space.gb.c h = new com.gamericefishpro.space.gb.c("value", com.gamericefishpro.space.m5.a.n(com.gamericefishpro.space.m5.a.m(e.class, new a(2))));
    public static final com.gamericefishpro.space.ib.a i = new com.gamericefishpro.space.ib.a(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final com.gamericefishpro.space.gb.d d;
    public final h e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, com.gamericefishpro.space.gb.d dVar) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = dVar;
    }

    public static int g(com.gamericefishpro.space.gb.c cVar) {
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).a;
        }
        throw new com.gamericefishpro.space.gb.b("Field has no @Protobuf config");
    }

    @Override // com.gamericefishpro.space.gb.e
    public final com.gamericefishpro.space.gb.e a(com.gamericefishpro.space.gb.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(com.gamericefishpro.space.gb.c cVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar == null) {
            throw new com.gamericefishpro.space.gb.b("Field has no @Protobuf config");
        }
        h(((a) eVar).a << 3);
        h(i2);
    }

    public final void c(com.gamericefishpro.space.gb.c cVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
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
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.b.get(e.class));
            if (eVar == null) {
                throw new com.gamericefishpro.space.gb.b("Field has no @Protobuf config");
            }
            h(((a) eVar).a << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.a.write(bArr);
            return;
        }
        com.gamericefishpro.space.gb.d dVar = (com.gamericefishpro.space.gb.d) this.b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z);
            return;
        }
        com.gamericefishpro.space.gb.f fVar = (com.gamericefishpro.space.gb.f) this.c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.e;
            hVar.a = false;
            hVar.c = cVar;
            hVar.b = z;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.d, cVar, obj, z);
        }
    }

    @Override // com.gamericefishpro.space.gb.e
    public final com.gamericefishpro.space.gb.e d(com.gamericefishpro.space.gb.c cVar, int i2) {
        b(cVar, i2, true);
        return this;
    }

    @Override // com.gamericefishpro.space.gb.e
    public final com.gamericefishpro.space.gb.e e(com.gamericefishpro.space.gb.c cVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar == null) {
            throw new com.gamericefishpro.space.gb.b("Field has no @Protobuf config");
        }
        h(((a) eVar).a << 3);
        i(j);
        return this;
    }

    public final void f(com.gamericefishpro.space.gb.d dVar, com.gamericefishpro.space.gb.c cVar, Object obj, boolean z) throws IOException {
        b bVar = new b();
        bVar.d = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j = bVar.d;
                bVar.close();
                if (z && j == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
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

    public final void h(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void i(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
