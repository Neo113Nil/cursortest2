package app.cash.local.views.instore;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.instore.CameraState;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewModel;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.squareup.cash.R;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class TableQrCodeScannerViewKt {
    public static final void TableQrCodeScannerChrome(Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1734715034);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(function0) ? 4 : 2);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(32.0f);
            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.85f, Color.Black, 14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            LocalToolbarKt.m1333LocalToolbarflo8M7A(SpacerKt.m300paddingVpY3zN4$default(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, m675copywmQWz5c$default, rectangleShapeKt$RectangleShape$1)), 16.0f, RecyclerView.DECELERATION_RATE, 2), new ToolbarModel(""), NavigationType.CLOSE, function0, RecyclerView.DECELERATION_RATE, null, gapComposer, ((i3 << 12) & 57344) | MLKEMEngine.KyberPolyBytes, 104);
            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), false);
            boolean changed = gapComposer.changed(mo236toPx0680j_4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new DividerKt$$ExternalSyntheticLambda0(mo236toPx0680j_4, m675copywmQWz5c$default, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(6, gapComposer, aspectRatio, (Function1) rememberedValue);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), m675copywmQWz5c$default, rectangleShapeKt$RectangleShape$1), 32.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new LocationMenu$$ExternalSyntheticLambda6(25);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            i2 = 1;
            Modifier semantics = SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, true, (Function1) rememberedValue2);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, semantics);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_table_qr_title), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_table_qr_body), (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda8(function0, i, i2);
        }
    }

    public static final void TableQrCodeScannerView(TableQrCodeScannerViewModel tableQrCodeScannerViewModel, Function1 function1, Modifier modifier, boolean z, Composer composer, int i) {
        boolean z2;
        tableQrCodeScannerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1985951171);
        int i2 = (gapComposer.changedInstance(tableQrCodeScannerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(24, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            CameraState cameraState = tableQrCodeScannerViewModel.cameraState;
            boolean z4 = tableQrCodeScannerViewModel.canStartCamera;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TableQrCodeCameraViewFinderState();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState = (TableQrCodeCameraViewFinderState) rememberedValue2;
            tableQrCodeCameraViewFinderState.getClass();
            tableQrCodeCameraViewFinderState.cameraState$delegate.setValue(cameraState);
            tableQrCodeCameraViewFinderState.canStartCamera$delegate.setValue(Boolean.valueOf(z4));
            boolean z5 = i3 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z5 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new GestureNodeKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue3, gapComposer, 0);
            Integer valueOf = Integer.valueOf(tableQrCodeScannerViewModel.scanSessionId);
            boolean changed = gapComposer.changed(tableQrCodeCameraViewFinderState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new DiskLruCache$launchCleanup$1(tableQrCodeCameraViewFinderState, (Continuation) null, 19);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(2098809362, new TableQrCodeScannerViewKt$$ExternalSyntheticLambda2(modifier, tableQrCodeCameraViewFinderState, function1), gapComposer), gapComposer, 3072, 6);
            z2 = true;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(tableQrCodeScannerViewModel, function1, modifier, z2, i);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentBankingMonthlyStatement.deepLinkSpecs;
    }
}
