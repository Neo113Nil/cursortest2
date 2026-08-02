package com.squareup.cash.investing.components.families;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;

/* loaded from: classes6.dex */
public final class DependentAutoInvestView extends AbstractComposeView {
    public final RealImageLoader imageLoader;
    public final ParcelableSnapshotMutableState model$delegate;
    public Function0 onAutoInvestInfoClicked;
    public Function1 onAutoInvestItemClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependentAutoInvestView(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.model$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(6857788);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DependentAutoInvestViewModel dependentAutoInvestViewModel = (DependentAutoInvestViewModel) this.model$delegate.getValue();
            if (dependentAutoInvestViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.investing.components.families.DependentAutoInvestView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ DependentAutoInvestView f$0;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            DependentAutoInvestView dependentAutoInvestView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    dependentAutoInvestView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    dependentAutoInvestView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ChannelsKt__ChannelsKt.DependentAutoInvestView(dependentAutoInvestViewModel, this.imageLoader, this.onAutoInvestItemClicked, this.onAutoInvestInfoClicked, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.investing.components.families.DependentAutoInvestView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ DependentAutoInvestView f$0;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    DependentAutoInvestView dependentAutoInvestView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            dependentAutoInvestView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            dependentAutoInvestView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setModel(DependentAutoInvestViewModel dependentAutoInvestViewModel) {
        this.model$delegate.setValue(dependentAutoInvestViewModel);
    }

    public final void setOnAutoInvestInfoClicked(Function0<Unit> function0) {
        this.onAutoInvestInfoClicked = function0;
    }

    public final void setOnAutoInvestItemClicked(Function1<? super RecurringPreferenceId, Unit> function1) {
        this.onAutoInvestItemClicked = function1;
    }
}
