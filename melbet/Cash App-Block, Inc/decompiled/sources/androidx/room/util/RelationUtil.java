package androidx.room.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.ui.widget.keypad.KeypadViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.keypad.KeypadViewKt$KeypadView$1$1$1$1$2$1;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class RelationUtil {
    /* JADX WARN: Removed duplicated region for block: B:115:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* renamed from: KeypadView-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1189KeypadViewww6aTOc(Modifier modifier, KeypadViewModel keypadViewModel, TextStyle textStyle, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyle2;
        long j2;
        GapComposer gapComposer;
        Modifier modifier3;
        TextStyle textStyle3;
        long j3;
        TextStyle textStyle4;
        TextStyle textStyle5;
        Modifier modifier4;
        int i4;
        long j4;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        Object rememberedValue2;
        Object keypadViewKt$$ExternalSyntheticLambda0;
        TextStyle textStyle6;
        GapComposer gapComposer2;
        NeverEqualPolicy neverEqualPolicy2;
        int i5;
        KeypadViewModel.KeypadKey keypadKey;
        String str;
        PlatformHapticFeedback platformHapticFeedback;
        MutableState mutableState;
        String str2;
        Haptics haptics;
        CoroutineScope coroutineScope;
        String str3;
        Object keypadViewKt$KeypadView$1$1$1$1$2$1;
        KeypadViewModel.KeypadKey keypadKey2;
        Object keypadViewKt$KeypadView$1$1$1$1$2$12;
        RealHapticVibrator realHapticVibrator;
        Haptics haptics2;
        PlatformHapticFeedback platformHapticFeedback2;
        CoroutineScope coroutineScope2;
        MutableState mutableState2;
        boolean z;
        boolean z2;
        int i6;
        NeverEqualPolicy neverEqualPolicy3;
        Modifier modifier5;
        Modifier.Companion companion;
        int i7;
        int i8;
        KeypadViewModel keypadViewModel2 = keypadViewModel;
        keypadViewModel2.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1617318184);
        Applier applier = gapComposer3.applier;
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer3.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changedInstance(keypadViewModel2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                textStyle2 = textStyle;
                if (gapComposer3.changed(textStyle2)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                textStyle2 = textStyle;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (gapComposer3.changed(j2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                j2 = j;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            j2 = j;
        }
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer3.startDefaults();
            int i10 = i & 1;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (i10 == 0 || gapComposer3.getDefaultsInvalid()) {
                if (i9 != 0) {
                    modifier2 = companion2;
                }
                if ((i2 & 4) != 0) {
                    textStyle4 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).keypadNumbers;
                    i3 &= -897;
                } else {
                    textStyle4 = textStyle2;
                }
                if ((i2 & 8) != 0) {
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    textStyle5 = textStyle4;
                    modifier4 = modifier2;
                    i4 = i3 & (-7169);
                    j4 = colors.surface.keypad.text;
                    gapComposer3.endDefaults();
                    rememberedValue = gapComposer3.rememberedValue();
                    neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Updater.mutableStateOf$default(null);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue;
                    rememberedValue2 = gapComposer3.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    CoroutineScope coroutineScope3 = (CoroutineScope) rememberedValue2;
                    PlatformHapticFeedback platformHapticFeedback3 = (PlatformHapticFeedback) gapComposer3.consume(CompositionLocalsKt.LocalHapticFeedback);
                    RealHapticVibrator realHapticVibrator2 = (RealHapticVibrator) gapComposer3.consume(HapticVibratorKt.LocalHapticVibrator);
                    Haptics haptics3 = (Haptics) gapComposer3.consume(HapticsKt.LocalHaptics);
                    String stringResource = Room.stringResource(gapComposer3, R.string.keypad_description_glyph_backspace);
                    String stringResource2 = Room.stringResource(gapComposer3, R.string.keypad_description_glyph_decimal);
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(modifier4, RecyclerView.DECELERATION_RATE, 284.0f, 1);
                    int i11 = i4;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    RealHapticVibrator realHapticVibrator3 = realHapticVibrator2;
                    String str4 = stringResource2;
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m279heightInVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer3.startReplaceGroup(-741855322);
                    boolean z3 = true;
                    Iterator it = CollectionsKt.windowed(keypadViewModel2.keys, 3, 3, true).iterator();
                    while (it.hasNext()) {
                        List<KeypadViewModel.KeypadKey> list = (List) it.next();
                        Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), z3);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer3, 54);
                        boolean z4 = 54;
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        gapComposer3.startReplaceGroup(-1016922074);
                        for (KeypadViewModel.KeypadKey keypadKey3 : list) {
                            keypadKey3.getClass();
                            KeypadViewModel.KeypadKey keypadKey4 = KeypadViewModel.KeypadKey.EMPTY;
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            if (keypadKey3 == keypadKey4) {
                                gapComposer3.startReplaceGroup(677785338);
                                SpacerKt.Spacer(gapComposer3, SizeKt.fillMaxHeight(rowScopeInstance.weight(1.0f, companion2, true), 1.0f));
                                gapComposer3.end(false);
                                realHapticVibrator = realHapticVibrator3;
                                gapComposer2 = gapComposer3;
                                coroutineScope2 = coroutineScope3;
                                platformHapticFeedback2 = platformHapticFeedback3;
                                haptics2 = haptics3;
                                str3 = stringResource;
                                neverEqualPolicy3 = neverEqualPolicy;
                                companion = companion2;
                                modifier5 = modifier4;
                                mutableState2 = mutableState3;
                                z = z4;
                                i6 = i11;
                                str = str4;
                            } else {
                                gapComposer3.startReplaceGroup(677888165);
                                gapComposer3.end(false);
                                float f = ((KeypadViewModel.KeypadKey) mutableState3.getValue()) == keypadKey3 ? 2.0f : 1.0f;
                                Haptics haptics4 = haptics3;
                                String str5 = stringResource;
                                GapComposer gapComposer4 = gapComposer3;
                                CoroutineScope coroutineScope4 = coroutineScope3;
                                RealHapticVibrator realHapticVibrator4 = realHapticVibrator3;
                                String str6 = str4;
                                PlatformHapticFeedback platformHapticFeedback4 = platformHapticFeedback3;
                                Modifier modifier6 = modifier4;
                                State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, null, "", null, gapComposer4, 3072, 22);
                                Object rememberedValue3 = gapComposer4.rememberedValue();
                                if (rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                                }
                                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                                boolean changed = gapComposer4.changed(keypadKey3.ordinal()) | gapComposer4.changed(str6) | gapComposer4.changed(str5) | gapComposer4.changedInstance(keypadViewModel2) | gapComposer4.changedInstance(realHapticVibrator4) | gapComposer4.changed(haptics4) | gapComposer4.changedInstance(platformHapticFeedback4) | gapComposer4.changedInstance(coroutineScope4);
                                Object rememberedValue4 = gapComposer4.rememberedValue();
                                if (changed || rememberedValue4 == neverEqualPolicy) {
                                    MutableState mutableState4 = mutableState3;
                                    textStyle6 = textStyle5;
                                    gapComposer2 = gapComposer4;
                                    neverEqualPolicy2 = neverEqualPolicy;
                                    KeypadViewModel keypadViewModel3 = keypadViewModel2;
                                    i5 = i11;
                                    keypadViewKt$$ExternalSyntheticLambda0 = new KeypadViewKt$$ExternalSyntheticLambda0(keypadKey3, str6, str5, keypadViewModel3, realHapticVibrator4, haptics4, platformHapticFeedback4, coroutineScope4, mutableState4, 0);
                                    keypadKey = keypadKey3;
                                    realHapticVibrator4 = realHapticVibrator4;
                                    str = str6;
                                    keypadViewModel2 = keypadViewModel3;
                                    platformHapticFeedback = platformHapticFeedback4;
                                    mutableState = mutableState4;
                                    str2 = str5;
                                    haptics = haptics4;
                                    coroutineScope = coroutineScope4;
                                    gapComposer2.updateRememberedValue(keypadViewKt$$ExternalSyntheticLambda0);
                                } else {
                                    gapComposer2 = gapComposer4;
                                    haptics = haptics4;
                                    coroutineScope = coroutineScope4;
                                    keypadViewKt$$ExternalSyntheticLambda0 = rememberedValue4;
                                    str = str6;
                                    platformHapticFeedback = platformHapticFeedback4;
                                    str2 = str5;
                                    mutableState = mutableState3;
                                    textStyle6 = textStyle5;
                                    i5 = i11;
                                    keypadKey = keypadKey3;
                                    neverEqualPolicy2 = neverEqualPolicy;
                                }
                                KeypadViewModel.KeypadKey keypadKey5 = keypadKey;
                                str3 = str2;
                                Modifier fillMaxHeight = SizeKt.fillMaxHeight(rowScopeInstance.weight(1.0f, SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) keypadViewKt$$ExternalSyntheticLambda0), true), 1.0f);
                                boolean changed2 = gapComposer2.changed(keypadKey5.ordinal()) | gapComposer2.changedInstance(keypadViewModel2) | gapComposer2.changedInstance(realHapticVibrator4) | gapComposer2.changed(haptics) | gapComposer2.changedInstance(platformHapticFeedback) | gapComposer2.changedInstance(coroutineScope);
                                Object rememberedValue5 = gapComposer2.rememberedValue();
                                if (changed2 || rememberedValue5 == neverEqualPolicy2) {
                                    PlatformHapticFeedback platformHapticFeedback5 = platformHapticFeedback;
                                    Haptics haptics5 = haptics;
                                    RealHapticVibrator realHapticVibrator5 = realHapticVibrator4;
                                    keypadViewKt$KeypadView$1$1$1$1$2$1 = new KeypadViewKt$KeypadView$1$1$1$1$2$1(keypadKey5, keypadViewModel2, realHapticVibrator5, haptics5, platformHapticFeedback5, coroutineScope, mutableState);
                                    keypadKey2 = keypadKey5;
                                    realHapticVibrator4 = realHapticVibrator5;
                                    haptics = haptics5;
                                    platformHapticFeedback = platformHapticFeedback5;
                                    gapComposer2.updateRememberedValue(keypadViewKt$KeypadView$1$1$1$1$2$1);
                                } else {
                                    keypadViewKt$KeypadView$1$1$1$1$2$1 = rememberedValue5;
                                    keypadKey2 = keypadKey5;
                                }
                                Function0 function0 = (Function0) ((KFunction) keypadViewKt$KeypadView$1$1$1$1$2$1);
                                boolean changedInstance = gapComposer2.changedInstance(keypadViewModel2) | gapComposer2.changedInstance(realHapticVibrator4) | gapComposer2.changed(haptics) | gapComposer2.changedInstance(platformHapticFeedback) | gapComposer2.changed(keypadKey2.ordinal()) | gapComposer2.changedInstance(coroutineScope);
                                Object rememberedValue6 = gapComposer2.rememberedValue();
                                if (changedInstance || rememberedValue6 == neverEqualPolicy2) {
                                    KeypadViewModel keypadViewModel4 = keypadViewModel2;
                                    RealHapticVibrator realHapticVibrator6 = realHapticVibrator4;
                                    keypadViewKt$KeypadView$1$1$1$1$2$12 = new KeypadViewKt$KeypadView$1$1$1$1$2$1(keypadViewModel4, realHapticVibrator6, haptics, platformHapticFeedback, keypadKey2, coroutineScope, mutableState);
                                    realHapticVibrator = realHapticVibrator6;
                                    haptics2 = haptics;
                                    platformHapticFeedback2 = platformHapticFeedback;
                                    coroutineScope2 = coroutineScope;
                                    mutableState2 = mutableState;
                                    gapComposer2.updateRememberedValue(keypadViewKt$KeypadView$1$1$1$1$2$12);
                                } else {
                                    realHapticVibrator = realHapticVibrator4;
                                    haptics2 = haptics;
                                    platformHapticFeedback2 = platformHapticFeedback;
                                    coroutineScope2 = coroutineScope;
                                    keypadViewKt$KeypadView$1$1$1$1$2$12 = rememberedValue6;
                                    mutableState2 = mutableState;
                                }
                                Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(fillMaxHeight, mutableInteractionSourceImpl, null, false, null, null, null, function0, (Function0) ((KFunction) keypadViewKt$KeypadView$1$1$1$1$2$12), 444);
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m184combinedClickableauXiCPI$default);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                gapComposer2.startReusableNode();
                                if (gapComposer2.inserting) {
                                    gapComposer2.createNode(layoutNode$Companion$Constructor$13);
                                } else {
                                    gapComposer2.useNode();
                                }
                                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                if (keypadKey2.isClear()) {
                                    gapComposer2.startReplaceGroup(-1944485291);
                                    float mo231toDpGaN1DYA = ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(textStyle6.spanStyle.fontSize);
                                    Icons icons = Icons.KeypadDelete24;
                                    float floatValue = ((Number) animateFloatAsState.getValue()).floatValue();
                                    Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(ScaleKt.scale(companion2, floatValue, floatValue), mo231toDpGaN1DYA), j4, gapComposer2, (i5 & 7168) | 54, 0);
                                    gapComposer2.end(false);
                                    i6 = i5;
                                    textStyle5 = textStyle6;
                                    companion = companion2;
                                    neverEqualPolicy3 = neverEqualPolicy2;
                                    z = z4;
                                    modifier5 = modifier6;
                                    z2 = true;
                                } else {
                                    gapComposer2.startReplaceGroup(-1944139362);
                                    String str7 = keypadKey2.value;
                                    float floatValue2 = ((Number) animateFloatAsState.getValue()).floatValue();
                                    z = z4;
                                    z2 = true;
                                    i6 = i5;
                                    textStyle5 = textStyle6;
                                    neverEqualPolicy3 = neverEqualPolicy2;
                                    j4 = j4;
                                    modifier5 = modifier6;
                                    companion = companion2;
                                    Room.m1165Text25TpFw(0, 0, 0, 3, i5 & 8064, 0, 3824, j4, (Composer) gapComposer2, ScaleKt.scale(companion2, floatValue2, floatValue2), textStyle5, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(z2);
                            }
                            keypadViewModel2 = keypadViewModel;
                            companion2 = companion;
                            modifier4 = modifier5;
                            neverEqualPolicy = neverEqualPolicy3;
                            z4 = z;
                            i11 = i6;
                            mutableState3 = mutableState2;
                            str4 = str;
                            gapComposer3 = gapComposer2;
                            coroutineScope3 = coroutineScope2;
                            platformHapticFeedback3 = platformHapticFeedback2;
                            realHapticVibrator3 = realHapticVibrator;
                            haptics3 = haptics2;
                            stringResource = str3;
                        }
                        GapComposer gapComposer5 = gapComposer3;
                        gapComposer5.end(false);
                        gapComposer5.end(true);
                        keypadViewModel2 = keypadViewModel;
                        z3 = true;
                        coroutineScope3 = coroutineScope3;
                        platformHapticFeedback3 = platformHapticFeedback3;
                        haptics3 = haptics3;
                        stringResource = stringResource;
                    }
                    gapComposer = gapComposer3;
                    gapComposer.end(false);
                    gapComposer.end(z3);
                    modifier3 = modifier4;
                    j3 = j4;
                    textStyle3 = textStyle5;
                } else {
                    textStyle5 = textStyle4;
                    modifier4 = modifier2;
                    i4 = i3;
                }
            } else {
                gapComposer3.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                modifier4 = modifier2;
                i4 = i3;
                textStyle5 = textStyle2;
            }
            j4 = j2;
            gapComposer3.endDefaults();
            rememberedValue = gapComposer3.rememberedValue();
            neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
            }
            MutableState mutableState32 = (MutableState) rememberedValue;
            rememberedValue2 = gapComposer3.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
            }
            CoroutineScope coroutineScope32 = (CoroutineScope) rememberedValue2;
            PlatformHapticFeedback platformHapticFeedback32 = (PlatformHapticFeedback) gapComposer3.consume(CompositionLocalsKt.LocalHapticFeedback);
            RealHapticVibrator realHapticVibrator22 = (RealHapticVibrator) gapComposer3.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics32 = (Haptics) gapComposer3.consume(HapticsKt.LocalHaptics);
            String stringResource3 = Room.stringResource(gapComposer3, R.string.keypad_description_glyph_backspace);
            String stringResource22 = Room.stringResource(gapComposer3, R.string.keypad_description_glyph_decimal);
            Modifier m279heightInVpY3zN4$default2 = SizeKt.m279heightInVpY3zN4$default(modifier4, RecyclerView.DECELERATION_RATE, 284.0f, 1);
            int i112 = i4;
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            RealHapticVibrator realHapticVibrator32 = realHapticVibrator22;
            String str42 = stringResource22;
            int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, m279heightInVpY3zN4$default2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
            textStyle3 = textStyle2;
            j3 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconKt$$ExternalSyntheticLambda1(modifier3, keypadViewModel, textStyle3, j3, i, i2);
        }
    }

    public static final void KeypadView_ww6aTOc$lambda$3$0$0$0$handleClick(KeypadViewModel.KeypadKey keypadKey, KeypadViewModel keypadViewModel, RealHapticVibrator realHapticVibrator, Haptics haptics, PlatformHapticFeedback platformHapticFeedback, CoroutineScope coroutineScope, MutableState mutableState) {
        if (keypadViewModel.hapticsImprovementsEnabled) {
            realHapticVibrator.vibrate(haptics.input.subtle);
        } else {
            platformHapticFeedback.m769performHapticFeedbackCdsT49E(0);
        }
        mutableState.setValue(keypadKey);
        keypadViewModel.onClick.invoke(keypadKey);
        JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 15), 3);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinMap.deepLinkSpecs;
    }

    public static final void recursiveFetchArrayMap(ArrayMap arrayMap, Function1 function1) {
        arrayMap.getClass();
        ArrayMap arrayMap2 = new ArrayMap(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        int i = arrayMap.size;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            arrayMap2.put(arrayMap.keyAt(i2), arrayMap.valueAt(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                function1.invoke(arrayMap2);
                arrayMap2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            function1.invoke(arrayMap2);
        }
    }
}
