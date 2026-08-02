package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07779h extends AbstractC2231nD {
    public static byte[] A07;
    public static String[] A08 = {"yr7s5jzv1addyUjDczkFmKgb3TbXTjPI", "k5bxDF12X7IfueMvpCyLhsS14secbcRr", "A1nn9z9SPvnfAziOnMuSk0GZzxZ0jVfY", "Bn8GSVMc2Ww3cTp6j1ZQIVGuo4fvIYJ3", "KOSGSA", "kbDMqlVGuQuF7sZpY9G1V32bVqx23m", "bfxskyCfRQ3e5JfVyMYK1TBq", "KPf5jweXKATwb3ocWNu711OjnnCWcsTU"};
    public static final AbstractC2422qK<Integer> A09;
    public static final AbstractC2422qK<Integer> A0A;
    public C2426qQ A00;
    public C07789i A01;
    public C0892Ef A02;
    public final Context A03;
    public final InterfaceC0899Em A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r18.A01.A0A == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r7.isEmpty() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r7.size() != r10.A01) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        r6.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        if (com.instagram.common.viewpoint.core.C07779h.A08[1].charAt(16) == 'p') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        com.instagram.common.viewpoint.core.C07779h.A08[4] = "67hsDi";
        r6.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        r14.addAll(r6);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        com.instagram.common.viewpoint.core.C07779h.A08[4] = "yJ8LwG";
        r6.add(r7);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("D25277746")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T extends AbstractC0894Eh<T>> Pair<C0898El, Integer> A0A(int i, C0901Eo c0901Eo, int[][][] iArr, InterfaceC0893Eg<T> interfaceC0893Eg, Comparator<List<T>> comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        int A02 = c0901Eo.A02();
        for (int i4 = 0; i4 < A02; i4++) {
            if (i == c0901Eo.A03(i4)) {
                C2250nW A072 = c0901Eo.A07(i4);
                int i6 = 0;
                while (i6 < A072.A01) {
                    C2383pg A05 = A072.A05(i6);
                    List<T> A5F = interfaceC0893Eg.A5F(i4, A05, iArr[i4][i6]);
                    boolean[] zArr = new boolean[A05.A01];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i9 = 0;
                    while (true) {
                        int i10 = A05.A01;
                        if (A08[4].length() != 6) {
                            throw new RuntimeException();
                        }
                        A08[7] = "GGTbcpljDMs4NAqJNauGpoXnSvHOQ6AN";
                        if (i9 >= i10) {
                            break;
                        }
                        T t6 = A5F.get(i9);
                        int A082 = t6.A08();
                        if (!zArr[i9] && A082 != 0) {
                            if (A082 == 1) {
                                arrayList = BP.A04(t6);
                                arrayList3.add(t6);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(t6);
                                int i11 = i9 + 1;
                                while (i11 < A05.A01) {
                                    T t9 = A5F.get(i11);
                                    if (t9.A08() == 2 && t6.A09(t9)) {
                                        arrayList.add(t9);
                                        zArr[i11] = true;
                                    }
                                    i11++;
                                    if (A08[1].charAt(16) == 'p') {
                                        A08[7] = "CPvHWQWYEszLaRsxiIiXKw3X1jOClslA";
                                    }
                                }
                            }
                            arrayList4.add(arrayList);
                        }
                        i9++;
                    }
                }
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        if (A08[1].charAt(16) != 'p') {
            throw new RuntimeException();
        }
        A08[4] = "ji0WxR";
        if (isEmpty) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            iArr2[i12] = ((AbstractC0894Eh) list.get(i12)).A01;
        }
        AbstractC0894Eh abstractC0894Eh = (AbstractC0894Eh) list.get(0);
        return Pair.create(new C0898El(abstractC0894Eh.A03, iArr2), Integer.valueOf(abstractC0894Eh.A00));
    }

    public static String A0J(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A08[5].length() == 27) {
                throw new RuntimeException();
            }
            A08[4] = "58VoVy";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 10);
            i9++;
        }
    }

    public static void A0M() {
        A07 = new byte[]{91, 92, -112, Byte.MAX_VALUE, -124, -118, 59, 126, -125, 124, -119, -119, c.f17103a, -121, 59, 126, -118, -112, -119, -113, 59, 126, -118, -119, -114, -113, -115, 124, -124, -119, -113, -114, 59, 126, 124, -119, -119, -118, -113, 59, 125, c.f17103a, 59, 124, -117, -117, -121, -124, c.f17103a, Byte.MAX_VALUE, 59, -110, -124, -113, -125, -118, -112, -113, 59, -115, c.f17103a, -127, c.f17103a, -115, c.f17103a, -119, 126, c.f17103a, 59, -113, -118, 59, 94, -118, -119, -113, c.f17103a, -109, -113, 73, 59, 93, -112, -124, -121, Byte.MAX_VALUE, 59, -113, -125, c.f17103a, 59, -113, -115, 124, 126, -122, 59, -114, c.f17103a, -121, c.f17103a, 126, -113, -118, -115, 59, -124, -119, -114, -113, 124, -119, 126, c.f17103a, 59, -110, -124, -113, -125, 59, -118, -119, c.f17103a, 59, -118, -127, 59, -113, -125, c.f17103a, 59, -119, -118, -119, 72, Byte.MAX_VALUE, c.f17103a, -117, -115, c.f17103a, 126, 124, -113, c.f17103a, Byte.MAX_VALUE, 59, 126, -118, -119, -114, -113, -115, -112, 126, -113, -118, -115, -114, 59, -113, -125, 124, -113, 59, -113, 124, -122, c.f17103a, 59, 124, 59, 94, -118, -119, -113, c.f17103a, -109, -113, 59, 124, -115, -126, -112, -120, c.f17103a, -119, -113, 73, -103, -70, -69, -74, -54, -63, -55, -87, -57, -74, -72, -64, -88, -70, -63, -70, -72, -55, -60, -57, -57, -37, -54, -49, -43, -107, -57, -55, -103, -83, -63, -80, -75, -69, 123, -83, -81, c.f17103a, -49, -29, -46, -41, -35, -99, -45, -49, -47, -95, -70, -50, -67, -62, -56, -120, -66, -70, -68, -116, -122, -61, -56, -68, -54, -61, -71, -119, 124, 119, 120, -126, 66, 116, -119, 67, 68, -98, -111, -116, -115, -105, 87, -119, -98, -117, -33, -46, -51, -50, -40, -104, -51, -40, -43, -53, -30, -106, -33, -46, -36, -46, -40, -41, -92, -105, -110, -109, -99, 93, -106, -109, -92, -111, -11, -24, -29, -28, -18, -82, -9, -84, -11, -19, -29, -83, -18, -19, -79, -83, -11, -17, -72};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(C2250nW c2250nW, C2379pc c2379pc, Map<Integer, C2381pe> map) {
        C2381pe c2381pe;
        for (int i = 0; i < c2250nW.A01; i++) {
            C2381pe c2381pe2 = c2379pc.A0G.get(c2250nW.A05(i));
            if (c2381pe2 != null && ((c2381pe = map.get(Integer.valueOf(c2381pe2.A01()))) == null || (c2381pe.A01.isEmpty() && !c2381pe2.A01.isEmpty()))) {
                map.put(Integer.valueOf(c2381pe2.A01()), c2381pe2);
            }
        }
    }

    static {
        A0M();
        A09 = AbstractC2422qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.EZ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C07779h.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC2422qK.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.Ea
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C07779h.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public C07779h() {
        this(C07789i.A0J, new C2245nR());
    }

    @MetaExoPlayerCustomization(type = {"NEW_CONSTRUCTOR"}, value = "Backward Compatible Constructor")
    public C07779h(InterfaceC0899Em interfaceC0899Em) {
        this(C07789i.A0J, interfaceC0899Em);
    }

    @Deprecated
    public C07779h(C2379pc c2379pc, InterfaceC0899Em interfaceC0899Em) {
        this(c2379pc, interfaceC0899Em, null);
    }

    public C07779h(C2379pc c2379pc, InterfaceC0899Em interfaceC0899Em, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = interfaceC0899Em;
        if (c2379pc instanceof C07789i) {
            this.A01 = (C07789i) c2379pc;
        } else {
            C07789i defaultParameters = context == null ? C07789i.A0J : C07789i.A02(context);
            this.A01 = defaultParameters.A0P().A0u(c2379pc).A0p();
        }
        this.A00 = C2426qQ.A07;
        this.A06 = context != null && C5C.A18(context);
        if (!this.A06 && context != null && C5C.A02 >= 32) {
            this.A02 = C0892Ef.A00(context);
        }
        if (this.A01.A08 && context == null) {
            AbstractC06524g.A07(A0J(188, 20, 75), A0J(1, 187, 17));
        }
    }

    public static int A00(int i, int i4) {
        if (i != 0 && i == i4) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i & i4);
    }

    public static int A02(C2420qI c2420qI, String str, boolean z6) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = c2420qI.A0V;
            String[] strArr = A08;
            if (strArr[6].length() != strArr[3].length()) {
                A08[7] = "utaRfuDCbQDIc6IM3a2tNPgwwhECnGgZ";
                if (str.equals(str2)) {
                    if (A08[4].length() != 6) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A08;
                    strArr2[6] = "bdPum8qTTDlHeCQDHcvgSGFt";
                    strArr2[3] = "zx28NE7Z14W3AzzAuoWnzSjL1M2eUdTs";
                    return 4;
                }
            }
            throw new RuntimeException();
        }
        String A0K = A0K(str);
        String A0K2 = A0K(c2420qI.A0V);
        if (A0K2 == null || A0K == null) {
            return (z6 && A0K2 == null) ? 1 : 0;
        }
        if (A0K2.startsWith(A0K) || A0K.startsWith(A0K2)) {
            return 3;
        }
        String A0J = A0J(0, 1, 36);
        String str3 = C5C.A1P(A0K2, A0J)[0];
        String formatMainLanguage = C5C.A1P(A0K, A0J)[0];
        String[] strArr3 = A08;
        String str4 = strArr3[6];
        String formatLanguage = strArr3[3];
        if (str4.length() != formatLanguage.length()) {
            A08[4] = "rXSrCW";
            if (!str3.equals(formatMainLanguage)) {
                return 0;
            }
            return 2;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(C2383pg c2383pg, int i, int i4, boolean z6) {
        if (i == Integer.MAX_VALUE || i4 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int i6 = Integer.MAX_VALUE;
        for (int videoPixels = 0; videoPixels < maxVideoPixelsToRetain; videoPixels++) {
            C2420qI A082 = c2383pg.A08(videoPixels);
            int maxVideoPixelsToRetain = A082.A0L;
            if (maxVideoPixelsToRetain > 0) {
                int maxVideoPixelsToRetain2 = A082.A0A;
                if (maxVideoPixelsToRetain2 > 0) {
                    int i9 = A082.A0L;
                    int maxVideoPixelsToRetain3 = A082.A0A;
                    Point A092 = A09(z6, i, i4, i9, maxVideoPixelsToRetain3);
                    int i10 = A082.A0L;
                    int maxVideoPixelsToRetain4 = A082.A0A;
                    int i11 = i10 * maxVideoPixelsToRetain4;
                    int i12 = A082.A0L;
                    int maxVideoPixelsToRetain5 = A092.x;
                    if (i12 >= ((int) (maxVideoPixelsToRetain5 * 0.98f))) {
                        int i13 = A082.A0A;
                        int maxVideoPixelsToRetain6 = A092.y;
                        if (i13 >= ((int) (maxVideoPixelsToRetain6 * 0.98f)) && i11 < i6) {
                            i6 = i11;
                        }
                    }
                }
            }
        }
        return i6;
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        if (A08[4].length() != 6) {
            throw new RuntimeException();
        }
        A08[1] = "gB7bm57sTKDjvfC8pNahT9wGVNX6TDKL";
        return intValue - intValue2;
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A07(String str) {
        char c9;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(A0J(272, 18, 95))) {
                    c9 = 0;
                    switch (c9) {
                        case 0:
                            return 5;
                        case 1:
                            return 4;
                        case 2:
                            return 3;
                        case 3:
                            return 2;
                        case 4:
                            return 1;
                        default:
                            return 0;
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case -1662735862:
                String[] strArr = A08;
                if (strArr[6].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[1] = "cKYBOGEqW486lDdcpu93NQ9TicEen6vk";
                if (str.equals(A0J(253, 10, 9))) {
                    c9 = 1;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case -1662541442:
                if (str.equals(A0J(290, 10, 36))) {
                    c9 = 2;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case 1331836730:
                if (str.equals(A0J(263, 9, 30))) {
                    c9 = 4;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            case 1599127257:
                if (str.equals(A0J(300, 19, 117))) {
                    c9 = 3;
                    switch (c9) {
                    }
                }
                c9 = 65535;
                switch (c9) {
                }
            default:
                c9 = 65535;
                switch (c9) {
                }
        }
    }

    @MetaExoPlayerCustomization("Made public in D13395849")
    public static Point A09(boolean z6, int tempViewportWidth, int i, int i4, int i6) {
        if (z6) {
            if ((i4 > i6) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i4 * i >= i6 * tempViewportWidth) {
            return new Point(tempViewportWidth, C5C.A05(tempViewportWidth * i6, i4));
        }
        return new Point(C5C.A05(i * i4, i6), i);
    }

    private final Pair<C0898El, Integer> A0B(C0901Eo c0901Eo, int[][][] iArr, final C07789i c07789i, final String str) throws AD {
        return A0A(3, c0901Eo, iArr, new InterfaceC0893Eg() { // from class: com.facebook.ads.redexgen.X.nN
            @Override // com.instagram.common.viewpoint.core.InterfaceC0893Eg
            public final List A5F(int i, C2383pg c2383pg, int[] iArr2) {
                BP A02;
                A02 = C2234nG.A02(i, c2383pg, C07789i.this, iArr2, str);
                return A02;
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EY
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2234nG.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C0898El, Integer> A0C(C0901Eo c0901Eo, int[][][] iArr, int[] iArr2, final C07789i c07789i) throws AD {
        final boolean z6 = false;
        int i = 0;
        while (true) {
            if (i < c0901Eo.A02()) {
                if (2 == c0901Eo.A03(i) && c0901Eo.A07(i).A01 > 0) {
                    z6 = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return A0A(1, c0901Eo, iArr, new InterfaceC0893Eg() { // from class: com.facebook.ads.redexgen.X.nO
            @Override // com.instagram.common.viewpoint.core.InterfaceC0893Eg
            public final List A5F(int i4, C2383pg c2383pg, int[] iArr3) {
                return C07779h.this.A0e(c07789i, z6, i4, c2383pg, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EX
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2240nM.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C0898El, Integer> A0D(C0901Eo c0901Eo, int[][][] iArr, final int[] iArr2, final C07789i c07789i, final String str) throws AD {
        return A0A(2, c0901Eo, iArr, new InterfaceC0893Eg() { // from class: com.facebook.ads.redexgen.X.nQ
            @Override // com.instagram.common.viewpoint.core.InterfaceC0893Eg
            public final List A5F(int i, C2383pg c2383pg, int[] iArr3) {
                BP A06;
                A06 = C2233nF.A06(i, c2383pg, C07789i.this, iArr3, str, iArr2[i]);
                return A06;
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.EW
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2233nF.A05((List) obj, (List) obj2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C0898El A0E(int i, C2250nW c2250nW, int[][] iArr, C07789i c07789i) throws AD {
        C2383pg c2383pg = null;
        int i4 = 0;
        C0889Ec c0889Ec = null;
        int i6 = 0;
        loop0: while (i6 < c2250nW.A01) {
            C2383pg trackGroup = c2250nW.A05(i6);
            int[] iArr2 = iArr[i6];
            int groupIndex = 0;
            while (true) {
                int i9 = trackGroup.A01;
                int selectedTrackIndex = A08[7].charAt(4);
                if (selectedTrackIndex == 114) {
                    break loop0;
                }
                A08[7] = "eXe48tlcaaFOVphj3tBJsJZ33XViaUIe";
                if (groupIndex < i9) {
                    int i10 = iArr2[groupIndex];
                    int selectedTrackIndex2 = A08[7].charAt(4);
                    if (selectedTrackIndex2 == 114) {
                        throw new RuntimeException();
                    }
                    A08[7] = "FFBXZuvHsKfXoft1igGzNsuMgLJqlaBK";
                    if (A0S(i10, c07789i.A0B)) {
                        C0889Ec trackScore = new C0889Ec(trackGroup.A08(groupIndex), iArr2[groupIndex]);
                        if (c0889Ec != null) {
                            int compareTo = trackScore.compareTo(c0889Ec);
                            String[] strArr = A08;
                            String str = strArr[0];
                            String str2 = strArr[2];
                            int selectedTrackIndex3 = str.charAt(9);
                            if (selectedTrackIndex3 == str2.charAt(9)) {
                                break loop0;
                            }
                            A08[1] = "us6BKPnONaHSk6j2pgBHNNPTLKUclzqr";
                            if (compareTo <= 0) {
                            }
                        }
                        c2383pg = trackGroup;
                        i4 = groupIndex;
                        c0889Ec = trackScore;
                    }
                    groupIndex++;
                }
            }
            throw new RuntimeException();
        }
        if (c2383pg == null) {
            return null;
        }
        return new C0898El(c2383pg, i4);
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(250, 3, 75))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z6;
        synchronized (this.A05) {
            z6 = this.A01.A08 && !this.A06 && C5C.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z6) {
            A01();
        }
    }

    public static void A0P(C0901Eo c0901Eo, C2379pc c2379pc, C0898El[] c0898ElArr) {
        C0898El c0898El;
        int A02 = c0901Eo.A02();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < A02; i++) {
            A0N(c0901Eo.A07(i), c2379pc, hashMap);
        }
        A0N(c0901Eo.A06(), c2379pc, hashMap);
        for (int i4 = 0; i4 < A02; i4++) {
            int rendererCount = c0901Eo.A03(i4);
            C2381pe c2381pe = (C2381pe) hashMap.get(Integer.valueOf(rendererCount));
            if (c2381pe != null) {
                boolean isEmpty = c2381pe.A01.isEmpty();
                if (A08[7].charAt(4) == 'r') {
                    throw new RuntimeException();
                }
                A08[4] = "YbaSeo";
                if (!isEmpty && c0901Eo.A07(i4).A04(c2381pe.A00) != -1) {
                    c0898El = new C0898El(c2381pe.A00, AbstractC0804As.A0B(c2381pe.A01));
                } else {
                    c0898El = null;
                }
                c0898ElArr[i4] = c0898El;
            }
        }
    }

    public static void A0Q(C0901Eo c0901Eo, C07789i c07789i, C0898El[] c0898ElArr) {
        C0898El c0898El;
        int A02 = c0901Eo.A02();
        for (int i = 0; i < A02; i++) {
            C2250nW A072 = c0901Eo.A07(i);
            if (c07789i.A0S(i, A072)) {
                C2235nH A0Q = c07789i.A0Q(i, A072);
                String[] strArr = A08;
                String str = strArr[6];
                String str2 = strArr[3];
                int rendererIndex = str.length();
                int rendererCount = str2.length();
                if (rendererIndex == rendererCount) {
                    throw new RuntimeException();
                }
                A08[5] = "K8f1XF422sl3cXXm";
                if (A0Q != null) {
                    int length = A0Q.A03.length;
                    String[] strArr2 = A08;
                    String str3 = strArr2[6];
                    String str4 = strArr2[3];
                    int rendererIndex2 = str3.length();
                    int rendererCount2 = str4.length();
                    if (rendererIndex2 == rendererCount2) {
                        throw new RuntimeException();
                    }
                    A08[4] = "KnBpd5";
                    if (length != 0) {
                        int rendererCount3 = A0Q.A00;
                        C2383pg A05 = A072.A05(rendererCount3);
                        int[] iArr = A0Q.A03;
                        int rendererIndex3 = A0Q.A02;
                        c0898El = new C0898El(A05, iArr, rendererIndex3);
                        c0898ElArr[i] = c0898El;
                    }
                }
                c0898El = null;
                c0898ElArr[i] = c0898El;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r4 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (A0W(r12[r7], r11.A07(r7), r3) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r4 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r9 == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r8 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r4 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r4 != 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0R(C0901Eo c0901Eo, int[][][] iArr, C07427s[] c07427sArr, InterfaceC2232nE[] interfaceC2232nEArr) {
        int i = -1;
        int i4 = -1;
        int i6 = 1;
        int i9 = 0;
        while (true) {
            int i10 = c0901Eo.A02();
            int tunnelingVideoRendererIndex = A08[4].length();
            if (tunnelingVideoRendererIndex == 6) {
                A08[1] = "NZY9D9dgjYLNZ0XYpF4W2GrX5uVEwVhV";
                if (i9 >= i10) {
                    break;
                }
                int rendererType = c0901Eo.A03(i9);
                InterfaceC2232nE interfaceC2232nE = interfaceC2232nEArr[i9];
                String[] strArr = A08;
                String str = strArr[0];
                String str2 = strArr[2];
                int tunnelingVideoRendererIndex2 = str.charAt(9);
                int tunnelingAudioRendererIndex = str2.charAt(9);
                if (tunnelingVideoRendererIndex2 != tunnelingAudioRendererIndex) {
                    A08[4] = "nPMicF";
                } else {
                    String[] strArr2 = A08;
                    strArr2[6] = "5F5ko3NIDU1YMXmZZUDVXdSE";
                    strArr2[3] = "1c60xx4jFCOb1nSxKeVAoj10cRAS07b7";
                }
            } else {
                throw new RuntimeException();
            }
            i9++;
        }
        int tunnelingAudioRendererIndex2 = (i == -1 || i4 == -1) ? 0 : 1;
        if ((i6 & tunnelingAudioRendererIndex2) != 0) {
            C07427s c07427s = new C07427s(true);
            c07427sArr[i] = c07427s;
            c07427sArr[i4] = c07427s;
        }
    }

    @MetaExoPlayerCustomization("Made public for customization on DashManifestHelper")
    public static boolean A0S(int i, boolean z6) {
        int A03 = AbstractC07327i.A03(i);
        return A03 == 4 || (z6 && A03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(C2420qI c2420qI) {
        boolean z6;
        synchronized (this.A05) {
            z6 = !this.A01.A08 || this.A06 || c2420qI.A06 <= 2 || (A0U(c2420qI) && (C5C.A02 < 32 || this.A02 == null || !this.A02.A06())) || (C5C.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, c2420qI));
        }
        return z6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean A0U(C2420qI c2420qI) {
        char c9;
        if (c2420qI.A0W == null) {
            return false;
        }
        String str = c2420qI.A0W;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A0J(236, 14, 79))) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 187078296:
                if (str.equals(A0J(BaseATView.a.f10557G, 9, 92))) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 187078297:
                if (str.equals(A0J(217, 9, 66))) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1504578661:
                if (str.equals(A0J(226, 10, 100))) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
        }
        return false;
    }

    public static boolean A0W(int[][] iArr, C2250nW c2250nW, InterfaceC2232nE interfaceC2232nE) {
        if (interfaceC2232nE == null) {
            return false;
        }
        int A04 = c2250nW.A04(interfaceC2232nE.A9L());
        for (int i = 0; i < interfaceC2232nE.length(); i++) {
            int trackGroupIndex = AbstractC07327i.A05(iArr[A04][interfaceC2232nE.A8H(i)]);
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        return true;
    }

    private final C0898El[] A0X(C0901Eo c0901Eo, int[][][] iArr, int[] iArr2, C07789i c07789i) throws AD {
        String str;
        int A02 = c0901Eo.A02();
        C0898El[] c0898ElArr = new C0898El[A02];
        Pair<C0898El, Integer> A0C = A0C(c0901Eo, iArr, iArr2, c07789i);
        if (A0C != null) {
            Object obj = A0C.second;
            String[] strArr = A08;
            String str2 = strArr[0];
            String str3 = strArr[2];
            int charAt = str2.charAt(9);
            int rendererCount = str3.charAt(9);
            if (charAt == rendererCount) {
                throw new RuntimeException();
            }
            A08[7] = "yBKbxgl1qoYBYNtasAVV61g1RQWhRN9O";
            c0898ElArr[((Integer) obj).intValue()] = (C0898El) A0C.first;
        }
        if (A0C == null) {
            str = null;
        } else {
            C2383pg c2383pg = ((C0898El) A0C.first).A01;
            int rendererCount2 = ((C0898El) A0C.first).A02[0];
            str = c2383pg.A08(rendererCount2).A0V;
        }
        Pair<C0898El, Integer> A0D = A0D(c0901Eo, iArr, iArr2, c07789i, str);
        if (A0D != null) {
            c0898ElArr[((Integer) A0D.second).intValue()] = (C0898El) A0D.first;
        }
        Pair<C0898El, Integer> A0B = A0B(c0901Eo, iArr, c07789i, str);
        if (A0B != null) {
            c0898ElArr[((Integer) A0B.second).intValue()] = (C0898El) A0B.first;
        }
        for (int i = 0; i < A02; i++) {
            int i4 = c0901Eo.A03(i);
            if (i4 != 2 && i4 != 1) {
                String[] strArr2 = A08;
                String str4 = strArr2[0];
                String str5 = strArr2[2];
                int charAt2 = str4.charAt(9);
                int rendererCount3 = str5.charAt(9);
                if (charAt2 == rendererCount3) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A08;
                strArr3[6] = "1xsmyE1OdjkvrsbXr4cEFZBV";
                strArr3[3] = "D4xPicyrc2caIP01Cw6NBhV2pRXBVsmG";
                if (i4 != 3) {
                    c0898ElArr[i] = A0E(i4, c0901Eo.A07(i), iArr[i], c07789i);
                }
            }
        }
        return c0898ElArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0909Ew
    public final boolean A0Y() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2231nD
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "final removed in D35162315")
    public final Pair<C07427s[], InterfaceC2232nE[]> A0d(C0901Eo c0901Eo, int[][][] iArr, int[] iArr2, C2268no c2268no, Timeline timeline) throws AD {
        C07789i c07789i;
        synchronized (this.A05) {
            try {
                c07789i = this.A01;
                if (c07789i.A08 && C5C.A02 >= 32 && this.A02 != null) {
                    this.A02.A03(this, (Looper) AbstractC06443y.A02(Looper.myLooper()));
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        int A02 = c0901Eo.A02();
        C0898El[] A0X = A0X(c0901Eo, iArr, iArr2, c07789i);
        A0P(c0901Eo, c07789i, A0X);
        A0Q(c0901Eo, c07789i, A0X);
        for (int rendererCount = 0; rendererCount < A02; rendererCount++) {
            int A03 = c0901Eo.A03(rendererCount);
            if (c07789i.A0R(rendererCount) || c07789i.A0H.contains(Integer.valueOf(A03))) {
                A0X[rendererCount] = null;
            }
        }
        InterfaceC2232nE[] A5b = this.A04.A5b(A0X, A00(), c2268no, timeline);
        C07427s[] c07427sArr = new C07427s[A02];
        for (int i = 0; i < A02; i++) {
            c07427sArr[i] = !(c07789i.A0R(i) || c07789i.A0H.contains(Integer.valueOf(c0901Eo.A03(i)))) && (c0901Eo.A03(i) == -2 || A5b[i] != null) ? C07427s.A01 : null;
        }
        if (c07789i.A0D) {
            A0R(c0901Eo, iArr, c07427sArr, A5b);
        }
        return Pair.create(c07427sArr, A5b);
    }

    public final /* synthetic */ BP A0e(C07789i c07789i, boolean z6, int i, C2383pg c2383pg, int[] iArr) {
        return C2240nM.A03(i, c2383pg, c07789i, iArr, z6, new InterfaceC2091kj() { // from class: com.facebook.ads.redexgen.X.nP
            @Override // com.instagram.common.viewpoint.core.InterfaceC2091kj
            public final boolean A4C(Object obj) {
                boolean A0T;
                A0T = C07779h.this.A0T((C2420qI) obj);
                return A0T;
            }
        });
    }
}
