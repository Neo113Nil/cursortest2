package com.squareup.cash.investing.components.families;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.investing.viewmodels.families.DependentDisabledStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes6.dex */
public final class DependentDisabledStateView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState model$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependentDisabledStateView(Context context) {
        super(context);
        context.getClass();
        this.model$delegate = Updater.mutableStateOf$default(null);
    }

    public final void Content(final DependentDisabledStateViewModel dependentDisabledStateViewModel, final Function1 function1, Composer composer, final int i) {
        DependentDisabledStateView dependentDisabledStateView;
        DependentDisabledStateViewModel dependentDisabledStateViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-858248941);
        int i3 = (gapComposer.changed(dependentDisabledStateViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            dependentDisabledStateView = this;
            dependentDisabledStateViewModel2 = dependentDisabledStateViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (dependentDisabledStateViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, dependentDisabledStateViewModel, function1, i, i4) { // from class: com.squareup.cash.investing.components.families.DependentDisabledStateView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ DependentDisabledStateView f$0;
                        public final /* synthetic */ DependentDisabledStateViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            DependentDisabledStateViewModel dependentDisabledStateViewModel3 = this.f$1;
                            DependentDisabledStateView dependentDisabledStateView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = DependentDisabledStateView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    dependentDisabledStateView2.Content(dependentDisabledStateViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    dependentDisabledStateView2.Content(dependentDisabledStateViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            dependentDisabledStateView = this;
            dependentDisabledStateViewModel2 = dependentDisabledStateViewModel;
            function12 = function1;
            i2 = i;
            SendChannel.DefaultImpls.DependentDisabledStateView(dependentDisabledStateViewModel2, function12, gapComposer, i3 & 112);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final DependentDisabledStateViewModel dependentDisabledStateViewModel3 = dependentDisabledStateViewModel2;
            final DependentDisabledStateView dependentDisabledStateView2 = dependentDisabledStateView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(dependentDisabledStateView2, dependentDisabledStateViewModel3, function13, i5, i6) { // from class: com.squareup.cash.investing.components.families.DependentDisabledStateView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ DependentDisabledStateView f$0;
                public final /* synthetic */ DependentDisabledStateViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = dependentDisabledStateView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    DependentDisabledStateViewModel dependentDisabledStateViewModel32 = this.f$1;
                    DependentDisabledStateView dependentDisabledStateView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = DependentDisabledStateView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            dependentDisabledStateView22.Content(dependentDisabledStateViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            dependentDisabledStateView22.Content(dependentDisabledStateViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void setModel(DependentDisabledStateViewModel dependentDisabledStateViewModel) {
        this.model$delegate.setValue(dependentDisabledStateViewModel);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((DependentDisabledStateViewModel) obj, function1, gapComposer, 0);
    }
}
