package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class d85 {
    public static final long b = c3x.h(4278190080L);
    public static final long c = c3x.h(4282664004L);
    public static final long d = c3x.h(4287137928L);
    public static final long e = c3x.h(4291611852L);
    public static final long f = c3x.h(4294967295L);
    public static final long g = c3x.h(4294901760L);
    public static final long h = c3x.h(4278255360L);
    public static final long i = c3x.h(4278190335L);
    public static final long j = c3x.h(4294967040L);
    public static final long k = c3x.h(4278255615L);
    public static final long l = c3x.h(4294902015L);
    public static final long m = c3x.f(0);
    public static final long n;
    public static final /* synthetic */ int o = 0;
    public final long a;

    static {
        float[] fArr = n95.a;
        n = c3x.e(0.0f, 0.0f, 0.0f, 0.0f, n95.u);
    }

    public /* synthetic */ d85(long j2) {
        this.a = j2;
    }

    public static final long a(long j2, l95 l95Var) {
        z76 z76Var;
        l95 f2 = f(j2);
        int i2 = f2.c;
        int i3 = l95Var.c;
        if ((i2 | i3) < 0) {
            z76Var = zsd.W(f2, l95Var);
        } else {
            soi soiVar = a86.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = soiVar.b(i4);
            if (b2 == null) {
                b2 = zsd.W(f2, l95Var);
                soiVar.h(i4, b2);
            }
            z76Var = (z76) b2;
        }
        return z76Var.a(j2);
    }

    public static long b(long j2, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = d(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = h(j2);
        }
        if ((i2 & 4) != 0) {
            f4 = g(j2);
        }
        if ((i2 & 8) != 0) {
            f5 = e(j2);
        }
        return c3x.e(f3, f4, f5, f2, f(j2));
    }

    public static final boolean c(long j2, long j3) {
        met metVar = net.b;
        return j2 == j3;
    }

    public static final float d(long j2) {
        float u0;
        float f2;
        long j3 = 63 & j2;
        met metVar = net.b;
        if (j3 == 0) {
            u0 = (float) szf.u0((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            u0 = (float) szf.u0((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return u0 / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        met metVar = net.b;
        if (j3 == 0) {
            return ((float) szf.u0((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = KotlinVersion.MAX_COMPONENT_VALUE;
                if (i8 != 0) {
                    i8 |= RemoteCameraConfig.Camera.BITRATE;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - pic.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final l95 f(long j2) {
        float[] fArr = n95.a;
        met metVar = net.b;
        return n95.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        met metVar = net.b;
        if (j3 == 0) {
            return ((float) szf.u0((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = KotlinVersion.MAX_COMPONENT_VALUE;
                if (i8 != 0) {
                    i8 |= RemoteCameraConfig.Camera.BITRATE;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - pic.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        met metVar = net.b;
        if (j3 == 0) {
            return ((float) szf.u0((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = KotlinVersion.MAX_COMPONENT_VALUE;
                if (i8 != 0) {
                    i8 |= RemoteCameraConfig.Camera.BITRATE;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - pic.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return dfi.i(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d85) {
            return this.a == ((d85) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        met metVar = net.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
