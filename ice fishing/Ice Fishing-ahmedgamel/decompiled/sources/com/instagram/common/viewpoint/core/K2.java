package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class K2 {
    public static byte[] A07;
    public static String[] A08 = {"kwH2IgvZBGVpLaminurwcFHn", "J6e0tkh1Ff6tZSOwzR7AwbvIu8fVWeGQ", "bmiWbLOqDwiyYFUNe9As1QTlUgH4xYog", "dMXPCdyZdj7A6mfCnV5k3qiAvM2EcvhL", "upBvpVjUbbd4tW9uVknw3ChYtDg3XaKB", "lx9xVZ51GyjZV5dkAVxa", "4OpeXOwoxJhsdURDQeyl4TBKgN5cofiY", "16zjJfNWedSO35u1fMpvBODfGSUbEH9B"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C1035Ju A04;
    public final C1036Jv A05;
    public final K1 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1035Ju A04(C06664u c06664u, int i) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i4 = 8;
        int A045 = c06664u.A04(8);
        c06664u.A09(8);
        int i6 = i - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i6 > 0) {
            int A046 = c06664u.A04(i4);
            int A047 = c06664u.A04(i4);
            int i9 = i6 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            int i10 = A047 & 1;
            String[] strArr = A08;
            if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A08[3] = "yhDNrhcDigDR24Kxe5BS389mQBs2ZM2v";
            if (i10 != 0) {
                A04 = c06664u.A04(i4);
                A042 = c06664u.A04(i4);
                A043 = c06664u.A04(i4);
                A044 = c06664u.A04(i4);
                i6 = i9 - 4;
            } else {
                A04 = c06664u.A04(6) << 2;
                A042 = c06664u.A04(4) << 4;
                A043 = c06664u.A04(4) << 4;
                A044 = c06664u.A04(2) << 6;
                i6 = i9 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[7] = "NRFOfVblegIP33K9RsgAL0VferudmJOb";
                A043 = 0;
                A044 = p.f9259b;
            }
            iArr[A046] = A00(255 - (A044 & p.f9259b), C5C.A07((int) (A04 + ((A042 - 128) * 1.402d)), 0, p.f9259b), C5C.A07((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, p.f9259b), C5C.A07((int) (A04 + ((A043 - 128) * 1.772d)), 0, p.f9259b));
            i4 = 8;
        }
        return new C1035Ju(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1036Jv A05(C06664u c06664u) {
        int i;
        int i4;
        int i6;
        int i9;
        c06664u.A09(4);
        boolean A0H = c06664u.A0H();
        c06664u.A09(3);
        int A04 = c06664u.A04(16);
        int A042 = c06664u.A04(16);
        if (A0H) {
            i = c06664u.A04(16);
            i9 = c06664u.A04(16);
            i4 = c06664u.A04(16);
            i6 = c06664u.A04(16);
        } else {
            i = 0;
            i4 = 0;
            i6 = A042;
            i9 = A04;
        }
        return new C1036Jv(A04, A042, i, i9, i4, i6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 27
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1040Jz A08(C06664u c06664u, int i) {
        int i4 = 8;
        int A04 = c06664u.A04(8);
        c06664u.A09(4);
        boolean A0H = c06664u.A0H();
        c06664u.A09(3);
        int A042 = c06664u.A04(16);
        int A043 = c06664u.A04(16);
        int A044 = c06664u.A04(3);
        int A045 = c06664u.A04(3);
        c06664u.A09(2);
        int A046 = c06664u.A04(8);
        int A047 = c06664u.A04(8);
        int A048 = c06664u.A04(4);
        int A049 = c06664u.A04(2);
        c06664u.A09(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int A0410 = c06664u.A04(16);
            int A0411 = c06664u.A04(2);
            int A0412 = c06664u.A04(2);
            int A0413 = c06664u.A04(12);
            c06664u.A09(4);
            int A0414 = c06664u.A04(12);
            i6 -= 6;
            int i9 = 0;
            int i10 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i9 = c06664u.A04(i4);
                i10 = c06664u.A04(i4);
                i6 -= 2;
            }
            sparseArray.put(A0410, new K0(A0411, A0412, A0413, A0414, i9, i10));
            i4 = 8;
        }
        return new C1040Jz(A04, A0H, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{c.f17105c, 26, 15, 26, 91, 29, 18, 30, 23, 31, 91, 23, 30, 21, 28, 15, 19, 91, 30, 3, 24, 30, 30, 31, 8, 91, 23, 18, 22, 18, 15, 98, 80, 68, 118, 71, 84, 85, 67, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final List<C2370pT> A0I(byte[] bArr, int i) {
        C06664u c06664u = new C06664u(bArr, i);
        while (c06664u.A01() >= 48 && c06664u.A04(8) == 15) {
            A0B(c06664u, this.A06);
        }
        C1038Jx c1038Jx = this.A06.A01;
        if (c1038Jx == null) {
            return Collections.emptyList();
        }
        C1036Jv c1036Jv = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c1036Jv.A05 + 1 != this.A00.getWidth() || c1036Jv.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(c1036Jv.A05 + 1, c1036Jv.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C1039Jy> sparseArray = c1038Jx.A03;
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            this.A01.save();
            C1039Jy valueAt = sparseArray.valueAt(i4);
            C1040Jz c1040Jz = this.A06.A08.get(sparseArray.keyAt(i4));
            int i6 = valueAt.A00 + c1036Jv.A02;
            int i9 = valueAt.A01 + c1036Jv.A04;
            this.A01.clipRect(i6, i9, Math.min(c1040Jz.A08 + i6, c1036Jv.A01), Math.min(c1040Jz.A02 + i9, c1036Jv.A03));
            C1035Ju c1035Ju = this.A06.A06.get(c1040Jz.A00);
            if (c1035Ju == null && (c1035Ju = this.A06.A04.get(c1040Jz.A00)) == null) {
                c1035Ju = this.A04;
            }
            SparseArray<K0> sparseArray2 = c1040Jz.A09;
            for (int i10 = 0; i10 < sparseArray2.size(); i10++) {
                int keyAt = sparseArray2.keyAt(i10);
                K0 valueAt2 = sparseArray2.valueAt(i10);
                C1037Jw c1037Jw = this.A06.A07.get(keyAt);
                if (c1037Jw == null) {
                    c1037Jw = this.A06.A05.get(keyAt);
                }
                if (c1037Jw != null) {
                    A0C(c1037Jw, c1035Ju, c1040Jz.A01, i6 + valueAt2.A02, i9 + valueAt2.A05, c1037Jw.A01 ? null : this.A02, this.A01);
                }
            }
            if (A08[4].charAt(14) != '9') {
                throw new RuntimeException();
            }
            A08[0] = "Y9Cu9eZ8R7HUBmBBCZ1DilUT";
            if (c1040Jz.A0A) {
                this.A03.setColor(c1040Jz.A01 == 3 ? c1035Ju.A03[c1040Jz.A07] : c1040Jz.A01 == 2 ? c1035Ju.A02[c1040Jz.A06] : c1035Ju.A01[c1040Jz.A05]);
                this.A01.drawRect(i6, i9, c1040Jz.A08 + i6, c1040Jz.A02 + i9, this.A03);
            }
            arrayList.add(new C06343o().A0D(Bitmap.createBitmap(this.A00, i6, i9, c1040Jz.A08, c1040Jz.A02)).A04(i6 / c1036Jv.A05).A0A(0).A07(i9 / c1036Jv.A00, 0).A09(0).A06(c1040Jz.A08 / c1036Jv.A05).A03(c1040Jz.A02 / c1036Jv.A00).A0H());
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
            this.A01.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public K2(int i, int i4) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C1036Jv(719, 575, 0, 719, 0, 575);
        this.A04 = new C1035Ju(0, A0F(), A0G(), A0H());
        this.A06 = new K1(i, i4);
    }

    public static int A00(int i, int i4, int i6, int i9) {
        return (i << 24) | (i4 << 16) | (i6 << 8) | i9;
    }

    public static int A01(C06664u c06664u, int[] iArr, byte[] bArr, int i, int i4, Paint paint, Canvas canvas) {
        boolean z6 = false;
        do {
            int i6 = 0;
            int A04 = c06664u.A04(2);
            if (A04 != 0) {
                i6 = 1;
            } else if (c06664u.A0H()) {
                i6 = c06664u.A04(3) + 3;
                A04 = c06664u.A04(2);
            } else if (c06664u.A0H()) {
                i6 = 1;
                A04 = 0;
            } else {
                switch (c06664u.A04(2)) {
                    case 0:
                        z6 = true;
                        A04 = 0;
                        break;
                    case 1:
                        i6 = 2;
                        A04 = 0;
                        break;
                    case 2:
                        int A042 = c06664u.A04(4);
                        if (A08[7].charAt(9) != 'e') {
                            A08[7] = "PWQusWjmzTX1R8w37TeIuijcGSqhz46U";
                            i6 = A042 + 12;
                            A04 = c06664u.A04(2);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    case 3:
                        i6 = c06664u.A04(8) + 29;
                        A04 = c06664u.A04(2);
                        break;
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (i6 != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i, i4, i + i6, i4 + 1, paint);
            }
            i += i6;
        } while (!z6);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r0 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r6 = r0 + 2;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        r7 = true;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r0 != 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A02(C06664u c06664u, int[] iArr, byte[] bArr, int i, int i4, Paint paint, Canvas canvas) {
        int A04;
        int i6 = i;
        boolean z6 = false;
        do {
            int peek = 0;
            int A042 = c06664u.A04(4);
            if (A042 != 0) {
                peek = 1;
            } else if (c06664u.A0H()) {
                if (!c06664u.A0H()) {
                    peek = c06664u.A04(2) + 4;
                    A042 = c06664u.A04(4);
                } else {
                    switch (c06664u.A04(2)) {
                        case 0:
                            peek = 1;
                            A042 = 0;
                            break;
                        case 1:
                            peek = 2;
                            A042 = 0;
                            break;
                        case 2:
                            peek = c06664u.A04(4) + 9;
                            A042 = c06664u.A04(4);
                            break;
                        case 3:
                            peek = c06664u.A04(8) + 25;
                            A042 = c06664u.A04(4);
                            break;
                        default:
                            A042 = 0;
                            break;
                    }
                }
            } else if (A08[0].length() != 24) {
                A08[1] = "Jb849HVzYsbrcyVvorQRSzDXgxwzOwbS";
                A04 = c06664u.A04(3);
            } else {
                A08[3] = "lCytI93sja9tcovqvw8Z3JcTVPPUQzad";
                A04 = c06664u.A04(3);
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A042 = bArr[A042];
                }
                paint.setColor(iArr[A042]);
                float f2 = i6;
                float f9 = i4;
                String[] strArr = A08;
                if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[2] = "7zyAW2neZYMKALasLQ64ygc21beBnsUa";
                strArr2[6] = "CykdyJVKnOvIvZ1RH2gJr9pO2NNGsRyJ";
                canvas.drawRect(f2, f9, i6 + peek, i4 + 1, paint);
            }
            i6 += peek;
        } while (!z6);
        return i6;
    }

    public static int A03(C06664u c06664u, int[] iArr, byte[] bArr, int i, int i4, Paint paint, Canvas canvas) {
        int runLength;
        int i6 = i;
        boolean z6 = false;
        do {
            int A04 = c06664u.A04(8);
            if (A04 != 0) {
                runLength = 1;
            } else if (!c06664u.A0H()) {
                runLength = c06664u.A04(7);
                if (runLength != 0) {
                    A04 = 0;
                } else {
                    z6 = true;
                    runLength = 0;
                    A04 = 0;
                }
            } else {
                runLength = c06664u.A04(7);
                A04 = c06664u.A04(8);
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[3] = "mqxvpcZRbZaRJOXRSA703vBu0XWYN9Vd";
                canvas.drawRect(i6, i4, i6 + runLength, i4 + 1, paint);
            }
            i6 += runLength;
        } while (!z6);
        return i6;
    }

    public static C1037Jw A06(C06664u c06664u) {
        int A04 = c06664u.A04(16);
        c06664u.A09(4);
        int objectCodingMethod = c06664u.A04(2);
        boolean A0H = c06664u.A0H();
        c06664u.A09(1);
        byte[] bottomFieldData = C5C.A07;
        byte[] bArr = C5C.A07;
        if (objectCodingMethod == 1) {
            int numberOfCodes = c06664u.A04(8);
            c06664u.A09(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int A042 = c06664u.A04(16);
            int topFieldDataLength = c06664u.A04(16);
            int objectId = A08[4].charAt(14);
            if (objectId != 57) {
                throw new RuntimeException();
            }
            A08[7] = "H05iJqDXaQUoFjCcOPsdhLa69PYGJoEl";
            if (A042 > 0) {
                bottomFieldData = new byte[A042];
                c06664u.A0G(bottomFieldData, 0, A042);
            }
            if (topFieldDataLength > 0) {
                bArr = new byte[topFieldDataLength];
                c06664u.A0G(bArr, 0, topFieldDataLength);
            } else {
                bArr = bottomFieldData;
            }
        }
        return new C1037Jw(A04, A0H, bottomFieldData, bArr);
    }

    public static C1038Jx A07(C06664u c06664u, int i) {
        int A04 = c06664u.A04(8);
        int A042 = c06664u.A04(4);
        int A043 = c06664u.A04(2);
        c06664u.A09(2);
        int i4 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int remainingLength = c06664u.A04(8);
            c06664u.A09(8);
            int version = c06664u.A04(16);
            int timeoutSecs = c06664u.A04(16);
            i4 -= 6;
            sparseArray.put(remainingLength, new C1039Jy(version, timeoutSecs));
        }
        return new C1038Jx(A04, A042, A043, sparseArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r5 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        r1 = r8.A08;
        r0 = r4.A03;
        r0 = r1.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        r4.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        r1 = r8.A08;
        r0 = r4.A03;
        r1.put(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        if (r6 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0111, code lost:
    
        r1 = r8.A01;
        r2 = A07(r7, r5);
        r0 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        if (r0 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        r8.A01 = r2;
        r8.A08.clear();
        r8.A06.clear();
        r8.A07.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        if (r1 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013f, code lost:
    
        r1 = r1.A02;
        r0 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0143, code lost:
    
        if (r1 == r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
    
        r8.A01 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        if (r6 == r4) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0B(C06664u c06664u, K1 k12) {
        int pageId = c06664u.A04(8);
        int A04 = c06664u.A04(16);
        int A042 = c06664u.A04(16);
        int dataFieldLimit = c06664u.A02() + A042;
        int dataFieldLength = A042 * 8;
        int segmentType = c06664u.A01();
        if (dataFieldLength > segmentType) {
            AbstractC06524g.A07(A09(31, 9, 48), A09(0, 31, a.f22543z));
            int segmentType2 = c06664u.A01();
            c06664u.A09(segmentType2);
            return;
        }
        switch (pageId) {
            case 16:
                int i = k12.A03;
                int dataFieldLength2 = A08[0].length();
                if (dataFieldLength2 == 24) {
                    String[] strArr = A08;
                    strArr[2] = "8IE5rQcmaz5UZt5DB4HgynTP0JDS9G2L";
                    strArr[6] = "0jBafq8KrrfMTCoyXHA3EFrvXh6eCdvZ";
                    break;
                } else {
                    A08[0] = "Hq1l6D9egrnTUyhluyir9I8C";
                    break;
                }
            case 17:
                C1038Jx c1038Jx = k12.A01;
                int segmentType3 = k12.A03;
                if (A04 == segmentType3 && c1038Jx != null) {
                    C1040Jz A082 = A08(c06664u, A042);
                    int i4 = c1038Jx.A00;
                    int dataFieldLength3 = A08[4].charAt(14);
                    if (dataFieldLength3 == 57) {
                        A08[0] = "ijH7h91dhg9QFNoxZPsrwXGu";
                        break;
                    } else {
                        String[] strArr2 = A08;
                        strArr2[2] = "Zbq5EbbYoVc51AepmzNMcu8RWeX9tFKS";
                        strArr2[6] = "SzpXTRUgh7e1fMrIr1mTDXGfSUuiig9T";
                        break;
                    }
                }
                break;
            case 18:
                int segmentType4 = k12.A03;
                if (A04 == segmentType4) {
                    C1035Ju A043 = A04(c06664u, A042);
                    SparseArray<C1035Ju> sparseArray = k12.A06;
                    int segmentType5 = A043.A00;
                    sparseArray.put(segmentType5, A043);
                    break;
                } else {
                    int segmentType6 = k12.A02;
                    if (A04 == segmentType6) {
                        C1035Ju A044 = A04(c06664u, A042);
                        SparseArray<C1035Ju> sparseArray2 = k12.A04;
                        int segmentType7 = A044.A00;
                        sparseArray2.put(segmentType7, A044);
                        break;
                    }
                }
                break;
            case 19:
                int segmentType8 = k12.A03;
                if (A04 == segmentType8) {
                    C1037Jw A06 = A06(c06664u);
                    SparseArray<C1037Jw> sparseArray3 = k12.A07;
                    int segmentType9 = A06.A00;
                    sparseArray3.put(segmentType9, A06);
                    break;
                } else {
                    int segmentType10 = k12.A02;
                    if (A04 == segmentType10) {
                        C1037Jw A062 = A06(c06664u);
                        SparseArray<C1037Jw> sparseArray4 = k12.A05;
                        int i6 = A062.A00;
                        int dataFieldLength4 = A08[0].length();
                        if (dataFieldLength4 == 24) {
                            A08[3] = "cNAVN6CCWtYeoU1m0uPi3L7jVIjjgAwx";
                            sparseArray4.put(i6, A062);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
                break;
            case 20:
                int segmentType11 = k12.A03;
                if (A04 == segmentType11) {
                    k12.A00 = A05(c06664u);
                    break;
                }
                break;
        }
        int segmentType12 = c06664u.A02();
        c06664u.A0A(dataFieldLimit - segmentType12);
    }

    public static void A0C(C1037Jw c1037Jw, C1035Ju c1035Ju, int i, int i4, int i6, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c1035Ju.A03;
        } else if (i == 2) {
            iArr = c1035Ju.A02;
        } else {
            iArr = c1035Ju.A01;
        }
        A0D(c1037Jw.A03, iArr, i, i4, i6, paint, canvas);
        A0D(c1037Jw.A02, iArr, i, i4, i6 + 1, paint, canvas);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int i4, int i6, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i9 = i6;
        C06664u c06664u = new C06664u(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        byte[] bArr4 = null;
        int line = i4;
        while (c06664u.A01() != 0) {
            switch (c06664u.A04(8)) {
                case 16:
                    if (i == 3) {
                        bArr2 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i == 2) {
                        bArr2 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        bArr2 = null;
                    }
                    line = A01(c06664u, iArr, bArr2, line, i9, paint, canvas);
                    c06664u.A06();
                    break;
                case 17:
                    if (i == 3) {
                        bArr3 = bArr4 == null ? A0B : bArr4;
                    } else {
                        bArr3 = null;
                    }
                    line = A02(c06664u, iArr, bArr3, line, i9, paint, canvas);
                    c06664u.A06();
                    break;
                case 18:
                    line = A03(c06664u, iArr, null, line, i9, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c06664u);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c06664u);
                    break;
                case 34:
                    bArr4 = A0E(16, 8, c06664u);
                    break;
                case 240:
                    i9 += 2;
                    line = i4;
                    break;
            }
        }
    }

    public static byte[] A0E(int i, int i4, C06664u c06664u) {
        byte[] bArr = new byte[i];
        for (int i6 = 0; i6 < i; i6++) {
            bArr[i6] = (byte) c06664u.A04(i4);
        }
        return bArr;
    }

    public static int[] A0F() {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -16777216;
        String[] strArr = A08;
        if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
            throw new RuntimeException();
        }
        A08[1] = "Jw8cEdbjQQjFC79Gk6sPH9AUdvvWBQg4";
        iArr[3] = -8421505;
        return iArr;
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i4 = (i & 1) != 0 ? p.f9259b : 0;
                iArr[i] = A00(p.f9259b, i4, (i & 2) != 0 ? p.f9259b : 0, (i & 4) != 0 ? p.f9259b : 0);
            } else {
                int i6 = i & 1;
                int i9 = a.f22515R;
                int i10 = i6 != 0 ? a.f22515R : 0;
                int i11 = (i & 2) != 0 ? a.f22515R : 0;
                int i12 = i & 4;
                if (A08[4].charAt(14) != '9') {
                    throw new RuntimeException();
                }
                A08[3] = "UrHD9QQTZDyJKzMppguU3aPtXoZ0irSR";
                if (i12 == 0) {
                    i9 = 0;
                }
                iArr[i] = A00(p.f9259b, i10, i11, i9);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x010d, code lost:
    
        if (r8 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0029, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e4, code lost:
    
        if (r8 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e6, code lost:
    
        r1 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0110, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] A0H() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i6 = p.f9259b;
            if (i4 < 8) {
                int i9 = (i4 & 1) != 0 ? p.f9259b : 0;
                int i10 = (i4 & 2) != 0 ? p.f9259b : 0;
                if ((i4 & 4) == 0) {
                    i6 = 0;
                }
                iArr[i4] = A00(63, i9, i10, i6);
            } else {
                switch (i4 & 136) {
                    case 0:
                        int i11 = (i4 & 1) != 0 ? 85 : 0;
                        iArr[i4] = A00(p.f9259b, i11 + ((i4 & 16) != 0 ? 170 : 0), ((i4 & 2) != 0 ? 85 : 0) + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                        break;
                    case 8:
                        int i12 = ((i4 & 1) != 0 ? 85 : 0) + ((i4 & 16) != 0 ? 170 : 0);
                        int i13 = i4 & 2;
                        if (A08[4].charAt(14) == '9') {
                            A08[0] = "s2RCWxPvpwpJ3GpvuxZigl51";
                            break;
                        }
                        iArr[i4] = A00(a.f22515R, i12, i + ((i4 & 32) != 0 ? 170 : 0), ((i4 & 4) == 0 ? 0 : 85) + ((i4 & 64) == 0 ? 0 : 170));
                        break;
                    case 128:
                        int i14 = ((i4 & 1) != 0 ? 43 : 0) + a.f22515R + ((i4 & 16) != 0 ? 85 : 0);
                        int i15 = ((i4 & 2) != 0 ? 43 : 0) + a.f22515R + ((i4 & 32) != 0 ? 85 : 0);
                        int i16 = ((i4 & 4) == 0 ? 0 : 43) + a.f22515R;
                        int i17 = i4 & 64;
                        if (A08[7].charAt(9) != 'e') {
                            A08[3] = "e63e4cS46GPtzp0vrxC333RpnvVdNaZZ";
                            iArr[i4] = A00(p.f9259b, i14, i15, i16 + (i17 == 0 ? 0 : 85));
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    case 136:
                        int i18 = (i4 & 1) != 0 ? 43 : 0;
                        iArr[i4] = A00(p.f9259b, i18 + ((i4 & 16) != 0 ? 85 : 0), ((i4 & 2) != 0 ? 43 : 0) + ((i4 & 32) != 0 ? 85 : 0), ((i4 & 4) == 0 ? 0 : 43) + ((i4 & 64) == 0 ? 0 : 85));
                        break;
                }
            }
        }
        return iArr;
    }

    public final void A0J() {
        this.A06.A00();
    }
}
