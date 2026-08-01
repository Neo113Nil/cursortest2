package d0;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4436c {

    /* renamed from: a, reason: collision with root package name */
    public final int f36973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36974b;

    /* renamed from: c, reason: collision with root package name */
    public final long f36975c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f36976d;

    public C4436c(byte[] bArr, int i, int i6) {
        this(-1L, bArr, i, i6);
    }

    public static C4436c a(long j6, ByteOrder byteOrder) {
        long[] jArr = {j6};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C4440g.f36985C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C4436c(wrap.array(), 4, 1);
    }

    public static C4436c b(C4438e c4438e, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C4440g.f36985C[5]]);
        wrap.order(byteOrder);
        C4438e c4438e2 = new C4438e[]{c4438e}[0];
        wrap.putInt((int) c4438e2.f36981a);
        wrap.putInt((int) c4438e2.f36982b);
        return new C4436c(wrap.array(), 5, 1);
    }

    public static C4436c c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C4440g.f36985C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new C4436c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g4 instanceof String) {
            return Double.parseDouble((String) g4);
        }
        if (g4 instanceof long[]) {
            if (((long[]) g4).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof int[]) {
            if (((int[]) g4).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof C4438e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C4438e[] c4438eArr = (C4438e[]) g4;
        if (c4438eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C4438e c4438e = c4438eArr[0];
        return c4438e.f36981a / c4438e.f36982b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g4 instanceof String) {
            return Integer.parseInt((String) g4);
        }
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g4 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g4;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g4 = g(byteOrder);
        if (g4 == null) {
            return null;
        }
        if (g4 instanceof String) {
            return (String) g4;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g4 instanceof long[]) {
            long[] jArr = (long[]) g4;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g4 instanceof int[]) {
            int[] iArr = (int[]) g4;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (g4 instanceof double[]) {
            double[] dArr = (double[]) g4;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(g4 instanceof C4438e[])) {
            return null;
        }
        C4438e[] c4438eArr = (C4438e[]) g4;
        while (i < c4438eArr.length) {
            sb.append(c4438eArr[i].f36981a);
            sb.append('/');
            sb.append(c4438eArr[i].f36982b);
            i++;
            if (i != c4438eArr.length) {
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
        C4435b c4435b;
        InputStream inputStream;
        byte b9;
        String sb;
        int i = 0;
        byte[] bArr = this.f36976d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    c4435b = new C4435b(bArr);
                    try {
                        c4435b.f36970u = byteOrder;
                        int i6 = this.f36973a;
                        int i9 = this.f36974b;
                        switch (i6) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b9 = bArr[0]) < 0 || b9 > 1) {
                                    String str = new String(bArr, C4440g.f36993L);
                                    try {
                                        c4435b.close();
                                        return str;
                                    } catch (IOException e9) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b9 + 48)});
                                try {
                                    c4435b.close();
                                    return str2;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i9 >= C4440g.f36986D.length) {
                                    int i10 = 0;
                                    while (true) {
                                        byte[] bArr2 = C4440g.f36986D;
                                        if (i10 >= bArr2.length) {
                                            i = bArr2.length;
                                        } else if (bArr[i10] == bArr2[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    while (i < i9) {
                                        byte b10 = bArr[i];
                                        if (b10 == 0) {
                                            sb = sb2.toString();
                                            c4435b.close();
                                            return sb;
                                        }
                                        if (b10 >= 32) {
                                            sb2.append((char) b10);
                                        } else {
                                            sb2.append('?');
                                        }
                                        i++;
                                    }
                                    c4435b.close();
                                    return sb;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return sb;
                                }
                                sb = sb2.toString();
                            case 3:
                                ?? r15 = new int[i9];
                                while (i < i9) {
                                    r15[i] = c4435b.readUnsignedShort();
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r15;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r15;
                                }
                            case 4:
                                ?? r152 = new long[i9];
                                while (i < i9) {
                                    r152[i] = c4435b.readInt() & 4294967295L;
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r152;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r152;
                                }
                            case 5:
                                ?? r153 = new C4438e[i9];
                                while (i < i9) {
                                    r153[i] = new C4438e(c4435b.readInt() & 4294967295L, c4435b.readInt() & 4294967295L);
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r153;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return r153;
                                }
                            case 8:
                                ?? r154 = new int[i9];
                                while (i < i9) {
                                    r154[i] = c4435b.readShort();
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r154;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return r154;
                                }
                            case 9:
                                ?? r155 = new int[i9];
                                while (i < i9) {
                                    r155[i] = c4435b.readInt();
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r155;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return r155;
                                }
                            case 10:
                                ?? r156 = new C4438e[i9];
                                while (i < i9) {
                                    r156[i] = new C4438e(c4435b.readInt(), c4435b.readInt());
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r156;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                    return r156;
                                }
                            case 11:
                                ?? r157 = new double[i9];
                                while (i < i9) {
                                    r157[i] = c4435b.readFloat();
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r157;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                    return r157;
                                }
                            case 12:
                                ?? r158 = new double[i9];
                                while (i < i9) {
                                    r158[i] = c4435b.readDouble();
                                    i++;
                                }
                                try {
                                    c4435b.close();
                                    return r158;
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                    return r158;
                                }
                            default:
                                c4435b.close();
                                return null;
                        }
                    } catch (IOException e20) {
                        e = e20;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (c4435b != null) {
                            c4435b.close();
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
                c4435b = null;
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
        sb.append(C4440g.f36984B[this.f36973a]);
        sb.append(", data length:");
        return u1.h.e(this.f36976d.length, ")", sb);
    }

    public C4436c(long j6, byte[] bArr, int i, int i6) {
        this.f36973a = i;
        this.f36974b = i6;
        this.f36975c = j6;
        this.f36976d = bArr;
    }
}
