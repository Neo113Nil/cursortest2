package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.jH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2010jH implements InterfaceC1137Nt {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC2025jd A01;
    public final /* synthetic */ C2019jT A02;
    public final /* synthetic */ InterfaceC1137Nt A03;
    public final /* synthetic */ C1138Nu A04;
    public final /* synthetic */ C1860gi A05;
    public final /* synthetic */ EnumSet A06;

    public C2010jH(C1138Nu c1138Nu, C1860gi c1860gi, AbstractC2025jd abstractC2025jd, C2019jT c2019jT, int i, InterfaceC1137Nt interfaceC1137Nt, EnumSet enumSet) {
        this.A04 = c1138Nu;
        this.A05 = c1860gi;
        this.A01 = abstractC2025jd;
        this.A02 = c2019jT;
        this.A00 = i;
        this.A03 = interfaceC1137Nt;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A23()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A27(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1137Nt
    public final void ACo(AdError adError) {
        if (this.A00 == 0) {
            this.A03.ACo(adError);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1137Nt
    public final void ACp() {
        this.A05.A01().AJE(this.A01.A2E(), this.A02.A28());
        if (this.A00 == this.A02.A25()) {
            InterfaceC1137Nt interfaceC1137Nt = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC1137Nt.ACp();
        }
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1137Nt
    public final void AHY() {
        if (this.A00 == 0) {
            this.A03.AHY();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1137Nt
    public final void AKX() {
        if (this.A00 == 0) {
            this.A03.AKX();
        }
    }
}
