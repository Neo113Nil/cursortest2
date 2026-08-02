package app.cash.local.views.map;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda8;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda19;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.molecule.PlatformKt;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashCluster;
import com.squareup.cash.transfers.views.AddMoneyView$$ExternalSyntheticLambda12;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class BrandCollectionMapViewKt {
    static {
        new BrandCollectionModel.Location(new BrandSpot("preview-brand-token", "preview-location-token"), "Bistro cafe", new LocalColor("#0013BF", "#0013BF"), new LocalColor("#ffffff", "#ffffff"), "fake:///rangoon_bistro.png", new LocationStatus.Open("Open", "Cafe", 4), "5620 Paseo Del Norte Ste 123c", "hello", null, null, null, null, null);
    }

    public static final void BrandCollectionMapView(Modifier modifier, BrandCollectionMapViewModel brandCollectionMapViewModel, Function1 function1, Composer composer, int i) {
        BrandCollectionMapViewModel brandCollectionMapViewModel2;
        Function1 function12;
        brandCollectionMapViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-483591704);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(brandCollectionMapViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            brandCollectionMapViewModel2 = brandCollectionMapViewModel;
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(338612541, new LocalViewFactory$$ExternalSyntheticLambda8(modifier, brandCollectionMapViewModel2, function12, 1, (byte) 0), gapComposer), gapComposer, 3072, 7);
        } else {
            brandCollectionMapViewModel2 = brandCollectionMapViewModel;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalViewFactory$$ExternalSyntheticLambda8(modifier, brandCollectionMapViewModel2, function12, i);
        }
    }

    public static final void BrandLocationCluster(CashCluster cashCluster, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-73563648);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(cashCluster) : gapComposer.changedInstance(cashCluster) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 44.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer).semantic.background.inverse, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            i3 = 1;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.inverse, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, String.valueOf(cashCluster.items.size()), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            i3 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda19(cashCluster, i, i3);
        }
    }

    public static final void MultipleLocationsSelectorSheetContent(int i, Composer composer, Modifier modifier, List list, Function0 function0, Function1 function1) {
        int i2;
        List list2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1246027182);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(ImageKt.m177backgroundbw27NRU(fillMaxWidth, j, rectangleShapeKt$RectangleShape$1), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 32.0f), RoundedCornerShapeKt.CircleShape);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new y0$$ExternalSyntheticLambda0(8, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i4 = i2;
            Trace.m1191Iconww6aTOc(Icons.NavigationClose, (String) null, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15), Strings.getColors(gapComposer).semantic.background.standard, rectangleShapeKt$RectangleShape$1), 8.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 54, 0);
            gapComposer.end(true);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_map_multiple_businesses_title)).format(new Object[]{Integer.valueOf(list.size())});
            format2.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, fillMaxWidth2, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            float f = 16.0f;
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5));
            gapComposer.startReplaceGroup(1059527198);
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                BrandCollectionModel.Location location = (BrandCollectionModel.Location) list.get(i5);
                PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, 12.0f, f, 12.0f);
                boolean z2 = ((i4 & 896) == 256) | (i3 == 2048);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AddMoneyView$$ExternalSyntheticLambda12(function1, function0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                LocalHomeViewKt.LocalBrandCollectionLocation(paddingValuesImpl, location, (Function1) rememberedValue2, gapComposer, 54);
                i5++;
                f = 16.0f;
            }
            list2 = list;
            gapComposer.end(false);
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            coil3.size.SizeKt.ButtonCta(function0, SpacerKt.m298padding3ABfNKs(fillMaxWidth3, 16.0f), ButtonProminence.STANDARD, false, false, null, LocalMapPinKt.lambda$537505075, gapComposer, ((i4 >> 9) & 14) | 1573248, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            list2 = list;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(i, 11, modifier, list2, function1, function0);
        }
    }
}
