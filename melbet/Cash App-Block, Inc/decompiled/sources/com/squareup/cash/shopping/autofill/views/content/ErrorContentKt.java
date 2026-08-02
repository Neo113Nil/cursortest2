package com.squareup.cash.shopping.autofill.views.content;

import android.content.Context;
import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackLayoutWeightElement;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.autofill.screens.AutofillData;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ErrorContentKt {

    /* renamed from: lambda$-6433471, reason: not valid java name */
    public static final ComposableLambdaImpl f660lambda$6433471 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(16), false, -6433471);

    /* renamed from: lambda$-1589500211, reason: not valid java name */
    public static final ComposableLambdaImpl f658lambda$1589500211 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(17), false, -1589500211);

    /* renamed from: lambda$-631491338, reason: not valid java name */
    public static final ComposableLambdaImpl f659lambda$631491338 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(28), false, -631491338);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void Address(Modifier modifier, AutofillData autofillData, Composer composer, int i) {
        Modifier modifier2;
        String str;
        Modifier.Companion companion;
        String str2;
        String str3;
        ?? r1;
        ?? r0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-216797692);
        int i2 = i | 6 | (gapComposer.changedInstance(autofillData) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m301paddingqDBjuR0(companion2, 16.0f, 32.0f, 16.0f, 16.0f), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            String str4 = autofillData.fullName;
            String str5 = autofillData.phone;
            String str6 = autofillData.email;
            String str7 = autofillData.formattedAddress;
            String takeIfNotBlank = str4 != null ? takeIfNotBlank(str4) : null;
            if (takeIfNotBlank == null) {
                gapComposer.startReplaceGroup(-641129402);
                gapComposer.end(false);
                companion = companion2;
                str3 = str5;
                r1 = 0;
                r0 = 1;
                str2 = str6;
                str = str7;
            } else {
                gapComposer.startReplaceGroup(-641129401);
                str = str7;
                companion = companion2;
                str2 = str6;
                str3 = str5;
                r1 = 0;
                r0 = 1;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, takeIfNotBlank, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            if (str == null && str2 == null && str3 == null) {
                gapComposer.startReplaceGroup(-640929420);
                gapComposer.end(r1);
            } else {
                gapComposer.startReplaceGroup(-640967860);
                DBUtil.SpacerWithinSectionSmall(r1, r0, gapComposer, null);
                gapComposer.end(r1);
            }
            BodyText(str, gapComposer, r1);
            BodyText(str2, gapComposer, r1);
            BodyText(str3, gapComposer, r1);
            gapComposer.end(r0);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(modifier2, autofillData, i, 25);
        }
    }

    public static final void BodyText(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1603522153);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String takeIfNotBlank = str != null ? takeIfNotBlank(str) : null;
            if (takeIfNotBlank == null) {
                gapComposer.startReplaceGroup(-1902133832);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1902133831);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, takeIfNotBlank, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda7(str, i, 28);
        }
    }

    public static final void ErrorContent(AutofillViewModel.Error error, Function1 function1, Composer composer, int i) {
        error.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1122186018);
        int i2 = (gapComposer.changedInstance(error) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Countries.PageHeader(error.title, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), f660lambda$6433471, error.bodyText, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 16.0f), 1.0f);
            String stringResource = Room.stringResource(gapComposer, R.string.ok);
            MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(error);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorContentKt$$ExternalSyntheticLambda0(function1, error, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer;
            KeypadKt.m3640ButtonGFipHI0(stringResource, (Function0) rememberedValue, fillMaxWidth2, null, null, style, null, false, 0, null, null, gapComposer, 196608, 0, 4056);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(error, function1, i, 9);
        }
    }

    public static final void LoadedContent(Modifier modifier, AutofillViewModel.Loaded loaded, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1603058478);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i3 | (gapComposer2.changedInstance(loaded) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i6 = 0;
        int i7 = 1;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            boolean z = (i5 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(17, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier3, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-1515915633, new LoadedContentKt$$ExternalSyntheticLambda1(loaded, i6), gapComposer2), (Modifier) null, f658lambda$1589500211, Expect_jvmKt.rememberComposableLambda(521191148, new LoadedContentKt$$ExternalSyntheticLambda1(loaded, i7), gapComposer2), gapComposer2, 3462, 2);
            Address(null, loaded.autofillData, gapComposer2, 0);
            if (1.0f <= 0.0d) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1.0f, "invalid weight ", "; must be greater than zero"));
                return;
            }
            DimensionKt.ButtonCtaGroup(new AdaptiveStackLayoutWeightElement(1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-1593167690, new ShareSheetViewKt$$ExternalSyntheticLambda1(27, (Object) loaded, (Object) function1), gapComposer2), gapComposer2, 24582, 14);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = modifier3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9(modifier2, loaded, function1, i, i2, 21);
        }
    }

    public static final void LoadingContent(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1263393346);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 56.0f));
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 12);
        }
    }

    public static final void MooncakeErrorContent(AutofillViewModel.Error error, Function1 function1, Composer composer, int i) {
        error.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1852189058);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(error) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            float f = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion, f), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 20.0f, RecyclerView.DECELERATION_RATE, 2), true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
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
            ImageKt.Image(Countries.painterResource(R.drawable.alert, 0, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 64.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getTypography(gapComposer).header4, 0L, Room.getSp(24), FontWeight.W500, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777209), (TextLineBalancing) null, error.title, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).mainBody, (TextLineBalancing) null, error.bodyText, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 24.0f), 1.0f);
            String stringResource = Room.stringResource(gapComposer, R.string.ok);
            MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
            boolean changedInstance = gapComposer.changedInstance(error) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorContentKt$$ExternalSyntheticLambda0(function1, error, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadKt.m3640ButtonGFipHI0(stringResource, (Function0) rememberedValue, fillMaxWidth2, null, null, style, null, false, 0, null, null, gapComposer, 196992, 0, 4056);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(error, function1, i, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0627  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MooncakeLoadedContent(Modifier modifier, AutofillViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        BiasAlignment.Horizontal horizontal;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
        float f;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Arrangement$Top$1 arrangement$Top$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        int i4;
        boolean z2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18;
        int i5;
        NeverEqualPolicy neverEqualPolicy2;
        int i6;
        Object rememberedValue;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14;
        Painter painter;
        BlendModeColorFilter blendModeColorFilter;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19;
        AutofillViewModel.Loaded loaded2 = loaded;
        Function1 function12 = function1;
        loaded2.getClass();
        String str = loaded2.subtitle;
        AutofillData autofillData = loaded2.autofillData;
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1647899104);
        Applier applier = gapComposer.applier;
        int i7 = i | (gapComposer.changedInstance(loaded2) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
            Theme theme = ThemeHelpersKt.themeInfo((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).theme;
            int ordinal = theme.ordinal();
            if (ordinal == 0) {
                i2 = -723724;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = -12237241;
            }
            long Color = ColorKt.Color(i2);
            int ordinal2 = theme.ordinal();
            if (ordinal2 == 0) {
                i3 = -1;
            } else {
                if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i3 = -13750480;
            }
            long Color2 = ColorKt.Color(i3);
            long j = MooncakeTheme.getColors(gapComposer).elevatedBackground;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(modifier, j, rectangleShapeKt$RectangleShape$1), 24.0f, 24.0f, 24.0f, 19.0f), 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer), null);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal2, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, nestedScroll);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$15);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$110);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$111);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$112);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$113 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$113);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(OffsetKt.height(companion, intrinsicSize), 1.0f), true), ImageKt.rememberScrollState(gapComposer), false, 14);
            Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$15);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$110);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$111);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$112, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$113);
            Painter painterResource = Countries.painterResource(R.drawable.cash, 0, gapComposer);
            int i8 = Painter.$stable | 48;
            ImageKt.Image(painterResource, null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, i8, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            GapComposer gapComposer2 = gapComposer;
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 16.0f));
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, MooncakeTheme.getTypography(gapComposer2).header2, (TextLineBalancing) null, loaded.title, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 12.0f));
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, MooncakeTheme.getTypography(gapComposer2).smallBody, (TextLineBalancing) null, loaded.bodyText, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 12.0f));
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ClipKt.clip(companion, RoundedCornerShapeKt.RoundedCornerShape(10)), Color2, rectangleShapeKt$RectangleShape$1), 2.0f, Color, RoundedCornerShapeKt.RoundedCornerShape(10)), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 0);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$15;
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$15;
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$110);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$111);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$112, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$113);
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 0);
            int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$110);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$111);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$112, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$113);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer2, 54);
            int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$110);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$111);
            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$112, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$113);
            String str2 = autofillData.fullName;
            if (str2 == null) {
                gapComposer2.startReplaceGroup(-2036570431);
                gapComposer2.end(false);
                horizontal = horizontal2;
                arrangement$Top$1 = arrangement$Top$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$111;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$113;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$112;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$110;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                z = true;
                f = 2.0f;
            } else {
                gapComposer2.startReplaceGroup(-2036570430);
                horizontal = horizontal2;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                f = 2.0f;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$112;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$110;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$113;
                arrangement$Top$1 = arrangement$Top$12;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$111;
                z = true;
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer2, (Modifier) new LayoutWeightElement(2.0f, true), MooncakeTheme.getTypography(gapComposer2).header4, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer2.end(false);
            }
            boolean z3 = loaded.editable;
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (z3) {
                gapComposer2.startReplaceGroup(-2036347199);
                SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 16.0f));
                String stringResource = Room.stringResource(gapComposer2, R.string.edit);
                MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
                MooncakePillButton.Size size = MooncakePillButton.Size.SMALL;
                boolean z4 = (i7 & 896) == 256 ? z : false;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy3) {
                    rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda0(20, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                neverEqualPolicy = neverEqualPolicy3;
                i4 = i7;
                KeypadKt.m3640ButtonGFipHI0(stringResource, (Function0) rememberedValue2, null, null, size, style, null, false, 0, null, null, gapComposer2, 221184, 0, 4044);
                gapComposer2 = gapComposer2;
                gapComposer2.end(false);
            } else {
                neverEqualPolicy = neverEqualPolicy3;
                i4 = i7;
                gapComposer2.startReplaceGroup(-2036073314);
                gapComposer2.end(false);
            }
            gapComposer2.end(z);
            Updater.CompositionLocalProvider(re$$ExternalSyntheticOutline0.m(MooncakeTheme.getColors(gapComposer2).secondaryLabel, ComposeMooncakeThemeKt.LocalTextColor), Expect_jvmKt.rememberComposableLambda(-83617208, new LoadedContentKt$$ExternalSyntheticLambda1(loaded, 2), gapComposer2), gapComposer2, 56);
            gapComposer2.end(z);
            if (autofillData.cardMasked != null) {
                gapComposer2.startReplaceGroup(1965868701);
                KeypadKt.m3642DivideraMcp0Q(null, Color, f, gapComposer2, MLKEMEngine.KyberPolyBytes, 1);
                Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
                int hashCode6 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs2);
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    layoutNode$Companion$Constructor$14 = layoutNode$Companion$Constructor$12;
                    gapComposer2.createNode(layoutNode$Companion$Constructor$14);
                } else {
                    layoutNode$Companion$Constructor$14 = layoutNode$Companion$Constructor$12;
                    gapComposer2.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$114 = composeUiNode$Companion$SetModifier$12;
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$114);
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$14;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$115 = composeUiNode$Companion$SetModifier$1;
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$14 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer2, composeUiNode$Companion$SetModifier$115, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$116 = composeUiNode$Companion$SetModifier$13;
                Updater.m576setimpl(gapComposer2, materializeModifier6, composeUiNode$Companion$SetModifier$116);
                Painter painterResource2 = Countries.painterResource(R.drawable.card, 0, gapComposer2);
                int ordinal3 = theme.ordinal();
                if (ordinal3 == 0) {
                    painter = painterResource2;
                    gapComposer2.startReplaceGroup(-756729680);
                    long j2 = MooncakeTheme.getColors(gapComposer2).icon;
                    composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$116;
                    blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    gapComposer2.end(false);
                } else {
                    if (ordinal3 != z) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -756734157, false);
                    }
                    gapComposer2.startReplaceGroup(-756732039);
                    long j3 = MooncakeTheme.getColors(gapComposer2).secondaryIcon;
                    painter = painterResource2;
                    blendModeColorFilter = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    gapComposer2.end(false);
                    composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$116;
                }
                GapComposer gapComposer3 = gapComposer2;
                composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$115;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$114;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$19;
                ImageKt.Image(painter, "Autofill card logo", null, null, null, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer3, i8, 60);
                gapComposer2 = gapComposer3;
                SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 16.0f));
                String str3 = autofillData.cardMasked;
                str3.getClass();
                layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$14;
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, MooncakeTheme.getTypography(gapComposer2).header4, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                z2 = true;
                gapComposer2.end(true);
                gapComposer2.end(false);
            } else {
                z2 = z;
                layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$12;
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$14;
                composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$1;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$13;
                gapComposer2.startReplaceGroup(1966551972);
                gapComposer2.end(false);
            }
            gapComposer2.end(z2);
            if (str != null) {
                re$$ExternalSyntheticOutline0.m(gapComposer2, 310555168, companion, 24.0f, gapComposer2);
                str.getClass();
                KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, MooncakeTheme.getTypography(gapComposer2).smallBody, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                i5 = 0;
                gapComposer2.end(false);
            } else {
                i5 = 0;
                gapComposer2.startReplaceGroup(310691630);
                gapComposer2.end(false);
            }
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, true, companion, 32.0f, gapComposer2);
            ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, i5);
            int hashCode7 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer2, companion);
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer2, composeUiNode$Companion$SetModifier$17, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer2, materializeModifier7, composeUiNode$Companion$SetModifier$18);
            loaded2 = loaded;
            int i9 = i5;
            String str4 = loaded2.ctaText;
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
            MooncakePillButton.Style style2 = MooncakePillButton.Style.PRIMARY;
            int i10 = i4 & 896;
            int i11 = i10 == 256 ? 1 : i9;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (i11 == 0) {
                neverEqualPolicy2 = neverEqualPolicy;
                if (rememberedValue3 != neverEqualPolicy2) {
                    NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy2;
                    GapComposer gapComposer4 = gapComposer2;
                    KeypadKt.m3640ButtonGFipHI0(str4, (Function0) rememberedValue3, fillMaxWidth3, null, null, style2, null, false, 0, null, null, gapComposer4, 196992, 0, 4056);
                    SpacerKt.Spacer(gapComposer4, SizeKt.m277height3ABfNKs(companion, 8.0f));
                    String stringResource2 = Room.stringResource(gapComposer4, R.string.not_now);
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    MooncakePillButton.Style style3 = MooncakePillButton.Style.TERTIARY;
                    i6 = i10 != 256 ? 1 : i9;
                    rememberedValue = gapComposer4.rememberedValue();
                    if (i6 == 0 || rememberedValue == neverEqualPolicy4) {
                        function12 = function1;
                        rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(22, function12);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    } else {
                        function12 = function1;
                    }
                    KeypadKt.m3640ButtonGFipHI0(stringResource2, (Function0) rememberedValue, fillMaxWidth4, null, null, style3, null, false, 0, null, null, gapComposer4, 196992, 0, 4056);
                    gapComposer = gapComposer4;
                    gapComposer.end(true);
                    gapComposer.end(true);
                }
            } else {
                neverEqualPolicy2 = neverEqualPolicy;
            }
            rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda0(21, function1);
            gapComposer2.updateRememberedValue(rememberedValue3);
            NeverEqualPolicy neverEqualPolicy42 = neverEqualPolicy2;
            GapComposer gapComposer42 = gapComposer2;
            KeypadKt.m3640ButtonGFipHI0(str4, (Function0) rememberedValue3, fillMaxWidth3, null, null, style2, null, false, 0, null, null, gapComposer42, 196992, 0, 4056);
            SpacerKt.Spacer(gapComposer42, SizeKt.m277height3ABfNKs(companion, 8.0f));
            String stringResource22 = Room.stringResource(gapComposer42, R.string.not_now);
            Modifier fillMaxWidth42 = SizeKt.fillMaxWidth(companion, 1.0f);
            MooncakePillButton.Style style32 = MooncakePillButton.Style.TERTIARY;
            if (i10 != 256) {
            }
            rememberedValue = gapComposer42.rememberedValue();
            if (i6 == 0) {
            }
            function12 = function1;
            rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda0(22, function12);
            gapComposer42.updateRememberedValue(rememberedValue);
            KeypadKt.m3640ButtonGFipHI0(stringResource22, (Function0) rememberedValue, fillMaxWidth42, null, null, style32, null, false, 0, null, null, gapComposer42, 196992, 0, 4056);
            gapComposer = gapComposer42;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(modifier, loaded2, function12, i, 12);
        }
    }

    public static final void MooncakeLoadingContent(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-376605620);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            float f = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(SizeKt.m277height3ABfNKs(companion, f), 40.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 56.0f));
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 30.0f));
            String stringResource = Room.stringResource(gapComposer, R.string.saving_autofill);
            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography == null) {
                mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, mooncakeTypography.mainTitle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier2, i, 13);
        }
    }

    public static final void MooncakeSuccessContent(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1817375898);
        int i2 = i | 6 | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            float f = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(SizeKt.m277height3ABfNKs(companion, f), 62.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(27, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = companion;
            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth2, context, null, 0, 0L, 0L, false, (Function0) rememberedValue, false, gapComposer, 100663686, 120);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(modifier2, 16.0f));
            KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3826, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getTypography(gapComposer).header4, 0L, 0L, FontWeight.W400, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.info_saved_success), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier2, function0, i, 13);
        }
    }

    public static final void SuccessContent(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1844171624);
        int i2 = i | 6 | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 62.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(28, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth2, context, null, 0, 0L, 0L, false, (Function0) rememberedValue, false, gapComposer, 100663686, 120);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, LazyGridKt.getLegacyTabTitle(Strings.getTypography(gapComposer)), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.info_saved_success), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier2, function0, i, 14);
        }
    }

    public static final String takeIfNotBlank(String str) {
        str.getClass();
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return str;
    }
}
