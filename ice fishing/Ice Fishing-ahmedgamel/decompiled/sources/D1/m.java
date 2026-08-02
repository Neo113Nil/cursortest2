package D1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2964aq;
import com.google.android.gms.internal.ads.Wv;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import u1.InterfaceC5065d;

/* loaded from: classes.dex */
public final class m implements InterfaceC5065d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f548a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f549b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f550c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(l lVar, C2964aq c2964aq) {
        try {
            int h3 = lVar.h();
            if ((h3 & 65496) == 65496 || h3 == 19789 || h3 == 18761) {
                int k9 = k(lVar, 225);
                if (k9 != -1) {
                    byte[] bArr = (byte[]) c2964aq.f(k9, byte[].class);
                    try {
                        return l(lVar, bArr, k9);
                    } finally {
                        c2964aq.k(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + h3);
                return -1;
            }
        } catch (k unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(l lVar) {
        try {
            int h3 = lVar.h();
            if (h3 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int q8 = (h3 << 8) | lVar.q();
            if (q8 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int q9 = (q8 << 8) | lVar.q();
            if (q9 == -1991225785) {
                lVar.p(21L);
                try {
                    return lVar.q() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (k unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (q9 == 1380533830) {
                lVar.p(4L);
                if (((lVar.h() << 16) | lVar.h()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int h9 = (lVar.h() << 16) | lVar.h();
                if ((h9 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = h9 & com.anythink.basead.exoplayer.k.p.f9259b;
                if (i == 88) {
                    lVar.p(4L);
                    short q10 = lVar.q();
                    return (q10 & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (q10 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                lVar.p(4L);
                return (lVar.q() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((lVar.h() << 16) | lVar.h()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int h10 = (lVar.h() << 16) | lVar.h();
            if (h10 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i4 = 0;
            boolean z6 = h10 == 1635150182;
            lVar.p(4L);
            int i6 = q9 - 16;
            if (i6 % 4 == 0) {
                while (i4 < 5 && i6 > 0) {
                    int h11 = (lVar.h() << 16) | lVar.h();
                    if (h11 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (h11 == 1635150182) {
                        z6 = true;
                    }
                    i4++;
                    i6 -= 4;
                }
            }
            return z6 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (k unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(l lVar, C2964aq c2964aq) {
        boolean j6;
        if (h(lVar) == ImageHeaderParser$ImageType.JPEG) {
            int k9 = k(lVar, 226);
            while (k9 > 0) {
                byte[] bArr = (byte[]) c2964aq.f(k9, byte[].class);
                try {
                    int v9 = lVar.v(k9, bArr);
                    if (v9 != k9) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + k9 + ", actually read: " + v9);
                        }
                        j6 = false;
                    } else {
                        j6 = j(k9, bArr, f549b);
                    }
                    if (j6) {
                        c2964aq.k(bArr);
                        return true;
                    }
                    c2964aq.k(bArr);
                    k9 = k(lVar, 226);
                } catch (Throwable th) {
                    c2964aq.k(bArr);
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
        boolean z6 = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z6) {
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                if (bArr[i4] != bArr2[i4]) {
                    return false;
                }
            }
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(l lVar, int i) {
        while (true) {
            short q8 = lVar.q();
            if (q8 == 255) {
                short q9 = lVar.q();
                if (q9 == 218) {
                    break;
                }
                if (q9 != 217) {
                    int h3 = lVar.h() - 2;
                    if (q9 == i) {
                        return h3;
                    }
                    long j6 = h3;
                    long p9 = lVar.p(j6);
                    if (p9 != j6) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder j9 = Wv.j(q9, h3, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                            j9.append(p9);
                            Log.d("DfltImageHeaderParser", j9.toString());
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) q8));
                return -1;
            }
        }
    }

    public static int l(l lVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int v9 = lVar.v(i, bArr);
        if (v9 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + v9);
                return -1;
            }
        } else if (j(i, bArr, f548a)) {
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
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i6 = i4 + 6;
            short s10 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
            for (int i9 = 0; i9 < s10; i9++) {
                int i10 = (i9 * 12) + i4 + 8;
                short s11 = byteBuffer.remaining() - i10 >= 2 ? byteBuffer.getShort(i10) : (short) -1;
                if (s11 == 274) {
                    int i11 = i10 + 2;
                    short s12 = byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : (short) -1;
                    if (s12 >= 1 && s12 <= 12) {
                        int i12 = i10 + 4;
                        int i13 = byteBuffer.remaining() - i12 >= 4 ? byteBuffer.getInt(i12) : -1;
                        if (i13 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder j6 = Wv.j(i9, s11, "Got tagIndex=", " tagType=", " formatCode=");
                                j6.append((int) s12);
                                j6.append(" componentCount=");
                                j6.append(i13);
                                Log.d("DfltImageHeaderParser", j6.toString());
                            }
                            int i14 = i13 + f550c[s12];
                            if (i14 <= 4) {
                                int i15 = i10 + 8;
                                if (i15 >= 0 && i15 <= byteBuffer.remaining()) {
                                    if (i14 >= 0 && i14 + i15 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i15 >= 2) {
                                            return byteBuffer.getShort(i15);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s11));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i15 + " tagType=" + ((int) s11));
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

    @Override // u1.InterfaceC5065d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        P1.g.c(byteBuffer, "Argument must not be null");
        return h(new j(0, byteBuffer));
    }

    @Override // u1.InterfaceC5065d
    public final int b(InputStream inputStream, C2964aq c2964aq) {
        n4.c cVar = new n4.c(4, inputStream);
        P1.g.c(c2964aq, "Argument must not be null");
        return g(cVar, c2964aq);
    }

    @Override // u1.InterfaceC5065d
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return h(new n4.c(4, inputStream));
    }

    @Override // u1.InterfaceC5065d
    public final boolean d(InputStream inputStream, C2964aq c2964aq) {
        P1.g.c(inputStream, "Argument must not be null");
        n4.c cVar = new n4.c(4, inputStream);
        P1.g.c(c2964aq, "Argument must not be null");
        return i(cVar, c2964aq);
    }

    @Override // u1.InterfaceC5065d
    public final boolean e(ByteBuffer byteBuffer, C2964aq c2964aq) {
        j jVar = new j(0, byteBuffer);
        P1.g.c(c2964aq, "Argument must not be null");
        return i(jVar, c2964aq);
    }

    @Override // u1.InterfaceC5065d
    public final int f(ByteBuffer byteBuffer, C2964aq c2964aq) {
        j jVar = new j(0, byteBuffer);
        P1.g.c(c2964aq, "Argument must not be null");
        return g(jVar, c2964aq);
    }
}
