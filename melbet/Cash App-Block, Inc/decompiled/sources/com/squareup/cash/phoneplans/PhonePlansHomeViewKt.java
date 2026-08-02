package com.squareup.cash.phoneplans;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda0;
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
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome$InfoCard$Detail$Caption;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome$InfoCard$Detail$Progress;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.pdf.view.ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModel;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public abstract class PhonePlansHomeViewKt {
    public static final ComposableLambdaImpl lambda$1784831217 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(18), false, 1784831217);
    public static final ComposableLambdaImpl lambda$936120873 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(26), false, 936120873);

    /* renamed from: lambda$-893743236, reason: not valid java name */
    public static final ComposableLambdaImpl f566lambda$893743236 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(19), false, -893743236);

    /* renamed from: lambda$-1588923860, reason: not valid java name */
    public static final ComposableLambdaImpl f565lambda$1588923860 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(3), false, -1588923860);
    public static final ComposableLambdaImpl lambda$1923245547 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(4), false, 1923245547);
    public static final WorkLauncherImpl MobilePlanHomeSaver = new WorkLauncherImpl(8, new PaycheckCircles$$ExternalSyntheticLambda4(27), new PoolDetailsViewKt$$ExternalSyntheticLambda3(18));

    public static final void ActiveHeader(PhonePlansHomeViewModel.Content.Header.Active active, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1708034966);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(active) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1519442241, new PdfPreviewViewKt$$ExternalSyntheticLambda2(active, 11), gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1127006114, new PdfPreviewViewKt$$ExternalSyntheticLambda0(17, active, function1), gapComposer), gapComposer, 3078, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(active, function1, i, 8);
        }
    }

    public static final void Header(PhonePlansHomeViewModel.Content.Header header, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(364353501);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(header) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (header instanceof PhonePlansHomeViewModel.Content.Header.Active) {
            gapComposer.startReplaceGroup(-2043600373);
            ActiveHeader((PhonePlansHomeViewModel.Content.Header.Active) header, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            if (!(header instanceof PhonePlansHomeViewModel.Content.Header.Inactive)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2043601293, false);
            }
            gapComposer.startReplaceGroup(-2043598259);
            InactiveHeader((PhonePlansHomeViewModel.Content.Header.Inactive) header, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(header, function1, i, 6);
        }
    }

    public static final void InactiveHeader(PhonePlansHomeViewModel.Content.Header.Inactive inactive, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-680916662);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(inactive) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-582145375, new PdfPreviewViewKt$$ExternalSyntheticLambda2(inactive, 10), gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-73614530, new PdfPreviewViewKt$$ExternalSyntheticLambda0(i3, inactive, function1), gapComposer), gapComposer, 3078, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(inactive, function1, i, 7);
        }
    }

    public static final void InfoCard(PhonePlansHomeViewModel.Content.InfoCard infoCard, Function0 function0, Modifier modifier, Composer composer, int i) {
        boolean z;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-200088665);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(infoCard) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            long j2 = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(modifier, 1.0f, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Strings.getSizes(gapComposer).getClass();
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), false, null, null, function0, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m183clickableoSLSa3U$default, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, infoCard.label, (Map) null, (Function1) null, false);
            DefaultSizes sizes = Strings.getSizes(gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Request$Priority$EnumUnboxingLocalUtility.m(sizes, companion, 64.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, infoCard.content, (Map) null, (Function1) null, false);
            String str = infoCard.caption;
            if (str == null) {
                gapComposer.startReplaceGroup(-227364909);
            } else {
                gapComposer.startReplaceGroup(-227364908);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            }
            gapComposer.end(false);
            PhonePlansHomeViewModel.Content.InfoCard.Progress progress = infoCard.progress;
            if (progress == null) {
                gapComposer.startReplaceGroup(-227225595);
                gapComposer.end(false);
                z = true;
            } else {
                gapComposer.startReplaceGroup(-227225594);
                float coerceIn = RangesKt___RangesKt.coerceIn(progress.percentage, RecyclerView.DECELERATION_RATE, 1.0f);
                String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.phone_plans_home_usage_progress_accessibility_label)).format(new Object[]{infoCard.label});
                format2.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f);
                boolean changed = gapComposer.changed(format2) | gapComposer.changed(coerceIn);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TextFieldKt$$ExternalSyntheticLambda0(format2, coerceIn, 4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier clip = ClipKt.clip(SemanticsModifierKt.semantics(m277height3ABfNKs, false, (Function1) rememberedValue), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
                long j3 = Strings.getColors(gapComposer).semantic.background.standard;
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j3, rectangleShapeKt$RectangleShape$1);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Modifier clip2 = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, coerceIn), 8.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
                int ordinal = progress.color.ordinal();
                if (ordinal != 0) {
                    z = true;
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -863114836, false);
                    }
                    gapComposer.startReplaceGroup(-863108749);
                    j = Strings.getColors(gapComposer).semantic.background.warning;
                    gapComposer.end(false);
                } else {
                    z = true;
                    gapComposer.startReplaceGroup(-863111631);
                    j = Strings.getColors(gapComposer).semantic.background.brand;
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip2, j, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
                gapComposer.end(z);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(infoCard, function0, modifier, i, 24);
        }
    }

    public static final void InfoCards(Pair pair, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1806013404);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(pair) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier height = OffsetKt.height(SizeKt.fillMaxWidth(companion, 1.0f), IntrinsicSize.Max);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(height, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(rowScopeInstance.weight(1.0f, companion, true), 1.0f);
            PhonePlansHomeViewModel.Content.InfoCard infoCard = (PhonePlansHomeViewModel.Content.InfoCard) pair.first;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            InfoCard(infoCard, (Function0) rememberedValue, fillMaxHeight, gapComposer, 0);
            Modifier fillMaxHeight2 = SizeKt.fillMaxHeight(rowScopeInstance.weight(1.0f, companion, true), 1.0f);
            PhonePlansHomeViewModel.Content.InfoCard infoCard2 = (PhonePlansHomeViewModel.Content.InfoCard) pair.second;
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(14, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            InfoCard(infoCard2, (Function0) rememberedValue2, fillMaxHeight2, gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(pair, function1, i, 5);
        }
    }

    public static final void Links(ArrayList arrayList, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2147363588);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(arrayList) ? 4 : 2) | i : i;
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        boolean z = false;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.phone_plans_home_links_section_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            int i5 = 0;
            for (Object obj : arrayList) {
                int i6 = i5 + 1;
                ComposableLambdaImpl composableLambdaImpl = null;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                PhonePlansHomeViewModel.Content.Link link = (PhonePlansHomeViewModel.Content.Link) obj;
                zzd zzdVar = Icons.Companion;
                String str = link.iconId;
                zzdVar.getClass();
                Icons icons = zzd.get(str);
                if (icons == null) {
                    gapComposer.startReplaceGroup(33347336);
                } else {
                    gapComposer.startReplaceGroup(33347337);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1972075387, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 20), gapComposer);
                }
                gapComposer.end(z);
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(549109640, new PdfPreviewViewKt$$ExternalSyntheticLambda2(link, 9), gapComposer);
                boolean changed = ((i4 & 112) == i3 ? true : z) | gapComposer.changed(i5);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i5, 11, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(composableLambdaImpl, rememberComposableLambda, null, (Function0) rememberedValue, false, false, null, null, push, 0L, gapComposer, 805306416, 3572);
                i5 = i6;
                i3 = i3;
                z = false;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhonePlansHomeViewKt$$ExternalSyntheticLambda14(arrayList, function1, i, 0);
        }
    }

    public static final void PhonePlansEsimCheckView(PhonePlansEsimCheckViewModel phonePlansEsimCheckViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        phonePlansEsimCheckViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-749780807);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(phonePlansEsimCheckViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(270068046, new PdfPreviewViewKt$$ExternalSyntheticLambda0(15, phonePlansEsimCheckViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(phonePlansEsimCheckViewModel, function1, i, i3);
        }
    }

    public static final void PhonePlansHomeContent(PhonePlansHomeViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1279826282);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            PhonePlansHomeViewModel.Content.Header header = content.header;
            ArrayList arrayList = content.links;
            int i3 = i2 & 112;
            Header(header, function1, gapComposer, i3);
            Pair pair = content.infoCards;
            if (pair == null) {
                gapComposer.startReplaceGroup(815408445);
            } else {
                gapComposer.startReplaceGroup(815408446);
                InfoCards(pair, function1, gapComposer, i3);
            }
            gapComposer.end(false);
            if (arrayList.isEmpty()) {
                gapComposer.startReplaceGroup(815602754);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(815512420);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                Links(arrayList, function1, gapComposer, i3);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(content, function1, i, 9);
        }
    }

    public static final void PhonePlansHomeError(Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(461438132);
        int i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion, 1.0f), ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.phone_plans_home_error_message), (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                function12 = function1;
                rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(12, function12);
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, null, buttonProminence, false, false, null, lambda$1784831217, gapComposer2, 1573248, 58);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda8(i, 9, function12);
        }
    }

    public static final void PhonePlansHomeView(PhonePlansHomeViewModel phonePlansHomeViewModel, Function1 function1, Composer composer, int i) {
        phonePlansHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-866846840);
        int i2 = (gapComposer.changedInstance(phonePlansHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1959536749, new PhonePlansUiFactory$$ExternalSyntheticLambda3(function1, phonePlansHomeViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhonePlansUiFactory$$ExternalSyntheticLambda3(phonePlansHomeViewModel, function1, i);
        }
    }

    public static final void PhonePlansNewLineLoadingView(PhonePlansNewLineLoadingViewModel phonePlansNewLineLoadingViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        phonePlansNewLineLoadingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1920093505);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(phonePlansNewLineLoadingViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(153431434, new PdfPreviewViewKt$$ExternalSyntheticLambda0(i3, phonePlansNewLineLoadingViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(phonePlansNewLineLoadingViewModel, function1, i, 10);
        }
    }

    public static final void WirelessProviderListContent(WirelessProviderListViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        NavigationType navigationType;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1662480234);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(content) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            int ordinal = content.toolbarButton.ordinal();
            if (ordinal == 0) {
                navigationType = NavigationType.BACK;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                navigationType = NavigationType.CLOSE;
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            if (content.hasHelpButton) {
                gapComposer.startReplaceGroup(1309336651);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1247316508, new PdfPreviewViewKt$$ExternalSyntheticLambda4(9, function1), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1309611528);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            Continuation continuation = null;
            int i4 = 1;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, composableLambdaImpl, gapComposer, 6, 44);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Countries.PageHeader(content.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(content.searchText, 0L, gapComposer, 0, 2);
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer);
            boolean changed = gapComposer.changed(m382rememberTextFieldStateLepunE) | (i3 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new SetPinViewKt$SetPin$3$1$1$1(m382rememberTextFieldStateLepunE, function1, continuation, 10);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, m382rememberTextFieldStateLepunE, (Function2) rememberedValue2);
            String str = content.searchHintText;
            ShowNavigationBack showNavigationBack = ShowNavigationBack.Never;
            boolean changed2 = gapComposer.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == obj) {
                rememberedValue3 = new SearchBarKt$$ExternalSyntheticLambda1(18, m382rememberTextFieldStateLepunE);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, str, rememberSearchBarKeyboardState, null, null, showNavigationBack, null, null, null, (Function0) rememberedValue3, false, null, gapComposer, 196608, 0, 7640);
            gapComposer = gapComposer;
            List list = content.filteredProviders;
            if (list.isEmpty()) {
                gapComposer.startReplaceGroup(1310387613);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.placeholder, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, content.emptyStateText, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                gapComposer.end(false);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(1310819939);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changedInstance(content) | (i3 == 32);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue4 == obj) {
                    function12 = function1;
                    rememberedValue4 = new CardTransitionKt$$ExternalSyntheticLambda4(i4, list, content, function12);
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    function12 = function1;
                }
                LazyDslKt.LazyColumn(layoutWeightElement, null, null, null, null, null, false, null, (Function1) rememberedValue4, gapComposer, 0, 510);
                gapComposer.end(false);
            }
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1749944862, new ProfileKt$$ExternalSyntheticLambda1(17, (Object) content, (Object) function12), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(content, function12, i, 11);
        }
    }

    public static final void WirelessProviderListView(WirelessProviderListViewModel wirelessProviderListViewModel, Function1 function1, Composer composer, int i) {
        wirelessProviderListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(548462966);
        int i2 = (gapComposer.changedInstance(wirelessProviderListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        byte b = 0;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(266990785, new PhonePlansUiFactory$$ExternalSyntheticLambda2(wirelessProviderListViewModel, function1, i3, b), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhonePlansUiFactory$$ExternalSyntheticLambda2(wirelessProviderListViewModel, function1, i);
        }
    }

    public static final PhonePlansHomeViewModel.Content.InfoCard toViewModel(MobilePlanHome.InfoCard infoCard) {
        PhonePlansHomeViewModel.Content.InfoCard.Progress.Color color;
        String str = infoCard.label;
        if (str == null) {
            str = "";
        }
        String str2 = infoCard.value;
        String str3 = str2 != null ? str2 : "";
        TextFieldValueKt textFieldValueKt = infoCard.detail;
        PhonePlansHomeViewModel.Content.InfoCard.Progress progress = null;
        MobilePlanHome$InfoCard$Detail$Caption mobilePlanHome$InfoCard$Detail$Caption = textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Caption ? (MobilePlanHome$InfoCard$Detail$Caption) textFieldValueKt : null;
        String str4 = mobilePlanHome$InfoCard$Detail$Caption != null ? mobilePlanHome$InfoCard$Detail$Caption.value : null;
        MobilePlanHome$InfoCard$Detail$Progress mobilePlanHome$InfoCard$Detail$Progress = textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Progress ? (MobilePlanHome$InfoCard$Detail$Progress) textFieldValueKt : null;
        if (mobilePlanHome$InfoCard$Detail$Progress != null) {
            float f = mobilePlanHome$InfoCard$Detail$Progress.value;
            MobilePlanHome.InfoCard.ProgressBarColor progressBarColor = infoCard.progress_bar_color;
            int i = progressBarColor == null ? -1 : PhonePlansHomeViewModelKt$WhenMappings.$EnumSwitchMapping$1[progressBarColor.ordinal()];
            if (i == -1 || i == 1 || i == 2) {
                color = PhonePlansHomeViewModel.Content.InfoCard.Progress.Color.Green;
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                color = PhonePlansHomeViewModel.Content.InfoCard.Progress.Color.Orange;
            }
            progress = new PhonePlansHomeViewModel.Content.InfoCard.Progress(f, color);
        }
        return new PhonePlansHomeViewModel.Content.InfoCard(str, str3, str4, progress);
    }
}
