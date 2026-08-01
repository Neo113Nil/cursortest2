package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1749fF implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass34 A00;

    public ViewOnClickListenerC1749fF(AnonymousClass34 anonymousClass34) {
        this.A00 = anonymousClass34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0877Ek videoView;
        VI vi;
        C1840gi c1840gi;
        C0877Ek videoView2;
        C0877Ek videoView3;
        C0877Ek videoView4;
        VI vi2;
        if (WU.A02(this)) {
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                vi = this.A00.A02;
                if (vi != null) {
                    vi2 = this.A00.A02;
                    vi2.A04(VH.A0x, null);
                }
                c1840gi = this.A00.A01;
                c1840gi.A0F().A3g();
                int[] iArr = C1750fG.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0e(EnumC1727et.A04, 12);
                        break;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0i(true, 8);
                        break;
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
