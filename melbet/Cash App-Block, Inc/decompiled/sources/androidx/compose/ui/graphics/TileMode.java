package androidx.compose.ui.graphics;

import androidx.activity.OnBackPressedDispatcherKt;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.viewmodels.applet.news.BitcoinHomeNewsWidgetViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem;
import com.squareup.cash.offers.viewmodels.shared.OffersAvatarViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.offers.views.home.collectionCluster.ItemDirection;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class TileMode {
    public static final void BitcoinNewsWidgetView(BitcoinHomeNewsWidgetViewModel bitcoinHomeNewsWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        bitcoinHomeNewsWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-919823689);
        int i2 = (gapComposer.changed(bitcoinHomeNewsWidgetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            InvestingCryptoNewsViewModel investingCryptoNewsViewModel = bitcoinHomeNewsWidgetViewModel.viewModel;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            OnBackPressedDispatcherKt.InvestingCryptoNewsCarousel(investingCryptoNewsViewModel, (Function1) rememberedValue, modifier, gapComposer, i2 & 896, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinHomeNewsWidgetViewModel, function1, i, 9);
        }
    }

    public static final void CollectionItem(Modifier modifier, ClusterItem clusterItem, ItemDirection itemDirection, Function0 function0, Composer composer, int i, int i2) {
        ItemDirection itemDirection2;
        clusterItem.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1924824610);
        Applier applier = gapComposer.applier;
        int i3 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(clusterItem) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(itemDirection == null ? -1 : itemDirection.ordinal()) ? 256 : 128;
        }
        int i5 = i3 | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            ItemDirection itemDirection3 = i4 != 0 ? ItemDirection.Horizontal : itemDirection;
            long j = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(modifier, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Strings.getSizes(gapComposer).getClass();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m178borderxT4_qwU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            boolean z = (i5 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(6, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m177backgroundbw27NRU, false, null, null, (Function0) rememberedValue, 15);
            int ordinal = itemDirection3.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1374410825);
                Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m183clickableoSLSa3U$default, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_small_collection_start_padding), PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_small_collection_vertical_padding), 4.0f, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_small_collection_vertical_padding));
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                CollectionItem$Content(clusterItem, itemDirection3, gapComposer);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1374411652, false);
                }
                gapComposer.startReplaceGroup(343425761);
                Modifier fillMaxHeight = SizeKt.fillMaxHeight(SpacerKt.m299paddingVpY3zN4(m183clickableoSLSa3U$default, PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_large_collection_horizontal_padding), PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.offers_large_collection_vertical_padding)), 1.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Start, gapComposer, 54);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxHeight);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                CollectionItem$Content(clusterItem, itemDirection3, gapComposer);
                gapComposer.end(true);
                gapComposer.end(false);
            }
            itemDirection2 = itemDirection3;
        } else {
            gapComposer.skipToGroupEnd();
            itemDirection2 = itemDirection;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier, clusterItem, itemDirection2, function0, i, i2, 19);
        }
    }

    public static final void CollectionItem$Content(ClusterItem clusterItem, ItemDirection itemDirection, Composer composer) {
        boolean z;
        TextStyle textStyle;
        OffersAvatarViewModel offersAvatarViewModel = OffersHeroTileKt.toOffersAvatarViewModel(clusterItem.getAvatar());
        if (clusterItem instanceof ClusterItem.CLOClusterItemViewModel) {
            z = ((ClusterItem.CLOClusterItemViewModel) clusterItem).selected;
        } else {
            if (!(clusterItem instanceof ClusterItem.ClusterItemViewModel)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            z = ((ClusterItem.ClusterItemViewModel) clusterItem).selected;
        }
        UtilsKt.OffersAvatar(offersAvatarViewModel, z, null, AvatarSize.Size48, composer, 3072, 4);
        SpacerKt.Spacer(composer, SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 12.0f));
        StyledText title = clusterItem.getTitle();
        StyledText subTitle = clusterItem.getSubTitle();
        int ordinal = itemDirection.ordinal();
        if (ordinal == 0) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(569859150);
            textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            gapComposer.end(false);
        } else {
            if (ordinal != 1) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 569857172, false);
            }
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(569860975);
            textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
            gapComposer2.end(false);
        }
        TextStyle textStyle2 = textStyle;
        GapComposer gapComposer3 = (GapComposer) composer;
        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
        } else {
            gapComposer3.startReplaceGroup(-1762997739);
            gapComposer3.end(false);
        }
        UtilsKt.m3678ScalableOffersStyledTextY1HBRDA(null, title, subTitle, textStyle2, colors.semantic.text.prominent, 3, Room.getSp(12), 2, 0, composer, 102432768, 641);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m713toStringimpl(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }
}
