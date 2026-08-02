package com.squareup.cash.appmessages.views;

import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class PopupAppMessageView$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PopupAppMessageView f$0;

    public /* synthetic */ PopupAppMessageView$$ExternalSyntheticLambda0(PopupAppMessageView popupAppMessageView, int i) {
        this.$r8$classId = i;
        this.f$0 = popupAppMessageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PopupAppMessageView popupAppMessageView = this.f$0;
        switch (i) {
            case 0:
                return new YInt(Math.min(((YInt) obj).value - ((popupAppMessageView.padding * 2) + popupAppMessageView.statusBarHeight), popupAppMessageView.m3810bottomdBGyhoQ(popupAppMessageView.bottomActionButton)));
            case 1:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.availableHeight - (popupAppMessageView.m3814getYdipdBGyhoQ(2) + ((popupAppMessageView.padding * 2) + ((popupAppMessageView.topActionButton.getHeight() + (popupAppMessageView.bottomActionButton.getHeight() + popupAppMessageView.m3819topdBGyhoQ(popupAppMessageView.scrollView))) + popupAppMessageView.statusBarHeight))));
            case 2:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.m3810bottomdBGyhoQ(popupAppMessageView.scrollView));
            case 3:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.m3814getYdipdBGyhoQ(1));
            case 4:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.m3810bottomdBGyhoQ(popupAppMessageView.actionsTopDivider));
            case 5:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.m3814getYdipdBGyhoQ(1));
            case 6:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.m3810bottomdBGyhoQ(popupAppMessageView.topActionButton));
            case 7:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.m3814getYdipdBGyhoQ(1));
            default:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(popupAppMessageView.m3810bottomdBGyhoQ(popupAppMessageView.actionsMiddleDivider));
        }
    }
}
