package com.squareup.cash.borrow.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.InitiateLoanData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class LoanDetailsSheetKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LoanDetailsSheetKt$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                ContentTransform contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, 0, null, 7), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(0, 0, null, 7), 2));
                contentTransform.sizeTransform = AnimatedContentKt.SizeTransform$default(1, new LoanDetailsSheetKt$$ExternalSyntheticLambda14(0));
                return contentTransform;
            case 1:
                Money money = ((InitiateLoanData.QuickLoanOption) obj).amount;
                money.getClass();
                return String.valueOf(money.amount);
            case 2:
                InitiateLoanData.QuickLoanOption quickLoanOption = (InitiateLoanData.QuickLoanOption) obj;
                quickLoanOption.getClass();
                Money money2 = quickLoanOption.amount;
                money2.getClass();
                return String.valueOf(money2.amount);
            case 3:
                Money money3 = ((InitiateLoanData.QuickLoanOption) obj).amount;
                money3.getClass();
                return String.valueOf(money3.amount);
            case 4:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Indeterminate);
                return Unit.INSTANCE;
            case 6:
                ((BorrowHomeViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((BorrowHomeOverlayEvent.RepaymentSheetEvent) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((BorrowHomeOverlayEvent.RepaymentSheetEvent) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ((BorrowHomeOverlayEvent.RepaymentSheetEvent) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((BorrowHomeOverlayEvent.RepaymentSheetEvent) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 12:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver4);
                return Unit.INSTANCE;
            case 16:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m$1((ContourLayout.LayoutSpec) obj));
            case 18:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 19:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 20:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 21:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 22:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 23:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 24:
                ((AfterPayOrderDetailsViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 26:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 27:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 28:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            default:
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
        }
    }
}
