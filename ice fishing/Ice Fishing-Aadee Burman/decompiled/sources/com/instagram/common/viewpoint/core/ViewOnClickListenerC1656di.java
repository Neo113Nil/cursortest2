package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.di, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1656di implements View.OnClickListener {
    public static String[] A01 = {"oF0UQSO2UkB0Fs6pC959r9dzDMlb", "cSj6PPi", "9MOBOvfZoPMufYmvf8w", "3DUooxDMnkOJWQGgSnbPARGlSWVzZXnv", "xtRq8IID5uSiAOfe9JKkWOxw4I", "dgOA0KJAxphsFM42TDGlvfhDF1ut8VW0", "Hk9WFArlgjOkwb9sMy", "wD"};
    public final /* synthetic */ AnonymousClass55 A00;

    public ViewOnClickListenerC1656di(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1092Mt abstractC1092Mt;
        boolean z3;
        boolean z6;
        InterfaceC1660dm interfaceC1660dm;
        AbstractC1092Mt abstractC1092Mt2;
        Handler handler;
        Runnable runnable;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1092Mt = this.A00.A0S;
            if (abstractC1092Mt instanceof AnonymousClass85) {
                z3 = this.A00.A0D;
                if (!z3) {
                    interfaceC1660dm = this.A00.A0Z;
                    interfaceC1660dm.ACQ();
                    this.A00.A0E = true;
                    AnonymousClass55 anonymousClass55 = this.A00;
                    abstractC1092Mt2 = this.A00.A0S;
                    anonymousClass55.A0p(((AnonymousClass85) abstractC1092Mt2).A0M().toString());
                    long A0q = ((AbstractC0979Ij) this.A00).A06.A0q();
                    if (A01[1].length() != 7) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "6Dfgyk2EWniD4mtjwsck8hBHMm74mFyH";
                    strArr[3] = "XIgrh0tmG1tVXTW5TWFgdcEwNBgdKHOC";
                    if (A0q >= 0) {
                        handler = this.A00.A0P;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((AbstractC0979Ij) this.A00).A06.A0q());
                    }
                }
                AnonymousClass55 anonymousClass552 = this.A00;
                z6 = this.A00.A0D;
                anonymousClass552.A0u(z6 ? false : true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
