package com.squareup.cash.checks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CaptureCheckFaceKt {
    public static final void ByteArrayImage(Modifier modifier, CaptureCheckFaceViewModel.Loaded.FinalFrame finalFrame, RealCashVibrator realCashVibrator, Composer composer, int i) {
        modifier.getClass();
        finalFrame.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1016434394);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(finalFrame) ? 32 : 16) | (gapComposer.changedInstance(realCashVibrator) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long[] jArr = {0, 100, 100, 200};
            Vibrator vibrator = realCashVibrator.vibrator;
            if (vibrator.hasVibrator() && realCashVibrator.permittedToVibrate) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
            }
            byte[] byteArray = finalFrame.frame.toByteArray();
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            decodeByteArray.getClass();
            ImageKt.m176Image5hnEew(new AndroidImageBitmap(decodeByteArray), null, null, null, null, gapComposer, 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.base.cashGreen10;
            boolean changedInstance = gapComposer.changedInstance(finalFrame) | gapComposer.changedInstance(options) | gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                CaptureCheckFaceKt$$ExternalSyntheticLambda7 captureCheckFaceKt$$ExternalSyntheticLambda7 = new CaptureCheckFaceKt$$ExternalSyntheticLambda7(finalFrame, options, j, 0);
                gapComposer.updateRememberedValue(captureCheckFaceKt$$ExternalSyntheticLambda7);
                rememberedValue = captureCheckFaceKt$$ExternalSyntheticLambda7;
            }
            CanvasKt.Canvas(6, gapComposer, Modifier.Companion.$$INSTANCE, (Function1) rememberedValue);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(modifier, finalFrame, realCashVibrator, i, 27);
        }
    }

    public static final void CaptureCheckFace(CaptureCheckFaceViewModel captureCheckFaceViewModel, Function1 function1, RealCashVibrator realCashVibrator, Composer composer, int i) {
        int i2;
        captureCheckFaceViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1427519211);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(captureCheckFaceViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ChromeConfigKt.ChromeConfig(true, (Boolean) null, (Composer) gapComposer, 6, 14);
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-1808017750, new CashCardKt$$ExternalSyntheticLambda1(26, captureCheckFaceViewModel, function1, realCashVibrator), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(captureCheckFaceViewModel, function1, realCashVibrator, i, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* renamed from: CaptureCheckFaceOverlay-cmh-DWc, reason: not valid java name */
    public static final void m3466CaptureCheckFaceOverlaycmhDWc(final float f, final float f2, final String str, final boolean z, final MiSnapState miSnapState, final Function1 function1, Composer composer, final int i) {
        int i2;
        final MiSnapState miSnapState2;
        GapComposer gapComposer;
        String str2;
        final ?? r1;
        Object obj;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        BiasAlignment biasAlignment;
        NeverEqualPolicy neverEqualPolicy;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        int i3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        BoxScopeInstance boxScopeInstance;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        ?? r9;
        ?? r12;
        Object obj2;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(750617816);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer3.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(f2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer3.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer3.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer3.changed(miSnapState) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer3.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i2;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 74899) != 74898)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion2, f, f2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m287sizeVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$18);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(rowScopeInstance.weight(0.1f, companion2, true), 1.0f);
            BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxHeight);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$17, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$18);
            Icons icons = ((Boolean) miSnapState.torchEnabled$delegate.getValue()).booleanValue() ? Icons.FlashOn24 : Icons.FlashOff24;
            String stringResource = Room.stringResource(gapComposer3, R.string.capture_check_face_toggle_flash);
            BiasAlignment biasAlignment3 = Alignment.Companion.TopCenter;
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(boxScopeInstance2.align(companion2, biasAlignment3));
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(statusBarsPadding, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            int i5 = i4 & 57344;
            Icons icons2 = icons;
            boolean z2 = i5 == 16384;
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy2) {
                str2 = stringResource;
                r1 = 0;
                Function0 function0 = new Function0() { // from class: com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = r1;
                        MiSnapState miSnapState3 = miSnapState;
                        switch (i6) {
                            case 0:
                                miSnapState3.torchEnabled$delegate.setValue(Boolean.valueOf(!((Boolean) miSnapState3.torchEnabled$delegate.getValue()).booleanValue()));
                                break;
                            default:
                                miSnapState3.takePictureManually$delegate.setValue(Boolean.TRUE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer3.updateRememberedValue(function0);
                obj = function0;
            } else {
                str2 = stringResource;
                r1 = 0;
                obj = rememberedValue;
            }
            boolean z3 = r1;
            StorageUtil.ButtonIcon(icons2, str2, (Function0) obj, m302paddingqDBjuR0$default, false, null, gapComposer3, 0, 48);
            gapComposer3.end(true);
            Painter painterResource = Countries.painterResource(R.drawable.arcade_camera_check_view_finder, z3 ? 1 : 0, gapComposer3);
            Modifier fillMaxHeight2 = SizeKt.fillMaxHeight(rowScopeInstance.weight(0.8f, companion2, true), 1.0f);
            BiasAlignment biasAlignment4 = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, z3);
            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxHeight2);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$17, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$18);
            int i6 = Painter.$stable;
            ImageKt.Image(painterResource, null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer3, i6 | 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            GapComposer gapComposer4 = gapComposer3;
            if (str == null) {
                gapComposer4.startReplaceGroup(-1958306410);
                gapComposer4.end(z3);
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                biasAlignment = biasAlignment2;
                neverEqualPolicy = neverEqualPolicy2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                companion = companion2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                i3 = i5;
                boxScopeInstance = boxScopeInstance2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                r12 = z3 ? 1 : 0;
                r9 = gapComposer4;
            } else {
                gapComposer4.startReplaceGroup(-1958306409);
                Modifier align = boxScopeInstance2.align(companion2, Alignment.Companion.BottomCenter);
                Strings.getSizes(gapComposer4).getClass();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(align, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                long Color = ColorKt.Color(3003121664L);
                Strings.getSizes(gapComposer4).getClass();
                Object obj3 = DefaultSizes.border.entries;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default2, Color, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                Strings.getSizes(gapComposer4).getClass();
                Strings.getSizes(gapComposer4).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 8.0f);
                long j = Strings.getColors(gapComposer4).base.constantWhite;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                biasAlignment = biasAlignment2;
                neverEqualPolicy = neverEqualPolicy2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                i3 = i5;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                boxScopeInstance = boxScopeInstance2;
                companion = companion2;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                boolean z4 = z3 ? 1 : 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, j, (Composer) gapComposer4, m299paddingVpY3zN4, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                GapComposer gapComposer5 = gapComposer4;
                gapComposer5.end(z4);
                r12 = z4;
                r9 = gapComposer5;
            }
            r9.end(true);
            Modifier fillMaxHeight3 = SizeKt.fillMaxHeight(rowScopeInstance.weight(0.1f, companion, true), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, r12);
            int hashCode4 = Long.hashCode(r9.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = r9.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(r9, fillMaxHeight3);
            r9.startReusableNode();
            if (r9.inserting) {
                r9.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r9.useNode();
            }
            Updater.m576setimpl(r9, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(r9, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, (GapComposer) r9, composeUiNode$Companion$SetModifier$13, (GapComposer) r9, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(r9, materializeModifier4, composeUiNode$Companion$SetModifier$12);
            Icons icons3 = Icons.NavigationClose;
            String stringResource2 = Room.stringResource(r9, R.string.close);
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            Modifier statusBarsPadding2 = SpacerKt.statusBarsPadding(boxScopeInstance3.align(companion, biasAlignment3));
            Strings.getSizes(r9).getClass();
            Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(statusBarsPadding2, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            int i7 = i3;
            boolean z5 = (i7 == 16384 ? true : r12) | ((i4 & 458752) == 131072 ? true : r12);
            Object rememberedValue2 = r9.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            if (z5 || rememberedValue2 == neverEqualPolicy3) {
                miSnapState2 = miSnapState;
                CaptureCheckFaceKt$$ExternalSyntheticLambda15 captureCheckFaceKt$$ExternalSyntheticLambda15 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15((int) r12, (Object) miSnapState2, (Object) function1);
                r9.updateRememberedValue(captureCheckFaceKt$$ExternalSyntheticLambda15);
                obj2 = captureCheckFaceKt$$ExternalSyntheticLambda15;
            } else {
                miSnapState2 = miSnapState;
                obj2 = rememberedValue2;
            }
            StorageUtil.ButtonIcon(icons3, stringResource2, (Function0) obj2, m302paddingqDBjuR0$default3, false, null, r9, 6, 48);
            if (z) {
                r9.startReplaceGroup(-1721822959);
                Painter painterResource2 = Countries.painterResource(R.drawable.camera_shutter, r12, r9);
                String stringResource3 = Room.stringResource(r9, R.string.capture_check_face_camera_shutter_button);
                Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(boxScopeInstance3.align(companion, biasAlignment4), 56.0f), RoundedCornerShapeKt.CircleShape);
                boolean z6 = i7 == 16384 ? true : r12;
                Object rememberedValue3 = r9.rememberedValue();
                Object obj4 = rememberedValue3;
                if (z6 || rememberedValue3 == neverEqualPolicy3) {
                    final int i8 = 1;
                    Function0 function02 = new Function0() { // from class: com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i62 = i8;
                            MiSnapState miSnapState3 = miSnapState2;
                            switch (i62) {
                                case 0:
                                    miSnapState3.torchEnabled$delegate.setValue(Boolean.valueOf(!((Boolean) miSnapState3.torchEnabled$delegate.getValue()).booleanValue()));
                                    break;
                                default:
                                    miSnapState3.takePictureManually$delegate.setValue(Boolean.TRUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r9.updateRememberedValue(function02);
                    obj4 = function02;
                }
                Composer composer2 = r9;
                ImageKt.Image(painterResource2, stringResource3, ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) obj4, 15), null, null, RecyclerView.DECELERATION_RATE, null, composer2, i6, 120);
                ?? r92 = composer2;
                r92.end(r12);
                gapComposer2 = r92;
            } else {
                r9.startReplaceGroup(-1721431832);
                r9.end(r12);
                gapComposer2 = r9;
            }
            gapComposer2.end(true);
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            miSnapState2 = miSnapState;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final MiSnapState miSnapState3 = miSnapState2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    CaptureCheckFaceKt.m3466CaptureCheckFaceOverlaycmhDWc(f, f2, str, z, miSnapState3, function1, (Composer) obj5, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void MiSnap(Modifier modifier, MiSnapState miSnapState, CaptureCheckFaceViewModel.Loaded.ShowMiSnap showMiSnap, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2082636508);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(miSnapState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(showMiSnap) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(new MiSnapView(context, null, 0, 0, 14, null));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            MiSnapView miSnapView = (MiSnapView) mutableState.getValue();
            boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(lifecycleOwner);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda10(lifecycleOwner, mutableState, function1, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(lifecycleOwner, miSnapView, (Function1) rememberedValue2, gapComposer);
            boolean changedInstance2 = gapComposer.changedInstance(showMiSnap) | gapComposer.changedInstance(lifecycleOwner);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(0, mutableState, showMiSnap, lifecycleOwner);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function12 = (Function1) rememberedValue3;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z || rememberedValue4 == obj) {
                rememberedValue4 = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(miSnapState, 0);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AndroidView_androidKt.AndroidView(function12, modifier, (Function1) rememberedValue4, gapComposer, (i2 << 3) & 112, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(modifier, i, miSnapState, showMiSnap, function1, 25);
        }
    }

    public static final void PermissionDeniedPermanentlyDialog(Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1377998150);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ModalKt.Dimmer(null, (Function0) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-819548191, new BookletGridKt$$ExternalSyntheticLambda1(19, function1), gapComposer), gapComposer, 3072, 5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SsnViewKt$$ExternalSyntheticLambda12(i, 17, function1);
        }
    }

    public static final void ViewPort(CaptureCheckFaceViewModel.Loaded.ShowMiSnap showMiSnap, Function1 function1, Composer composer, int i) {
        CaptureCheckFaceViewModel.Loaded.ShowMiSnap showMiSnap2;
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1408347346);
        int i2 = (gapComposer.changedInstance(showMiSnap) ? 4 : 2) | i | (gapComposer.changedInstance(function12) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MiSnapState();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MiSnapState miSnapState = (MiSnapState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(new IntSize(0L));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(0, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue3);
            int i4 = i2 << 6;
            MiSnap(onGloballyPositioned, miSnapState, showMiSnap, function12, gapComposer, (i4 & 7168) | (i4 & 896) | 54);
            showMiSnap2 = showMiSnap;
            if (IntSize.m1055equalsimpl0(((IntSize) mutableState.getValue()).packedValue, 0L)) {
                function12 = function1;
                gapComposer.startReplaceGroup(1698289814);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1697883311);
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                m3466CaptureCheckFaceOverlaycmhDWc(density.mo233toDpu2uoSUM((int) (((IntSize) mutableState.getValue()).packedValue >> 32)), density.mo233toDpu2uoSUM((int) (((IntSize) mutableState.getValue()).packedValue & BodyPartID.bodyIdMax)), showMiSnap2.hint, showMiSnap2.showCameraShutterButton, miSnapState, function1, gapComposer, ((i2 << 12) & 458752) | 24576);
                function12 = function1;
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            showMiSnap2 = showMiSnap;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(showMiSnap2, function12, i, i3);
        }
    }
}
