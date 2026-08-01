package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZB implements View.OnClickListener {
    public final /* synthetic */ C1110Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ InterfaceC1381Yh A02;
    public final /* synthetic */ ZC A03;
    public final /* synthetic */ String A04;

    public ZB(ZC zc, VI vi, InterfaceC1381Yh interfaceC1381Yh, String str, C1110Nm c1110Nm) {
        this.A03 = zc;
        this.A01 = vi;
        this.A02 = interfaceC1381Yh;
        this.A04 = str;
        this.A00 = c1110Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1130Og c1130Og;
        C1840gi c1840gi;
        C1840gi c1840gi2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            c1130Og = this.A03.A01;
            c1840gi = this.A03.A02;
            if (c1130Og.A0O(c1840gi.A02(), true)) {
                this.A02.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6 x62 = new X6();
                c1840gi2 = this.A03.A02;
                X6.A0O(x62, c1840gi2, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
