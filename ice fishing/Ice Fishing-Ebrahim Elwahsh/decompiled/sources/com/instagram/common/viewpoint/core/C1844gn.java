package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.gn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1844gn extends AbstractRunnableC1326Wc {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC1237Sp A00;
    public final /* synthetic */ C1238Sq A01;
    public final /* synthetic */ C1245Sx A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1844gn(C1245Sx c1245Sx, ArrayList arrayList, C1238Sq c1238Sq, InterfaceC1237Sp interfaceC1237Sp, ArrayList arrayList2) {
        this.A02 = c1245Sx;
        this.A03 = arrayList;
        this.A01 = c1238Sq;
        this.A00 = interfaceC1237Sp;
        this.A04 = arrayList2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        AtomicBoolean A0D;
        T8 t82;
        Handler handler;
        T8 t83;
        long j9;
        long j10;
        long j11;
        long j12;
        A0D = C1245Sx.A0D(this.A03);
        t82 = this.A02.A04;
        if (t82 instanceof C1839gi) {
            t83 = this.A02.A04;
            C1839gi c1839gi = (C1839gi) t83;
            if (this.A01.A00 == -1) {
                boolean z8 = A0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z8) {
                        InterfaceC1065Lt A0F = c1839gi.A0F();
                        j12 = this.A02.A00;
                        A0F.A4p(Y1.A01(j12));
                    } else {
                        InterfaceC1065Lt A0F2 = c1839gi.A0F();
                        j11 = this.A02.A00;
                        A0F2.A4n(Y1.A01(j11));
                    }
                }
                throw new RuntimeException();
            }
            if (A0D.get()) {
                InterfaceC1065Lt A0F3 = c1839gi.A0F();
                j10 = this.A02.A00;
                long A01 = Y1.A01(j10);
                C1238Sq c1238Sq = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    A0F3.A4q(A01, c1238Sq.A00);
                }
                throw new RuntimeException();
            }
            InterfaceC1065Lt A0F4 = c1839gi.A0F();
            j9 = this.A02.A00;
            A0F4.A4o(Y1.A01(j9), this.A01.A00);
        }
        handler = this.A02.A02;
        handler.post(new C1845go(this, A0D));
        C1245Sx.A0D(this.A04);
    }
}
