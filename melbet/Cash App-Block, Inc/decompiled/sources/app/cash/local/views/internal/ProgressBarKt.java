package app.cash.local.views.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import com.stripe.android.uicore.utils.StateFlowsComposeKt$produceState$1$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ProgressBarKt {
    public static final void LaunchedEffectSaveable(Object[] objArr, Function2 function2, Composer composer, int i) {
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-327840753);
        int i2 = (gapComposer.changedInstance(function2) ? 32 : 16) | i;
        gapComposer.startMovableGroup(-1522350144, Integer.valueOf(objArr.length));
        int i3 = i2 | (gapComposer.changed(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= gapComposer.changedInstance(obj) ? 4 : 0;
        }
        gapComposer.end(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(copyOf, (Function0) rememberedValue, gapComposer, 48);
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            boolean changed = gapComposer.changed(mutableState) | gapComposer.changedInstance(function2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new StateFlowsComposeKt$produceState$1$1(function2, mutableState, null, 4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(copyOf2, (Function2) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SavableLaunchedEffectKt$$ExternalSyntheticLambda1(objArr, function2, i, 0);
        }
    }

    public static final void LocalValueStepper(Modifier modifier, boolean z, int i, int i2, Function0 function0, Function0 function02, Composer composer, int i3) {
        boolean z2;
        long j;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2000443078);
        int i4 = i3 | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(i) ? 2048 : 1024) | (gapComposer.changed(i2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).component.button.standard.background.f163default, RoundedCornerShapeKt.CircleShape);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            boolean z3 = true;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, 40.0f);
            Icons icons = Icons.Subtract16;
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_decrement);
            if (!z || i2 <= 0) {
                z2 = true;
                z3 = false;
            } else {
                z2 = true;
            }
            StorageUtil.ButtonIcon(icons, stringResource, function0, m277height3ABfNKs, z3, null, gapComposer, ((i4 >> 9) & 896) | 3078, 32);
            String valueOf = String.valueOf(i2);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            if (z) {
                gapComposer.startReplaceGroup(-458491196);
                j = Strings.getColors(gapComposer).semantic.text.prominent;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-458421787);
                j = Strings.getColors(gapComposer).semantic.text.disabled;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(3, 0, 0, 0, 196608, 0, 4050, j, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, valueOf, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            StorageUtil.ButtonIcon(Icons.Add16, Room.stringResource(gapComposer, R.string.local_views_increment), function02, SizeKt.m277height3ABfNKs(companion, 40.0f), z && i2 < i, null, gapComposer, ((i4 >> 12) & 896) | 3078, 32);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier, z, i, i2, function0, function02, i3);
        }
    }

    public static final void ProgressBar(int i, int i2, int i3, Composer composer, Modifier modifier) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1137395631);
        int i4 = (gapComposer.changed(modifier) ? 4 : 2) | i3 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(i2) ? 256 : 128);
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (i <= 0) {
                Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "pageCount ", " cannot be less than 1."));
                return;
            }
            if (i2 >= i) {
                Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m(i2, i, "index ", " cannot be equal or greater than pageCount ", "."));
                return;
            }
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier, 1.0f), 3.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(2.0f), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(981410025);
            int i5 = 0;
            while (i5 < i) {
                boolean z = i5 <= i2;
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxHeight(Modifier.Companion.$$INSTANCE, 1.0f), true);
                if (z) {
                    gapComposer.startReplaceGroup(1839197969);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.icon.prominent;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1839279468);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.background.standard;
                    gapComposer.end(false);
                }
                BoxKt.Box(ClipKt.clip(ImageKt.m177backgroundbw27NRU(m, j, ColorKt.RectangleShape), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(1.5f)), gapComposer, 0);
                i5++;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(modifier, i, i2, i3);
        }
    }
}
