package com.squareup.cash.directory_ui.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeableState$animateInternalToOffset$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.arcade.values.timeline.ArcadeTimeline2Item;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ImageDrawable;
import coil3.RealImageLoader;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanv;
import com.google.android.gms.internal.mlkit_vision_common.zzb;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ArcadeTimeline2Binding;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.CardState;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.VerifyCardViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.views.BorrowHomeKt;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.card.onboarding.CardStudioViewKt$ThemedCard$1$4$1;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.card.onboarding.CardStyleItemViewKt;
import com.squareup.cash.card.onboarding.CardStyleItemViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$4$1;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.CardStyleSectionViewModel;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.DisclosureView$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.GlitterCardEffectKt;
import com.squareup.cash.card.onboarding.GlitterDrawable;
import com.squareup.cash.card.onboarding.ListIndices;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.StylePickerToPreviewKey;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.cashapppay.views.LegacyGrantSheetKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt;
import com.squareup.cash.deposits.physical.view.onboarding.PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda7;
import com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt;
import com.squareup.cash.earnings.views.payers.PresentationStyle;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.ScanningStarLayout;
import com.squareup.cash.formview.components.arcade.ArcadeFormCellDefaultElementKt;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$2$1;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.Strings;
import com.squareup.util.android.StringsKt;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.CellDefault;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class SectionKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ SectionKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$CardStylePickerViewKt$$ExternalSyntheticLambda14(Object obj, Object obj2, Object obj3) {
        CardStyleItemViewModel cardStyleItemViewModel = (CardStyleItemViewModel) this.f$0;
        CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            boolean changedInstance = gapComposer.changedInstance(cardStylePickerViewModel) | gapComposer.changedInstance(cardStyleItemViewModel) | gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CopyCodeKt$$ExternalSyntheticLambda4(cardStylePickerViewModel, cardStyleItemViewModel, function1, 24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CardStyleItemViewKt.CardStyleItem(fillMaxWidth, cardStyleItemViewModel, (Function0) rememberedValue, gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.animation.SharedTransitionScope, app.cash.broadway.ui.compose.UiScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [androidx.compose.animation.core.FiniteAnimationSpec] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r4v31, types: [androidx.compose.runtime.GapComposer] */
    private final Object invoke$com$squareup$cash$card$onboarding$CardStylePickerViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        LazyListState lazyListState;
        Function1 function1;
        Object obj4;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        int i;
        MutableState mutableState4;
        Modifier.Companion companion;
        int i2;
        CardStylePickerViewModel cardStylePickerViewModel;
        AnimatedVisibilityScope animatedVisibilityScope;
        int i3;
        Object bufferCountKt$bufferSkip$1;
        Modifier.Companion companion2;
        int i4;
        MutableState mutableState5;
        MutableState mutableState6;
        Continuation continuation;
        Object realClientRouteRouter$route$1;
        ?? r12;
        Object obj5;
        CardStylePickerViewModel cardStylePickerViewModel2;
        Function1 function12;
        LazyListState lazyListState2 = (LazyListState) this.f$0;
        Function1 function13 = (Function1) this.f$1;
        CardStylePickerViewModel cardStylePickerViewModel3 = (CardStylePickerViewModel) this.f$2;
        ?? r10 = (UiScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        r10.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(r10) ? 4 : 2;
        }
        int i5 = 0;
        ?? r1 = (GapComposer) composer;
        if (r1.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            Colors colors = (Colors) r1.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m((GapComposer) r1, -1762997026, (GapComposer) r1, false);
            } else {
                r1.startReplaceGroup(-1762997739);
                r1.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r1, 0);
            int hashCode = Long.hashCode(r1.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r1.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r1, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (r1.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r1.startReusableNode();
            if (r1.inserting) {
                r1.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r1.useNode();
            }
            Updater.m576setimpl(r1, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r1, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r1, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r1, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r1, materializeModifier, ComposeUiNode.Companion.SetModifier);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, r1);
            ((DefaultSizes) r1.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(16.0f, r1);
            boolean changed = r1.changed(m3477toPx8Feqmps);
            Object rememberedValue = r1.rememberedValue();
            Object obj6 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj6) {
                rememberedValue = Updater.derivedStateOf(new CardStylePickerViewKt$$ExternalSyntheticLambda9(lazyListState2, m3477toPx8Feqmps, i5));
                r1.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            NavigationType navigationType = NavigationType.CLOSE;
            Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(r10, companion3, r10.rememberSharedContentState(StylePickerToPreviewKey.TitleBar, r1, ((intValue << 3) & 112) | 6), r10, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-150859355, new BulletinTileKt$$ExternalSyntheticLambda2(24, state, cardStylePickerViewModel3), r1);
            boolean changed2 = r1.changed(function13);
            Object rememberedValue2 = r1.rememberedValue();
            if (changed2 || rememberedValue2 == obj6) {
                rememberedValue2 = new DisclosureView$$ExternalSyntheticLambda1(24, function13);
                r1.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, sharedBounds$default, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, (Composer) r1, 54, 104);
            ArrayList arrayList = cardStylePickerViewModel3.headers;
            ArrayList arrayList2 = cardStylePickerViewModel3.sections;
            boolean isEmpty = arrayList.isEmpty();
            int i6 = !isEmpty ? 3 : 1;
            boolean changed3 = r1.changed(i6) | r1.changed(arrayList2);
            Object rememberedValue3 = r1.rememberedValue();
            if (changed3 || rememberedValue3 == obj6) {
                ArrayList arrayList3 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i7 = 0;
                int i8 = i6;
                for (Object obj7 : arrayList2) {
                    int i9 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CardStyleSectionViewModel cardStyleSectionViewModel = (CardStyleSectionViewModel) obj7;
                    int i10 = cardStyleSectionViewModel.header != null ? i8 + 1 : i8;
                    Iterator it = cardStyleSectionViewModel.cards.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        int i13 = i10;
                        Iterator it2 = it;
                        Integer valueOf = Integer.valueOf(i13 + 1);
                        String str = ((CardStyleItemViewModel) next).card.theme.token;
                        str.getClass();
                        linkedHashMap.put(valueOf, str);
                        i10 = i13 + 2;
                        i11 = i12;
                        it = it2;
                    }
                    int i14 = i10 + 1;
                    arrayList3.add(RangesKt___RangesKt.until(i8, i14));
                    i8 = i14;
                    i7 = i9;
                }
                ListIndices listIndices = new ListIndices(arrayList3, linkedHashMap);
                r1.updateRememberedValue(listIndices);
                rememberedValue3 = listIndices;
            }
            ListIndices listIndices2 = (ListIndices) rememberedValue3;
            Object[] objArr = new Object[0];
            Object rememberedValue4 = r1.rememberedValue();
            if (rememberedValue4 == obj6) {
                rememberedValue4 = new CardScene$$ExternalSyntheticLambda1(6);
                r1.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState7 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue4, r1, 48);
            Object rememberedValue5 = r1.rememberedValue();
            if (rememberedValue5 == obj6) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                r1.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState8 = (MutableState) rememberedValue5;
            boolean changed4 = r1.changed(mutableState7) | r1.changedInstance(listIndices2) | r1.changed(lazyListState2);
            Object rememberedValue6 = r1.rememberedValue();
            if (changed4 || rememberedValue6 == obj6) {
                lazyListState = rememberLazyListState;
                function1 = function13;
                obj4 = obj6;
                rememberedValue6 = new RealBoostSelector$removeBoost$1(mutableState7, listIndices2, lazyListState2, mutableState8, null, 24);
                mutableState = mutableState7;
                lazyListState2 = lazyListState2;
                mutableState2 = mutableState8;
                r1.updateRememberedValue(rememberedValue6);
            } else {
                lazyListState = rememberLazyListState;
                function1 = function13;
                mutableState = mutableState7;
                obj4 = obj6;
                mutableState2 = mutableState8;
            }
            Updater.LaunchedEffect((Composer) r1, mutableState, (Function2) rememberedValue6);
            int m3477toPx8Feqmps2 = (int) DensityUtilsKt.m3477toPx8Feqmps(((Configuration) r1.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp, r1);
            int m3477toPx8Feqmps3 = (int) DensityUtilsKt.m3477toPx8Feqmps(24.0f, r1);
            int m3477toPx8Feqmps4 = m3477toPx8Feqmps2 - ((int) DensityUtilsKt.m3477toPx8Feqmps(24.0f, r1));
            if (isEmpty) {
                mutableState3 = mutableState2;
                i = 48;
                mutableState4 = mutableState;
                companion = companion3;
                i2 = i6;
                cardStylePickerViewModel = cardStylePickerViewModel3;
                animatedVisibilityScope = r10;
                i3 = 0;
                r1.startReplaceGroup(-2144676361);
                r1.end(false);
            } else {
                r1.startReplaceGroup(-2146876090);
                boolean changed5 = r1.changed(mutableState) | r1.changed(lazyListState) | r1.changedInstance(cardStylePickerViewModel3) | r1.changed(m3477toPx8Feqmps3) | r1.changed(m3477toPx8Feqmps4);
                Object rememberedValue7 = r1.rememberedValue();
                if (changed5 || rememberedValue7 == obj4) {
                    mutableState3 = mutableState2;
                    i = 48;
                    animatedVisibilityScope = r10;
                    LazyListState lazyListState3 = lazyListState;
                    companion = companion3;
                    MutableState mutableState9 = mutableState;
                    i2 = i6;
                    CardStylePickerViewKt$CardStylePicker$1$1$1$4$1 cardStylePickerViewKt$CardStylePicker$1$1$1$4$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$4$1(mutableState9, mutableState3, lazyListState3, m3477toPx8Feqmps3, m3477toPx8Feqmps4, cardStylePickerViewModel3, null);
                    mutableState4 = mutableState9;
                    lazyListState = lazyListState3;
                    cardStylePickerViewModel = cardStylePickerViewModel3;
                    r1.updateRememberedValue(cardStylePickerViewKt$CardStylePicker$1$1$1$4$1);
                    rememberedValue7 = cardStylePickerViewKt$CardStylePicker$1$1$1$4$1;
                } else {
                    mutableState3 = mutableState2;
                    i = 48;
                    mutableState4 = mutableState;
                    companion = companion3;
                    i2 = i6;
                    cardStylePickerViewModel = cardStylePickerViewModel3;
                    animatedVisibilityScope = r10;
                }
                Updater.LaunchedEffect((Composer) r1, mutableState4, (Function2) rememberedValue7);
                i3 = 0;
                r1.end(false);
            }
            boolean changed6 = r1.changed(lazyListState2) | r1.changed(i2) | r1.changed(mutableState4) | r1.changedInstance(listIndices2);
            Object rememberedValue8 = r1.rememberedValue();
            if (changed6 || rememberedValue8 == obj4) {
                companion2 = companion;
                MutableState mutableState10 = mutableState4;
                int i15 = i2;
                MutableState mutableState11 = mutableState3;
                i4 = i;
                bufferCountKt$bufferSkip$1 = new BufferCountKt$bufferSkip$1(lazyListState2, i15, mutableState11, mutableState10, listIndices2, (Continuation) null);
                mutableState5 = mutableState11;
                mutableState6 = mutableState10;
                i2 = i15;
                listIndices2 = listIndices2;
                r1.updateRememberedValue(bufferCountKt$bufferSkip$1);
            } else {
                companion2 = companion;
                bufferCountKt$bufferSkip$1 = rememberedValue8;
                mutableState6 = mutableState4;
                mutableState5 = mutableState3;
                i4 = i;
            }
            Updater.LaunchedEffect((Composer) r1, lazyListState2, (Function2) bufferCountKt$bufferSkip$1);
            Object rememberedValue9 = r1.rememberedValue();
            if (rememberedValue9 == obj4) {
                rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
                r1.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState12 = (MutableState) rememberedValue9;
            boolean changed7 = r1.changed(lazyListState2);
            Object rememberedValue10 = r1.rememberedValue();
            if (changed7 || rememberedValue10 == obj4) {
                continuation = null;
                rememberedValue10 = new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState2, mutableState12, continuation, 2);
                r1.updateRememberedValue(rememberedValue10);
            } else {
                continuation = null;
            }
            Updater.LaunchedEffect((Composer) r1, lazyListState2, (Function2) rememberedValue10);
            Object[] objArr2 = new Object[i3];
            Object rememberedValue11 = r1.rememberedValue();
            if (rememberedValue11 == obj4) {
                rememberedValue11 = new CardScene$$ExternalSyntheticLambda1(7);
                r1.updateRememberedValue(rememberedValue11);
            }
            Set set = (Set) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue11, r1, i4);
            Function1 function14 = function1;
            boolean changed8 = r1.changed(lazyListState2) | r1.changedInstance(listIndices2) | r1.changed(i2) | r1.changedInstance(set) | r1.changedInstance(cardStylePickerViewModel) | r1.changed(function14);
            Object rememberedValue12 = r1.rememberedValue();
            if (changed8 || rememberedValue12 == obj4) {
                r12 = continuation;
                CardStylePickerViewModel cardStylePickerViewModel4 = cardStylePickerViewModel;
                obj5 = obj4;
                realClientRouteRouter$route$1 = new RealClientRouteRouter$route$1(lazyListState2, listIndices2, mutableState12, i2, set, cardStylePickerViewModel4, function14, null);
                cardStylePickerViewModel2 = cardStylePickerViewModel4;
                function12 = function14;
                r1.updateRememberedValue(realClientRouteRouter$route$1);
            } else {
                cardStylePickerViewModel2 = cardStylePickerViewModel;
                realClientRouteRouter$route$1 = rememberedValue12;
                r12 = continuation;
                obj5 = obj4;
                function12 = function14;
            }
            Updater.LaunchedEffect((Composer) r1, lazyListState2, (Function2) realClientRouteRouter$route$1);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(Arrangement$End$1.current(r1).navigationBars, r1);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
            EnterTransitionImpl enterTransitionImpl = EnterTransitionImpl.None;
            Object rememberedValue13 = r1.rememberedValue();
            if (rememberedValue13 == obj5) {
                rememberedValue13 = new CalendarRowKt$$ExternalSyntheticLambda10(17);
                r1.updateRememberedValue(rememberedValue13);
            }
            Modifier animateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, fillMaxWidth2, enterTransitionImpl, EnterExitTransitionKt.slideOutVertically$default(1, (Function1) rememberedValue13).plus(EnterExitTransitionKt.fadeOut$default(r12, 3)), 4);
            boolean z = !((Boolean) mutableState5.getValue()).booleanValue();
            boolean changedInstance = r1.changedInstance(cardStylePickerViewModel2) | r1.changed(lazyListState) | r1.changed(mutableState6) | r1.changed(function12);
            Object rememberedValue14 = r1.rememberedValue();
            if (changedInstance || rememberedValue14 == obj5) {
                BankingConfigQueries$$ExternalSyntheticLambda0 bankingConfigQueries$$ExternalSyntheticLambda0 = new BankingConfigQueries$$ExternalSyntheticLambda0(cardStylePickerViewModel2, lazyListState, mutableState6, function12, 3);
                r1.updateRememberedValue(bankingConfigQueries$$ExternalSyntheticLambda0);
                rememberedValue14 = bankingConfigQueries$$ExternalSyntheticLambda0;
            }
            LazyDslKt.LazyColumn(animateEnterExit$default, lazyListState2, asPaddingValues, null, null, null, z, null, (Function1) rememberedValue14, r1, 0, 376);
            r1.end(true);
        } else {
            r1.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$onboarding$PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda32(Object obj, Object obj2, Object obj3) {
        ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        if (productDetailsPageViewModel == null) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-389034209);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-389034208);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashCardKt$$ExternalSyntheticLambda0(24, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            HeroSectionKt.ProductDetailsPageOverlay(productDetailsPageViewModel, function1, null, (Function1) rememberedValue, gapComposer2, 3072);
            gapComposer2.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$cashapppay$views$LegacyGrantSheetKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$0;
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) this.f$1;
        UiContainerKt$BottomSheet$1$sheetScope$1 uiContainerKt$BottomSheet$1$sheetScope$1 = (UiContainerKt$BottomSheet$1$sheetScope$1) this.f$2;
        GrantViewModel grantViewModel = (GrantViewModel) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        grantViewModel.getClass();
        boolean z = grantViewModel instanceof GrantViewModel.OnDisplayInterstitial;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-67612853);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion, ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            String str = ((GrantViewModel.OnDisplayInterstitial) grantViewModel).statusText;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context, str, 0, 0L, 0L, false, (Function0) rememberedValue, false, gapComposer, 0, 376);
            gapComposer.end(false);
        } else if (grantViewModel instanceof GrantViewModel.Main) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-2095584684);
            factory.getClass();
            LegacyGrantSheetKt.LegacyGrantSheet(OffsetKt.height(companion, IntrinsicSize.Min), (GrantViewModel.Main) grantViewModel, function1, factory.create(MoneyFormatterConfig.STANDARD), gapComposer2, ((intValue << 3) & 112) | 6);
            gapComposer2.end(false);
        } else if (grantViewModel instanceof GrantViewModel.SubmissionInFlight) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(-2095285813);
            boolean changedInstance = gapComposer3.changedInstance(uiContainerKt$BottomSheet$1$sheetScope$1);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TemporaryStorage$getDir$2(uiContainerKt$BottomSheet$1$sheetScope$1, null, 17);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer3, grantViewModel, (Function2) rememberedValue2);
            TransactorKt.LoadingPlaceholder(SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(companion, ((Configuration) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2), 1.0f), LoadingIndicatorPosition.CENTER, gapComposer3, 48, 0);
            gapComposer3.end(false);
        } else {
            GapComposer gapComposer4 = (GapComposer) composer;
            gapComposer4.startReplaceGroup(-67574493);
            gapComposer4.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$deposits$physical$view$map$PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        PaperMoneyDepositMapViewModel paperMoneyDepositMapViewModel = (PaperMoneyDepositMapViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier padding = SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues);
            List list = paperMoneyDepositMapViewModel.depositMethods;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            PaperMoneyDepositMapViewKt.DepositFilters(0, 0, gapComposer, padding, list, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$deposits$physical$view$onboarding$PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$0;
        PagerState pagerState = (PagerState) this.f$1;
        PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(function1) | gapComposer.changed(pagerState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda3(function1, pagerState, i);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-54034848, new ArcadeModal$$ExternalSyntheticLambda3(paperMoneyDepositOnboardingViewModel, 4), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earnings$views$home$EarningsHomeKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        EarningsHomeViewModel earningsHomeViewModel = (EarningsHomeViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) this.f$2;
        ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        scrollingScaffoldContentScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(scrollingScaffoldContentScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean z = earningsHomeViewModel instanceof EarningsHomeViewModel.Loading;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda14(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Strings.LoadableFullScreenContent(earningsHomeViewModel, z, null, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(803522956, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(8, function1, scrollingScaffoldContentScope, factory), gapComposer), gapComposer, 199680, 20);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earnings$views$payers$AddPayerCustomersViewKt$$ExternalSyntheticLambda15(Object obj, Object obj2, Object obj3) {
        PresentationStyle presentationStyle = (PresentationStyle) this.f$0;
        AddPayerCustomersViewModel.Loaded loaded = (AddPayerCustomersViewModel.Loaded) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean z = presentationStyle instanceof PresentationStyle.Overlay;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier horizontalWeight = z ? adaptiveStackScope.horizontalWeight(companion, 1.0f) : SizeKt.fillMaxWidth(companion, 1.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z2 = !loaded.isToggleSaving;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHomeKt$$ExternalSyntheticLambda7(4, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, z2, null, AddPayerCustomersViewKt.lambda$202830314, gapComposer, 1573248, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earnings$views$payers$AddPayerCustomersViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        AddPayerCustomersViewModel addPayerCustomersViewModel = (AddPayerCustomersViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PresentationStyle presentationStyle = (PresentationStyle) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            AddPayerCustomersViewKt.AddPayerCustomersScreen(addPayerCustomersViewModel, function1, presentationStyle, paddingValues, gapComposer, (intValue << 9) & 7168);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$earningstracker$applets$views$EarningsAppletTileKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        EarningsAppletTileModel earningsAppletTileModel = (EarningsAppletTileModel) this.f$0;
        AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) this.f$1;
        Function0 function0 = (Function0) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            gapComposer.skipToGroupEnd();
        } else if (earningsAppletTileModel instanceof EarningsAppletTileModel.Installed) {
            gapComposer.startReplaceGroup(1486927633);
            zzanv.InstalledUI((EarningsAppletTileModel.Installed) earningsAppletTileModel, appletTileAppearance, function0, gapComposer, 0);
            gapComposer.end(false);
        } else if (earningsAppletTileModel instanceof EarningsAppletTileModel.Uninstalled) {
            gapComposer.startReplaceGroup(1486929927);
            zzanv.UninstalledUI((EarningsAppletTileModel.Uninstalled) earningsAppletTileModel, function0, gapComposer, 0);
            gapComposer.end(false);
        } else {
            if (!(earningsAppletTileModel instanceof EarningsAppletTileModel.Failure)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1486926645, false);
            }
            gapComposer.startReplaceGroup(1486931816);
            SharedUIKt.FailedAppletTile(0, gapComposer, ((EarningsAppletTileModel.Failure) earningsAppletTileModel).title, function0);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$family$applets$views$FamilyAppletTile$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        FamilyAppletTileViewModel familyAppletTileViewModel = (FamilyAppletTileViewModel) this.f$0;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) ((FamilyAppletTile) this.f$1).onClick;
        AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            gapComposer.skipToGroupEnd();
        } else if (familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Loading) {
            gapComposer.startReplaceGroup(279653263);
            SharedUIKt.m3606LoadingServiceAppletTile942rkJo(((FamilyAppletTileViewModel.Loading) familyAppletTileViewModel).title, taxesAppletViewsModule$$ExternalSyntheticLambda1, 88.0f, appletTileAppearance.useRedesignedTiles, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
            gapComposer.end(false);
        } else if (familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Installed) {
            gapComposer.startReplaceGroup(279662909);
            FamilyAppletTileKt.InstalledUI((FamilyAppletTileViewModel.Installed) familyAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        } else {
            if (!(familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Uninstalled)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 279652050, false);
            }
            gapComposer.startReplaceGroup(279666054);
            FamilyAppletTileKt.UninstalledUI((FamilyAppletTileViewModel.Uninstalled) familyAppletTileViewModel, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, 0);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda44(Object obj, Object obj2, Object obj3) {
        State state = (State) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        FidesmoProvisioningViewModel.Success.Provisioned provisioned = (FidesmoProvisioningViewModel.Success.Provisioned) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(state);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda10(state, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxWidth, (Function1) rememberedValue);
            boolean changed2 = gapComposer.changed(state) | gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda4(13, function1, state);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, graphicsLayer, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-237854310, new ArcadeModal$$ExternalSyntheticLambda3(provisioned, 26), gapComposer), gapComposer, 1573248, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda70(Object obj, Object obj2, Object obj3) {
        Density density = (Density) this.f$0;
        State state = (State) this.f$1;
        ScanningStarLayout scanningStarLayout = (ScanningStarLayout) this.f$2;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((AnimatedVisibilityScope) obj).getClass();
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, fillMaxSize);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer2 = (GapComposer) composer;
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
        Updater.m576setimpl(composer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        zzb.DisconnectedAlertIcon(((Number) state.getValue()).floatValue() / 1000.0f, 0, composer, OffsetKt.m272offsetVpY3zN4(companion, density.mo233toDpu2uoSUM((int) (scanningStarLayout.offset >> 32)), density.mo233toDpu2uoSUM((int) (scanningStarLayout.offset & BodyPartID.bodyIdMax))));
        gapComposer2.end(true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        float f;
        Object obj4;
        MutableState mutableState;
        Drawable drawableCompat;
        int i = this.$r8$classId;
        Color color = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 16;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                List list = (List) obj7;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                lazyGridItemScopeImpl.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(lazyGridItemScopeImpl) ? 4 : 2;
                }
                boolean z = (intValue & 19) != 18;
                int i3 = intValue & 1;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i3, z)) {
                    LazyDslKt.LazyRow(SizeKt.fillMaxWidth(companion, 1.0f), null, null, null, null, null, false, null, new BankingConfigQueries$$ExternalSyntheticLambda0(list, ref$IntRef, composableLambdaImpl, lazyGridItemScopeImpl, 14), gapComposer, 6, 510);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LazyListState lazyListState = (LazyListState) obj7;
                PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj6;
                Function1 function1 = (Function1) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ScreenScaffoldContentScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(r6, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.LazyColumn(fillMaxSize, lazyListState, paddingValuesImpl, null, null, null, false, null, (Function1) rememberedValue, gapComposer2, 6, 504);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ScrollState scrollState = (ScrollState) obj7;
                PaddingValuesImpl paddingValuesImpl2 = (PaddingValuesImpl) obj6;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj5;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ScreenScaffoldContentScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier padding = SpacerKt.padding(ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), scrollState, false, 14), paddingValuesImpl2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, padding);
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
                    composableLambdaImpl2.invoke((Object) new ScrollingScaffoldContentScope(), (Object) gapComposer3, (Object) 0);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj7;
                ArcadeTimeline2Item arcadeTimeline2Item = (ArcadeTimeline2Item) obj6;
                ArcadeTimeline2Binding arcadeTimeline2Binding = (ArcadeTimeline2Binding) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                int i4 = ArcadeTimeline2Binding.$r8$clinit;
                ((BoxScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    app.cash.arcade.values.Color color2 = arcadeTimeline2Item.bodyColor;
                    if (color2 == null) {
                        gapComposer4.startReplaceGroup(-1104136800);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(1211308673);
                        color = Recorder$$ExternalSyntheticOutline1.m(gapComposer4, false, ColorsKt.toComposeColor(color2, arcadeTimeline2Binding.themeInfo, gapComposer4));
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color != null ? color.value : Color.Unspecified, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                BitcoinAppletTileModel bitcoinAppletTileModel = (BitcoinAppletTileModel) obj7;
                TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) ((TaxesAppletTile) obj6).onClick;
                AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    gapComposer5.skipToGroupEnd();
                } else if (bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Loading) {
                    gapComposer5.startReplaceGroup(134354243);
                    SharedUIKt.LoadingBalanceAppletTile(((BitcoinAppletTileModel.Loading) bitcoinAppletTileModel).title, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, appletTileAppearance.useRedesignedTiles, gapComposer5, 0);
                    gapComposer5.end(false);
                } else if (bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Installed.LoadingPriceMovement) {
                    gapComposer5.startReplaceGroup(134361603);
                    SharedUIKt.LoadingBalanceAppletTile(((BitcoinAppletTileModel.Installed.LoadingPriceMovement) bitcoinAppletTileModel).title, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, appletTileAppearance.useRedesignedTiles, gapComposer5, 0);
                    gapComposer5.end(false);
                } else if (bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Uninstalled) {
                    gapComposer5.startReplaceGroup(134370957);
                    Utils_androidKt.UninstalledUI((BitcoinAppletTileModel.Uninstalled) bitcoinAppletTileModel, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer5, 0);
                    gapComposer5.end(false);
                } else if (bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Installed.Loaded) {
                    gapComposer5.startReplaceGroup(134372663);
                    Utils_androidKt.InstalledUI((BitcoinAppletTileModel.Installed.Loaded) bitcoinAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer5, 0);
                    gapComposer5.end(false);
                } else {
                    if (!(bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Installed.GraphError)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, 134353180, false);
                    }
                    gapComposer5.startReplaceGroup(134374808);
                    Utils_androidKt.GraphErrorUI((BitcoinAppletTileModel.Installed.GraphError) bitcoinAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer5, 0);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                BitcoinAppletTileModel.Installed.Loaded loaded = (BitcoinAppletTileModel.Installed.Loaded) obj7;
                AppletTile.AppletTileAppearance appletTileAppearance2 = (AppletTile.AppletTileAppearance) obj6;
                InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig = (InstalledBalanceAppletTileLayoutConfig) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    gapComposer6.skipToGroupEnd();
                } else if (loaded instanceof BitcoinAppletTileModel.Installed.Loaded.Chart) {
                    gapComposer6.startReplaceGroup(-1609591489);
                    SharedUIKt.BalanceAppletChart(((BitcoinAppletTileModel.Installed.Loaded.Chart) loaded).graph, gapComposer6, 0);
                    gapComposer6.end(false);
                } else {
                    if (!(loaded instanceof BitcoinAppletTileModel.Installed.Loaded.ZeroBalance)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, -1609592260, false);
                    }
                    gapComposer6.startReplaceGroup(-1609588707);
                    Icons icons = Icons.LogoBtc24;
                    if (appletTileAppearance2.useRedesignedTiles) {
                        gapComposer6.startReplaceGroup(1642484210);
                        Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                        } else {
                            gapComposer6.startReplaceGroup(-1762997739);
                            gapComposer6.end(false);
                        }
                        j = colors.semantic.icon.brand;
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(1642569987);
                        Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                        } else {
                            gapComposer6.startReplaceGroup(-1762997739);
                            gapComposer6.end(false);
                        }
                        j = colors2.semantic.service.bitcoinBackground;
                        gapComposer6.end(false);
                    }
                    SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons, j, installedBalanceAppletTileLayoutConfig.iconSize, gapComposer6, 6, 0);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 6:
                BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj7;
                Function1 function12 = (Function1) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    BitcoinLocationFilter bitcoinLocationFilter = bitcoinMapViewModel.filteredLocations.locationFilter;
                    boolean changed2 = gapComposer7.changed(function12);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda3(function12, mutableState2, r5);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    BitcoinMapViewKt.BitcoinLocationFilterSheet(bitcoinLocationFilter, (Function1) rememberedValue2, SpacerKt.padding(companion, paddingValues), gapComposer7, 0, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ConfirmCvvViewModel confirmCvvViewModel = (ConfirmCvvViewModel) obj7;
                Function1 function13 = (Function1) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier imePadding = SpacerKt.imePadding(SizeKt.fillMaxWidth(companion, 1.0f));
                    boolean z2 = ((String) mutableState3.getValue()).length() == confirmCvvViewModel.cvvLength;
                    boolean changed3 = gapComposer8.changed(function13) | gapComposer8.changedInstance(confirmCvvViewModel);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BulletinTileKt$$ExternalSyntheticLambda12(12, function13, confirmCvvViewModel);
                        gapComposer8.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, imePadding, buttonProminence, false, z2, null, AmountBlockerViewKt.lambda$768193632, gapComposer8, 1573248, 40);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj7;
                Function1 function14 = (Function1) obj6;
                String str2 = (String) obj5;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z3 = !animatedContentScopeImpl.$$delegate_0.getTransition().isRunning();
                    boolean changed4 = gapComposer9.changed(function14);
                    Object rememberedValue4 = gapComposer9.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CashtagViewKt$$ExternalSyntheticLambda6(29, function14);
                        gapComposer9.updateRememberedValue(rememberedValue4);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, fillMaxWidth, null, false, z3, null, Expect_jvmKt.rememberComposableLambda(823297052, new SetPinViewKt$$ExternalSyntheticLambda7(str2, 9), gapComposer9), gapComposer9, 1572912, 44);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                VerifyInstrumentModel verifyInstrumentModel = (VerifyInstrumentModel) obj7;
                Function1 function15 = (Function1) obj6;
                CardState cardState = (CardState) obj5;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    boolean z4 = verifyInstrumentModel.showHelp;
                    boolean z5 = verifyInstrumentModel.isLoading;
                    if (z4) {
                        gapComposer10.startReplaceGroup(-1669307000);
                        boolean z6 = !z5;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed5 = gapComposer10.changed(function15);
                        Object rememberedValue5 = gapComposer10.rememberedValue();
                        if (changed5 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new SsnViewKt$$ExternalSyntheticLambda14(16, function15);
                            gapComposer10.updateRememberedValue(rememberedValue5);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, fillMaxWidth2, null, false, z6, null, AmountBlockerViewKt.lambda$1495298163, gapComposer10, 1572912, 44);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-1669046321);
                        gapComposer10.end(false);
                    }
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean z7 = !z5;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed6 = gapComposer10.changed(function15) | gapComposer10.changed(cardState);
                    Object rememberedValue6 = gapComposer10.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new VerifyCardViewKt$$ExternalSyntheticLambda5(function15, cardState, false ? 1 : 0);
                        gapComposer10.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue6, fillMaxWidth3, buttonProminence2, false, z7, null, AmountBlockerViewKt.f276lambda$1243213586, gapComposer10, 1573296, 40);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj7;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj6;
                Function1 function16 = (Function1) obj5;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    Icons icons2 = Icons.NavigationHelp;
                    String stringResource = Room.stringResource(gapComposer11, R.string.blockers_help);
                    boolean changedInstance = gapComposer11.changedInstance(focusOwnerImpl) | gapComposer11.changed(delegatingSoftwareKeyboardController) | gapComposer11.changed(function16);
                    Object rememberedValue7 = gapComposer11.rememberedValue();
                    if (changedInstance || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new MoneybotChatViewKt$$ExternalSyntheticLambda11(focusOwnerImpl, delegatingSoftwareKeyboardController, function16);
                        gapComposer11.updateRememberedValue(rememberedValue7);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons2, stringResource, (Function0) rememberedValue7, null, null, null, null, null, null, false, gapComposer11, (14 & intValue11) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                BorrowAppletTileModel borrowAppletTileModel = (BorrowAppletTileModel) obj7;
                AppletTile.AppletTileAppearance appletTileAppearance3 = (AppletTile.AppletTileAppearance) obj6;
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj5;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    gapComposer12.skipToGroupEnd();
                } else if (borrowAppletTileModel instanceof BorrowAppletTileModel.Loading) {
                    gapComposer12.startReplaceGroup(406634827);
                    Object rememberedValue8 = gapComposer12.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new SsnViewKt$$ExternalSyntheticLambda0(24);
                        gapComposer12.updateRememberedValue(rememberedValue8);
                    }
                    SharedUIKt.m3606LoadingServiceAppletTile942rkJo("Borrow", (Function0) rememberedValue8, 88.0f, appletTileAppearance3.useRedesignedTiles, gapComposer12, 432, 0);
                    gapComposer12.end(false);
                } else if (borrowAppletTileModel instanceof BorrowAppletTileModel.Installed) {
                    gapComposer12.startReplaceGroup(406649104);
                    taxesAppletTile.InstalledUI((BorrowAppletTileModel.Installed) borrowAppletTileModel, appletTileAppearance3, gapComposer12, 0);
                    gapComposer12.end(false);
                } else {
                    if (!(borrowAppletTileModel instanceof BorrowAppletTileModel.Uninstalled)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, 406632848, false);
                    }
                    gapComposer12.startReplaceGroup(406651686);
                    taxesAppletTile.UninstalledUI((BorrowAppletTileModel.Uninstalled) borrowAppletTileModel, gapComposer12, 0);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                CombinedLoadStates combinedLoadStates = (CombinedLoadStates) obj7;
                ExpandedLoanHistoryListModel expandedLoanHistoryListModel = (ExpandedLoanHistoryListModel) obj6;
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj5;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 20.0f, 7);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer13, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer13.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer13, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    if ((combinedLoadStates.refresh instanceof LoadState.Loading) || (combinedLoadStates.append instanceof LoadState.Loading)) {
                        gapComposer13.startReplaceGroup(2132114538);
                        ProgressCircularKt.ProgressCircular(0, 0, gapComposer13, SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 48.0f, 5), 3.0f), 18.0f));
                        gapComposer13.end(false);
                    } else if (combinedLoadStates.hasError) {
                        gapComposer13.startReplaceGroup(2132449369);
                        boolean changedInstance2 = gapComposer13.changedInstance(lazyPagingItems);
                        Object rememberedValue9 = gapComposer13.rememberedValue();
                        if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
                            rememberedValue9 = new SsnViewKt$$ExternalSyntheticLambda4(lazyPagingItems, 8);
                            gapComposer13.updateRememberedValue(rememberedValue9);
                        }
                        BorrowHomeKt.RetryButton(expandedLoanHistoryListModel, (Function0) rememberedValue9, gapComposer13, 0);
                        gapComposer13.end(false);
                    } else {
                        gapComposer13.startReplaceGroup(2132558396);
                        gapComposer13.end(false);
                    }
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                BorrowHomeOverlayViewModel.LoanDetails loanDetails = (BorrowHomeOverlayViewModel.LoanDetails) obj7;
                MutableState mutableState4 = (MutableState) obj6;
                Function1 function17 = (Function1) obj5;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    Object rememberedValue10 = gapComposer14.rememberedValue();
                    if (rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new TabContentViewKt$$ExternalSyntheticLambda1(23, mutableState4);
                        gapComposer14.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue10, horizontalWeight, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1389932667, new CheckDepositAmountKt$$ExternalSyntheticLambda6(5, loanDetails, mutableState4), gapComposer14), gapComposer14, 1572870, 60);
                    BorrowHomeOverlayViewModel.SheetButton sheetButton = loanDetails.repaymentButton;
                    if (sheetButton == null) {
                        gapComposer14.startReplaceGroup(-189748358);
                        gapComposer14.end(false);
                    } else {
                        gapComposer14.startReplaceGroup(-189748357);
                        Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        boolean changed7 = gapComposer14.changed(function17) | gapComposer14.changedInstance(sheetButton);
                        Object rememberedValue11 = gapComposer14.rememberedValue();
                        if (changed7 || rememberedValue11 == neverEqualPolicy) {
                            rememberedValue11 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(r5, (Object) sheetButton, function17);
                            gapComposer14.updateRememberedValue(rememberedValue11);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue11, horizontalWeight2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-346710279, new CheckDepositAmountKt$$ExternalSyntheticLambda8(sheetButton, r5), gapComposer14), gapComposer14, 1572864, 60);
                        gapComposer14.end(false);
                    }
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Function1 function18 = (Function1) obj6;
                MutableState mutableState5 = (MutableState) obj5;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                float floatValue = ((Number) mutableState5.getValue()).floatValue();
                String str3 = ((CardStudioViewModel.Content) obj7).cardTheme.card_info_text_color;
                Timber.Forest forest = Timber.Forest;
                GapComposer gapComposer15 = (GapComposer) ((Composer) obj2);
                Object rememberedValue12 = gapComposer15.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    CardStudioViewKt$ThemedCard$1$4$1 cardStudioViewKt$ThemedCard$1$4$1 = new CardStudioViewKt$ThemedCard$1$4$1(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 10);
                    gapComposer15.updateRememberedValue(cardStudioViewKt$ThemedCard$1$4$1);
                    rememberedValue12 = cardStudioViewKt$ThemedCard$1$4$1;
                }
                Integer safeParseColor = StringsKt.safeParseColor(str3, (Function1) ((KFunction) rememberedValue12));
                safeParseColor.getClass();
                int intValue15 = safeParseColor.intValue();
                Object rememberedValue13 = gapComposer15.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = new CashCardKt$$ExternalSyntheticLambda0(i2, mutableState5);
                    gapComposer15.updateRememberedValue(rememberedValue13);
                }
                CardStudioViewKt.ScalingSlider(floatValue, intValue15, (Function1) rememberedValue13, function18, gapComposer15, MLKEMEngine.KyberPolyBytes);
                return Unit.INSTANCE;
            case 15:
                CardTheme cardTheme = (CardTheme) obj7;
                Flow flow = (Flow) obj6;
                Context context = (Context) obj5;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer15 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer15).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    Object rememberedValue14 = gapComposer16.rememberedValue();
                    if (rememberedValue14 == neverEqualPolicy) {
                        CardTheme.BackgroundImage backgroundImage = cardTheme.background_image;
                        switch (backgroundImage == null ? -1 : CardStudioViewV2Kt.WhenMappings.$EnumSwitchMapping$2[backgroundImage.ordinal()]) {
                            case 1:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_hood_by_air, null);
                                break;
                            case 2:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_hundred_thieves, null);
                                break;
                            case 3:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_oil_slick, null);
                                break;
                            case 4:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_metal_black, null);
                                break;
                            case 5:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_shantell_front_rounded, null);
                                break;
                            case 6:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_dream, null);
                                break;
                            case 7:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_mood, null);
                                break;
                            case 8:
                                drawableCompat = new GlitterDrawable(context, true);
                                break;
                            case 9:
                                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.card_tortoise_background, null);
                                drawableCompat2.getClass();
                                drawableCompat = new LayerDrawable(new Drawable[]{new ImageDrawable(drawableCompat2, 2), new ColorDrawable(CardsKt.TORTOISE_OVERLAY)});
                                break;
                            case 10:
                                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_brat, null);
                                break;
                            default:
                                if (cardTheme.id != CardTheme.Identifier.HOLO_ID) {
                                    drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.styled_card_background, null);
                                    drawableCompat.getClass();
                                    Integer safeParseColor2 = StringsKt.safeParseColor(cardTheme.card_color, new CardStudioViewKt$ThemedCard$1$4$1(1, Timber.Forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 17));
                                    safeParseColor2.getClass();
                                    drawableCompat.setTint(safeParseColor2.intValue());
                                    break;
                                } else {
                                    drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_holo, null);
                                    break;
                                }
                        }
                        drawableCompat.getClass();
                        DrawablePainter drawablePainter = new DrawablePainter(drawableCompat);
                        gapComposer16.updateRememberedValue(drawablePainter);
                        rememberedValue14 = drawablePainter;
                    }
                    DrawablePainter drawablePainter2 = (DrawablePainter) rememberedValue14;
                    float m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(boxWithConstraintsScopeImpl.constraints);
                    Object rememberedValue15 = gapComposer16.rememberedValue();
                    Object obj8 = rememberedValue15;
                    if (rememberedValue15 == neverEqualPolicy) {
                        CardStudioViewV2Kt$$ExternalSyntheticLambda47 cardStudioViewV2Kt$$ExternalSyntheticLambda47 = new CardStudioViewV2Kt$$ExternalSyntheticLambda47(false ? 1 : 0);
                        gapComposer16.updateRememberedValue(cardStudioViewV2Kt$$ExternalSyntheticLambda47);
                        obj8 = cardStudioViewV2Kt$$ExternalSyntheticLambda47;
                    }
                    Modifier layout = ValueInsets.layout(companion, (Function3) obj8);
                    Object rememberedValue16 = gapComposer16.rememberedValue();
                    Object obj9 = rememberedValue16;
                    if (rememberedValue16 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer16.updateRememberedValue(mutableStateOf$default);
                        obj9 = mutableStateOf$default;
                    }
                    MutableState mutableState6 = (MutableState) obj9;
                    if (cardTheme.background_image != CardTheme.BackgroundImage.MOOD || ((Boolean) mutableState6.getValue()).booleanValue()) {
                        CardTheme.BackgroundImage backgroundImage2 = cardTheme.background_image;
                        if (backgroundImage2 == CardTheme.BackgroundImage.GLITTER) {
                            gapComposer16.startReplaceGroup(451803104);
                            GlitterCardEffectKt.GlitterCardEffect(ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer16) * 0.058f)).then(layout), null, true, gapComposer16, MLKEMEngine.KyberPolyBytes, 2);
                            gapComposer16.end(false);
                        } else if (backgroundImage2 == CardTheme.BackgroundImage.TORTOISE) {
                            gapComposer16.startReplaceGroup(452081081);
                            TortoiseCardEffectKt.TortoiseBackground(0, 0, gapComposer16, ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer16) * 0.058f)).then(layout));
                            gapComposer16.end(false);
                        } else if (cardTheme.id == CardTheme.Identifier.HOLO_ID) {
                            gapComposer16.startReplaceGroup(452340861);
                            FlowsKt.HoloBackground(ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer16) * 0.058f)).then(layout), gapComposer16, 0);
                            gapComposer16.end(false);
                        } else {
                            gapComposer16.startReplaceGroup(452562666);
                            ImageKt.Image(drawablePainter2, "Cash App Card Preview", ClipKt.clip(SizeKt.fillMaxSize(companion, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer16) * 0.058f)).then(layout), null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, null, gapComposer16, 24632, 104);
                            gapComposer16.end(false);
                        }
                    } else {
                        gapComposer16.startReplaceGroup(450810360);
                        Object rememberedValue17 = gapComposer16.rememberedValue();
                        if (rememberedValue17 == neverEqualPolicy) {
                            f = 0.058f;
                            HeatRenderer heatRenderer = new HeatRenderer(context, Integer.valueOf(R.drawable.card_mood_hand_heat_map), new CashCardKt$$ExternalSyntheticLambda0(20, mutableState6));
                            gapComposer16.updateRememberedValue(heatRenderer);
                            obj4 = heatRenderer;
                        } else {
                            f = 0.058f;
                            obj4 = rememberedValue17;
                        }
                        HeatRenderer heatRenderer2 = (HeatRenderer) obj4;
                        Object rememberedValue18 = gapComposer16.rememberedValue();
                        Object obj10 = rememberedValue18;
                        if (rememberedValue18 == neverEqualPolicy) {
                            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(new Offset(0L));
                            gapComposer16.updateRememberedValue(mutableStateOf$default2);
                            obj10 = mutableStateOf$default2;
                        }
                        MutableState mutableState7 = (MutableState) obj10;
                        boolean changedInstance3 = gapComposer16.changedInstance(flow) | gapComposer16.changedInstance(heatRenderer2) | gapComposer16.changed(m1025getMaxWidthimpl);
                        Object rememberedValue19 = gapComposer16.rememberedValue();
                        if (changedInstance3 || rememberedValue19 == neverEqualPolicy) {
                            rememberedValue19 = new SwipeableState$animateInternalToOffset$2(flow, heatRenderer2, m1025getMaxWidthimpl, mutableState7, null);
                            mutableState = mutableState7;
                            gapComposer16.updateRememberedValue(rememberedValue19);
                        } else {
                            mutableState = mutableState7;
                        }
                        Updater.LaunchedEffect(gapComposer16, heatRenderer2, (Function2) rememberedValue19);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        Object rememberedValue20 = gapComposer16.rememberedValue();
                        Object obj11 = rememberedValue20;
                        if (rememberedValue20 == neverEqualPolicy) {
                            CashCardKt$$ExternalSyntheticLambda0 cashCardKt$$ExternalSyntheticLambda0 = new CashCardKt$$ExternalSyntheticLambda0(21, mutableState);
                            gapComposer16.updateRememberedValue(cashCardKt$$ExternalSyntheticLambda0);
                            obj11 = cashCardKt$$ExternalSyntheticLambda0;
                        }
                        Modifier then = ClipKt.clip(ValueInsets.onGloballyPositioned(fillMaxSize2, (Function1) obj11), RoundedCornerShapeKt.RoundedCornerShape(DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM(), gapComposer16) * f)).then(layout);
                        String str4 = cardTheme.card_color;
                        Timber.Forest forest2 = Timber.Forest;
                        Object rememberedValue21 = gapComposer16.rememberedValue();
                        if (rememberedValue21 == neverEqualPolicy) {
                            rememberedValue21 = new CardStudioViewKt$ThemedCard$1$4$1(1, forest2, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 16);
                            gapComposer16.updateRememberedValue(rememberedValue21);
                        }
                        Integer safeParseColor3 = StringsKt.safeParseColor(str4, (Function1) ((KFunction) rememberedValue21));
                        safeParseColor3.getClass();
                        CanvasKt.MoodHeatEffect(ImageKt.m177backgroundbw27NRU(then, ColorKt.Color(safeParseColor3.intValue()), ColorKt.RectangleShape), heatRenderer2, gapComposer16, 0);
                        gapComposer16.end(false);
                    }
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                return invoke$com$squareup$cash$card$onboarding$CardStylePickerViewKt$$ExternalSyntheticLambda14(obj, obj2, obj3);
            case 17:
                return invoke$com$squareup$cash$card$onboarding$CardStylePickerViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 18:
                return invoke$com$squareup$cash$card$onboarding$PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda32(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$cashapppay$views$LegacyGrantSheetKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$deposits$physical$view$map$PaperMoneyDepositMapViewKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$deposits$physical$view$onboarding$PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$earnings$views$home$EarningsHomeKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$earnings$views$payers$AddPayerCustomersViewKt$$ExternalSyntheticLambda15(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$earnings$views$payers$AddPayerCustomersViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$earningstracker$applets$views$EarningsAppletTileKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$family$applets$views$FamilyAppletTile$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda44(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda70(obj, obj2, obj3);
            default:
                CellDefault.CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage = (CellDefault.CellDefaultAccessoryLeadingImage) obj7;
                String str5 = (String) obj6;
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                Composer composer16 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    if (cellDefaultAccessoryLeadingImage == null) {
                        gapComposer17.startReplaceGroup(-1561239667);
                        gapComposer17.end(false);
                    } else {
                        gapComposer17.startReplaceGroup(-1561239666);
                        ArcadeFormCellDefaultElementKt.AccessoryLeadingImage(cellDefaultAccessoryLeadingImage, realImageLoader, gapComposer17, 0);
                        ((DefaultSizes) gapComposer17.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer17, SizeKt.m290width3ABfNKs(companion, 8.0f));
                        gapComposer17.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
