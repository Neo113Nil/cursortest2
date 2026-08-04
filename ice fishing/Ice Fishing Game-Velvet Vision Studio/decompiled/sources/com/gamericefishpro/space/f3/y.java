package com.gamericefishpro.space.f3;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.m1.p {
    @Override // com.gamericefishpro.space.m1.p
    public final void o(com.gamericefishpro.space.m1.m mVar) {
        View viewC = k.c(this);
        mVar.c(this.d.G && k.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            mVar.a(com.gamericefishpro.space.m1.d.a(viewFindFocus, viewC));
        }
    }
}
