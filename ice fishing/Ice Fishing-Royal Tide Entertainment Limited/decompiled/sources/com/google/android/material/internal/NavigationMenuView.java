package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.text.CatchingFishOkHttpPicasso;
import kotlin.text.CatchingFishSharedFlowAdMob;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements CatchingFishOkHttpPicasso {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // kotlin.text.CatchingFishOkHttpPicasso
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
    }
}
