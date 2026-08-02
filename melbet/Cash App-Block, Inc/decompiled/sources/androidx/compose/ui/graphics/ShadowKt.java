package androidx.compose.ui.graphics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.applet.map.BitcoinMapCardWidgetViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ShadowKt {
    public static final void BitcoinMapWidgetView(BitcoinMapCardWidgetViewModel bitcoinMapCardWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        BitcoinMapCardWidgetViewModel bitcoinMapCardWidgetViewModel2;
        GapComposer gapComposer;
        bitcoinMapCardWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1355890122);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(bitcoinMapCardWidgetViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String stringResource = Room.stringResource(gapComposer2, R.string.bitcoin_views_map_card_content_description);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), false);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(aspectRatio, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer2).surface.money.applet.background, ColorKt.RectangleShape);
            long j = Strings.getColors(gapComposer2).semantic.border.subtle;
            Strings.getSizes(gapComposer2).getClass();
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            boolean changed = gapComposer2.changed(stringResource);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj2) {
                rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(stringResource, 9);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m178borderxT4_qwU, false, (Function1) rememberedValue);
            Role role = new Role(0);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == obj2) {
                rememberedValue2 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(4, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(semantics, false, null, role, (Function0) rememberedValue2, 11);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m183clickableoSLSa3U$default);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Painter painterResource = Countries.painterResource(2131231127, 0, gapComposer2);
            BiasAlignment biasAlignment = Alignment.Companion.BottomEnd;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(22);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            ImageKt.Image(painterResource, null, SemanticsModifierKt.clearAndSetSemantics(fillMaxSize, (Function1) rememberedValue3), biasAlignment, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer2, Painter.$stable | 27696, 96);
            Strings.getSizes(gapComposer2).getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 32.0f), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.bitcoin_map_widget_eyebrow), (Map) null, (Function1) null, false);
            bitcoinMapCardWidgetViewModel2 = bitcoinMapCardWidgetViewModel;
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion, 0.8f), Strings.getTypography(gapComposer2).headlineSmall, (TextLineBalancing) null, Room.stringResource(gapComposer2, bitcoinMapCardWidgetViewModel2.canPayWithLightning ? R.string.bitcoin_views_map_onboarding_title : R.string.bitcoin_views_map_onboarding_title_ny), (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            bitcoinMapCardWidgetViewModel2 = bitcoinMapCardWidgetViewModel;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinMapCardWidgetViewModel2, function1, i, 8);
        }
    }

    public static final void OffersCategoryTile(Modifier modifier, CategoryOffersTileViewModel.CategoryIconTileViewModel categoryIconTileViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(3645146);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(categoryIconTileViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).semantic.background.subtle, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(5, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m183clickableoSLSa3U$default, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(categoryIconTileViewModel.icon, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 24.0f), null, null, null, gapComposer, 432, 2040);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 8.0f, gapComposer);
            String str = categoryIconTileViewModel.title.text;
            if (str == null) {
                str = "";
            }
            KeypadKt.m3651TextPdH14aY(1, 0, 0, 0, 196608, 0, 4050, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(modifier, categoryIconTileViewModel, function0, i);
        }
    }

    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        return new Shadow(TransactorKt.lerp(shadow.blurRadius, shadow2.blurRadius, f), ColorKt.m689lerpjxsXWHM(f, shadow.color, shadow2.color), Trace.m1192lerpWko1d7g(f, shadow.offset, shadow2.offset));
    }

    public static final void OffersCategoryTile(Modifier modifier, CategoryOffersTileViewModel categoryOffersTileViewModel, Function0 function0, Composer composer, int i) {
        categoryOffersTileViewModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(618010360);
        int i2 = (gapComposer.changed(categoryOffersTileViewModel) ? 32 : 16) | i | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (categoryOffersTileViewModel instanceof CategoryOffersTileViewModel.CategoryIconTileViewModel) {
                gapComposer.startReplaceGroup(1202474977);
                OffersCategoryTile(modifier, (CategoryOffersTileViewModel.CategoryIconTileViewModel) categoryOffersTileViewModel, function0, (Composer) gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer.end(false);
            } else if (categoryOffersTileViewModel instanceof CategoryOffersTileViewModel.CategoryImageTileViewModel) {
                gapComposer.startReplaceGroup(1202478460);
                gapComposer.end(false);
            } else {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1202473273, false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(modifier, categoryOffersTileViewModel, function0, i, 1);
        }
    }
}
