package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1667dZ implements View.OnClickListener {
    public static String[] A01 = {"iIV4C6PCamFbOwLs9osqMP65CW35qHVZ", "vu8ePLRZods6FhLp1sOjcscbCnKQtV0u", "aj5bYqq1P6NsPozz4AKHPhJxq4tExiSQ", "sREORf6VoPUSDy", "tYmkAFK6aojaVt6XrGIUitMYwL", "t5b15Ic4Fw72vyTqFljisKwND31PO9vi", "k2wG1EEpilyBuA", "DdpD6jZ5PRtvRqlim5b1myDycB"};
    public final /* synthetic */ C5F A00;

    public ViewOnClickListenerC1667dZ(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1112Mt abstractC1112Mt;
        boolean z6;
        boolean z9;
        InterfaceC1680dm interfaceC1680dm;
        AbstractC1112Mt abstractC1112Mt2;
        Handler handler;
        Runnable runnable;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1112Mt = this.A00.A0V;
            if (abstractC1112Mt instanceof AnonymousClass85) {
                z6 = this.A00.A0K;
                if (A01[5].charAt(19) != 'i') {
                    throw new RuntimeException();
                }
                A01[5] = "JfKhMnDlcffILoVNGoui3HCKoOWuag6G";
                if (!z6) {
                    this.A00.A0L = true;
                    interfaceC1680dm = this.A00.A0Z;
                    interfaceC1680dm.ACQ();
                    C5F c5f = this.A00;
                    abstractC1112Mt2 = this.A00.A0V;
                    c5f.A0g(((AnonymousClass85) abstractC1112Mt2).A0M().toString());
                    if (((AbstractC0999Ij) this.A00).A06.A0q() >= 0) {
                        handler = this.A00.A08;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((AbstractC0999Ij) this.A00).A06.A0q());
                    }
                }
                C5F c5f2 = this.A00;
                z9 = this.A00.A0K;
                c5f2.A0j(z9 ? false : true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
