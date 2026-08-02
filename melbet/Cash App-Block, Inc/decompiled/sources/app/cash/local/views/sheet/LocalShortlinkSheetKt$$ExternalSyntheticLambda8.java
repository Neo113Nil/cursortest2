package app.cash.local.views.sheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListInterval;
import androidx.compose.foundation.lazy.LazyListItemProviderImpl;
import androidx.compose.foundation.lazy.grid.LazyGridInterval;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.lazy.layout.IntervalList$Interval;
import androidx.compose.foundation.pager.PagerIntervalContent;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyImpl;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.material.motion.MotionUtils;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.compose.clustering.ClusteringKt;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.components.views.TableMeasurePolicy;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.views.StatusResultViewKt;
import com.squareup.cash.card.onboarding.CardPreviewSheet;
import com.squareup.cash.card.onboarding.CardPreviewViewKt;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.charting.components.ChartConfig;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.DependentDetailToolbarModel;
import com.squareup.cash.formview.components.FormCashAppTagElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeLocalImageIcon;
import com.squareup.cash.genericelements.viewmodels.DividerComponentViewModel;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.views.plugins.SlottedTableKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.HeroHeader;
import squareup.cash.ui.arcade.elements.ListUnordered;
import squareup.cash.ui.arcade.elements.PageHeader;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalShortlinkSheetKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(HeartEdition heartEdition, int i) {
        this.$r8$classId = 17;
        WandPose wandPose = WandPose.Float;
        this.f$0 = heartEdition;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                LoyaltySheetKt.preloadImages((EducationalSheetModelList) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                LazyListItemProviderImpl lazyListItemProviderImpl = (LazyListItemProviderImpl) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    IntervalList$Interval intervalList$Interval = lazyListItemProviderImpl.intervalContent.intervals.get(i2);
                    ((LazyListInterval) intervalList$Interval.value).item.invoke((Object) lazyListItemProviderImpl.itemScope, (Object) Integer.valueOf(i2 - intervalList$Interval.startIndex), (Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LazyGridItemProviderImpl lazyGridItemProviderImpl = (LazyGridItemProviderImpl) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    IntervalList$Interval intervalList$Interval2 = lazyGridItemProviderImpl.intervalContent.intervals.get(i2);
                    ((LazyGridInterval) intervalList$Interval2.value).item.invoke((Object) LazyGridItemScopeImpl.INSTANCE, (Object) Integer.valueOf(i2 - intervalList$Interval2.startIndex), (Object) gapComposer2, (Object) 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    IntervalList$Interval intervalList$Interval3 = pagerLazyLayoutItemProvider.intervalContent.getIntervals().get(i2);
                    ((PagerIntervalContent) intervalList$Interval3.value).item.invoke(PagerScopeImpl.INSTANCE, Integer.valueOf(i2 - intervalList$Interval3.startIndex), gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ClusteringKt.ResetMapListeners((ClusterManager) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((AfterpayAppletHomePresenter) obj3).CheckAndShowDisplayMessages((Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                PageHeader pageHeader = (PageHeader) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, this.f$1, 48, 0, 3836, 0L, (Composer) gapComposer4, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, ArcadeComponentProtoBindingKt.translatedOrEmpty(pageHeader.header), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ArcadeComponentProtoBindingKt.RenderListUnordered((ListUnordered) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ArcadeComponentProtoBindingKt.RenderHeroHeader((HeroHeader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                BenefitsComparisonTableViewModel.Loaded loaded = (BenefitsComparisonTableViewModel.Loaded) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    TableMeasurePolicy tableMeasurePolicy = new TableMeasurePolicy(i2);
                    gapComposer5.startReplaceGroup(1843518867);
                    ArrayList arrayList = loaded.rows;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    int i3 = 0;
                    for (Object obj4 : arrayList) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        arrayList2.add(Expect_jvmKt.rememberComposableLambda(-174195016, new ClusterItemKt$$ExternalSyntheticLambda2((BenefitsComparisonTableViewModel.BenefitsComparisonTableRow) obj4, i2, i3), gapComposer5));
                        i3 = i4;
                    }
                    gapComposer5.end(false);
                    ComposableLambdaImpl combineAsVirtualLayouts = RulerKt.combineAsVirtualLayouts(arrayList2);
                    boolean changed = gapComposer5.changed(tableMeasurePolicy);
                    Object rememberedValue = gapComposer5.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MultiContentMeasurePolicyImpl(tableMeasurePolicy);
                        gapComposer5.updateRememberedValue(rememberedValue);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, combineAsVirtualLayouts, gapComposer5, true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).intValue();
                StatusResultViewKt.HapticEffect((StatusResultViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).intValue();
                CardPreviewViewKt.ThemeInfoSheet((CardPreviewSheet) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                SegmentedBarChartKt.Axis((ChartConfig) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).intValue();
                FamilyAppletTileKt.FailureUI((AllowanceAppletTileViewModel.Failure) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 14:
                DependentControlsToggleViewModel dependentControlsToggleViewModel = (DependentControlsToggleViewModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(i2, 0, gapComposer6);
                    String str = dependentControlsToggleViewModel.toggleTitle;
                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    long j = colors.semantic.icon.standard;
                    ImageKt.Image(painterResource, str, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer6, Painter.$stable, 60);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                AllowanceViewKt.ToolbarTitleText((DependentDetailToolbarModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).intValue();
                AllowanceViewKt.FamilyPendingRequestRowContentActivity((FamilyPendingRequestRowModel.Activity) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 17:
                WandPose wandPose = WandPose.Float;
                ((Integer) obj2).getClass();
                FormCashAppTagElementKt.HeartReviewEffect((HeartEdition) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 18:
                WandPose wandPose2 = WandPose.Float;
                ((Integer) obj2).getClass();
                FormCashAppTagElementKt.WandReviewEffect((WandEdition) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 19:
                WandPose wandPose3 = WandPose.Float;
                ((Integer) obj2).getClass();
                FormCashAppTagElementKt.MiniCardReviewEffect((MiniCardEdition) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((ArcadeLocalImageIcon) obj3).IconContent((Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).intValue();
                MotionUtils.BlankDividerWidget((DividerComponentViewModel.BlankDividerViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).intValue();
                MotionUtils.LineDividerWidget((DividerComponentViewModel.LineDividerViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).intValue();
                QuickAccessBarKt.ShowMoreLoading((LazyItemScopeImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).intValue();
                TextCardKt.RingGraphic((SlotContent.ProgressRing) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                SlottedTableKt.SlottedTableRow((SlotContent.Table.Row) obj3, i2, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).intValue();
                OffersHeroTileKt.OffersHeroTileText((OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.HelpSheetRow(i2, (HelpSheetViewModel.Row) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaycheckDistributionMonthlyEstimateExplanationContent((BottomSheet) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ReceiptWheelContentKt.ActiveDistributionSectionWheelContent((DistributionWheelViewModel.Content.ActiveDistributionSection) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(int i, HelpSheetViewModel.Row row, int i2) {
        this.$r8$classId = 27;
        this.f$1 = i;
        this.f$0 = row;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(MiniCardEdition miniCardEdition, int i) {
        this.$r8$classId = 19;
        WandPose wandPose = WandPose.Float;
        this.f$0 = miniCardEdition;
        this.f$1 = i;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(WandEdition wandEdition, int i) {
        this.$r8$classId = 18;
        WandPose wandPose = WandPose.Float;
        this.f$0 = wandEdition;
        this.f$1 = i;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(SlotContent.Table.Row row, int i, int i2) {
        this.$r8$classId = 25;
        this.f$0 = row;
        this.f$1 = i;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(BottomSheet bottomSheet, int i) {
        this.$r8$classId = 28;
        this.f$0 = bottomSheet;
        this.f$1 = i;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(HeroHeader heroHeader, int i) {
        this.$r8$classId = 8;
        this.f$0 = heroHeader;
        this.f$1 = i;
    }

    public /* synthetic */ LocalShortlinkSheetKt$$ExternalSyntheticLambda8(ListUnordered listUnordered, int i) {
        this.$r8$classId = 7;
        this.f$0 = listUnordered;
        this.f$1 = i;
    }
}
