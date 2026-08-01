package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1988jF implements SM {
    public final /* synthetic */ AbstractC2005jd A00;
    public final /* synthetic */ InterfaceC1117Nt A01;
    public final /* synthetic */ C1118Nu A02;
    public final /* synthetic */ C1840gi A03;
    public final /* synthetic */ boolean A04;

    public C1988jF(C1118Nu c1118Nu, C1840gi c1840gi, boolean z3, AbstractC2005jd abstractC2005jd, InterfaceC1117Nt interfaceC1117Nt) {
        this.A02 = c1118Nu;
        this.A03 = c1840gi;
        this.A04 = z3;
        this.A00 = abstractC2005jd;
        this.A01 = interfaceC1117Nt;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        ArrayList arrayList;
        if (C1290Up.A1q(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(AbstractC1625dD.A01(this.A03, this.A00, 1, new C1989jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
