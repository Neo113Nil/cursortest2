package com.squareup.cash.prepurchasecashcard.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.g6$$ExternalSyntheticLambda11;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.ProfilePreviewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputChipKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import com.squareup.cash.benefits.views.BenefitsExplanationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda11;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt$$ExternalSyntheticLambda7;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda47;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.wallet.views.TagHeroBackgroundKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class LocaleToggleKt {

    /* renamed from: lambda$-645750843, reason: not valid java name */
    public static final ComposableLambdaImpl f578lambda$645750843 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(13), false, -645750843);

    /* renamed from: lambda$-1412688339, reason: not valid java name */
    public static final ComposableLambdaImpl f577lambda$1412688339 = new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda47(14), false, -1412688339);
    public static final ComposableLambdaImpl lambda$1998932607 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(6), false, 1998932607);

    public static final void FAQExpandableItem(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-284019379);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024) | (gapComposer2.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(fillMaxWidth, (MutableInteractionSourceImpl) rememberedValue, null, false, null, null, function0, 28);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m182clickableO2vRcR0$default);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4080, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(z ? Icons.CaretUp16 : Icons.CaretDown16, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getColors(gapComposer2).semantic.text.prominent, gapComposer2, 432, 0);
            gapComposer2.end(true);
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z, null, EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.expandVertically$default(AnimatableKt.tween$default(0, 0, null, 7), 12)), EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.shrinkVertically$default(AnimatableKt.tween$default(0, 0, null, 7), vertical, 12)), null, Expect_jvmKt.rememberComposableLambda(-461705317, new SheetKt$$ExternalSyntheticLambda8(str2, 20), gapComposer2), gapComposer2, 1572870 | ((i2 >> 3) & 112), 18);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15(str, str2, z, function0, modifier, i, 1);
        }
    }

    public static final void FAQSection(PrepurchaseCardFAQViewModel.FAQSectionData fAQSectionData, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1228670947);
        int i2 = (gapComposer.changedInstance(fAQSectionData) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SnapshotStateSet();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(947198766, new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier, fAQSectionData, (SnapshotStateSet) rememberedValue, function1, 18), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) fAQSectionData, function1, (Object) modifier, i, 11);
        }
    }

    public static final void LoadableButton(PrepurchaseCashCardPlanningViewModel.LoadableButton loadableButton, Function1 function1, ButtonProminence buttonProminence, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        loadableButton.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(220891251);
        int i2 = i | (gapComposer.changedInstance(loadableButton) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            CrossfadeKt.Crossfade(loadableButton, (Modifier) null, (FiniteAnimationSpec) null, "PrepurchaseCardLoadableButton", Expect_jvmKt.rememberComposableLambda(1734920050, new ProfileKt$$ExternalSyntheticLambda1(function1, buttonProminence), gapComposer), gapComposer, (i2 & 14) | 27648, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(loadableButton, function1, buttonProminence, modifier2, i, 20);
        }
    }

    public static final void LoadingTextShimmerBox(int i, Modifier modifier, TextStyle textStyle, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        TextStyle textStyle2;
        TextStyle textStyle3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-744576698);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i4 | 48 | (((i3 & 4) == 0 && gapComposer.changed(textStyle)) ? 256 : 128);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                int i6 = i3 & 4;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i6 != 0) {
                    textStyle3 = (TextStyle) gapComposer.consume(ArcadeThemeKt.LocalTextStyle);
                    if (textStyle3 == null) {
                        gapComposer.startReplaceGroup(-1100573765);
                        textStyle3 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    } else {
                        gapComposer.startReplaceGroup(-1100574912);
                    }
                    gapComposer.end(false);
                } else {
                    textStyle3 = textStyle;
                }
                modifier2 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
                textStyle3 = textStyle;
            }
            gapComposer.endDefaults();
            VisibleKt.ShimmerBox(modifier2, false, null, Expect_jvmKt.rememberComposableLambda(-1421555275, new BadgedAvatarKt$$ExternalSyntheticLambda4(i, textStyle3, 6), gapComposer), gapComposer, 3078, 6);
            textStyle2 = textStyle3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            textStyle2 = textStyle;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InputChipKt$$ExternalSyntheticLambda1(i, modifier2, textStyle2, i2, i3);
        }
    }

    public static final void LocaleToggle(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.LocaleToggle localeToggle, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        TextStyle textStyle;
        Modifier.Companion companion;
        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.LocaleToggle localeToggle2 = localeToggle;
        Function1 function12 = function1;
        ArrayList arrayList = localeToggle2.locales;
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(397558449);
        int i2 = 4;
        int i3 = 32;
        int i4 = i | (gapComposer.changedInstance(localeToggle2) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        boolean z = false;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier selectableGroup = SelectableKt.selectableGroup(SpacerKt.m300paddingVpY3zN4$default(companion2, 12.0f, RecyclerView.DECELERATION_RATE, 2));
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, selectableGroup);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1225219422);
            int i5 = 0;
            for (Object obj : arrayList) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                String str = (String) obj;
                boolean z2 = i5 == localeToggle2.selectedLocaleIndex ? true : z;
                if (z2) {
                    gapComposer.startReplaceGroup(-1283636543);
                    textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(-1283573055);
                    textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkSmall;
                    gapComposer.end(z);
                }
                Modifier clip = ClipKt.clip(companion2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
                Role role = new Role(i2);
                boolean changed = gapComposer.changed(z2) | ((i4 & 112) == i3 ? true : z) | gapComposer.changed(str);
                Object rememberedValue = gapComposer.rememberedValue();
                int i7 = i4;
                Object obj2 = Composer.Companion.Empty;
                if (changed || rememberedValue == obj2) {
                    rememberedValue = new g6$$ExternalSyntheticLambda11(str, function12, z2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                int i8 = i5;
                Modifier.Companion companion3 = companion2;
                boolean z3 = z;
                ArrayList arrayList2 = arrayList;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(SelectableKt.m335selectableoSLSa3U$default(clip, z2, false, role, (Function0) rememberedValue, 10), 4.0f, 8.0f), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                if (i8 != arrayList2.size() - 1) {
                    gapComposer.startReplaceGroup(-1283126376);
                    TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == obj2) {
                        rememberedValue2 = new PoolsListViewKt$$ExternalSyntheticLambda6(24);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    companion = companion3;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4088, 0L, (Composer) gapComposer, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue2), textStyle2, (TextLineBalancing) null, "|", (Map) null, (Function1) null, false);
                    gapComposer.end(z3);
                } else {
                    companion = companion3;
                    gapComposer.startReplaceGroup(-1282961797);
                    gapComposer.end(z3);
                }
                z = z3;
                companion2 = companion;
                i5 = i6;
                arrayList = arrayList2;
                i3 = 32;
                i4 = i7;
                i2 = 4;
                localeToggle2 = localeToggle;
                function12 = function1;
            }
            gapComposer.end(z);
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) localeToggle, function1, (Object) modifier2, i, 10);
        }
    }

    public static final void OverviewHeaderImage(Image image, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1958877192);
        int i2 = (gapComposer.changedInstance(image) ? 32 : 16) | i | MLKEMEngine.KyberPolyBytes;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (image == null) {
                gapComposer.startReplaceGroup(1189881770);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ProfilePreviewKt$$ExternalSyntheticLambda9(image, i, 3);
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(1189927898);
            gapComposer.end(false);
            String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, companion, null, ContentScale.Companion.Inside, null, gapComposer, 1573296, 1976);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            modifier = companion;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new TagHeroBackgroundKt$$ExternalSyntheticLambda1(i, 2, modifier, image);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    public static final void OverviewList(ArrayList arrayList, Composer composer, int i) {
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1095375968);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(arrayList) ? 32 : 16);
        ?? r7 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(28.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            float f = 1.0f;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Modifier modifier = null;
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-915917279);
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                PrepurchaseCardFAQViewModel.OverviewData.OverviewListItem overviewListItem = (PrepurchaseCardFAQViewModel.OverviewData.OverviewListItem) obj;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda6(25);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth2, r7, (Function1) rememberedValue);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, semantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode2);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Modifier.Companion companion2 = companion;
                BiasAlignment.Horizontal horizontal2 = horizontal;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, (int) r7)).concat("."), (Map) null, (Function1) null, false);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion2, 8.0f));
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal2, gapComposer, 0);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, overviewListItem.title, (Map) null, (Function1) null, false);
                String str = overviewListItem.subtitle;
                if (str == null) {
                    gapComposer.startReplaceGroup(-2121076286);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-2121076285);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                gapComposer.end(true);
                f = 1.0f;
                modifier = null;
                companion = companion2;
                r7 = 1;
                i3 = i4;
                horizontal = horizontal2;
            }
            boolean z = r7;
            gapComposer.end(false);
            gapComposer.end(z);
            DBUtil.SpacerBetweenSectionLarge(0, z ? 1 : 0, gapComposer, modifier);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsExplanationViewKt$$ExternalSyntheticLambda5(arrayList, i, 4);
        }
    }

    public static final void OverviewPrimaryButton(final BlockerAction blockerAction, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-766826703);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(blockerAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (blockerAction == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: com.squareup.cash.prepurchasecashcard.views.PrepurchaseCashCardFaqViewKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    LocaleToggleKt.OverviewPrimaryButton(blockerAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    LocaleToggleKt.OverviewPrimaryButton(blockerAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            int i4 = (gapComposer.changedInstance(blockerAction) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda11(function1, blockerAction, 11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(788308182, new ArcadeFormUpsellKt$$ExternalSyntheticLambda7(2, blockerAction), gapComposer), gapComposer, 1573296, 56);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2() { // from class: com.squareup.cash.prepurchasecashcard.views.PrepurchaseCashCardFaqViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i42) {
                        case 0:
                            LocaleToggleKt.OverviewPrimaryButton(blockerAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            LocaleToggleKt.OverviewPrimaryButton(blockerAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void OverviewSection(PrepurchaseCardFAQViewModel.OverviewData overviewData, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1849348408);
        int i2 = (gapComposer.changedInstance(overviewData) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 40.0f, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            OverviewHeaderImage(overviewData.headerImage, null, gapComposer, 6);
            OverviewTitle(overviewData.title, gapComposer, 6);
            OverviewList(overviewData.listItems, gapComposer, 6);
            OverviewPrimaryButton(overviewData.buttonBlockerAction, function1, gapComposer, i2 & 112);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1((Object) overviewData, function1, (Object) modifier2, i, 12);
        }
    }

    public static final void OverviewTitle(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-255359385);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 5, ((i2 >> 3) & 14) | 48, 0, 3824, colors.semantic.text.standard, (Composer) gapComposer, fillMaxWidth, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 40.0f));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i, 29);
        }
    }

    public static final void PrepurchaseCashCardFaqView(PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel, Function1 function1, Modifier modifier, RealImageLoader realImageLoader, ScrollState scrollState, Composer composer, int i) {
        prepurchaseCardFAQViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1519326275);
        int i2 = i | (gapComposer.changed(prepurchaseCardFAQViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | 9600;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
                scrollState = ImageKt.rememberScrollState(gapComposer);
                modifier = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1716410109, new PoolGoalMetKt$$ExternalSyntheticLambda0(function1, modifier, scrollState, prepurchaseCardFAQViewModel), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RealImageLoader realImageLoader2 = realImageLoader;
        ScrollState scrollState2 = scrollState;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(prepurchaseCardFAQViewModel, function1, modifier2, realImageLoader2, scrollState2, i);
        }
    }

    public static final void PrepurchaseCashCardPlanningSheetView(PrepurchaseCashCardPlanningViewModel prepurchaseCashCardPlanningViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        prepurchaseCashCardPlanningViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-468047681);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(prepurchaseCashCardPlanningViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-338559724, new PdfPreviewViewKt$$ExternalSyntheticLambda0(prepurchaseCashCardPlanningViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(prepurchaseCashCardPlanningViewModel, function1, modifier2, i, 6);
        }
    }

    public static final void PrepurchasePlanningSheetInfo(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet prepurchaseCardInfoSheet, Function1 function1, Composer composer, int i) {
        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet prepurchaseCardInfoSheet2;
        Function1 function12;
        GapComposer gapComposer;
        ScrollState scrollState;
        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlock textBlock;
        boolean z;
        Modifier.Companion companion;
        char c;
        float f;
        prepurchaseCardInfoSheet.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1860182462);
        Applier applier = gapComposer2.applier;
        int i2 = (i & 6) == 0 ? (gapComposer2.changedInstance(prepurchaseCardInfoSheet) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer2.changed(companion2) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion2, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            GapComposer gapComposer3 = gapComposer2;
            float f2 = 1.0f;
            Transformations.SheetHeader(prepurchaseCardInfoSheet.title, (Modifier) null, (Function2) null, (String) null, gapComposer3, 0, 14);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer3);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion2, 1.0f), false), rememberScrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            float f3 = 16.0f;
            SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion2, 16.0f));
            gapComposer3.startReplaceGroup(1497534307);
            for (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlock textBlock2 : prepurchaseCardInfoSheet.textBlocks) {
                String str = textBlock2.label;
                if (str == null) {
                    gapComposer3.startReplaceGroup(-317004455);
                    gapComposer3.end(false);
                    scrollState = rememberScrollState;
                    textBlock = textBlock2;
                    gapComposer = gapComposer3;
                    z = false;
                    companion = companion2;
                } else {
                    gapComposer3.startReplaceGroup(-317004454);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, f2);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    gapComposer = gapComposer3;
                    scrollState = rememberScrollState;
                    textBlock = textBlock2;
                    z = false;
                    companion = companion2;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, f3, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                String str2 = textBlock.body;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(-316727873);
                    gapComposer.end(z);
                    f = 16.0f;
                } else {
                    gapComposer.startReplaceGroup(-316727872);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                        c = 51733;
                    } else {
                        c = 51733;
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z);
                    }
                    f = 16.0f;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors2.semantic.text.subtle, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer.end(z);
                }
                if (textBlock.listItems.isEmpty()) {
                    gapComposer.startReplaceGroup(-315120491);
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(-316343844);
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    ListUnorderedKt.ListUnordered(SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth4, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1795747672, new PoolListSectionKt$$ExternalSyntheticLambda2(textBlock, 20), gapComposer), gapComposer, 196992, 26);
                    gapComposer.end(z);
                }
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 32.0f, gapComposer);
                companion2 = companion;
                gapComposer3 = gapComposer;
                rememberScrollState = scrollState;
                f3 = f;
                f2 = 1.0f;
            }
            ScrollState scrollState2 = rememberScrollState;
            gapComposer2 = gapComposer3;
            Modifier.Companion companion3 = companion2;
            gapComposer2.end(false);
            gapComposer2.end(true);
            prepurchaseCardInfoSheet2 = prepurchaseCardInfoSheet;
            String str3 = prepurchaseCardInfoSheet2.primaryButtonText;
            if (str3 == null) {
                gapComposer2.startReplaceGroup(-1752278148);
                gapComposer2.end(false);
                function12 = function1;
            } else {
                gapComposer2.startReplaceGroup(-1752278147);
                function12 = function1;
                DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion3, 1.0f), scrollState2.getCanScrollForward() || scrollState2.getCanScrollBackward(), null, null, Expect_jvmKt.rememberComposableLambda(-1785369780, new SheetKt$$ExternalSyntheticLambda5(2, function12, prepurchaseCardInfoSheet2, str3), gapComposer2), gapComposer2, 24582, 12);
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
        } else {
            prepurchaseCardInfoSheet2 = prepurchaseCardInfoSheet;
            function12 = function1;
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(prepurchaseCardInfoSheet2, function12, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static final void PrepurchasePlanningSheetSelectPayment(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet prepurchaseCardPaymentPlanOptionsSheet, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        ComposableLambdaImpl rememberComposableLambda;
        char c;
        prepurchaseCardPaymentPlanOptionsSheet.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-141352049);
        Applier applier = gapComposer2.applier;
        int i2 = (i & 6) == 0 ? (gapComposer2.changedInstance(prepurchaseCardPaymentPlanOptionsSheet) ? 4 : 2) | i : i;
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i & MLKEMEngine.KyberPolyBytes;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i4 == 0) {
            i2 |= gapComposer2.changed(companion) ? 256 : 128;
        }
        int i5 = i2;
        ?? r11 = 0;
        int i6 = 1;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            Modifier.Companion companion2 = companion;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2031215208, new PdfPreviewViewKt$$ExternalSyntheticLambda2(prepurchaseCardPaymentPlanOptionsSheet, i3), gapComposer2);
            String str = prepurchaseCardPaymentPlanOptionsSheet.subtitle;
            if (str == null) {
                gapComposer2.startReplaceGroup(18214132);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(18214133);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1719043504, new InfoSectionKt$$ExternalSyntheticLambda7(str, i6), gapComposer2);
                r11 = 0;
                gapComposer2.end(false);
            }
            Transformations.SheetHeader(rememberComposableLambda2, (Modifier) null, (Function2) null, rememberComposableLambda, gapComposer2, 6, 6);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.m302paddingqDBjuR0$default(new LayoutWeightElement(1.0f, r11), 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), rememberScrollState, r11, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, r11);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            final ?? r5 = 1;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            gapComposer2.startReplaceGroup(-224765200);
            GapComposer gapComposer3 = gapComposer2;
            for (final PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet.Option option : prepurchaseCardPaymentPlanOptionsSheet.options) {
                SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier.Companion companion3 = companion2;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                boolean z = option.selected;
                final int i7 = 0;
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-21036864, new Function2() { // from class: com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetSelectPaymentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = i7;
                        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet.Option option2 = option;
                        switch (i8) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, option2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str2 = option2.subtitle;
                                    if (str2 == null) {
                                        gapComposer5.startReplaceGroup(-231433134);
                                    } else {
                                        gapComposer5.startReplaceGroup(-231433133);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3);
                ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(1608928991, new Function2() { // from class: com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetSelectPaymentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = r5;
                        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet.Option option2 = option;
                        switch (i8) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, option2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer3;
                                if (gapComposer5.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str2 = option2.subtitle;
                                    if (str2 == null) {
                                        gapComposer5.startReplaceGroup(-231433134);
                                    } else {
                                        gapComposer5.startReplaceGroup(-231433133);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer3);
                boolean changedInstance = ((i5 & 112) == 32) | gapComposer3.changedInstance(option);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    c = 14;
                    rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda11(14, function1, option);
                    gapComposer3.updateRememberedValue(rememberedValue);
                } else {
                    c = 14;
                }
                Function1 function12 = (Function1) rememberedValue;
                GapComposer gapComposer4 = gapComposer3;
                InputChipKt.SelectionCard(rememberComposableLambda3, rememberComposableLambda4, z, m302paddingqDBjuR0$default, false, function12, gapComposer4, 3126, 32);
                gapComposer3 = gapComposer4;
                r5 = 1;
                i5 = i5;
                rememberScrollState = rememberScrollState;
                companion2 = companion3;
            }
            ScrollState scrollState = rememberScrollState;
            boolean z2 = r5;
            gapComposer3.end(false);
            gapComposer3.end(z2);
            GapComposer gapComposer5 = gapComposer3;
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion2, 1.0f), (scrollState.getCanScrollForward() || scrollState.getCanScrollBackward()) ? z2 ? 1 : 0 : false, null, null, Expect_jvmKt.rememberComposableLambda(-421458153, new ProfileKt$$ExternalSyntheticLambda1(25, (Object) prepurchaseCardPaymentPlanOptionsSheet, function1), gapComposer3), gapComposer5, 24582, 12);
            GapComposer gapComposer6 = gapComposer5;
            gapComposer6.end(z2);
            gapComposer = gapComposer6;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(prepurchaseCardPaymentPlanOptionsSheet, function1, i);
        }
    }
}
