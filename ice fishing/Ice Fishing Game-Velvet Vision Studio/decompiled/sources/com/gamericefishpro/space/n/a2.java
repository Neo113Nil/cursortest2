package com.gamericefishpro.space.n;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements View.OnClickListener {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    public a2(g2 g2Var) {
        this.e = g2Var;
        g2Var.a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c2 c2Var = ((Toolbar) this.e).g0;
                com.gamericefishpro.space.m.j jVar = c2Var == null ? null : c2Var.e;
                if (jVar != null) {
                    jVar.collapseActionView();
                }
                break;
            default:
                g2 g2Var = (g2) this.e;
                if (g2Var.k != null) {
                    g2Var.getClass();
                }
                break;
        }
    }

    public a2(Toolbar toolbar) {
        this.e = toolbar;
    }
}
