package com.squareup.cash.formview.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.badging.backend.FormattedResources;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.HeartPoseController;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardPoseController;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinition;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public abstract class FormCashAppTagElementKt {
    public static final void FormCashAppTagElement(FormBlocker.Element.CashAppTagElement cashAppTagElement, SyncValueReader syncValueReader, Modifier modifier, WandPose wandPose, Composer composer, int i) {
        Modifier modifier2;
        WandPose wandPose2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-793435802);
        int i2 = (gapComposer.changedInstance(cashAppTagElement) ? 4 : 2) | i | (gapComposer.changedInstance(syncValueReader) ? 32 : 16) | 3456;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            WandPose wandPose3 = WandPose.Review;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = StateFlowKt.mapState(syncValueReader.getAllValues(AndroidSyncValueSpecs.TagThemeDefinitions), new GpsConfigQueries$$ExternalSyntheticLambda1(3));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue, gapComposer);
            String str = cashAppTagElement.tag_theme_token;
            if (str != null) {
                TagThemeDefinition tagThemeDefinition = (TagThemeDefinition) ((Map) receiveValueAsState.getValue()).get(str);
                TagFormFactor appTagFormFactor = FormattedResources.toAppTagFormFactor(tagThemeDefinition != null ? tagThemeDefinition.form_factor : null);
                if (appTagFormFactor != null) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj = DefaultSizes.border.entries;
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    int ordinal = appTagFormFactor.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        if (ordinal != 5) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1872932799, false);
                                        }
                                    }
                                }
                            }
                            gapComposer.startReplaceGroup(1872945131);
                            MiniCardReviewEffect(appTagFormFactor == TagFormFactor.MINI_CARD_FIRST_EDITION ? MiniCardEdition.FIRST_EDITION : MiniCardEdition.STANDARD, gapComposer, 6);
                            gapComposer.end(false);
                            gapComposer.end(true);
                            wandPose2 = wandPose3;
                            modifier2 = companion;
                        }
                        gapComposer.startReplaceGroup(1872940133);
                        HeartReviewEffect(appTagFormFactor == TagFormFactor.HEART_FIRST_EDITION ? HeartEdition.FIRST_EDITION : HeartEdition.STANDARD, gapComposer, 6);
                        gapComposer.end(false);
                        gapComposer.end(true);
                        wandPose2 = wandPose3;
                        modifier2 = companion;
                    }
                    gapComposer.startReplaceGroup(1872935459);
                    WandReviewEffect(CanvasKt.toWandEdition(appTagFormFactor), gapComposer, 6);
                    gapComposer.end(false);
                    gapComposer.end(true);
                    wandPose2 = wandPose3;
                    modifier2 = companion;
                }
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new FormCashtag$8$$ExternalSyntheticLambda0(cashAppTagElement, syncValueReader, i);
                return;
            }
            return;
        }
        gapComposer.skipToGroupEnd();
        modifier2 = modifier;
        wandPose2 = wandPose;
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new MoneyUiFactory$$ExternalSyntheticLambda1(cashAppTagElement, i, syncValueReader, modifier2, wandPose2, 4);
        }
    }

    public static final void HeartReviewEffect(HeartEdition heartEdition, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        WandPose wandPose = WandPose.Review;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1143917863);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(heartEdition.ordinal()) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            Pair rememberHeartController = FlowsKt.rememberHeartController(wandPose, gapComposer2, i3 | 48);
            HeartPoseController heartPoseController = (HeartPoseController) rememberHeartController.first;
            State state = (State) rememberHeartController.second;
            boolean changedInstance = gapComposer2.changedInstance(heartPoseController) | (i3 == 4);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealProfileManager$profileOrNull$2(heartPoseController, (Continuation) null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(heartPoseController, wandPose, (Function2) rememberedValue, gapComposer2);
            gapComposer = gapComposer2;
            FlowsKt.m3441HeartEffect37dI38Q(FlowsKt.tagDragGestures(OffsetKt.aspectRatio(0.85f, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false), heartPoseController, null), ((WandPoseController.Output) state.getValue()).scale * 0.9f, HeartScene.DEFAULT_ROTATION.times(((WandPoseController.Output) state.getValue()).rotation), ((WandPoseController.Output) state.getValue()).positionOffset, ((WandPoseController.Output) state.getValue()).opacity, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, heartEdition, null, null, null, null, gapComposer, 512, i2 & 112, 128992);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(heartEdition, i);
        }
    }

    public static final void MiniCardReviewEffect(MiniCardEdition miniCardEdition, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        WandPose wandPose = WandPose.Review;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1644237933);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(miniCardEdition.ordinal()) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            Pair rememberMiniCardController = FlowsKt.rememberMiniCardController(wandPose, gapComposer2, i3 | 48);
            MiniCardPoseController miniCardPoseController = (MiniCardPoseController) rememberMiniCardController.first;
            State state = (State) rememberMiniCardController.second;
            boolean changedInstance = gapComposer2.changedInstance(miniCardPoseController) | (i3 == 4);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealProfileManager$profileOrNull$2(miniCardPoseController, (Continuation) null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(miniCardPoseController, wandPose, (Function2) rememberedValue, gapComposer2);
            gapComposer = gapComposer2;
            FlowsKt.m3442MiniCardEffect37dI38Q(FlowsKt.tagDragGestures(OffsetKt.aspectRatio(0.85f, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false), miniCardPoseController, null), ((WandPoseController.Output) state.getValue()).scale * 0.8f, MiniCardScene.DEFAULT_ROTATION.times(((WandPoseController.Output) state.getValue()).rotation), ((WandPoseController.Output) state.getValue()).positionOffset, ((WandPoseController.Output) state.getValue()).opacity, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, miniCardEdition, null, null, null, null, gapComposer, 512, i2 & 112, 128992);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(miniCardEdition, i);
        }
    }

    public static final void WandReviewEffect(WandEdition wandEdition, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        WandPose wandPose = WandPose.Review;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(922688927);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(wandEdition.ordinal()) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            Pair rememberWandController = FlowsKt.rememberWandController(wandPose, gapComposer2, i3);
            WandPoseController wandPoseController = (WandPoseController) rememberWandController.first;
            State state = (State) rememberWandController.second;
            boolean changedInstance = gapComposer2.changedInstance(wandPoseController) | (i3 == 4);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealProfileManager$profileOrNull$2(wandPoseController, (Continuation) null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(wandPoseController, wandPose, (Function2) rememberedValue, gapComposer2);
            Quat times = WandScene.DEFAULT_ROTATION.times(((WandPoseController.Output) state.getValue()).rotation);
            Vector3 vector3 = new Vector3(((WandPoseController.Output) state.getValue()).positionOffset.x * 0.028f, ((WandPoseController.Output) state.getValue()).positionOffset.y * 0.028f, ((WandPoseController.Output) state.getValue()).positionOffset.z * 0.028f);
            Modifier aspectRatio = OffsetKt.aspectRatio(0.85f, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false);
            aspectRatio.getClass();
            wandPoseController.getClass();
            gapComposer = gapComposer2;
            FlowsKt.m3443WandEffect37dI38Q(FlowsKt.tagDragGestures(aspectRatio, wandPoseController, null), ((WandPoseController.Output) state.getValue()).scale * 0.1f, times, vector3, RecyclerView.DECELERATION_RATE, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, wandEdition, null, null, null, null, gapComposer, 12583424, i2 & 112, 128880);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(wandEdition, i);
        }
    }
}
