package com.squareup.cash.portfolio.graphs.views;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class MooncakeInvestingGraphView$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MooncakeInvestingGraphView f$0;

    public /* synthetic */ MooncakeInvestingGraphView$$ExternalSyntheticLambda0(MooncakeInvestingGraphView mooncakeInvestingGraphView, int i) {
        this.$r8$classId = i;
        this.f$0 = mooncakeInvestingGraphView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MooncakeInvestingGraphView mooncakeInvestingGraphView = this.f$0;
        switch (i) {
            case 0:
                int i2 = MooncakeInvestingGraphView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(mooncakeInvestingGraphView.m3810bottomdBGyhoQ(mooncakeInvestingGraphView.eventLabel));
            case 1:
                int i3 = MooncakeInvestingGraphView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(mooncakeInvestingGraphView.m3810bottomdBGyhoQ(mooncakeInvestingGraphView.eventLabel));
            case 2:
                int i4 = MooncakeInvestingGraphView.$r8$clinit;
                return new XInt(mooncakeInvestingGraphView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 3:
                int i5 = MooncakeInvestingGraphView.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - mooncakeInvestingGraphView.getDip(24));
            case 4:
                int i6 = MooncakeInvestingGraphView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(mooncakeInvestingGraphView.m3813getXdipTENr5nQ(48));
            case 5:
                int i7 = MooncakeInvestingGraphView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(mooncakeInvestingGraphView.m3814getYdipdBGyhoQ(48));
            default:
                YInt yInt = (YInt) obj;
                int i8 = MooncakeInvestingGraphView.$r8$clinit;
                return new YInt(Math.min(Intrinsics.compare(yInt.value, 0) <= 0 ? Integer.MAX_VALUE : yInt.value, mooncakeInvestingGraphView.m3814getYdipdBGyhoQ(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE) + mooncakeInvestingGraphView.m3815heightdBGyhoQ(mooncakeInvestingGraphView.eventLabel)));
        }
    }
}
