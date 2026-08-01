package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.h6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1864h6 implements InterfaceC1238Sp {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C2022ju> A00;
    public final /* synthetic */ C1863h5 A01;

    public C1864h6(C1863h5 c1863h5, List<C2022ju> list) {
        this.A01 = c1863h5;
        this.A00 = list;
    }

    private void A00() {
        S6 s62;
        S6 s63;
        S6 s64;
        C1840gi c1840gi;
        S6 s65;
        S6 s66;
        C1840gi c1840gi2;
        NativeAd.NativeOptions nativeOptions;
        s62 = this.A01.A01;
        s62.A05(true);
        s63 = this.A01.A01;
        s63.A02();
        s64 = this.A01.A01;
        s64.A03(0);
        Iterator<C2022ju> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                C2022ju next = it.next();
                c1840gi = this.A01.A02;
                C1285Uk A0K = UK.A0K();
                s65 = this.A01.A01;
                UK uk = new UK(c1840gi, next, null, A0K, s65.A01());
                if (uk.A12() != null && uk.A12().A0F() != null) {
                    ((AbstractC1970iv) uk.A12().A0F()).A00(uk);
                }
                s66 = this.A01.A01;
                c1840gi2 = this.A01.A02;
                nativeOptions = this.A01.A00;
                s66.A04(new NativeAd(c1840gi2, uk, nativeOptions));
            } else {
                WT.A00(new C1865h7(this));
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADL() {
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADT() {
        A00();
    }
}
