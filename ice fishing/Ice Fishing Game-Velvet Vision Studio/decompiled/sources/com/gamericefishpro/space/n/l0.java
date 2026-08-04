package com.gamericefishpro.space.n;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k0 {
    @Override // com.gamericefishpro.space.n.k0, com.gamericefishpro.space.n.m0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // com.gamericefishpro.space.n.m0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
