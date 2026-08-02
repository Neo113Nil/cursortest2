package com.squareup.cash.history.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.history.viewmodels.ReportAbuseViewModel;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ReportAbuseView extends ComposeUiView implements OutsideTapCloses, BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final ReportAbuseViewModel reportAbuseViewModel, final Function1 function1, Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        boolean z;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1461791672);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(reportAbuseViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (reportAbuseViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2(this, reportAbuseViewModel, function1, i, i3) { // from class: com.squareup.cash.history.views.ReportAbuseView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ReportAbuseView f$0;
                        public final /* synthetic */ ReportAbuseViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            Function1 function12 = this.f$2;
                            ReportAbuseViewModel reportAbuseViewModel2 = this.f$1;
                            ReportAbuseView reportAbuseView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i5 = ReportAbuseView.$r8$clinit;
                            switch (i4) {
                                case 0:
                                    reportAbuseView.Content(reportAbuseViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    reportAbuseView.Content(reportAbuseViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ReportAbuseViewKt.ReportAbuse(reportAbuseViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (reportAbuseViewModel.actionInProgress) {
                gapComposer.startReplaceGroup(-50359174);
                Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, matchParentSize);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z = true;
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(-50226556);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            function2 = new Function2(this, reportAbuseViewModel, function1, i, i4) { // from class: com.squareup.cash.history.views.ReportAbuseView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ReportAbuseView f$0;
                public final /* synthetic */ ReportAbuseViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.$r8$classId;
                    Function1 function12 = this.f$2;
                    ReportAbuseViewModel reportAbuseViewModel2 = this.f$1;
                    ReportAbuseView reportAbuseView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i5 = ReportAbuseView.$r8$clinit;
                    switch (i42) {
                        case 0:
                            reportAbuseView.Content(reportAbuseViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            reportAbuseView.Content(reportAbuseViewModel2, function12, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return Navigation.ArcadeBottomSheetStyle(this);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ReportAbuseViewModel) obj, function1, gapComposer, 0);
    }
}
