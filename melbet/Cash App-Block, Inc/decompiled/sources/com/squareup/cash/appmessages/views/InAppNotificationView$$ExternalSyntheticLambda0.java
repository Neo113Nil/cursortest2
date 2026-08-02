package com.squareup.cash.appmessages.views;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class InAppNotificationView$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InAppNotificationView f$0;

    public /* synthetic */ InAppNotificationView$$ExternalSyntheticLambda0(InAppNotificationView inAppNotificationView, int i) {
        this.$r8$classId = i;
        this.f$0 = inAppNotificationView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AppMessageViewEvent.AppMessageImageFailedToRender appMessageImageFailedToRender = AppMessageViewEvent.AppMessageImageFailedToRender.INSTANCE;
        InAppNotificationView inAppNotificationView = this.f$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                inAppNotificationView.image.setVisibility(0);
                if (!booleanValue) {
                    Function1 function1 = inAppNotificationView.eventReceiver;
                    if (function1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    function1.invoke(appMessageImageFailedToRender);
                }
                return Unit.INSTANCE;
            case 1:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - inAppNotificationView.getDip(12));
            case 2:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(inAppNotificationView.m3813getXdipTENr5nQ(16));
            case 3:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                CashLottieAnimationView cashLottieAnimationView = inAppNotificationView.image;
                if (booleanValue2) {
                    cashLottieAnimationView.setVisibility(0);
                } else {
                    cashLottieAnimationView.setVisibility(8);
                    Function1 function12 = inAppNotificationView.eventReceiver;
                    if (function12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    function12.invoke(appMessageImageFailedToRender);
                }
                return Unit.INSTANCE;
            case 4:
                return new XInt(inAppNotificationView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 5:
                return YInt.m3823boximpl(inAppNotificationView.m3814getYdipdBGyhoQ(88));
            case 6:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(inAppNotificationView.m3813getXdipTENr5nQ(40));
            case 7:
                return YInt.m3823boximpl(inAppNotificationView.getDip(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 8:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return YInt.m3823boximpl(inAppNotificationView.m3814getYdipdBGyhoQ(40));
            case 9:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(inAppNotificationView.getDip(16) + inAppNotificationView.m3818rightTENr5nQ(inAppNotificationView.image));
            default:
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(inAppNotificationView.m3816leftTENr5nQ(inAppNotificationView.chevron) - inAppNotificationView.m3813getXdipTENr5nQ(6));
        }
    }
}
