package com.gamericefishpro.space.d4;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements t {
    public final ScrollFeedbackProvider d;

    public s(NestedScrollView nestedScrollView) {
        this.d = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // com.gamericefishpro.space.d4.t
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.d.onScrollLimit(i, i2, i3, z);
    }

    @Override // com.gamericefishpro.space.d4.t
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.d.onScrollProgress(i, i2, i3, i4);
    }
}
