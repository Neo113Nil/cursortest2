package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A08' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC1380Yg {
    public static byte[] A05;
    public static String[] A06 = {"V62FSpXyXg0rt4sPiNo", "6lq6AHOCdAk9akPwvyC", "nqUSJeC0aIJYgUKl2CPVEyh1brd6E0Ae", "x0NdoFH36D", "29PPikSq1e", "88nHmfXS0I", "EpErG0pNHZnmsJ1", "e2q5yIycFm4TxUxK8s9XbNDHLyuGtCe3"};
    public static final /* synthetic */ EnumC1380Yg[] A07;
    public static final EnumC1380Yg A08;
    public static final EnumC1380Yg A09;
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final boolean A04;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-33, -30, -15, -34, -35, -30, -24, -21, -35, -16};
    }

    static {
        Integer num;
        Integer num2;
        A01();
        num = C1154Pe.A0D;
        A08 = new EnumC1380Yg(A00(0, 5, 92), 0, num, -1, -15986668, 858468406, true);
        num2 = C1154Pe.A0E;
        A09 = new EnumC1380Yg(A00(5, 5, 95), 1, num2, Integer.MIN_VALUE, -1, 452984831, false);
        A07 = A02();
    }

    public EnumC1380Yg(String str, int i, Integer num, int i6, int i9, int i10, boolean z3) {
        this.A03 = num;
        this.A00 = i6;
        this.A01 = i9;
        this.A02 = i10;
        this.A04 = z3;
    }

    public static /* synthetic */ EnumC1380Yg[] A02() {
        return new EnumC1380Yg[]{A08, A09};
    }

    public static EnumC1380Yg valueOf(String str) {
        return (EnumC1380Yg) Enum.valueOf(EnumC1380Yg.class, str);
    }

    public static EnumC1380Yg[] values() {
        EnumC1380Yg[] enumC1380YgArr = (EnumC1380Yg[]) A07.clone();
        if (A06[3].length() != 10) {
            throw new RuntimeException();
        }
        A06[3] = "b4MYrm3ZFw";
        return enumC1380YgArr;
    }
}
