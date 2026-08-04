package com.gamericefishpro.space.n;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ActionBarOverlayLayout e;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.d = i;
        this.e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                actionBarOverlayLayout.e();
                actionBarOverlayLayout.M = actionBarOverlayLayout.i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.N);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
                actionBarOverlayLayout2.e();
                actionBarOverlayLayout2.M = actionBarOverlayLayout2.i.animate().translationY(-actionBarOverlayLayout2.i.getHeight()).setListener(actionBarOverlayLayout2.N);
                break;
        }
    }
}
