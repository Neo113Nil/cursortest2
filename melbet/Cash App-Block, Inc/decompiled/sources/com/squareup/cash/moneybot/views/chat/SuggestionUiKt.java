package com.squareup.cash.moneybot.views.chat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowIcon;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowModel;
import com.squareup.cash.moneybot.viewmodels.SuggestionViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SuggestionUiKt {
    public static final CubicBezierEasing SUGGESTION_ANIMATION_EASING = EasingFunctionsKt.EaseOutExpo;

    public static final void SuggestionPill(Modifier modifier, SuggestionViewModel.SuggestionPillViewModel suggestionPillViewModel, Function1 function1, Function1 function12, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        boolean z;
        suggestionPillViewModel.getClass();
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(101832860);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(suggestionPillViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
        }
        int i5 = i3;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics = (Haptics) gapComposer.consume(HapticsKt.LocalHaptics);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = ((i5 & 7168) == 2048) | gapComposer.changedInstance(suggestionPillViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new TaxAuthorizationView$Content$1$1(suggestionPillViewModel, function12, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6).getValue()).booleanValue() ? 1.07f : 1.0f, AnimatableKt.spring$default(1.0f, 200.0f, null, 4), "fontSizeIncrease", null, gapComposer, 3120, 20);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj2 = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                z = false;
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(z);
            long j = moneybotColors.suggestion.pillGradientBase;
            Modifier clip = ClipKt.clip(modifier4, m340RoundedCornerShape0680j_4);
            Modifier modifier5 = modifier4;
            boolean changedInstance2 = ((i5 & 896) == 256) | gapComposer.changedInstance(realHapticVibrator) | gapComposer.changed(haptics) | gapComposer.changedInstance(suggestionPillViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                rememberedValue3 = new BasicShieetScope$$ExternalSyntheticLambda10(realHapticVibrator, haptics, function1, suggestionPillViewModel);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier background$default = ImageKt.background$default(ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue3, 28), new LinearGradient(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.m675copywmQWz5c$default(0.5f, j, 14)), new Color(Color.m675copywmQWz5c$default(0.2f, j, 14))}), null, 0L, 9187343241974906880L), m340RoundedCornerShape0680j_4, 4);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(background$default, 16.0f, 10.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, Room.pack(4294967296L, ((Number) animateFloatAsState.getValue()).floatValue() * TextUnit.m1059getValueimpl(textStyle.spanStyle.fontSize)), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.placeholder, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, (String) null, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(modifier3, suggestionPillViewModel, function1, function12, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuggestionRow(Modifier modifier, final SuggestionRowModel suggestionRowModel, SuggestionRowStyle suggestionRowStyle, boolean z, boolean z2, TextStyle textStyle, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        Function0 function03;
        int i5;
        int i6;
        GapComposer gapComposer;
        SuggestionRowStyle suggestionRowStyle2;
        boolean z4;
        Modifier modifier3;
        boolean z5;
        Function0 function04;
        Function0 function05;
        TextStyle textStyle2;
        RecomposeScopeImpl endRestartGroup;
        SuggestionRowStyle suggestionRowStyle3;
        Function0 function06;
        TextStyle textStyle3;
        int i7;
        Function0 function07;
        boolean z6;
        int i8;
        Object obj;
        Function0 function08;
        TextStyle textStyle4;
        Function0 function09;
        boolean z7;
        boolean z8;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        suggestionRowModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1844868230);
        Applier applier = gapComposer2.applier;
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(suggestionRowModel) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(suggestionRowStyle == null ? -1 : suggestionRowStyle.ordinal()) ? 256 : 128;
        }
        int i11 = i3 | 3072;
        int i12 = i2 & 16;
        if (i12 != 0) {
            i11 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            z3 = z2;
            i11 |= gapComposer2.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i) == 0) {
                i11 |= 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i11 |= 1572864;
                function03 = function0;
            } else {
                function03 = function0;
                if ((i & 1572864) == 0) {
                    i11 |= gapComposer2.changedInstance(function03) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i11 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i11 |= gapComposer2.changedInstance(function02) ? 8388608 : 4194304;
            }
            i6 = i11;
            if (gapComposer2.shouldExecute(i6 & 1, (i11 & 4793491) == 4793490)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                suggestionRowStyle2 = suggestionRowStyle;
                z4 = z;
                modifier3 = modifier2;
                z5 = z3;
                function04 = function02;
                function05 = function03;
                textStyle2 = textStyle;
            } else {
                gapComposer2.startDefaults();
                int i13 = i & 1;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Object obj2 = Composer.Companion.Empty;
                if (i13 == 0 || gapComposer2.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = companion;
                    }
                    suggestionRowStyle3 = i10 != 0 ? SuggestionRowStyle.DEFAULT : suggestionRowStyle;
                    if (i12 != 0) {
                        z3 = true;
                    }
                    TextStyle textStyle5 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    int i14 = i6 & (-458753);
                    if (i4 != 0) {
                        Object rememberedValue = gapComposer2.rememberedValue();
                        Object obj3 = rememberedValue;
                        if (rememberedValue == obj2) {
                            Object moneyTabUIKt$$ExternalSyntheticLambda6 = new MoneyTabUIKt$$ExternalSyntheticLambda6(17);
                            gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda6);
                            obj3 = moneyTabUIKt$$ExternalSyntheticLambda6;
                        }
                        function03 = (Function0) obj3;
                    }
                    if (i5 != 0) {
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        Object obj4 = rememberedValue2;
                        if (rememberedValue2 == obj2) {
                            Object moneyTabUIKt$$ExternalSyntheticLambda62 = new MoneyTabUIKt$$ExternalSyntheticLambda6(18);
                            gapComposer2.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda62);
                            obj4 = moneyTabUIKt$$ExternalSyntheticLambda62;
                        }
                        function06 = (Function0) obj4;
                    } else {
                        function06 = function02;
                    }
                    textStyle3 = textStyle5;
                    i7 = i14;
                    function07 = function03;
                    z6 = true;
                } else {
                    gapComposer2.skipToGroupEnd();
                    textStyle3 = textStyle;
                    function06 = function02;
                    i7 = i6 & (-458753);
                    function07 = function03;
                    suggestionRowStyle3 = suggestionRowStyle;
                    z6 = z;
                }
                gapComposer2.endDefaults();
                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
                SuggestionRowStyle suggestionRowStyle4 = suggestionRowStyle3;
                Haptics haptics = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
                boolean z9 = z3;
                Boolean valueOf = Boolean.valueOf(z6);
                int i15 = i7 & 7168;
                int i16 = i7;
                boolean z10 = (i15 == 2048) | ((i7 & 29360128) == 8388608);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                Continuation continuation = null;
                if (z10 || rememberedValue3 == obj2) {
                    i8 = i15;
                    Object realBadger2$scheduleBadgeClearingWork$3 = new RealBadger2$scheduleBadgeClearingWork$3(z6, function06, continuation, 5);
                    gapComposer2.updateRememberedValue(realBadger2$scheduleBadgeClearingWork$3);
                    obj = realBadger2$scheduleBadgeClearingWork$3;
                } else {
                    i8 = i15;
                    obj = rememberedValue3;
                }
                Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) obj);
                int ordinal = suggestionRowStyle4.ordinal();
                if (ordinal == 0) {
                    boolean z11 = z6;
                    function08 = function07;
                    textStyle4 = textStyle3;
                    function09 = function06;
                    gapComposer2.startReplaceGroup(-2065667263);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier2, j, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    final int i17 = 1;
                    CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(ComposableSingletons$SuggestionUiKt.f479lambda$1868844553, 1);
                    final int i18 = 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(832790433, new Function2() { // from class: com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i19 = i18;
                            SuggestionRowModel suggestionRowModel2 = suggestionRowModel;
                            switch (i19) {
                                case 0:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue = ((Integer) obj6).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        SuggestionUiKt.SuggestionRowIcon(suggestionRowModel2.getIcon(), gapComposer3, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
                                        String title = suggestionRowModel2.getTitle();
                                        TextStyle textStyle6 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                        } else {
                                            gapComposer4.startReplaceGroup(-1762997739);
                                            gapComposer4.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors2.semantic.text.subtle, (Composer) gapComposer4, m302paddingqDBjuR0$default, textStyle6, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        String body = suggestionRowModel2.getBody();
                                        TextStyle textStyle7 = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).marketingCardTitleSmall;
                                        Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                        if (colors3 == null) {
                                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                        } else {
                                            gapComposer5.startReplaceGroup(-1762997739);
                                            gapComposer5.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer5, (Modifier) null, textStyle7, (TextLineBalancing) null, body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(591093120, new Function2() { // from class: com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i19 = i17;
                            SuggestionRowModel suggestionRowModel2 = suggestionRowModel;
                            switch (i19) {
                                case 0:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue = ((Integer) obj6).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        SuggestionUiKt.SuggestionRowIcon(suggestionRowModel2.getIcon(), gapComposer3, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
                                        String title = suggestionRowModel2.getTitle();
                                        TextStyle textStyle6 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                        } else {
                                            gapComposer4.startReplaceGroup(-1762997739);
                                            gapComposer4.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors2.semantic.text.subtle, (Composer) gapComposer4, m302paddingqDBjuR0$default, textStyle6, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        String body = suggestionRowModel2.getBody();
                                        TextStyle textStyle7 = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).marketingCardTitleSmall;
                                        Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                        if (colors3 == null) {
                                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                        } else {
                                            gapComposer5.startReplaceGroup(-1762997739);
                                            gapComposer5.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer5, (Modifier) null, textStyle7, (TextLineBalancing) null, body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2);
                    boolean changedInstance = (i8 == 2048) | gapComposer2.changedInstance(realHapticVibrator) | gapComposer2.changed(haptics) | ((i16 & 3670016) == 1048576);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue4 == obj2) {
                        rememberedValue4 = new ShiftListViewKt$$ExternalSyntheticLambda10(z11, realHapticVibrator, haptics, function08, 3);
                        z4 = z11;
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    } else {
                        z4 = z11;
                    }
                    final int i19 = 2;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, companion, (Function0) rememberedValue4, null, false, true, Expect_jvmKt.rememberComposableLambda(-859090758, new Function2() { // from class: com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            int i192 = i19;
                            SuggestionRowModel suggestionRowModel2 = suggestionRowModel;
                            switch (i192) {
                                case 0:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue = ((Integer) obj6).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        SuggestionUiKt.SuggestionRowIcon(suggestionRowModel2.getIcon(), gapComposer3, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
                                        String title = suggestionRowModel2.getTitle();
                                        TextStyle textStyle6 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                        Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                        } else {
                                            gapComposer4.startReplaceGroup(-1762997739);
                                            gapComposer4.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors2.semantic.text.subtle, (Composer) gapComposer4, m302paddingqDBjuR0$default, textStyle6, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer4;
                                    if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                        String body = suggestionRowModel2.getBody();
                                        TextStyle textStyle7 = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).marketingCardTitleSmall;
                                        Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                        if (colors3 == null) {
                                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                        } else {
                                            gapComposer5.startReplaceGroup(-1762997739);
                                            gapComposer5.end(false);
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer5, (Modifier) null, textStyle7, (TextLineBalancing) null, body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), null, label, 0L, null, gapComposer2, 14156214, 0, 3376);
                    gapComposer = gapComposer2;
                    if (z9) {
                        gapComposer.startReplaceGroup(698691120);
                        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            z7 = false;
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            z7 = false;
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        ModalKt.HorizontalDivider(z7 ? 1 : 0, z7 ? 1 : 0, gapComposer, ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.border.subtle, rectangleShapeKt$RectangleShape$1));
                        gapComposer.end(z7);
                    } else {
                        z7 = false;
                        gapComposer.startReplaceGroup(698797791);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    gapComposer.end(z7);
                } else {
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 903143302, false);
                    }
                    gapComposer2.startReplaceGroup(-2067330010);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
                    MoneybotColors moneybotColors = (MoneybotColors) gapComposer2.consume(MoneybotThemeKt.LocalMoneybotColors);
                    if (moneybotColors == null) {
                        gapComposer2.startReplaceGroup(-973090538);
                        Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            z8 = false;
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            z8 = false;
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        moneybotColors = MoneybotColorsKt.fromArcade(colors3);
                    } else {
                        z8 = false;
                        gapComposer2.startReplaceGroup(-973091964);
                    }
                    gapComposer2.end(z8);
                    Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(fillMaxWidth, moneybotColors.suggestion.cardBackground, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
                    boolean changedInstance2 = gapComposer2.changedInstance(realHapticVibrator) | gapComposer2.changed(haptics) | ((i16 & 3670016) == 1048576);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    Object obj5 = rememberedValue5;
                    if (changedInstance2 || rememberedValue5 == obj2) {
                        Object suggestionUiKt$$ExternalSyntheticLambda2 = new SuggestionUiKt$$ExternalSyntheticLambda2(realHapticVibrator, haptics, function07, 0);
                        gapComposer2.updateRememberedValue(suggestionUiKt$$ExternalSyntheticLambda2);
                        obj5 = suggestionUiKt$$ExternalSyntheticLambda2;
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, z6, null, null, (Function0) obj5, 14);
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m183clickableoSLSa3U$default, 24.0f, 24.0f, 16.0f, 24.0f);
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    Strings.getSizes(gapComposer2).getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 48);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf2 = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    boolean z12 = z6;
                    Function0 function010 = function07;
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    Function0 function011 = function06;
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String title = suggestionRowModel.getTitle();
                    long j2 = Strings.getColors(gapComposer2).semantic.text.subtle;
                    function09 = function011;
                    function08 = function010;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j2, (Composer) gapComposer2, (Modifier) null, textStyle3, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle3, (TextLineBalancing) null, suggestionRowModel.getBody(), (Map) null, (Function1) null, false);
                    textStyle4 = textStyle3;
                    gapComposer2.end(true);
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 44.0f), Strings.getColors(gapComposer2).semantic.background.standard, RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    Trace.m1191Iconww6aTOc(Icons.SendArrow24, (String) null, SizeKt.m285size3ABfNKs(companion, 24.0f), Strings.getColors(gapComposer2).semantic.icon.standard, gapComposer2, 438, 0);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer2, true, true, false);
                    z4 = z12;
                    gapComposer = gapComposer2;
                }
                function04 = function09;
                modifier3 = modifier2;
                z5 = z9;
                function05 = function08;
                textStyle2 = textStyle4;
                suggestionRowStyle2 = suggestionRowStyle4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda7(modifier3, suggestionRowModel, suggestionRowStyle2, z4, z5, textStyle2, function05, function04, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        if ((196608 & i) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i11;
        if (gapComposer2.shouldExecute(i6 & 1, (i11 & 4793491) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SuggestionRowIcon(SuggestionRowIcon suggestionRowIcon, Composer composer, int i) {
        Icons icons;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1669086181);
        int i2 = (gapComposer.changedInstance(suggestionRowIcon) ? 4 : 2) | i;
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (suggestionRowIcon == null) {
            gapComposer.startReplaceGroup(-909946725);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-909946724);
            if (suggestionRowIcon instanceof SuggestionRowIcon.Avatar) {
                gapComposer.startReplaceGroup(1960312327);
                UiAvatar uiAvatar = ((SuggestionRowIcon.Avatar) suggestionRowIcon).avatar;
                Icon icon = uiAvatar.icon;
                Color color = null;
                if (icon == null || (str = icon.arcade_id) == null) {
                    icons = null;
                } else {
                    Icons.Companion.getClass();
                    icons = zzd.get(str);
                }
                AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer, 1);
                AvatarSize avatarSize = AvatarSize.Size48;
                if (icons != null) {
                    gapComposer.startReplaceGroup(1960575796);
                } else {
                    gapComposer.startReplaceGroup(1960625985);
                    com.squareup.protos.cash.ui.Color color2 = uiAvatar.background_color;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(1960715698);
                        gapComposer.end(false);
                    } else {
                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1725816879, color2, gapComposer, false);
                    }
                    avatarEntry = AvatarEntry.m3382copyDuSw1wk$default(avatarEntry, color != null ? color.value : Color.Transparent, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                }
                gapComposer.end(false);
                TextViewKt.Avatar(avatarSize, avatarEntry, null, false, gapComposer, 6, 28);
                gapComposer.end(false);
            } else {
                if (!(suggestionRowIcon instanceof SuggestionRowIcon.Image)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1725802486, false);
                }
                gapComposer.startReplaceGroup(1960841125);
                ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, ThemablesKt.urlForTheme(((SuggestionRowIcon.Image) suggestionRowIcon).image, gapComposer)), null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, gapComposer, 25008, 104);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(suggestionRowIcon, i, i3);
        }
    }

    public static final void SuggestionsVerticalStack(FocusOwnerImpl focusOwnerImpl, List list, SuggestionRowStyle suggestionRowStyle, boolean z, KeyboardState keyboardState, Function1 function1, Function1 function12, Composer composer, int i, int i2) {
        SuggestionRowStyle suggestionRowStyle2;
        KeyboardState keyboardState2;
        Function1 function13;
        int i3;
        SuggestionRowStyle suggestionRowStyle3;
        boolean z2;
        int i4;
        Iterator it;
        SuggestionRowStyle suggestionRowStyle4;
        KeyboardState keyboardState3;
        Modifier.Companion companion;
        int i5;
        SuggestionRowStyle suggestionRowStyle5;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function14;
        boolean z3;
        boolean z4 = z;
        Function1 function15 = function12;
        focusOwnerImpl.getClass();
        list.getClass();
        function15.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2137101744);
        int i6 = (gapComposer.changedInstance(focusOwnerImpl) ? 4 : 2) | i | (gapComposer.changedInstance(list) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer.changed(suggestionRowStyle == null ? -1 : suggestionRowStyle.ordinal()) ? 256 : 128;
        }
        int i8 = i6 | 204800;
        if (gapComposer.shouldExecute(i8 & 1, (599187 & i8) != 599186)) {
            gapComposer.startDefaults();
            int i9 = i & 1;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (i9 == 0 || gapComposer.getDefaultsInvalid()) {
                SuggestionRowStyle suggestionRowStyle6 = i7 != 0 ? SuggestionRowStyle.DEFAULT : suggestionRowStyle;
                KeyboardState rememberKeyboardState = UtilsKt.rememberKeyboardState(gapComposer);
                int i10 = i8 & (-57345);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(13);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function16 = (Function1) rememberedValue;
                i3 = i10;
                suggestionRowStyle3 = suggestionRowStyle6;
                keyboardState2 = rememberKeyboardState;
                function13 = function16;
            } else {
                gapComposer.skipToGroupEnd();
                keyboardState2 = keyboardState;
                function13 = function1;
                i3 = i8 & (-57345);
                suggestionRowStyle3 = suggestionRowStyle;
            }
            gapComposer.endDefaults();
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                z2 = true;
                rememberedValue2 = new InsightChartKt$$ExternalSyntheticLambda19(14);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                z2 = true;
            }
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier graphicsLayer = ColorKt.graphicsLayer(companion2, (Function1) rememberedValue2);
            boolean changed = gapComposer.changed(keyboardState2.ordinal()) | gapComposer.changedInstance(focusOwnerImpl) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy2) {
                i4 = 0;
                rememberedValue3 = new SuggestionUiKt$SuggestionsVerticalStack$3$1(keyboardState2, focusOwnerImpl, delegatingSoftwareKeyboardController, 0);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                i4 = 0;
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(graphicsLayer, keyboardState2, (PointerInputEventHandler) rememberedValue3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, i4);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1732399287);
            Iterator it2 = list.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                Object obj = (SuggestionViewModel) next;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy2) {
                    rememberedValue4 = Recorder$$ExternalSyntheticOutline1.m(!z4, gapComposer);
                }
                MutableState mutableState = (MutableState) rememberedValue4;
                Boolean valueOf = Boolean.valueOf(z4);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy2) {
                    it = it2;
                    suggestionRowStyle4 = suggestionRowStyle3;
                    rememberedValue5 = new CashMapViewKt$CashMapView$3$1(z4, mutableState, null, 9);
                    gapComposer.updateRememberedValue(rememberedValue5);
                } else {
                    it = it2;
                    suggestionRowStyle4 = suggestionRowStyle3;
                }
                Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue5);
                boolean z5 = (keyboardState2 == KeyboardState.Open || i11 >= list.size() + (-1)) ? false : z2;
                boolean z6 = obj instanceof SuggestionViewModel.SuggestionPillViewModel;
                CubicBezierEasing cubicBezierEasing = SUGGESTION_ANIMATION_EASING;
                if (z6) {
                    gapComposer.startReplaceGroup(1100444671);
                    NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
                    GapComposer gapComposer2 = gapComposer;
                    boolean z7 = z5;
                    int i13 = i3;
                    companion = companion2;
                    gapComposer = gapComposer2;
                    Modifier alpha = AlphaKt.alpha(OffsetKt.m273offsetVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, ((Dp) AnimateAsStateKt.m155animateDpAsStateAjpBEmI(((Boolean) mutableState.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 20.0f + (((list.size() - 1) - i11) * 25), AnimatableKt.tween$default(600, 0, cubicBezierEasing, 2), "y", null, gapComposer2, 432, 8).getValue()).value, z2 ? 1 : 0), ((Number) AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(600, 0, cubicBezierEasing, 2), "alpha", null, gapComposer2, 3120, 20).getValue()).floatValue());
                    SuggestionViewModel.SuggestionPillViewModel suggestionPillViewModel = (SuggestionViewModel.SuggestionPillViewModel) obj;
                    boolean changedInstance = gapComposer.changedInstance(focusOwnerImpl);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue6 == neverEqualPolicy3) {
                        rememberedValue6 = new SuggestionUiKt$$ExternalSyntheticLambda13(function15, focusOwnerImpl, 0);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    keyboardState3 = keyboardState2;
                    Function1 function17 = function13;
                    SuggestionPill(alpha, suggestionPillViewModel, (Function1) rememberedValue6, function15, gapComposer, 3072, 0);
                    if (z7) {
                        gapComposer.startReplaceGroup(1101484163);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1101562965);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                    suggestionRowStyle5 = suggestionRowStyle4;
                    neverEqualPolicy = neverEqualPolicy3;
                    function14 = function17;
                    i5 = i13;
                } else {
                    boolean z8 = z5;
                    keyboardState3 = keyboardState2;
                    Function1 function18 = function13;
                    Function1 function19 = function15;
                    int i14 = i3;
                    companion = companion2;
                    if (!(obj instanceof SuggestionViewModel.SuggestionsRowViewModel)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -103049059, false);
                    }
                    gapComposer.startReplaceGroup(1101666195);
                    int i15 = i11 * 70;
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, new TweenSpec(600, i15, cubicBezierEasing), "alpha", null, gapComposer, 3072, 20);
                    State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(((Boolean) mutableState.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 20.0f + (((list.size() - 1) - i11) * 25), new TweenSpec(600, i15, cubicBezierEasing), "y", null, gapComposer, MLKEMEngine.KyberPolyBytes, 8);
                    boolean changed2 = gapComposer.changed(i11);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue7 == neverEqualPolicy2) {
                        rememberedValue7 = new SuggestionUiKt$$ExternalSyntheticLambda14(i11, function18);
                        gapComposer.updateRememberedValue(rememberedValue7);
                    }
                    Modifier alpha2 = AlphaKt.alpha(OffsetKt.m273offsetVpY3zN4$default(ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue7), RecyclerView.DECELERATION_RATE, ((Dp) m155animateDpAsStateAjpBEmI.getValue()).value, 1), ((Number) animateFloatAsState.getValue()).floatValue());
                    SuggestionRowModel suggestionRowModel = (SuggestionRowModel) obj;
                    boolean changedInstance2 = gapComposer.changedInstance(obj) | gapComposer.changedInstance(focusOwnerImpl);
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue8 == neverEqualPolicy2) {
                        rememberedValue8 = new BasicShieetScope$$ExternalSyntheticLambda10(3, function19, (SuggestionViewModel.SuggestionsRowViewModel) obj, focusOwnerImpl);
                        gapComposer.updateRememberedValue(rememberedValue8);
                    }
                    Function0 function0 = (Function0) rememberedValue8;
                    boolean changedInstance3 = gapComposer.changedInstance(obj);
                    Object rememberedValue9 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue9 == neverEqualPolicy2) {
                        rememberedValue9 = new MoneyTabUIKt$$ExternalSyntheticLambda21((SuggestionViewModel.SuggestionsRowViewModel) obj, function19);
                        gapComposer.updateRememberedValue(rememberedValue9);
                    }
                    i5 = i14;
                    suggestionRowStyle5 = suggestionRowStyle4;
                    neverEqualPolicy = neverEqualPolicy2;
                    function14 = function18;
                    GapComposer gapComposer3 = gapComposer;
                    SuggestionRow(alpha2, suggestionRowModel, suggestionRowStyle5, false, z8, null, function0, (Function0) rememberedValue9, gapComposer3, i5 & 896, 40);
                    gapComposer = gapComposer3;
                    if (suggestionRowStyle5 != SuggestionRowStyle.CARD || i11 >= list.size() - 1) {
                        z3 = false;
                        gapComposer.startReplaceGroup(1103318805);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1103240003);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
                        z3 = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z3);
                }
                i3 = i5;
                function13 = function14;
                companion2 = companion;
                suggestionRowStyle3 = suggestionRowStyle5;
                i11 = i12;
                keyboardState2 = keyboardState3;
                neverEqualPolicy2 = neverEqualPolicy;
                z2 = true;
                z4 = z;
                it2 = it;
                function15 = function12;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            suggestionRowStyle2 = suggestionRowStyle3;
        } else {
            gapComposer.skipToGroupEnd();
            suggestionRowStyle2 = suggestionRowStyle;
            keyboardState2 = keyboardState;
            function13 = function1;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(focusOwnerImpl, list, suggestionRowStyle2, z, keyboardState2, function13, function12, i, i2);
        }
    }
}
