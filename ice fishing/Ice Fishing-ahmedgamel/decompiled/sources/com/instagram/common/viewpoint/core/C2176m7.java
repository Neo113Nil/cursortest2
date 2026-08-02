package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.anythink.basead.exoplayer.b;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@MetaExoPlayerCustomization("Rename the class for A/B Testing")
/* renamed from: com.facebook.ads.redexgen.X.m7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2176m7 implements H9 {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final HD A0b;
    public static final C2420qI A0c;
    public static final byte[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public C06674v A0D;
    public HA A0E;
    public JA A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC0967Hd[] A0I;
    public InterfaceC0967Hd[] A0J;
    public final int A0K;
    public final SparseArray<JA> A0L;
    public final C06674v A0M;
    public final C06674v A0N;
    public final C06674v A0O;
    public final C06674v A0P;
    public final C06674v A0Q;
    public final AnonymousClass53 A0R;
    public final InterfaceC0967Hd A0S;
    public final I0 A0T;
    public final JO A0U;
    public final ArrayDeque<C2183mE> A0V;
    public final ArrayDeque<J9> A0W;
    public final List<C2420qI> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(JA ja, int i, int i4, C06674v c06674v, int i6) throws C3K {
        int i9;
        int i10 = i6;
        c06674v.A0f(8);
        int A00 = AbstractC1009Iu.A00(c06674v.A0C());
        JO jo = ja.A05.A03;
        JQ jq = ja.A09;
        J1 j12 = (J1) C5C.A0f(jq.A06);
        jq.A0C[i] = c06674v.A0L();
        jq.A0E[i] = jq.A04;
        if ((A00 & 1) != 0) {
            long[] jArr = jq.A0E;
            jArr[i] = jArr[i] + c06674v.A0C();
        }
        boolean z6 = (A00 & 4) != 0;
        int i11 = j12.A01;
        if (z6) {
            i11 = c06674v.A0C();
        }
        boolean z9 = (A00 & 256) != 0;
        boolean z10 = (A00 & 512) != 0;
        boolean z11 = (A00 & 1024) != 0;
        boolean z12 = (A00 & 2048) != 0;
        long j6 = A0a(jo) ? ((long[]) C5C.A0f(jo.A09))[0] : 0L;
        int[] iArr = jq.A0B;
        long[] jArr2 = jq.A0D;
        boolean[] zArr = jq.A0G;
        boolean z13 = jo.A03 == 2 && (i4 & 1) != 0;
        int i12 = i10 + jq.A0C[i];
        long j9 = jo.A06;
        long j10 = jq.A05;
        while (i10 < i12) {
            if (z9) {
                i9 = c06674v.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                i9 = j12.A00;
            }
            int A002 = A00(i9);
            int A003 = A00(z10 ? c06674v.A0C() : j12.A03);
            int A0C = z11 ? c06674v.A0C() : (i10 == 0 && z6) ? i11 : j12.A01;
            jArr2[i10] = C5C.A0U(((z12 ? c06674v.A0C() : 0) + j10) - j6, 1000000L, j9);
            if (!jq.A09) {
                jArr2[i10] = jArr2[i10] + ja.A05.A02;
            }
            iArr[i10] = A003;
            zArr[i10] = ((A0C >> 16) & 1) == 0 && (!z13 || i10 == 0);
            j10 += A002;
            i10++;
        }
        jq.A05 = j10;
        return i12;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C2216my> A05(C06674v c06674v, long j6) throws C3K {
        long A0R;
        long A0R2;
        c06674v.A0f(8);
        int A01 = AbstractC1009Iu.A01(c06674v.A0C());
        c06674v.A0g(4);
        long A0Q = c06674v.A0Q();
        if (A01 == 0) {
            A0R = c06674v.A0Q();
            A0R2 = j6 + c06674v.A0Q();
        } else {
            A0R = c06674v.A0R();
            A0R2 = j6 + c06674v.A0R();
        }
        long A0U = C5C.A0U(A0R, 1000000L, A0Q);
        c06674v.A0g(2);
        int A0M = c06674v.A0M();
        int[] iArr = new int[A0M];
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        long[] jArr3 = new long[A0M];
        long j9 = A0U;
        for (int i = 0; i < A0M; i++) {
            int A0C = c06674v.A0C();
            if ((Integer.MIN_VALUE & A0C) != 0) {
                throw C3K.A01(A0A(756, 28, 79), null);
            }
            long A0Q2 = c06674v.A0Q();
            iArr[i] = Integer.MAX_VALUE & A0C;
            jArr[i] = A0R2;
            jArr3[i] = j9;
            A0R += A0Q2;
            j9 = C5C.A0U(A0R, 1000000L, A0Q);
            jArr2[i] = j9 - jArr3[i];
            c06674v.A0g(4);
            A0R2 += iArr[i];
        }
        return Pair.create(Long.valueOf(A0U), new C2216my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JA A09(C06674v c06674v, SparseArray<JA> sparseArray, boolean z6) {
        c06674v.A0f(8);
        int A00 = AbstractC1009Iu.A00(c06674v.A0C());
        JA valueAt = z6 ? sparseArray.valueAt(0) : sparseArray.get(c06674v.A0C());
        if (valueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0R = c06674v.A0R();
            valueAt.A09.A04 = A0R;
            valueAt.A09.A03 = A0R;
        }
        J1 j12 = valueAt.A04;
        valueAt.A09.A06 = new J1((A00 & 2) != 0 ? c06674v.A0C() - 1 : j12.A02, (A00 & 8) != 0 ? c06674v.A0C() : j12.A00, (A00 & 16) != 0 ? c06674v.A0C() : j12.A03, (A00 & 32) != 0 ? c06674v.A0C() : j12.A01);
        return valueAt;
    }

    public static String A0A(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Z, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 74);
            i9++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, c.f17105c, 40, 44, 57, 40, c.f17105c, 109, 57, 37, 44, 35, 109, 43, c.f17105c, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, 61, 33, 40, 109, 46, 34, 56, 35, 57, 47, 26, 1, 3, 78, 29, 7, 20, 11, 78, 2, 11, 29, 29, 78, 26, 6, 15, 0, 78, 6, 11, 15, 10, 11, 28, 78, 2, 11, 0, 9, 26, 6, 78, 70, 27, 0, 29, 27, 30, 30, 1, 28, 26, 11, 10, 71, c.f17104b, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, 29, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, c.f17105c, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, 61, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, 14, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, 31, 113, 126, 115, 31, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, c.f17105c, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, c.f17105c, 37, 54, 41, 108, 100, 57, 34, c.f17105c, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, c.f17105c, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, 23, 23, 2, 20, 5, 81, 5, 30, 81, 20, 31, 18, 3, 8, 1, 5, 24, 30, 31, 81, 21, 16, 5, 16, 81, 6, 16, 2, 81, 31, 20, 22, 16, 5, 24, 7, 20, 95, 120, 81, 81, 68, 82, 67, 23, 67, 88, 23, 82, 89, 83, 23, 88, 81, 23, 90, 83, 86, 67, 23, c.f17104b, 86, 68, 23, 89, 82, 80, 86, 67, 94, 65, 82, 25, 27, 34, 49, 38, 38, 61, 48, 61, 58, 51, 116, 0, 38, 53, 55, c.f17105c, 17, 58, 55, 38, 45, 36, 32, 61, 59, 58, 22, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, 61, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, 25, 10, 80, 3, 17, 29, 0, 28, 21, 80, 19, 31, 5, 30, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, 61, c.f17105c, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, c.f17105c, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, c.f17105c, 50, Byte.MAX_VALUE, 78, 118, 116, 109, 109, 116, 115, 122, 61, 124, 105, 114, 112, 61, 106, 116, 105, 117, 61, 113, 120, 115, 122, 105, 117, 61, 35, 61, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, 61, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 114, 55, c.f17105c, 33, 53, 114, 36, 55, 32, 33, 59, 61, 60, 104, 114, 23, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, Byte.MAX_VALUE, 108, 41, Byte.MAX_VALUE, 104, 101, 124, 108, 51, 41, 35, 24, 19, 14, 6, 19, 21, 2, 19, 18, 86, 5, 23, 31, 25, 86, 19, 24, 2, 4, 15, 86, 21, 25, 3, 24, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, c.f17104b, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, c.f17104b, 4, 66, 75, 81, 74, c.f17104b, 4, 12, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, c.f17104b, 13, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, Byte.MAX_VALUE, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 65, 20, 84, 73, 13, 20, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C06674v c06674v, Uri uri) {
        String str;
        String str2;
        long A0U;
        long A0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c06674v.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int A01 = AbstractC1009Iu.A01(c06674v.A0C());
        long j6 = b.f7168b;
        long j9 = b.f7168b;
        switch (A01) {
            case 0:
                str = (String) AbstractC06443y.A01(c06674v.A0U());
                str2 = (String) AbstractC06443y.A01(c06674v.A0U());
                long A0Q2 = c06674v.A0Q();
                j6 = C5C.A0U(c06674v.A0Q(), 1000000L, A0Q2);
                if (this.A0C != b.f7168b) {
                    j9 = this.A0C + j6;
                }
                A0U = C5C.A0U(c06674v.A0Q(), 1000L, A0Q2);
                A0Q = c06674v.A0Q();
                break;
            case 1:
                long A0Q3 = c06674v.A0Q();
                j9 = C5C.A0U(c06674v.A0R(), 1000000L, A0Q3);
                A0U = C5C.A0U(c06674v.A0Q(), 1000L, A0Q3);
                A0Q = c06674v.A0Q();
                str = (String) AbstractC06443y.A01(c06674v.A0U());
                str2 = (String) AbstractC06443y.A01(c06674v.A0U());
                break;
            default:
                AbstractC06524g.A07(A0A(BaseATView.a.f10553C, 22, 75), A0A(645, 35, 24) + A01);
                return;
        }
        byte[] bArr = new byte[c06674v.A07()];
        c06674v.A0k(bArr, 0, c06674v.A07());
        int i = 0;
        C06674v c06674v2 = new C06674v(this.A0T.A01(new EventMessage(str, str2, A0U, A0Q, bArr)));
        int A07 = c06674v2.A07();
        InterfaceC0967Hd[] interfaceC0967HdArr = this.A0J;
        int length = interfaceC0967HdArr.length;
        int i4 = 0;
        while (i4 < length) {
            InterfaceC0967Hd interfaceC0967Hd = interfaceC0967HdArr[i4];
            c06674v2.A0f(i);
            interfaceC0967Hd.AKf(uri);
            interfaceC0967Hd.AIr(c06674v2, A07);
            i4++;
            i = 0;
        }
        if (j9 == b.f7168b) {
            this.A0W.addLast(new J9(j6, true, A07));
            this.A03 += A07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new J9(j9, false, A07));
            this.A03 += A07;
            return;
        }
        if (this.A0R != null) {
            AnonymousClass53 anonymousClass53 = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                j9 = anonymousClass53.A05(j9);
            } else {
                j9 = anonymousClass53.A05(j9);
            }
        }
        if (this.A0A != b.f7168b && !MetaExoPlayerUpgradeConfig.A03(EnumC2020jX.A11)) {
            j9 = this.A0A;
        }
        InterfaceC0967Hd[] interfaceC0967HdArr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (InterfaceC0967Hd interfaceC0967Hd2 : interfaceC0967HdArr2) {
            interfaceC0967Hd2.AIu(j9, 1, A07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(C2183mE c2183mE, SparseArray<JA> sparseArray, boolean z6, int i, byte[] bArr) throws C3K {
        JA A09 = A09(((C2182mD) AbstractC06443y.A01(c2183mE.A07(1952868452))).A00, sparseArray, z6);
        if (A09 == null) {
            return;
        }
        JQ jq = A09.A09;
        long j6 = jq.A05;
        boolean z9 = jq.A09;
        A09.A08();
        A09.A06 = true;
        C2182mD A07 = c2183mE.A07(1952867444);
        if (A07 == null || (i & 2) != 0) {
            jq.A05 = j6;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            jq.A09 = z9;
        } else {
            jq.A05 = A03(A07.A00);
            jq.A09 = true;
        }
        A0S(c2183mE, A09, i);
        JO jo = A09.A05.A03;
        Object A01 = AbstractC06443y.A01(jq.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        JP A00 = jo.A00(((J1) A01).A02);
        C2182mD A072 = c2183mE.A07(1935763834);
        if (A072 != null) {
            A0V((JP) AbstractC06443y.A01(A00), A072.A00, jq);
        }
        C2182mD A073 = c2183mE.A07(1935763823);
        if (A073 != null) {
            A0I(A073.A00, jq);
        }
        C2182mD A074 = c2183mE.A07(1936027235);
        if (A074 != null) {
            A0J(A074.A00, jq);
        }
        A0T(c2183mE, A00 != null ? A00.A02 : null, jq);
        int size = c2183mE.A02.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2182mD c2182mD = c2183mE.A02.get(i4);
            if (((AbstractC1009Iu) c2182mD).A00 == 1970628964) {
                A0K(c2182mD.A00, jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C2183mE c2183mE, String str, JQ jq) throws C3K {
        C06674v c06674v = null;
        C06674v c06674v2 = null;
        for (int i = 0; i < c2183mE.A02.size(); i++) {
            C2182mD c2182mD = c2183mE.A02.get(i);
            C06674v c06674v3 = c2182mD.A00;
            if (((AbstractC1009Iu) c2182mD).A00 == 1935828848) {
                c06674v3.A0f(12);
                if (c06674v3.A0C() == 1936025959) {
                    c06674v = c06674v3;
                }
            } else if (((AbstractC1009Iu) c2182mD).A00 == 1936158820) {
                c06674v3.A0f(12);
                if (c06674v3.A0C() == 1936025959) {
                    c06674v2 = c06674v3;
                }
            }
        }
        if (c06674v == null || c06674v2 == null) {
            return;
        }
        c06674v.A0f(8);
        int A01 = AbstractC1009Iu.A01(c06674v.A0C());
        c06674v.A0g(4);
        if (A01 == 1) {
            c06674v.A0g(4);
        }
        if (c06674v.A0C() != 1) {
            throw C3K.A00(A0A(a.f22514Q, 39, 73));
        }
        c06674v2.A0f(8);
        int A012 = AbstractC1009Iu.A01(c06674v2.A0C());
        c06674v2.A0g(4);
        if (A012 == 1) {
            if (c06674v2.A0Q() == 0) {
                throw C3K.A00(A0A(784, 55, 110));
            }
        } else if (A012 >= 2) {
            c06674v2.A0g(4);
        }
        if (c06674v2.A0Q() != 1) {
            throw C3K.A00(A0A(165, 39, 18));
        }
        c06674v2.A0g(1);
        int A0I = c06674v2.A0I();
        int i4 = (A0I & 240) >> 4;
        int i6 = A0I & 15;
        boolean z6 = c06674v2.A0I() == 1;
        if (z6) {
            int A0I2 = c06674v2.A0I();
            byte[] bArr = new byte[16];
            c06674v2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (A0I2 == 0) {
                int A0I3 = c06674v2.A0I();
                bArr2 = new byte[A0I3];
                c06674v2.A0k(bArr2, 0, A0I3);
            }
            jq.A08 = true;
            jq.A07 = new JP(z6, str, A0I2, bArr, i4, i6, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(JP jp, C06674v c06674v, JQ jq) throws C3K {
        int i = jp.A00;
        c06674v.A0f(8);
        if ((AbstractC1009Iu.A00(c06674v.A0C()) & 1) == 1) {
            c06674v.A0g(8);
        }
        int A0I = c06674v.A0I();
        int A0L = c06674v.A0L();
        if (A0L > jq.A00) {
            throw C3K.A01(A0A(514, 18, 58) + A0L + A0A(40, 38, 7) + jq.A00, null);
        }
        int i4 = 0;
        if (A0I == 0) {
            boolean[] zArr = jq.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i6 = 0; i6 < A0L; i6++) {
                int A0I2 = c06674v.A0I();
                i4 += A0I2;
                zArr[i6] = A0I2 > i;
            }
        } else {
            i4 = 0 + (A0I * A0L);
            Arrays.fill(jq.A0F, 0, A0L, A0I > i);
        }
        Arrays.fill(jq.A0F, A0L, jq.A00, false);
        if (i4 > 0) {
            jq.A02(i4);
        }
    }

    static {
        A0D();
        A0b = new HD() { // from class: com.facebook.ads.redexgen.X.m8
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C2176m7.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C06112p().A11(A0A(839, 18, 77)).A14();
    }

    public C2176m7() {
        this(0);
    }

    public C2176m7(int i) {
        this(i, null);
    }

    public C2176m7(int i, AnonymousClass53 anonymousClass53) {
        this(i, anonymousClass53, null, Collections.emptyList());
    }

    public C2176m7(int i, AnonymousClass53 anonymousClass53, JO jo, List<C2420qI> list) {
        this(i, anonymousClass53, jo, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C2176m7(int i, AnonymousClass53 anonymousClass53, JO jo, List<C2420qI> list, InterfaceC0967Hd interfaceC0967Hd) {
        this.A0A = b.f7168b;
        this.A0K = i;
        this.A0R = anonymousClass53;
        this.A0U = jo;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = interfaceC0967Hd;
        this.A0T = new I0();
        this.A0M = new C06674v(16);
        this.A0P = new C06674v(HS.A03);
        this.A0O = new C06674v(5);
        this.A0N = new C06674v();
        this.A0Y = new byte[16];
        this.A0Q = new C06674v(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = b.f7168b;
        this.A0B = b.f7168b;
        this.A0C = b.f7168b;
        this.A0E = HA.A00;
        this.A0J = new InterfaceC0967Hd[0];
        this.A0I = new InterfaceC0967Hd[0];
    }

    public static int A00(int i) throws C3K {
        if (i >= 0) {
            return i;
        }
        throw C3K.A01(A0A(com.anythink.core.common.m.a.f15187n, 27, 67) + i, null);
    }

    public static long A02(C06674v c06674v) {
        c06674v.A0f(8);
        int fullAtom = c06674v.A0C();
        return AbstractC1009Iu.A01(fullAtom) == 0 ? c06674v.A0Q() : c06674v.A0R();
    }

    public static long A03(C06674v c06674v) {
        c06674v.A0f(8);
        int fullAtom = c06674v.A0C();
        int version = AbstractC1009Iu.A01(fullAtom);
        return version == 1 ? c06674v.A0R() : c06674v.A0Q();
    }

    public static Pair<Integer, J1> A04(C06674v c06674v) {
        c06674v.A0f(12);
        int defaultSampleDescriptionIndex = c06674v.A0C();
        int trackId = c06674v.A0C();
        int defaultSampleFlags = c06674v.A0C();
        int defaultSampleSize = c06674v.A0C();
        int defaultSampleDuration = c06674v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C2182mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2182mD c2182mD = list.get(i);
            int leafChildrenSize = ((AbstractC1009Iu) c2182mD).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] A0l = c2182mD.A00.A0l();
                UUID A02 = JH.A02(A0l);
                if (A02 == null) {
                    AbstractC06524g.A07(A0A(BaseATView.a.f10553C, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0A(897, 9, 66), A0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private J1 A07(SparseArray<J1> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (J1) AbstractC06443y.A01(sparseArray.get(i));
    }

    public static JA A08(SparseArray<JA> sparseArray) {
        boolean z6;
        boolean z9;
        JA ja = null;
        long j6 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            JA valueAt = sparseArray.valueAt(i);
            z6 = valueAt.A06;
            if (z6 || valueAt.A01 != valueAt.A05.A01) {
                z9 = valueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z9 || valueAt.A02 != valueAt.A09.A01) {
                    long nextSampleOffset = valueAt.A05();
                    if (nextSampleOffset < j6) {
                        ja = valueAt;
                        j6 = nextSampleOffset;
                    }
                }
            }
        }
        return ja;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0C() {
        int nextExtraTrackId = 100;
        this.A0J = new InterfaceC0967Hd[2];
        int i = 0;
        if (this.A0S != null) {
            int emsgTrackOutputCount = 0 + 1;
            this.A0J[0] = this.A0S;
            i = emsgTrackOutputCount;
        }
        int nextExtraTrackId2 = this.A0K;
        if ((nextExtraTrackId2 & 4) != 0) {
            int emsgTrackOutputCount2 = i + 1;
            this.A0J[i] = this.A0E.AKS(100, 5);
            i = emsgTrackOutputCount2;
            nextExtraTrackId = 100 + 1;
        }
        this.A0J = (InterfaceC0967Hd[]) C5C.A1I(this.A0J, i);
        for (InterfaceC0967Hd interfaceC0967Hd : this.A0J) {
            interfaceC0967Hd.A6e(A0c);
        }
        int nextExtraTrackId3 = this.A0X.size();
        this.A0I = new InterfaceC0967Hd[nextExtraTrackId3];
        int i4 = 0;
        while (i4 < nextExtraTrackId) {
            int i6 = nextExtraTrackId + 1;
            InterfaceC0967Hd AKS = this.A0E.AKS(nextExtraTrackId, 3);
            AKS.A6e(this.A0X.get(i4));
            this.A0I[i4] = AKS;
            i4++;
            nextExtraTrackId = i6;
        }
    }

    private void A0E(long j6) {
        while (!this.A0W.isEmpty()) {
            J9 removeFirst = this.A0W.removeFirst();
            this.A03 -= removeFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long j9 = removeFirst.A01;
            if (removeFirst.A02) {
                j9 += j6;
            }
            if (this.A0R != null) {
                j9 = this.A0R.A05(j9);
            }
            for (InterfaceC0967Hd interfaceC0967Hd : this.A0J) {
                interfaceC0967Hd.AIu(j9, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j6) throws C3K {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j6) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C06674v c06674v, int i, JQ jq) throws C3K {
        c06674v.A0f(i + 8);
        int fullAtom = c06674v.A0C();
        int flags = AbstractC1009Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z6 = fullAtom3 != 0;
            int sampleCount = c06674v.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = jq.A0F;
                int fullAtom4 = jq.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = jq.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(jq.A0F, 0, sampleCount, z6);
                int fullAtom6 = c06674v.A07();
                jq.A02(fullAtom6);
                jq.A04(c06674v);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = jq.A00;
            throw C3K.A01(append.append(fullAtom7).toString(), null);
        }
        throw C3K.A00(A0A(458, 56, 30));
    }

    public static void A0I(C06674v c06674v, JQ jq) throws C3K {
        c06674v.A0f(8);
        int flags = c06674v.A0C();
        int fullAtom = AbstractC1009Iu.A00(flags) & 1;
        if (fullAtom == 1) {
            c06674v.A0g(8);
        }
        int A0L = c06674v.A0L();
        if (A0L == 1) {
            int entryCount = AbstractC1009Iu.A01(flags);
            jq.A03 += entryCount == 0 ? c06674v.A0Q() : c06674v.A0R();
            return;
        }
        throw C3K.A01(A0A(727, 29, 60) + A0L, null);
    }

    public static void A0J(C06674v c06674v, JQ jq) throws C3K {
        A0G(c06674v, 0, jq);
    }

    public static void A0K(C06674v c06674v, JQ jq, byte[] bArr) throws C3K {
        c06674v.A0f(8);
        c06674v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c06674v, 16, jq);
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC2211ms interfaceC2211ms) throws IOException {
        int i = ((int) this.A07) - this.A00;
        C06674v c06674v = this.A0D;
        if (c06674v != null) {
            interfaceC2211ms.readFully(c06674v.A0l(), 8, i);
            A0U(new C2182mD(this.A01, c06674v), interfaceC2211ms.A8n(), interfaceC2211ms.A9P());
        } else {
            interfaceC2211ms.AK3(i);
        }
        A0F(interfaceC2211ms.A8n());
    }

    private void A0M(InterfaceC2211ms interfaceC2211ms) throws IOException {
        JA ja = null;
        long j6 = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            JA nextTrackBundle = this.A0L.valueAt(i);
            JQ jq = nextTrackBundle.A09;
            if (jq.A0A && jq.A03 < j6) {
                j6 = jq.A03;
                ja = this.A0L.valueAt(i);
            }
        }
        if (ja == null) {
            this.A02 = 3;
            return;
        }
        int A8n = (int) (j6 - interfaceC2211ms.A8n());
        if (A8n >= 0) {
            interfaceC2211ms.AK3(A8n);
            ja.A09.A05(interfaceC2211ms);
            return;
        }
        throw C3K.A01(A0A(384, 39, 59), null);
    }

    private void A0N(C2183mE c2183mE) throws C3K {
        if (((AbstractC1009Iu) c2183mE).A00 == 1836019574) {
            A0P(c2183mE);
            return;
        }
        if (((AbstractC1009Iu) c2183mE).A00 == 1836019558) {
            A0O(c2183mE);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C2183mE peek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        peek.A08(c2183mE);
    }

    private void A0O(C2183mE c2183mE) throws C3K {
        A0Q(c2183mE, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData A06 = A06(c2183mE.A02);
        if (A06 != null) {
            int i = this.A0L.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(A06);
            }
        }
        long j6 = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j6 != b.f7168b) {
                int size = this.A0L.size();
                for (int i4 = 0; i4 < size; i4++) {
                    JA valueAt = this.A0L.valueAt(i4);
                    long j9 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        valueAt.A0A(j9);
                    }
                }
                this.A0B = b.f7168b;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C2183mE c2183mE) throws C3K {
        AbstractC06443y.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData A06 = A06(c2183mE.A02);
        C2183mE c2183mE2 = (C2183mE) AbstractC06443y.A01(c2183mE.A06(1836475768));
        SparseArray<J1> sparseArray = new SparseArray<>();
        long j6 = b.f7168b;
        int size = c2183mE2.A02.size();
        for (int i = 0; i < size; i++) {
            C2182mD c2182mD = c2183mE2.A02.get(i);
            if (((AbstractC1009Iu) c2182mD).A00 == 1953654136) {
                Pair<Integer, J1> A04 = A04(c2182mD.A00);
                Object obj = A04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (J1) A04.second);
            } else if (((AbstractC1009Iu) c2182mD).A00 == 1835362404) {
                j6 = A02(c2182mD.A00);
            }
        }
        List<JR> A0O = J0.A0O(c2183mE, new HK(), j6, A06, (this.A0K & 16) != 0, false, new InterfaceC2071kO() { // from class: com.facebook.ads.redexgen.X.m9
            @Override // com.instagram.common.viewpoint.core.InterfaceC2071kO
            public final Object A4B(Object obj2) {
                return C2176m7.this.A0c((JO) obj2);
            }
        });
        int size2 = A0O.size();
        if (this.A0L.size() == 0) {
            for (int i4 = 0; i4 < size2; i4++) {
                JR jr = A0O.get(i4);
                JO jo = jr.A03;
                this.A0L.put(jo.A00, new JA(this.A0E.AKS(i4, jo.A03), jr, A07(sparseArray, jo.A00)));
                this.A08 = Math.max(this.A08, jo.A04);
            }
            this.A0E.A6O();
            return;
        }
        AbstractC06443y.A08(this.A0L.size() == size2);
        for (int i6 = 0; i6 < size2; i6++) {
            JR jr2 = A0O.get(i6);
            JO jo2 = jr2.A03;
            this.A0L.get(jo2.A00).A0C(jr2, A07(sparseArray, jo2.A00));
        }
    }

    public static void A0Q(C2183mE c2183mE, SparseArray<JA> sparseArray, boolean z6, int i, byte[] bArr) throws C3K {
        int size = c2183mE.A01.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2183mE child = c2183mE.A01.get(i4);
            int i6 = ((AbstractC1009Iu) child).A00;
            if (i6 == 1953653094) {
                A0R(child, sparseArray, z6, i, bArr);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0S(C2183mE c2183mE, JA ja, int i) throws C3K {
        int i4 = 0;
        int leafChildrenSize = 0;
        List<C2182mD> list = c2183mE.A02;
        int i6 = list.size();
        int i9 = 0;
        while (totalSampleCount != 30) {
            A0a[1] = "g5KWW";
            if (i9 < i6) {
                C2182mD c2182mD = list.get(i9);
                int trunCount = ((AbstractC1009Iu) c2182mD).A00;
                if (trunCount == 1953658222) {
                    C06674v c06674v = c2182mD.A00;
                    c06674v.A0f(12);
                    int trunCount2 = c06674v.A0L();
                    if (trunCount2 > 0) {
                        leafChildrenSize += trunCount2;
                        i4++;
                    }
                }
                i9++;
            } else {
                ja.A02 = 0;
                ja.A00 = 0;
                ja.A01 = 0;
                ja.A09.A03(i4, leafChildrenSize);
                int i10 = 0;
                int trunCount3 = 0;
                for (int trunIndex = 0; trunIndex < i6; trunIndex++) {
                    C2182mD c2182mD2 = list.get(trunIndex);
                    int totalSampleCount = ((AbstractC1009Iu) c2182mD2).A00;
                    if (totalSampleCount == 1953658222) {
                        trunCount3 = A01(ja, i10, i, c2182mD2.A00, trunCount3);
                        i10++;
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C2182mD c2182mD, long j6, Uri uri) throws C3K {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c2182mD);
            return;
        }
        if (((AbstractC1009Iu) c2182mD).A00 == 1936286840) {
            Pair<Long, C2216my> A05 = A05(c2182mD.A00, j6);
            Long l9 = (Long) A05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l9.longValue();
            this.A0E.AJ7((HY) A05.second);
            this.A0G = true;
            return;
        }
        if (((AbstractC1009Iu) c2182mD).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c2182mD.A00, uri);
    }

    public static boolean A0W(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r4 != 1937013298) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4 == 1937007471) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r4 == 1668232756) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r4 == 1937011571) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r4 == 1952867444) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r4 == 1952868452) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r4 == 1953196132) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r4 == 1953654136) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r4 == 1953658222) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r4 == 1886614376) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r4 == 1935763834) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        if (r4 == 1935763823) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r4 == 1936027235) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (r4 == 1970628964) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (r4 == 1935828848) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r4 == 1936158820) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        if (r4 == 1701606260) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r4 == 1835362404) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        if (r4 != 1701671783) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        if (r4 != 1937013298) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0X(int i) {
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556 && i != 1937011827 && i != 1668576371 && i != 1937011555) {
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel";
            strArr[6] = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0";
            if (i != 1937011578) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[7] = "alBOnYvVhDOHTU7zpsfhYzjhJlh1j5qj";
                } else {
                    A0a[0] = "AuC";
                }
            }
        }
        return true;
    }

    private boolean A0Y(InterfaceC2211ms interfaceC2211ms) throws IOException {
        int trackCount;
        int i;
        if (this.A00 == 0) {
            C06674v c06674v = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC2211ms.AHR(c06674v.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int A0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = A0C;
                }
            }
            throw new RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC2211ms.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long A8O = interfaceC2211ms.A8O();
            if (A8O == -1 && !this.A0V.isEmpty()) {
                A8O = this.A0V.peek().A00;
            }
            if (A8O != -1) {
                long A8n = A8O - interfaceC2211ms.A8n();
                int trackCount2 = this.A00;
                this.A07 = A8n + trackCount2;
            }
        }
        if (this.A07 >= this.A00) {
            long A8n2 = interfaceC2211ms.A8n() - this.A00;
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AJ7(new C2206mn(this.A08, A8n2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                SparseArray<JA> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i = 0;
                }
                while (i < trackCount) {
                    JQ jq = this.A0L.valueAt(i).A09;
                    jq.A02 = A8n2;
                    jq.A03 = A8n2;
                    jq.A04 = A8n2;
                    i++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + A8n2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long A8n3 = (interfaceC2211ms.A8n() + this.A07) - 8;
                this.A0V.push(new C2183mE(this.A01, A8n3));
                if (this.A07 == this.A00) {
                    A0F(A8n3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw C3K.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= 2147483647L) {
                    C06674v c06674v2 = new C06674v((int) this.A07);
                    C06674v atomData = this.A0M;
                    System.arraycopy(atomData.A0l(), 0, c06674v2.A0l(), 0, 8);
                    this.A0D = c06674v2;
                    this.A02 = 1;
                } else {
                    throw C3K.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw C3K.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw C3K.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AK3(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0246, code lost:
    
        throw com.instagram.common.viewpoint.core.C3K.A01(A0A(423, 35, 125), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b8, code lost:
    
        if (r9.equals(r10) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ba, code lost:
    
        r11 = r11 | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0303, code lost:
    
        if (r9.equals(r10) != false) goto L91;
     */
    @MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0Z(InterfaceC2211ms interfaceC2211ms) throws IOException {
        int AIp;
        JA ja = this.A0F;
        Throwable th = null;
        if (ja == null) {
            SparseArray<JA> sparseArray = this.A0L;
            if (A0a[0].length() == 3) {
                A0a[0] = "dJt";
                ja = A08(sparseArray);
                if (ja == null) {
                    int A8n = (int) (this.A09 - interfaceC2211ms.A8n());
                    if (A0a[3].charAt(19) != 'e') {
                        A0a[5] = "OgjcUdmzkFJtvCkNjJUwSL6BC";
                    } else {
                        String[] strArr = A0a;
                        strArr[4] = "drajDSJT48ogOqJP7e4ZIkjylQBmqc38";
                        strArr[6] = "jG2fRwUYgKH0Z3F7iVLG52YSPeKVDlpp";
                    }
                } else {
                    int A05 = (int) (ja.A05() - interfaceC2211ms.A8n());
                    if (A05 < 0) {
                        AbstractC06524g.A07(A0A(BaseATView.a.f10553C, 22, 75), A0A(226, 40, 13));
                        A05 = 0;
                    }
                    interfaceC2211ms.AK3(A05);
                    this.A0F = ja;
                }
            }
            throw new RuntimeException();
        }
        int i = 4;
        int i4 = 1;
        if (this.A02 == 3) {
            this.A06 = ja.A03();
            if (ja.A01 < ja.A03) {
                interfaceC2211ms.AK3(this.A06);
                ja.A09();
                if (!ja.A0D()) {
                    this.A0F = null;
                }
                this.A02 = 3;
                return true;
            }
            if (ja.A05.A03.A02 == 1) {
                this.A06 -= 8;
                interfaceC2211ms.AK3(8);
            }
            if (A0A(878, 9, 31).equals(ja.A05.A03.A07.A0W)) {
                this.A04 = ja.A04(this.A06, 7);
                AbstractC0958Gu.A07(this.A06, this.A0Q);
                ja.A08.AIr(this.A0Q, 7);
                this.A04 += 7;
            } else {
                this.A04 = ja.A04(this.A06, 0);
            }
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        JO jo = ja.A05.A03;
        if (A0a[1].length() != 3) {
            A0a[7] = "UjEa6ysv1gVuBQ9NSSQbVZdjDRxN5dgX";
            InterfaceC0967Hd interfaceC0967Hd = ja.A08;
            long A06 = ja.A06();
            if (this.A0R != null) {
                AnonymousClass53 anonymousClass53 = this.A0R;
                if (A0a[7].charAt(28) != 'N') {
                    A0a[2] = "ZxJoJWsimIFBA6WXS2a50b6K01MwI4cU";
                    A06 = anonymousClass53.A05(A06);
                } else {
                    A06 = anonymousClass53.A05(A06);
                }
            }
            if (jo.A01 == 0) {
                while (this.A04 < this.A06) {
                    this.A04 += interfaceC0967Hd.AIp(interfaceC2211ms, this.A06 - this.A04, false);
                }
            } else {
                byte[] A0l = this.A0O.A0l();
                A0l[0] = 0;
                A0l[1] = 0;
                A0l[2] = 0;
                int i6 = jo.A01 + 1;
                int i9 = 4 - jo.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC2211ms.readFully(A0l, i9, i6);
                        this.A0O.A0f(0);
                        int A0C = this.A0O.A0C();
                        if (A0C >= i4) {
                            this.A05 = A0C - 1;
                            this.A0P.A0f(0);
                            interfaceC0967Hd.AIr(this.A0P, i);
                            interfaceC0967Hd.AIr(this.A0O, i4);
                            if (A0a[5].length() == 30) {
                                throw new RuntimeException();
                            }
                            A0a[7] = "3HbOupLLxbWrXLbfJiyKVwL3oOoB4yeP";
                            this.A0H = this.A0I.length > 0 && HS.A0I(jo.A07.A0W, A0l[i]);
                            this.A04 += 5;
                            this.A06 += i9;
                            i4 = 1;
                        } else {
                            throw C3K.A01(A0A(266, 18, 117), th);
                        }
                    } else {
                        if (this.A0H) {
                            this.A0N.A0d(this.A05);
                            interfaceC2211ms.readFully(this.A0N.A0l(), 0, this.A05);
                            interfaceC0967Hd.AIr(this.A0N, this.A05);
                            AIp = this.A05;
                            int A02 = HS.A02(this.A0N.A0l(), this.A0N.A0A());
                            this.A0N.A0f(A0A(887, 10, 116).equals(jo.A07.A0W) ? 1 : 0);
                            this.A0N.A0e(A02);
                            H3.A03(A06, this.A0N, this.A0I);
                        } else {
                            AIp = interfaceC0967Hd.AIp(interfaceC2211ms, this.A05, false);
                        }
                        this.A04 += AIp;
                        this.A05 -= AIp;
                        th = null;
                        i = 4;
                        i4 = 1;
                    }
                }
            }
            int A022 = ja.A02();
            C0965Hb c0965Hb = null;
            JP A07 = ja.A07();
            if (A07 != null) {
                c0965Hb = A07.A01;
            }
            if (!MetaExoPlayerUpgradeConfig.A03(EnumC2020jX.A1L) && this.A0F != null) {
                String str = this.A0F.A05.A03.A07.A0W;
                String A0A = A0A(857, 21, 115);
                if (A0a[7].charAt(28) != 'N') {
                    A0a[2] = "aQkaLsEF9G127UYNPtKAhcOp5GPMu7GC";
                }
            }
            long j6 = A06;
            interfaceC0967Hd.AIu(A06, A022, this.A06, 0, c0965Hb);
            this.A0A = j6;
            A0E(j6);
            if (!ja.A0D()) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[2] = "Oznva4TpQIm3xwCXLn5zZ8MtjPilTYJm";
                    this.A0F = null;
                } else {
                    String[] strArr2 = A0a;
                    strArr2[4] = "tQydpv41IRe8SJWpvpJnsmPT1e9HbOAv";
                    strArr2[6] = "ocIdfF7b9GnVk3ZHQkLuHXJpp6hE4I0I";
                    this.A0F = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        throw new RuntimeException();
    }

    public static boolean A0a(JO jo) {
        if (jo.A08 == null || jo.A08.length != 1 || jo.A09 == null) {
            return false;
        }
        if (jo.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = C5C.A0U(jo.A08[0] + jo.A09[0], 1000000L, jo.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= jo.A04;
    }

    public static /* synthetic */ H9[] A0b() {
        return new H9[]{new C2175m6()};
    }

    public final JO A0c(JO jo) {
        return jo;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A0E = ha;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new JA(ha.AKS(0, this.A0U.A03), new JR(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new J1(0, 0, 0, 0)));
            this.A0E.A6O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2211ms interfaceC2211ms, HV hv) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC2211ms)) {
                        return -1;
                    }
                    break;
                case 1:
                    A0L(interfaceC2211ms);
                    break;
                case 2:
                    A0M(interfaceC2211ms);
                    break;
                default:
                    if (!A0Z(interfaceC2211ms)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j6, long j9) {
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            this.A0L.valueAt(i).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j9;
        this.A0V.clear();
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2211ms interfaceC2211ms) throws IOException {
        return JM.A01(interfaceC2211ms);
    }
}
