package com.squareup.cash.investing.components.families;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class DependentInvestingActivityView extends AbstractComposeView {
    public final RealImageLoader imageLoader;
    public final ParcelableSnapshotMutableState model$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependentInvestingActivityView(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        realImageLoader.getClass();
        this.imageLoader = realImageLoader;
        this.model$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1984640678);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final byte b = 0;
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            DependentActivityViewModel dependentActivityViewModel = (DependentActivityViewModel) this.model$delegate.getValue();
            if (dependentActivityViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, b) { // from class: com.squareup.cash.investing.components.families.DependentInvestingActivityView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ DependentInvestingActivityView f$0;

                        {
                            this.$r8$classId = b;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            DependentInvestingActivityView dependentInvestingActivityView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    dependentInvestingActivityView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    dependentInvestingActivityView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(823782246, new DependentInvestingActivityView$$ExternalSyntheticLambda1(dependentActivityViewModel, b, b), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.investing.components.families.DependentInvestingActivityView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ DependentInvestingActivityView f$0;

                {
                    this.$r8$classId = i3;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = this.$r8$classId;
                    DependentInvestingActivityView dependentInvestingActivityView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            dependentInvestingActivityView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            dependentInvestingActivityView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setModel(DependentActivityViewModel dependentActivityViewModel) {
        this.model$delegate.setValue(dependentActivityViewModel);
    }
}
