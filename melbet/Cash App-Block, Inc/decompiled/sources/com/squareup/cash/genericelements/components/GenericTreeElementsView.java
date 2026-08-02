package com.squareup.cash.genericelements.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class GenericTreeElementsView extends AbstractComposeView {
    public final RealImageLoader imageLoader;
    public final ParcelableSnapshotMutableState listener$delegate;
    public final ComposableLambdaImpl placeholderContent;
    public final boolean useArcade;
    public final ParcelableSnapshotMutableState viewModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericTreeElementsView(Context context, RealImageLoader realImageLoader, ComposableLambdaImpl composableLambdaImpl) {
        super(context, null, 6, 0);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.useArcade = true;
        this.placeholderContent = composableLambdaImpl;
        this.listener$delegate = Updater.mutableStateOf$default(new GpsConfigQueries$$ExternalSyntheticLambda1(15));
        this.viewModel$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1001892776);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            GenericTreeElementsViewModel genericTreeElementsViewModel = (GenericTreeElementsViewModel) this.viewModel$delegate.getValue();
            if (genericTreeElementsViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsView$$ExternalSyntheticLambda1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ GenericTreeElementsView f$0;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            GenericTreeElementsView genericTreeElementsView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    genericTreeElementsView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    genericTreeElementsView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ContextUtilsKt.GenericTreeElements(genericTreeElementsViewModel, null, this.imageLoader, this.useArcade, this.placeholderContent, (Function1) this.listener$delegate.getValue(), gapComposer, 0, 2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.genericelements.components.GenericTreeElementsView$$ExternalSyntheticLambda1
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ GenericTreeElementsView f$0;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    GenericTreeElementsView genericTreeElementsView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            genericTreeElementsView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            genericTreeElementsView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setModel(GenericTreeElementsViewModel genericTreeElementsViewModel) {
        genericTreeElementsViewModel.getClass();
        this.viewModel$delegate.setValue(genericTreeElementsViewModel);
    }

    public final void setOnEventListener(Function1<? super GenericTreeElementsViewEvent, Unit> function1) {
        function1.getClass();
        this.listener$delegate.setValue(function1);
    }
}
