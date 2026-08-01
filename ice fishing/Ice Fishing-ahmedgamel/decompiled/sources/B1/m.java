package B1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2941aq;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import s1.InterfaceC4969d;

/* loaded from: classes.dex */
public final class m implements InterfaceC4969d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f134a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f135b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f136c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(l lVar, C2941aq c2941aq) {
        try {
            int d2 = lVar.d();
            if ((d2 & 65496) == 65496 || d2 == 19789 || d2 == 18761) {
                int k9 = k(lVar, 225);
                if (k9 != -1) {
                    byte[] bArr = (byte[]) c2941aq.f(k9, byte[].class);
                    try {
                        return l(lVar, bArr, k9);
                    } finally {
                        c2941aq.k(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + d2);
                return -1;
            }
        } catch (k unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(l lVar) {
        try {
            int d2 = lVar.d();
            if (d2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int j6 = (d2 << 8) | lVar.j();
            if (j6 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int j9 = (j6 << 8) | lVar.j();
            if (j9 == -1991225785) {
                lVar.e(21L);
                try {
                    return lVar.j() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (k unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (j9 == 1380533830) {
                lVar.e(4L);
                if (((lVar.d() << 16) | lVar.d()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int d9 = (lVar.d() << 16) | lVar.d();
                if ((d9 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = d9 & com.anythink.basead.exoplayer.k.p.f8473b;
                if (i == 88) {
                    lVar.e(4L);
                    short j10 = lVar.j();
                    return (j10 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (j10 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                lVar.e(4L);
                return (lVar.j() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((lVar.d() << 16) | lVar.d()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int d10 = (lVar.d() << 16) | lVar.d();
            if (d10 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i6 = 0;
            boolean z3 = d10 == 1635150182;
            lVar.e(4L);
            int i9 = j9 - 16;
            if (i9 % 4 == 0) {
                while (i6 < 5 && i9 > 0) {
                    int d11 = (lVar.d() << 16) | lVar.d();
                    if (d11 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (d11 == 1635150182) {
                        z3 = true;
                    }
                    i6++;
                    i9 -= 4;
                }
            }
            return z3 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (k unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(l lVar, C2941aq c2941aq) {
        boolean j6;
        if (h(lVar) == ImageHeaderParser$ImageType.JPEG) {
            int k9 = k(lVar, 226);
            while (k9 > 0) {
                byte[] bArr = (byte[]) c2941aq.f(k9, byte[].class);
                try {
                    int k10 = lVar.k(k9, bArr);
                    if (k10 != k9) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + k9 + ", actually read: " + k10);
                        }
                        j6 = false;
                    } else {
                        j6 = j(k9, bArr, f135b);
                    }
                    if (j6) {
                        c2941aq.k(bArr);
                        return true;
                    }
                    c2941aq.k(bArr);
                    k9 = k(lVar, 226);
                } catch (Throwable th) {
                    c2941aq.k(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean j(int i, byte[] bArr, byte[] bArr2) {
        boolean z3 = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z3) {
            for (int i6 = 0; i6 < bArr2.length; i6++) {
                if (bArr[i6] != bArr2[i6]) {
                    return false;
                }
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(l lVar, int i) {
        while (true) {
            short j6 = lVar.j();
            if (j6 == 255) {
                short j9 = lVar.j();
                if (j9 == 218) {
                    break;
                }
                if (j9 != 217) {
                    int d2 = lVar.d() - 2;
                    if (j9 == i) {
                        return d2;
                    }
                    long j10 = d2;
                    long e9 = lVar.e(j10);
                    if (e9 != j10) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder h9 = AbstractC4404f.h(j9, d2, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                            h9.append(e9);
                            Log.d("DfltImageHeaderParser", h9.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) j6));
                return -1;
            }
        }
    }

    public static int l(l lVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int k9 = lVar.k(i, bArr);
        if (k9 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + k9);
                return -1;
            }
        } else if (j(i, bArr, f134a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s9 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s9 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (s9 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s9));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i6 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i9 = i6 + 6;
            short s10 = byteBuffer.remaining() - i9 >= 2 ? byteBuffer.getShort(i9) : (short) -1;
            for (int i10 = 0; i10 < s10; i10++) {
                int i11 = (i10 * 12) + i6 + 8;
                short s11 = byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : (short) -1;
                if (s11 == 274) {
                    int i12 = i11 + 2;
                    short s12 = byteBuffer.remaining() - i12 >= 2 ? byteBuffer.getShort(i12) : (short) -1;
                    if (s12 >= 1 && s12 <= 12) {
                        int i13 = i11 + 4;
                        int i14 = byteBuffer.remaining() - i13 >= 4 ? byteBuffer.getInt(i13) : -1;
                        if (i14 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder h9 = AbstractC4404f.h(i10, s11, "Got tagIndex=", " tagType=", " formatCode=");
                                h9.append((int) s12);
                                h9.append(" componentCount=");
                                h9.append(i14);
                                Log.d("DfltImageHeaderParser", h9.toString());
                            }
                            int i15 = i14 + f136c[s12];
                            if (i15 <= 4) {
                                int i16 = i11 + 8;
                                if (i16 >= 0 && i16 <= byteBuffer.remaining()) {
                                    if (i15 >= 0 && i15 + i16 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i16 >= 2) {
                                            return byteBuffer.getShort(i16);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s11));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i16 + " tagType=" + ((int) s11));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s12));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s12));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // s1.InterfaceC4969d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        N1.g.c(byteBuffer, "Argument must not be null");
        return h(new j(0, byteBuffer));
    }

    @Override // s1.InterfaceC4969d
    public final int b(InputStream inputStream, C2941aq c2941aq) {
        I0.j jVar = new I0.j(2, inputStream);
        N1.g.c(c2941aq, "Argument must not be null");
        return g(jVar, c2941aq);
    }

    @Override // s1.InterfaceC4969d
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return h(new I0.j(2, inputStream));
    }

    @Override // s1.InterfaceC4969d
    public final boolean d(InputStream inputStream, C2941aq c2941aq) {
        N1.g.c(inputStream, "Argument must not be null");
        I0.j jVar = new I0.j(2, inputStream);
        N1.g.c(c2941aq, "Argument must not be null");
        return i(jVar, c2941aq);
    }

    @Override // s1.InterfaceC4969d
    public final boolean e(ByteBuffer byteBuffer, C2941aq c2941aq) {
        j jVar = new j(0, byteBuffer);
        N1.g.c(c2941aq, "Argument must not be null");
        return i(jVar, c2941aq);
    }

    @Override // s1.InterfaceC4969d
    public final int f(ByteBuffer byteBuffer, C2941aq c2941aq) {
        j jVar = new j(0, byteBuffer);
        N1.g.c(c2941aq, "Argument must not be null");
        return g(jVar, c2941aq);
    }
}
