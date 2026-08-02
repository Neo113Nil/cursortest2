package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
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

/* loaded from: classes3.dex */
public final class dzm implements shj {
    public static final Charset f = Charset.forName("UTF-8");
    public static final d9c g = new d9c(PListParser.TAG_KEY, vz1.y(vz1.x(xym.class, new xt1(1))));
    public static final d9c h = new d9c(Constants.KEY_VALUE, vz1.y(vz1.x(xym.class, new xt1(2))));
    public static final o4f i = new o4f(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final rhj d;
    public final ezm e = new ezm(this);

    public dzm(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, rhj rhjVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = rhjVar;
    }

    public static int k(d9c d9cVar) {
        xym xymVar = (xym) ((Annotation) d9cVar.b.get(xym.class));
        if (xymVar != null) {
            return xymVar.tag();
        }
        throw new r6b("Field has no @Protobuf config");
    }

    @Override // defpackage.shj
    public final shj a(d9c d9cVar, Object obj) {
        i(d9cVar, obj, true);
        return this;
    }

    public final void b(d9c d9cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        l((k(d9cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(d9c d9cVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        xym xymVar = (xym) ((Annotation) d9cVar.b.get(xym.class));
        if (xymVar == null) {
            throw new r6b("Field has no @Protobuf config");
        }
        int ordinal = xymVar.intEncoding().ordinal();
        if (ordinal == 0) {
            l(xymVar.tag() << 3);
            l(i2);
        } else if (ordinal == 1) {
            l(xymVar.tag() << 3);
            l((i2 << 1) ^ (i2 >> 31));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((xymVar.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    @Override // defpackage.shj
    public final shj d(d9c d9cVar, boolean z) {
        c(d9cVar, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.shj
    public final shj e(d9c d9cVar, int i2) {
        c(d9cVar, i2, true);
        return this;
    }

    @Override // defpackage.shj
    public final shj f(d9c d9cVar, double d) {
        b(d9cVar, d, true);
        return this;
    }

    @Override // defpackage.shj
    public final shj g(d9c d9cVar, long j) {
        h(d9cVar, j, true);
        return this;
    }

    public final void h(d9c d9cVar, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        xym xymVar = (xym) ((Annotation) d9cVar.b.get(xym.class));
        if (xymVar == null) {
            throw new r6b("Field has no @Protobuf config");
        }
        int ordinal = xymVar.intEncoding().ordinal();
        if (ordinal == 0) {
            l(xymVar.tag() << 3);
            m(j);
        } else if (ordinal == 1) {
            l(xymVar.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (ordinal != 2) {
                return;
            }
            l((xymVar.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(d9c d9cVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(d9cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            l(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(d9cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, d9cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(d9cVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            l((k(d9cVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(d9cVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(d9cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(d9cVar) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return;
        }
        rhj rhjVar = (rhj) this.b.get(obj.getClass());
        if (rhjVar != null) {
            j(rhjVar, d9cVar, obj, z);
            return;
        }
        twt twtVar = (twt) this.c.get(obj.getClass());
        if (twtVar != null) {
            ezm ezmVar = this.e;
            ezmVar.a = false;
            ezmVar.c = d9cVar;
            ezmVar.b = z;
            twtVar.a(obj, ezmVar);
            return;
        }
        if (obj instanceof qym) {
            c(d9cVar, ((qym) obj).a(), true);
        } else if (obj instanceof Enum) {
            c(d9cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.d, d9cVar, obj, z);
        }
    }

    public final void j(rhj rhjVar, d9c d9cVar, Object obj, boolean z) {
        exf exfVar = new exf();
        exfVar.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = exfVar;
            try {
                rhjVar.a(obj, this);
                this.a = outputStream;
                long j = exfVar.a;
                exfVar.close();
                if (z && j == 0) {
                    return;
                }
                l((k(d9cVar) << 3) | 2);
                m(j);
                rhjVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                exfVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i2) {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void m(long j) {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
