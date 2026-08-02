package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.ViewSizeResolver$size$3$1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LogoViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHeaderViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel;
import com.squareup.cash.offers.views.OffersAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt$OffersSearchListingBody_gNPyAyM$lambda$2$0$$inlined$itemsWithImpressions$1$2;
import com.squareup.util.compose.ListsKt;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;

/* loaded from: classes3.dex */
public final class DatePickerKt$HorizontalMonthsList$1$2$1$1 implements Function4 {
    public final /* synthetic */ Object $calendarModel;
    public final /* synthetic */ Object $colors;
    public final /* synthetic */ Object $dateFormatter;
    public final /* synthetic */ Object $firstMonth;
    public final /* synthetic */ Function1 $onDateSelectionChange;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $selectableDates;
    public final /* synthetic */ Object $selectedDateMillis;
    public final /* synthetic */ Object $today;

    public DatePickerKt$HorizontalMonthsList$1$2$1$1(CalendarModelImpl calendarModelImpl, CalendarMonth calendarMonth, Function1 function1, CalendarDate calendarDate, Long l, DatePickerFormatterImpl datePickerFormatterImpl, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, DatePickerColors datePickerColors) {
        this.$calendarModel = calendarModelImpl;
        this.$firstMonth = calendarMonth;
        this.$onDateSelectionChange = function1;
        this.$today = calendarDate;
        this.$selectedDateMillis = l;
        this.$dateFormatter = datePickerFormatterImpl;
        this.$selectableDates = datePickerDefaults$AllDates$1;
        this.$colors = datePickerColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a5  */
    @Override // kotlin.jvm.functions.Function4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        GapComposer gapComposer;
        Object obj5;
        boolean z;
        String str;
        String str2;
        boolean z2;
        Color m;
        Iterator it;
        long j;
        String str3;
        LazyListState lazyListState;
        boolean changed;
        Object rememberedValue;
        boolean z3;
        int i3 = this.$r8$classId;
        Object obj6 = this.$firstMonth;
        Object obj7 = this.$calendarModel;
        Object obj8 = this.$dateFormatter;
        Object obj9 = this.$selectedDateMillis;
        Object obj10 = this.$selectableDates;
        Object obj11 = this.$colors;
        Object obj12 = this.$today;
        boolean z4 = false;
        switch (i3) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                CalendarModelImpl calendarModelImpl = (CalendarModelImpl) obj7;
                if ((intValue2 & 6) == 0) {
                    i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(i & 1, (i & 147) != 146)) {
                    CalendarMonth calendarMonth = (CalendarMonth) obj6;
                    calendarModelImpl.getClass();
                    if (intValue > 0) {
                        calendarMonth = calendarModelImpl.getMonth(Instant.ofEpochMilli(calendarMonth.startUtcTimeMillis).atZone(CalendarModelImpl.utcTimeZoneId).toLocalDate().plusMonths(intValue));
                    }
                    CalendarMonth calendarMonth2 = calendarMonth;
                    Modifier fillParentMaxWidth$default = LazyItemScopeImpl.fillParentMaxWidth$default(lazyItemScopeImpl);
                    CalendarDate calendarDate = (CalendarDate) obj12;
                    Long l = (Long) obj9;
                    DatePickerFormatterImpl datePickerFormatterImpl = (DatePickerFormatterImpl) obj8;
                    DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1 = (DatePickerDefaults$AllDates$1) obj10;
                    DatePickerColors datePickerColors = (DatePickerColors) obj11;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillParentMaxWidth$default);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DatePickerKt.Month(calendarMonth2, this.$onDateSelectionChange, calendarDate.utcTimeMillis, l, datePickerFormatterImpl, datePickerDefaults$AllDates$1, datePickerColors, calendarModelImpl.locale, gapComposer2, 221184);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                OffersStyledTextKt$$ExternalSyntheticLambda0 offersStyledTextKt$$ExternalSyntheticLambda0 = (OffersStyledTextKt$$ExternalSyntheticLambda0) obj12;
                Function2 function2 = (Function2) obj11;
                Function0 function0 = (Function0) obj10;
                Function1 function1 = (Function1) obj9;
                Function0 function02 = (Function0) obj8;
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    Object obj13 = ((List) obj7).get(intValue3);
                    gapComposer3.startReplaceGroup(-176019013);
                    OffersSearchListItemViewModel offersSearchListItemViewModel = (OffersSearchListItemViewModel) obj13;
                    gapComposer3.startReplaceGroup(1245072254);
                    boolean z5 = offersSearchListItemViewModel instanceof FilterGroupsSectionViewModel;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z5) {
                        gapComposer3.startReplaceGroup(1245072377);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                        boolean changedInstance = gapComposer3.changedInstance(offersSearchListItemViewModel) | gapComposer3.changed(function1) | gapComposer3.changed(function02);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ViewSizeResolver$size$3$1(6, (FilterGroupsSectionViewModel) offersSearchListItemViewModel, function1, function02);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        FilterBarKt.FilterBar(null, null, m295PaddingValuesYgX7TsA$default, (Function1) rememberedValue2, gapComposer3, 0, 3);
                        gapComposer = gapComposer3;
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer3;
                        if (offersSearchListItemViewModel instanceof OffersHeaderViewModel) {
                            gapComposer.startReplaceGroup(1245704436);
                            String str4 = ((OffersHeaderViewModel) offersSearchListItemViewModel).title.text;
                            ViewfinderDefaults.SectionHeader(str4 == null ? "" : str4, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                            gapComposer.end(false);
                        } else {
                            if (offersSearchListItemViewModel instanceof OffersSearchListItemViewModel.RecentlyViewedSectionViewModel) {
                                gapComposer.startReplaceGroup(1245874998);
                                gapComposer.startReplaceGroup(40190915);
                                OffersSearchListItemViewModel.RecentlyViewedSectionViewModel recentlyViewedSectionViewModel = (OffersSearchListItemViewModel.RecentlyViewedSectionViewModel) offersSearchListItemViewModel;
                                List list = recentlyViewedSectionViewModel.models;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    LogoViewModel logoViewModel = (LogoViewModel) it2.next();
                                    String str5 = logoViewModel.id;
                                    LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = logoViewModel.avatar;
                                    String str6 = logoViewModel.title.text;
                                    String str7 = str6 == null ? "" : str6;
                                    Character ch = legacyOffersAvatarViewModel.monogram;
                                    Object obj14 = obj6;
                                    String str8 = legacyOffersAvatarViewModel.lightImageUrl;
                                    String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
                                    String str9 = valueOf == null ? "" : valueOf;
                                    com.squareup.protos.cash.ui.Color color = legacyOffersAvatarViewModel.backgroundColor;
                                    if (color == null) {
                                        gapComposer.startReplaceGroup(1195687153);
                                        gapComposer.end(false);
                                        str = str8;
                                        str2 = str5;
                                        z2 = false;
                                        m = null;
                                    } else {
                                        str = str8;
                                        str2 = str5;
                                        z2 = false;
                                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1346902768, color, gapComposer, false);
                                    }
                                    if (m == null) {
                                        gapComposer.startReplaceGroup(-1346901263);
                                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
                                        } else {
                                            gapComposer.startReplaceGroup(-1762997739);
                                            gapComposer.end(z2);
                                        }
                                        it = it2;
                                        j = colors.semantic.icon.extraSubtle;
                                        gapComposer.end(z2);
                                    } else {
                                        it = it2;
                                        gapComposer.startReplaceGroup(-1346903464);
                                        gapComposer.end(z2);
                                        j = m.value;
                                    }
                                    long j2 = j;
                                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
                                    } else {
                                        gapComposer.startReplaceGroup(-1762997739);
                                        gapComposer.end(z2);
                                    }
                                    if (colors2.isLight) {
                                        str.getClass();
                                    } else {
                                        String str10 = legacyOffersAvatarViewModel.darkImageUrl;
                                        if (str10 == null) {
                                            str.getClass();
                                        } else {
                                            str3 = str10;
                                            arrayList.add(new AvatarCarouselEntry(str7, str2, new AvatarEntry(str9, j2, null, new AvatarImage.Remote.Image(str3, false, null, 0L, new OffersAvatarKt$$ExternalSyntheticLambda0(8), 62), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, 24));
                                            it2 = it;
                                            obj6 = obj14;
                                            z4 = false;
                                        }
                                    }
                                    str3 = str;
                                    arrayList.add(new AvatarCarouselEntry(str7, str2, new AvatarEntry(str9, j2, null, new AvatarImage.Remote.Image(str3, false, null, 0L, new OffersAvatarKt$$ExternalSyntheticLambda0(8), 62), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, 24));
                                    it2 = it;
                                    obj6 = obj14;
                                    z4 = false;
                                }
                                obj5 = obj6;
                                gapComposer.end(z4);
                                ImmutableList immutableList = Tags.toImmutableList(arrayList);
                                boolean changedInstance2 = gapComposer.changedInstance(offersSearchListItemViewModel) | gapComposer.changed(function1) | gapComposer.changed(function02);
                                Object rememberedValue3 = gapComposer.rememberedValue();
                                if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new ViewSizeResolver$size$3$1(7, recentlyViewedSectionViewModel, function1, function02);
                                    gapComposer.updateRememberedValue(rememberedValue3);
                                }
                                DebugUtils.AvatarCarousel(immutableList, (Function1) rememberedValue3, null, null, gapComposer, 0, 12);
                                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                                gapComposer.end(false);
                                z = false;
                            } else {
                                obj5 = obj6;
                                if (offersSearchListItemViewModel instanceof OffersMessageViewModel) {
                                    gapComposer.startReplaceGroup(1246545218);
                                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                                    OffersMessageViewModel offersMessageViewModel = (OffersMessageViewModel) offersSearchListItemViewModel;
                                    boolean changed2 = gapComposer.changed(function0) | gapComposer.changed(function02);
                                    Object rememberedValue4 = gapComposer.rememberedValue();
                                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                        rememberedValue4 = new CardModelView$1$3$4$2(17, function0, function02);
                                        gapComposer.updateRememberedValue(rememberedValue4);
                                    }
                                    UtilsKt.OffersMessageView(offersMessageViewModel, (Function0) rememberedValue4, null, gapComposer, 0, 4);
                                    z = false;
                                    gapComposer.end(false);
                                } else if (offersSearchListItemViewModel instanceof OffersSearchListItemViewModel.OffersSearchFilterRowViewModel) {
                                    gapComposer.startReplaceGroup(1246811539);
                                    OffersSearchListItemViewModel.OffersSearchFilterRowViewModel offersSearchFilterRowViewModel = (OffersSearchListItemViewModel.OffersSearchFilterRowViewModel) offersSearchListItemViewModel;
                                    OffersRowViewModel offersRowViewModel = offersSearchFilterRowViewModel.rowViewModel;
                                    boolean changedInstance3 = gapComposer.changedInstance(offersSearchListItemViewModel) | gapComposer.changed(function2);
                                    Object rememberedValue5 = gapComposer.rememberedValue();
                                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                                        rememberedValue5 = new CardModelView$1$3$4$2(18, function2, offersSearchFilterRowViewModel);
                                        gapComposer.updateRememberedValue(rememberedValue5);
                                    }
                                    z = false;
                                    OffersSearchListingKt.RenderAsCellSearchResult(offersRowViewModel, (Function0) rememberedValue5, gapComposer, 0);
                                    gapComposer.end(false);
                                } else {
                                    if (!(offersSearchListItemViewModel instanceof OffersCommonOfferRowViewModel)) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 40163621, false);
                                    }
                                    gapComposer.startReplaceGroup(1247036289);
                                    OffersCommonOfferRowViewModel offersCommonOfferRowViewModel = (OffersCommonOfferRowViewModel) offersSearchListItemViewModel;
                                    OffersRowViewModel offersRowViewModel2 = offersCommonOfferRowViewModel.rowViewModel;
                                    boolean changedInstance4 = gapComposer.changedInstance(offersSearchListItemViewModel) | gapComposer.changed(function1) | gapComposer.changed(function02);
                                    Object rememberedValue6 = gapComposer.rememberedValue();
                                    if (changedInstance4 || rememberedValue6 == neverEqualPolicy) {
                                        rememberedValue6 = new KClassImpl$Data$$Lambda$23(8, function1, offersCommonOfferRowViewModel, function02);
                                        gapComposer.updateRememberedValue(rememberedValue6);
                                    }
                                    z = false;
                                    OffersSearchListingKt.RenderAsCellSearchResult(offersRowViewModel2, (Function0) rememberedValue6, gapComposer, 0);
                                    gapComposer.end(false);
                                }
                            }
                            gapComposer.end(z);
                            lazyListState = (LazyListState) obj5;
                            changed = gapComposer.changed(offersStyledTextKt$$ExternalSyntheticLambda0) | gapComposer.changedInstance(obj13);
                            rememberedValue = gapComposer.rememberedValue();
                            if (!changed || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new VerifyCheckDepositPresenter$models$3$2(19, offersStyledTextKt$$ExternalSyntheticLambda0, obj13);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue, gapComposer).getValue()).booleanValue()) {
                                z3 = false;
                                gapComposer.startReplaceGroup(-175697079);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-175903694);
                                boolean changedInstance5 = gapComposer.changedInstance(obj13);
                                Function1 function12 = this.$onDateSelectionChange;
                                boolean changed3 = changedInstance5 | gapComposer.changed(function12);
                                Object rememberedValue7 = gapComposer.rememberedValue();
                                if (changed3 || rememberedValue7 == neverEqualPolicy) {
                                    z3 = false;
                                    rememberedValue7 = new OffersSearchListingKt$OffersSearchListingBody_gNPyAyM$lambda$2$0$$inlined$itemsWithImpressions$1$2(0, obj13, function12);
                                    gapComposer.updateRememberedValue(rememberedValue7);
                                } else {
                                    z3 = false;
                                }
                                Updater.SideEffect((Function0) rememberedValue7, gapComposer);
                                gapComposer.end(z3);
                            }
                            gapComposer.end(z3);
                        }
                    }
                    obj5 = obj6;
                    z = false;
                    gapComposer.end(z);
                    lazyListState = (LazyListState) obj5;
                    changed = gapComposer.changed(offersStyledTextKt$$ExternalSyntheticLambda0) | gapComposer.changedInstance(obj13);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new VerifyCheckDepositPresenter$models$3$2(19, offersStyledTextKt$$ExternalSyntheticLambda0, obj13);
                    gapComposer.updateRememberedValue(rememberedValue);
                    if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue, gapComposer).getValue()).booleanValue()) {
                    }
                    gapComposer.end(z3);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public DatePickerKt$HorizontalMonthsList$1$2$1$1(List list, LazyListState lazyListState, OffersStyledTextKt$$ExternalSyntheticLambda0 offersStyledTextKt$$ExternalSyntheticLambda0, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function2 function2) {
        this.$calendarModel = list;
        this.$firstMonth = lazyListState;
        this.$today = offersStyledTextKt$$ExternalSyntheticLambda0;
        this.$onDateSelectionChange = function1;
        this.$selectedDateMillis = function12;
        this.$dateFormatter = function0;
        this.$selectableDates = function02;
        this.$colors = function2;
    }
}
