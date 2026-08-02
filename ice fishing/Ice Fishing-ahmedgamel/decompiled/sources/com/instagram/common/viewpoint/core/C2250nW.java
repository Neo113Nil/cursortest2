package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2250nW implements AnonymousClass24 {
    public static byte[] A03;
    public static String[] A04 = {"kjXOolT", "y1uosoppcQ2KAnagmdUHUDs2pqKkNOP", "9S5fCrLfVI6Z6wWSlA", "LW4KLvv", "ESAoxwChDjEBJ2YD38hEjiU5IsN", "MD8cz6uZEkXt7x64XO0blzPRBkN5Dhm8", "wv8vTraLOdvtLK52tGc0aCYgNtDO0cFF", "ftZS2reRIxcEfCn6parOlN78mV3R9Y2K"};
    public static final AnonymousClass23<C2250nW> A05;
    public static final C2250nW A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final BP<C2383pg> A02;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, 79, 86, 78, 83, 74, 86, 95, 26, 83, 94, 95, 84, 78, 83, 89, 91, 86, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 73, 26, 91, 94, 94, 95, 94, 26, 78, 85, 26, 85, 84, 95, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 123, 72, 72, 91, 67, 20, 81, 119, 100, 102, 110, 66, 119, 106, 112, 117, 68, 119, 119, 100, 124};
        if (A04[5].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        A04[4] = "LoVxB454";
        A03 = bArr;
    }

    static {
        A03();
        A06 = new C2250nW(new C2383pg[0]);
        A07 = C5C.A0h(0);
        A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nX
            @Override // com.instagram.common.viewpoint.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C2250nW.A00(bundle);
            }
        };
    }

    public C2250nW(C2383pg... c2383pgArr) {
        this.A02 = BP.A07(c2383pgArr);
        this.A01 = c2383pgArr.length;
        A02();
    }

    public static /* synthetic */ C2250nW A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C2250nW(new C2383pg[0]);
        }
        return new C2250nW((C2383pg[]) AnonymousClass44.A01(C2383pg.A06, parcelableArrayList).toArray(new C2383pg[0]));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02() {
        for (int i = 0; i < i; i++) {
            for (int i4 = i + 1; i4 < i; i4++) {
                if (this.A02.get(i).equals(this.A02.get(i4))) {
                    AbstractC06524g.A08(A01(60, 15, 90), A01(0, 0, 115), new IllegalArgumentException(A01(0, 60, 101)));
                }
            }
        }
    }

    public final int A04(C2383pg c2383pg) {
        int index = this.A02.indexOf(c2383pg);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C2383pg A05(int i) {
        return this.A02.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2250nW c2250nW = (C2250nW) obj;
        return this.A01 == c2250nW.A01 && this.A02.equals(c2250nW.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        int i = this.A00;
        String[] strArr = A04;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "ifk0Ba0Zppjn7MlaJBrmzFqZbJ0HKklT";
        return i;
    }
}
