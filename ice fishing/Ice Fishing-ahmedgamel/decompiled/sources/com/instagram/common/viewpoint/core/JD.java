package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network/classes2.dex */
public final class JD extends FrameLayout implements InterfaceC1402Yi {
    public static String[] A03 = {"wtXzJScKRPxajxCcdRbPmb0KadlxC", "7nKoFE8ui8VEpuvPlBMmVCUEP2sqkB6T", "33CWdOtYDTa7rzeiAlLBu", "lc", "strpzcWL7DajPBiGDWIDQH24h3nkF6Q8", "KD2NqWHNK6oFw2qGkV253wUFP2DdgfCk", "fVTYPEGDbO1sEyo8c0rX1ThQbYeRG1Ca", "mBAzb1XhvrptTGzmv2edBpTADNq"};
    public String A00;
    public final InterfaceC1401Yh A01;
    public final C1644dC A02;

    public JD(C1860gi c1860gi, InterfaceC1401Yh interfaceC1401Yh, C1644dC c1644dC, String str) {
        super(c1860gi);
        this.A02 = c1644dC;
        this.A01 = interfaceC1401Yh;
        this.A00 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402Yi
    public final void AAu(Intent intent, Bundle bundle, C1222Re c1222Re) {
        C1644dC.A0B().incrementAndGet();
        this.A02.A0V();
        YB.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A45(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402Yi
    public final void AFA(boolean z6) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402Yi
    public final void AFi(boolean z6) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402Yi
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402Yi
    public final boolean onActivityResult(int i, int i4, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1402Yi
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().AE2();
        }
        AtomicInteger A0B = C1644dC.A0B();
        String[] strArr = A03;
        if (strArr[7].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "U60adJ6O15pnx6aeoiW8dFURNXF";
        strArr2[0] = "aGZEm4xR2YGCAhvP8isAV9os5hRSz";
        A0B.decrementAndGet();
    }

    public void setListener(InterfaceC1401Yh interfaceC1401Yh) {
    }
}
