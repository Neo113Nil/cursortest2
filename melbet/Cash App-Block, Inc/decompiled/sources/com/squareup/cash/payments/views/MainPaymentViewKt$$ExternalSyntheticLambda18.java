package com.squareup.cash.payments.views;

import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SwipeableKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.work.views.shift.LoadingAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda18 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda18(boolean z, ToolbarViewModel toolbarViewModel, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, boolean z2, boolean z3) {
        this.f$0 = z;
        this.f$1 = toolbarViewModel;
        this.f$2 = delegatingSoftwareKeyboardController;
        this.f$3 = function1;
        this.f$4 = z2;
        this.f$5 = z3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        boolean z = this.f$0;
        char c = 1;
        final int i2 = 0;
        switch (i) {
            case 0:
                ToolbarViewModel toolbarViewModel = (ToolbarViewModel) obj6;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Function1 function1 = (Function1) obj4;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else if (z) {
                    gapComposer.startReplaceGroup(1451654501);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ProgressIndicatorKt.m496CircularProgressIndicatorLxG7B9w(null, colors.semantic.background.prominent, RecyclerView.DECELERATION_RATE, 0L, 0, gapComposer, 0, 29);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1451850638);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new TouchRecorder(2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(187450351, new SwipeableKt$$ExternalSyntheticLambda0(delegatingSoftwareKeyboardController, toolbarViewModel, (TouchRecorder) rememberedValue, function1, this.f$4, this.f$5), gapComposer), gapComposer, (intValue & 14) | 3072, 3);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj6;
                Function0 function02 = (Function0) obj5;
                final LoadingAction loadingAction = (LoadingAction) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z2 = this.f$4;
                    boolean z3 = z && !z2;
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    coil3.size.SizeKt.ButtonCta(function0, rowScopeInstance.weight(1.0f, companion, true), buttonProminence, false, z3, null, Expect_jvmKt.rememberComposableLambda(-549802080, new Function3() { // from class: com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i3 = i2;
                            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                            LoadingAction loadingAction2 = loadingAction;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj8;
                                    int intValue3 = ((Integer) obj9).intValue();
                                    ((RowScope) obj7).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        gapComposer3.skipToGroupEnd();
                                    } else if (loadingAction2 == LoadingAction.SAVE) {
                                        gapComposer3.startReplaceGroup(1851556567);
                                        ProgressCircularKt.ProgressCircular(6, 0, gapComposer3, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1851637384);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.work_views_shift_note_save_button), (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj8;
                                    int intValue4 = ((Integer) obj9).intValue();
                                    ((RowScope) obj7).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        gapComposer4.skipToGroupEnd();
                                    } else if (loadingAction2 == LoadingAction.DELETE) {
                                        gapComposer4.startReplaceGroup(-1458139666);
                                        ProgressCircularKt.ProgressCircular(6, 0, gapComposer4, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1458054819);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.work_views_shift_note_delete_button), (Map) null, (Function1) null, false);
                                        gapComposer4.end(false);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1573248, 40);
                    if (this.f$5) {
                        gapComposer2.startReplaceGroup(-1571519611);
                        Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
                        final char c2 = c == true ? 1 : 0;
                        coil3.size.SizeKt.ButtonCta(function02, weight, buttonProminence, true, !z2, null, Expect_jvmKt.rememberComposableLambda(1885405797, new Function3() { // from class: com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i3 = c2;
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                LoadingAction loadingAction2 = loadingAction;
                                switch (i3) {
                                    case 0:
                                        Composer composer3 = (Composer) obj8;
                                        int intValue3 = ((Integer) obj9).intValue();
                                        ((RowScope) obj7).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            gapComposer3.skipToGroupEnd();
                                        } else if (loadingAction2 == LoadingAction.SAVE) {
                                            gapComposer3.startReplaceGroup(1851556567);
                                            ProgressCircularKt.ProgressCircular(6, 0, gapComposer3, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(1851637384);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.work_views_shift_note_save_button), (Map) null, (Function1) null, false);
                                            gapComposer3.end(false);
                                        }
                                        break;
                                    default:
                                        Composer composer4 = (Composer) obj8;
                                        int intValue4 = ((Integer) obj9).intValue();
                                        ((RowScope) obj7).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            gapComposer4.skipToGroupEnd();
                                        } else if (loadingAction2 == LoadingAction.DELETE) {
                                            gapComposer4.startReplaceGroup(-1458139666);
                                            ProgressCircularKt.ProgressCircular(6, 0, gapComposer4, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.startReplaceGroup(-1458054819);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.work_views_shift_note_delete_button), (Map) null, (Function1) null, false);
                                            gapComposer4.end(false);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2), gapComposer2, 1576320, 32);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1571056099);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda18(boolean z, boolean z2, Function0 function0, boolean z3, Function0 function02, LoadingAction loadingAction) {
        this.f$0 = z;
        this.f$4 = z2;
        this.f$1 = function0;
        this.f$5 = z3;
        this.f$2 = function02;
        this.f$3 = loadingAction;
    }
}
