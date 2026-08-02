package com.squareup.cash.appmessages.views;

import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class InlineAppMessageView$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InlineAppMessageView f$0;

    public /* synthetic */ InlineAppMessageView$$ExternalSyntheticLambda3(InlineAppMessageView inlineAppMessageView, int i) {
        this.$r8$classId = i;
        this.f$0 = inlineAppMessageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        InlineAppMessageView inlineAppMessageView = this.f$0;
        switch (i) {
            case 0:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(inlineAppMessageView.m3814getYdipdBGyhoQ(1));
            case 1:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(inlineAppMessageView.m3818rightTENr5nQ(inlineAppMessageView.actionsMiddleDivider));
            case 2:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.actionsTopDivider));
            case 3:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.actionsTopDivider));
            case 4:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(inlineAppMessageView.m3816leftTENr5nQ(inlineAppMessageView.actionsMiddleDivider));
            case 5:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.actionsTopDivider));
            case 6:
                return new YInt(inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.leftActionButton));
            case 7:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(inlineAppMessageView.m3813getXdipTENr5nQ(1));
            default:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(inlineAppMessageView.m3810bottomdBGyhoQ(inlineAppMessageView.actionsTopDivider));
        }
    }
}
