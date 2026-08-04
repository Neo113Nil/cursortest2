package com.gamericefishpro.space.la;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;

    public /* synthetic */ c(int i, int i2, Object obj) {
        this.d = i2;
        this.i = obj;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.i;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.e, false);
                }
                break;
            default:
                ((com.gamericefishpro.space.t3.b) this.i).g(this.e);
                break;
        }
    }
}
