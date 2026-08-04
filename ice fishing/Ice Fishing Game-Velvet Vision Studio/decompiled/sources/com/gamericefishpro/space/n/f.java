package com.gamericefishpro.space.n;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.m.m {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context, com.gamericefishpro.space.m.i iVar2, View view) {
        super(context, iVar2, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        this.f = 8388613;
        com.gamericefishpro.space.m.d dVar = iVar.O;
        this.h = dVar;
        com.gamericefishpro.space.m.k kVar = this.i;
        if (kVar != null) {
            kVar.g(dVar);
        }
    }

    @Override // com.gamericefishpro.space.m.m
    public final void c() {
        switch (this.l) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i iVar = this.m;
                iVar.L = null;
                iVar.getClass();
                super.c();
                break;
            default:
                i iVar2 = this.m;
                com.gamericefishpro.space.m.i iVar3 = iVar2.i;
                if (iVar3 != null) {
                    iVar3.c(true);
                }
                iVar2.K = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context, com.gamericefishpro.space.m.s sVar, View view) {
        super(context, sVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = iVar;
        if ((sVar.w.x & 32) != 32) {
            View view2 = iVar.A;
            this.e = view2 == null ? iVar.z : view2;
        }
        com.gamericefishpro.space.m.d dVar = iVar.O;
        this.h = dVar;
        com.gamericefishpro.space.m.k kVar = this.i;
        if (kVar != null) {
            kVar.g(dVar);
        }
    }
}
