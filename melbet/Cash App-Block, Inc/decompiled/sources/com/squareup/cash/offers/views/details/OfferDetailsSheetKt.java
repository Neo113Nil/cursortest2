package com.squareup.cash.offers.views.details;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda37;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.FormattedDetailViewModel;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OfferFooterButton;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.shared.OffersLinkViewModel;
import com.squareup.cash.offers.views.FormattedCaptionViewModel;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.timeline.OffersTimelineKt$OffersTimeline$2$1$1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.home.SupportHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.util.clock.Clock$Companion;
import com.squareup.cash.util.legal.LegalUrl;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.text.StringsKt;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class OfferDetailsSheetKt {
    public static final ComposableLambdaImpl lambda$360130654 = new ComposableLambdaImpl(new OffersAvatarKt$$ExternalSyntheticLambda0(5), false, 360130654);
    public static final RealAppConfigManager$$ExternalSyntheticLambda2 transformDetailCaptionModel = new RealAppConfigManager$$ExternalSyntheticLambda2(9);

    public static final void AnimatedOfferButton(OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton offerDetailsButton, Function1 function1, Composer composer, int i) {
        int i2;
        OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton offerDetailsButton2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1410851220);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(offerDetailsButton) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_details_footer_height);
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, dimensionResource, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            offerDetailsButton2 = offerDetailsButton;
            AnimatedContentKt.AnimatedContent(offerDetailsButton2, m279heightInVpY3zN4$default, (Function1) rememberedValue, null, null, null, Expect_jvmKt.rememberComposableLambda(405921155, new TabContentViewKt$$ExternalSyntheticLambda37(dimensionResource, function1), gapComposer), gapComposer, (i2 & 14) | 1573248, 56);
        } else {
            offerDetailsButton2 = offerDetailsButton;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(offerDetailsButton2, function1, i, 9);
        }
    }

    public static final void FooterMessage(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(793584280);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Painter painter = Icons.Check24.painter(gapComposer);
            long j = Strings.getColors(gapComposer).semantic.text.brand;
            ImageKt.Image(painter, "Checkmark icon", null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 60);
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i2 >> 3) & 14) | 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.brand, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(modifier, str, i, 13);
        }
    }

    public static final void GreenRectangle(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2114041522);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
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
            ExtensionsKt.CashGreenRectangleRow(GreenStatus.ACTIVE, SizeKt.m285size3ABfNKs(companion, 16.0f), SpacerKt.Center, null, null, gapComposer, 438, 24);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda6(i, 11);
        }
    }

    public static final void GreenStatusSection(OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection greenStatusSection, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        GapComposer gapComposer;
        OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection greenStatusSection2 = greenStatusSection;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1805253621);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(greenStatusSection2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 6);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$18);
            int ordinal = greenStatusSection2.icon.ordinal();
            if (ordinal == 0) {
                gapComposer2.startReplaceGroup(-1606940064);
                Icons icons = Icons.Magic24;
                long j = Strings.getColors(gapComposer2).semantic.icon.standard;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer = gapComposer2;
                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer, 54, 4);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1606941829, false);
                }
                gapComposer2.startReplaceGroup(-1606934209);
                GreenRectangle(gapComposer2, 0);
                gapComposer2.end(false);
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                gapComposer = gapComposer2;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$1, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$12);
            greenStatusSection2 = greenStatusSection;
            gapComposer2 = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, greenStatusSection2.title, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, greenStatusSection2.subtitle, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            String str = greenStatusSection2.linkText;
            TextStyle textStyle = Strings.getTypography(gapComposer2).linkSmall;
            boolean changedInstance = gapComposer2.changedInstance(greenStatusSection2) | ((i3 & 112) == 32);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(27, function1, greenStatusSection2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            function12 = function1;
            Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3832, 0L, (Composer) gapComposer2, ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer2.end(true);
            gapComposer2.end(true);
        } else {
            function12 = function1;
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(greenStatusSection2, function12, i, 8);
        }
    }

    public static final void Links(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-666079680);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 6);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer2, R.string.offer_details_link_how_it_works);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).linkSmall;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer2, ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            String str = LegalUrl.TermsOfServiceOffers;
            String format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.offer_details_link_terms)).format(SVG$Unit$EnumUnboxingLocalUtility.m(1, str, "url", str));
            format2.getClass();
            TextStyle textStyle2 = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).linkSmall;
            boolean z2 = i3 == 4;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new NfcNotAvailableKt$$ExternalSyntheticLambda0(24, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(format2, (Function2) rememberedValue2, null, textStyle2, 0L, null, null, null, 0, 0, 3, gapComposer2, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 22, false);
        }
    }

    public static final void MessageButton(int i, Composer composer, Modifier modifier, String str) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-439206355);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Trace.m1191Iconww6aTOc(Icons.Check24, (String) null, (Modifier) null, Strings.getColors(gapComposer).component.button.subtle.icon.f167default, gapComposer, 54, 4);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4080, Strings.getColors(gapComposer).component.button.subtle.text.f168default, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(modifier, str, i, 14);
        }
    }

    public static final void OfferDetailsFooter(OfferDetailsSheetViewModel.FooterSectionViewModel footerSectionViewModel, Function3 function3, Function1 function1, Composer composer, int i) {
        int i2;
        footerSectionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-692415340);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(footerSectionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_details_footer_height);
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(Modifier.Companion.$$INSTANCE, dimensionResource, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedContent(footerSectionViewModel, m279heightInVpY3zN4$default, (Function1) rememberedValue, null, "Offer details footer animation", null, Expect_jvmKt.rememberComposableLambda(-1497009727, new SupportHomeViewKt$$ExternalSyntheticLambda10(function3, dimensionResource, function1), gapComposer), gapComposer, (i2 & 14) | 1597824, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) footerSectionViewModel, (Object) function3, (Object) function1, false, i, 25);
        }
    }

    public static final void OfferDetailsPrimaryButton(OfferFooterButton offerFooterButton, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-518574778);
        int i2 = (gapComposer.changedInstance(offerFooterButton) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), "OfferDetailsFooterPrimaryCta");
            boolean changedInstance = gapComposer.changedInstance(offerFooterButton) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OfferDetailsFooterKt$$ExternalSyntheticLambda6(function1, offerFooterButton, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, testTag, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(240091265, new OfferDetailsFooterKt$$ExternalSyntheticLambda7(offerFooterButton, i3), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OfferDetailsFooterKt$$ExternalSyntheticLambda8(offerFooterButton, function1, i, 1);
        }
    }

    public static final void OfferDetailsSecondaryButton(OfferFooterButton offerFooterButton, Function1 function1, Composer composer, int i) {
        offerFooterButton.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1147377172);
        int i2 = (gapComposer.changedInstance(offerFooterButton) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), "OfferDetailsFooterStandardCta");
            boolean changedInstance = gapComposer.changedInstance(offerFooterButton) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OfferDetailsFooterKt$$ExternalSyntheticLambda6(function1, offerFooterButton, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, testTag, null, false, false, null, Expect_jvmKt.rememberComposableLambda(81004175, new OfferDetailsFooterKt$$ExternalSyntheticLambda7(offerFooterButton, i3), gapComposer), gapComposer, 1572912, 60);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OfferDetailsFooterKt$$ExternalSyntheticLambda8(offerFooterButton, function1, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0308 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OfferDetailsSheet(Modifier modifier, OfferDetailsSheetViewModel.OfferDetails offerDetails, Function1 function1, Function5 function5, Composer composer, int i) {
        Modifier modifier2;
        Function5 function52;
        float f;
        int i2;
        Modifier.Companion companion;
        float f2;
        Object obj;
        Iterator it;
        boolean hasNext;
        int i3;
        Function1 function12;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer;
        Object obj2;
        ListUnorderedItem listUnorderedItem;
        offerDetails.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(61228589);
        int i4 = i | 6 | (gapComposer2.changed(offerDetails) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | 3072;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = offerDetails.impressionEventSpec;
            Object obj3 = Composer.Companion.Empty;
            if (offersAnalyticsEventSpec == null) {
                gapComposer2.startReplaceGroup(-1299933348);
            } else {
                gapComposer2.startReplaceGroup(-1299933347);
                Unit unit = Unit.INSTANCE;
                boolean changed = ((i4 & 896) == 256) | gapComposer2.changed(offersAnalyticsEventSpec);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == obj3) {
                    rememberedValue = new OffersTimelineKt$OffersTimeline$2$1$1(function1, offersAnalyticsEventSpec, null, 1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
            }
            gapComposer2.end(false);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion2, rememberScrollState, false, 14);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(verticalScroll$default, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f), "offerHalfsheet");
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, testTag);
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
            UtilsKt.OffersAvatar(offerDetails.avatarViewModel, offerDetails.isSelected, SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10), null, gapComposer2, MLKEMEngine.KyberPolyBytes, 8);
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion2, 12.0f));
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10);
            String str = offerDetails.title;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).header;
            GapComposer gapComposer3 = gapComposer2;
            Room.m1165Text25TpFw(0, 2, 0, 0, 1572912, 0, 4024, 0L, (Composer) gapComposer3, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            FormattedDetailViewModel formattedDetailViewModel = offerDetails.subtitleDetail;
            if (formattedDetailViewModel == null) {
                gapComposer3.startReplaceGroup(1094520386);
                gapComposer3.end(false);
                i2 = i4;
                f2 = 4.0f;
                f = 16.0f;
                companion = companion2;
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer3, 1094520387, companion2, 4.0f, gapComposer3);
                f = 16.0f;
                i2 = i4;
                companion = companion2;
                f2 = 4.0f;
                UtilsKt.m3676OffersFormattedDetailNLbO3rw(formattedDetailViewModel, SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10), null, 0L, null, 0L, RecyclerView.DECELERATION_RATE, gapComposer3, 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                gapComposer3.end(false);
            }
            OffersLinkViewModel offersLinkViewModel = offerDetails.subtitleLink;
            re$$ExternalSyntheticOutline0.m(gapComposer3, 1094717051, companion, f2, gapComposer3);
            String str2 = offersLinkViewModel.text;
            TextStyle textStyle2 = ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).linkMedium;
            Modifier.Companion companion3 = companion;
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion3, f, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, 10);
            float f3 = f;
            int i5 = i2;
            boolean changedInstance = gapComposer3.changedInstance(offersLinkViewModel) | ((i5 & 896) == 256);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (changedInstance) {
                obj = obj3;
            } else {
                obj = obj3;
                if (rememberedValue2 != obj) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer3, ImageKt.m183clickableoSLSa3U$default(m302paddingqDBjuR0$default2, false, null, null, (Function0) rememberedValue2, 15), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer3.end(false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                    gapComposer3.startReplaceGroup(1975000451);
                    ArrayList arrayList = offerDetails.details;
                    ArrayList arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (true) {
                        hasNext = it.hasNext();
                        Object obj4 = obj;
                        RealAppConfigManager$$ExternalSyntheticLambda2 realAppConfigManager$$ExternalSyntheticLambda2 = transformDetailCaptionModel;
                        if (hasNext) {
                            GapComposer gapComposer4 = gapComposer3;
                            gapComposer4.end(false);
                            ListUnorderedKt.ListUnordered(Tags.toImmutableList(arrayList2), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer4, 3072, 54);
                            StyledText styledText = offerDetails.termsMarkdownLink;
                            String str3 = styledText != null ? styledText.text : null;
                            int i6 = 22;
                            if (str3 == null) {
                                gapComposer4.startReplaceGroup(1095767733);
                                gapComposer4.end(false);
                                i3 = i5;
                                gapComposer2 = gapComposer4;
                                function12 = function1;
                            } else {
                                gapComposer4.startReplaceGroup(1095767734);
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion3, f3, RecyclerView.DECELERATION_RATE, f3, RecyclerView.DECELERATION_RATE, 10), 1.0f);
                                TextStyle textStyle3 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).linkXSmall;
                                boolean z = (i5 & 896) == 256;
                                Object rememberedValue3 = gapComposer4.rememberedValue();
                                if (z || rememberedValue3 == obj4) {
                                    rememberedValue3 = new NfcNotAvailableKt$$ExternalSyntheticLambda0(i6, function1);
                                    gapComposer4.updateRememberedValue(rememberedValue3);
                                }
                                i3 = i5;
                                function12 = function1;
                                LazyDslKt.m304MarkdownTextpCuZGqc(str3, (Function2) rememberedValue3, fillMaxWidth, textStyle3, 0L, null, null, null, 0, 0, 3, gapComposer4, MLKEMEngine.KyberPolyBytes, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                gapComposer2 = gapComposer4;
                                gapComposer2.end(false);
                            }
                            OfferDetailsSheetViewModel.FooterSectionViewModel footerSectionViewModel = offerDetails.footerSection;
                            if (footerSectionViewModel == null) {
                                gapComposer2.startReplaceGroup(1096183381);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(1096183382);
                                StyledText styledText2 = offerDetails.disclosureMarkdownText;
                                String str4 = styledText2 != null ? styledText2.text : null;
                                if (str4 == null) {
                                    gapComposer2.startReplaceGroup(-1487850570);
                                    gapComposer2.end(false);
                                    rememberComposableLambda = null;
                                } else {
                                    gapComposer2.startReplaceGroup(-1487850569);
                                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-727643569, new TabContentViewKt$$ExternalSyntheticLambda11(str4, function12, 22), gapComposer2);
                                    gapComposer2.end(false);
                                }
                                OfferDetailsFooter(footerSectionViewModel, rememberComposableLambda, function12, gapComposer2, i3 & 896);
                                gapComposer2.end(false);
                            }
                            gapComposer2.end(true);
                            function52 = realAppConfigManager$$ExternalSyntheticLambda2;
                            modifier2 = companion3;
                        } else {
                            OfferDetailsSheetViewModel.OfferDetailRow offerDetailRow = (OfferDetailsSheetViewModel.OfferDetailRow) it.next();
                            int i7 = (i5 & 896) | 48;
                            offerDetailRow.getClass();
                            zzd zzdVar = Icons.Companion;
                            String str5 = offerDetailRow.icon.arcade_id;
                            if (str5 == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                return;
                            }
                            zzdVar.getClass();
                            Icons icons = zzd.get(str5);
                            if (icons == null) {
                                icons = Icons.Pending16;
                            }
                            Icons icons2 = icons;
                            FormattedDetailViewModel formattedDetailViewModel2 = offerDetailRow.formattedDetail;
                            if (formattedDetailViewModel2 instanceof FormattedDetailViewModel.Countdown) {
                                gapComposer3.startReplaceGroup(-1377784023);
                                gapComposer = gapComposer3;
                                obj2 = obj4;
                                FormattedCaptionViewModel formattedCaptionViewModel = (FormattedCaptionViewModel) realAppConfigManager$$ExternalSyntheticLambda2.invoke(Clock$Companion.REAL, ((FormattedDetailViewModel.Countdown) formattedDetailViewModel2).template, function1, gapComposer, Integer.valueOf((i7 & 896) | 3072));
                                listUnorderedItem = !StringsKt.isBlank(formattedCaptionViewModel.text) ? new ListUnorderedItem(formattedCaptionViewModel.text, icons2, null, null, 12) : null;
                                gapComposer.end(false);
                            } else {
                                gapComposer = gapComposer3;
                                obj2 = obj4;
                                if (!(formattedDetailViewModel2 instanceof FormattedDetailViewModel.Text)) {
                                    throw NavAction$$ExternalSyntheticOutline0.m(gapComposer, -1152811398, false, "Formatted detail rows only support Countdown and Text states");
                                }
                                gapComposer.startReplaceGroup(-1377500094);
                                gapComposer.end(false);
                                listUnorderedItem = new ListUnorderedItem(((FormattedDetailViewModel.Text) formattedDetailViewModel2).text, icons2, null, null, 12);
                            }
                            if (listUnorderedItem != null) {
                                arrayList2.add(listUnorderedItem);
                            }
                            obj = obj2;
                            gapComposer3 = gapComposer;
                        }
                    }
                }
            }
            rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(24, offersLinkViewModel, function1);
            gapComposer3.updateRememberedValue(rememberedValue2);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer3, ImageKt.m183clickableoSLSa3U$default(m302paddingqDBjuR0$default2, false, null, null, (Function0) rememberedValue2, 15), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer3.end(false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            gapComposer3.startReplaceGroup(1975000451);
            ArrayList arrayList3 = offerDetails.details;
            ArrayList arrayList22 = new ArrayList();
            it = arrayList3.iterator();
            while (true) {
                hasNext = it.hasNext();
                Object obj42 = obj;
                RealAppConfigManager$$ExternalSyntheticLambda2 realAppConfigManager$$ExternalSyntheticLambda22 = transformDetailCaptionModel;
                if (hasNext) {
                }
                obj = obj2;
                gapComposer3 = gapComposer;
            }
        } else {
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
            function52 = function5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier2, offerDetails, function1, function52, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public static final void OfferDetailsSheetLoaded(OffersDetailsSheetViewModelV2.Loaded loaded, Modifier modifier, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        ?? r11;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-613436457);
        int i2 = (i & 6) == 0 ? (gapComposer2.changedInstance(loaded) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.verticalScroll$default(modifier, ImageKt.rememberScrollState(gapComposer2), false, 14), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            String str = loaded.title;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(146256792, new SuggestionUiKt$$ExternalSyntheticLambda8(loaded, 17), gapComposer2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Countries.PageHeader(str, companion, rememberComposableLambda, (String) null, gapComposer2, 3504, 0);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
            Links(function1, gapComposer2, (i2 >> 6) & 14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            ArrayList<OffersDetailsSheetViewModelV2.Loaded.OfferDetailRow> arrayList = loaded.details;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (OffersDetailsSheetViewModelV2.Loaded.OfferDetailRow offerDetailRow : arrayList) {
                arrayList2.add(new ListUnorderedItem(offerDetailRow.text, offerDetailRow.icon, null, null, 12));
            }
            ListUnorderedKt.ListUnordered(Tags.toImmutableList(arrayList2), SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer2, 3120, 52);
            GapComposer gapComposer3 = gapComposer2;
            OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection greenStatusSection = loaded.greenUpsellSection;
            if (greenStatusSection == null) {
                gapComposer3.startReplaceGroup(-263474175);
                gapComposer3.end(false);
                r11 = 1;
            } else {
                gapComposer3.startReplaceGroup(-263474174);
                r11 = 1;
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                GreenStatusSection(greenStatusSection, function1, gapComposer3, (i2 >> 3) & 112);
                gapComposer3.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, r11, gapComposer3, null);
            AnimatedOfferButton(loaded.button, function1, gapComposer3, (i2 >> 3) & 112);
            gapComposer3.end(r11);
            gapComposer = gapComposer3;
        } else {
            GapComposer gapComposer4 = gapComposer2;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) loaded, (Object) modifier, (Object) function1, false, i, 27);
        }
    }

    public static final void OfferDetailsSheetView(OfferDetailsSheetViewModel offerDetailsSheetViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        offerDetailsSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(264709613);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(offerDetailsSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(119473282, new MusicViewKt$$ExternalSyntheticLambda5(realImageLoader, offerDetailsSheetViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(offerDetailsSheetViewModel, function1, realImageLoader, i, 28);
        }
    }

    public static final void OffersDetailsSheetV2(RealImageLoader realImageLoader, OffersDetailsSheetViewModelV2 offersDetailsSheetViewModelV2, Function1 function1, Composer composer, int i) {
        int i2;
        offersDetailsSheetViewModelV2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-689605835);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(offersDetailsSheetViewModelV2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(885384821, new OfferDetailsSheetV2Kt$$ExternalSyntheticLambda0(function1, offersDetailsSheetViewModelV2, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) realImageLoader, (Object) offersDetailsSheetViewModelV2, (Object) function1, false, i, 26);
        }
    }

    public static final void OffersLoadingButton(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(557525283);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda2(7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, lambda$360130654, gapComposer, 1573302, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda6(i, 12);
        }
    }
}
