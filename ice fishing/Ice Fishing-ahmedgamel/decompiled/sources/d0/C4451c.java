package d0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import w.AbstractC5128c;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4451c {

    /* renamed from: a, reason: collision with root package name */
    public final int f37126a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37127b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37128c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f37129d;

    public C4451c(byte[] bArr, int i, int i4) {
        this(-1L, bArr, i, i4);
    }

    public static C4451c a(long j6, ByteOrder byteOrder) {
        long[] jArr = {j6};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C4455g.f37138C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C4451c(wrap.array(), 4, 1);
    }

    public static C4451c b(C4453e c4453e, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C4455g.f37138C[5]]);
        wrap.order(byteOrder);
        C4453e c4453e2 = new C4453e[]{c4453e}[0];
        wrap.putInt((int) c4453e2.f37134a);
        wrap.putInt((int) c4453e2.f37135b);
        return new C4451c(wrap.array(), 5, 1);
    }

    public static C4451c c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C4455g.f37138C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new C4451c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g9 instanceof String) {
            return Double.parseDouble((String) g9);
        }
        if (g9 instanceof long[]) {
            if (((long[]) g9).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g9 instanceof int[]) {
            if (((int[]) g9).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g9 instanceof double[]) {
            double[] dArr = (double[]) g9;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g9 instanceof C4453e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C4453e[] c4453eArr = (C4453e[]) g9;
        if (c4453eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C4453e c4453e = c4453eArr[0];
        return c4453e.f37134a / c4453e.f37135b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g9 instanceof String) {
            return Integer.parseInt((String) g9);
        }
        if (g9 instanceof long[]) {
            long[] jArr = (long[]) g9;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g9 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g9;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 == null) {
            return null;
        }
        if (g9 instanceof String) {
            return (String) g9;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g9 instanceof long[]) {
            long[] jArr = (long[]) g9;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g9 instanceof int[]) {
            int[] iArr = (int[]) g9;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g9 instanceof double[]) {
            double[] dArr = (double[]) g9;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g9 instanceof C4453e[])) {
            return null;
        }
        C4453e[] c4453eArr = (C4453e[]) g9;
        while (i < c4453eArr.length) {
            sb.append(c4453eArr[i].f37134a);
            sb.append('/');
            sb.append(c4453eArr[i].f37135b);
            i++;
            if (i != c4453eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:162:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [d0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [d0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        C4450b c4450b;
        InputStream inputStream;
        byte b9;
        String sb;
        int i = 0;
        byte[] bArr = this.f37129d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    c4450b = new C4450b(bArr);
                    try {
                        c4450b.f37123u = byteOrder;
                        int i4 = this.f37126a;
                        int i6 = this.f37127b;
                        switch (i4) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b9 = bArr[0]) < 0 || b9 > 1) {
                                    String str = new String(bArr, C4455g.f37146L);
                                    try {
                                        c4450b.close();
                                        return str;
                                    } catch (IOException e9) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b9 + 48)});
                                try {
                                    c4450b.close();
                                    return str2;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i6 >= C4455g.f37139D.length) {
                                    int i9 = 0;
                                    while (true) {
                                        byte[] bArr2 = C4455g.f37139D;
                                        if (i9 >= bArr2.length) {
                                            i = bArr2.length;
                                        } else if (bArr[i9] == bArr2[i9]) {
                                            i9++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    while (i < i6) {
                                        byte b10 = bArr[i];
                                        if (b10 == 0) {
                                            sb = sb2.toString();
                                            c4450b.close();
                                            return sb;
                                        }
                                        if (b10 >= 32) {
                                            sb2.append((char) b10);
                                        } else {
                                            sb2.append('?');
                                        }
                                        i++;
                                    }
                                    c4450b.close();
                                    return sb;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return sb;
                                }
                                sb = sb2.toString();
                            case 3:
                                ?? r15 = new int[i6];
                                while (i < i6) {
                                    r15[i] = c4450b.readUnsignedShort();
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r15;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r15;
                                }
                            case 4:
                                ?? r152 = new long[i6];
                                while (i < i6) {
                                    r152[i] = c4450b.readInt() & 4294967295L;
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r152;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r152;
                                }
                            case 5:
                                ?? r153 = new C4453e[i6];
                                while (i < i6) {
                                    r153[i] = new C4453e(c4450b.readInt() & 4294967295L, c4450b.readInt() & 4294967295L);
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r153;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return r153;
                                }
                            case 8:
                                ?? r154 = new int[i6];
                                while (i < i6) {
                                    r154[i] = c4450b.readShort();
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r154;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return r154;
                                }
                            case 9:
                                ?? r155 = new int[i6];
                                while (i < i6) {
                                    r155[i] = c4450b.readInt();
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r155;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return r155;
                                }
                            case 10:
                                ?? r156 = new C4453e[i6];
                                while (i < i6) {
                                    r156[i] = new C4453e(c4450b.readInt(), c4450b.readInt());
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r156;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                    return r156;
                                }
                            case 11:
                                ?? r157 = new double[i6];
                                while (i < i6) {
                                    r157[i] = c4450b.readFloat();
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r157;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                    return r157;
                                }
                            case 12:
                                ?? r158 = new double[i6];
                                while (i < i6) {
                                    r158[i] = c4450b.readDouble();
                                    i++;
                                }
                                try {
                                    c4450b.close();
                                    return r158;
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                    return r158;
                                }
                            default:
                                c4450b.close();
                                return null;
                        }
                    } catch (IOException e20) {
                        e = e20;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (c4450b != null) {
                            c4450b.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e21) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                        }
                    }
                    throw th;
                }
            } catch (IOException e22) {
                e = e22;
                c4450b = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        } catch (IOException e23) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C4455g.f37137B[this.f37126a]);
        sb.append(", data length:");
        return AbstractC5128c.e(this.f37129d.length, ")", sb);
    }

    public C4451c(long j6, byte[] bArr, int i, int i4) {
        this.f37126a = i;
        this.f37127b = i4;
        this.f37128c = j6;
        this.f37129d = bArr;
    }
}
