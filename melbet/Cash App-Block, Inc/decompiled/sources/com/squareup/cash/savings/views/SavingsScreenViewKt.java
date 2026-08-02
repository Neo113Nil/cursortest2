package com.squareup.cash.savings.views;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.arcade.values.ButtonProminence;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackLayoutWeightElement;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.UpsellCardModel$Loaded;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes7.dex */
public abstract class SavingsScreenViewKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection buttonGroupDirection = SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroupDirection.HORIZONTAL;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[WithinSection.Variant.values().length];
            try {
                iArr2[WithinSection.Variant.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void Disclosure(SavingsScreenViewModel.Content.SavingsScreenElement.Disclosure disclosure, Modifier modifier, Function1 function1, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1788042915);
        int i2 = i | (gapComposer.changedInstance(disclosure) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (disclosure.showIcon) {
                gapComposer.startReplaceGroup(1103720343);
                z = false;
                Trace.m1191Iconww6aTOc(Icons.Fdic24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 4);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(1103897167);
                gapComposer.end(false);
            }
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            String str = disclosure.text;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(j, 0L, Strings.getTypography(gapComposer).bodyXSmall.spanStyle.fontWeight, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434), 2);
            boolean z2 = (i2 & 896) == 256 ? true : z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, fillMaxWidth, textStyle, j, markdownSpanValues, null, null, 0, 0, 3, gapComposer, MLKEMEngine.KyberPolyBytes, 960);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(disclosure, modifier, function1, i, 29);
        }
    }

    public static final void SavingsScreen(SavingsScreenViewModel.Content content, Function1 function1, Function1 function12, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        content.getClass();
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(941885234);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            modifier2 = Modifier.Companion.$$INSTANCE;
            ScreenScaffoldKt.ScreenScaffoldColumn(SizeKt.fillMaxWidth(OffsetKt.height(ImageKt.m177backgroundbw27NRU(modifier2, j, rectangleShapeKt$RectangleShape$1), IntrinsicSize.Max), 1.0f), null, null, Expect_jvmKt.rememberComposableLambda(-1535322358, new ShareSheetViewKt$$ExternalSyntheticLambda1(19, (Object) content, (Object) function12), gapComposer), null, Expect_jvmKt.rememberComposableLambda(1553559284, new SheetKt$$ExternalSyntheticLambda5(11, content, function1, function12), gapComposer), gapComposer, 199680, 22);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(content, function1, function12, modifier2, i, 12);
        }
    }

    public static final void SavingsScreenView(SavingsScreenViewModel savingsScreenViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        RealImageLoader realImageLoader2;
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(511823513);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(savingsScreenViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer.changedInstance(realImageLoader2) ? 256 : 128;
        } else {
            realImageLoader2 = realImageLoader;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (savingsScreenViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1706161700, new PoolGoalMetKt$$ExternalSyntheticLambda0(realImageLoader2, savingsScreenViewModel, function1, (MutableState) rememberedValue2, 28), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(savingsScreenViewModel, function1, realImageLoader, i, 24);
        }
    }

    public static final void SectionHeader(SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader sectionHeader, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1724358914);
        int i2 = (gapComposer.changedInstance(sectionHeader) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = modifier;
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(1941272613, new SheetKt$$ExternalSyntheticLambda6(sectionHeader, 6), gapComposer), modifier2, (Function2) null, (Function0) null, (Function2) null, gapComposer, (i2 & 112) | 6, 28);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(sectionHeader, modifier2, i, 14);
        }
    }

    public static final void TransferButtons(final SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons, Shaker shaker, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1299802719);
        int i2 = i | (gapComposer.changedInstance(transferButtons) ? 4 : 2) | (gapComposer.changedInstance(shaker) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(shaker) | gapComposer.changedInstance(accessibilityManager) | gapComposer.changedInstance(view);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(function1, shaker, accessibilityManager, view, 4);
                gapComposer.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                rememberedValue = openSourceKt$$ExternalSyntheticLambda9;
            }
            final Function1 function12 = (Function1) rememberedValue;
            final ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1918101245, new Function2() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda29
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    final Function1 function13 = function12;
                    final SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons2 = transferButtons;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton transferButton = transferButtons2.primaryButton;
                                ButtonProminence.Id id = transferButton.prominence;
                                boolean z = transferButton.enabled;
                                Modifier testTag = TestTagKt.testTag(new AdaptiveStackLayoutWeightElement(1.0f), "savingsPrimaryButton");
                                boolean changed = gapComposer2.changed(function13) | gapComposer2.changedInstance(transferButtons2);
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (changed || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new Function0() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda42
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i7 = i6;
                                            SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                            Function1 function14 = function13;
                                            switch (i7) {
                                                case 0:
                                                    function14.invoke(transferButtons3.secondaryButton);
                                                    break;
                                                default:
                                                    function14.invoke(transferButtons3.primaryButton);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                ViewKt.ArcadeButtonDefault(id, testTag, z, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(338899419, new Function3() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda43
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i7 = i6;
                                        SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                        switch (i7) {
                                            case 0:
                                                Composer composer3 = (Composer) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer3 = (GapComposer) composer3;
                                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.secondaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer3.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.primaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2), gapComposer2, 24624, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton transferButton2 = transferButtons2.secondaryButton;
                                ButtonProminence.Id id2 = transferButton2.prominence;
                                boolean z2 = transferButton2.enabled;
                                Modifier testTag2 = TestTagKt.testTag(new AdaptiveStackLayoutWeightElement(1.0f), "savingsSecondaryButton");
                                boolean changed2 = gapComposer3.changed(function13) | gapComposer3.changedInstance(transferButtons2);
                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                                    final Object[] objArr3 = objArr == true ? 1 : 0;
                                    rememberedValue3 = new Function0() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda42
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i7 = objArr3;
                                            SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                            Function1 function14 = function13;
                                            switch (i7) {
                                                case 0:
                                                    function14.invoke(transferButtons3.secondaryButton);
                                                    break;
                                                default:
                                                    function14.invoke(transferButtons3.primaryButton);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                }
                                final Object[] objArr4 = objArr2 == true ? 1 : 0;
                                ViewKt.ArcadeButtonDefault(id2, testTag2, z2, (Function0) rememberedValue3, Expect_jvmKt.rememberComposableLambda(780592617, new Function3() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda43
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i7 = objArr4;
                                        SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                        switch (i7) {
                                            case 0:
                                                Composer composer32 = (Composer) obj4;
                                                int intValue22 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer32 = (GapComposer) composer32;
                                                if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.secondaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer32.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.primaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer3), gapComposer3, 24624, 0);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            final ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(761438993, new Function2() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda29
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    final Function1 function13 = function12;
                    final SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons2 = transferButtons;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton transferButton = transferButtons2.primaryButton;
                                ButtonProminence.Id id = transferButton.prominence;
                                boolean z = transferButton.enabled;
                                Modifier testTag = TestTagKt.testTag(new AdaptiveStackLayoutWeightElement(1.0f), "savingsPrimaryButton");
                                boolean changed = gapComposer2.changed(function13) | gapComposer2.changedInstance(transferButtons2);
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (changed || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new Function0() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda42
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i7 = i6;
                                            SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                            Function1 function14 = function13;
                                            switch (i7) {
                                                case 0:
                                                    function14.invoke(transferButtons3.secondaryButton);
                                                    break;
                                                default:
                                                    function14.invoke(transferButtons3.primaryButton);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                ViewKt.ArcadeButtonDefault(id, testTag, z, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(338899419, new Function3() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda43
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i7 = i6;
                                        SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                        switch (i7) {
                                            case 0:
                                                Composer composer32 = (Composer) obj4;
                                                int intValue22 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer32 = (GapComposer) composer32;
                                                if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.secondaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer32.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.primaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2), gapComposer2, 24624, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton transferButton2 = transferButtons2.secondaryButton;
                                ButtonProminence.Id id2 = transferButton2.prominence;
                                boolean z2 = transferButton2.enabled;
                                Modifier testTag2 = TestTagKt.testTag(new AdaptiveStackLayoutWeightElement(1.0f), "savingsSecondaryButton");
                                boolean changed2 = gapComposer3.changed(function13) | gapComposer3.changedInstance(transferButtons2);
                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                                    final int objArr3 = objArr == true ? 1 : 0;
                                    rememberedValue3 = new Function0() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda42
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i7 = objArr3;
                                            SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                            Function1 function14 = function13;
                                            switch (i7) {
                                                case 0:
                                                    function14.invoke(transferButtons3.secondaryButton);
                                                    break;
                                                default:
                                                    function14.invoke(transferButtons3.primaryButton);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                }
                                final int objArr4 = objArr2 == true ? 1 : 0;
                                ViewKt.ArcadeButtonDefault(id2, testTag2, z2, (Function0) rememberedValue3, Expect_jvmKt.rememberComposableLambda(780592617, new Function3() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda43
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        int i7 = objArr4;
                                        SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons transferButtons3 = transferButtons2;
                                        switch (i7) {
                                            case 0:
                                                Composer composer32 = (Composer) obj4;
                                                int intValue22 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer32 = (GapComposer) composer32;
                                                if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.secondaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer32.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                ((RowScope) obj3).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferButtons3.primaryButton.text, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer3), gapComposer3, 24624, 0);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            int ordinal = transferButtons.direction.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-725015092);
                zzabx.ButtonDefaultGroupHorizontal(modifier, Expect_jvmKt.rememberComposableLambda(-987376331, new Function3() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i3;
                        ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda2;
                        ComposableLambdaImpl composableLambdaImpl2 = rememberComposableLambda;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((AdaptiveStackScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    composableLambdaImpl2.invoke((Object) gapComposer2, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    composableLambdaImpl2.invoke((Object) gapComposer3, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer3, (Object) 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i2 >> 9) & 14) | 48, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -725017169, false);
                }
                gapComposer.startReplaceGroup(-725010198);
                zzabx.ButtonDefaultGroupVertical(modifier, Expect_jvmKt.rememberComposableLambda(275868698, new Function3() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i5 = i4;
                        ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda2;
                        ComposableLambdaImpl composableLambdaImpl2 = rememberComposableLambda;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((AdaptiveStackScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    composableLambdaImpl2.invoke((Object) gapComposer2, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    composableLambdaImpl2.invoke((Object) gapComposer3, (Object) 6);
                                    composableLambdaImpl.invoke((Object) gapComposer3, (Object) 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i2 >> 9) & 14) | 48, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(transferButtons, shaker, function1, modifier, i, 29);
        }
    }

    public static final void UpsellCard(SavingsScreenViewModel.Content.SavingsScreenElement.Card card, Modifier modifier, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1574183216);
        int i2 = (gapComposer.changedInstance(card) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            UpsellCardModel$Loaded upsellCardModel$Loaded = card.upsellCardModel;
            gapComposer.startReplaceGroup(255966441);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InfoSectionKt$$ExternalSyntheticLambda1(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ButtonGroupKt.SavingsUpsellCard((i2 >> 3) & 14, gapComposer, modifier, upsellCardModel$Loaded, (Function1) rememberedValue);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(card, modifier, function1, i, 2);
        }
    }

    public static final void WithinSection(SavingsScreenViewModel.Content.SavingsScreenElement.WithinSection withinSection, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1941516978);
        int i2 = (gapComposer.changedInstance(withinSection) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (WhenMappings.$EnumSwitchMapping$1[withinSection.variant.ordinal()] == 1) {
                gapComposer.startReplaceGroup(-1782004751);
                DBUtil.SpacerWithinSectionMedium((i2 >> 3) & 14, 0, gapComposer, modifier);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1782003216);
                DBUtil.SpacerWithinSectionSmall((i2 >> 3) & 14, 0, gapComposer, modifier);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(withinSection, modifier, i, 13);
        }
    }
}
