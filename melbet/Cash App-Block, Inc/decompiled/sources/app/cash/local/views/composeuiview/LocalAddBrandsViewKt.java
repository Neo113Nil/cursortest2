package app.cash.local.views.composeuiview;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.viewmodels.CardManagementSheetModel;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalCashAllActivityViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.viewmodels.LocalEditorialText;
import app.cash.local.viewmodels.LocalEditorialViewEvent;
import app.cash.local.viewmodels.LocalEditorialViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.internal.AddRemoveIcon;
import app.cash.local.views.ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda0;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackState;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalAddBrandsViewKt {

    /* renamed from: lambda$-1258123010, reason: not valid java name */
    public static final ComposableLambdaImpl f44lambda$1258123010 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(14), false, -1258123010);
    public static final ComposableLambdaImpl lambda$2030339975 = new ComposableLambdaImpl(new ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda0(28), false, 2030339975);
    public static final ComposableLambdaImpl lambda$2095656826 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(15), false, 2095656826);

    /* renamed from: lambda$-293385129, reason: not valid java name */
    public static final ComposableLambdaImpl f45lambda$293385129 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(16), false, -293385129);
    public static final ComposableLambdaImpl lambda$1236167367 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(17), false, 1236167367);
    public static final ComposableLambdaImpl lambda$704267959 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(18), false, 704267959);

    public static final void BrandCardGridItem(LocalAddBrandsViewModel.BrandCard brandCard, Function0 function0, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Function1 function12;
        Color m;
        long j;
        Color m2;
        long j2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-516856089);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(brandCard) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LocalColor localColor = brandCard.foregroundColor;
            boolean z = brandCard.isSelected;
            if (localColor == null) {
                gapComposer2.startReplaceGroup(-201830038);
                gapComposer2.end(false);
                m = null;
            } else {
                gapComposer2.startReplaceGroup(1517510007);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor, gapComposer2, 0));
            }
            if (m == null) {
                gapComposer2.startReplaceGroup(1517511695);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1517509339);
                gapComposer2.end(false);
                j = m.value;
            }
            LocalColor localColor2 = brandCard.backgroundColor;
            if (localColor2 == null) {
                gapComposer2.startReplaceGroup(-201717942);
                gapComposer2.end(false);
                m2 = null;
            } else {
                gapComposer2.startReplaceGroup(1517513623);
                m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor2, gapComposer2, 0));
            }
            if (m2 == null) {
                gapComposer2.startReplaceGroup(1517515500);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors2.semantic.background.brand;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1517512958);
                gapComposer2.end(false);
                j2 = m2.value;
            }
            long m684compositeOverOWjLjI = ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(0.3f, j, 14), j2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            float mo236toPx0680j_4 = ((Density) gapComposer2.consume(staticProvidableCompositionLocal)).mo236toPx0680j_4(3.0f);
            gapComposer2.startReplaceGroup(1517523283);
            Density density = (Density) gapComposer2.consume(staticProvidableCompositionLocal);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal2)).getClass();
            Object obj = DefaultSizes.border.entries;
            float mo236toPx0680j_42 = density.mo236toPx0680j_4(16.0f);
            gapComposer2.end(false);
            if (!z) {
                mo236toPx0680j_4 = RecyclerView.DECELERATION_RATE;
            }
            long j3 = j2;
            long j4 = j;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(mo236toPx0680j_4, null, null, null, gapComposer2, 0, 30);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, function0, 15);
            boolean changed = gapComposer2.changed(m684compositeOverOWjLjI) | gapComposer2.changed(animateFloatAsState) | gapComposer2.changed(mo236toPx0680j_42);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BlurEffectKt$$ExternalSyntheticLambda0(m684compositeOverOWjLjI, mo236toPx0680j_42, animateFloatAsState);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier drawBehind = ClipKt.drawBehind(m183clickableoSLSa3U$default, (Function1) rememberedValue);
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal2)).getClass();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(drawBehind, j3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f, 7.0f, 7.0f, 2.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4016, j4, (Composer) gapComposer2, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true), TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall, 0L, 0L, FontWeight.Medium, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777179), (TextLineBalancing) null, brandCard.name, (Map) null, (Function1) null, false);
            function12 = function1;
            CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, (FiniteAnimationSpec) null, (String) null, Expect_jvmKt.rememberComposableLambda(-1787109202, new LocalAddBrandsViewKt$$ExternalSyntheticLambda14(0, j4, function12), gapComposer2), gapComposer2, 24576, 14);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
            BrandImageSquareBox(OffsetKt.aspectRatio(1.0f, SpacerKt.m301paddingqDBjuR0(companion, 32.0f, 16.0f, 32.0f, 32.0f), false), brandCard.image, gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(brandCard, function0, function12, i, 28);
        }
    }

    public static final void BrandImageSquareBox(Modifier modifier, LocalImage localImage, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1431313368);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(localImage) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str = null;
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
            if (localImage == null) {
                gapComposer.startReplaceGroup(-1099393962);
            } else {
                gapComposer.startReplaceGroup(380177675);
                str = LocalViewsKt.getThemedUrl(localImage, gapComposer);
            }
            gapComposer.end(false);
            if (str != null) {
                gapComposer.startReplaceGroup(-1099349104);
                BoxKt.Box(ClipKt.paint$default(OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false), AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, str), biasAlignment, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, 50), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1099087712);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, localImage, i, 22);
        }
    }

    public static final void CardManagementSheet(PaddingValues paddingValues, CardManagementSheetModel cardManagementSheetModel, Function1 function1, Composer composer, int i) {
        boolean z;
        ArrayList arrayList;
        int i2;
        int i3;
        Modifier.Companion companion;
        CardManagementSheetModel cardManagementSheetModel2 = cardManagementSheetModel;
        paddingValues.getClass();
        cardManagementSheetModel2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1960297239);
        Applier applier = gapComposer.applier;
        int i4 = (i & 6) == 0 ? (gapComposer.changed(paddingValues) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(cardManagementSheetModel2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            int i5 = i4;
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SpacerKt.padding(companion2, paddingValues), ImageKt.rememberScrollState(gapComposer), false, 14);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, 24.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion3 = companion2;
            Modifier modifier = null;
            int i6 = 1;
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 8.0f, 1), Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, cardManagementSheetModel2.title, (Map) null, (Function1) null, false);
            String str = cardManagementSheetModel2.body;
            if (str == null) {
                gapComposer.startReplaceGroup(-720348325);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-720348324);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(808054230);
            ArrayList arrayList2 = cardManagementSheetModel2.sources;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                CardManagementSheetModel.Source source = (CardManagementSheetModel.Source) arrayList2.get(i7);
                if (source.cards.isEmpty()) {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i7;
                    companion = companion3;
                } else {
                    if (i7 > 0) {
                        gapComposer.startReplaceGroup(965264872);
                        ModalKt.HorizontalDivider(0, i6, gapComposer, modifier);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(965308117);
                        gapComposer.end(false);
                    }
                    Modifier.Companion companion4 = companion3;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
                    String str2 = source.label;
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    i3 = i7;
                    i2 = size;
                    companion = companion4;
                    arrayList = arrayList2;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer.startReplaceGroup(808068005);
                    ArrayList arrayList3 = source.cards;
                    int size2 = arrayList3.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        CardRow((CardManagementSheetModel.Card) arrayList3.get(i8), function1, gapComposer, (i5 >> 3) & 112);
                    }
                    Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, companion, 32.0f, gapComposer);
                }
                i7 = i3 + 1;
                companion3 = companion;
                arrayList2 = arrayList;
                size = i2;
                modifier = null;
                i6 = 1;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion3, 1.0f), 8.0f, RecyclerView.DECELERATION_RATE, 2), false, null, null, Expect_jvmKt.rememberComposableLambda(-116618535, new BrandSheetViewKt$$ExternalSyntheticLambda6(4, function1), gapComposer), gapComposer, 24582, 14);
            gapComposer.end(true);
            cardManagementSheetModel2 = cardManagementSheetModel;
            if (cardManagementSheetModel2.loading) {
                gapComposer.startReplaceGroup(-894744890);
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(matchParentSize, Color.m675copywmQWz5c$default(0.7f, colors2.semantic.background.f1047app, 14), ColorKt.RectangleShape);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(23);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, null, null, false, null, null, (Function0) rememberedValue, 28);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                z = true;
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(-894451599);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(paddingValues, cardManagementSheetModel2, function1, i, 2);
        }
    }

    public static final void CardRow(CardManagementSheetModel.Card card, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        Modifier.Companion companion;
        boolean z;
        boolean z2;
        String themedUrl;
        boolean z3;
        card.getClass();
        LocalImage localImage = card.image;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-883364237);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(card) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1);
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            boolean z4 = card.linked;
            if (localImage == null) {
                gapComposer.startReplaceGroup(-1843639863);
                gapComposer.end(false);
                z = false;
                companion = companion2;
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(-1843639862);
                companion = companion2;
                Modifier clip = ClipKt.clip(SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, 11), 32.0f, 20.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                z = false;
                z2 = true;
                LocalMapKt.LocalAsyncImage(ImageKt.m178borderxT4_qwU(clip, 1.0f, colors.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), null, LocalViewsKt.getThemedUrl(localImage, gapComposer), ContentScale.Companion.Fit, Alignment.Companion.Center, null, null, gapComposer, 27648, 98);
                gapComposer.end(false);
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new AdaptiveStackState();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AdaptiveStackState adaptiveStackState = (AdaptiveStackState) rememberedValue;
            coil3.size.SizeKt.AdaptiveStack(null, adaptiveStackState, null, null, null, null, Expect_jvmKt.rememberComposableLambda(792416100, new PagerDefaults$$ExternalSyntheticLambda0(25, card, adaptiveStackState), gapComposer), gapComposer, 1572912, 61);
            gapComposer.end(z2);
            String str = card.bylineText;
            if (str == null) {
                gapComposer.startReplaceGroup(-1594844153);
                gapComposer.end(z);
                z3 = z2;
            } else {
                gapComposer.startReplaceGroup(-1594844152);
                if (localImage == null) {
                    gapComposer.startReplaceGroup(-1635001855);
                    gapComposer.end(z);
                    themedUrl = null;
                } else {
                    gapComposer.startReplaceGroup(-745478656);
                    themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer);
                    gapComposer.end(z);
                }
                Modifier m302paddingqDBjuR0$default = themedUrl != null ? SpacerKt.m302paddingqDBjuR0$default(companion, 42.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14) : companion;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                Colors.Semantic.Text text = colors2.semantic.text;
                z3 = z2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, z4 ? text.subtle : text.warning, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(z);
            }
            gapComposer.end(z3);
            String stringResource = Room.stringResource(gapComposer, z4 ? R.string.local_views_card_unlink_it : R.string.local_views_card_link_it);
            boolean changedInstance = gapComposer.changedInstance(card) | ((i3 & 112) == 32 ? z3 : z);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new n$$ExternalSyntheticLambda0(2, function12, card);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            GapComposer gapComposer2 = gapComposer;
            LocalDropdownItemKt.m1326LocalDropdownMenu4kj_NE(null, lambda$2030339975, Tags.persistentListOf(new LocalDropdownItemModel(stringResource, (LocalDropdownItemModel.IconState) null, (Function0) rememberedValue2, 6)), 0L, false, false, false, gapComposer2, 48, 121);
            gapComposer = gapComposer2;
            gapComposer.end(z3);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(card, function12, i, 15);
        }
    }

    public static final void LocalAddBrandsView(Modifier modifier, LocalAddBrandsViewModel localAddBrandsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        modifier.getClass();
        localAddBrandsViewModel.getClass();
        boolean z = localAddBrandsViewModel.isWorkingAsync;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(249354884);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localAddBrandsViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 72.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(4, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_cancel), (Map) null, (Function1) null, false);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            ProgressCircularKt.ProgressCircular(0, 0, gapComposer, SizeKt.m281requiredSize3ABfNKs(ColorKt.m687graphicsLayer_6ThJ44$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, z ? 1.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 524283), 24.0f));
            Modifier m687graphicsLayer_6ThJ44$default = ColorKt.m687graphicsLayer_6ThJ44$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, z ? RecyclerView.DECELERATION_RATE : 1.0f, RecyclerView.DECELERATION_RATE, null, 524283);
            boolean z3 = i4 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == obj) {
                rememberedValue2 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(6, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(m687graphicsLayer_6ThJ44$default, false, null, null, (Function0) rememberedValue2, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, Strings.getColors(gapComposer).semantic.text.success, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_done), (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer, 6, 2);
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(true, gapComposer);
            boolean changed = gapComposer.changed(m382rememberTextFieldStateLepunE) | (i4 == 256);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                i3 = 2;
                rememberedValue3 = new SetPinViewKt$SetPin$3$1$1$1(m382rememberTextFieldStateLepunE, function1, null, 2);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                i3 = 2;
            }
            Updater.LaunchedEffect(gapComposer, m382rememberTextFieldStateLepunE, (Function2) rememberedValue3);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, i3);
            GridCells.Fixed fixed = new GridCells.Fixed(i3);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean changed2 = (i4 == 256) | gapComposer.changed(m382rememberTextFieldStateLepunE) | gapComposer.changed(rememberSearchBarKeyboardState) | gapComposer.changedInstance(localAddBrandsViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == obj) {
                n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(localAddBrandsViewModel, m382rememberTextFieldStateLepunE, rememberSearchBarKeyboardState, function1, 12);
                gapComposer.updateRememberedValue(n3__externalsyntheticlambda0);
                rememberedValue4 = n3__externalsyntheticlambda0;
            }
            LazyGridDslKt.LazyVerticalGrid(fixed, m300paddingVpY3zN4$default2, null, null, arrangement$SpacedAligned, arrangement$SpacedAligned2, null, false, null, (Function1) rememberedValue4, gapComposer, 1769472, 924);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 3, modifier, localAddBrandsViewModel, function1);
        }
    }

    public static final void LocalBrandProfileComposeUi(Modifier modifier, LocalBrandProfileViewModel localBrandProfileViewModel, boolean z, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        modifier.getClass();
        localBrandProfileViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1548162805);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(localBrandProfileViewModel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z4 = i4 != 0 ? false : z;
            if (localBrandProfileViewModel instanceof LocalBrandProfileViewModel.Loading) {
                gapComposer.startReplaceGroup(-1725764394);
                LocalMapKt.LocalLoadingView(z4, gapComposer, (i3 >> 6) & 14);
                gapComposer.end(false);
                z3 = z4;
            } else {
                if (!(localBrandProfileViewModel instanceof LocalBrandProfileViewModel.Content)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1725765244, false);
                }
                gapComposer.startReplaceGroup(-1725762117);
                int i5 = i3 & 8190;
                z3 = z4;
                LocalBrandLocationRowKt.LocalBrandProfileView(modifier, localBrandProfileViewModel, z3, function1, gapComposer, i5);
                gapComposer.end(false);
            }
            z2 = z3;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier, (Object) localBrandProfileViewModel, z2, (Object) function1, i, i2, 2);
        }
    }

    public static final void LocalCashAllActivityView(LocalCashAllActivityViewModel localCashAllActivityViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        localCashAllActivityViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-172376428);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localCashAllActivityViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            ToolbarModel toolbarModel = new ToolbarModel(Room.stringResource(gapComposer, R.string.local_views_activity));
            NavigationType navigationType = NavigationType.BACK;
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LocalToolbarKt.m1333LocalToolbarflo8M7A(null, toolbarModel, navigationType, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, null, gapComposer, MLKEMEngine.KyberPolyBytes, 105);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            boolean changedInstance = gapComposer.changedInstance(localCashAllActivityViewModel) | (i4 == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(21, localCashAllActivityViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer;
            LazyDslKt.LazyColumn(layoutWeightElement, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 0, 510);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(localCashAllActivityViewModel, function1, i);
        }
    }

    public static final void LocalCashBalanceComposeUi(LocalCashBalanceViewModel localCashBalanceViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        localCashBalanceViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(524121946);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localCashBalanceViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            LocalMapKt.m1317CollapsingHeaderScaffold_trzpw(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), Expect_jvmKt.rememberComposableLambda(391003135, new LocalViewFactory$$ExternalSyntheticLambda4(5, localCashBalanceViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-1349308632, new CartBannerViewKt$$ExternalSyntheticLambda2(localCashBalanceViewModel, 4), gapComposer), Expect_jvmKt.rememberComposableLambda(68900587, new PagerDefaults$$ExternalSyntheticLambda0(27, localCashBalanceViewModel, function1), gapComposer), CollapsingToolbarKt.rememberCollapsingToolbarScaffoldState(gapComposer), gapComposer, 25008);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-384118558, new BrandSheetViewKt$$ExternalSyntheticLambda6(5, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
            CardManagementSheetModel cardManagementSheetModel = localCashBalanceViewModel.cardManagementSheetModel;
            if (cardManagementSheetModel == null) {
                gapComposer.startReplaceGroup(1917781768);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1917781769);
                boolean z = (i4 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(12, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SheetKt.Sheet((Function0) rememberedValue, companion, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1149354987, new PagerDefaults$$ExternalSyntheticLambda0(28, cardManagementSheetModel, function1), gapComposer), gapComposer, 100663344, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(localCashBalanceViewModel, function1, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalEditorialBrandCarousel(Modifier modifier, final LocalEditorialContent.BrandCarousel brandCarousel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        final Function1 function12;
        boolean changedInstance;
        Object rememberedValue;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1061480749);
        Applier applier = gapComposer.applier;
        int i2 = i | 6 | (gapComposer.changedInstance(brandCarousel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            int i3 = i2 & 896;
            boolean changedInstance2 = gapComposer.changedInstance(brandCarousel) | (i3 == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(22, brandCarousel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyRow(m302paddingqDBjuR0$default, null, m295PaddingValuesYgX7TsA$default, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue2, gapComposer, 6, 490);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            final int i4 = 1;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, brandCarousel.name, (Map) null, (Function1) null, false);
            LocationStatus locationStatus = brandCarousel.locationStatus;
            if (locationStatus == null) {
                gapComposer.startReplaceGroup(-24664641);
                z = false;
            } else {
                z = false;
                gapComposer.startReplaceGroup(-24664640);
                LocalBrandLocationRowKt.m1314LocalBrandLocationStatusRowet4HrQ(null, locationStatus, null, gapComposer, 0, 29);
            }
            gapComposer.end(z);
            gapComposer.end(true);
            AddRemoveIcon addRemoveIcon = brandCarousel.addRemoveIcon;
            gapComposer.startReplaceGroup(-1534886241);
            boolean changedInstance3 = gapComposer.changedInstance(brandCarousel) | (i3 == 256);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                if (rememberedValue3 != neverEqualPolicy) {
                    function12 = function1;
                    Function0 function0 = (Function0) rememberedValue3;
                    changedInstance = (i3 != 256) | gapComposer.changedInstance(brandCarousel);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Function0() { // from class: app.cash.local.views.composeuiview.LocalEditorialViewKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5 = i4;
                                LocalEditorialContent.BrandCarousel brandCarousel2 = brandCarousel;
                                Function1 function13 = function12;
                                switch (i5) {
                                    case 0:
                                        function13.invoke(new LocalEditorialViewEvent.AddBrandClicked(brandCarousel2.brandSpot));
                                        break;
                                    default:
                                        function13.invoke(new LocalEditorialViewEvent.RemoveBrandClicked(brandCarousel2.brandSpot));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LocalMapKt.LocalAddRemoveIcon(addRemoveIcon, function0, (Function0) rememberedValue, gapComposer, 0);
                    gapComposer.end(false);
                    gapComposer.end(true);
                    str = brandCarousel.description;
                    if (str != null) {
                        gapComposer.startReplaceGroup(1162039647);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1162039648);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    gapComposer.end(true);
                    modifier2 = companion;
                }
            }
            function12 = function1;
            final int i5 = 0;
            rememberedValue3 = new Function0() { // from class: app.cash.local.views.composeuiview.LocalEditorialViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i5;
                    LocalEditorialContent.BrandCarousel brandCarousel2 = brandCarousel;
                    Function1 function13 = function12;
                    switch (i52) {
                        case 0:
                            function13.invoke(new LocalEditorialViewEvent.AddBrandClicked(brandCarousel2.brandSpot));
                            break;
                        default:
                            function13.invoke(new LocalEditorialViewEvent.RemoveBrandClicked(brandCarousel2.brandSpot));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(rememberedValue3);
            Function0 function02 = (Function0) rememberedValue3;
            changedInstance = (i3 != 256) | gapComposer.changedInstance(brandCarousel);
            rememberedValue = gapComposer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: app.cash.local.views.composeuiview.LocalEditorialViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i4;
                    LocalEditorialContent.BrandCarousel brandCarousel2 = brandCarousel;
                    Function1 function13 = function12;
                    switch (i52) {
                        case 0:
                            function13.invoke(new LocalEditorialViewEvent.AddBrandClicked(brandCarousel2.brandSpot));
                            break;
                        default:
                            function13.invoke(new LocalEditorialViewEvent.RemoveBrandClicked(brandCarousel2.brandSpot));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(rememberedValue);
            LocalMapKt.LocalAddRemoveIcon(addRemoveIcon, function02, (Function0) rememberedValue, gapComposer, 0);
            gapComposer.end(false);
            gapComposer.end(true);
            str = brandCarousel.description;
            if (str != null) {
            }
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) modifier2, (Object) brandCarousel, function1, i, 1);
        }
    }

    public static final void LocalEditorialText(Modifier modifier, LocalEditorialText localEditorialText, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Color m;
        long j;
        long j2;
        long j3;
        FontWeight fontWeight;
        TextStyle textStyle;
        int i2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1108328701);
        int i3 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(localEditorialText) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            String str = localEditorialText.value;
            LocalColor localColor = localEditorialText.color;
            if (localColor == null) {
                gapComposer2.startReplaceGroup(-1488003564);
                gapComposer2.end(false);
                m = null;
            } else {
                gapComposer2.startReplaceGroup(-48000115);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor, gapComposer2, 0));
            }
            if (m == null) {
                gapComposer2.startReplaceGroup(-47998398);
                j = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium.m996getColor0d7_KjU();
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-48000444);
                gapComposer2.end(false);
                j = m.value;
            }
            LocalEditorialText.Font font = localEditorialText.font;
            if (font == null) {
                gapComposer2.startReplaceGroup(-1487900861);
                gapComposer2.end(false);
                j2 = j;
                textStyle = null;
            } else {
                gapComposer2.startReplaceGroup(-1487900860);
                j2 = j;
                TextUnit textUnit = font.size != null ? new TextUnit(Room.pack(4294967296L, r5.longValue())) : null;
                if (textUnit == null) {
                    gapComposer2.startReplaceGroup(1801806121);
                    j3 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium.spanStyle.fontSize;
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(1801804199);
                    gapComposer2.end(false);
                    j3 = textUnit.packedValue;
                }
                long j4 = j3;
                LocalEditorialText.Weight weight = font.weight;
                int i4 = weight == null ? -1 : LocalEditorialViewKt$WhenMappings.$EnumSwitchMapping$0[weight.ordinal()];
                if (i4 == -1) {
                    gapComposer2.startReplaceGroup(1801815403);
                    fontWeight = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium.spanStyle.fontWeight;
                    gapComposer2.end(false);
                } else if (i4 == 1) {
                    gapComposer2.startReplaceGroup(1801809351);
                    gapComposer2.end(false);
                    fontWeight = FontWeight.Normal;
                } else if (i4 == 2) {
                    gapComposer2.startReplaceGroup(1801810695);
                    gapComposer2.end(false);
                    fontWeight = FontWeight.Medium;
                } else if (i4 == 3) {
                    gapComposer2.startReplaceGroup(1801812105);
                    gapComposer2.end(false);
                    fontWeight = FontWeight.SemiBold;
                } else {
                    if (i4 != 4) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1801807822, false);
                    }
                    gapComposer2.startReplaceGroup(1801813445);
                    gapComposer2.end(false);
                    fontWeight = FontWeight.Bold;
                }
                TextStyle textStyle2 = new TextStyle(0L, j4, fontWeight, null, 0L, 0L, 0, 0, 0L, null, 16777209);
                gapComposer2.end(false);
                textStyle = textStyle2;
            }
            if (textStyle == null) {
                gapComposer2.startReplaceGroup(-47982009);
                textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            } else {
                gapComposer2.startReplaceGroup(-47997106);
            }
            gapComposer2.end(false);
            Integer num = localEditorialText.maxLines;
            int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            LocalEditorialText.Alignment alignment = localEditorialText.alignment;
            int i5 = alignment == null ? -1 : LocalEditorialViewKt$WhenMappings.$EnumSwitchMapping$1[alignment.ordinal()];
            if (i5 == -1) {
                i2 = 0;
            } else if (i5 == 1) {
                i2 = 1;
            } else if (i5 == 2) {
                i2 = 3;
            } else {
                if (i5 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i2 = 2;
            }
            boolean z = (i3 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(7, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, fillMaxWidth, textStyle, j2, null, null, null, 0, intValue, i2, gapComposer, 0, 480);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, localEditorialText, function1, i, 29);
        }
    }

    public static final void LocalEditorialView(Modifier modifier, LocalEditorialViewModel localEditorialViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        modifier.getClass();
        localEditorialViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1715854654);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localEditorialViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
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
            String str = localEditorialViewModel.title;
            if (str == null) {
                str = "";
            }
            ToolbarModel toolbarModel = new ToolbarModel(str);
            NavigationType navigationType = NavigationType.CLOSE;
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LocalToolbarKt.m1333LocalToolbarflo8M7A(null, toolbarModel, navigationType, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(79244176, new LocalEditorialViewKt$$ExternalSyntheticLambda1(localEditorialViewModel, function1, i3), gapComposer), gapComposer, 1573248, 41);
            boolean changedInstance = gapComposer.changedInstance(localEditorialViewModel) | (i4 == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(23, localEditorialViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(null, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 0, 511);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 4, modifier, localEditorialViewModel, function1);
        }
    }
}
