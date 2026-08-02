package app.cash.local.views.wallet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
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
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel$TabContent$Widget$Portfolio$Brand;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel$TabContent$Widget$Portfolio$Followed;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.home.LocalHomeGeoViewKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.h2$$ExternalSyntheticLambda0;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.caverock.androidsvg.CSSParser;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.crypto.tink.KeysetHandle;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda12;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.GroupingKt__GroupingJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalHomeViewKt {

    /* renamed from: lambda$-1642351270, reason: not valid java name */
    public static final ComposableLambdaImpl f58lambda$1642351270 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(8), false, -1642351270);
    public static final ComposableLambdaImpl lambda$1705201008 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(9), false, 1705201008);

    public static final void ActiveOrderDetails(Modifier modifier, LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder, Composer composer, int i) {
        TextStyle textStyle;
        Color m;
        long j;
        LocalText localText = activeOrder.estimatedCompletionText;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1838275688);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(activeOrder) ? 32 : 16);
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
            String str = localText != null ? localText.text : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            if (localText == null) {
                gapComposer.startReplaceGroup(-1124711846);
                gapComposer.end(false);
                textStyle = null;
            } else {
                gapComposer.startReplaceGroup(-1837396345);
                textStyle = LocalViewsKt.textStyle(localText, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).marketingCardTitleLarge, gapComposer);
                gapComposer.end(false);
            }
            if (textStyle == null) {
                gapComposer.startReplaceGroup(-1837393371);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).marketingCardTitleLarge;
            } else {
                gapComposer.startReplaceGroup(-1837397246);
            }
            gapComposer.end(false);
            TextStyle textStyle2 = textStyle;
            LocalColor localColor = localText != null ? localText.text_color : null;
            if (localColor == null) {
                gapComposer.startReplaceGroup(-1124530589);
                gapComposer.end(false);
                m = null;
            } else {
                gapComposer.startReplaceGroup(-1837390498);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-1837388490);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1837391776);
                gapComposer.end(false);
                j = m.value;
            }
            zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 1597440, 418, j, Room.getSp(8), gapComposer, null, textStyle2, str2, null);
            LocalMapKt.LocalCombinedViews(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), null, Expect_jvmKt.rememberComposableLambda(-620878757, new CartBannerViewKt$$ExternalSyntheticLambda2(activeOrder, 12), gapComposer), gapComposer, 390);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(modifier, activeOrder, i, 3);
        }
    }

    /* renamed from: ActiveOrderWidget-uFdPcIQ, reason: not valid java name */
    public static final void m1334ActiveOrderWidgetuFdPcIQ(LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder, float f, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(224975980);
        int i2 = (gapComposer.changedInstance(activeOrder) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(activeOrder) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda36(function1, activeOrder, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            WalletWidgetKt.WalletWidget(3072, gapComposer, Expect_jvmKt.rememberComposableLambda(1783806348, new TabContentViewKt$$ExternalSyntheticLambda37(f, activeOrder), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda38(activeOrder, f, function1, i, 0);
        }
    }

    public static final void ActiveOrderWidgetLarge(LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder, Function1 function1, Composer composer, int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        TabContentViewKt$$ExternalSyntheticLambda39 tabContentViewKt$$ExternalSyntheticLambda39;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-931001425);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(activeOrder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (activeOrder.displayMode == LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.InStoreOpenTabClosed) {
                gapComposer.startReplaceGroup(1435511090);
                InStoreOpenTabClosedActiveOrderWidgetLarge(activeOrder, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    tabContentViewKt$$ExternalSyntheticLambda39 = new TabContentViewKt$$ExternalSyntheticLambda39(activeOrder, function1, i, 0);
                    endRestartGroup.block = tabContentViewKt$$ExternalSyntheticLambda39;
                }
                return;
            }
            gapComposer.startReplaceGroup(1435604307);
            gapComposer.end(false);
            boolean changedInstance = gapComposer.changedInstance(activeOrder) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda36(function1, activeOrder, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            WalletWidgetKt.WalletWidget(3072, gapComposer, Expect_jvmKt.rememberComposableLambda(-1838604081, new ScoreUiFactory$$ExternalSyntheticLambda0(activeOrder, i3), gapComposer), null, (Function0) rememberedValue, false);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            tabContentViewKt$$ExternalSyntheticLambda39 = new TabContentViewKt$$ExternalSyntheticLambda39(activeOrder, function1, i, 1);
            endRestartGroup.block = tabContentViewKt$$ExternalSyntheticLambda39;
        }
    }

    public static final void AddRemoveStateDialog(final AddRemoveStateDialogModel addRemoveStateDialogModel, final Function0 function0, Composer composer, final int i) {
        final AddRemoveStateDialogModel addRemoveStateDialogModel2;
        final Function0 function02;
        Function2 function2;
        RecomposeScopeImpl recomposeScopeImpl;
        Triple triple;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-217819957);
        int i2 = (gapComposer.changedInstance(addRemoveStateDialogModel) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BrandFollowViewModel brandFollowViewModel = addRemoveStateDialogModel.addRemoveState;
            int i5 = addRemoveStateDialogModel.key;
            if (Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Add.INSTANCE)) {
                triple = new Triple(Integer.valueOf(R.string.local_views_brand_unfollow_dialog_title), Integer.valueOf(R.string.local_views_brand_unfollow_dialog_body), Icons.Subtract16);
            } else {
                if (!Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Remove.INSTANCE)) {
                    if (!Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Adding.INSTANCE) && !Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Removing.INSTANCE) && !Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.None.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    recomposeScopeImpl = gapComposer.endRestartGroup();
                    if (recomposeScopeImpl != null) {
                        function2 = new Function2(addRemoveStateDialogModel, function0, i, i3) { // from class: app.cash.local.views.wallet.LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda10
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ AddRemoveStateDialogModel f$0;
                            public final /* synthetic */ Function0 f$1;

                            {
                                this.$r8$classId = i3;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = this.$r8$classId;
                                Function0 function03 = this.f$1;
                                AddRemoveStateDialogModel addRemoveStateDialogModel3 = this.f$0;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i6) {
                                    case 0:
                                        LocalHomeViewKt.AddRemoveStateDialog(addRemoveStateDialogModel3, function03, composer2, Updater.updateChangedFlags(49));
                                        break;
                                    default:
                                        LocalHomeViewKt.AddRemoveStateDialog(addRemoveStateDialogModel3, function03, composer2, Updater.updateChangedFlags(49));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        recomposeScopeImpl.block = function2;
                    }
                    return;
                }
                triple = new Triple(Integer.valueOf(R.string.local_views_brand_follow_dialog_title), Integer.valueOf(R.string.local_views_brand_follow_dialog_body), Icons.Check16);
            }
            final int intValue = ((Number) triple.first).intValue();
            final int intValue2 = ((Number) triple.second).intValue();
            final Icons icons = (Icons) triple.third;
            Integer valueOf = Integer.valueOf(i5);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BlockRunner$cancel$1(function0, (Continuation) null, 17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
            final RealImageLoader realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
            addRemoveStateDialogModel2 = addRemoveStateDialogModel;
            ArcadeModal2Kt.Modal(Integer.valueOf(i5), addRemoveStateDialogModel2, function0, function0, false, false, Expect_jvmKt.rememberComposableLambda(1936590608, new Function3() { // from class: app.cash.local.views.wallet.LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AddRemoveStateDialogModel addRemoveStateDialogModel3 = (AddRemoveStateDialogModel) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).getClass();
                    addRemoveStateDialogModel3.getClass();
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(RealImageLoader.this), Expect_jvmKt.rememberComposableLambda(1625201232, new PlayerSurfaceKt$$ExternalSyntheticLambda2(addRemoveStateDialogModel3, intValue, intValue2, icons), composer2), composer2, 56);
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i2 << 3) & 112) | 1797504, 0);
            function02 = function0;
        } else {
            addRemoveStateDialogModel2 = addRemoveStateDialogModel;
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            function2 = new Function2(addRemoveStateDialogModel2, function02, i, i4) { // from class: app.cash.local.views.wallet.LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda10
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ AddRemoveStateDialogModel f$0;
                public final /* synthetic */ Function0 f$1;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = this.$r8$classId;
                    Function0 function03 = this.f$1;
                    AddRemoveStateDialogModel addRemoveStateDialogModel3 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            LocalHomeViewKt.AddRemoveStateDialog(addRemoveStateDialogModel3, function03, composer2, Updater.updateChangedFlags(49));
                            break;
                        default:
                            LocalHomeViewKt.AddRemoveStateDialog(addRemoveStateDialogModel3, function03, composer2, Updater.updateChangedFlags(49));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    public static final void FollowedWidget(LocalHomeViewModel$TabContent$Widget$Portfolio$Followed localHomeViewModel$TabContent$Widget$Portfolio$Followed, Function1 function1, Composer composer, int i) {
        float f;
        int i2;
        RowScopeInstance rowScopeInstance;
        char c;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(487422280);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(localHomeViewModel$TabContent$Widget$Portfolio$Followed) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            float f2 = 16.0f;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_following);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).marketingCardTitleLarge;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier.Companion companion2 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 5, 48, 0, 3824, colors.semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            int size = localHomeViewModel$TabContent$Widget$Portfolio$Followed.brands.size();
            int i5 = 3;
            if (size == 1) {
                f = 90.0f;
                i2 = 1;
            } else if (size < 5) {
                f = 43.0f;
                i2 = 2;
            } else if (size < 10) {
                f = 27.0f;
                i2 = 3;
            } else {
                f = 19.0f;
                i2 = 4;
            }
            gapComposer.startReplaceGroup(1465213942);
            Iterator it = CollectionsKt.windowed(localHomeViewModel$TabContent$Widget$Portfolio$Followed.brands, i2, i2, true).iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, 7);
                int i6 = 6;
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(f2, true, new Drop$$ExternalSyntheticBUOutline0(i5)), Alignment.Companion.Top, gapComposer, 6);
                int i7 = i2;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                ComposeUiNode.Companion.getClass();
                Function0 function02 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function02);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-516920209);
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (!hasNext) {
                        break;
                    }
                    LocalHomeViewModel$TabContent$Widget$Portfolio$Brand localHomeViewModel$TabContent$Widget$Portfolio$Brand = (LocalHomeViewModel$TabContent$Widget$Portfolio$Brand) it2.next();
                    Modifier weight = rowScopeInstance.weight(1.0f, companion2, true);
                    boolean changedInstance = gapComposer.changedInstance(localHomeViewModel$TabContent$Widget$Portfolio$Brand) | ((i4 & 112) == 32);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new n$$ExternalSyntheticLambda0(8, function1, localHomeViewModel$TabContent$Widget$Portfolio$Brand);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(weight, false, null, null, (Function0) rememberedValue, 15);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
                    ComposeUiNode.Companion.getClass();
                    Function0 function03 = ComposeUiNode.Companion.Constructor;
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function03);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-234484353, new MoneyTabUIKt$$ExternalSyntheticLambda12(localHomeViewModel$TabContent$Widget$Portfolio$Brand, f), gapComposer), gapComposer, i6);
                    Modifier.Companion companion3 = companion2;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 6.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f);
                    String str = localHomeViewModel$TabContent$Widget$Portfolio$Brand.name;
                    TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).badgeLargeAsset;
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        c = 51733;
                    } else {
                        c = 51733;
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    companion2 = companion3;
                    Room.m1165Text25TpFw(0, 1, 0, 3, 1572912, 0, 3760, colors2.semantic.text.standard, (Composer) gapComposer, fillMaxWidth, textStyle2, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    i6 = i6;
                    f = f;
                    i7 = i7;
                }
                float f3 = f;
                int i8 = i7;
                f2 = 16.0f;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-516864075);
                int size2 = i8 - list.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    BoxKt.Box(SizeKt.m279heightInVpY3zN4$default(rowScopeInstance.weight(1.0f, companion2, true), 20.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 0);
                }
                gapComposer.end(false);
                gapComposer.end(true);
                f = f3;
                i2 = i8;
                i5 = 3;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(localHomeViewModel$TabContent$Widget$Portfolio$Followed, function1, i, 20);
        }
    }

    public static final void InStoreOpenTabClosedActiveOrderWidgetLarge(LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(8620714);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(activeOrder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(activeOrder) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda36(function1, activeOrder, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            WalletWidgetKt.WalletWidget(3072, gapComposer, Expect_jvmKt.rememberComposableLambda(-265498678, new LocalViewFactory$$ExternalSyntheticLambda4(11, function1, activeOrder), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda39(activeOrder, function1, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalBrandCollectionLocation(PaddingValuesImpl paddingValuesImpl, final BrandCollectionModel.Location location, final Function1 function1, Composer composer, int i) {
        int i2;
        Modifier modifier;
        boolean z;
        Modifier.Companion companion;
        boolean z2;
        boolean z3;
        BrandFollowViewModel.Remove remove;
        boolean z4;
        boolean changedInstance;
        Object rememberedValue;
        Icons icons;
        LocationStatus locationStatus;
        boolean z5;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        boolean z6;
        int i3;
        float f;
        boolean z7;
        Icons icons2;
        boolean z8;
        Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        location.getClass();
        String str = location.address;
        LocationStatus locationStatus2 = location.status;
        BrandFollowViewModel brandFollowViewModel = location.addRemoveState;
        String str2 = location.clientRoute;
        LocalImage localImage = location.heroImage;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-982248506);
        Applier applier = gapComposer.applier;
        if ((i & 48) == 0) {
            i2 = (gapComposer.changed(paddingValuesImpl) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(location) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1169) != 1168)) {
            BrandFollowViewModel.Removing removing = BrandFollowViewModel.Removing.INSTANCE;
            BrandFollowViewModel.Adding adding = BrandFollowViewModel.Adding.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            BrandFollowViewModel.Add add = BrandFollowViewModel.Add.INSTANCE;
            BrandFollowViewModel.None none = BrandFollowViewModel.None.INSTANCE;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Fit;
            BrandFollowViewModel.Remove remove2 = BrandFollowViewModel.Remove.INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (localImage != null) {
                gapComposer.startReplaceGroup(-552702219);
                localImage.getClass();
                gapComposer.startReplaceGroup(952010569);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                long j = Strings.getColors(gapComposer).semantic.background.subtle;
                Strings.getSizes(gapComposer).getClass();
                KeysetHandle keysetHandle = DefaultSizes.border;
                Object obj = keysetHandle.entries;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                Strings.getSizes(gapComposer).getClass();
                Object obj2 = keysetHandle.entries;
                Modifier clip = ClipKt.clip(m177backgroundbw27NRU, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                if (str2 != null) {
                    Modifier clip2 = ClipKt.clip(companion2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
                    boolean changed = ((i2 & 7168) == 2048) | gapComposer.changed(str2);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str2, 6);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    clip = clip.then(ImageKt.m183clickableoSLSa3U$default(clip2, false, null, null, (Function0) rememberedValue2, 15));
                }
                gapComposer.end(false);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clip);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                int i4 = i2;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$17);
                gapComposer.startReplaceGroup(1738777658);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                LocalColor localColor = localImage.placeholder_color;
                if (localColor != null) {
                    fillMaxWidth = fillMaxWidth.then(ImageKt.m177backgroundbw27NRU(companion2, LocalViewsKt.toComposeColor(localColor, gapComposer, 0), ColorKt.RectangleShape));
                }
                gapComposer.end(false);
                Float ratio = LocalViewsKt.getRatio(localImage);
                Modifier aspectRatio = OffsetKt.aspectRatio(ratio != null ? ratio.floatValue() : 1.45f, fillMaxWidth, false);
                long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.1f, Strings.getColors(gapComposer).semantic.text.standard, 14);
                Strings.getSizes(gapComposer).getClass();
                Object obj3 = keysetHandle.entries;
                LocalMapKt.LocalAsyncImage(ImageKt.m178borderxT4_qwU(aspectRatio, 1.0f, m675copywmQWz5c$default, RoundedCornerShapeKt.m341RoundedCornerShapea9UjIt4(24.0f, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE)), null, LocalViewsKt.getThemedUrl(localImage, gapComposer), contentScale$Companion$Fit$1, biasAlignment, null, null, gapComposer, 27648, 98);
                String str3 = location.promoTag;
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (str3 == null) {
                    gapComposer.startReplaceGroup(-1931663371);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1931663370);
                    coil3.size.SizeKt.ButtonCompact(null, SpacerKt.m298padding3ABfNKs(boxScopeInstance.align(companion2, Alignment.Companion.TopStart), 16.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(510188967, new LocalHomeViewKt$$ExternalSyntheticLambda1(str3, 8), gapComposer), gapComposer, 1572870, 60);
                    gapComposer.end(false);
                }
                if (brandFollowViewModel == null) {
                    gapComposer.startReplaceGroup(-1931385890);
                    gapComposer.end(false);
                    locationStatus = locationStatus2;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                    z6 = true;
                    i3 = 6;
                    f = 1.0f;
                } else {
                    gapComposer.startReplaceGroup(-1931385889);
                    if (brandFollowViewModel != none) {
                        boolean z9 = brandFollowViewModel.equals(add) || brandFollowViewModel.equals(remove2);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(boxScopeInstance.align(companion2, Alignment.Companion.TopEnd), 16.0f), 32.0f);
                        long j2 = Strings.getColors(gapComposer).semantic.background.subtle;
                        RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                        locationStatus = locationStatus2;
                        f = 1.0f;
                        Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ClipKt.clip(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, j2, roundedCornerShape), roundedCornerShape), 1.0f, Color.m675copywmQWz5c$default(0.1f, Strings.getColors(gapComposer).semantic.text.standard, 14), roundedCornerShape);
                        boolean changedInstance2 = ((i4 & 7168) == 2048) | gapComposer.changedInstance(location);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                            z7 = false;
                            final Object[] objArr = 0 == true ? 1 : 0;
                            rememberedValue3 = new Function0() { // from class: app.cash.local.views.wallet.LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (objArr) {
                                        case 0:
                                            function1.invoke(new BrandCollectionEvent.BrandFollowToggled(location.brandSpot));
                                            break;
                                        default:
                                            function1.invoke(new BrandCollectionEvent.BrandFollowToggled(location.brandSpot));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(rememberedValue3);
                        } else {
                            z7 = false;
                        }
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(m178borderxT4_qwU, z9, null, null, (Function0) rememberedValue3, 14), 8.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z7);
                        int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$1);
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                        Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$13);
                        if (brandFollowViewModel.equals(none)) {
                            gapComposer.startReplaceGroup(226988239);
                            gapComposer.end(false);
                            Path$$ExternalSyntheticBUOutline0.m$1(brandFollowViewModel, "Unexpected ");
                            return;
                        }
                        if (brandFollowViewModel.equals(adding) || brandFollowViewModel.equals(removing)) {
                            z5 = false;
                            gapComposer.startReplaceGroup(226990972);
                            i3 = 6;
                            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion2, 16.0f));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1553115289);
                            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion2, 16.0f);
                            if (brandFollowViewModel.equals(add)) {
                                icons2 = Icons.Add16;
                            } else {
                                if (!brandFollowViewModel.equals(remove2)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                icons2 = Icons.Check16;
                            }
                            Trace.m1191Iconww6aTOc(icons2, (String) null, m285size3ABfNKs2, Strings.getColors(gapComposer).semantic.text.standard, gapComposer, 432, 0);
                            z5 = false;
                            gapComposer.end(false);
                            i3 = 6;
                        }
                        z6 = true;
                        gapComposer.end(true);
                    } else {
                        locationStatus = locationStatus2;
                        z5 = false;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                        z6 = true;
                        i3 = 6;
                        f = 1.0f;
                    }
                    gapComposer.end(z5);
                }
                gapComposer.end(z6);
                Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(companion2, f), 24.0f, 16.0f, 24.0f, 24.0f);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, i3);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$1);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$13);
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion2, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, location.name, (Map) null, (Function1) null, false);
                if (locationStatus == null) {
                    gapComposer.startReplaceGroup(-1474565609);
                    z8 = false;
                    gapComposer.end(false);
                } else {
                    z8 = false;
                    gapComposer.startReplaceGroup(-1474565608);
                    LocalBrandLocationRowKt.m1314LocalBrandLocationStatusRowet4HrQ(null, locationStatus, Strings.getTypography(gapComposer).bodySmall, gapComposer, 0, 21);
                    gapComposer.end(false);
                }
                if (str == null) {
                    gapComposer.startReplaceGroup(-1474413740);
                    gapComposer.end(z8);
                } else {
                    gapComposer.startReplaceGroup(-1474413739);
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) companion2, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    z8 = false;
                    gapComposer.end(false);
                }
                String str4 = location.promoDescription;
                if (str4 == null) {
                    gapComposer.startReplaceGroup(-1474127548);
                    gapComposer.end(z8);
                } else {
                    gapComposer.startReplaceGroup(-1474127547);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion2, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    z8 = false;
                    gapComposer.end(false);
                }
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, z6, z6, z8);
            } else {
                int i5 = i2;
                gapComposer.startReplaceGroup(-548296437);
                gapComposer.startReplaceGroup(952143145);
                if (str2 != null) {
                    Modifier clip3 = ClipKt.clip(companion2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
                    boolean changed2 = ((i5 & 7168) == 2048) | gapComposer.changed(str2);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str2, 7);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    modifier = ImageKt.m183clickableoSLSa3U$default(clip3, false, null, null, (Function0) rememberedValue4, 15);
                } else {
                    modifier = companion2;
                }
                gapComposer.end(false);
                Modifier padding = SpacerKt.padding(modifier, paddingValuesImpl);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, padding);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$18);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$19);
                Integer valueOf2 = Integer.valueOf(hashCode5);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$110);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$111);
                Modifier aspectRatio2 = OffsetKt.aspectRatio(1.0f, SizeKt.m290width3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 48.0f), false);
                long composeColor = LocalViewsKt.toComposeColor(location.backgroundColor, gapComposer, 0);
                RoundedCornerShape roundedCornerShape2 = RoundedCornerShapeKt.CircleShape;
                LocalMapKt.LocalAsyncImage(SpacerKt.m300paddingVpY3zN4$default(ClipKt.clip(ImageKt.m177backgroundbw27NRU(aspectRatio2, composeColor, roundedCornerShape2), roundedCornerShape2), RecyclerView.DECELERATION_RATE, 10.0f, 1), null, location.artwork, contentScale$Companion$Fit$1, biasAlignment, null, lambda$1705201008, gapComposer, 1600512, 34);
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 6);
                int hashCode6 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$18);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$19);
                Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer, composeUiNode$Companion$SetModifier$110, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
                Updater.m576setimpl(gapComposer, materializeModifier6, composeUiNode$Companion$SetModifier$111);
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion2, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, location.name, (Map) null, (Function1) null, false);
                if (locationStatus2 == null) {
                    gapComposer.startReplaceGroup(-1969010944);
                    z = false;
                    gapComposer.end(false);
                } else {
                    z = false;
                    gapComposer.startReplaceGroup(-1969010943);
                    LocalBrandLocationRowKt.m1314LocalBrandLocationStatusRowet4HrQ(null, locationStatus2, Strings.getTypography(gapComposer).bodySmall, gapComposer, 0, 21);
                    gapComposer.end(false);
                }
                if (str == null) {
                    gapComposer.startReplaceGroup(-1968859075);
                    gapComposer.end(z);
                    companion = companion2;
                } else {
                    gapComposer.startReplaceGroup(-1968859074);
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) companion2, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    companion = companion2;
                    z = false;
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                if (brandFollowViewModel == null) {
                    gapComposer.startReplaceGroup(-329748675);
                    gapComposer.end(z);
                    z3 = true;
                    z2 = z;
                } else {
                    gapComposer.startReplaceGroup(-329748674);
                    if (brandFollowViewModel != none) {
                        if (brandFollowViewModel.equals(add)) {
                            remove = remove2;
                        } else {
                            remove = remove2;
                            if (!brandFollowViewModel.equals(remove)) {
                                z4 = false;
                                BrandFollowViewModel.Remove remove3 = remove;
                                Modifier clip4 = ClipKt.clip(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 32.0f), Strings.getColors(gapComposer).semantic.background.standard, roundedCornerShape2), roundedCornerShape2);
                                changedInstance = ((i5 & 7168) != 2048) | gapComposer.changedInstance(location);
                                rememberedValue = gapComposer.rememberedValue();
                                if (!changedInstance || rememberedValue == neverEqualPolicy) {
                                    final int i6 = 1;
                                    rememberedValue = new Function0() { // from class: app.cash.local.views.wallet.LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i6) {
                                                case 0:
                                                    function1.invoke(new BrandCollectionEvent.BrandFollowToggled(location.brandSpot));
                                                    break;
                                                default:
                                                    function1.invoke(new BrandCollectionEvent.BrandFollowToggled(location.brandSpot));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(clip4, z4, null, null, (Function0) rememberedValue, 14), 8.0f);
                                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                                int hashCode7 = Long.hashCode(gapComposer.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer.currentCompositionLocalScope();
                                Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs2);
                                if (applier != null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer.startReusableNode();
                                if (gapComposer.inserting) {
                                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                                } else {
                                    gapComposer.useNode();
                                }
                                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$18);
                                Updater.m576setimpl(gapComposer, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$19);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer, composeUiNode$Companion$SetModifier$110, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                Updater.m576setimpl(gapComposer, materializeModifier7, composeUiNode$Companion$SetModifier$111);
                                if (brandFollowViewModel.equals(none)) {
                                    gapComposer.startReplaceGroup(1141461321);
                                    gapComposer.end(false);
                                    Path$$ExternalSyntheticBUOutline0.m$1(brandFollowViewModel, "Unexpected ");
                                    return;
                                }
                                if (brandFollowViewModel.equals(adding) || brandFollowViewModel.equals(removing)) {
                                    z2 = false;
                                    gapComposer.startReplaceGroup(1141463926);
                                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 16.0f));
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(1025737983);
                                    Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, 16.0f);
                                    if (brandFollowViewModel.equals(add)) {
                                        icons = Icons.Add16;
                                    } else {
                                        if (!brandFollowViewModel.equals(remove3)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return;
                                        }
                                        icons = Icons.Check16;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, m285size3ABfNKs3, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 432, 0);
                                    z2 = false;
                                    gapComposer.end(false);
                                }
                                gapComposer.end(true);
                            }
                        }
                        z4 = true;
                        BrandFollowViewModel.Remove remove32 = remove;
                        Modifier clip42 = ClipKt.clip(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 32.0f), Strings.getColors(gapComposer).semantic.background.standard, roundedCornerShape2), roundedCornerShape2);
                        changedInstance = ((i5 & 7168) != 2048) | gapComposer.changedInstance(location);
                        rememberedValue = gapComposer.rememberedValue();
                        if (!changedInstance) {
                        }
                        final int i62 = 1;
                        rememberedValue = new Function0() { // from class: app.cash.local.views.wallet.LocalBrandCollectionWidgetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i62) {
                                    case 0:
                                        function1.invoke(new BrandCollectionEvent.BrandFollowToggled(location.brandSpot));
                                        break;
                                    default:
                                        function1.invoke(new BrandCollectionEvent.BrandFollowToggled(location.brandSpot));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                        Modifier m298padding3ABfNKs22 = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(clip42, z4, null, null, (Function0) rememberedValue, 14), 8.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode72 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope72 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier72 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs22);
                        if (applier != null) {
                        }
                    } else {
                        z2 = false;
                    }
                    gapComposer.end(z2);
                    z3 = true;
                }
                gapComposer.end(z3);
                gapComposer.end(z2);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(paddingValuesImpl, location, function1, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    public static final void LocalBrandCollectionWidget(Modifier modifier, BrandCollectionModel brandCollectionModel, boolean z, Function1 function1, Composer composer, int i) {
        BrandCollectionModel brandCollectionModel2;
        GapComposer gapComposer;
        Object zzmhVar;
        MutableState mutableState;
        int i2;
        Object obj;
        LocalImage localImage;
        ?? r13;
        boolean z2;
        int i3;
        int i4;
        int i5;
        String str;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        boolean z3;
        GapComposer gapComposer4;
        GapComposer gapComposer5;
        GapComposer gapComposer6;
        Object obj2;
        GapComposer gapComposer7;
        brandCollectionModel.getClass();
        List list = brandCollectionModel.locations;
        function1.getClass();
        GapComposer gapComposer8 = (GapComposer) composer;
        gapComposer8.startRestartGroup(622311446);
        Applier applier = gapComposer8.applier;
        int i6 = (i & 6) == 0 ? (gapComposer8.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= gapComposer8.changedInstance(brandCollectionModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer8.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= gapComposer8.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer8.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            String str2 = brandCollectionModel.subtitle;
            LocalImage localImage2 = brandCollectionModel.mastheadImage;
            List<BrandCollectionModel.Location> list2 = list;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
            for (BrandCollectionModel.Location location : list2) {
                linkedHashMap.put(location.brandSpot, location.addRemoveState);
            }
            Object rememberedValue = gapComposer8.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue == obj3) {
                rememberedValue = Updater.mutableStateOf$default(linkedHashMap);
                gapComposer8.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer8.rememberedValue();
            if (rememberedValue2 == obj3) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer8.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            boolean changedInstance = gapComposer8.changedInstance(brandCollectionModel) | gapComposer8.changedInstance(linkedHashMap);
            Object rememberedValue3 = gapComposer8.rememberedValue();
            if (changedInstance || rememberedValue3 == obj3) {
                mutableState = mutableState3;
                i2 = i6;
                obj = obj3;
                localImage = localImage2;
                r13 = 0;
                brandCollectionModel2 = brandCollectionModel;
                zzmhVar = new zzmh(brandCollectionModel2, linkedHashMap, mutableState2, mutableState, null, 11);
                gapComposer8.updateRememberedValue(zzmhVar);
            } else {
                i2 = i6;
                localImage = localImage2;
                obj = obj3;
                mutableState = mutableState3;
                brandCollectionModel2 = brandCollectionModel;
                zzmhVar = rememberedValue3;
                r13 = 0;
            }
            Updater.LaunchedEffect(gapComposer8, linkedHashMap, (Function2) zzmhVar);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, r13);
            int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer8.startReusableNode();
            if (gapComposer8.inserting) {
                gapComposer8.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer8.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer8, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer8, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, r13);
            int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, companion);
            gapComposer8.startReusableNode();
            if (gapComposer8.inserting) {
                gapComposer8.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer8.useNode();
            }
            Updater.m576setimpl(gapComposer8, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer8, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            LocalImage localImage3 = localImage;
            if (localImage3 == null) {
                gapComposer8.startReplaceGroup(1347169202);
                gapComposer8.end(false);
                str = str2;
                i4 = 10;
                z3 = 0;
                i3 = 2048;
                i5 = 2;
                gapComposer3 = gapComposer8;
            } else {
                gapComposer8.startReplaceGroup(1347169203);
                gapComposer8.startReplaceGroup(43464083);
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 54.0f, 4.0f);
                Float ratio = LocalViewsKt.getRatio(localImage3);
                if (ratio != null) {
                    z2 = 0;
                    m299paddingVpY3zN4 = m299paddingVpY3zN4.then(OffsetKt.aspectRatio(ratio.floatValue(), companion, false));
                } else {
                    z2 = 0;
                }
                LocalColor localColor = localImage3.placeholder_color;
                if (localColor != null) {
                    m299paddingVpY3zN4 = m299paddingVpY3zN4.then(ImageKt.m177backgroundbw27NRU(companion, LocalViewsKt.toComposeColor(localColor, gapComposer8, z2), ColorKt.RectangleShape));
                }
                gapComposer8.end(z2);
                i3 = 2048;
                Modifier modifier2 = m299paddingVpY3zN4;
                boolean z4 = z2;
                i4 = 10;
                i5 = 2;
                LocalMapKt.LocalAsyncImage(modifier2, null, LocalViewsKt.getThemedUrl(localImage3, gapComposer8), ContentScale.Companion.Fit, Alignment.Companion.Center, brandCollectionModel2.title, null, gapComposer8, 27648, 66);
                GapComposer gapComposer9 = gapComposer8;
                if (str2 == null) {
                    gapComposer9.startReplaceGroup(946285224);
                    gapComposer9.end(z4);
                    str = str2;
                    gapComposer2 = gapComposer9;
                } else {
                    gapComposer9.startReplaceGroup(946285225);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 32.0f, RecyclerView.DECELERATION_RATE, 2);
                    TextStyle textStyle = ((Typography) gapComposer9.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, z4);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(z4);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors.semantic.text.standard, (Composer) gapComposer9, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    GapComposer gapComposer10 = gapComposer9;
                    str = str2;
                    gapComposer10.end(z4);
                    gapComposer2 = gapComposer10;
                }
                gapComposer2.end(z4);
                z3 = z4;
                gapComposer3 = gapComposer2;
            }
            String str3 = brandCollectionModel2.title;
            if (str3 == null) {
                gapComposer3.startReplaceGroup(1348095513);
                gapComposer3.end(z3);
                gapComposer6 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(1348095514);
                if (localImage3 == null && z) {
                    gapComposer3.startReplaceGroup(643665127);
                    GapComposer gapComposer11 = gapComposer3;
                    zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 1597488, MLKEMEngine.KyberPolyBytes, Strings.getColors(gapComposer3).semantic.text.standard, Room.getSp(i4), gapComposer11, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer3).hero, str3, null);
                    GapComposer gapComposer12 = gapComposer11;
                    if (str == null) {
                        gapComposer12.startReplaceGroup(644003088);
                        gapComposer12.end(z3);
                        gapComposer5 = gapComposer12;
                    } else {
                        gapComposer12.startReplaceGroup(644003089);
                        Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer12).semantic.text.standard, (Composer) gapComposer12, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 32.0f, RecyclerView.DECELERATION_RATE, i5), Strings.getTypography(gapComposer12).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        GapComposer gapComposer13 = gapComposer12;
                        gapComposer13.end(z3);
                        gapComposer5 = gapComposer13;
                    }
                    gapComposer5.end(z3);
                    gapComposer4 = gapComposer5;
                } else {
                    gapComposer3.startReplaceGroup(644373477);
                    GapComposer gapComposer14 = gapComposer3;
                    coil3.size.SizeKt.AdaptiveStack(SizeKt.fillMaxWidth(companion, 1.0f), null, null, SpacerKt.SpaceBetween, null, null, Expect_jvmKt.rememberComposableLambda(1156532822, new LocalViewFactory$$ExternalSyntheticLambda6(14, str3, brandCollectionModel2, function1), gapComposer3), gapComposer14, 1575942, 54);
                    GapComposer gapComposer15 = gapComposer14;
                    gapComposer15.end(z3);
                    gapComposer4 = gapComposer15;
                }
                gapComposer4.end(z3);
                gapComposer6 = gapComposer4;
            }
            SpacerKt.Spacer(gapComposer6, SizeKt.m277height3ABfNKs(companion, 8.0f));
            gapComposer6.startReplaceGroup(43545395);
            int size = list.size();
            for (int i7 = z3; i7 < size; i7++) {
                LocalBrandCollectionLocation(new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 12.0f), (BrandCollectionModel.Location) list.get(i7), function1, gapComposer6, 54 | (i2 & 7168));
            }
            int i8 = i2;
            gapComposer6.end(z3);
            if (brandCollectionModel2.showMapButton) {
                gapComposer6.startReplaceGroup(1350163865);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                boolean z5 = (i8 & 7168) == i3 ? true : z3;
                Object rememberedValue4 = gapComposer6.rememberedValue();
                obj2 = obj;
                if (z5 || rememberedValue4 == obj2) {
                    rememberedValue4 = new BrandSheetViewKt$$ExternalSyntheticLambda0(22, function1);
                    gapComposer6.updateRememberedValue(rememberedValue4);
                }
                GapComposer gapComposer16 = gapComposer6;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, m302paddingqDBjuR0$default, null, false, false, null, f58lambda$1642351270, gapComposer16, 1572912, 60);
                GapComposer gapComposer17 = gapComposer16;
                gapComposer17.end(z3);
                gapComposer7 = gapComposer17;
            } else {
                obj2 = obj;
                gapComposer6.startReplaceGroup(1350370728);
                gapComposer6.end(z3);
                gapComposer7 = gapComposer6;
            }
            gapComposer7.end(true);
            AddRemoveStateDialogModel addRemoveStateDialogModel = (AddRemoveStateDialogModel) mutableState.getValue();
            if (addRemoveStateDialogModel == null) {
                gapComposer7.startReplaceGroup(-1243798731);
                gapComposer7.end(z3);
            } else {
                gapComposer7.startReplaceGroup(-1243798730);
                Object rememberedValue5 = gapComposer7.rememberedValue();
                if (rememberedValue5 == obj2) {
                    rememberedValue5 = new TabContentViewKt$$ExternalSyntheticLambda1(11, mutableState);
                    gapComposer7.updateRememberedValue(rememberedValue5);
                }
                AddRemoveStateDialog(addRemoveStateDialogModel, (Function0) rememberedValue5, gapComposer7, 48);
                gapComposer7.end(z3);
            }
            gapComposer7.end(true);
            gapComposer = gapComposer7;
        } else {
            brandCollectionModel2 = brandCollectionModel;
            gapComposer8.skipToGroupEnd();
            gapComposer = gapComposer8;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, brandCollectionModel2, z, function1, i, 4);
        }
    }

    public static final void LocalCashIncentiveWidget(LocalHomeViewModel.TabContent.Widget.LocalCashIncentive localCashIncentive, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-580769304);
        int i2 = (gapComposer.changedInstance(localCashIncentive) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            WalletWidgetKt.WalletWidget(3120, gapComposer, Expect_jvmKt.rememberComposableLambda(-690956088, new LocalViewFactory$$ExternalSyntheticLambda4(9, localCashIncentive, function1), gapComposer), null, null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(localCashIncentive, function1, i, 23);
        }
    }

    public static final void LocalCashWidget(LocalHomeViewModel.TabContent.Widget.LocalCash localCash, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(331369980);
        int i2 = (gapComposer.changedInstance(localCash) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            WalletWidgetKt.WalletWidget(3072, gapComposer, Expect_jvmKt.rememberComposableLambda(238482652, new LocalViewFactory$$ExternalSyntheticLambda4(7, localCash, function1), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(localCash, function1, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static final void LocalHomeLoadingView(int i, Composer composer, Modifier modifier, boolean z) {
        int i2;
        int i3;
        GapComposer gapComposer;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        boolean z2;
        ?? r0;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-391692677);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer3.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changed(z) ? 32 : 16;
        }
        int i4 = 0;
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer3, R.string.local_views_local);
            Modifier inlineBottomNavigationPadding = CashInsetsKt.inlineBottomNavigationPadding(gapComposer3, SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f));
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(inlineBottomNavigationPadding, colors.surface.money.background, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$18);
            if (z) {
                gapComposer3.startReplaceGroup(428683590);
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                ChromeConfigKt.ChromeConfig(null, null, null, null, null, new ToolbarConfig(null, null, null, new TabToolbarInternalViewModel(null, 31), stringResource, null, false, false, null, null, RoomDatabase.MAX_BIND_PARAMETER_CNT), null, gapComposer3, PKIFailureInfo.transactionIdInUse, 95);
                TabToolbarsKt.SharedTabToolbarSpacer(0, 1, gapComposer3, null);
                gapComposer3.end(false);
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                z2 = 0;
                r0 = 1;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                gapComposer2 = gapComposer3;
            } else {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                gapComposer3.startReplaceGroup(428870055);
                TabToolbarInternalViewModel tabToolbarInternalViewModel = new TabToolbarInternalViewModel(null, 31);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(252036113, new LocalHomeViewKt$$ExternalSyntheticLambda1(stringResource, i4), gapComposer3);
                Object rememberedValue = gapComposer3.rememberedValue();
                Object obj = rememberedValue;
                if (rememberedValue == Composer.Companion.Empty) {
                    Yoga$$ExternalSyntheticLambda0 yoga$$ExternalSyntheticLambda0 = new Yoga$$ExternalSyntheticLambda0(23);
                    gapComposer3.updateRememberedValue(yoga$$ExternalSyntheticLambda0);
                    obj = yoga$$ExternalSyntheticLambda0;
                }
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                z2 = 0;
                r0 = 1;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$16;
                TabToolbarsKt.TabToolbar(null, tabToolbarInternalViewModel, null, false, null, null, rememberComposableLambda, (Function1) obj, null, null, null, null, false, gapComposer3, 14155776, 0, 7997);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier.then(new LayoutWeightElement(1.0f, r0)), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z2);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$1);
            ProgressCircularKt.ProgressCircular(z2 ? 1 : 0, r0, gapComposer2, null);
            gapComposer2.end(r0);
            gapComposer2.end(r0);
            i3 = z2;
            gapComposer = gapComposer2;
        } else {
            i3 = 0;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda3(modifier, z, i, i3);
        }
    }

    public static final void LocalHomeView(Modifier modifier, LocalHomeViewModel localHomeViewModel, Function1 function1, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        localHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1969331616);
        int i2 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(localHomeViewModel) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | (gapComposer2.changed(z) ? 2048 : 1024);
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else if (localHomeViewModel instanceof LocalHomeViewModel.Loading) {
            gapComposer2.startReplaceGroup(-1552888157);
            LocalHomeLoadingView(((i2 >> 6) & 112) | (i2 & 14), gapComposer2, modifier, z);
            gapComposer2.end(false);
            gapComposer = gapComposer2;
        } else if (localHomeViewModel instanceof LocalHomeViewModel.Geo) {
            gapComposer2.startReplaceGroup(-1552885253);
            gapComposer = gapComposer2;
            LocalHomeGeoViewKt.LocalHomeGeoView(modifier, ((LocalHomeViewModel.Geo) localHomeViewModel).model, function1, z, gapComposer, i2 & 8078, 0);
            gapComposer.end(false);
        } else {
            if (!(localHomeViewModel instanceof LocalHomeViewModel.TabContent)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1552888901, false);
            }
            gapComposer2.startReplaceGroup(-1552879667);
            m1336TabContentViewgMrHQkA(modifier, (LocalHomeViewModel.TabContent) localHomeViewModel, function1, false, z, false, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, (i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i2 << 3) & 57344), 488);
            gapComposer = gapComposer2;
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(modifier, localHomeViewModel, function1, z, i, 0);
        }
    }

    public static final void LocalSegmentedTabs(List list, int i, Function1 function1, Composer composer, int i2) {
        int i3;
        List list2;
        long j;
        boolean z;
        boolean z2;
        long j2;
        List list3 = list;
        int i4 = i;
        BiasAlignment.Vertical vertical = Alignment.Companion.Top;
        Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1558396808);
        Applier applier = gapComposer.applier;
        int i5 = i2 | (gapComposer.changedInstance(list3) ? 4 : 2) | (gapComposer.changed(i4) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Modifier.Companion companion2 = companion;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
            Arrangement$End$1 arrangement$End$12 = arrangement$End$1;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            gapComposer.startReplaceGroup(-796220243);
            List list4 = list3;
            int size = list4.size();
            int i6 = 0;
            while (i6 < size) {
                SegmentedTab segmentedTab = (SegmentedTab) list3.get(i6);
                boolean z3 = i6 == i4;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                boolean changed = ((i5 & 896) == 256) | gapComposer.changed(i6);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i6, 0, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    z = z3;
                    rememberedValue4 = Updater.mutableStateOf$default(new IntSize(0L));
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    z = z3;
                }
                MutableState mutableState = (MutableState) rememberedValue4;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new DateInputKt$$ExternalSyntheticLambda5(24, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                BiasAlignment.Vertical vertical2 = vertical;
                List list5 = list4;
                int i7 = size;
                int i8 = i6;
                GapComposer gapComposer2 = gapComposer;
                int i9 = i5;
                boolean z4 = z;
                Modifier.Companion companion3 = companion2;
                Modifier indication = IndicationKt.indication(RulerKt.onSizeChanged(layoutWeightElement, (Function1) rememberedValue5), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15));
                boolean changedInstance = gapComposer2.changedInstance(coroutineScope) | gapComposer2.changed(function0);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new l2$$ExternalSyntheticLambda7(coroutineScope, function0, mutableState, mutableInteractionSourceImpl, 11);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(indication, null, null, false, null, null, (Function0) rememberedValue6, 28);
                boolean changed2 = gapComposer2.changed(z4);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda24(z4, 3);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue7), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 18.0f, 7);
                Arrangement$End$1 arrangement$End$13 = arrangement$End$12;
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$13, Alignment.Companion.CenterVertically, gapComposer2, 48);
                int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion3, 1.0f);
                String stringResource = Room.stringResource(gapComposer2, segmentedTab.titleRes);
                TextStyle textStyle = Strings.getTypography(gapComposer2).labelMedium;
                if (z4) {
                    gapComposer2.startReplaceGroup(-1537651935);
                    j2 = Strings.getColors(gapComposer2).semantic.text.standard;
                    z2 = false;
                    gapComposer2.end(false);
                } else {
                    z2 = false;
                    gapComposer2.startReplaceGroup(-1537571645);
                    j2 = Strings.getColors(gapComposer2).semantic.text.subtle;
                    gapComposer2.end(false);
                }
                gapComposer = gapComposer2;
                arrangement$End$12 = arrangement$End$13;
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, j2, (Composer) gapComposer, fillMaxWidth2, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                i6 = i8 + 1;
                companion2 = companion3;
                i5 = i9;
                size = i7;
                vertical = vertical2;
                list3 = list;
                i4 = i;
                list4 = list5;
            }
            List list6 = list4;
            gapComposer.end(false);
            gapComposer.end(true);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), 1.0f);
            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$End$12, vertical, gapComposer, 0);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier4, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1960861958);
            int size2 = list6.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(new LayoutWeightElement(1.0f, true), 1.0f);
                if (i10 == i) {
                    gapComposer.startReplaceGroup(1849820104);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.border.standard;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1849906346);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.border.subtle;
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs2, j, ColorKt.RectangleShape), gapComposer, 0);
            }
            list2 = list;
            i3 = i;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            i3 = i4;
            list2 = list3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda16(list2, i3, function1, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    public static final void MarketingMessageCard(Modifier modifier, LocalHomeViewModel.TabContent.Widget.MarketingMessage marketingMessage, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer;
        ?? r3;
        Modifier.Companion companion;
        GapComposer gapComposer2;
        LocalHomeViewModel.TabContent.Widget.MarketingMessage marketingMessage2 = marketingMessage;
        marketingMessage2.getClass();
        function0.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-885427850);
        Applier applier = gapComposer3.applier;
        int i2 = i | 6 | (gapComposer3.changedInstance(marketingMessage2) ? 32 : 16) | (gapComposer3.changedInstance(function0) ? 256 : 128);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 48);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer3, 54);
            int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, companion2);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.local_views_message), (Map) null, (Function1) null, false);
            if (marketingMessage.showUnreadBadge) {
                gapComposer3.startReplaceGroup(2024650845);
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion2, 6.0f), Strings.getColors(gapComposer3).component.badge.background, RoundedCornerShapeKt.CircleShape), gapComposer3, 0);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(2024838240);
                gapComposer3.end(false);
            }
            gapComposer3.end(true);
            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(2.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer3, 54);
            int hashCode5 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer3, companion2);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier5, composeUiNode$Companion$SetModifier$14);
            marketingMessage2 = marketingMessage;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, marketingMessage.username, (Map) null, (Function1) null, false);
            String str = marketingMessage2.timestamp;
            if (str != null) {
                gapComposer3.startReplaceGroup(1832438185);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.local_views_message_timestamp_break), (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                r3 = 0;
                gapComposer3.end(false);
            } else {
                r3 = 0;
                gapComposer3.startReplaceGroup(1832851415);
                gapComposer3.end(false);
            }
            gapComposer3.end(true);
            gapComposer3.end(true);
            if (marketingMessage2.showAll) {
                gapComposer3.startReplaceGroup(-1496993960);
                companion = companion2;
                zzacp.m2014InlineIconTextQqsJerU(Room.stringResource(gapComposer3, R.string.local_views_all), Icons.SubtlePush16.painter(gapComposer3), ImageKt.m183clickableoSLSa3U$default(companion2, false, null, new Role(r3), function0, 11), 0L, null, Strings.getTypography(gapComposer3).bodySmall, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer3, Painter.$stable << 3, 0, 32728);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            } else {
                companion = companion2;
                gapComposer3.startReplaceGroup(-1496726554);
                gapComposer3.end(r3);
                gapComposer2 = gapComposer3;
            }
            gapComposer2.end(true);
            MarketingMessageKt.MarketingMessageImage(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, WalletWidgetKt.WALLET_WIDGET_PADDING_TOP, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), marketingMessage2.brandColor, marketingMessage2.image, marketingMessage2.messageText, marketingMessage2.badge, null, gapComposer2, 6, 32);
            gapComposer2.end(true);
            modifier2 = companion;
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            modifier2 = modifier;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7(modifier2, marketingMessage2, function0, i, 10);
        }
    }

    public static final void MarketingMessageWidget(LocalHomeViewModel.TabContent.Widget.MarketingMessage marketingMessage, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1564861912);
        int i2 = (gapComposer.changedInstance(marketingMessage) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(marketingMessage) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new n$$ExternalSyntheticLambda0(9, function1, marketingMessage);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            WalletWidgetKt.WalletWidget(3072, gapComposer, Expect_jvmKt.rememberComposableLambda(-40683256, new LocalViewFactory$$ExternalSyntheticLambda4(8, marketingMessage, function1), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(marketingMessage, function1, i, 22);
        }
    }

    public static final void PastOrderWidget(LocalHomeViewModel.TabContent.Widget.PastOrders pastOrders, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(670696287);
        int i2 = (gapComposer.changedInstance(pastOrders) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(-(WalletWidgetKt.WALLET_WIDGET_PADDING_TOP * 2.0f), true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(14336079);
            List list = pastOrders.orders;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder pastOrder = (LocalHomeViewModel.TabContent.Widget.PastOrders.PastOrder) list.get(i3);
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(pastOrder);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda45(function1, pastOrder, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                WalletWidgetKt.WalletWidget(3072, gapComposer, Expect_jvmKt.rememberComposableLambda(1137984928, new LocalViewFactory$$ExternalSyntheticLambda4(10, function1, pastOrder), gapComposer), null, (Function0) rememberedValue, false);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(pastOrders, function1, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable] */
    /* renamed from: SegmentedTabContent-uFdPcIQ, reason: not valid java name */
    public static final void m1335SegmentedTabContentuFdPcIQ(List list, float f, Function1 function1, Function1 function12, Composer composer, int i) {
        SegmentedTabKind segmentedTabKind;
        Object animatedImageDecoder$wrapDrawable$2;
        Continuation continuation;
        ?? r15;
        ?? r0 = (GapComposer) composer;
        r0.startRestartGroup(362841145);
        int i2 = i | (r0.changedInstance(list) ? 4 : 2) | (r0.changed(f) ? 32 : 16) | (r0.changedInstance(function1) ? 256 : 128) | (r0.changedInstance(function12) ? 2048 : 1024);
        if (r0.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changed = r0.changed(list);
            Object rememberedValue = r0.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                List<LocalHomeViewModel.TabContent.Widget> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (LocalHomeViewModel.TabContent.Widget widget : list2) {
                    if (widget instanceof BrandCollectionModel) {
                        segmentedTabKind = SegmentedTabKind.EXPLORE;
                    } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.ActiveOrders) {
                        segmentedTabKind = SegmentedTabKind.ORDERS;
                    } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.MarketingMessage) {
                        segmentedTabKind = SegmentedTabKind.EXPLORE;
                    } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.PastOrders) {
                        segmentedTabKind = SegmentedTabKind.ORDERS;
                    } else {
                        if (!(widget instanceof LocalHomeViewModel$TabContent$Widget$Portfolio$Followed)) {
                            if ((widget instanceof LocalHomeViewModel.TabContent.Widget.LocalCash) || (widget instanceof LocalHomeViewModel.TabContent.Widget.LocalCashIncentive)) {
                                a$$ExternalSyntheticBUOutline0.m$1("Unexpected widgets");
                                return;
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                        }
                        segmentedTabKind = SegmentedTabKind.FOLLOWING;
                    }
                    arrayList.add(new Pair(segmentedTabKind, widget));
                }
                SegmentedTabKind segmentedTabKind2 = SegmentedTabKind.EXPLORE;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((Pair) next).first == SegmentedTabKind.EXPLORE) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((LocalHomeViewModel.TabContent.Widget) ((Pair) it2.next()).second);
                }
                SegmentedTab segmentedTab = new SegmentedTab(segmentedTabKind2, R.string.local_views_explore, arrayList3);
                SegmentedTabKind segmentedTabKind3 = SegmentedTabKind.ORDERS;
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (((Pair) next2).first == SegmentedTabKind.ORDERS) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add((LocalHomeViewModel.TabContent.Widget) ((Pair) it4.next()).second);
                }
                SegmentedTab segmentedTab2 = new SegmentedTab(segmentedTabKind3, R.string.local_views_orders, arrayList5);
                SegmentedTabKind segmentedTabKind4 = SegmentedTabKind.FOLLOWING;
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    if (((Pair) next3).first == SegmentedTabKind.FOLLOWING) {
                        arrayList6.add(next3);
                    }
                }
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    arrayList7.add((LocalHomeViewModel.TabContent.Widget) ((Pair) it6.next()).second);
                }
                rememberedValue = CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedTab[]{segmentedTab, segmentedTab2, new SegmentedTab(segmentedTabKind4, R.string.local_views_following, arrayList7)});
                r0.updateRememberedValue(rememberedValue);
            }
            List list3 = (List) rememberedValue;
            boolean changedInstance = r0.changedInstance(list3);
            Object rememberedValue2 = r0.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new h2$$ExternalSyntheticLambda0(list3, 3);
                r0.updateRememberedValue(rememberedValue2);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue2, r0, 0, 3);
            Object rememberedValue3 = r0.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r0);
                r0.updateRememberedValue(rememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function12, r0);
            Object rememberedValue4 = r0.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Boxes$$ExternalSyntheticOutline1.m(0, (GapComposer) r0);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue4;
            Integer valueOf = Integer.valueOf(((ParcelableSnapshotMutableIntState) rememberPagerState.scrollPosition.elementTypes).getIntValue());
            boolean changed2 = r0.changed(rememberPagerState);
            Object rememberedValue5 = r0.rememberedValue();
            Continuation continuation2 = null;
            if (changed2 || rememberedValue5 == obj) {
                rememberedValue5 = new EventBridge$sendEvent$1(rememberPagerState, parcelableSnapshotMutableIntState, continuation2, 18);
                r0.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect((Composer) r0, valueOf, (Function2) rememberedValue5);
            Integer valueOf2 = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            boolean changed3 = r0.changed(rememberUpdatedState) | r0.changedInstance(list3);
            Object rememberedValue6 = r0.rememberedValue();
            if (changed3 || rememberedValue6 == obj) {
                continuation = null;
                animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(list3, rememberUpdatedState, parcelableSnapshotMutableIntState, continuation, 21);
                r0.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
            } else {
                animatedImageDecoder$wrapDrawable$2 = rememberedValue6;
                continuation = null;
            }
            Updater.LaunchedEffect(list3, valueOf2, (Function2) animatedImageDecoder$wrapDrawable$2, r0);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ?? r16 = continuation;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r0, 0);
            int hashCode = Long.hashCode(r0.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r0.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r0, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (r0.applier == null) {
                Updater.invalidApplier();
                throw r16;
            }
            r0.startReusableNode();
            if (r0.inserting) {
                r0.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r0.useNode();
            }
            Updater.m576setimpl(r0, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r0, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r0, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r0, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r0, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0) {
                r0.startReplaceGroup(1473671025);
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f);
                Colors colors = (Colors) r0.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    r15 = 0;
                    colors = re$$ExternalSyntheticOutline0.m((GapComposer) r0, -1762997026, (GapComposer) r0, false);
                } else {
                    r15 = 0;
                    r0.startReplaceGroup(-1762997739);
                    r0.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.surface.money.applet.background, ColorKt.RectangleShape), r0, r15);
                r0.end(r15);
            } else {
                r0.startReplaceGroup(1473857459);
                r0.end(false);
            }
            int intValue = parcelableSnapshotMutableIntState.getIntValue();
            boolean changedInstance2 = r0.changedInstance(coroutineScope) | r0.changed(rememberPagerState);
            Object rememberedValue7 = r0.rememberedValue();
            if (changedInstance2 || rememberedValue7 == obj) {
                rememberedValue7 = new UtilsKt$$ExternalSyntheticLambda0(6, coroutineScope, parcelableSnapshotMutableIntState, rememberPagerState);
                r0.updateRememberedValue(rememberedValue7);
            }
            LocalSegmentedTabs(list3, intValue, (Function1) rememberedValue7, r0, 0);
            PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), null, null, 0, RecyclerView.DECELERATION_RATE, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(2061981296, new OpenSourceKt$$ExternalSyntheticLambda7(1, function1, list3), r0), r0, 0, 24576, 16380);
            r0.end(true);
        } else {
            r0.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = r0.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda5(list, f, function1, function12, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* renamed from: TabContentView-gMrHQkA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1336TabContentViewgMrHQkA(Modifier modifier, final LocalHomeViewModel.TabContent tabContent, final Function1 function1, boolean z, boolean z2, boolean z3, boolean z4, float f, Function1 function12, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        final float f2;
        final Modifier modifier3;
        final boolean z8;
        final Function1 function13;
        final boolean z9;
        final boolean z10;
        RecomposeScopeImpl endRestartGroup;
        Function1 function14;
        boolean z11;
        String str;
        ToolbarConfig toolbarConfig;
        long j;
        Function1 function15;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier modifier4;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        float f3;
        boolean z12;
        TabToolbarInternalViewModel tabToolbarInternalViewModel;
        Object toolbarConfig2;
        tabContent.getClass();
        boolean z13 = tabContent.segmentedTabsEnabled;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1927913275);
        Applier applier = gapComposer.applier;
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(tabContent) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(z) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z5 = z2;
                i3 |= gapComposer.changed(z5) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i & 196608) == 0) {
                        i3 |= gapComposer.changed(z6) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    z7 = z4;
                } else {
                    z7 = z4;
                    if ((i & 1572864) == 0) {
                        i3 |= gapComposer.changed(z7) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i8 = i7;
                    i3 |= gapComposer.changed(f) ? 8388608 : 4194304;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i10 = i9;
                        i3 |= gapComposer.changedInstance(function12) ? 67108864 : 33554432;
                        if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (i11 != 0) {
                                modifier2 = companion;
                            }
                            boolean z14 = i12 != 0 ? true : z;
                            boolean z15 = i4 != 0 ? false : z5;
                            if (i5 != 0) {
                                z6 = true;
                            }
                            if (i6 != 0) {
                                z7 = true;
                            }
                            float f4 = i8 != 0 ? RecyclerView.DECELERATION_RATE : f;
                            Object obj = Composer.Companion.Empty;
                            if (i10 != 0) {
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (rememberedValue == obj) {
                                    rememberedValue = new Yoga$$ExternalSyntheticLambda0(24);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                function14 = (Function1) rememberedValue;
                            } else {
                                function14 = function12;
                            }
                            String stringResource = Room.stringResource(gapComposer, R.string.local_views_local);
                            z = z14;
                            String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_add_brands);
                            boolean z16 = z15;
                            Painter painter = Icons.NavigationDiscover.painter(gapComposer);
                            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer);
                            Function1 function16 = function14;
                            if (z && z16) {
                                gapComposer.startReplaceGroup(2133970052);
                                TabToolbarInternalViewModel tabToolbarInternalViewModel2 = tabContent.toolbarInternalModel;
                                z11 = z6;
                                boolean z17 = tabContent.addBrandsVisible;
                                boolean changed = gapComposer.changed(tabToolbarInternalViewModel2) | gapComposer.changed(z17) | gapComposer.changed(stringResource) | gapComposer.changed(stringResource2);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (changed || rememberedValue2 == obj) {
                                    TabToolbarInternalViewModel tabToolbarInternalViewModel3 = tabContent.toolbarInternalModel;
                                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                    if (z17) {
                                        tabToolbarInternalViewModel = tabToolbarInternalViewModel3;
                                        TabContentViewKt$$ExternalSyntheticLambda1 tabContentViewKt$$ExternalSyntheticLambda1 = new TabContentViewKt$$ExternalSyntheticLambda1(0, rememberUpdatedState);
                                        ToolbarConfig.Action.Background background = ToolbarConfig.Action.Background.Tonal;
                                        ToolbarConfig.Action action = new ToolbarConfig.Action(painter, stringResource2, tabContentViewKt$$ExternalSyntheticLambda1, null, 40);
                                        stringResource2 = stringResource2;
                                        createListBuilder.add(action);
                                    } else {
                                        tabToolbarInternalViewModel = tabToolbarInternalViewModel3;
                                        stringResource2 = stringResource2;
                                    }
                                    toolbarConfig2 = new ToolbarConfig(null, CollectionsKt__CollectionsJVMKt.build(createListBuilder), null, tabToolbarInternalViewModel, stringResource, new DateInputKt$$ExternalSyntheticLambda5(25, rememberUpdatedState), false, false, null, null, 965);
                                    str = stringResource;
                                    gapComposer.updateRememberedValue(toolbarConfig2);
                                } else {
                                    toolbarConfig2 = rememberedValue2;
                                    str = stringResource;
                                    stringResource2 = stringResource2;
                                }
                                toolbarConfig = (ToolbarConfig) toolbarConfig2;
                                gapComposer.end(false);
                            } else {
                                z11 = z6;
                                str = stringResource;
                                gapComposer.startReplaceGroup(2134677131);
                                gapComposer.end(false);
                                toolbarConfig = null;
                            }
                            gapComposer.startReplaceGroup(-1593701926);
                            Modifier testTag = TestTagKt.testTag(modifier2, "LocalHomeTestTag");
                            boolean z18 = z7;
                            long j2 = Strings.getColors(gapComposer).semantic.background.f1047app;
                            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(testTag, j2, rectangleShapeKt$RectangleShape$1);
                            if (z11) {
                                m177backgroundbw27NRU = m177backgroundbw27NRU.then(CashInsetsKt.inlineBottomNavigationPadding(gapComposer, companion));
                            }
                            gapComposer.end(false);
                            if (z13) {
                                gapComposer.startReplaceGroup(2134995377);
                                j = Strings.getColors(gapComposer).surface.money.applet.background;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(2135076504);
                                j = Strings.getColors(gapComposer).surface.money.background;
                                gapComposer.end(false);
                            }
                            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(m177backgroundbw27NRU, j, rectangleShapeKt$RectangleShape$1);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU2);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            ToolbarConfig toolbarConfig3 = toolbarConfig;
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer.useNode();
                            }
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
                            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
                            Integer valueOf = Integer.valueOf(hashCode);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$15);
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
                            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$16);
                            if (z) {
                                gapComposer.startReplaceGroup(333194102);
                                if (z16) {
                                    gapComposer.startReplaceGroup(333197667);
                                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                                    modifier4 = modifier2;
                                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                    function15 = function16;
                                    ChromeConfigKt.ChromeConfig(null, null, null, null, null, toolbarConfig3, null, gapComposer, PKIFailureInfo.transactionIdInUse, 95);
                                    gapComposer = gapComposer;
                                    TabToolbarsKt.SharedTabToolbarSpacer(0, 1, gapComposer, null);
                                    gapComposer.end(false);
                                    z12 = false;
                                    f3 = f4;
                                } else {
                                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                                    modifier4 = modifier2;
                                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                    float f5 = f4;
                                    gapComposer.startReplaceGroup(333333974);
                                    TabToolbarInternalViewModel tabToolbarInternalViewModel4 = tabContent.toolbarInternalModel;
                                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(402541063, new LocalViewFactory$$ExternalSyntheticLambda6(tabContent, function1, stringResource2, 15), gapComposer);
                                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(155452234, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 9), gapComposer);
                                    boolean z19 = (i3 & 896) == 256;
                                    Object rememberedValue3 = gapComposer.rememberedValue();
                                    if (z19 || rememberedValue3 == obj) {
                                        rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda1(5, function1);
                                        gapComposer.updateRememberedValue(rememberedValue3);
                                    }
                                    Function1 function17 = (Function1) rememberedValue3;
                                    f3 = f5;
                                    function15 = function16;
                                    TabToolbarsKt.TabToolbar(null, tabToolbarInternalViewModel4, null, false, null, rememberComposableLambda, rememberComposableLambda2, function17, null, null, null, null, false, gapComposer, 1769472, 0, 7965);
                                    gapComposer = gapComposer;
                                    z12 = false;
                                    gapComposer.end(false);
                                }
                                gapComposer.end(z12);
                            } else {
                                function15 = function16;
                                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                                modifier4 = modifier2;
                                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                                f3 = f4;
                                gapComposer.startReplaceGroup(334102247);
                                gapComposer.end(false);
                            }
                            Modifier layoutWeightElement = new LayoutWeightElement(1.0f, true);
                            if (!z13) {
                                layoutWeightElement = layoutWeightElement.then(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                            }
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$1, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$12);
                            boolean z20 = (i3 & 896) == 256;
                            Object rememberedValue4 = gapComposer.rememberedValue();
                            if (z20 || rememberedValue4 == obj) {
                                rememberedValue4 = new TabContentViewKt$$ExternalSyntheticLambda6(0, function1);
                                gapComposer.updateRememberedValue(rememberedValue4);
                            }
                            VisibleKt.PullToRefresh(((i3 >> 9) & 7168) | 196608, 4, gapComposer, Expect_jvmKt.rememberComposableLambda(1718508172, new TrackRowKt$$ExternalSyntheticLambda5(tabContent, f3, function1, function15), gapComposer), null, Room.stringResource(gapComposer, R.string.local_views_pull_to_refresh), (Function0) rememberedValue4, tabContent.isRefreshing, z18);
                            gapComposer.end(true);
                            gapComposer.end(true);
                            f2 = f3;
                            z8 = z18;
                            modifier3 = modifier4;
                            z9 = z11;
                            function13 = function15;
                            z10 = z16;
                        } else {
                            gapComposer.skipToGroupEnd();
                            f2 = f;
                            modifier3 = modifier2;
                            z8 = z7;
                            function13 = function12;
                            z9 = z6;
                            z10 = z5;
                        }
                        final boolean z21 = z;
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new Function2() { // from class: app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    LocalHomeViewKt.m1336TabContentViewgMrHQkA(Modifier.this, tabContent, function1, z21, z10, z9, z8, f2, function13, (Composer) obj2, Updater.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
                    }
                    final boolean z212 = z;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
                }
                final boolean z2122 = z;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z5 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            final boolean z21222 = z;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        final boolean z212222 = z;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void WalletWidgetContent(LocalHomeViewModel.TabContent.Widget widget, boolean z, Function1 function1, Composer composer, int i) {
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-765039412);
        int i2 = i | (gapComposer.changedInstance(widget) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.LocalCash) {
            gapComposer.startReplaceGroup(2102477717);
            LocalCashWidget((LocalHomeViewModel.TabContent.Widget.LocalCash) widget, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
            gapComposer.end(false);
        } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.LocalCashIncentive) {
            gapComposer.startReplaceGroup(2102580172);
            LocalCashIncentiveWidget((LocalHomeViewModel.TabContent.Widget.LocalCashIncentive) widget, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
            gapComposer.end(false);
        } else {
            boolean z3 = widget instanceof LocalHomeViewModel.TabContent.Widget.ActiveOrders;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z3) {
                gapComposer.startReplaceGroup(2102706590);
                List list = ((LocalHomeViewModel.TabContent.Widget.ActiveOrders) widget).orders;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) it.next()).displayMode == LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.InStoreOpenTabClosed) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(z2 ? 16.0f : -(WalletWidgetKt.WALLET_WIDGET_PADDING_TOP * 2.0f), true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(553776032);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder = (LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) list.get(i3);
                    if (activeOrder.displayMode == LocalHomeViewModel.TabContent.Widget.ActiveOrders.DisplayMode.InStoreOpenTabClosed || i3 == list.size() - 1) {
                        gapComposer.startReplaceGroup(-54964715);
                        ActiveOrderWidgetLarge(activeOrder, function1, gapComposer, (i2 >> 3) & 112);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-54873141);
                        m1334ActiveOrderWidgetuFdPcIQ(activeOrder, z2 ? RecyclerView.DECELERATION_RATE : WalletWidgetKt.WALLET_WIDGET_PADDING_TOP * 2.0f, function1, gapComposer, i2 & 896);
                        gapComposer.end(false);
                    }
                }
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
            } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.MarketingMessage) {
                gapComposer.startReplaceGroup(2103474894);
                MarketingMessageWidget((LocalHomeViewModel.TabContent.Widget.MarketingMessage) widget, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.PastOrders) {
                gapComposer.startReplaceGroup(2103575861);
                PastOrderWidget((LocalHomeViewModel.TabContent.Widget.PastOrders) widget, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            } else if (widget instanceof LocalHomeViewModel$TabContent$Widget$Portfolio$Followed) {
                gapComposer.startReplaceGroup(2103678006);
                FollowedWidget((LocalHomeViewModel$TabContent$Widget$Portfolio$Followed) widget, function1, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            } else {
                if (!(widget instanceof BrandCollectionModel)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -763461950, false);
                }
                gapComposer.startReplaceGroup(2103779097);
                boolean z4 = (i2 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z4 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LocalBrandCollectionWidget(VisibleKt.onVisible$default(companion, (Function0) rememberedValue), (BrandCollectionModel) widget, z, function1, gapComposer, (i2 << 3) & 8176);
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(widget, z, function1, i, 0);
        }
    }

    /* renamed from: WalletWidgetList-_UE9MAk, reason: not valid java name */
    public static final void m1337WalletWidgetList_UE9MAk(Modifier modifier, List list, float f, long j, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        GapComposer gapComposer;
        boolean z;
        String str;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1914887309);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i3 | (gapComposer2.changedInstance(list) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            f2 = f;
            i5 |= gapComposer2.changed(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        int i6 = i5 | (gapComposer2.changed(j) ? 2048 : 1024) | (gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            boolean changed = gapComposer2.changed(list);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                List<LocalHomeViewModel.TabContent.Widget> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (LocalHomeViewModel.TabContent.Widget widget : list2) {
                    if (widget instanceof LocalHomeViewModel.TabContent.Widget.LocalCash) {
                        str = "local_cash";
                    } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.LocalCashIncentive) {
                        str = "local_cash_incentive";
                    } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.ActiveOrders) {
                        str = "active_orders";
                    } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.MarketingMessage) {
                        str = "marketing_message";
                    } else if (widget instanceof LocalHomeViewModel.TabContent.Widget.PastOrders) {
                        str = "past_orders";
                    } else if (widget instanceof LocalHomeViewModel$TabContent$Widget$Portfolio$Followed) {
                        str = "followed";
                    } else {
                        if (!(widget instanceof BrandCollectionModel)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        str = "brand_collection";
                    }
                    arrayList.add(str);
                }
                Map eachCount = GroupingKt__GroupingJVMKt.eachCount(new CSSParser.Ruleset(arrayList));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int intValue = ((Number) linkedHashMap.getOrDefault(str2, 0)).intValue();
                    Iterator it2 = it;
                    linkedHashMap.put(str2, Integer.valueOf(intValue + 1));
                    Map map = eachCount;
                    if (((Number) MapsKt__MapsKt.getValue(eachCount, str2)).intValue() != 1 && intValue != 0) {
                        str2 = Boxes$$ExternalSyntheticOutline1.m(intValue, str2, "__dup_");
                    }
                    arrayList2.add(str2);
                    it = it2;
                    eachCount = map;
                }
                z = true;
                gapComposer2.updateRememberedValue(arrayList2);
                rememberedValue = arrayList2;
            } else {
                z = true;
            }
            List list3 = (List) rememberedValue;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier3, 1.0f);
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            boolean changedInstance = ((i6 & 7168) == 2048) | ((i6 & 896) == 256 ? z : false) | gapComposer2.changedInstance(list) | gapComposer2.changedInstance(list3) | ((57344 & i6) == 16384);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                TabContentViewKt$$ExternalSyntheticLambda9 tabContentViewKt$$ExternalSyntheticLambda9 = new TabContentViewKt$$ExternalSyntheticLambda9(f2, list, j, list3, function1);
                gapComposer2.updateRememberedValue(tabContentViewKt$$ExternalSyntheticLambda9);
                rememberedValue2 = tabContentViewKt$$ExternalSyntheticLambda9;
            }
            gapComposer = gapComposer2;
            LazyDslKt.LazyColumn(fillMaxSize, null, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, MLKEMEngine.KyberPolyBytes, 506);
            modifier2 = modifier3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda10(modifier2, list, f, j, function1, i, i2);
        }
    }
}
