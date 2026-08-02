package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2240nM extends AbstractC0894Eh<C2240nM> implements Comparable<C2240nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C07789i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2240nM(int i, C2383pg c2383pg, int i4, C07789i c07789i, int i6, boolean z6, InterfaceC2091kj<C2420qI> interfaceC2091kj) {
        super(i, c2383pg, i4);
        int A00;
        this.A0A = c07789i;
        this.A0B = C07779h.A0K(super.A02.A0V);
        this.A0F = C07779h.A0S(i6, false);
        int i9 = 0;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        while (true) {
            if (i11 >= c07789i.A0I.size()) {
                break;
            }
            int A02 = C07779h.A02(super.A02, c07789i.A0I.get(i11), false);
            if (A02 > 0) {
                i10 = i11;
                i9 = A02;
                break;
            }
            i11++;
        }
        this.A04 = i10;
        this.A05 = i9;
        A00 = C07779h.A00(super.A02.A0E, ((C2379pc) c07789i).A0B);
        this.A07 = A00;
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2379pc) c07789i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2379pc) c07789i).A02) && interfaceC2091kj.A4C(super.A02);
        String[] A1L = C5C.A1L();
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= A1L.length) {
                break;
            }
            int A022 = C07779h.A02(super.A02, A1L[i14], false);
            if (A022 > 0) {
                i12 = i14;
                i13 = A022;
                break;
            }
            i14++;
        }
        this.A02 = i12;
        this.A03 = i13;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        while (true) {
            if (i16 < c07789i.A0J.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c07789i.A0J.get(i16))) {
                    i15 = i16;
                    break;
                }
                i16++;
            } else {
                break;
            }
        }
        this.A06 = i15;
        this.A0H = AbstractC07327i.A02(i6) == 128;
        this.A0G = AbstractC07327i.A04(i6) == 64;
        this.A09 = A00(i6, z6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2240nM> list, List<C2240nM> list2) {
        return ((C2240nM) Collections.max(list)).compareTo((C2240nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C2240nM> A03(int i, C2383pg c2383pg, C07789i c07789i, int[] iArr, boolean z6, InterfaceC2091kj<C2420qI> interfaceC2091kj) {
        C2K A01 = BP.A01();
        for (int i4 = 0; i4 < c2383pg.A01; i4++) {
            A01.A04(new C2240nM(i, c2383pg, i4, c07789i, iArr[i4], z6, interfaceC2091kj));
        }
        return A01.A05();
    }

    private int A00(int i, boolean z6) {
        if (!C07779h.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C07779h.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z6)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2240nM c2240nM) {
        AbstractC2422qK abstractC2422qK;
        AbstractC2422qK A06;
        AbstractC2422qK abstractC2422qK2;
        AbstractC2422qK abstractC2422qK3;
        if (!this.A0E || !this.A0F) {
            abstractC2422qK = C07779h.A09;
            A06 = abstractC2422qK.A06();
        } else {
            A06 = C07779h.A09;
        }
        AbstractC2272ns A08 = AbstractC2272ns.A01().A09(this.A0F, c2240nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2240nM.A04), AbstractC2422qK.A03().A06()).A06(this.A05, c2240nM.A05).A06(this.A07, c2240nM.A07).A09(this.A0D, c2240nM.A0D).A09(this.A0C, c2240nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2240nM.A02), AbstractC2422qK.A03().A06()).A06(this.A03, c2240nM.A03).A09(this.A0E, c2240nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2240nM.A06), AbstractC2422qK.A03().A06());
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(c2240nM.A00);
        if (this.A0A.A0O) {
            abstractC2422qK3 = C07779h.A09;
            abstractC2422qK2 = abstractC2422qK3.A06();
        } else {
            abstractC2422qK2 = C07779h.A0A;
        }
        AbstractC2272ns A082 = A08.A08(valueOf, valueOf2, abstractC2422qK2).A09(this.A0H, c2240nM.A0H).A09(this.A0G, c2240nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2240nM.A01), A06).A08(Integer.valueOf(this.A08), Integer.valueOf(c2240nM.A08), A06);
        Integer valueOf3 = Integer.valueOf(this.A00);
        Integer valueOf4 = Integer.valueOf(c2240nM.A00);
        if (!C5C.A1E(this.A0B, c2240nM.A0B)) {
            A06 = C07779h.A0A;
        }
        return A082.A08(valueOf3, valueOf4, A06).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r4 == ((com.instagram.common.viewpoint.core.AbstractC0894Eh) r6).A02.A06) goto L10;
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC0894Eh
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A09(C2240nM c2240nM) {
        if (!this.A0A.A00) {
            if (super.A02.A06 != -1) {
                int i = super.A02.A06;
                String[] strArr = A0I;
                if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
                strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            }
        }
        return (this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC0894Eh) c2240nM).A02.A0W))) && (this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC0894Eh) c2240nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2240nM.A0H && this.A0G == c2240nM.A0G));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0894Eh
    public final int A08() {
        return this.A09;
    }
}
