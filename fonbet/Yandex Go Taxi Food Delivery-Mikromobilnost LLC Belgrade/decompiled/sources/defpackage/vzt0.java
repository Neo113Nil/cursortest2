package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class vzt0 implements rs10 {
    public static final vzt0 a = new vzt0();
    public static final boolean b;
    public static final Charset c;

    static {
        b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        c = Charset.forName("UTF8");
    }

    public static final void c(int i, ByteBuffer byteBuffer) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            return i < 254 ? i : i == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        ny61.g("Message corrupted");
        return 0;
    }

    public static final void g(ckn cknVar, int i) {
        int size = cknVar.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                cknVar.write(0);
            }
        }
    }

    public static final void h(ckn cknVar, int i) {
        if (b) {
            cknVar.write(i);
            cknVar.write(i >>> 8);
            cknVar.write(i >>> 16);
            cknVar.write(i >>> 24);
            return;
        }
        cknVar.write(i >>> 24);
        cknVar.write(i >>> 16);
        cknVar.write(i >>> 8);
        cknVar.write(i);
    }

    public static final void i(ckn cknVar, long j) {
        if (b) {
            cknVar.write((byte) j);
            cknVar.write((byte) (j >>> 8));
            cknVar.write((byte) (j >>> 16));
            cknVar.write((byte) (j >>> 24));
            cknVar.write((byte) (j >>> 32));
            cknVar.write((byte) (j >>> 40));
            cknVar.write((byte) (j >>> 48));
            cknVar.write((byte) (j >>> 56));
            return;
        }
        cknVar.write((byte) (j >>> 56));
        cknVar.write((byte) (j >>> 48));
        cknVar.write((byte) (j >>> 40));
        cknVar.write((byte) (j >>> 32));
        cknVar.write((byte) (j >>> 24));
        cknVar.write((byte) (j >>> 16));
        cknVar.write((byte) (j >>> 8));
        cknVar.write((byte) j);
    }

    public static final void j(ckn cknVar, int i) {
        if (i < 254) {
            cknVar.write(i);
            return;
        }
        if (i > 65535) {
            cknVar.write(255);
            h(cknVar, i);
            return;
        }
        cknVar.write(254);
        if (b) {
            cknVar.write(i);
            cknVar.write(i >>> 8);
        } else {
            cknVar.write(i >>> 8);
            cknVar.write(i);
        }
    }

    @Override // defpackage.rs10
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e = e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return e;
        }
        ny61.g("Message corrupted");
        return null;
    }

    @Override // defpackage.rs10
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        ckn cknVar = new ckn(2);
        k(cknVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(cknVar.size());
        allocateDirect.put(cknVar.a(), 0, cknVar.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        ny61.g("Message corrupted");
        return null;
    }

    public Object f(byte b2, ByteBuffer byteBuffer) {
        Charset charset = c;
        int i = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                return new BigInteger(new String(bArr, charset), 16);
            case 6:
                c(8, byteBuffer);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case 8:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d = d(byteBuffer);
                int[] iArr = new int[d];
                c(4, byteBuffer);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((d * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int d2 = d(byteBuffer);
                long[] jArr = new long[d2];
                c(8, byteBuffer);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int d3 = d(byteBuffer);
                double[] dArr = new double[d3];
                c(8, byteBuffer);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int d4 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d4);
                while (i < d4) {
                    arrayList.add(e(byteBuffer));
                    i++;
                }
                return arrayList;
            case 13:
                int d5 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i < d5) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i++;
                }
                return hashMap;
            case 14:
                int d6 = d(byteBuffer);
                float[] fArr = new float[d6];
                c(4, byteBuffer);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d6 * 4) + byteBuffer.position());
                return fArr;
            default:
                ny61.g("Message corrupted");
                return null;
        }
    }

    public void k(ckn cknVar, Object obj) {
        int i = 0;
        if (obj == null || obj.equals(null)) {
            cknVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            cknVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z = obj instanceof Number;
        Charset charset = c;
        if (z) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                cknVar.write(3);
                h(cknVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                cknVar.write(4);
                i(cknVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                cknVar.write(6);
                g(cknVar, 8);
                i(cknVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    vg10.g(obj.getClass(), "Unsupported Number type: ");
                    return;
                }
                cknVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(cknVar, bytes.length);
                cknVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            cknVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(cknVar, bytes2.length);
            cknVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            cknVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(cknVar, bArr.length);
            cknVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            cknVar.write(9);
            int[] iArr = (int[]) obj;
            j(cknVar, iArr.length);
            g(cknVar, 4);
            int length = iArr.length;
            while (i < length) {
                h(cknVar, iArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof long[]) {
            cknVar.write(10);
            long[] jArr = (long[]) obj;
            j(cknVar, jArr.length);
            g(cknVar, 8);
            int length2 = jArr.length;
            while (i < length2) {
                i(cknVar, jArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            cknVar.write(11);
            double[] dArr = (double[]) obj;
            j(cknVar, dArr.length);
            g(cknVar, 8);
            int length3 = dArr.length;
            while (i < length3) {
                i(cknVar, Double.doubleToLongBits(dArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof List) {
            cknVar.write(12);
            List list = (List) obj;
            j(cknVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(cknVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            cknVar.write(13);
            Map map = (Map) obj;
            j(cknVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(cknVar, entry.getKey());
                k(cknVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            StringBuilder sb = new StringBuilder("Unsupported value: '");
            sb.append(obj);
            yci0.q(sb, "' of type '", obj.getClass(), "'");
            return;
        }
        cknVar.write(14);
        float[] fArr = (float[]) obj;
        j(cknVar, fArr.length);
        g(cknVar, 4);
        int length4 = fArr.length;
        while (i < length4) {
            h(cknVar, Float.floatToIntBits(fArr[i]));
            i++;
        }
    }
}
