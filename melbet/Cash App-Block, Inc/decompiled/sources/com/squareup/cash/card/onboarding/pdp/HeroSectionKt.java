package com.squareup.cash.card.onboarding.pdp;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
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
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.card.onboarding.CollapsibleDetailsSection;
import com.squareup.cash.card.onboarding.CtaAction;
import com.squareup.cash.card.onboarding.DisclosureSection;
import com.squareup.cash.card.onboarding.HeaderSection;
import com.squareup.cash.card.onboarding.HeroSection;
import com.squareup.cash.card.onboarding.IconGridSection;
import com.squareup.cash.card.onboarding.ImageCarouselSection;
import com.squareup.cash.card.onboarding.LabelsSection;
import com.squareup.cash.card.onboarding.MarkdownTextSection;
import com.squareup.cash.card.onboarding.ProductDetailsPageSection;
import com.squareup.cash.card.onboarding.ProductDetailsPageToastLabel;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.TileCarouselSection;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda6;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.booklet.CollapsibleDetailsSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class HeroSectionKt {

    /* renamed from: lambda$-437097102, reason: not valid java name */
    public static final ComposableLambdaImpl f345lambda$437097102 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(26), false, -437097102);

    static {
        new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda6(6), false, -469375622);
    }

    public static final void CollapsibleDetail(CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail, boolean z, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(302938806);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(collapsibleDetail) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, function0, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m183clickableoSLSa3U$default, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(m, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, collapsibleDetail.title, (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(Icons.SubtleExpand16, (String) null, ScaleKt.scale(companion, 1.0f, z ? -1.0f : 1.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 0);
            gapComposer.end(true);
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z, null, EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.expandVertically$default(null, 13)), EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.shrinkVertically$default(null, Alignment.Companion.Top, 13)), null, Expect_jvmKt.rememberComposableLambda(-1780601304, new CheckDepositAmountKt$$ExternalSyntheticLambda8(collapsibleDetail, 12), gapComposer), gapComposer, 1600518 | (i2 & 112), 18);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(collapsibleDetail, z, function0, i, 14);
        }
    }

    public static final void CollapsibleDetailsSection(CollapsibleDetailsSection collapsibleDetailsSection, Set set, Composer composer, int i) {
        Set set2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1615894500);
        int i2 = (gapComposer.changedInstance(collapsibleDetailsSection) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            set2 = EmptySet.INSTANCE;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                Integer[] numArr = (Integer[]) set2.toArray(new Integer[0]);
                Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
                SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
                snapshotStateSet.addAll(ArraysKt___ArraysKt.toSet(copyOf));
                gapComposer.updateRememberedValue(snapshotStateSet);
                rememberedValue = snapshotStateSet;
            }
            SnapshotStateSet snapshotStateSet2 = (SnapshotStateSet) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
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
            gapComposer.startReplaceGroup(19704044);
            int i3 = 0;
            for (Object obj : collapsibleDetailsSection.collapsibleDetails) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail = (CollapsibleDetailsSection.CollapsibleDetail) obj;
                boolean contains = snapshotStateSet2.contains(Integer.valueOf(i3));
                boolean changed = gapComposer.changed(contains) | gapComposer.changed(i3);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CollapsibleDetailsSectionKt$$ExternalSyntheticLambda0(contains, snapshotStateSet2, i3, 1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CollapsibleDetail(collapsibleDetail, contains, (Function0) rememberedValue2, gapComposer, 0);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            set2 = set;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(collapsibleDetailsSection, set2, i, 28);
        }
    }

    public static final void DisclosureSection(DisclosureSection disclosureSection, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-415368948);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(disclosureSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            int i3 = i2;
            String str = disclosureSection.text;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.subtle;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, null, null, null, 0, 0, 0, gapComposer, 0, 2016);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(disclosureSection, function1, i, 16);
        }
    }

    public static final void HeaderSection(HeaderSection headerSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-889804967);
        int i2 = (gapComposer.changedInstance(headerSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineSmall, (TextLineBalancing) null, headerSection.title, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(headerSection, i, 16);
        }
    }

    public static final void HeroSection(HeroSection heroSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1109031136);
        int i2 = (gapComposer.changedInstance(heroSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(heroSection.image, gapComposer), null, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 32.0f, RecyclerView.DECELERATION_RATE, 2), null, null, null, gapComposer, 48, 2040);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(heroSection, i, 17);
        }
    }

    public static final void IconCell(IconGridSection.IconCell iconCell, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1828623388);
        int i2 = (gapComposer.changedInstance(iconCell) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            zzd zzdVar = Icons.Companion;
            String str = iconCell.iconId;
            zzdVar.getClass();
            Icons icons = zzd.get(str);
            if (icons == null) {
                icons = Icons.Pending24;
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 48, 4);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, iconCell.title, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, Modifier.Companion.$$INSTANCE, 4.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, iconCell.description, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(iconCell, modifier, i, 29);
        }
    }

    public static final void IconGridSection(IconGridSection iconGridSection, Composer composer, int i) {
        IconGridSection iconGridSection2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        float f;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1312092879);
        int i2 = i | (gapComposer3.changedInstance(iconGridSection) ? 4 : 2);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
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
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = iconGridSection.title;
            if (str != null) {
                gapComposer3.startReplaceGroup(1006438421);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                gapComposer2 = gapComposer3;
                f = 32.0f;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).headlineSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                companion = companion2;
                SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 32.0f));
                gapComposer2.end(false);
            } else {
                companion = companion2;
                f = 32.0f;
                gapComposer2 = gapComposer3;
                gapComposer2.startReplaceGroup(1006703657);
                gapComposer2.end(false);
            }
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal2)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal2)).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal2)).getClass();
            iconGridSection2 = iconGridSection;
            GapComposer gapComposer4 = gapComposer2;
            OffsetKt.FlowRow(m300paddingVpY3zN4$default, arrangement$SpacedAligned, new Arrangement$SpacedAligned(f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 2, 0, Expect_jvmKt.rememberComposableLambda(-1502572204, new CheckDepositAmountKt$$ExternalSyntheticLambda8(iconGridSection2, 13), gapComposer2), gapComposer4, 1597440, 40);
            gapComposer = gapComposer4;
            gapComposer.end(true);
        } else {
            iconGridSection2 = iconGridSection;
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(iconGridSection2, i, 18);
        }
    }

    public static final void ImageCarouselSection(ImageCarouselSection imageCarouselSection, Composer composer, int i) {
        List list = imageCarouselSection.images;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1198167213);
        int i2 = (gapComposer.changedInstance(imageCarouselSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean changedInstance = gapComposer.changedInstance(imageCarouselSection);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda4(imageCarouselSection, 17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue, gapComposer, 0, 3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, SizeKt.fillMaxWidth(companion, 1.0f), null, null, 0, RecyclerView.DECELERATION_RATE, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(-1419694822, new ScoreUiFactory$$ExternalSyntheticLambda0(imageCarouselSection, 9), gapComposer), gapComposer, 48, 24576, 16380);
            gapComposer = gapComposer;
            if (list.size() > 1) {
                gapComposer.startReplaceGroup(1828732178);
                PagerDots(list.size(), ((ParcelableSnapshotMutableIntState) rememberPagerState.scrollPosition.elementTypes).getIntValue(), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1828815785);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(imageCarouselSection, i, 19);
        }
    }

    public static final void LabelsSection(LabelsSection labelsSection, Composer composer, int i) {
        Modifier modifier;
        Color m;
        long j;
        Color m2;
        Color m3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1453853777);
        int i2 = (gapComposer.changedInstance(labelsSection) ? 4 : 2) | i;
        boolean z = true;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            float f = 1.0f;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            float f2 = 8.0f;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1627421368);
            for (LabelsSection.Label label : labelsSection.labels) {
                LabelsSection.LabelTreatment labelTreatment = label.treatment;
                com.squareup.protos.cash.ui.Color color = labelTreatment != null ? labelTreatment.backgroundColor : null;
                com.squareup.protos.cash.ui.Color color2 = labelTreatment != null ? labelTreatment.borderColor : null;
                gapComposer.startReplaceGroup(-1627396856);
                gapComposer.startReplaceGroup(-1627407415);
                gapComposer.startReplaceGroup(-1627416489);
                if (color != null) {
                    if (color == null) {
                        gapComposer.startReplaceGroup(1535488033);
                        gapComposer.end(z2);
                        m3 = null;
                    } else {
                        m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 49531872, color, gapComposer, z2);
                    }
                    long j2 = m3 != null ? m3.value : Color.Transparent;
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj = DefaultSizes.border.entries;
                    modifier = ImageKt.m177backgroundbw27NRU(companion, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                } else {
                    modifier = companion;
                }
                gapComposer.end(z2);
                if (color2 != null) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                    Object obj2 = DefaultSizes.border.annotationsMap;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(883823060);
                        gapComposer.end(z2);
                        m2 = null;
                    } else {
                        m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -248584243, color2, gapComposer, z2);
                    }
                    long j3 = m2 != null ? m2.value : Color.Transparent;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                    modifier = modifier.then(ImageKt.m178borderxT4_qwU(companion, f, j3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)));
                }
                gapComposer.end(z2);
                if (color != null || color2 != null) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal3)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal3)).getClass();
                    modifier = modifier.then(SpacerKt.m299paddingVpY3zN4(companion, f2, 4.0f));
                }
                gapComposer.end(z2);
                String str = label.text;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
                LabelsSection.LabelTreatment labelTreatment2 = label.treatment;
                com.squareup.protos.cash.ui.Color color3 = labelTreatment2 != null ? labelTreatment2.textColor : null;
                if (color3 == null) {
                    gapComposer.startReplaceGroup(-468041015);
                    gapComposer.end(z2);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1370375224, color3, gapComposer, z2);
                }
                if (m == null) {
                    gapComposer.startReplaceGroup(1370376726);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z2);
                    }
                    j = colors.semantic.text.standard;
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(1370374401);
                    gapComposer.end(z2);
                    j = m.value;
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, modifier, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                z = true;
                z2 = z2;
                companion = companion;
                f2 = f2;
                f = f;
            }
            gapComposer.end(z2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(labelsSection, i, 20);
        }
    }

    public static final void MarkdownTextSection(MarkdownTextSection markdownTextSection, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1176096775);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(markdownTextSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            int i3 = i2;
            String str = markdownTextSection.text;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.subtle;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, null, null, null, 0, 0, 0, gapComposer, 0, 2016);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(markdownTextSection, function1, i, 17);
        }
    }

    public static final void OpaqueDisabledButtonCta(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        Modifier then;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(450589821);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                gapComposer.startReplaceGroup(1748757487);
                gapComposer.end(false);
                then = modifier;
            } else {
                gapComposer.startReplaceGroup(1748791184);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.background.f1047app;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                then = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)).then(modifier);
                gapComposer.end(false);
            }
            coil3.size.SizeKt.ButtonCta(function0, then, ButtonProminence.PROMINENT, false, z, null, composableLambdaImpl, gapComposer, ((i2 << 6) & 57344) | (i2 & 14) | MLKEMEngine.KyberPolyBytes | 1572864, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda1(function0, modifier, z, composableLambdaImpl, i, 2);
        }
    }

    public static final void PagerDots(int i, int i2, Composer composer, int i3) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1575836350);
        int i4 = (gapComposer.changed(i) ? 4 : 2) | i3 | (gapComposer.changed(i2) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-2126432691, new ImageCarouselSectionKt$$ExternalSyntheticLambda3(i, i2), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ImageCarouselSectionKt$$ExternalSyntheticLambda3(i, i2, i3);
        }
    }

    public static final void ProductDetailsPage(ProductDetailsPageViewModel productDetailsPageViewModel, Function1 function1, Composer composer, int i) {
        productDetailsPageViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1341424792);
        int i2 = (gapComposer.changedInstance(productDetailsPageViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-288797075, new CashCardKt$$ExternalSyntheticLambda1(14, productDetailsPageViewModel, function1, (MutableState) rememberedValue), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(productDetailsPageViewModel, function1, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* renamed from: ProductDetailsPageContent-jIwJxvA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3444ProductDetailsPageContentjIwJxvA(ProductDetailsPageViewModel productDetailsPageViewModel, Modifier modifier, boolean z, float f, Function1 function1, Function1 function12, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Function1 function13;
        int i5;
        RecomposeScopeImpl endRestartGroup;
        Iterator it;
        int i6;
        boolean z3;
        Modifier modifier3;
        Modifier modifier4;
        boolean z4;
        int i7;
        String str;
        float f2 = f;
        Function1 function14 = function1;
        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
        productDetailsPageViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(811529623);
        Applier applier = gapComposer.applier;
        int i8 = (gapComposer.changedInstance(productDetailsPageViewModel) ? 4 : 2) | i;
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 = i8 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i8 | (gapComposer.changed(modifier2) ? 32 : 16);
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 256 : 128;
            int i11 = i3 | (!gapComposer.changed(f2) ? 2048 : 1024) | (!gapComposer.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked);
            i4 = i2 & 32;
            if (i4 == 0) {
                i5 = i11 | 196608;
                function13 = function12;
            } else {
                function13 = function12;
                i5 = i11 | (gapComposer.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536);
            }
            if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) == 74898)) {
                gapComposer.skipToGroupEnd();
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i9 != 0) {
                    modifier2 = companion;
                }
                if (i10 != 0) {
                    z2 = false;
                }
                if (i4 != 0) {
                    function13 = null;
                }
                List list = productDetailsPageViewModel.sections;
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!(((ProductDetailsPageSection) obj) instanceof HeroSection)) {
                            arrayList.add(obj);
                        }
                    }
                    list = arrayList;
                }
                boolean changed = gapComposer.changed(productDetailsPageViewModel.paymentDeviceId);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new LinkedHashSet();
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Set set = (Set) rememberedValue;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                int i12 = i5;
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
                gapComposer.startReplaceGroup(-2005305287);
                Iterator it2 = list.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    ProductDetailsPageSection productDetailsPageSection = (ProductDetailsPageSection) next;
                    if (i13 > 0) {
                        gapComposer.startReplaceGroup(-215712645);
                        it = it2;
                        SpacerBetweenSections((ProductDetailsPageSection) list.get(i13 - 1), productDetailsPageSection, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        it = it2;
                        gapComposer.startReplaceGroup(-215629999);
                        gapComposer.end(false);
                    }
                    if (function13 != null) {
                        gapComposer.startReplaceGroup(-215546237);
                        if (productDetailsPageSection instanceof HeroSection) {
                            str = "HERO";
                        } else if (productDetailsPageSection instanceof ImageCarouselSection) {
                            str = "IMAGE_CAROUSEL";
                        } else if (productDetailsPageSection instanceof IconGridSection) {
                            str = "ICON_GRID";
                        } else if (productDetailsPageSection instanceof TileCarouselSection) {
                            str = "TILE_CAROUSEL";
                        } else if (productDetailsPageSection instanceof CollapsibleDetailsSection) {
                            str = "COLLAPSIBLE_DETAILS";
                        } else if (productDetailsPageSection instanceof MarkdownTextSection) {
                            str = "MARKDOWN_TEXT";
                        } else if (productDetailsPageSection instanceof DisclosureSection) {
                            str = "DISCLOSURE";
                        } else if (productDetailsPageSection instanceof HeaderSection) {
                            str = "HEADER";
                        } else {
                            if (!(productDetailsPageSection instanceof LabelsSection)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            str = "LABELS";
                        }
                        i6 = i14;
                        boolean changedInstance = gapComposer.changedInstance(set) | gapComposer.changed(str) | ((i12 & 458752) == 131072);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(13, set, str, function13);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        modifier3 = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue2);
                        z3 = false;
                        gapComposer.end(false);
                    } else {
                        i6 = i14;
                        z3 = false;
                        gapComposer.startReplaceGroup(-215003117);
                        gapComposer.end(false);
                        modifier3 = companion;
                    }
                    if (productDetailsPageSection instanceof CollapsibleDetailsSection) {
                        gapComposer.startReplaceGroup(-561121505);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                        modifier4 = modifier2;
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier3);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        z4 = false;
                        CollapsibleDetailsSection((CollapsibleDetailsSection) productDetailsPageSection, null, gapComposer, 0);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        modifier4 = modifier2;
                        if (productDetailsPageSection instanceof MarkdownTextSection) {
                            gapComposer.startReplaceGroup(-561117528);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, modifier3);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$13);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                            MarkdownTextSection((MarkdownTextSection) productDetailsPageSection, function14, gapComposer, (i12 >> 9) & 112);
                            gapComposer.end(true);
                            z4 = false;
                            gapComposer.end(false);
                        } else if (productDetailsPageSection instanceof DisclosureSection) {
                            gapComposer.startReplaceGroup(-561112346);
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, modifier3);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$14);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                            DisclosureSection((DisclosureSection) productDetailsPageSection, function14, gapComposer, (i12 >> 9) & 112);
                            gapComposer.end(true);
                            z4 = false;
                            gapComposer.end(false);
                        } else if (productDetailsPageSection instanceof HeaderSection) {
                            gapComposer.startReplaceGroup(-561107725);
                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, modifier3);
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
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                            z4 = false;
                            HeaderSection((HeaderSection) productDetailsPageSection, gapComposer, 0);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else if (productDetailsPageSection instanceof HeroSection) {
                            gapComposer.startReplaceGroup(-561104751);
                            MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode6 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer, modifier3);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$16);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                            z4 = false;
                            HeroSection((HeroSection) productDetailsPageSection, gapComposer, 0);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else if (productDetailsPageSection instanceof IconGridSection) {
                            gapComposer.startReplaceGroup(-561101707);
                            MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode7 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer, modifier3);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$17 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$17);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                            z4 = false;
                            IconGridSection((IconGridSection) productDetailsPageSection, gapComposer, 0);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else if (productDetailsPageSection instanceof ImageCarouselSection) {
                            gapComposer.startReplaceGroup(-561098054);
                            MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode8 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer, modifier3);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$18 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$18);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy7, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                            z4 = false;
                            ImageCarouselSection((ImageCarouselSection) productDetailsPageSection, gapComposer, 0);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else if (productDetailsPageSection instanceof LabelsSection) {
                            gapComposer.startReplaceGroup(-561094797);
                            MeasurePolicy maybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode9 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope9 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier9 = PlatformKt.materializeModifier(gapComposer, modifier3);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$19 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$19);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy8, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope9, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode9), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier9, ComposeUiNode.Companion.SetModifier);
                            z4 = false;
                            LabelsSection((LabelsSection) productDetailsPageSection, gapComposer, 0);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else {
                            if (!(productDetailsPageSection instanceof TileCarouselSection)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -561122634, z3);
                            }
                            gapComposer.startReplaceGroup(-561091239);
                            MeasurePolicy maybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                            int hashCode10 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope10 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier10 = PlatformKt.materializeModifier(gapComposer, modifier3);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$110 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$110);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy9, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope10, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode10), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier10, ComposeUiNode.Companion.SetModifier);
                            z4 = false;
                            TileCarouselSection((TileCarouselSection) productDetailsPageSection, gapComposer, 0);
                            i7 = 1;
                            gapComposer.end(true);
                            gapComposer.end(false);
                            if (i13 == list.size() - i7 && Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0) {
                                re$$ExternalSyntheticOutline0.m(gapComposer, -213811136, companion, f, gapComposer);
                                gapComposer.end(z4);
                                function14 = function1;
                                it2 = it;
                                modifier2 = modifier4;
                                i13 = i6;
                            }
                            gapComposer.startReplaceGroup(-213733295);
                            gapComposer.end(z4);
                            function14 = function1;
                            it2 = it;
                            modifier2 = modifier4;
                            i13 = i6;
                        }
                    }
                    i7 = 1;
                    if (i13 == list.size() - i7) {
                        re$$ExternalSyntheticOutline0.m(gapComposer, -213811136, companion, f, gapComposer);
                        gapComposer.end(z4);
                        function14 = function1;
                        it2 = it;
                        modifier2 = modifier4;
                        i13 = i6;
                    }
                    gapComposer.startReplaceGroup(-213733295);
                    gapComposer.end(z4);
                    function14 = function1;
                    it2 = it;
                    modifier2 = modifier4;
                    i13 = i6;
                }
                f2 = f;
                gapComposer.end(false);
                gapComposer.end(true);
            }
            boolean z5 = z2;
            Function1 function15 = function13;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ProductDetailsPageKt$$ExternalSyntheticLambda4(productDetailsPageViewModel, modifier2, z5, f2, function1, function15, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        int i112 = i3 | (!gapComposer.changed(f2) ? 2048 : 1024) | (!gapComposer.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked);
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) == 74898)) {
        }
        boolean z52 = z2;
        Function1 function152 = function13;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ProductDetailsPageOverlay(ProductDetailsPageViewModel productDetailsPageViewModel, Function1 function1, Modifier modifier, Function1 function12, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        int i3;
        String m;
        productDetailsPageViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(237258410);
        int i4 = (gapComposer.changedInstance(productDetailsPageViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            boolean changed = ((i4 & 7168) == 2048) | gapComposer.changed(density);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BorrowHomeKt$$ExternalSyntheticLambda1(27, (Object) density, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DimensionKt.ButtonCtaGroup(RulerKt.onSizeChanged(m177backgroundbw27NRU, (Function1) rememberedValue), false, null, null, Expect_jvmKt.rememberComposableLambda(-711972574, new CheckDepositAmountKt$$ExternalSyntheticLambda6(14, (Object) productDetailsPageViewModel, (Object) function1), gapComposer), gapComposer, 24576, 14);
            ProductDetailsPageToastLabel productDetailsPageToastLabel = productDetailsPageViewModel.toastLabel;
            if (Intrinsics.areEqual(productDetailsPageViewModel.ctaAction, CtaAction.Notify.INSTANCE) && productDetailsPageViewModel.notified && productDetailsPageToastLabel != null) {
                gapComposer.startReplaceGroup(-178368297);
                Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(companion);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(navigationBarsPadding, 16.0f);
                if (productDetailsPageToastLabel instanceof ProductDetailsPageToastLabel.Card) {
                    gapComposer.startReplaceGroup(186102096);
                    m = Room.stringResource(R.string.pdp_notify_toast_card, new Object[]{((ProductDetailsPageToastLabel.Card) productDetailsPageToastLabel).name}, gapComposer);
                    gapComposer.end(false);
                } else {
                    if (productDetailsPageToastLabel.equals(ProductDetailsPageToastLabel.Heart.INSTANCE)) {
                        i2 = 186105131;
                        i3 = R.string.pdp_notify_toast_heart;
                    } else if (productDetailsPageToastLabel.equals(ProductDetailsPageToastLabel.MiniCard.INSTANCE)) {
                        i2 = 186108111;
                        i3 = R.string.pdp_notify_toast_mini_card;
                    } else {
                        if (!productDetailsPageToastLabel.equals(ProductDetailsPageToastLabel.Wand.INSTANCE)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 186100577, false);
                        }
                        i2 = 186111082;
                        i3 = R.string.pdp_notify_toast_wand;
                    }
                    m = re$$ExternalSyntheticOutline0.m(gapComposer, i2, i3, gapComposer, false);
                }
                ModalKt.m3381ToastBAHpl2s(m298padding3ABfNKs, null, m, f345lambda$437097102, null, null, null, gapComposer, 3072, 498);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-178140354);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) productDetailsPageViewModel, function1, modifier2, (Object) function12, i, 23);
        }
    }

    public static final void SpacerBetweenSections(ProductDetailsPageSection productDetailsPageSection, ProductDetailsPageSection productDetailsPageSection2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(749379855);
        int i2 = (gapComposer.changedInstance(productDetailsPageSection) ? 4 : 2) | i | (gapComposer.changedInstance(productDetailsPageSection2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = productDetailsPageSection instanceof CollapsibleDetailsSection;
            if (z && (productDetailsPageSection2 instanceof DisclosureSection)) {
                gapComposer.startReplaceGroup(-1400458901);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (z && (productDetailsPageSection2 instanceof MarkdownTextSection)) {
                gapComposer.startReplaceGroup(-1400455381);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if ((productDetailsPageSection instanceof MarkdownTextSection) && (productDetailsPageSection2 instanceof DisclosureSection)) {
                gapComposer.startReplaceGroup(-1400452310);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (z && (productDetailsPageSection2 instanceof HeaderSection)) {
                gapComposer.startReplaceGroup(-1400449205);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                boolean z2 = productDetailsPageSection instanceof HeaderSection;
                if (z2 && (productDetailsPageSection2 instanceof CollapsibleDetailsSection)) {
                    gapComposer.startReplaceGroup(-464150651);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                    gapComposer.end(false);
                } else if (z2 && (productDetailsPageSection2 instanceof ImageCarouselSection)) {
                    gapComposer.startReplaceGroup(-1400438422);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else if (z2 && (productDetailsPageSection2 instanceof TileCarouselSection)) {
                    gapComposer.startReplaceGroup(-1400435510);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else if ((productDetailsPageSection instanceof HeroSection) && (productDetailsPageSection2 instanceof LabelsSection)) {
                    gapComposer.startReplaceGroup(-1400432877);
                    gapComposer.end(false);
                } else {
                    boolean z3 = productDetailsPageSection instanceof ImageCarouselSection;
                    if (z3 && (productDetailsPageSection2 instanceof CollapsibleDetailsSection)) {
                        gapComposer.startReplaceGroup(-1400430070);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else if (z3 && (productDetailsPageSection2 instanceof HeaderSection)) {
                        gapComposer.startReplaceGroup(-1400427125);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else if ((productDetailsPageSection instanceof LabelsSection) && (productDetailsPageSection2 instanceof HeaderSection)) {
                        gapComposer.startReplaceGroup(-1400424374);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else if ((productDetailsPageSection instanceof TileCarouselSection) && (productDetailsPageSection2 instanceof HeaderSection)) {
                        gapComposer.startReplaceGroup(-1400421461);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else if (productDetailsPageSection2 instanceof IconGridSection) {
                        gapComposer.startReplaceGroup(-1400419477);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else if (productDetailsPageSection instanceof IconGridSection) {
                        gapComposer.startReplaceGroup(-463268825);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1400414678);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(productDetailsPageSection, productDetailsPageSection2, i, 2);
        }
    }

    public static final void Tile(TileCarouselSection.Tile tile, Composer composer, int i) {
        TileCarouselSection.Tile tile2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-698611046);
        int i2 = i | (gapComposer.changedInstance(tile) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            float mo233toDpu2uoSUM = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM((int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() >> 32));
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(companion, (mo233toDpu2uoSUM - 32.0f) * 0.9f), 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(fillMaxHeight, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape);
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
            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(tile.image, gapComposer), null, OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), false), null, ContentScale.Companion.Crop, null, gapComposer, 1573296, 1976);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            String str = tile.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
            Strings.getSizes(gapComposer).getClass();
            tile2 = tile;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, tile2.description, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 24.0f));
            gapComposer.end(true);
        } else {
            tile2 = tile;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(tile2, i, 22);
        }
    }

    public static final void TileCarouselSection(TileCarouselSection tileCarouselSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1341977220);
        int i2 = (gapComposer.changedInstance(tileCarouselSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            IntrinsicSize intrinsicSize = IntrinsicSize.Max;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier scroll$default = ImageKt.scroll$default(OffsetKt.height(companion, intrinsicSize), ImageKt.rememberScrollState(gapComposer), true, false);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, scroll$default);
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
            gapComposer.startReplaceGroup(-2051830578);
            int i3 = 0;
            for (Object obj : tileCarouselSection.tiles) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                TileCarouselSection.Tile tile = (TileCarouselSection.Tile) obj;
                if (i3 == 0) {
                    gapComposer.startReplaceGroup(1995499134);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1995580819);
                    gapComposer.end(false);
                }
                Tile(tile, gapComposer, 0);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 16.0f, gapComposer);
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(tileCarouselSection, i, 21);
        }
    }
}
