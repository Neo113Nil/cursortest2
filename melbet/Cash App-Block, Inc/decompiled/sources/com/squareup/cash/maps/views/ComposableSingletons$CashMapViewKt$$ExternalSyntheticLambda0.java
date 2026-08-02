package com.squareup.cash.maps.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter;
import coil3.compose.RealSubcomposeAsyncImageScope;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                GapComposer gapComposer = (GapComposer) composer;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                TransactorKt.LoadingPlaceholder(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.subtle, rectangleShapeKt$RectangleShape$1), LoadingIndicatorPosition.CENTER, composer, 48, 0);
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer2, R.string.blockers_invite_header_contacts_arcade), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.blockers_invite_error_positive), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.language_disclosure_cta_locale_settings_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.marker_location_selector_sheet_close), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Icons icons = Icons.SubtleMore16;
                    Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, "More actions", (Modifier) null, colors2.component.button.subtle.icon.f167default, gapComposer7, 54, 4);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.try_again), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer9, m285size3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer10).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    TransactorKt.CustomAction(titleBarActionScope, null, null, MerchantProfileViewKt.f466lambda$482020288, gapComposer10, (intValue9 & 14) | 3072, 3);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer11, R.string.square_loyalty_sheet_placeholder_cta_text);
                    TextStyle textStyle = ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).button;
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer11, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    BoxKt.Box(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m287sizeVpY3zN4(companion, 100.0f, 28.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), SharedUIKt.getPlaceholderBackgroundColor(gapComposer12), rectangleShapeKt$RectangleShape$1), 1.0f), gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(Color.Red, Icons.BankAccount16, Color.White, RecyclerView.DECELERATION_RATE, gapComposer13, 438, 8);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel("Applet Title", "Applet Title Caption", null, 12);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis("Emphasis", Color.Red, null), "Brief", null, SharedUIKt.lambda$499078120, 4));
                    Object rememberedValue = gapComposer14.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda6(2);
                        gapComposer14.updateRememberedValue(rememberedValue);
                    }
                    SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, (Function0) rememberedValue, false, null, null, null, gapComposer14, 448, 120);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(Color.Red, Icons.BankAccount16, Color.White, RecyclerView.DECELERATION_RATE, gapComposer15, 438, 8);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(Color.Red, Icons.BankAccount16, Color.White, RecyclerView.DECELERATION_RATE, gapComposer16, 438, 8);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    InstalledAppletTileHeaderModel installedAppletTileHeaderModel2 = new InstalledAppletTileHeaderModel("Applet Title", "Applet Title Caption", null, 12);
                    long j = Color.Red;
                    List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new InstalledServiceAppletTileContentModel[]{new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis("Emphasis", j, null), "Brief", null, SharedUIKt.f471lambda$435310428, 4), new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis("Emphasis", j, null), "Brief", null, SharedUIKt.f470lambda$301723517, 4)});
                    Object rememberedValue2 = gapComposer17.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda0(28);
                        gapComposer17.updateRememberedValue(rememberedValue2);
                    }
                    SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel2, listOf2, (Function0) rememberedValue2, false, SharedUIKt.f472lambda$605080418, null, null, gapComposer17, 25024, 104);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(Color.Red, Icons.BankAccount16, Color.White, RecyclerView.DECELERATION_RATE, gapComposer18, 438, 8);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    InstalledAppletTileHeaderModel installedAppletTileHeaderModel3 = new InstalledAppletTileHeaderModel("Applet Title", "Applet Title Caption", null, 12);
                    List listOf3 = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis("Emphasis", Color.Red, null), null, InstalledServiceAppletTileContentModel.BriefState.Loading.INSTANCE, SharedUIKt.lambda$1161296324, 2));
                    Object rememberedValue3 = gapComposer19.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda6(4);
                        gapComposer19.updateRememberedValue(rememberedValue3);
                    }
                    SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel3, listOf3, (Function0) rememberedValue3, false, null, null, null, gapComposer19, 448, 120);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer20, 6);
                    int hashCode2 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer20, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer20.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Applet Content", (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Renews Oct 1", (Map) null, (Function1) null, false);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer21 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    List listOf4 = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, null, SharedUIKt.lambda$1038983386, 7));
                    Object rememberedValue4 = gapComposer21.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ClusterItemKt$$ExternalSyntheticLambda0(29);
                        gapComposer21.updateRememberedValue(rememberedValue4);
                    }
                    SharedUIKt.InstalledServiceAppletTile(null, listOf4, (Function0) rememberedValue4, false, null, null, null, gapComposer21, Constants.METRO_BY_T_MOBILE, 120);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer22 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors4 = (Colors) gapComposer22.consume(staticProvidableCompositionLocal);
                    if (colors4 == null) {
                        z = false;
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        z = false;
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    long j2 = colors4.semantic.background.brand;
                    Icons icons2 = Icons.Deposit16;
                    Colors colors5 = (Colors) gapComposer22.consume(staticProvidableCompositionLocal);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, z);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(z);
                    }
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j2, icons2, colors5.semantic.icon.inverse, RecyclerView.DECELERATION_RATE, gapComposer22, 48, 8);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer23 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    InstalledAppletTileHeaderModel installedAppletTileHeaderModel4 = new InstalledAppletTileHeaderModel("Applet Title", null, null, 12);
                    List listOf5 = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, "Long multiline text to verify no leading whitespace when emphasis is null", null, SharedUIKt.f469lambda$1973958056, 4));
                    Object rememberedValue5 = gapComposer23.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda6(3);
                        gapComposer23.updateRememberedValue(rememberedValue5);
                    }
                    SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel4, listOf5, (Function0) rememberedValue5, false, null, null, null, gapComposer23, 448, 120);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer24 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    SharedUIKt.m3604FilledCircleWithIconJqkWdHE(Color.Red, Icons.BankAccount16, Color.White, 64.0f, gapComposer24, 3510, 0);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer25 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    VisibleKt.ShimmerBox(null, false, null, SharedUIKt.lambda$1187477835, gapComposer25, 3072, 7);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer26 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    InstalledAppletTileHeaderModel installedAppletTileHeaderModel5 = new InstalledAppletTileHeaderModel("Applet Title", null, null, 12);
                    List listOf6 = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis("Emphasis", Color.Red, null), "Brief", null, SharedUIKt.lambda$1754558584, 4));
                    Object rememberedValue6 = gapComposer26.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda6(1);
                        gapComposer26.updateRememberedValue(rememberedValue6);
                    }
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer26.consume(staticProvidableCompositionLocal2)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer26.consume(staticProvidableCompositionLocal2)).getClass();
                    TextStyle textStyle2 = ((Typography) gapComposer26.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                    InstalledServiceAppletTileLayoutConfig.VisualPosition visualPosition = InstalledServiceAppletTileLayoutConfig.VisualPosition.START;
                    SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel5, listOf6, (Function0) rememberedValue6, false, null, new InstalledServiceAppletTileLayoutConfig(16.0f, textStyle2, 16), null, gapComposer26, 448, 88);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
                Composer composer27 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                realSubcomposeAsyncImageScope.getClass();
                if ((intValue26 & 6) == 0) {
                    intValue26 |= ((GapComposer) composer27).changed(realSubcomposeAsyncImageScope) ? 4 : 2;
                }
                GapComposer gapComposer27 = (GapComposer) composer27;
                boolean shouldExecute = gapComposer27.shouldExecute(intValue26 & 1, (intValue26 & 19) != 18);
                Applier applier = gapComposer27.applier;
                if (shouldExecute) {
                    AsyncImagePainter asyncImagePainter = realSubcomposeAsyncImageScope.painter;
                    Object rememberedValue7 = gapComposer27.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = asyncImagePainter.state;
                        gapComposer27.updateRememberedValue(rememberedValue7);
                    }
                    AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer27, 1).getValue();
                    if ((state instanceof AsyncImagePainter.State.Loading) || (state instanceof AsyncImagePainter.State.Empty)) {
                        gapComposer27.startReplaceGroup(2072772230);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode3 = Long.hashCode(gapComposer27.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer27.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer27, fillMaxSize2);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer27.startReusableNode();
                        if (gapComposer27.inserting) {
                            gapComposer27.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer27.useNode();
                        }
                        Updater.m576setimpl(gapComposer27, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer27, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer27, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer27, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer27, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                        ProgressCircularKt.ProgressCircular(6, 0, gapComposer27, SizeKt.m285size3ABfNKs(companion, 32.0f));
                        gapComposer27.end(true);
                        gapComposer27.end(false);
                    } else if (state instanceof AsyncImagePainter.State.Success) {
                        gapComposer27.startReplaceGroup(2072986781);
                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(1.0f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), null, null, gapComposer27, 54, 28);
                        float floatValue = 1.0f - ((Number) animateFloatAsState.getValue()).floatValue();
                        Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode4 = Long.hashCode(gapComposer27.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer27.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer27, fillMaxSize3);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer27.startReusableNode();
                        if (gapComposer27.inserting) {
                            gapComposer27.createNode(layoutNode$Companion$Constructor$14);
                        } else {
                            gapComposer27.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer27, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer27, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode4);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer27, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer27, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer27, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                        ImageKt.Image(asyncImagePainter, null, AlphaKt.alpha(SizeKt.fillMaxSize(companion, 1.0f), ((Number) animateFloatAsState.getValue()).floatValue()), null, ContentScale.Companion.FillHeight, RecyclerView.DECELERATION_RATE, null, gapComposer27, 24624, 104);
                        if (floatValue > RecyclerView.DECELERATION_RATE) {
                            gapComposer27.startReplaceGroup(-1938596535);
                            Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxSize(companion, 1.0f), floatValue);
                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                            int hashCode5 = Long.hashCode(gapComposer27.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer27.currentCompositionLocalScope();
                            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer27, alpha);
                            gapComposer27.startReusableNode();
                            if (gapComposer27.inserting) {
                                gapComposer27.createNode(layoutNode$Companion$Constructor$14);
                            } else {
                                gapComposer27.useNode();
                            }
                            Updater.m576setimpl(gapComposer27, maybeCachedBoxMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer27, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer27, composeUiNode$Companion$SetModifier$13, gapComposer27, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer27, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                            r5 = false;
                            ProgressCircularKt.ProgressCircular(6, 0, gapComposer27, SizeKt.m285size3ABfNKs(companion, 32.0f));
                            z2 = true;
                            gapComposer27.end(true);
                            gapComposer27.end(false);
                        } else {
                            z2 = true;
                            gapComposer27.startReplaceGroup(-1938412984);
                            gapComposer27.end(false);
                        }
                        gapComposer27.end(z2);
                        gapComposer27.end(r5);
                    } else {
                        if (!(state instanceof AsyncImagePainter.State.Error)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer27, -210233556, false);
                        }
                        gapComposer27.startReplaceGroup(-210201787);
                        gapComposer27.end(false);
                    }
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer28 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer28;
                if (gapComposer28.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer28, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer28, R.string.start), (Map) null, (Function1) null, false);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer29 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer29;
                if (gapComposer29.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    Object rememberedValue8 = gapComposer29.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda6(6);
                        gapComposer29.updateRememberedValue(rememberedValue8);
                    }
                    SharedUIKt.AppletTileRowUninstalledContent(R.drawable.icon_navigation_share_android, 3126, gapComposer29, "Applet Title", "Applet Subtitle", (Function0) rememberedValue8);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer30 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer30;
                if (gapComposer30.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Object rememberedValue9 = gapComposer30.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new MoneyTabUIKt$$ExternalSyntheticLambda6(5);
                        gapComposer30.updateRememberedValue(rememberedValue9);
                    }
                    SharedUIKt.AppletTileRowUninstalledContent(R.drawable.icon_navigation_share_android, 3126, gapComposer30, "Applet Title", "Very long subtitle text that approaches maxWidth to test clamping behavior.", (Function0) rememberedValue9);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
