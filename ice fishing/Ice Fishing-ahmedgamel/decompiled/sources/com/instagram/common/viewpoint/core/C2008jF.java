package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2008jF implements SM {
    public final /* synthetic */ AbstractC2025jd A00;
    public final /* synthetic */ InterfaceC1137Nt A01;
    public final /* synthetic */ C1138Nu A02;
    public final /* synthetic */ C1860gi A03;
    public final /* synthetic */ boolean A04;

    public C2008jF(C1138Nu c1138Nu, C1860gi c1860gi, boolean z6, AbstractC2025jd abstractC2025jd, InterfaceC1137Nt interfaceC1137Nt) {
        this.A02 = c1138Nu;
        this.A03 = c1860gi;
        this.A04 = z6;
        this.A00 = abstractC2025jd;
        this.A01 = interfaceC1137Nt;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        ArrayList arrayList;
        if (C1310Up.A1q(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC1645dD.A01(this.A03, this.A00, 1, new C2009jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
