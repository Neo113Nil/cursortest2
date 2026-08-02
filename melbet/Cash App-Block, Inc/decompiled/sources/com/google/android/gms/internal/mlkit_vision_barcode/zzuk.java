package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.Room;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderManager;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderState;
import app.cash.local.views.instore.TableQrCodeScannerViewKt$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class zzuk {
    public static final void TableQrCodeCameraViewFinder(TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        boolean z;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        GapComposer gapComposer2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        boolean z2;
        GapComposer gapComposer3;
        function1.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-1645790046);
        Applier applier = gapComposer4.applier;
        int i2 = i | (gapComposer4.changed(tableQrCodeCameraViewFinderState) ? 4 : 2) | (gapComposer4.changedInstance(function1) ? 32 : 16);
        if (gapComposer4.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(function0);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$18);
            boolean booleanValue = ((Boolean) gapComposer4.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (booleanValue) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                z = false;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                gapComposer2 = gapComposer4;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                gapComposer2.startReplaceGroup(1078169146);
                gapComposer2.end(false);
            } else {
                gapComposer4.startReplaceGroup(1077729969);
                Context context = (Context) gapComposer4.consume(AndroidCompositionLocals_androidKt.LocalContext);
                RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer4.consume(LocalCashVibratorKt.LocalCashVibrator);
                if (((Boolean) tableQrCodeCameraViewFinderState.canStartCamera$delegate.getValue()).booleanValue()) {
                    gapComposer4.startReplaceGroup(1077847986);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    Object obj = Composer.Companion.Empty;
                    if (rememberedValue == obj) {
                        rememberedValue = new TableQrCodeCameraViewFinderManager(context, realCashVibrator);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager = (TableQrCodeCameraViewFinderManager) rememberedValue;
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changedInstance = gapComposer4.changedInstance(context) | gapComposer4.changedInstance(tableQrCodeCameraViewFinderManager);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj) {
                        rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(26, context, tableQrCodeCameraViewFinderManager);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                    gapComposer2 = gapComposer4;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    AndroidView_androidKt.AndroidView((Function1) rememberedValue2, fillMaxSize2, null, gapComposer2, 48, 4);
                    tableQrCodeCameraViewFinderManager.HandleState(tableQrCodeCameraViewFinderState, function1, gapComposer2, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    z = false;
                    gapComposer2.end(false);
                } else {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                    gapComposer2 = gapComposer4;
                    z = false;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                    gapComposer2.startReplaceGroup(1078163194);
                    gapComposer2.end(false);
                }
                gapComposer2.end(z);
            }
            if (((Boolean) tableQrCodeCameraViewFinderState.cameraAvailable$delegate.getValue()).booleanValue()) {
                GapComposer gapComposer5 = gapComposer2;
                z2 = true;
                gapComposer5.startReplaceGroup(1078497498);
                gapComposer5.end(z);
                gapComposer3 = gapComposer5;
            } else {
                gapComposer2.startReplaceGroup(1078212081);
                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize3);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$12, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$13);
                GapComposer gapComposer6 = gapComposer2;
                z2 = true;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer6, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).helpText, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.local_views_table_qr_camera_unavailable), (Map) null, (Function1) null, false);
                gapComposer6.end(true);
                gapComposer6.end(z);
                gapComposer3 = gapComposer6;
            }
            gapComposer3.end(z2);
            gapComposer = gapComposer3;
        } else {
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TableQrCodeScannerViewKt$$ExternalSyntheticLambda2(tableQrCodeCameraViewFinderState, function1, modifier, i);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentAllSavingsTaxForms.deepLinkSpecs;
    }
}
