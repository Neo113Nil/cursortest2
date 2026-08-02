package com.squareup.cash.offers.views.listing;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.history.views.PaymentPasscodeDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda32;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$2$1;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.backend.api.BusinessToken;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LogoViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHeaderViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSaleChipViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchFilterGroupViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel;
import com.squareup.cash.offers.views.OffersCollapsibleHeaderScaffoldState;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class OffersSearchListingKt {
    public static final ArrayList SEARCH_LISTING_ITEMS;
    public static final List logosViewModels;
    public static final List offersRowViewModels;

    static {
        CollectionsKt__CollectionsKt.listOf((Object[]) new OffersSearchFilterGroupViewModel[]{new OffersSearchFilterGroupViewModel("Pay in 4", true), new OffersSearchFilterGroupViewModel("Category", false), new OffersSearchFilterGroupViewModel("Location", false)}).getClass();
        LegacyOffersAvatarViewModel legacyOffersAvatarViewModel = new LegacyOffersAvatarViewModel("https://cash-images-f.squarecdn.com/invest/SQ.png", "https://cash-images-f.squarecdn.com/invest/SQ.png", (Character) 'C', ColorsKt.toColor("#89CFF0"), (Avatar.Shape) null, 48);
        BusinessToken businessToken = new BusinessToken("logo_one");
        StyledText styledText = new StyledText("5% off", (Color) null, 6);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LogoViewModel[]{new LogoViewModel(new OffersAnalyticsEventSpec("logo_one impression", emptyMap, 4), "id_one", businessToken, legacyOffersAvatarViewModel, styledText, "https://action.url", Tags.persistentListOf(new OffersAnalyticsEventSpec("logo_one tap", emptyMap, 4)), false), new LogoViewModel(new OffersAnalyticsEventSpec("logo_two impression", emptyMap, 4), "id_two", new BusinessToken("logo_two"), legacyOffersAvatarViewModel, new StyledText("4% off", (Color) null, 6), "https://action.url", Tags.persistentListOf(new OffersAnalyticsEventSpec("logo_two tap", emptyMap, 4)), false), new LogoViewModel(new OffersAnalyticsEventSpec("logo_three impression", emptyMap, 4), "id_three", new BusinessToken("logo_three"), legacyOffersAvatarViewModel, new StyledText("4% off", (Color) null, 6), "https://action.url", Tags.persistentListOf(new OffersAnalyticsEventSpec("logo_three tap", emptyMap, 4)), false), new LogoViewModel(new OffersAnalyticsEventSpec("logo_four impression", emptyMap, 4), "id_four", new BusinessToken("logo_four"), legacyOffersAvatarViewModel, new StyledText("5% off", (Color) null, 6), "https://action.url", Tags.persistentListOf(new OffersAnalyticsEventSpec("logo_four tap", emptyMap, 4)), false)});
        logosViewModels = listOf;
        OffersSearchListItemViewModel.RecentlyViewedSectionViewModel recentlyViewedSectionViewModel = new OffersSearchListItemViewModel.RecentlyViewedSectionViewModel("section_logo", new OffersAnalyticsEventSpec("logo section impression", (EmptyMap) null, 6), listOf);
        StyledText styledText2 = new StyledText("Trending", (Color) null, 6);
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
        OffersHeaderViewModel offersHeaderViewModel = new OffersHeaderViewModel("header_two", styledText2, null, smallPersistentVector, null);
        OffersHeaderViewModel offersHeaderViewModel2 = new OffersHeaderViewModel("header_one", new StyledText("Recently viewed", (Color) null, 6), null, smallPersistentVector, null);
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new OffersSearchListItemViewModel[]{new OffersSearchListItemViewModel.OffersSearchFilterRowViewModel("row_one", Tags.persistentListOf(new OffersAnalyticsEventSpec("row section impression", (EmptyMap) null, 6)), "row_one_token", new OffersRowViewModel(new LegacyOffersAvatarViewModel((String) null, (String) null, (Character) 'W', ColorsKt.toColor("#0071CE"), Avatar.Shape.SQUIRCLE, 16), new StyledText("Walmart", (Color) null, 6), new StyledText("5% off • Pay in 4", (Color) null, 6), Tags.persistentListOf(new OffersAnalyticsEventSpec("filter_row tap", (EmptyMap) null, 6)), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)), new OffersCommonOfferRowViewModel("common_row", Tags.persistentListOf(new OffersAnalyticsEventSpec("row section impression", (EmptyMap) null, 6)), "common_row_offer", new BusinessToken("home_depot"), "common_row_boost", new OffersRowViewModel(new LegacyOffersAvatarViewModel("https://cash-f.squarecdn.com/static/slimeguyinsnow.png", "https://cash-f.squarecdn.com/static/slimeguyinsnow.png", (Character) 'T', (Color) null, (Avatar.Shape) null, 56), new StyledText("The Home Depot", (Color) null, 6), new StyledText("5% off", (Color) null, 6), Tags.persistentListOf(new OffersAnalyticsEventSpec("row_two tapped", (EmptyMap) null, 6)), new Button(new TapAction(new TapAction$Action$UrlAction(new UrlTapAction("test url")), SVG$Unit$EnumUnboxingLocalUtility.m("row_two button tapped", (Map) null, 14)), null, null, null, new Image("https://cash-images-f.squarecdn.com/discovery/icons/search.png", "https://cash-images-f.squarecdn.com/discovery/icons/search.png", 4), null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES), new OffersSaleChipViewModel(new StyledText("SALE", (Color) null, 6), ColorsKt.toColor("#D8FF14")), 96), "https://action.url")});
        offersRowViewModels = listOf2;
        SEARCH_LISTING_ITEMS = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) listOf2, (Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(offersHeaderViewModel2), (Object) recentlyViewedSectionViewModel), (Object) offersHeaderViewModel)), (Object) new OffersHeaderViewModel("0", new StyledText("Browse all", (Color) null, 6), "https://header.action.url", Tags.persistentListOf(new OffersAnalyticsEventSpec("offers header tap", (EmptyMap) null, 6)), new Button(new TapAction(new TapAction$Action$UrlAction(new UrlTapAction("cash://app")), SVG$Unit$EnumUnboxingLocalUtility.m("offers header button tap", (Map) null, 14)), null, null, null, new Image("https://cash-images-f.squarecdn.com/discovery/icons/calendar.png", "https://cash-images-f.squarecdn.com/discovery/icons/calendar_dark.png", 4), null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES)));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OffersSearchListing(final List list, final FilterGroupsSectionViewModel filterGroupsSectionViewModel, final boolean z, Modifier modifier, final Function1 function1, final Function0 function0, int i, final Function0 function02, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function0 function03;
        int i7;
        GapComposer gapComposer;
        Modifier modifier3;
        final int i8;
        RecomposeScopeImpl endRestartGroup;
        list.getClass();
        filterGroupsSectionViewModel.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        function2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1944036331);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(filterGroupsSectionViewModel) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(z) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
            if ((i2 & 24576) == 0) {
                i4 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i2) == 0) {
                i4 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                i6 = i;
                i4 |= gapComposer2.changed(i6) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                if ((12582912 & i2) == 0) {
                    function03 = function02;
                    i4 |= gapComposer2.changedInstance(function03) ? 8388608 : 4194304;
                } else {
                    function03 = function02;
                }
                if ((100663296 & i2) == 0) {
                    i4 |= gapComposer2.changedInstance(function2) ? 67108864 : 33554432;
                }
                i7 = i4;
                if (gapComposer2.shouldExecute(i7 & 1, (38347923 & i7) != 38347922)) {
                    Modifier modifier4 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    int i10 = i5 != 0 ? 0 : i6;
                    Object[] objArr = {Integer.valueOf(i10)};
                    WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda2(10);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    LazyListState lazyListState = (LazyListState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer2, MLKEMEngine.KyberPolyBytes);
                    if (filterGroupsSectionViewModel.isSticky) {
                        gapComposer2.startReplaceGroup(1448076625);
                        Function0 obtainDismissKeyboard = UtilsKt.obtainDismissKeyboard(gapComposer2);
                        Object[] objArr2 = {Integer.valueOf(i10)};
                        WorkLauncherImpl workLauncherImpl2 = OffersCollapsibleHeaderScaffoldState.Saver;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda2(11);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        gapComposer = gapComposer2;
                        modifier3 = modifier4;
                        UtilsKt.OffersCollapsibleHeaderScaffold(modifier3, (OffersCollapsibleHeaderScaffoldState) SaverKt.m581rememberSaveable(objArr2, (Saver) workLauncherImpl2, (Function0) rememberedValue2, (Composer) gapComposer2, MLKEMEngine.KyberPolyBytes), Expect_jvmKt.rememberComposableLambda(-1515689593, new HelpSheetView$$ExternalSyntheticLambda0(filterGroupsSectionViewModel, function1, obtainDismissKeyboard), gapComposer2), Expect_jvmKt.rememberComposableLambda(1942482760, new MoneyTabUIKt$$ExternalSyntheticLambda32(lazyListState, list, function0, function03, function1, function2, z), gapComposer2), gapComposer, ((i7 >> 9) & 14) | 3456);
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer2;
                        modifier3 = modifier4;
                        gapComposer.startReplaceGroup(1449518776);
                        m3682OffersSearchListingBodygNPyAyM(modifier3, CollectionsKt.plus((Iterable) list, (Collection) CollectionsKt__CollectionsJVMKt.listOf(filterGroupsSectionViewModel)), lazyListState, z, RecyclerView.DECELERATION_RATE, function0, function1, function02, function2, gapComposer, ((i7 >> 9) & 14) | ((i7 << 3) & 7168) | (458752 & i7) | (3670016 & (i7 << 6)) | (29360128 & i7) | (234881024 & i7), 16);
                        gapComposer.end(false);
                    }
                    i8 = i10;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    i8 = i6;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.offers.views.listing.OffersSearchListingKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            OffersSearchListingKt.OffersSearchListing(list, filterGroupsSectionViewModel, z, modifier5, function1, function0, i8, function02, function2, (Composer) obj, Updater.updateChangedFlags(i2 | 1), i3);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i6 = i;
            if ((12582912 & i2) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            i7 = i4;
            if (gapComposer2.shouldExecute(i7 & 1, (38347923 & i7) != 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i;
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        i7 = i4;
        if (gapComposer2.shouldExecute(i7 & 1, (38347923 & i7) != 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: OffersSearchListingBody-gNPyAyM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3682OffersSearchListingBodygNPyAyM(final Modifier modifier, final List list, final LazyListState lazyListState, final boolean z, float f, final Function0 function0, final Function1 function1, final Function0 function02, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        Function1 function12;
        Function0 function03;
        final float f3;
        RecomposeScopeImpl endRestartGroup;
        int i4;
        int i5;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-161480178);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(lazyListState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i) == 0) {
                i3 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if ((1572864 & i) != 0) {
                function12 = function1;
                i3 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                function12 = function1;
            }
            if ((12582912 & i) != 0) {
                function03 = function02;
                i3 |= gapComposer.changedInstance(function03) ? 8388608 : 4194304;
            } else {
                function03 = function02;
            }
            if ((i & 100663296) == 0) {
                i3 |= gapComposer.changedInstance(function2) ? 67108864 : 33554432;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
                gapComposer.skipToGroupEnd();
                f3 = f2;
            } else {
                float f4 = i6 != 0 ? RecyclerView.DECELERATION_RATE : f2;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(function0, gapComposer);
                int i7 = i3 & 896;
                boolean changed = (i7 == 256) | gapComposer.changed(rememberUpdatedState);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    i4 = 5;
                    rememberedValue = new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState, rememberUpdatedState, null, i4);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    i4 = 5;
                }
                Updater.LaunchedEffect(gapComposer, lazyListState, (Function2) rememberedValue);
                Function0 obtainDismissKeyboard = UtilsKt.obtainDismissKeyboard(gapComposer);
                PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, f4, RecyclerView.DECELERATION_RATE, 16.0f, i4);
                boolean changedInstance = gapComposer.changedInstance(list) | (i7 == 256) | ((3670016 & i3) == 1048576) | gapComposer.changed(obtainDismissKeyboard) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((i3 & 7168) == 2048);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    Function1 function13 = function12;
                    i5 = i3;
                    PaymentPasscodeDialogViewKt$$ExternalSyntheticLambda2 paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2 = new PaymentPasscodeDialogViewKt$$ExternalSyntheticLambda2(lazyListState, list, obtainDismissKeyboard, function03, function13, function2, z);
                    gapComposer.updateRememberedValue(paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2);
                    rememberedValue2 = paymentPasscodeDialogViewKt$$ExternalSyntheticLambda2;
                } else {
                    i5 = i3;
                }
                LazyDslKt.LazyColumn(modifier, lazyListState, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, (i5 & 14) | ((i5 >> 3) & 112), 504);
                f3 = f4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.offers.views.listing.OffersSearchListingKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        OffersSearchListingKt.m3682OffersSearchListingBodygNPyAyM(Modifier.this, list, lazyListState, z, f3, function0, function1, function02, function2, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 38347923) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void RenderAsCellSearchResult(OffersRowViewModel offersRowViewModel, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(445917588);
        int i2 = (gapComposer.changed(offersRowViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 8.0f, RecyclerView.DECELERATION_RATE, 2);
            String str = offersRowViewModel.title.text;
            if (str == null) {
                str = "";
            }
            StyledText styledText = offersRowViewModel.subtitle;
            String str2 = styledText != null ? styledText.text : null;
            String str3 = str2 == null ? "" : str2;
            function02 = function0;
            CellDefaultKt.CellSearchResult(Expect_jvmKt.rememberComposableLambda(1794070664, new SuggestionUiKt$$ExternalSyntheticLambda8(offersRowViewModel, 19), gapComposer), str, m300paddingVpY3zN4$default, function02, str3, (Function1) null, gapComposer, ((i2 << 6) & 7168) | 6, 32);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(offersRowViewModel, function02, i, 21);
        }
    }
}
