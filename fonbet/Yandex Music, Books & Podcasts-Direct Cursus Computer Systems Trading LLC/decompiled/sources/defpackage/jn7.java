package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class jn7 implements rbe {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(in7 in7Var, z98 z98Var) {
        try {
            int h = in7Var.h();
            if ((h & 65496) == 65496 || h == 19789 || h == 18761) {
                int g = g(in7Var);
                if (g != -1) {
                    byte[] bArr = (byte[]) z98Var.f(g, byte[].class);
                    try {
                        return h(in7Var, bArr, g);
                    } finally {
                        z98Var.l(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + h);
                return -1;
            }
        } catch (hn7 unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType f(in7 in7Var) {
        try {
            int h = in7Var.h();
            if (h == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int J = (h << 8) | in7Var.J();
            if (J == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int J2 = (J << 8) | in7Var.J();
            if (J2 == -1991225785) {
                in7Var.skip(21L);
                try {
                    return in7Var.J() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (hn7 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (J2 == 1380533830) {
                in7Var.skip(4L);
                if (((in7Var.h() << 16) | in7Var.h()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int h2 = (in7Var.h() << 16) | in7Var.h();
                if ((h2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = h2 & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i == 88) {
                    in7Var.skip(4L);
                    short J3 = in7Var.J();
                    return (J3 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (J3 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                in7Var.skip(4L);
                return (in7Var.J() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((in7Var.h() << 16) | in7Var.h()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int h3 = (in7Var.h() << 16) | in7Var.h();
            if (h3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = h3 == 1635150182;
            in7Var.skip(4L);
            int i3 = J2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int h4 = (in7Var.h() << 16) | in7Var.h();
                    if (h4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (h4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (hn7 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(in7 in7Var) {
        while (true) {
            short J = in7Var.J();
            if (J == 255) {
                short J2 = in7Var.J();
                if (J2 == 218) {
                    break;
                }
                if (J2 != 217) {
                    int h = in7Var.h() - 2;
                    if (J2 == 225) {
                        return h;
                    }
                    long j = h;
                    long skip = in7Var.skip(j);
                    if (skip != j) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder l = dfi.l("Unable to skip enough data, type: ", J2, h, ", wanted to skip: ", ", but actually skipped: ");
                            l.append(skip);
                            Log.d("DfltImageHeaderParser", l.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) J));
                return -1;
            }
        }
    }

    public static int h(in7 in7Var, byte[] bArr, int i) {
        ByteOrder byteOrder;
        short s;
        int s2 = in7Var.s(i, bArr);
        short s3 = -1;
        if (s2 == i) {
            int i2 = 0;
            byte[] bArr2 = a;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i3 = 0;
                while (true) {
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i3] != bArr2[i3]) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s4 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s4 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (s4 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s4));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s5 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            while (i2 < s5) {
                int i6 = (i2 * 12) + i4 + 8;
                short s6 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : s3;
                if (s6 == 274) {
                    int i7 = i6 + 2;
                    short s7 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : s3;
                    if (s7 < 1 || s7 > 12) {
                        s = s3;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s7));
                        }
                    } else {
                        int i8 = i6 + 4;
                        int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : s3;
                        if (i9 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                s = s3;
                                StringBuilder l = dfi.l("Got tagIndex=", i2, s6, " tagType=", " formatCode=");
                                l.append((int) s7);
                                l.append(" componentCount=");
                                l.append(i9);
                                Log.d("DfltImageHeaderParser", l.toString());
                            } else {
                                s = s3;
                            }
                            int i10 = i9 + b[s7];
                            if (i10 <= 4) {
                                int i11 = i6 + 8;
                                if (i11 < 0 || i11 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i11 + " tagType=" + ((int) s6));
                                    }
                                } else {
                                    if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : s;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s6));
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s7));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    }
                    i2++;
                    s3 = s;
                }
                s = s3;
                i2++;
                s3 = s;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + s2);
            return -1;
        }
        return s3;
    }

    @Override // defpackage.rbe
    public final int a(InputStream inputStream, z98 z98Var) {
        xzi xziVar = new xzi(inputStream);
        w1g.s(z98Var, "Argument must not be null");
        return e(xziVar, z98Var);
    }

    @Override // defpackage.rbe
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        w1g.s(byteBuffer, "Argument must not be null");
        return f(new rm3(1, byteBuffer));
    }

    @Override // defpackage.rbe
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return f(new xzi(inputStream));
    }

    @Override // defpackage.rbe
    public final int d(ByteBuffer byteBuffer, z98 z98Var) {
        rm3 rm3Var = new rm3(1, byteBuffer);
        w1g.s(z98Var, "Argument must not be null");
        return e(rm3Var, z98Var);
    }
}
