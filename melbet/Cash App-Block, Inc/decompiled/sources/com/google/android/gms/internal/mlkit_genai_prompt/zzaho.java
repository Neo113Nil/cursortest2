package com.google.android.gms.internal.mlkit_genai_prompt;

import android.graphics.Typeface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.cart.CreateCartErrorBannerKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewModel$Bar$BarImage$Avatar;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.common.composeui.EmojiIconsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.backend.api.BackgroundMetadata;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.protos.cash.ui.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzaho {
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void BarChart(StackedBarChartViewModel stackedBarChartViewModel, Function1 function1, Composer composer, int i) {
        stackedBarChartViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1902412263);
        int i2 = (i & 48) == 0 ? (gapComposer.changedInstance(stackedBarChartViewModel) ? 32 : 16) | i : i;
        int i3 = 256;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        final boolean z = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            for (final StackedBarChartViewModel.Bar bar : stackedBarChartViewModel.bars) {
                boolean changedInstance = gapComposer.changedInstance(bar);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                Object obj = rememberedValue;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    CaptureCheckFaceKt$$ExternalSyntheticLambda12 captureCheckFaceKt$$ExternalSyntheticLambda12 = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(bar, 12);
                    gapComposer.updateRememberedValue(captureCheckFaceKt$$ExternalSyntheticLambda12);
                    obj = captureCheckFaceKt$$ExternalSyntheticLambda12;
                }
                Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, z, (Function1) obj);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1245353007, new Function2() { // from class: com.squareup.cash.card.spendinginsights.views.SpendingInsightDetailViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i5 = z;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        StackedBarChartViewModel.Bar bar2 = bar;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    StackedBarChartViewModel$Bar$BarImage$Avatar stackedBarChartViewModel$Bar$BarImage$Avatar = bar2.image;
                                    gapComposer2.startReplaceGroup(384007896);
                                    TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(stackedBarChartViewModel$Bar$BarImage$Avatar.avatar.avatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(27), gapComposer2, 8, 1), null, false, gapComposer2, 6, 28);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer3.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer3.startReusableNode();
                                    if (gapComposer3.inserting) {
                                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer3.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                    if (rememberedValue2 == neverEqualPolicy2) {
                                        rememberedValue2 = new CardStudioQueries$$ExternalSyntheticLambda3(14);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue2), true), (TextStyle) null, (TextLineBalancing) null, bar2.label, (Map) null, (Function1) null, false);
                                    Object rememberedValue3 = gapComposer3.rememberedValue();
                                    if (rememberedValue3 == neverEqualPolicy2) {
                                        rememberedValue3 = new CardStudioQueries$$ExternalSyntheticLambda3(15);
                                        gapComposer3.updateRememberedValue(rememberedValue3);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue3), (TextStyle) null, (TextLineBalancing) null, bar2.valueText, (Map) null, (Function1) null, false);
                                    gapComposer3.end(true);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f));
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j = colors.semantic.background.standard;
                                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer4.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer4.startReusableNode();
                                    if (gapComposer4.inserting) {
                                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer4.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    Modifier clip2 = ClipKt.clip(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 2), bar2.value), 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f));
                                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip2, colors2.semantic.icon.prominent, rectangleShapeKt$RectangleShape$1), gapComposer4, 0);
                                    gapComposer4.end(true);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(357315470, new Function2() { // from class: com.squareup.cash.card.spendinginsights.views.SpendingInsightDetailViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i5 = i4;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        StackedBarChartViewModel.Bar bar2 = bar;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    StackedBarChartViewModel$Bar$BarImage$Avatar stackedBarChartViewModel$Bar$BarImage$Avatar = bar2.image;
                                    gapComposer2.startReplaceGroup(384007896);
                                    TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(stackedBarChartViewModel$Bar$BarImage$Avatar.avatar.avatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(27), gapComposer2, 8, 1), null, false, gapComposer2, 6, 28);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer3.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer3.startReusableNode();
                                    if (gapComposer3.inserting) {
                                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer3.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                    if (rememberedValue2 == neverEqualPolicy2) {
                                        rememberedValue2 = new CardStudioQueries$$ExternalSyntheticLambda3(14);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue2), true), (TextStyle) null, (TextLineBalancing) null, bar2.label, (Map) null, (Function1) null, false);
                                    Object rememberedValue3 = gapComposer3.rememberedValue();
                                    if (rememberedValue3 == neverEqualPolicy2) {
                                        rememberedValue3 = new CardStudioQueries$$ExternalSyntheticLambda3(15);
                                        gapComposer3.updateRememberedValue(rememberedValue3);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue3), (TextStyle) null, (TextLineBalancing) null, bar2.valueText, (Map) null, (Function1) null, false);
                                    gapComposer3.end(true);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f));
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j = colors.semantic.background.standard;
                                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer4.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer4.startReusableNode();
                                    if (gapComposer4.inserting) {
                                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer4.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    Modifier clip2 = ClipKt.clip(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 2), bar2.value), 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f));
                                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip2, colors2.semantic.icon.prominent, rectangleShapeKt$RectangleShape$1), gapComposer4, 0);
                                    gapComposer4.end(true);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer);
                int i5 = (gapComposer.changedInstance(bar) ? 1 : 0) | ((i2 & 896) == i3 ? i4 : z);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (i5 != 0 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(21, (Object) bar, (Object) function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                final int i6 = 2;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, semantics, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(-675942456, new Function2() { // from class: com.squareup.cash.card.spendinginsights.views.SpendingInsightDetailViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i52 = i6;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        StackedBarChartViewModel.Bar bar2 = bar;
                        switch (i52) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    StackedBarChartViewModel$Bar$BarImage$Avatar stackedBarChartViewModel$Bar$BarImage$Avatar = bar2.image;
                                    gapComposer2.startReplaceGroup(384007896);
                                    TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(stackedBarChartViewModel$Bar$BarImage$Avatar.avatar.avatar, null, new CardStudioViewV2Kt$$ExternalSyntheticLambda47(27), gapComposer2, 8, 1), null, false, gapComposer2, 6, 28);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer3.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer3.startReusableNode();
                                    if (gapComposer3.inserting) {
                                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer3.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    Object rememberedValue22 = gapComposer3.rememberedValue();
                                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                    if (rememberedValue22 == neverEqualPolicy2) {
                                        rememberedValue22 = new CardStudioQueries$$ExternalSyntheticLambda3(14);
                                        gapComposer3.updateRememberedValue(rememberedValue22);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue22), true), (TextStyle) null, (TextLineBalancing) null, bar2.label, (Map) null, (Function1) null, false);
                                    Object rememberedValue3 = gapComposer3.rememberedValue();
                                    if (rememberedValue3 == neverEqualPolicy2) {
                                        rememberedValue3 = new CardStudioQueries$$ExternalSyntheticLambda3(15);
                                        gapComposer3.updateRememberedValue(rememberedValue3);
                                    }
                                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue3), (TextStyle) null, (TextLineBalancing) null, bar2.valueText, (Map) null, (Function1) null, false);
                                    gapComposer3.end(true);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f));
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                    Colors colors = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j = colors.semantic.background.standard;
                                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer4.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer4.startReusableNode();
                                    if (gapComposer4.inserting) {
                                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        gapComposer4.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                    Modifier clip2 = ClipKt.clip(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 2), bar2.value), 1.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f));
                                    Colors colors2 = (Colors) gapComposer4.consume(staticProvidableCompositionLocal);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip2, colors2.semantic.icon.prominent, rectangleShapeKt$RectangleShape$1), gapComposer4, 0);
                                    gapComposer4.end(true);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer), null, null, 0L, gapComposer, 12582966, 3952);
                z = z;
                i2 = i2;
                i3 = i3;
                i4 = i4;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(stackedBarChartViewModel, function1, i, 18);
        }
    }

    public static final void SpendingAnalysis(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i2;
        boolean z;
        Modifier modifier2 = modifier;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(565242639);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier2) ? 256 : 128;
        }
        Function1 function12 = function1;
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
        }
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1169) != 1168)) {
            gapComposer.startReplaceGroup(2032302961);
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (hasNext) {
                    SpendingInsightDetailViewModel.Content.SpendingAnalysis spendingAnalysis = (SpendingInsightDetailViewModel.Content.SpendingAnalysis) it.next();
                    if (spendingAnalysis instanceof SpendingInsightDetailViewModel.Content.SpendingAnalysis.Card) {
                        gapComposer.startReplaceGroup(203412879);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(z2);
                        }
                        Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(modifier2, 1.0f, colors.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z2);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
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
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 16.0f);
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        m2020SpendingAnalysisContent942rkJo(spendingAnalysis, m298padding3ABfNKs, 8.0f, function12, gapComposer, i2 & 7168, 0);
                        gapComposer.end(true);
                        z = false;
                        gapComposer.end(false);
                    } else {
                        if (!(spendingAnalysis instanceof SpendingInsightDetailViewModel.Content.SpendingAnalysis.Inline)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 203411634, false);
                        }
                        gapComposer.startReplaceGroup(203428492);
                        m2020SpendingAnalysisContent942rkJo(spendingAnalysis, modifier2, RecyclerView.DECELERATION_RATE, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 7168), 4);
                        z = false;
                        gapComposer.end(false);
                    }
                    modifier2 = modifier;
                    function12 = function1;
                    z2 = z;
                } else {
                    gapComposer.end(z2);
                    if (list.size() == 1 && (CollectionsKt.first(list) instanceof SpendingInsightDetailViewModel.Content.SpendingAnalysis.Card)) {
                        gapComposer.startReplaceGroup(-1422447892);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1422348909);
                        gapComposer.end(false);
                    }
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(list, modifier, function1, i, 3);
        }
    }

    /* renamed from: SpendingAnalysisContent-942rkJo, reason: not valid java name */
    public static final void m2020SpendingAnalysisContent942rkJo(SpendingInsightDetailViewModel.Content.SpendingAnalysis spendingAnalysis, Modifier modifier, float f, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        float f2;
        float f3;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer;
        int i4;
        float f4;
        char c;
        int i5;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-959387016);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(spendingAnalysis) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                f2 = f;
                if (gapComposer2.changed(f2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                i3 &= -897;
                f2 = 16.0f;
            }
            float f5 = f2;
            int i6 = i3;
            f3 = f5;
            gapComposer2.endDefaults();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SpendingInsightDetailViewModel.Content.SpendingAnalysis.Inline inline = spendingAnalysis instanceof SpendingInsightDetailViewModel.Content.SpendingAnalysis.Inline ? (SpendingInsightDetailViewModel.Content.SpendingAnalysis.Inline) spendingAnalysis : null;
            Image image = inline != null ? inline.icon : null;
            if (image == null) {
                gapComposer2.startReplaceGroup(1111997563);
                gapComposer2.end(false);
                z = false;
                companion = companion2;
                gapComposer = gapComposer2;
                i4 = i6;
                f4 = 1.0f;
                c = 2048;
            } else {
                gapComposer2.startReplaceGroup(1111997564);
                companion = companion2;
                z = false;
                gapComposer = gapComposer2;
                i4 = i6;
                f4 = 1.0f;
                c = 2048;
                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(image, gapComposer2), null, SpacerKt.m302paddingqDBjuR0$default(SizeKt.m285size3ABfNKs(companion2, 24.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), null, null, null, gapComposer, 432, 2040);
                gapComposer.end(false);
            }
            String title = spendingAnalysis.getTitle();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            gapComposer2 = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion, f4), ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
            gapComposer2.end(true);
            String text = spendingAnalysis.getText();
            if (text == null) {
                gapComposer2.startReplaceGroup(-1440660873);
                gapComposer2.end(z);
            } else {
                gapComposer2.startReplaceGroup(-1440660872);
                SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(companion, f3));
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, text, (Map) null, (Function1) null, false);
                gapComposer2.end(z);
            }
            SpendingInsightDetailViewModel.Content.Button button = spendingAnalysis.getButton();
            if (button == null) {
                gapComposer2.startReplaceGroup(-1440516847);
                gapComposer2.end(z);
            } else {
                gapComposer2.startReplaceGroup(-1440516846);
                SpacerKt.Spacer(gapComposer2, SizeKt.m285size3ABfNKs(companion, f3));
                boolean changedInstance = gapComposer2.changedInstance(button) | ((i4 & 7168) == 2048 ? true : z);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(20, (Object) button, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1273733136, new CheckDepositAmountKt$$ExternalSyntheticLambda8(button, 15), gapComposer2), gapComposer2, 1572864, 62);
                gapComposer2 = gapComposer2;
                gapComposer2.end(z);
            }
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
            f3 = f2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EmojiIconsKt$$ExternalSyntheticLambda0(spendingAnalysis, modifier, f3, function1, i, i2);
        }
    }

    public static final void SpendingInsightDetail(SpendingInsightDetailViewModel spendingInsightDetailViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        spendingInsightDetailViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1664562129);
        int i2 = i | (gapComposer.changedInstance(spendingInsightDetailViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(companion);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            NavigationType navigationType = NavigationType.BACK;
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            TransactorKt.LoadableContent(spendingInsightDetailViewModel, spendingInsightDetailViewModel instanceof SpendingInsightDetailViewModel.Loading, SizeKt.fillMaxSize(companion, 1.0f), LoadingIndicatorPosition.CENTER, new OffersHomeQueries$$ExternalSyntheticLambda1(z, 5), null, Expect_jvmKt.rememberComposableLambda(-2017233595, new SetPinViewKt$$ExternalSyntheticLambda4(26, function1), gapComposer), gapComposer, (i2 & 14) | 1576320, 32);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(i, 16, modifier2, spendingInsightDetailViewModel, function1);
        }
    }

    public static final void SpendingInsightDetailContent(SpendingInsightDetailViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Function1 function12;
        Modifier modifier2;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1416391884);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion3);
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
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ArrayList arrayList = content.title;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            String joinToString$default = CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, (Function1) rememberedValue, 30);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default, ((Typography) gapComposer.consume(staticProvidableCompositionLocal3)).header, (TextLineBalancing) null, joinToString$default, (Map) null, (Function1) null, false);
            String str = content.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(1741951773);
                gapComposer.end(false);
                staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                companion = companion3;
            } else {
                gapComposer.startReplaceGroup(1741951774);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                companion = companion3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer.consume(staticProvidableCompositionLocal3)).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            List list = content.spendingAnalyses;
            if (list == null) {
                gapComposer.startReplaceGroup(1742230804);
                gapComposer.end(false);
                function12 = function1;
                companion2 = companion;
            } else {
                gapComposer.startReplaceGroup(1742230805);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                companion2 = companion;
                function12 = function1;
                SpendingAnalysis(((i3 << 6) & 7168) | 6, gapComposer, SpacerKt.m298padding3ABfNKs(companion2, 16.0f), list, function12);
                gapComposer.end(false);
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            StackedBarChartViewModel stackedBarChartViewModel = content.chart;
            if (stackedBarChartViewModel == null) {
                gapComposer.startReplaceGroup(1742445820);
            } else {
                gapComposer.startReplaceGroup(1742445821);
                BarChart(stackedBarChartViewModel, function12, gapComposer, ((i3 << 3) & 896) | 6);
            }
            gapComposer.end(false);
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(content, function12, modifier2, i, 16);
        }
    }

    public static final Background access$toBackground(BackgroundMetadata backgroundMetadata) {
        String str = backgroundMetadata.id;
        String str2 = backgroundMetadata.backgroundUrl;
        Image image = new Image(str2, str2, 4);
        String str3 = backgroundMetadata.carouselUrl;
        return new Background(str, image, new Image(str3, str3, 4), backgroundMetadata.backgroundColor, backgroundMetadata.isDefault, backgroundMetadata.textFormat, backgroundMetadata.effects, backgroundMetadata.accessibilityDescription);
    }

    public static Typeface create(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }
}
