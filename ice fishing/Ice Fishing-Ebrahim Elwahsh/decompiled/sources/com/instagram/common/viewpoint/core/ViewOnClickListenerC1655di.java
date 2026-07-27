package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.di, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1655di implements View.OnClickListener {
    public static String[] A01 = {"oF0UQSO2UkB0Fs6pC959r9dzDMlb", "cSj6PPi", "9MOBOvfZoPMufYmvf8w", "3DUooxDMnkOJWQGgSnbPARGlSWVzZXnv", "xtRq8IID5uSiAOfe9JKkWOxw4I", "dgOA0KJAxphsFM42TDGlvfhDF1ut8VW0", "Hk9WFArlgjOkwb9sMy", "wD"};
    public final /* synthetic */ AnonymousClass55 A00;

    public ViewOnClickListenerC1655di(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1091Mt abstractC1091Mt;
        boolean z8;
        boolean z9;
        InterfaceC1659dm interfaceC1659dm;
        AbstractC1091Mt abstractC1091Mt2;
        Handler handler;
        Runnable runnable;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1091Mt = this.A00.A0S;
            if (abstractC1091Mt instanceof AnonymousClass85) {
                z8 = this.A00.A0D;
                if (!z8) {
                    interfaceC1659dm = this.A00.A0Z;
                    interfaceC1659dm.ACQ();
                    this.A00.A0E = true;
                    AnonymousClass55 anonymousClass55 = this.A00;
                    abstractC1091Mt2 = this.A00.A0S;
                    anonymousClass55.A0p(((AnonymousClass85) abstractC1091Mt2).A0M().toString());
                    long A0q = ((AbstractC0978Ij) this.A00).A06.A0q();
                    if (A01[1].length() != 7) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "6Dfgyk2EWniD4mtjwsck8hBHMm74mFyH";
                    strArr[3] = "XIgrh0tmG1tVXTW5TWFgdcEwNBgdKHOC";
                    if (A0q >= 0) {
                        handler = this.A00.A0P;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((AbstractC0978Ij) this.A00).A06.A0q());
                    }
                }
                AnonymousClass55 anonymousClass552 = this.A00;
                z9 = this.A00.A0D;
                anonymousClass552.A0u(z9 ? false : true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
