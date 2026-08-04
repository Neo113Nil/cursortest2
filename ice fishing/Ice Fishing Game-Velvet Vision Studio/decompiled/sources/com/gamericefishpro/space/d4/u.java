package com.gamericefishpro.space.d4;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final t a;

    public u(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new s(nestedScrollView);
        } else {
            this.a = new com.gamericefishpro.space.ka.f(2);
        }
    }
}
