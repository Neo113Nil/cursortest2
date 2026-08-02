package com.squareup.cash.card.onboarding;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class CustomizationDetails {
    public final float height;
    public final List stamps;
    public final List strokes;
    public final float width;

    public CustomizationDetails(float f, float f2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.width = f;
        this.height = f2;
        this.strokes = list;
        this.stamps = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CustomizationDetails() {
        this(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, r1, r1);
        EmptyList emptyList = EmptyList.INSTANCE;
    }
}
