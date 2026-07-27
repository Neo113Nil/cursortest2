package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.gn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1845gn extends AbstractRunnableC1327Wc {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC1238Sp A00;
    public final /* synthetic */ C1239Sq A01;
    public final /* synthetic */ C1246Sx A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1845gn(C1246Sx c1246Sx, ArrayList arrayList, C1239Sq c1239Sq, InterfaceC1238Sp interfaceC1238Sp, ArrayList arrayList2) {
        this.A02 = c1246Sx;
        this.A03 = arrayList;
        this.A01 = c1239Sq;
        this.A00 = interfaceC1238Sp;
        this.A04 = arrayList2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        AtomicBoolean A0D;
        T8 t82;
        Handler handler;
        T8 t83;
        long j6;
        long j9;
        long j10;
        long j11;
        A0D = C1246Sx.A0D(this.A03);
        t82 = this.A02.A04;
        if (t82 instanceof C1840gi) {
            t83 = this.A02.A04;
            C1840gi c1840gi = (C1840gi) t83;
            if (this.A01.A00 == -1) {
                boolean z3 = A0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z3) {
                        InterfaceC1066Lt A0F = c1840gi.A0F();
                        j11 = this.A02.A00;
                        A0F.A4p(Y1.A01(j11));
                    } else {
                        InterfaceC1066Lt A0F2 = c1840gi.A0F();
                        j10 = this.A02.A00;
                        A0F2.A4n(Y1.A01(j10));
                    }
                }
                throw new RuntimeException();
            }
            if (A0D.get()) {
                InterfaceC1066Lt A0F3 = c1840gi.A0F();
                j9 = this.A02.A00;
                long A01 = Y1.A01(j9);
                C1239Sq c1239Sq = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    A0F3.A4q(A01, c1239Sq.A00);
                }
                throw new RuntimeException();
            }
            InterfaceC1066Lt A0F4 = c1840gi.A0F();
            j6 = this.A02.A00;
            A0F4.A4o(Y1.A01(j6), this.A01.A00);
        }
        handler = this.A02.A02;
        handler.post(new C1846go(this, A0D));
        C1246Sx.A0D(this.A04);
    }
}
