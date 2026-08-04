package com.gamericefishpro.space.a4;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.gamericefishpro.space.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.vb.c {
    public final c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MainActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.v = new c(this, activity);
    }

    @Override // com.gamericefishpro.space.vb.c
    public final void m() {
        MainActivity mainActivity = (MainActivity) this.e;
        Resources.Theme theme = mainActivity.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
        t(theme, new TypedValue());
        ((ViewGroup) mainActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.v);
    }
}
