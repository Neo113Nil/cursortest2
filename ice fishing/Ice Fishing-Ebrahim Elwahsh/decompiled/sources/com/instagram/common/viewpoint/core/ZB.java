package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZB implements View.OnClickListener {
    public final /* synthetic */ C1109Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ InterfaceC1380Yh A02;
    public final /* synthetic */ ZC A03;
    public final /* synthetic */ String A04;

    public ZB(ZC zc, VI vi, InterfaceC1380Yh interfaceC1380Yh, String str, C1109Nm c1109Nm) {
        this.A03 = zc;
        this.A01 = vi;
        this.A02 = interfaceC1380Yh;
        this.A04 = str;
        this.A00 = c1109Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1129Og c1129Og;
        C1839gi c1839gi;
        C1839gi c1839gi2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            c1129Og = this.A03.A01;
            c1839gi = this.A03.A02;
            if (c1129Og.A0O(c1839gi.A02(), true)) {
                this.A02.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6 x62 = new X6();
                c1839gi2 = this.A03.A02;
                X6.A0O(x62, c1839gi2, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
