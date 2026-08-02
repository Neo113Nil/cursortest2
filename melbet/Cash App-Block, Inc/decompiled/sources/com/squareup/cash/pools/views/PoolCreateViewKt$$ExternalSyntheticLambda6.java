package com.squareup.cash.pools.views;

import android.icu.text.MessageFormat;
import androidx.appcompat.app.LocaleOverlayHelper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda0;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt;
import com.squareup.cash.card.onboarding.DisclosureViewKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolCreateViewKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PoolCreateViewKt$$ExternalSyntheticLambda6(String str, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        String str = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, false, 10);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, (Function2) rememberedValue, null, null, 0L, new MarkdownSpanValues(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkMedium.spanStyle, 2), null, null, 0, 0, 0, gapComposer, 0, 2012);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 32.0f), RoundedCornerShapeKt.CircleShape);
                    boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changed(str);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 2);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue2, 15);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m183clickableoSLSa3U$default, colors.semantic.background.standard, rectangleShapeKt$RectangleShape$1), 8.0f);
                    Painter painter = Icons.Document16.painter(gapComposer2);
                    Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors2.semantic.icon.standard;
                    ImageKt.Image(painter, null, m298padding3ABfNKs, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 24624, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer3).surface.keypad.background, rectangleShapeKt$RectangleShape$1);
                    NavigationType navigationType = NavigationType.CLOSE;
                    DynamicColorConfiguration m1173invokeRGew2ao = TransactorKt.m1173invokeRGew2ao(Strings.getColors(gapComposer3).component.titleBar.keypad.icon.f219default, Strings.getColors(gapComposer3).component.titleBar.keypad.icon.f219default, 0L, gapComposer3, 4);
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AccountToDoKt$$ExternalSyntheticLambda0(19, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, m177backgroundbw27NRU, m1173invokeRGew2ao, (Function0) rememberedValue3, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1494936951, new TabContentViewKt$$ExternalSyntheticLambda11(str, function1, 2), gapComposer3), gapComposer3, 1572918, 32);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                LocaleOverlayHelper.BusinessAddressSection(str, function1, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.PurchasesToolbar(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new SwipeToDismissKt$$ExternalSyntheticLambda4(29, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, (Function2) rememberedValue4, null, null, 0L, null, null, null, 0, 0, 0, gapComposer4, 0, 2044);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                BalanceHomeViewKt.OverdraftBalanceSubtitle(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                DisclosureViewKt.DisclosureMarkdownText(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FooterSection(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.InvestingDisclosures(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.DisclosureMarkdownText(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Toolbar(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Thumbnail(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                boolean shouldExecute = gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2);
                Applier applier = gapComposer5.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion), 1.0f);
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer5, 0);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ComposableLambdaImpl composableLambdaImpl = TapToPayKt.lambda$524232559;
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new TabToolbarsKt$$ExternalSyntheticLambda8(26, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer5, 54, 108);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal2)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal2)).getClass();
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer5, 0);
                    int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, m300paddingVpY3zN4$default);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    str.getClass();
                    String format2 = new MessageFormat(Room.stringResource(gapComposer5, R.string.tap_to_pay_payment_confirmation_description)).format(new Object[]{str});
                    format2.getClass();
                    Countries.PageHeader(format2, (Modifier) null, TapToPayKt.lambda$1043204854, (String) null, gapComposer5, MLKEMEngine.KyberPolyBytes, 10);
                    SpacerKt.Spacer(gapComposer5, new LayoutWeightElement(1.0f, true));
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal2)).getClass();
                    DimensionKt.ButtonCtaGroup(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, null, null, Expect_jvmKt.rememberComposableLambda(340031597, new WorkWebViewKt$$ExternalSyntheticLambda14(12, function1), gapComposer5), gapComposer5, 24576, 14);
                    gapComposer5.end(true);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AccountPickerScreenKt.DataAccessDisclaimerText(str, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolCreateViewKt$$ExternalSyntheticLambda6(String str, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = function1;
    }

    public /* synthetic */ PoolCreateViewKt$$ExternalSyntheticLambda6(Function1 function1, String str, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = str;
    }
}
