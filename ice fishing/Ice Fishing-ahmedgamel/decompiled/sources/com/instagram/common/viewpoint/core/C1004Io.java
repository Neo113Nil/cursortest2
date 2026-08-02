package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1004Io {
    public static byte[] A0p;
    public static String[] A0q = {"OEIbbTfz9Gy2QPZJ4z5Vw", "FnBQgCqHaiwiLpzppV61TScSRwvWWbyQ", "lhw151GRabUj4MWW", "UfmG6su3PUQ09WKpaYJZnWqY2jTnsIjF", "3xkcsKvZQCBLKFsErtBjnZACEf0cQH4k", "sFlP3vQMUMetLm2UJmahj", "kHqDQLP2yFWUZolGjug5L", "bkJ1oyWHbNg3F4t8gWvtnFc1AhojVjRe"};
    public int A0I;
    public int A0N;
    public int A0Q;
    public int A0R;
    public int A0V;
    public DrmInitData A0Z;
    public C0965Hb A0a;
    public InterfaceC0967Hd A0b;
    public C0968He A0c;
    public String A0d;
    public String A0e;
    public boolean A0g;
    public boolean A0i;
    public byte[] A0j;
    public byte[] A0k;
    public byte[] A0m;
    public int A0n;
    public int A0W = -1;
    public int A0M = -1;
    public int A0L = -1;
    public int A0J = -1;
    public int A0K = 0;
    public int A0S = -1;
    public float A0A = 0.0f;
    public float A08 = 0.0f;
    public float A09 = 0.0f;
    public byte[] A0l = null;
    public int A0U = -1;
    public boolean A0h = false;
    public int A0G = -1;
    public int A0H = -1;
    public int A0F = -1;
    public int A0O = 1000;
    public int A0P = 200;
    public float A06 = -1.0f;
    public float A07 = -1.0f;
    public float A04 = -1.0f;
    public float A05 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A0B = -1.0f;
    public float A0C = -1.0f;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public int A0E = 1;
    public int A0D = -1;
    public int A0T = 8000;
    public long A0X = 0;
    public long A0Y = 0;
    public boolean A0f = true;
    public String A0o = A03(1067, 3, 26);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<String, List<byte[]>> A02(C06674v c06674v) throws C3K {
        try {
            c06674v.A0g(16);
            long A0O = c06674v.A0O();
            if (A0O == 1482049860) {
                return new Pair<>(A03(1117, 10, 32), null);
            }
            if (A0O == 859189832) {
                return new Pair<>(A03(1088, 10, 2), null);
            }
            if (A0q[1].charAt(11) != 'i') {
                throw new RuntimeException();
            }
            A0q[2] = "JoNevXQ";
            if (A0O != 826496599) {
                AbstractC06524g.A07(A03(312, 17, 46), A03(492, 51, 65));
                return new Pair<>(A03(1189, 15, 45), null);
            }
            byte[] A0l = c06674v.A0l();
            for (int A09 = c06674v.A09() + 20; A09 < A0l.length - 4; A09++) {
                if (A0l[A09] == 0 && A0l[A09 + 1] == 0 && A0l[A09 + 2] == 1 && A0l[A09 + 3] == 15) {
                    return new Pair<>(A03(1179, 10, 80), Collections.singletonList(Arrays.copyOfRange(A0l, A09, A0l.length)));
                }
            }
            throw C3K.A01(A03(267, 45, 108), null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C3K.A01(A03(166, 33, 80), null);
        }
    }

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0p = new byte[]{13, -1, 50, 68, 83, 83, 72, 77, 70, -1, 76, 72, 76, 68, 51, 88, 79, 68, -1, 83, 78, -1, -47, -17, -47, -47, -45, -43, -13, -43, -41, -57, -2, 28, 1, 17, 16, 47, 77, 50, 66, 65, 29, 51, 70, 62, c.f17104b, 51, 65, 65, -6, 24, -3, 13, 12, -24, 5, 8, 12, 12, 5, -2, 12, 12, 0, 30, 4, 0, 2, -14, 22, 52, 27, 33, 22, 24, 9, 39, 21, 24, 13, 15, -9, 20, -6, -59, -29, -47, -44, -55, -53, -77, -48, -73, 3, 33, 15, 21, -15, 3, 5, 15, -13, 17, 1, 2, 7, 5, -18, 12, -3, -16, -6, -36, -13, -7, -4, -18, 1, -36, -10, -14, -14, -14, 19, 49, 34, 21, 31, 1, 27, 32, 38, 1, 20, 27, 25, -34, -4, -19, -32, -22, -52, -26, -21, -15, -52, -23, -26, -15, 59, 89, 78, 76, 79, c.f17105c, 66, 62, 23, 53, 44, 37, 40, 24, 31, 41, 18, c.f17105c, c.f17105c, 60, c.f17105c, -19, 61, 46, c.f17105c, c.f17104b, 54, 59, 52, -19, 19, 60, 66, c.f17105c, 16, 16, -19, 61, c.f17105c, 54, 67, 46, 65, 50, -19, 49, 46, 65, 46, -4, 41, 41, 38, 41, -41, 39, 24, 41, 42, 32, 37, 30, -41, 4, 10, -26, -8, -6, 4, -41, 26, 38, 27, 28, 26, -41, 39, 41, 32, 45, 24, 43, 28, -19, 26, 26, 23, 26, -56, 24, 9, 26, 27, 17, 22, 15, -56, 30, 23, 26, 10, 17, 27, -56, 11, 23, 12, 13, 11, -56, 24, 26, 17, 30, 9, 28, 13, 47, 74, 82, 85, 78, 77, 9, 93, 88, 9, 79, 82, 87, 77, 9, 47, 88, 94, 91, 44, 44, 9, c.f17105c, 44, 26, 9, 82, 87, 82, 93, 82, 74, 85, 82, 99, 74, 93, 82, 88, 87, 9, 77, 74, 93, 74, -8, 12, 31, 29, 26, 30, 22, 12, -16, 35, 31, 29, 12, 14, 31, 26, 29, 39, 67, 77, 77, 67, 72, 65, -6, 29, 73, 62, c.f17105c, 61, 42, 76, 67, 80, 59, 78, c.f17105c, -6, c.f17104b, 73, 76, -6, 61, 73, 62, c.f17105c, 61, -6, -35, -2, -3, -68, -33, -46, -36, -81, -36, -30, -66, -48, -46, -36, -81, -8, 2, -81, 4, -3, 2, 4, -1, -1, -2, 1, 3, -12, -13, -67, -81, -30, -12, 3, 3, -8, -3, -10, -81, -4, -8, -4, -12, -29, 8, -1, -12, -81, 3, -2, -81, 3, 15, -12, 6, -14, 3, 5, -14, 78, 90, 67, c.f17105c, 72, 81, 42, 75, 66, 78, 36, 48, 37, 22, 41, 37, 0, 18, 36, 36, 1, 13, 2, -13, 6, 2, -35, 3, 2, -12, -26, 53, 65, 54, 39, 58, 54, 17, 57, 39, 36, 56, 54, 54, 62, 74, 65, 58, 45, 62, c.f17104b, 45, 37, 62, 53, 72, c.f17104b, 53, 51, 68, 53, 52, -16, 29, 25, 29, 21, -16, 68, 73, c.f17104b, 53, -2, 19, 44, 41, 44, 45, 53, 44, -34, 4, 45, 51, 48, 1, 1, -20, -34, 17, 35, 50, 50, 39, 44, 37, -34, 43, 39, 43, 35, 18, 55, 46, 35, -34, 50, 45, -34, 52, 39, 34, 35, 45, -19, 54, -21, 51, 44, 41, 44, 45, 53, 44, 4, 29, 33, 20, 18, 30, 22, 29, 24, 41, 20, 19, -49, 18, 30, 19, 20, 18, -49, 24, 19, 20, 29, 35, 24, 21, 24, 20, 33, -35, 78, 103, 108, 110, 105, 105, 104, 107, 109, 94, 93, 25, 73, 60, 70, 25, 91, 98, 109, 25, 93, 94, 105, 109, 97, 51, 25, 50, 75, 80, 82, 77, 77, 76, 79, 81, 66, 65, -3, c.f17105c, 70, 68, -3, 66, 75, 65, 70, 62, 75, -3, 45, 32, 42, -3, c.f17105c, 70, 81, -3, 65, 66, 77, 81, 69, 23, -3, -8, 17, 22, 24, 19, 19, 18, 21, 23, 8, 7, -61, 9, 15, 18, 4, 23, 12, 17, 10, -61, 19, 18, 12, 17, 23, -61, -13, -26, -16, -61, 5, 12, 23, -61, 7, 8, 19, 23, 11, -35, -61, 55, 80, 85, 87, 82, 82, 81, 84, 86, 71, 70, 2, 78, 75, 86, 86, 78, 71, 2, 71, 80, 70, 75, 67, 80, 2, 50, 37, 47, 2, 68, 75, 86, 2, 70, 71, 82, 86, 74, 28, 2, -22, -13, -43, -22, -59, -3, 6, -12, -9, -20, -18, -39, 22, 31, 13, 16, 5, 7, -12, -17, 9, 19, 15, -17, 1, 16, 34, 43, 25, 28, 17, 19, 0, -5, 21, 31, 27, -5, 13, 31, 28, -41, -32, -50, -47, -58, -56, -75, -80, -54, -44, -48, -80, -62, -41, -60, 10, 19, 1, 4, -7, -5, -24, -29, -3, 7, 3, -29, 7, 4, 27, 36, 18, 21, 10, 12, 13, -12, 14, 24, 20, -12, 13, 10, 27, 8, 61, 70, 52, 58, 22, 61, 45, 62, 22, 45, 54, 60, 57, 42, 42, 51, 60, 49, 37, 34, 44, 47, 30, 12, 21, 12, 6, -18, 10, 19, 10, 4, -19, 15, 30, 30, 26, 23, 17, 15, 34, 23, 29, 28, -35, 18, 36, 16, 33, 35, 16, 33, 45, 60, 60, 56, 53, 47, 45, c.f17104b, 53, 59, 58, -5, 60, 51, c.f17105c, 4, 19, 19, 15, 12, 6, 4, 23, 12, 18, 17, -46, 25, 18, 5, 22, 24, 5, 31, 46, 46, 42, 39, 33, 31, 50, 39, 45, 44, -19, 54, -21, 49, 51, 32, 48, 39, 46, 40, 60, 43, 48, 54, -10, 40, 42, -6, 9, 29, 12, 17, 23, -41, 13, 9, 11, -37, 16, 36, 19, 24, 30, -34, 21, 27, 16, 18, 75, 95, 78, 83, 89, 25, 87, 90, 30, 75, 23, 86, 75, 94, 87, -3, 17, 0, 5, 11, -53, 9, 12, 1, 3, 11, 31, 14, 19, 25, -39, 23, 26, 15, 17, -41, -10, -36, -7, 13, -4, 1, 7, -57, 7, 8, 13, 11, 70, 90, 73, 78, 84, 20, 87, 70, 92, -17, 3, 
        -14, -9, -3, -67, 2, 0, 3, -13, -69, -10, -14, 76, 96, 79, 84, 90, 26, 97, 89, 79, 25, 79, 95, 94, 47, 67, 50, 55, 61, -3, 68, 60, 50, -4, 50, 66, 65, -4, 54, 50, 18, 38, 21, 26, 32, -32, 39, 32, 35, 19, 26, 36, 43, c.f17105c, 46, 51, 57, -7, 66, -9, c.f17105c, 56, 53, 56, 57, 65, 56, -4, 5, -2, 6, -9, 10, 6, -63, 8, 6, 6, 74, 59, 78, 74, 5, 78, 3, 73, 73, 55, -11, -24, -29, -28, -18, -82, -78, -26, -17, -17, 47, 34, 29, 30, 40, -24, 26, 47, -23, -22, 66, 53, 48, 49, 59, -5, 45, 66, 47, 19, 6, 1, 2, 12, -52, 1, 6, 19, 21, 17, 4, -1, 0, 10, -54, -1, 10, 7, -3, 20, -56, 17, 4, 14, 4, 10, 9, 22, 9, 4, 5, 15, -49, 8, 5, 22, 3, 37, 24, 19, 20, 30, -34, 28, 31, -29, 37, -36, 20, 34, 98, 85, 80, 81, 91, 27, 89, 92, 81, 83, 30, 67, 54, 49, 50, 60, -4, 68, 67, 48, -2, 32, 19, 14, 15, 25, -39, 34, -41, 31, 24, 21, 24, 25, 33, 24, 43, 30, 25, 26, 36, -28, 45, -30, 43, 35, 25, -29, 36, 35, -25, -29, 43, 37, -19, 93, 80, 75, 76, 86, 22, 95, 20, 93, 85, 75, 21, 86, 85, 25, 21, 93, 87, 32};
    }

    static {
        A07();
    }

    public static List<byte[]> A05(byte[] bArr) throws C3K {
        String A03 = A03(233, 34, 43);
        try {
            if (bArr[0] == 2) {
                int vorbisInfoLength = 1;
                int i = 0;
                while ((bArr[vorbisInfoLength] & 255) == 255) {
                    i += p.f9259b;
                    vorbisInfoLength++;
                }
                int i4 = vorbisInfoLength + 1;
                int i6 = i + (bArr[vorbisInfoLength] & p.f9259b);
                int offset = 0;
                while ((bArr[i4] & 255) == 255) {
                    offset += p.f9259b;
                    i4++;
                }
                int vorbisInfoLength2 = i4 + 1;
                int offset2 = offset + (bArr[i4] & p.f9259b);
                if (bArr[vorbisInfoLength2] == 1) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, vorbisInfoLength2, bArr2, 0, i6);
                    int vorbisInfoLength3 = vorbisInfoLength2 + i6;
                    if (bArr[vorbisInfoLength3] == 3) {
                        int vorbisInfoLength4 = vorbisInfoLength3 + offset2;
                        if (bArr[vorbisInfoLength4] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength4];
                            System.arraycopy(bArr, vorbisInfoLength4, bArr3, 0, bArr.length - vorbisInfoLength4);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw C3K.A01(A03, null);
                    }
                    throw C3K.A01(A03, null);
                }
                throw C3K.A01(A03, null);
            }
            throw C3K.A01(A03, null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C3K.A01(A03, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNull({"output"})
    public void A06() {
        AbstractC06443y.A01(this.A0b);
    }

    public static boolean A09(C06674v c06674v) throws C3K {
        UUID uuid;
        UUID uuid2;
        try {
            int A0G = c06674v.A0G();
            if (A0G == 1) {
                return true;
            }
            if (A0G != 65534) {
                return false;
            }
            c06674v.A0f(24);
            long A0P = c06674v.A0P();
            uuid = MatroskaExtractor.A0x;
            if (A0P == uuid.getMostSignificantBits()) {
                long A0P2 = c06674v.A0P();
                uuid2 = MatroskaExtractor.A0x;
                if (A0P2 == uuid2.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C3K.A01(A03(199, 34, 58), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MetaExoPlayerCustomization("Removed opus check as it breaks some 360 files")
    public boolean A0B(boolean z6) {
        return this.A0N > 0;
    }

    private byte[] A0C() {
        if (this.A06 == -1.0f) {
            return null;
        }
        float f2 = this.A07;
        if (A0q[2].length() == 25) {
            throw new RuntimeException();
        }
        String[] strArr = A0q;
        strArr[6] = "HGnETyIhtjZXJxyU1T6j8";
        strArr[0] = "bCjehM63cEytRPEEQFxd2";
        if (f2 == -1.0f || this.A04 == -1.0f || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f) {
            return null;
        }
        float f9 = this.A0B;
        if (A0q[7].charAt(7) != '5') {
            String[] strArr2 = A0q;
            strArr2[6] = "JEOA6svQlcm533p1kymyr";
            strArr2[0] = "xcQgG7qgeuJwHZcHlhioj";
            if (f9 == -1.0f) {
                return null;
            }
        } else {
            A0q[2] = "jAXoTae2Kk";
            if (f9 == -1.0f) {
                return null;
            }
        }
        if (this.A0C == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        hdrStaticInfo.put((byte) 0);
        hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A0B * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A0C * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
        hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
        hdrStaticInfo.putShort((short) this.A0O);
        hdrStaticInfo.putShort((short) this.A0P);
        return bArr;
    }

    @EnsuresNonNull({"codecPrivate"})
    private byte[] A0D(String str) throws C3K {
        if (this.A0j != null) {
            byte[] bArr = this.A0j;
            if (A0q[1].charAt(11) != 'i') {
                throw new RuntimeException();
            }
            A0q[2] = "piNmNCdUWkr";
            return bArr;
        }
        throw C3K.A01(A03(329, 31, 93) + str, null);
    }

    @RequiresNonNull({"output"})
    public final void A0E() {
        if (this.A0c != null) {
            C0968He c0968He = this.A0c;
            InterfaceC0967Hd interfaceC0967Hd = this.A0b;
            String[] strArr = A0q;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[3] = "E7jv121Xgp0U6ziYD0QsnQRL0Byqc4aj";
            strArr2[4] = "tGwzWQC5dBvo0sMjKwRXnFk53sqcL924";
            c0968He.A05(interfaceC0967Hd, this.A0a);
        }
    }

    public final void A0F() {
        if (this.A0c != null) {
            this.A0c.A02();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0434, code lost:
    
        if (r11 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0436, code lost:
    
        r1 = com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor.A0w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0440, code lost:
    
        if (r1.containsKey(r19.A0e) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0442, code lost:
    
        r8.A0z(r19.A0e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0447, code lost:
    
        r1 = r8.A0g(r21).A11(r3).A0h(r5).A10(r19.A0o).A0n(r9).A12(r2).A0w(r4).A0u(r19.A0Z).A14();
        r19.A0b = r20.AKS(r19.A0R, r10);
        r19.A0b.A6e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0480, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0488, code lost:
    
        if (r11 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04b3, code lost:
    
        if (r11 == (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04b5, code lost:
    
        r0 = r19.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x058a, code lost:
    
        r0 = r19.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0586, code lost:
    
        if (r11 == (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x05c9, code lost:
    
        if (r10.equals(r3) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x05d9, code lost:
    
        if (A03(1070, 8, 21).equals(r3) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x05e9, code lost:
    
        if (A03(874, 18, 38).equals(r3) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x05f9, code lost:
    
        if (A03(859, 15, 79).equals(r3) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0609, code lost:
    
        if (A03(840, 19, 49).equals(r3) == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x08ee, code lost:
    
        throw com.instagram.common.viewpoint.core.C3K.A01(A03(471, 21, 83), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x061e, code lost:
    
        if (r10.equals(r3) == false) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @EnsuresNonNull({"this.output"})
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0G(HA ha, int i) throws C3K {
        char c9;
        String A03;
        byte[] bArr;
        int i4;
        Map map;
        Map map2;
        int i6;
        int i9;
        String[] strArr;
        H6 A00;
        int i10 = -1;
        int i11 = -1;
        List<byte[]> list = null;
        String str = null;
        String str2 = this.A0d;
        switch (str2.hashCode()) {
            case -2095576542:
                if (str2.equals(A03(733, 14, 67))) {
                    c9 = 6;
                    String A032 = A03(0, 22, 98);
                    String A033 = A03(312, 17, 46);
                    switch (c9) {
                        case 0:
                            A03 = A03(1204, 19, 56);
                            if (this.A0k != null && (A00 = H6.A00(new C06674v(this.A0k))) != null) {
                                str = A00.A02;
                                A03 = A03(1127, 18, 30);
                            }
                            int i12 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p = new C06112p();
                            if (!C3J.A0C(A03)) {
                                i4 = 1;
                                c06112p.A0b(this.A0E).A0m(this.A0T).A0i(i11);
                            } else if (C3J.A0F(A03)) {
                                i4 = 2;
                                if (this.A0K == 0) {
                                    if (this.A0L == -1) {
                                        i6 = this.A0W;
                                    } else {
                                        i6 = this.A0L;
                                    }
                                    this.A0L = i6;
                                    int i13 = this.A0J;
                                    String[] strArr2 = A0q;
                                    if (strArr2[6].length() == strArr2[0].length()) {
                                        String[] strArr3 = A0q;
                                        strArr3[6] = "0fOwLIWZXoYdZ03NOI0PL";
                                        strArr3[0] = "X0ylGKF789dugCDfRJBOw";
                                        break;
                                    }
                                    this.A0J = i9;
                                }
                                float f2 = -1.0f;
                                if (this.A0L != -1 && this.A0J != -1) {
                                    f2 = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                                }
                                ColorInfo colorInfo = null;
                                if (this.A0h) {
                                    colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                                }
                                int i14 = -1;
                                if (this.A0e != null) {
                                    map = MatroskaExtractor.A0w;
                                    if (map.containsKey(this.A0e)) {
                                        map2 = MatroskaExtractor.A0w;
                                        i14 = ((Integer) map2.get(this.A0e)).intValue();
                                    }
                                }
                                if (this.A0S == 0 && Float.compare(this.A0A, 0.0f) == 0 && Float.compare(this.A08, 0.0f) == 0) {
                                    if (Float.compare(this.A09, 0.0f) == 0) {
                                        i14 = 0;
                                    } else if (Float.compare(this.A08, 90.0f) == 0) {
                                        i14 = 90;
                                    } else if (Float.compare(this.A08, -180.0f) == 0 || Float.compare(this.A08, 180.0f) == 0) {
                                        i14 = 180;
                                    } else if (Float.compare(this.A08, -90.0f) == 0) {
                                        i14 = 270;
                                    }
                                }
                                c06112p.A0r(this.A0W).A0f(this.A0M).A0Y(f2).A0l(i14).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                            } else {
                                if (!A03(892, 20, 65).equals(A03)) {
                                    String A034 = A03(1078, 10, 89);
                                    if (A0q[2].length() == 25) {
                                        String[] strArr4 = A0q;
                                        strArr4[3] = "uzACjMnIRDWkXmLtS6v7ngwgE1QfSENz";
                                        strArr4[4] = "s3rMIZ4lTCXi8DcRU7rrn7aYp4jB1V6f";
                                        break;
                                    } else {
                                        String[] strArr5 = A0q;
                                        strArr5[6] = "OrIo36JggGcBMG1gQIgml";
                                        strArr5[0] = "fZspUpTcTDNyw6GYW1xYu";
                                        break;
                                    }
                                }
                                i4 = 3;
                            }
                            String str3 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                                A0q[5] = "geYInneqHCN24sLMYNtYBj6RIxMbJ8";
                                break;
                            }
                            break;
                        case 1:
                            A03 = A03(1223, 19, 106);
                            if (this.A0k != null) {
                                str = A00.A02;
                                A03 = A03(1127, 18, 30);
                                break;
                            }
                            int i122 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 2:
                            A03 = A03(1098, 10, 60);
                            if (this.A0k != null) {
                            }
                            int i1222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 3:
                            A03 = A03(1168, 11, 111);
                            if (this.A0k != null) {
                            }
                            int i12222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 4:
                        case 5:
                        case 6:
                            A03 = A03(1155, 13, 50);
                            list = this.A0j == null ? null : Collections.singletonList(this.A0j);
                            if (this.A0k != null) {
                            }
                            int i122222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 7:
                            A03 = A03(1108, 9, 79);
                            C0959Gv A002 = C0959Gv.A00(new C06674v(A0D(this.A0d)));
                            list = A002.A05;
                            this.A0Q = A002.A02;
                            str = A002.A04;
                            if (this.A0k != null) {
                            }
                            int i1222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case '\b':
                            A03 = A03(1145, 10, 35);
                            HL A003 = HL.A00(new C06674v(A0D(this.A0d)));
                            list = A003.A08;
                            this.A0Q = A003.A05;
                            str = A003.A07;
                            if (this.A0k != null) {
                            }
                            int i12222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case '\t':
                            Pair<String, List<byte[]>> A02 = A02(new C06674v(A0D(this.A0d)));
                            A03 = (String) A02.first;
                            list = (List) A02.second;
                            if (this.A0k != null) {
                            }
                            int i122222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case '\n':
                            A03 = A03(1189, 15, 45);
                            if (this.A0k != null) {
                            }
                            int i1222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 11:
                            A03 = A03(1040, 12, 52);
                            i10 = 8192;
                            list = A05(A0D(this.A0d));
                            if (this.A0k != null) {
                            }
                            int i12222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case '\f':
                            A03 = A03(979, 10, 27);
                            i10 = 5760;
                            list = new ArrayList<>(3);
                            list.add(A0D(this.A0d));
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                            if (this.A0k != null) {
                            }
                            int i122222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case '\r':
                            A03 = A03(941, 15, a.f22543z);
                            list = Collections.singletonList(A0D(this.A0d));
                            C0950Gm A035 = AbstractC0951Gn.A03(this.A0j);
                            this.A0T = A035.A01;
                            this.A0E = A035.A00;
                            str = A035.A02;
                            if (this.A0k != null) {
                            }
                            int i1222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 14:
                            A03 = A03(966, 13, 45);
                            i10 = 4096;
                            if (this.A0k != null) {
                            }
                            int i12222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 15:
                            A03 = A03(956, 10, 31);
                            i10 = 4096;
                            if (this.A0k != null) {
                            }
                            int i122222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 16:
                            A03 = A03(912, 9, 74);
                            if (this.A0k != null) {
                            }
                            int i1222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 17:
                            A03 = A03(921, 10, 43);
                            if (this.A0k != null) {
                            }
                            int i12222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 18:
                            A03 = A03(998, 13, 17);
                            this.A0c = new C0968He();
                            if (this.A0k != null) {
                            }
                            int i122222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 19:
                        case 20:
                            A03 = A03(1011, 13, 110);
                            if (this.A0k != null) {
                            }
                            int i1222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 21:
                            A03 = A03(1024, 16, 81);
                            if (this.A0k != null) {
                            }
                            int i12222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 22:
                            A03 = A03(931, 10, 50);
                            list = Collections.singletonList(A0D(this.A0d));
                            if (this.A0k != null) {
                            }
                            int i122222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 23:
                            A03 = A03(989, 9, 104);
                            if (A09(new C06674v(A0D(this.A0d)))) {
                                i11 = C5C.A03(this.A0D);
                                if (i11 == 0) {
                                    i11 = -1;
                                    A03 = A03(1052, 15, 77);
                                    AbstractC06524g.A07(A033, A03(573, 27, 124) + this.A0D + A032 + A03);
                                }
                            } else {
                                A03 = A03(1052, 15, 77);
                                AbstractC06524g.A07(A033, A03(360, 51, 18) + A03);
                            }
                            if (this.A0k != null) {
                            }
                            int i1222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 24:
                            A03 = A03(989, 9, 104);
                            i11 = C5C.A03(this.A0D);
                            if (i11 == 0) {
                                i11 = -1;
                                A03 = A03(1052, 15, 77);
                                AbstractC06524g.A07(A033, A03(680, 41, 101) + this.A0D + A032 + A03);
                            }
                            if (this.A0k != null) {
                            }
                            int i12222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 25:
                            A03 = A03(989, 9, 104);
                            if (this.A0D == 8) {
                                i11 = 3;
                            } else if (this.A0D == 16) {
                                i11 = 268435456;
                            } else {
                                i11 = -1;
                                A03 = A03(1052, 15, 77);
                                AbstractC06524g.A07(A033, A03(600, 38, 96) + this.A0D + A032 + A03);
                            }
                            if (this.A0k != null) {
                            }
                            int i122222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 26:
                            A03 = A03(989, 9, 104);
                            if (this.A0D == 32) {
                                i11 = 4;
                            } else {
                                i11 = -1;
                                A03 = A03(1052, 15, 77);
                                AbstractC06524g.A07(A033, A03(638, 42, 38) + this.A0D + A032 + A03);
                            }
                            if (this.A0k != null) {
                            }
                            int i1222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 27:
                            A03 = A03(892, 20, 65);
                            if (this.A0k != null) {
                            }
                            int i12222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 28:
                            A03 = A03(1078, 10, 89);
                            bArr = MatroskaExtractor.A0y;
                            list = MetaExoPlayerCustomizedCollections.A03(bArr, A0D(this.A0d));
                            if (this.A0k != null) {
                            }
                            int i122222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 29:
                            if (A0q[2].length() != 25) {
                                A0q[2] = "DXVHiJQ";
                                A03 = A03(1070, 8, 21);
                                if (this.A0k != null) {
                                }
                                int i1222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                                C06112p c06112p22222222222222222222222222 = new C06112p();
                                if (!C3J.A0C(A03)) {
                                }
                                String str322222222222222222222222222 = this.A0e;
                                strArr = A0q;
                                if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                                }
                            }
                            throw new RuntimeException();
                        case 30:
                            A03 = A03(874, 18, 38);
                            list = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                            if (this.A0k != null) {
                            }
                            int i12222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p222222222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str3222222222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case 31:
                            A03 = A03(859, 15, 79);
                            if (this.A0k != null) {
                            }
                            int i122222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p2222222222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str32222222222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        case ' ':
                            A03 = A03(840, 19, 49);
                            byte[] bArr2 = new byte[4];
                            System.arraycopy(A0D(this.A0d), 0, bArr2, 0, 4);
                            list = MetaExoPlayerCustomizedCollections.A03(bArr2);
                            if (this.A0k != null) {
                            }
                            int i1222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                            C06112p c06112p22222222222222222222222222222 = new C06112p();
                            if (!C3J.A0C(A03)) {
                            }
                            String str322222222222222222222222222222 = this.A0e;
                            strArr = A0q;
                            if (strArr[3].charAt(20) != strArr[4].charAt(20)) {
                            }
                            break;
                        default:
                            throw C3K.A01(A03(543, 30, 50), null);
                    }
                }
                c9 = 65535;
                String A0322 = A03(0, 22, 98);
                String A0332 = A03(312, 17, 46);
                switch (c9) {
                }
            case -2095575984:
                if (str2.equals(A03(777, 14, 55))) {
                    c9 = 4;
                    String A03222 = A03(0, 22, 98);
                    String A03322 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222 = A03(0, 22, 98);
                String A033222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -1985379776:
                if (str2.equals(A03(94, 8, 69))) {
                    c9 = 23;
                    String A0322222 = A03(0, 22, 98);
                    String A0332222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222 = A03(0, 22, 98);
                String A03322222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -1784763192:
                if (str2.equals(A03(150, 8, 125))) {
                    c9 = 18;
                    String A032222222 = A03(0, 22, 98);
                    String A033222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222 = A03(0, 22, 98);
                String A0332222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -1730367663:
                if (str2.equals(A03(158, 8, 89))) {
                    c9 = 11;
                    String A03222222222 = A03(0, 22, 98);
                    String A03322222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222 = A03(0, 22, 98);
                String A033222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -1482641358:
                if (str2.equals(A03(76, 9, 75))) {
                    c9 = 14;
                    String A0322222222222 = A03(0, 22, 98);
                    String A0332222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222 = A03(0, 22, 98);
                String A03322222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -1482641357:
                if (str2.equals(A03(85, 9, 7))) {
                    c9 = 15;
                    String A032222222222222 = A03(0, 22, 98);
                    String A033222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222 = A03(0, 22, 98);
                String A0332222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -1373388978:
                if (str2.equals(A03(807, 15, 106))) {
                    c9 = '\t';
                    String A03222222222222222 = A03(0, 22, 98);
                    String A03322222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222 = A03(0, 22, 98);
                String A033222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -933872740:
                if (str2.equals(A03(411, 8, 51))) {
                    c9 = ' ';
                    String A0322222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -538363189:
                if (str2.equals(A03(747, 15, 79))) {
                    c9 = 5;
                    String A032222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -538363109:
                if (str2.equals(A03(762, 15, 4))) {
                    c9 = 7;
                    String A03222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -425012669:
                if (str2.equals(A03(463, 8, 110))) {
                    c9 = 30;
                    String A0322222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case -356037306:
                if (str2.equals(A03(50, 14, 60))) {
                    c9 = 21;
                    String A032222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 62923557:
                if (A0q[7].charAt(7) == '5') {
                    throw new RuntimeException();
                }
                A0q[2] = "PCK9YAvtQc91Ig7IWCjClF";
                if (str2.equals(A03(22, 5, 19))) {
                    c9 = '\r';
                    String A03222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 62923603:
                if (str2.equals(A03(27, 5, 23))) {
                    c9 = 16;
                    String A0322222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 62927045:
                if (str2.equals(A03(32, 5, 64))) {
                    c9 = 19;
                    String A032222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 82318131:
                if (str2.equals(A03(721, 5, 23))) {
                    c9 = 2;
                    String A03222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 82338133:
                if (str2.equals(A03(830, 5, 57))) {
                    c9 = 0;
                    String A0322222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 82338134:
                String[] strArr6 = A0q;
                if (strArr6[3].charAt(20) == strArr6[4].charAt(20)) {
                    String[] strArr7 = A0q;
                    strArr7[3] = "krBYiBibqX7TSfSwMYzjn9d2GuX0Mkor";
                    strArr7[4] = "P6vgcrj3R6TgPbwX53cZn6lBdQLCmynr";
                    if (str2.equals(A03(835, 5, 55))) {
                        c9 = 1;
                        String A032222222222222222222222222222222222222 = A03(0, 22, 98);
                        String A033222222222222222222222222222222222222 = A03(312, 17, 46);
                        switch (c9) {
                        }
                    }
                    c9 = 65535;
                    String A0322222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                throw new RuntimeException();
            case 99146302:
                if (str2.equals(A03(419, 10, a.f22514Q))) {
                    c9 = 31;
                    String A03222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 444813526:
                if (str2.equals(A03(822, 8, 96))) {
                    c9 = '\n';
                    String A0322222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 542569478:
                if (str2.equals(A03(37, 13, 113))) {
                    c9 = 20;
                    String A032222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 635596514:
                if (str2.equals(A03(108, 16, 48))) {
                    c9 = 26;
                    String A03222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 725948237:
                if (str2.equals(A03(124, 13, 85))) {
                    c9 = 25;
                    String A0322222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 725957860:
                if (str2.equals(A03(137, 13, 32))) {
                    c9 = 24;
                    String A032222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 738597099:
                if (str2.equals(A03(429, 10, 84))) {
                    c9 = 28;
                    String A03222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 855502857:
                if (str2.equals(A03(791, 16, 72))) {
                    c9 = '\b';
                    String A0322222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 1045209816:
                if (str2.equals(A03(450, 13, 101))) {
                    c9 = 29;
                    String A032222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 1422270023:
                if (str2.equals(A03(439, 11, 49))) {
                    c9 = 27;
                    String A03222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 1809237540:
                if (str2.equals(A03(726, 7, 42))) {
                    c9 = 3;
                    String A0322222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 1950749482:
                if (str2.equals(A03(64, 6, 66))) {
                    c9 = 17;
                    String A032222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A0322222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 1950789798:
                if (str2.equals(A03(70, 6, 88))) {
                    c9 = 22;
                    String A03222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A032222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            case 1951062397:
                if (str2.equals(A03(102, 6, 53))) {
                    c9 = '\f';
                    String A0322222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c9) {
                    }
                }
                c9 = 65535;
                String A03222222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
            default:
                c9 = 65535;
                String A032222222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c9) {
                }
        }
    }
}
