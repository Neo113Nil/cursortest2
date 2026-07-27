package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.androidx.media3.common.Format;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2362pg implements AnonymousClass24 {
    public static byte[] A05;
    public static final AnonymousClass23<C2362pg> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C2399qI[] A04;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{95, 28, 16, 18, 29, 22, 17, 26, 27, 95, 22, 17, 95, 16, 17, 26, 95, 43, 13, 30, 28, 20, 56, 13, 16, 10, 15, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, Byte.MAX_VALUE, 35, 37, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, c.f16475b, 90, 14, 22, 48, 35, 33, 41, 5, 48, 45, 55, 50, 50, c.f16476c, 48, 57, 43, c.f16476c, 57, 59, 45, 40, 53, 54, c.f16476c, 122, 60, 54, 59, 61, 41, 61, 38, 44};
    }

    static {
        A05();
        A07 = C5C.A0h(0);
        A08 = C5C.A0h(1);
        A06 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ph
            @Override // com.instagram.common.viewpoint.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C2362pg.A01(bundle);
            }
        };
    }

    public C2362pg(String str, C2399qI... c2399qIArr) {
        AbstractC06233y.A07(c2399qIArr.length > 0);
        this.A03 = str;
        this.A04 = c2399qIArr;
        this.A01 = c2399qIArr.length;
        int A01 = C3J.A01(c2399qIArr[0].A0W);
        this.A02 = A01 == -1 ? C3J.A01(c2399qIArr[0].A0S) : A01;
        A04();
    }

    public C2362pg(C2399qI... c2399qIArr) {
        this(A02(0, 0, 114), c2399qIArr);
    }

    public static int A00(int i) {
        return i | 16384;
    }

    public static /* synthetic */ C2362pg A01(Bundle bundle) {
        List A01;
        List<Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = AnonymousClass44.A01(C2399qI.A0b, formats);
        }
        String id = bundle.getString(A08, A02(0, 0, 114));
        return new C2362pg(id, (C2399qI[]) A01.toArray(new C2399qI[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String A03 = A03(this.A04[0].A0V);
        int A00 = A00(this.A04[0].A0E);
        for (int i = 1; i < this.A04.length; i++) {
            String language = this.A04[i].A0V;
            if (!A03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i].A0V;
                String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i);
                return;
            }
            if (A00 != A00(this.A04[i].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                String binaryString2 = Integer.toBinaryString(this.A04[i].A0E);
                String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i) {
        AbstractC06314g.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i + A02(56, 1, 24)));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A07(C2399qI c2399qI) {
        for (int i = 0; i < i; i++) {
            if (c2399qI == this.A04[i]) {
                return i;
            }
        }
        return -1;
    }

    public final C2399qI A08(int i) {
        return this.A04[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2362pg c2362pg = (C2362pg) obj;
        return this.A03.equals(c2362pg.A03) && Arrays.equals(this.A04, c2362pg.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}
