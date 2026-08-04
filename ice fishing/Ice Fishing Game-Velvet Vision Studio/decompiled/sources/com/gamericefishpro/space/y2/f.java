package com.gamericefishpro.space.y2;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ClickableSpan {
    public final com.gamericefishpro.space.r2.k d;

    public f(com.gamericefishpro.space.r2.k kVar) {
        this.d = kVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.d.getClass();
    }
}
