package com.squareup.cash.investing.components.categories;

import android.view.View;
import androidx.core.view.ViewGroupKt$children$1;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingSubFilterSelection$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingSubFilterSelection f$0;

    public /* synthetic */ InvestingSubFilterSelection$$ExternalSyntheticLambda3(InvestingSubFilterSelection investingSubFilterSelection, int i) {
        this.$r8$classId = i;
        this.f$0 = investingSubFilterSelection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        InvestingSubFilterSelection investingSubFilterSelection = this.f$0;
        switch (i) {
            case 0:
                int i2 = InvestingSubFilterSelection.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingSubFilterSelection.getDip(24) + investingSubFilterSelection.m3810bottomdBGyhoQ(investingSubFilterSelection.titleView));
            case 1:
                int i3 = InvestingSubFilterSelection.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(investingSubFilterSelection.m3814getYdipdBGyhoQ(48));
            default:
                int i4 = InvestingSubFilterSelection.$r8$clinit;
                return new YInt(investingSubFilterSelection.m3810bottomdBGyhoQ((View) SequencesKt___SequencesKt.last(new ViewGroupKt$children$1(investingSubFilterSelection))));
        }
    }
}
