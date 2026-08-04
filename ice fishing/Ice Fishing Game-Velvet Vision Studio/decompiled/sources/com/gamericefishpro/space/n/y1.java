package com.gamericefishpro.space.n;

import androidx.appcompat.widget.Toolbar;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Toolbar e;

    public /* synthetic */ y1(Toolbar toolbar, int i) {
        this.d = i;
        this.e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c2 c2Var = this.e.g0;
                com.gamericefishpro.space.m.j jVar = c2Var == null ? null : c2Var.e;
                if (jVar != null) {
                    jVar.collapseActionView();
                }
                break;
            default:
                this.e.l();
                break;
        }
    }
}
