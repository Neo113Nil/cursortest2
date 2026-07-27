package m0;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: m0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0216n implements InterfaceC0212j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0216n f2771a = new C0216n();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2772b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f2773c;

    static {
        f2772b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f2773c = Charset.forName("UTF8");
    }

    public static void c(ByteBuffer byteBuffer, int i2) {
        int position = byteBuffer.position() % i2;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - position);
        }
    }

    public static int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i2 = byteBuffer.get() & 255;
        return i2 < 254 ? i2 : i2 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static void g(C0215m c0215m, int i2) {
        int size = c0215m.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                c0215m.write(0);
            }
        }
    }

    public static void h(C0215m c0215m, int i2) {
        if (f2772b) {
            c0215m.write(i2);
            c0215m.write(i2 >>> 8);
            c0215m.write(i2 >>> 16);
            c0215m.write(i2 >>> 24);
            return;
        }
        c0215m.write(i2 >>> 24);
        c0215m.write(i2 >>> 16);
        c0215m.write(i2 >>> 8);
        c0215m.write(i2);
    }

    public static void i(C0215m c0215m, long j2) {
        if (f2772b) {
            c0215m.write((byte) j2);
            c0215m.write((byte) (j2 >>> 8));
            c0215m.write((byte) (j2 >>> 16));
            c0215m.write((byte) (j2 >>> 24));
            c0215m.write((byte) (j2 >>> 32));
            c0215m.write((byte) (j2 >>> 40));
            c0215m.write((byte) (j2 >>> 48));
            c0215m.write((byte) (j2 >>> 56));
            return;
        }
        c0215m.write((byte) (j2 >>> 56));
        c0215m.write((byte) (j2 >>> 48));
        c0215m.write((byte) (j2 >>> 40));
        c0215m.write((byte) (j2 >>> 32));
        c0215m.write((byte) (j2 >>> 24));
        c0215m.write((byte) (j2 >>> 16));
        c0215m.write((byte) (j2 >>> 8));
        c0215m.write((byte) j2);
    }

    public static void j(C0215m c0215m, int i2) {
        if (i2 < 254) {
            c0215m.write(i2);
            return;
        }
        if (i2 > 65535) {
            c0215m.write(255);
            h(c0215m, i2);
            return;
        }
        c0215m.write(254);
        if (f2772b) {
            c0215m.write(i2);
            c0215m.write(i2 >>> 8);
        } else {
            c0215m.write(i2 >>> 8);
            c0215m.write(i2);
        }
    }

    @Override // m0.InterfaceC0212j
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e2 = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return e2;
    }

    @Override // m0.InterfaceC0212j
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        C0215m c0215m = new C0215m();
        k(c0215m, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c0215m.size());
        allocateDirect.put(c0215m.a(), 0, c0215m.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b2, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f2773c;
        int i2 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.FALSE;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(byteBuffer.getInt());
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                return Long.valueOf(byteBuffer.getLong());
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case F.k.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d2 = d(byteBuffer);
                int[] iArr = new int[d2];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((d2 * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int d3 = d(byteBuffer);
                long[] jArr = new long[d3];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d3 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int d4 = d(byteBuffer);
                double[] dArr = new double[d4];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d4 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int d5 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d5);
                while (i2 < d5) {
                    arrayList.add(e(byteBuffer));
                    i2++;
                }
                return arrayList;
            case 13:
                int d6 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i2 < d6) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i2++;
                }
                return hashMap;
            case 14:
                int d7 = d(byteBuffer);
                float[] fArr = new float[d7];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d7 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(C0215m c0215m, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            c0215m.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            c0215m.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z2 = obj instanceof Number;
        Charset charset = f2773c;
        if (z2) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                c0215m.write(3);
                h(c0215m, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                c0215m.write(4);
                i(c0215m, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                c0215m.write(6);
                g(c0215m, 8);
                i(c0215m, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                c0215m.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(c0215m, bytes.length);
                c0215m.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            c0215m.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(c0215m, bytes2.length);
            c0215m.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            c0215m.write(8);
            byte[] bArr = (byte[]) obj;
            j(c0215m, bArr.length);
            c0215m.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            c0215m.write(9);
            int[] iArr = (int[]) obj;
            j(c0215m, iArr.length);
            g(c0215m, 4);
            int length = iArr.length;
            while (i2 < length) {
                h(c0215m, iArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof long[]) {
            c0215m.write(10);
            long[] jArr = (long[]) obj;
            j(c0215m, jArr.length);
            g(c0215m, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                i(c0215m, jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            c0215m.write(11);
            double[] dArr = (double[]) obj;
            j(c0215m, dArr.length);
            g(c0215m, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                i(c0215m, Double.doubleToLongBits(dArr[i2]));
                i2++;
            }
            return;
        }
        if (obj instanceof List) {
            c0215m.write(12);
            List list = (List) obj;
            j(c0215m, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(c0215m, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            c0215m.write(13);
            Map map = (Map) obj;
            j(c0215m, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(c0215m, entry.getKey());
                k(c0215m, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        c0215m.write(14);
        float[] fArr = (float[]) obj;
        j(c0215m, fArr.length);
        g(c0215m, 4);
        int length4 = fArr.length;
        while (i2 < length4) {
            h(c0215m, Float.floatToIntBits(fArr[i2]));
            i2++;
        }
    }
}
