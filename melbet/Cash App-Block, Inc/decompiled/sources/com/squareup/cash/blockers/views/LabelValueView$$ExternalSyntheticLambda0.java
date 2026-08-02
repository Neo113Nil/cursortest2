package com.squareup.cash.blockers.views;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.views.CardState;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.scannerview.ScannerView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class LabelValueView$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LabelValueView$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int i = LabelValueView.$r8$clinit;
                break;
            case 1:
                VerifyAliasPresenter.State state = (VerifyAliasPresenter.State) obj;
                state.getClass();
                break;
            case 2:
                VerifyAliasPresenter.State state2 = (VerifyAliasPresenter.State) obj;
                state2.getClass();
                break;
            case 3:
                VerifyAliasPresenter.State state3 = (VerifyAliasPresenter.State) obj;
                state3.getClass();
                break;
            case 4:
                VerifyAliasPresenter.State state4 = (VerifyAliasPresenter.State) obj;
                state4.getClass();
                break;
            case 5:
                VerifyAliasPresenter.State state5 = (VerifyAliasPresenter.State) obj;
                state5.getClass();
                break;
            case 6:
                VerifyAliasPresenter.State state6 = (VerifyAliasPresenter.State) obj;
                state6.getClass();
                break;
            case 7:
                VerifyAliasPresenter.State state7 = (VerifyAliasPresenter.State) obj;
                state7.getClass();
                break;
            case 8:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                break;
            case 9:
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                break;
            case 10:
                ScannerView scannerView = (ScannerView) obj;
                scannerView.getClass();
                scannerView.setCallback(new CardState.Saver());
                break;
            case 11:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                int i2 = 1;
                if (!(animatedContentTransitionScopeImpl.getTargetState() instanceof EarnerEnrollmentBlockerViewModel.CategorySelection)) {
                    if (!(animatedContentTransitionScopeImpl.getInitialState() instanceof EarnerEnrollmentBlockerViewModel.CategorySelection)) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 12:
                EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel = (EarnerEnrollmentBlockerViewModel) obj;
                earnerEnrollmentBlockerViewModel.getClass();
                break;
            case 13:
                EarnerEnrollmentBlockerViewModel.CategorySelection.Category category = (EarnerEnrollmentBlockerViewModel.CategorySelection.Category) obj;
                category.getClass();
                break;
            case 14:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 23:
                int i3 = LabelValueView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                break;
            case 24:
                int i4 = LabelValueView.$r8$clinit;
                break;
            case 25:
                int i5 = LabelValueView.$r8$clinit;
                break;
            case 26:
                int i6 = LabelValueView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                break;
            case 27:
                int i7 = LabelValueView.$r8$clinit;
                break;
        }
        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
    }
}
