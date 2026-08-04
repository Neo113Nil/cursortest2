package com.gamericefishpro.space.n;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ i1 e;

    public /* synthetic */ e1(i1 i1Var, int i) {
        this.d = i;
        this.e = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m1 m1Var = this.e.i;
                if (m1Var != null) {
                    m1Var.setListSelectionHidden(true);
                    m1Var.requestLayout();
                }
                break;
            default:
                i1 i1Var = this.e;
                m1 m1Var2 = i1Var.i;
                if (m1Var2 != null && m1Var2.isAttachedToWindow() && i1Var.i.getCount() > i1Var.i.getChildCount() && i1Var.i.getChildCount() <= Integer.MAX_VALUE) {
                    i1Var.O.setInputMethodMode(2);
                    i1Var.a();
                    break;
                }
                break;
        }
    }
}
