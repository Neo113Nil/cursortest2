package com.squareup.cash.score.views;

import android.content.res.Configuration;
import android.webkit.WebView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfoKt;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.brand.orders.BrandPinsKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.billssubscriptions.viewmodels.model.CategoryFilter;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.ImageCarouselSection;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositExpiredBarcodeView;
import com.squareup.cash.deposits.physical.view.onboarding.PaperMoneyDepositOnboardingViewKt;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredViewModel;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.earnings.views.components.EarningsFilterBarKt;
import com.squareup.cash.family.requestsponsorship.viewmodels.SponsorSuggestionSection;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.music.views.TrackRowKt;
import com.squareup.cash.offers.viewmodels.itemviewmodels.PillViewModel;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.pools.viewmodels.PoolSection;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.text.CharsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScoreUiFactory$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ScoreUiFactory$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v24, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ColumnScope columnScope;
        Modifier.Companion companion;
        int i;
        int i2;
        boolean z;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Color m;
        long j;
        GapComposer gapComposer;
        int i3;
        int i4;
        String m2;
        String m3;
        Color m4;
        int i5 = this.$r8$classId;
        int i6 = 5;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        int i7 = 2;
        int i8 = 3;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        final int i9 = 1;
        final int i10 = 0;
        Object obj5 = this.f$0;
        switch (i5) {
            case 0:
                ScoreUiFactory scoreUiFactory = (ScoreUiFactory) obj5;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                function1.getClass();
                int i11 = (intValue & 6) == 0 ? intValue | ((intValue & 8) == 0 ? ((GapComposer) composer).changed(obj) : ((GapComposer) composer).changedInstance(obj) ? 4 : 2) : intValue;
                if ((intValue & 48) == 0) {
                    i11 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-283150740, new ScoreUiFactory$$ExternalSyntheticLambda1(0, obj, function1), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                SelectionManager selectionManager = (SelectionManager) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
                Offset offset = (Offset) obj3;
                SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0 = (SelectionAdjustment$Companion$$ExternalSyntheticLambda0) obj4;
                long mo838getSizeYbymL2g = layoutCoordinates.mo838getSizeYbymL2g();
                Rect rect = new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (int) (mo838getSizeYbymL2g >> 32), (int) (mo838getSizeYbymL2g & BodyPartID.bodyIdMax));
                boolean m448containsInclusiveUv8p0NA = SimpleLayoutKt.m448containsInclusiveUv8p0NA(offset.packedValue, rect);
                long j2 = offset.packedValue;
                if (!m448containsInclusiveUv8p0NA) {
                    j2 = MathUtilsKt.m394coerceIn3MmeM6k(j2, rect);
                }
                long m443convertToContainerCoordinatesR5De75A = selectionManager.m443convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
                if ((9223372034707292159L & m443convertToContainerCoordinatesR5De75A) != 9205357640488583168L) {
                    selectionManager.setInTouchMode(booleanValue);
                    selectionManager.previousSelectionLayout = null;
                    selectionManager.m444updateSelectionjyLRC_s$foundation(m443convertToContainerCoordinatesR5De75A, 9205357640488583168L, false, selectionAdjustment$Companion$$ExternalSyntheticLambda0);
                    FocusRequester.m605requestFocus3ESFkO8$default(selectionManager.focusRequester);
                    selectionManager.showToolbar = false;
                    selectionManager.updateSelectionToolbar();
                    selectionManager.isLongPressOrClickSelection = true;
                }
                return Unit.INSTANCE;
            case 2:
                LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder = (LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) obj5;
                int i12 = activeOrder.itemCount;
                ColumnScope columnScope2 = (ColumnScope) obj;
                Composer composer2 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                columnScope2.getClass();
                ((PaddingValues) obj2).getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(columnScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 131) != 130);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer3, 48);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    LocalImage localImage = activeOrder.brandImage;
                    if (localImage == null) {
                        gapComposer3.startReplaceGroup(662228239);
                        gapComposer3.end(false);
                        columnScope = columnScope2;
                        i2 = i12;
                        companion = companion3;
                        i = intValue2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                    } else {
                        gapComposer3.startReplaceGroup(662228240);
                        columnScope = columnScope2;
                        companion = companion3;
                        i = intValue2;
                        Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f, 20.0f);
                        LocalColor localColor = localImage.placeholder_color;
                        if (localColor == null) {
                            gapComposer3.startReplaceGroup(1890328253);
                            z = false;
                            gapComposer3.end(false);
                            i2 = i12;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                            m = null;
                        } else {
                            i2 = i12;
                            z = false;
                            gapComposer3.startReplaceGroup(1446451652);
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                            m = Recorder$$ExternalSyntheticOutline1.m(gapComposer3, false, LocalViewsKt.toComposeColor(localColor, gapComposer3, 0));
                        }
                        if (m == null) {
                            gapComposer3.startReplaceGroup(1446454170);
                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(z);
                            }
                            j = colors.semantic.background.subtle;
                            gapComposer3.end(z);
                        } else {
                            gapComposer3.startReplaceGroup(1446450946);
                            gapComposer3.end(z);
                            j = m.value;
                        }
                        Modifier m5 = Request$Priority$EnumUnboxingLocalUtility.m(4.0f, m287sizeVpY3zN4, j, 2.0f);
                        Float ratio = LocalViewsKt.getRatio(localImage);
                        LocalMapKt.LocalAsyncImage(m5, ratio != null ? OffsetKt.aspectRatio(ratio.floatValue(), companion, z) : companion, LocalViewsKt.getThemedUrl(localImage, gapComposer3), ContentScale.Companion.Fit, Alignment.Companion.Center, null, null, gapComposer3, 27648, 96);
                        gapComposer3.end(z);
                    }
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, rowScopeInstance.weight(1.0f, companion, true), Strings.getTypography(gapComposer3).labelSmall, (TextLineBalancing) null, activeOrder.brandName, (Map) null, (Function1) null, false);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    Painter painter = Icons.SubtlePush16.painter(gapComposer3);
                    long j3 = Strings.getColors(gapComposer3).semantic.icon.standard;
                    BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                    int i13 = Painter.$stable | 25008;
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.FillBounds;
                    ImageKt.Image(painter, null, m285size3ABfNKs, null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer3, i13, 40);
                    gapComposer3.end(true);
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 80.0f, RecyclerView.DECELERATION_RATE, 2);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer3, 48);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m279heightInVpY3zN4$default);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$1, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    boolean z2 = false;
                    LocalHomeViewKt.ActiveOrderDetails(rowScopeInstance.weight(1.0f, companion, true), activeOrder, gapComposer3, 0);
                    LocalImage localImage2 = activeOrder.itemImage;
                    if (localImage2 == null) {
                        gapComposer3.startReplaceGroup(572789971);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(572789972);
                        Modifier m6 = Request$Priority$EnumUnboxingLocalUtility.m(16.0f, SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 80.0f), Strings.getColors(gapComposer3).semantic.background.subtle, 10.0f);
                        int i14 = i2;
                        int min = Math.min(3, i14);
                        ArrayList arrayList = new ArrayList(min);
                        for (int i15 = 0; i15 < min; i15++) {
                            arrayList.add(localImage2);
                        }
                        LocalMapKt.LocalStackedImage(m6, arrayList, 0, LocalMapKt.m1323singleImageStackrAjV9yQ(i14, gapComposer3), contentScale$Companion$Fit$1, gapComposer3, 24576, 4);
                        z2 = false;
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                    OrderStatus orderStatus = activeOrder.orderStatus;
                    if (orderStatus == null) {
                        gapComposer3.startReplaceGroup(-134232586);
                        gapComposer3.end(z2);
                    } else {
                        gapComposer3.startReplaceGroup(-134232585);
                        BrandPinsKt.OrderStatusRow(columnScope, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), orderStatus, gapComposer3, (i & 14) | 48, 0);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ActivityItem activityItem = (ActivityItem) obj;
                int intValue3 = ((Integer) obj2).intValue();
                ((Integer) obj4).intValue();
                activityItem.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj3);
                gapComposer4.startReplaceGroup(314096966);
                ActivityItemPresenter rememberActivityItemPresenter = ((ActivityTabPresenter) obj5).rememberActivityItemPresenter(activityItem, ActivityItemOrigin.HISTORY, intValue3, gapComposer4);
                gapComposer4.end(false);
                return rememberActivityItemPresenter;
            case 4:
                ActivityItem activityItem2 = (ActivityItem) obj;
                int intValue4 = ((Integer) obj2).intValue();
                ((Integer) obj4).intValue();
                activityItem2.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj3);
                gapComposer5.startReplaceGroup(1467795942);
                ActivityItemPresenter rememberActivityItemPresenter2 = ((RealActivityEmbeddedPresenter) obj5).rememberActivityItemPresenter(activityItem2, intValue4, gapComposer5);
                gapComposer5.end(false);
                return rememberActivityItemPresenter2;
            case 5:
                ActivityFeedEntry.Header header = (ActivityFeedEntry.Header) obj5;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                ((Integer) obj2).getClass();
                Composer composer3 = (Composer) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer3).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer3;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 131) != 130)) {
                    Object rememberedValue = gapComposer6.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer6);
                    }
                    MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(fillMaxWidth2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f, 8.0f, 16.0f, 7.0f);
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, i9);
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer6, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, ValueInsets.onGloballyPositioned(m301paddingqDBjuR0, (Function1) rememberedValue2)), ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, header.title, (Map) null, (Function1) null, false);
                    ModalKt.HorizontalDivider(0, 0, gapComposer6, AlphaKt.alpha(companion2, ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue()));
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((AfterpaySearchViewModel.FilterPillViewModel) obj5).text, (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((CategoryFilter) obj5).displayName, (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 8:
                WebView webView = (WebView) obj5;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((WebViewBlockerViewModel.LoadUrl) obj2).getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj3);
                boolean changedInstance = gapComposer7.changedInstance(webView);
                Object rememberedValue3 = gapComposer7.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new RewardSlotQueries$$ExternalSyntheticLambda0(webView, i8);
                    gapComposer7.updateRememberedValue(rememberedValue3);
                }
                AndroidView_androidKt.AndroidView((Function1) rememberedValue3, fillMaxSize, null, gapComposer7, 48, 4);
                return Unit.INSTANCE;
            case 9:
                ImageCarouselSection imageCarouselSection = (ImageCarouselSection) obj5;
                int intValue6 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                GapComposer gapComposer8 = (GapComposer) composer4;
                ((DefaultSizes) gapComposer8.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier aspectRatio = OffsetKt.aspectRatio(imageCarouselSection.imageAspectRatio, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth3, 16.0f, RecyclerView.DECELERATION_RATE, 2), false);
                ((DefaultSizes) gapComposer8.consume(staticProvidableCompositionLocal)).getClass();
                Object obj6 = DefaultSizes.border.entries;
                AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme((Image) imageCarouselSection.images.get(intValue6), composer4), null, ClipKt.clip(aspectRatio, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), null, ContentScale.Companion.Crop, null, composer4, 1572912, 1976);
                return Unit.INSTANCE;
            case 10:
                PaperMoneyDepositExpiredBarcodeView paperMoneyDepositExpiredBarcodeView = (PaperMoneyDepositExpiredBarcodeView) obj5;
                PaperMoneyDepositBarcodeExpiredViewModel paperMoneyDepositBarcodeExpiredViewModel = (PaperMoneyDepositBarcodeExpiredViewModel) obj2;
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                if (!(paperMoneyDepositBarcodeExpiredViewModel instanceof PaperMoneyDepositBarcodeExpiredViewModel.Expired)) {
                    return Unit.INSTANCE;
                }
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                GapComposer gapComposer9 = (GapComposer) composer5;
                boolean changedInstance2 = gapComposer9.changedInstance(paperMoneyDepositExpiredBarcodeView);
                Object rememberedValue4 = gapComposer9.rememberedValue();
                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new RecipientQueries$$ExternalSyntheticLambda0(paperMoneyDepositExpiredBarcodeView, 12);
                    gapComposer9.updateRememberedValue(rememberedValue4);
                }
                Function1 function12 = (Function1) rememberedValue4;
                boolean changedInstance3 = gapComposer9.changedInstance(paperMoneyDepositExpiredBarcodeView) | gapComposer9.changedInstance(paperMoneyDepositBarcodeExpiredViewModel);
                Object rememberedValue5 = gapComposer9.rememberedValue();
                if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new ProfileQueries$$ExternalSyntheticLambda13(15, paperMoneyDepositExpiredBarcodeView, paperMoneyDepositBarcodeExpiredViewModel);
                    gapComposer9.updateRememberedValue(rememberedValue5);
                }
                AndroidView_androidKt.AndroidView(function12, fillMaxSize2, (Function1) rememberedValue5, gapComposer9, 48, 0);
                return Unit.INSTANCE;
            case 11:
                int intValue7 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                PaperMoneyDepositOnboardingViewKt.OnboardingPage((PaperCashDepositBlocker.TutorialCarousel.Page) ((PaperMoneyDepositOnboardingViewModel) obj5).pages.get(intValue7), null, (Composer) obj3, 0);
                return Unit.INSTANCE;
            case 12:
                DateFilter dateFilter = (DateFilter) obj5;
                Composer composer6 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                if (dateFilter instanceof DateFilter.Monthly) {
                    GapComposer gapComposer10 = (GapComposer) composer6;
                    gapComposer10.startReplaceGroup(-1771640561);
                    gapComposer10.end(false);
                    DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter;
                    m2 = YearMonth.of(monthly.year, monthly.month).format(EarningsFilterBarKt.abbreviatedMonthFormatter);
                    m2.getClass();
                } else {
                    if (dateFilter instanceof DateFilter.Yearly) {
                        gapComposer = (GapComposer) composer6;
                        i3 = R.string.earnings_filter_bar_year_to_date;
                        i4 = -1771638540;
                    } else {
                        if (!(dateFilter instanceof DateFilter.AllTime)) {
                            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer6, -1771643187, false);
                        }
                        gapComposer = (GapComposer) composer6;
                        i3 = R.string.date_filter_bar_all_time;
                        i4 = -1771635348;
                    }
                    m2 = re$$ExternalSyntheticOutline0.m(gapComposer, i4, i3, gapComposer, false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, composer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, m2, (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 13:
                SponsorSuggestionSection sponsorSuggestionSection = (SponsorSuggestionSection) obj5;
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                ((Integer) obj2).getClass();
                Composer composer7 = (Composer) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                lazyItemScopeImpl2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer7).changed(lazyItemScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer7;
                if (gapComposer11.shouldExecute(intValue8 & 1, (intValue8 & 131) != 130)) {
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(fillMaxWidth4, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f, 12.0f);
                    gapComposer11.startReplaceGroup(846963359);
                    Locale locale = ((Configuration) gapComposer11.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).getLocales().get(0);
                    String m7 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, sponsorSuggestionSection.header, locale);
                    if (m7.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        char charAt = m7.charAt(0);
                        sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.titlecase(charAt, locale) : String.valueOf(charAt)));
                        sb.append(m7.substring(1));
                        m7 = sb.toString();
                    }
                    gapComposer11.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer11, m299paddingVpY3zN4, ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, m7, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                final InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header header2 = (InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header) obj5;
                ((Integer) obj2).getClass();
                Composer composer8 = (Composer) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer8;
                if (gapComposer12.shouldExecute(intValue9 & 1, (intValue9 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    if (header2 instanceof InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard) {
                        gapComposer12.startReplaceGroup(959487958);
                        Colors colors4 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                        } else {
                            gapComposer12.startReplaceGroup(-1762997739);
                            gapComposer12.end(false);
                        }
                        ViewfinderDefaults.SectionHeader(((InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard) header2).title, ImageKt.m177backgroundbw27NRU(companion2, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), (String) null, (Function0) null, (String) null, gapComposer12, 0, 28);
                        gapComposer12.end(false);
                    } else {
                        if (!(header2 instanceof InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, -384692593, false);
                        }
                        gapComposer12.startReplaceGroup(959771608);
                        Colors colors5 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                        if (colors5 == null) {
                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                        } else {
                            gapComposer12.startReplaceGroup(-1762997739);
                            gapComposer12.end(false);
                        }
                        ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-1778319816, new Function2() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                int i16 = i10;
                                InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header header3 = header2;
                                switch (i16) {
                                    case 0:
                                        Composer composer9 = (Composer) obj7;
                                        int intValue10 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer9;
                                        boolean shouldExecute2 = gapComposer13.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2);
                                        Applier applier2 = gapComposer13.applier;
                                        if (shouldExecute2) {
                                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer13, 0);
                                            int hashCode3 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer13.currentCompositionLocalScope();
                                            Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer13, companion4);
                                            ComposeUiNode.Companion.getClass();
                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                            if (applier2 == null) {
                                                Updater.invalidApplier();
                                                throw null;
                                            }
                                            gapComposer13.startReusableNode();
                                            if (gapComposer13.inserting) {
                                                gapComposer13.createNode(layoutNode$Companion$Constructor$12);
                                            } else {
                                                gapComposer13.useNode();
                                            }
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
                                            Updater.m576setimpl(gapComposer13, columnMeasurePolicy, composeUiNode$Companion$SetModifier$16);
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                            Updater.m576setimpl(gapComposer13, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$17);
                                            Integer valueOf2 = Integer.valueOf(hashCode3);
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                            Updater.m576setimpl(gapComposer13, valueOf2, composeUiNode$Companion$SetModifier$18);
                                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                            Updater.m575reconcileimpl(gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
                                            Updater.m576setimpl(gapComposer13, materializeModifier3, composeUiNode$Companion$SetModifier$19);
                                            Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion4, 1.0f);
                                            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer13, 0);
                                            int hashCode4 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer13.currentCompositionLocalScope();
                                            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer13, fillMaxWidth5);
                                            gapComposer13.startReusableNode();
                                            if (gapComposer13.inserting) {
                                                gapComposer13.createNode(layoutNode$Companion$Constructor$12);
                                            } else {
                                                gapComposer13.useNode();
                                            }
                                            Updater.m576setimpl(gapComposer13, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$16);
                                            Updater.m576setimpl(gapComposer13, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$17);
                                            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer13, composeUiNode$Companion$SetModifier$18, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                            Updater.m576setimpl(gapComposer13, materializeModifier4, composeUiNode$Companion$SetModifier$19);
                                            InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected selected = (InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected) header3;
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer13, (Modifier) new LayoutWeightElement(1.0f, true), (TextStyle) null, (TextLineBalancing) null, selected.title, (Map) null, (Function1) null, false);
                                            String str = selected.count;
                                            Colors colors6 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                                            if (colors6 == null) {
                                                colors6 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                                            } else {
                                                gapComposer13.startReplaceGroup(-1762997739);
                                                gapComposer13.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors6.semantic.text.subtle, (Composer) gapComposer13, (Modifier) null, ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            gapComposer13.end(true);
                                            gapComposer13.end(true);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Composer composer10 = (Composer) obj7;
                                        int intValue11 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer14 = (GapComposer) composer10;
                                        if (gapComposer14.shouldExecute(1 & intValue11, (intValue11 & 3) != 2)) {
                                            String str2 = ((InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected) header3).subtitle;
                                            if (str2 == null) {
                                                gapComposer14.startReplaceGroup(-688193874);
                                            } else {
                                                gapComposer14.startReplaceGroup(-688193873);
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            }
                                            gapComposer14.end(false);
                                        } else {
                                            gapComposer14.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, gapComposer12), ImageKt.m177backgroundbw27NRU(companion2, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), (Function2) null, (Function0) null, Expect_jvmKt.rememberComposableLambda(1194857532, new Function2() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                int i16 = i9;
                                InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header header3 = header2;
                                switch (i16) {
                                    case 0:
                                        Composer composer9 = (Composer) obj7;
                                        int intValue10 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer9;
                                        boolean shouldExecute2 = gapComposer13.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2);
                                        Applier applier2 = gapComposer13.applier;
                                        if (shouldExecute2) {
                                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer13, 0);
                                            int hashCode3 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer13.currentCompositionLocalScope();
                                            Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer13, companion4);
                                            ComposeUiNode.Companion.getClass();
                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                            if (applier2 == null) {
                                                Updater.invalidApplier();
                                                throw null;
                                            }
                                            gapComposer13.startReusableNode();
                                            if (gapComposer13.inserting) {
                                                gapComposer13.createNode(layoutNode$Companion$Constructor$12);
                                            } else {
                                                gapComposer13.useNode();
                                            }
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
                                            Updater.m576setimpl(gapComposer13, columnMeasurePolicy, composeUiNode$Companion$SetModifier$16);
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                            Updater.m576setimpl(gapComposer13, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$17);
                                            Integer valueOf2 = Integer.valueOf(hashCode3);
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                            Updater.m576setimpl(gapComposer13, valueOf2, composeUiNode$Companion$SetModifier$18);
                                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                            Updater.m575reconcileimpl(gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
                                            Updater.m576setimpl(gapComposer13, materializeModifier3, composeUiNode$Companion$SetModifier$19);
                                            Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion4, 1.0f);
                                            RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer13, 0);
                                            int hashCode4 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer13.currentCompositionLocalScope();
                                            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer13, fillMaxWidth5);
                                            gapComposer13.startReusableNode();
                                            if (gapComposer13.inserting) {
                                                gapComposer13.createNode(layoutNode$Companion$Constructor$12);
                                            } else {
                                                gapComposer13.useNode();
                                            }
                                            Updater.m576setimpl(gapComposer13, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$16);
                                            Updater.m576setimpl(gapComposer13, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$17);
                                            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer13, composeUiNode$Companion$SetModifier$18, gapComposer13, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                            Updater.m576setimpl(gapComposer13, materializeModifier4, composeUiNode$Companion$SetModifier$19);
                                            InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected selected = (InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected) header3;
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer13, (Modifier) new LayoutWeightElement(1.0f, true), (TextStyle) null, (TextLineBalancing) null, selected.title, (Map) null, (Function1) null, false);
                                            String str = selected.count;
                                            Colors colors6 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                                            if (colors6 == null) {
                                                colors6 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                                            } else {
                                                gapComposer13.startReplaceGroup(-1762997739);
                                                gapComposer13.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors6.semantic.text.subtle, (Composer) gapComposer13, (Modifier) null, ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            gapComposer13.end(true);
                                            gapComposer13.end(true);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Composer composer10 = (Composer) obj7;
                                        int intValue11 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer14 = (GapComposer) composer10;
                                        if (gapComposer14.shouldExecute(1 & intValue11, (intValue11 & 3) != 2)) {
                                            String str2 = ((InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected) header3).subtitle;
                                            if (str2 == null) {
                                                gapComposer14.startReplaceGroup(-688193874);
                                            } else {
                                                gapComposer14.startReplaceGroup(-688193873);
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            }
                                            gapComposer14.end(false);
                                        } else {
                                            gapComposer14.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, gapComposer12), gapComposer12, 24582, 12);
                        gapComposer12.end(false);
                    }
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer12, null);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                MusicViewModel musicViewModel = (MusicViewModel) obj;
                Function1 function13 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                musicViewModel.getClass();
                function13.getClass();
                TrackRowKt.MusicView(((ScoreUiFactory) obj5).imageLoader, musicViewModel, function13, null, (Composer) obj3, (intValue10 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((PillViewModel) obj5).text, (Map) null, (Function1) null, false);
                return Unit.INSTANCE;
            case 17:
                List list = (List) obj5;
                int intValue11 = ((Integer) obj2).intValue();
                Composer composer9 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion2, 1.0f);
                Background background = (Background) CollectionsKt.getOrNull(intValue11, list);
                Image image = background != null ? background.fullSize : null;
                if (image == null) {
                    GapComposer gapComposer13 = (GapComposer) composer9;
                    gapComposer13.startReplaceGroup(1910453321);
                    gapComposer13.end(false);
                    m3 = null;
                } else {
                    GapComposer gapComposer14 = (GapComposer) composer9;
                    m3 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer14, 1724195512, image, gapComposer14, false);
                }
                if (m3 == null) {
                    m3 = "";
                }
                String str = m3;
                Background background2 = (Background) CollectionsKt.getOrNull(intValue11, list);
                com.squareup.protos.cash.ui.Color color = background2 != null ? background2.color : null;
                if (color == null) {
                    GapComposer gapComposer15 = (GapComposer) composer9;
                    gapComposer15.startReplaceGroup(1910537548);
                    gapComposer15.end(false);
                    m4 = null;
                } else {
                    GapComposer gapComposer16 = (GapComposer) composer9;
                    m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer16, 1724198229, color, gapComposer16, false);
                }
                long j4 = m4 != null ? m4.value : Color.Black;
                Background background3 = (Background) CollectionsKt.getOrNull(intValue11, list);
                List list2 = background3 != null ? background3.effects : null;
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                com.squareup.cash.payments.views.personalization.AlphaKt.m3714PersonalizePaymentBackgroundcf5BqRc(fillMaxSize3, str, j4, list2, composer9, 6);
                return Unit.INSTANCE;
            case 18:
                PoolListSection poolListSection = (PoolListSection) obj5;
                ((Integer) obj2).getClass();
                Composer composer10 = (Composer) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer10;
                if (gapComposer17.shouldExecute(intValue12 & 1, (intValue12 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    Colors colors6 = (Colors) gapComposer17.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer17, -1762997026, gapComposer17, false);
                    } else {
                        gapComposer17.startReplaceGroup(-1762997739);
                        gapComposer17.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion2, colors6.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Object rememberedValue6 = gapComposer17.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new PoolsListViewKt$$ExternalSyntheticLambda6(i7);
                        gapComposer17.updateRememberedValue(rememberedValue6);
                    }
                    ViewfinderDefaults.SectionHeader(poolListSection.name, SemanticsModifierKt.semantics(m177backgroundbw27NRU, false, (Function1) rememberedValue6), (String) null, (Function0) null, (String) null, gapComposer17, 0, 28);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                PoolSection poolSection = (PoolSection) obj5;
                ((Integer) obj2).getClass();
                Composer composer11 = (Composer) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer11;
                if (gapComposer18.shouldExecute(intValue13 & 1, (intValue13 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    Colors colors7 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                    } else {
                        gapComposer18.startReplaceGroup(-1762997739);
                        gapComposer18.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(companion2, colors7.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Object rememberedValue7 = gapComposer18.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new PoolsListViewKt$$ExternalSyntheticLambda6(i6);
                        gapComposer18.updateRememberedValue(rememberedValue7);
                    }
                    ViewfinderDefaults.SectionHeader(poolSection.title, SemanticsModifierKt.semantics(m177backgroundbw27NRU2, false, (Function1) rememberedValue7), (String) null, (Function0) null, (String) null, gapComposer18, 0, 28);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                int intValue14 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                TableInfoKt.NullStateCarouselPage((NullStateCarouselViewModel.Content.Page) ((NullStateCarouselViewModel.Content) obj5).pages.get(intValue14), (Composer) obj3, 0);
                return Unit.INSTANCE;
            default:
                int intValue15 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                zzrl.NullStateUiGroupContent((UiGroupViewModel) ((NullStateViewModel$SwipeViewModel$Content) obj5).pages.get(intValue15), null, (Composer) obj3, 0);
                return Unit.INSTANCE;
        }
    }
}
