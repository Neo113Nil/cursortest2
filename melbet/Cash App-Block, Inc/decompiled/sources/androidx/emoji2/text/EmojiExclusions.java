package androidx.emoji2.text;

import android.os.Build;
import app.cash.broadway.screen.Screen;
import app.cash.directory.data.Directory$Section;
import app.cash.directory.data.DirectoryKt;
import app.cash.directory.data.Protos_interopKt;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsDataKt;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfm;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.EntityType;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.backend.db.RecentSearches;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.db.ImageType;
import com.squareup.cash.shopping.db.ShoppingRecentlyViewed;
import com.squareup.cash.shopping.presenters.ShopHubMapperKt$WhenMappings;
import com.squareup.cash.shopping.presenters.ShopHubMapperKt$getRecentViewsAndSearches$1;
import com.squareup.cash.shopping.presenters.ShopHubMapperKt$mapSections$1;
import com.squareup.cash.shopping.screens.EntityInformation;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.MerchantBoostContext;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.viewmodels.ShopHubResultsListItem;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Avatar;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class EmojiExclusions {
    public static final int calculateColIndex(int i, Section.Layout layout) {
        switch (layout.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 6:
                return i / toSpanCount(layout);
            case 1:
            case 3:
            case 5:
            case 7:
                return i % toSpanCount(layout);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    public static final int calculateRowIndex(int i, Section.Layout layout) {
        switch (layout.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 6:
                return i % toSpanCount(layout);
            case 1:
            case 3:
            case 5:
            case 7:
                return i / toSpanCount(layout);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ProcessNextLocalAutoDisplayShortlink.deepLinkSpecs;
    }

    public static Set getEmojiExclusions() {
        return Build.VERSION.SDK_INT >= 34 ? zzfm.getExclusions() : zzfm.getExclusions();
    }

    public static final EntityInformation getEntityInformation(ShoppingScreenContext shoppingScreenContext) {
        if (shoppingScreenContext instanceof ShoppingScreenContext.Directory) {
            return ((ShoppingScreenContext.Directory) shoppingScreenContext).entityInformation;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.DirectorySearch) {
            return ((ShoppingScreenContext.DirectorySearch) shoppingScreenContext).entityInformation;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.CardTab) {
            return ((ShoppingScreenContext.CardTab) shoppingScreenContext).entityInformation;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.MerchantProfile) {
            return ((ShoppingScreenContext.MerchantProfile) shoppingScreenContext).entityInformation;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.ThirdPartyOffer) {
            return ((ShoppingScreenContext.ThirdPartyOffer) shoppingScreenContext).entityInformation;
        }
        if (!(shoppingScreenContext instanceof ShoppingScreenContext.ProductSearch) && !(shoppingScreenContext instanceof ShoppingScreenContext.BrandsSearch) && !(shoppingScreenContext instanceof ShoppingScreenContext.DiscoverBnplCarousel) && !(shoppingScreenContext instanceof ShoppingScreenContext.OffersTab) && !(shoppingScreenContext instanceof ShoppingScreenContext.OffersTimelineSheet)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
        return null;
    }

    public static final String getEntityToken(ShoppingScreenContext shoppingScreenContext) {
        if (shoppingScreenContext instanceof ShoppingScreenContext.DiscoverBnplCarousel) {
            return ((ShoppingScreenContext.DiscoverBnplCarousel) shoppingScreenContext).merchantToken;
        }
        EntityInformation entityInformation = getEntityInformation(shoppingScreenContext);
        if (entityInformation != null) {
            return entityInformation.entityToken;
        }
        return null;
    }

    public static final String getFlowToken(ShoppingScreenContext shoppingScreenContext) {
        shoppingScreenContext.getClass();
        if (shoppingScreenContext instanceof ShoppingScreenContext.Directory) {
            return ((ShoppingScreenContext.Directory) shoppingScreenContext).discoverFlowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.DirectorySearch) {
            return ((ShoppingScreenContext.DirectorySearch) shoppingScreenContext).discoverFlowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.ProductSearch) {
            return ((ShoppingScreenContext.ProductSearch) shoppingScreenContext).shopFlowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.BrandsSearch) {
            return ((ShoppingScreenContext.BrandsSearch) shoppingScreenContext).shopFlowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.MerchantProfile) {
            return ((ShoppingScreenContext.MerchantProfile) shoppingScreenContext).discoverFlowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.DiscoverBnplCarousel) {
            return ((ShoppingScreenContext.DiscoverBnplCarousel) shoppingScreenContext).flowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.ThirdPartyOffer) {
            return ((ShoppingScreenContext.ThirdPartyOffer) shoppingScreenContext).offerFlowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.CardTab) {
            return ((ShoppingScreenContext.CardTab) shoppingScreenContext).flowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.OffersTab) {
            return ((ShoppingScreenContext.OffersTab) shoppingScreenContext).flowToken;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.OffersTimelineSheet) {
            return ((ShoppingScreenContext.OffersTimelineSheet) shoppingScreenContext).flowToken;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final InfoContext getInfoContext(ShoppingWebScreen shoppingWebScreen) {
        shoppingWebScreen.getClass();
        if (shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
            return InfoContext.AffiliateBoost;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.AfterPayShoppingScreen) {
            return InfoContext.AfterPay;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
            return InfoContext.CashAppPay;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) {
            return InfoContext.SingleUseCardPayinFour;
        }
        if (!(shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
        if (iabMetadata instanceof IabMetadata.CashPayMetadata) {
            return InfoContext.CashAppPay;
        }
        if (iabMetadata instanceof IabMetadata.AffiliateBoostMetadata) {
            return InfoContext.AffiliateBoost;
        }
        if (iabMetadata instanceof IabMetadata.AfterpayMetadata) {
            return InfoContext.AfterPay;
        }
        if (iabMetadata instanceof IabMetadata.SUPMetadata) {
            return InfoContext.SingleUseCardPayinFour;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final String getMerchantToken(ShoppingWebScreen shoppingWebScreen) {
        shoppingWebScreen.getClass();
        if (shoppingWebScreen instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) {
            return ((ShoppingWebScreen.SingleUsePaymentShoppingScreen) shoppingWebScreen).merchantId;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
            return ((ShoppingWebScreen.AffiliateShoppingScreen) shoppingWebScreen).merchantToken;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
            return ((ShoppingWebScreen.IncentiveShoppingScreen) shoppingWebScreen).merchantToken;
        }
        if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
            return ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).entityInformation.business_token;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [com.squareup.cash.common.viewmodels.ColorModel$Accented] */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r62v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable getRecentViewsAndSearches(RealRecentSearchManager realRecentSearchManager, Directory$Section directory$Section, int i, ContinuationImpl continuationImpl) {
        ShopHubMapperKt$getRecentViewsAndSearches$1 shopHubMapperKt$getRecentViewsAndSearches$1;
        int i2;
        Directory$Section directory$Section2;
        Object obj;
        int i3;
        List list;
        List list2;
        DirectoryListItem.Header header;
        if (continuationImpl instanceof ShopHubMapperKt$getRecentViewsAndSearches$1) {
            shopHubMapperKt$getRecentViewsAndSearches$1 = (ShopHubMapperKt$getRecentViewsAndSearches$1) continuationImpl;
            int i4 = shopHubMapperKt$getRecentViewsAndSearches$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                shopHubMapperKt$getRecentViewsAndSearches$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj2 = shopHubMapperKt$getRecentViewsAndSearches$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = shopHubMapperKt$getRecentViewsAndSearches$1.label;
                IntRange intRange = null;
                ?? r6 = 0;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    directory$Section2 = directory$Section;
                    shopHubMapperKt$getRecentViewsAndSearches$1.L$1 = directory$Section2;
                    shopHubMapperKt$getRecentViewsAndSearches$1.I$0 = i;
                    shopHubMapperKt$getRecentViewsAndSearches$1.label = 1;
                    Object withContext = JobKt.withContext(realRecentSearchManager.ioDispatcher, new RealQrCodesPresenter$models$1$1(realRecentSearchManager, r6 == true ? 1 : 0, 24), shopHubMapperKt$getRecentViewsAndSearches$1);
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = withContext;
                    i3 = i;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = shopHubMapperKt$getRecentViewsAndSearches$1.I$0;
                    Directory$Section directory$Section3 = shopHubMapperKt$getRecentViewsAndSearches$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    obj = obj2;
                    directory$Section2 = directory$Section3;
                }
                RecentSearches recentSearches = (RecentSearches) obj;
                list = recentSearches.viewed;
                list2 = recentSearches.searches;
                if (!list.isEmpty() && list2.isEmpty()) {
                    return null;
                }
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                header = header(directory$Section2, "RECENT_SEARCHES_HEADER_ID", "recent_searches_id");
                if (header != null) {
                    createListBuilder.add(header);
                }
                if (!list.isEmpty()) {
                    Section.Layout layout = Section.Layout.ONE_ROW;
                    String str = directory$Section2.id;
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it = list3.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            ?? r62 = intRange;
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw r62;
                        }
                        ShoppingRecentlyViewed shoppingRecentlyViewed = (ShoppingRecentlyViewed) next;
                        DirectoryAnalyticsData.EntityType entityType = DirectoryAnalyticsDataKt.toEntityType(shoppingRecentlyViewed.f1205type);
                        String str2 = shoppingRecentlyViewed.token;
                        List list4 = list;
                        DirectoryListItem.ItemViewModel.Text text = new DirectoryListItem.ItemViewModel.Text(new Text(shoppingRecentlyViewed.title, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62), intRange, 6);
                        ?? r25 = 0 == true ? 1 : 0;
                        Recipient recipient = new Recipient(null, false, false, 0 == true ? 1 : 0, r25, null, false, false, false, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, -1, 63);
                        String str3 = shoppingRecentlyViewed.action_url;
                        IntRange intRange2 = intRange;
                        Iterator it2 = it;
                        Image image = new Image(shoppingRecentlyViewed.light_image_url, shoppingRecentlyViewed.dark_image_url, 4);
                        String str4 = shoppingRecentlyViewed.action_url;
                        Color color = shoppingRecentlyViewed.accent_color;
                        AvatarViewModel avatarViewModel = new AvatarViewModel(image, (ColorModel.Accented) (color != null ? new ColorModel.Accented(color) : intRange2), (String) null, (String) null, false, true, (String) null, (String) null, (String) null, (AvatarBadgeViewModel) null, str4, false, false, 30617);
                        DirectoryAnalyticsData.EventType eventType = DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM;
                        String str5 = directory$Section2.id;
                        String str6 = directory$Section2.serverId;
                        Text text2 = directory$Section2.title;
                        arrayList.add(new DirectoryListItem.ItemViewModel(str2, recipient, avatarViewModel, text, null, null, null, null, str3, null, new DirectoryAnalyticsData(new DirectoryAnalyticsData.SectionAnalyticsData(str5, str6, text2 != null ? text2.text : intRange2, Integer.valueOf(i3), 8052), new DirectoryAnalyticsData.ItemAnalyticsData(shoppingRecentlyViewed.token, String.valueOf(entityType), null, Integer.valueOf(i5), Integer.valueOf(calculateRowIndex(i5, layout)), Integer.valueOf(calculateColIndex(i5, layout)), Integer.valueOf(list4.size()), null, null, null, null, null, null, null, null, 1073734567), null, null, entityType, 412), null, 2078680));
                        list = list4;
                        it = it2;
                        intRange = intRange2;
                        i5 = i6;
                    }
                    createListBuilder.add(new DirectoryListItem.AvatarSectionViewModel(str, arrayList, layout));
                }
                if (!list2.isEmpty()) {
                    createListBuilder.add(toTextRowSectionViewModel(list2, directory$Section2, i3));
                }
                return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            }
        }
        shopHubMapperKt$getRecentViewsAndSearches$1 = new ShopHubMapperKt$getRecentViewsAndSearches$1(continuationImpl);
        Object obj22 = shopHubMapperKt$getRecentViewsAndSearches$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = shopHubMapperKt$getRecentViewsAndSearches$1.label;
        IntRange intRange3 = null;
        ?? r63 = 0;
        if (i2 != 0) {
        }
        RecentSearches recentSearches2 = (RecentSearches) obj;
        list = recentSearches2.viewed;
        list2 = recentSearches2.searches;
        if (!list.isEmpty()) {
        }
        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        header = header(directory$Section2, "RECENT_SEARCHES_HEADER_ID", "recent_searches_id");
        if (header != null) {
        }
        if (!list.isEmpty()) {
        }
        if (!list2.isEmpty()) {
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
    }

    public static final DirectoryListItem.Header header(Directory$Section directory$Section, String str, String str2) {
        directory$Section.getClass();
        Text text = directory$Section.title;
        if (text == null || text.text == null) {
            return null;
        }
        String str3 = directory$Section.id;
        String str4 = str3.length() == 0 ? str : str3;
        DirectoryListItem.ItemViewModel.Text text2 = text != null ? new DirectoryListItem.ItemViewModel.Text(text, null, 6) : null;
        Text text3 = directory$Section.subtitle;
        return new DirectoryListItem.Header(str4, text2, text3 != null ? new DirectoryListItem.ItemViewModel.Text(text3, null, 6) : null, null, str2, directory$Section.headerButton, 968);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0877, code lost:
    
        r0 = r6;
        r3 = r7;
        r1 = r10;
        r10 = r12;
        r11 = r13;
        r21 = r15;
        r19 = true;
        r13 = r4;
        r6 = r5;
        r12 = r8;
        r8 = r14;
        r5 = r81;
        r4 = r82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0877, code lost:
    
        r5 = r82;
        r13 = r84;
        r3 = r14;
        r0 = r20;
        r6 = r21;
        r12 = r37;
        r1 = r38;
        r10 = r39;
        r8 = r40;
        r4 = r41;
        r19 = true;
        r21 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r15v26, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0864 -> B:16:0x0877). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0226 -> B:12:0x0232). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable mapSections(SearchResults searchResults, AndroidStringManager androidStringManager, boolean z, RealRecentSearchManager realRecentSearchManager, ShopHubResultsListItem.ProgressIndicator progressIndicator, ContinuationImpl continuationImpl) {
        ShopHubMapperKt$mapSections$1 shopHubMapperKt$mapSections$1;
        int i;
        SearchCommonPlaceholderSection.Identifier identifier;
        ShopHubResultsListItem shopHubResultsListItem;
        List createListBuilder;
        List list;
        ShopHubMapperKt$mapSections$1 shopHubMapperKt$mapSections$12;
        Iterator it;
        int i2;
        int i3;
        int i4;
        AndroidStringManager androidStringManager2;
        boolean z2;
        RealRecentSearchManager realRecentSearchManager2;
        AndroidStringManager androidStringManager3;
        CoroutineSingletons coroutineSingletons;
        RealRecentSearchManager realRecentSearchManager3;
        ShopHubResultsListItem shopHubResultsListItem2;
        List list2;
        Directory$Section directory$Section;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        List list3;
        ShopHubMapperKt$mapSections$1 shopHubMapperKt$mapSections$13;
        int i9;
        int i10;
        int i11;
        boolean z4;
        Iterator it2;
        List list4;
        ShopHubResultsListItem shopHubResultsListItem3;
        List build;
        DirectoryListItem.ItemViewModel.Text text;
        DirectoryListItem.ItemViewModel.Text text2;
        String str;
        Image image;
        AvatarViewModel avatarViewModel;
        Image image2;
        int i12;
        boolean z5;
        CoroutineSingletons coroutineSingletons2;
        List list5;
        List list6;
        Iterator it3;
        Directory$Section directory$Section2;
        boolean z6;
        int i13;
        RealRecentSearchManager realRecentSearchManager4;
        AndroidStringManager androidStringManager4;
        int i14;
        int i15;
        int i16;
        ShopHubResultsListItem shopHubResultsListItem4;
        List list7;
        ShopHubMapperKt$mapSections$1 shopHubMapperKt$mapSections$14;
        ShopHubResultsListItem shopHubResultsListItem5;
        List build2;
        int i17;
        AndroidStringManager androidStringManager5;
        boolean z7;
        RealRecentSearchManager realRecentSearchManager5;
        ShopHubMapperKt$mapSections$1 shopHubMapperKt$mapSections$15;
        int i18;
        int i19;
        Iterator it4;
        List list8;
        int i20;
        String str2;
        String str3;
        String str4;
        Section.Layout layout;
        int i21;
        String str5;
        String str6;
        if (continuationImpl instanceof ShopHubMapperKt$mapSections$1) {
            shopHubMapperKt$mapSections$1 = (ShopHubMapperKt$mapSections$1) continuationImpl;
            int i22 = shopHubMapperKt$mapSections$1.label;
            if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                shopHubMapperKt$mapSections$1.label = i22 - PKIFailureInfo.systemUnavail;
                Object obj = shopHubMapperKt$mapSections$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shopHubMapperKt$mapSections$1.label;
                if (i != 0) {
                    identifier = null;
                    SafeTrace.throwOnFailure(obj);
                    shopHubResultsListItem = progressIndicator;
                    createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    list = createListBuilder;
                    shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$1;
                    it = searchResults.sections.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    androidStringManager2 = androidStringManager;
                    z2 = z;
                    realRecentSearchManager2 = realRecentSearchManager;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    i8 = shopHubMapperKt$mapSections$1.I$3;
                    i7 = shopHubMapperKt$mapSections$1.I$2;
                    i6 = shopHubMapperKt$mapSections$1.I$1;
                    i5 = shopHubMapperKt$mapSections$1.I$0;
                    z3 = shopHubMapperKt$mapSections$1.Z$0;
                    directory$Section = shopHubMapperKt$mapSections$1.L$9;
                    it = shopHubMapperKt$mapSections$1.L$7;
                    list = shopHubMapperKt$mapSections$1.L$5;
                    list2 = shopHubMapperKt$mapSections$1.L$4;
                    shopHubResultsListItem2 = shopHubMapperKt$mapSections$1.L$3;
                    realRecentSearchManager3 = shopHubMapperKt$mapSections$1.L$2;
                    AndroidStringManager androidStringManager6 = shopHubMapperKt$mapSections$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    androidStringManager3 = androidStringManager6;
                    coroutineSingletons = coroutineSingletons3;
                    list3 = (List) obj;
                    if (list3.isEmpty()) {
                    }
                    if (!build.isEmpty()) {
                    }
                    shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$13;
                    i4 = i9;
                    realRecentSearchManager2 = realRecentSearchManager3;
                    androidStringManager2 = androidStringManager3;
                    i2 = i10;
                    i12 = i11;
                    z2 = z4;
                    it = it2;
                    createListBuilder = list4;
                    shopHubResultsListItem = shopHubResultsListItem3;
                    z5 = true;
                    coroutineSingletons2 = coroutineSingletons;
                    i3 = i12;
                    coroutineSingletons3 = coroutineSingletons2;
                    identifier = null;
                    if (!it.hasNext()) {
                    }
                } else if (i == 2) {
                    i16 = shopHubMapperKt$mapSections$1.I$3;
                    i15 = shopHubMapperKt$mapSections$1.I$2;
                    i14 = shopHubMapperKt$mapSections$1.I$1;
                    i13 = shopHubMapperKt$mapSections$1.I$0;
                    z6 = shopHubMapperKt$mapSections$1.Z$0;
                    directory$Section2 = shopHubMapperKt$mapSections$1.L$9;
                    it3 = shopHubMapperKt$mapSections$1.L$7;
                    list6 = shopHubMapperKt$mapSections$1.L$5;
                    list5 = shopHubMapperKt$mapSections$1.L$4;
                    ShopHubResultsListItem shopHubResultsListItem6 = shopHubMapperKt$mapSections$1.L$3;
                    realRecentSearchManager4 = shopHubMapperKt$mapSections$1.L$2;
                    androidStringManager4 = shopHubMapperKt$mapSections$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons = coroutineSingletons3;
                    shopHubResultsListItem4 = shopHubResultsListItem6;
                    list7 = (List) obj;
                    if (list7.isEmpty()) {
                    }
                    if (!build2.isEmpty()) {
                    }
                    androidStringManager2 = androidStringManager4;
                    realRecentSearchManager2 = realRecentSearchManager4;
                    z2 = z6;
                    it = it3;
                    list = list6;
                    coroutineSingletons2 = coroutineSingletons;
                    z5 = true;
                    i4 = i15;
                    i2 = i14;
                    i12 = i13;
                    createListBuilder = list5;
                    shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$14;
                    shopHubResultsListItem = shopHubResultsListItem5;
                    i3 = i12;
                    coroutineSingletons3 = coroutineSingletons2;
                    identifier = null;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i23 = shopHubMapperKt$mapSections$1.I$2;
                    int i24 = shopHubMapperKt$mapSections$1.I$1;
                    i12 = shopHubMapperKt$mapSections$1.I$0;
                    boolean z8 = shopHubMapperKt$mapSections$1.Z$0;
                    Iterator it5 = shopHubMapperKt$mapSections$1.L$7;
                    List list9 = shopHubMapperKt$mapSections$1.L$5;
                    createListBuilder = shopHubMapperKt$mapSections$1.L$4;
                    shopHubResultsListItem = shopHubMapperKt$mapSections$1.L$3;
                    RealRecentSearchManager realRecentSearchManager6 = shopHubMapperKt$mapSections$1.L$2;
                    AndroidStringManager androidStringManager7 = shopHubMapperKt$mapSections$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons = coroutineSingletons3;
                    List list10 = list9;
                    List list11 = (List) obj;
                    if (list11 != null) {
                        list10.add(new ShopHubResultsListItem.Results(list11));
                    }
                    RealRecentSearchManager realRecentSearchManager7 = realRecentSearchManager6;
                    shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$1;
                    z2 = z8;
                    i4 = i23;
                    realRecentSearchManager2 = realRecentSearchManager7;
                    androidStringManager2 = androidStringManager7;
                    i2 = i24;
                    it = it5;
                    coroutineSingletons2 = coroutineSingletons;
                    z5 = true;
                    list = list10;
                    i3 = i12;
                    coroutineSingletons3 = coroutineSingletons2;
                    identifier = null;
                    if (!it.hasNext()) {
                        Object next = it.next();
                        int i25 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        Directory$Section directory$Section3 = (Directory$Section) next;
                        SearchCommonPlaceholderSection searchCommonPlaceholderSection = directory$Section3.searchCommonPlaceholderSection;
                        String str7 = directory$Section3.serverId;
                        List list12 = createListBuilder;
                        Section.Layout layout2 = directory$Section3.layout;
                        String str8 = directory$Section3.id;
                        Text text3 = directory$Section3.subtitle;
                        Text text4 = directory$Section3.title;
                        SearchCommonPlaceholderSection.Identifier identifier2 = searchCommonPlaceholderSection != null ? searchCommonPlaceholderSection.identifier : identifier;
                        if (identifier2 == null) {
                            coroutineSingletons2 = coroutineSingletons3;
                            i17 = -1;
                        } else {
                            coroutineSingletons2 = coroutineSingletons3;
                            i17 = ShopHubMapperKt$WhenMappings.$EnumSwitchMapping$1[identifier2.ordinal()];
                        }
                        int i26 = i4;
                        int i27 = 7;
                        if (i17 == -1) {
                            androidStringManager5 = androidStringManager2;
                            CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                            int ordinal = directory$Section3.f908type.ordinal();
                            if (ordinal == 0) {
                                z7 = z2;
                                realRecentSearchManager5 = realRecentSearchManager2;
                                shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                                i18 = i2;
                                i19 = i3;
                                it4 = it;
                                list8 = list;
                                i20 = i25;
                                coroutineSingletons2 = coroutineSingletons4;
                                z5 = true;
                                String str9 = text4 != null ? text4.text : null;
                                ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                Section.Layout layout3 = layout2 == null ? Section.Layout.THREE_COLUMNS : layout2;
                                String str10 = "avatars_id";
                                String str11 = str8.length() == 0 ? "avatars_id" : str8;
                                if (str7 != null && str7.length() != 0) {
                                    str10 = str7;
                                }
                                if (text4 != null) {
                                    createListBuilder2.add(new DirectoryListItem.Header(str8.length() == 0 ? "AVATAR_HEADER_ID" : str8, new DirectoryListItem.ItemViewModel.Text(text4, null, 6), text3 != null ? new DirectoryListItem.ItemViewModel.Text(text3, null, 6) : null, directory$Section3.headerActionUrl, str11, directory$Section3.headerButton, 960));
                                }
                                createListBuilder2.add(new DirectoryListItem.AvatarSectionViewModel(str11, toItemViewModels(directory$Section3.items, str11, str10, i26, layout3, str9), layout3));
                                list8.add(new ShopHubResultsListItem.Results(CollectionsKt__CollectionsJVMKt.build(createListBuilder2)));
                            } else if (ordinal == 1) {
                                z7 = z2;
                                realRecentSearchManager5 = realRecentSearchManager2;
                                shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                                i18 = i2;
                                i19 = i3;
                                it4 = it;
                                z5 = true;
                                i20 = i25;
                                coroutineSingletons2 = coroutineSingletons4;
                                list8 = list;
                                String str12 = text4 != null ? text4.text : null;
                                ListBuilder createListBuilder3 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                Section.Layout layout4 = layout2 == null ? Section.Layout.TWO_ROWS : layout2;
                                String str13 = "rows_id";
                                String str14 = str8.length() == 0 ? "rows_id" : str8;
                                if (str7 != null && str7.length() != 0) {
                                    str13 = str7;
                                }
                                if (text4 != null) {
                                    createListBuilder3.add(new DirectoryListItem.Header(str8.length() == 0 ? "ROW_HEADER_ID" : str8, new DirectoryListItem.ItemViewModel.Text(text4, null, 6), text3 != null ? new DirectoryListItem.ItemViewModel.Text(text3, null, 6) : null, directory$Section3.headerActionUrl, str14, directory$Section3.headerButton, 960));
                                }
                                createListBuilder3.add(new DirectoryListItem.RowSectionViewModel(str14, toItemViewModels(directory$Section3.items, str14, str13, i26, layout4, str12), layout4));
                                list8.add(new ShopHubResultsListItem.Results(CollectionsKt__CollectionsJVMKt.build(createListBuilder3)));
                            } else if (ordinal != 3) {
                                z7 = z2;
                                if (ordinal == 4) {
                                    if (text4 != null) {
                                        coroutineSingletons2 = coroutineSingletons4;
                                        str4 = text4.text;
                                    } else {
                                        coroutineSingletons2 = coroutineSingletons4;
                                        str4 = null;
                                    }
                                    ListBuilder createListBuilder4 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                    if (layout2 == null) {
                                        i20 = i25;
                                        layout = Section.Layout.ONE_COLUMN;
                                    } else {
                                        i20 = i25;
                                        layout = layout2;
                                    }
                                    String str15 = str8.length() == 0 ? "text_rows_id" : str8;
                                    String str16 = (str7 == null || str7.length() == 0) ? "text_rows_id" : str7;
                                    if (text4 == null) {
                                        i21 = i26;
                                        realRecentSearchManager5 = realRecentSearchManager2;
                                        shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                                    } else {
                                        i21 = i26;
                                        realRecentSearchManager5 = realRecentSearchManager2;
                                        shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                                        createListBuilder4.add(new DirectoryListItem.Header(str8.length() == 0 ? "TEXT_ROW_HEADER_ID" : str8, new DirectoryListItem.ItemViewModel.Text(text4, null, 6), text3 != null ? new DirectoryListItem.ItemViewModel.Text(text3, null, 6) : null, directory$Section3.headerActionUrl, str15, null, 992));
                                    }
                                    Iterator it6 = it;
                                    list8 = list;
                                    createListBuilder4.add(new DirectoryListItem.TextRowSectionViewModel(str8.length() == 0 ? "text_rows_id" : str8, toItemViewModels(directory$Section3.items, str15, str16, i21, layout, str4), true, layout));
                                    list8.add(new ShopHubResultsListItem.Results(CollectionsKt__CollectionsJVMKt.build(createListBuilder4)));
                                    it4 = it6;
                                    i18 = i2;
                                    i19 = i3;
                                    z5 = true;
                                } else {
                                    if (ordinal != 7) {
                                        OptionalProvider$$ExternalSyntheticLambda0.m();
                                        return null;
                                    }
                                    ListBuilder createListBuilder5 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                    SearchCommonMessageSection searchCommonMessageSection = directory$Section3.searchMessageSection;
                                    if (searchCommonMessageSection == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                        return null;
                                    }
                                    String str17 = str8.length() == 0 ? "message_id" : str8;
                                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text5 = searchCommonMessageSection.primary_text;
                                    Text compat = text5 != null ? Protos_interopKt.compat(text5) : null;
                                    if (compat == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                        return null;
                                    }
                                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text6 = searchCommonMessageSection.secondary_text;
                                    Text compat2 = text6 != null ? Protos_interopKt.compat(text6) : null;
                                    if (compat2 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                        return null;
                                    }
                                    Image image3 = searchCommonMessageSection.picture;
                                    if (image3 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                        return null;
                                    }
                                    createListBuilder5.add(new DirectoryListItem.MessageSectionViewModel(str17, compat, compat2, image3, directory$Section3.footerButton));
                                    list.add(new ShopHubResultsListItem.Results(CollectionsKt__CollectionsJVMKt.build(createListBuilder5)));
                                    realRecentSearchManager5 = realRecentSearchManager2;
                                    shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                                    i18 = i2;
                                    i19 = i3;
                                    it4 = it;
                                    list8 = list;
                                    i20 = i25;
                                    coroutineSingletons2 = coroutineSingletons4;
                                    z5 = true;
                                }
                            } else {
                                z7 = z2;
                                realRecentSearchManager5 = realRecentSearchManager2;
                                shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                                Iterator it7 = it;
                                i20 = i25;
                                coroutineSingletons2 = coroutineSingletons4;
                                list8 = list;
                                ListBuilder createListBuilder6 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                Button button = directory$Section3.footerButton;
                                Section.Layout layout5 = layout2 == null ? Section.Layout.TWO_COLUMNS : layout2;
                                String str18 = "cards_id";
                                String str19 = str8.length() == 0 ? "cards_id" : str8;
                                if (str7 != null && str7.length() != 0) {
                                    str18 = str7;
                                }
                                if (text4 == null) {
                                    it4 = it7;
                                    i18 = i2;
                                    i19 = i3;
                                } else {
                                    it4 = it7;
                                    i18 = i2;
                                    i19 = i3;
                                    createListBuilder6.add(new DirectoryListItem.Header(str8.length() == 0 ? "CARD_HEADER_ID" : str8, new DirectoryListItem.ItemViewModel.Text(text4, null, 6), text3 != null ? new DirectoryListItem.ItemViewModel.Text(text3, null, 6) : null, directory$Section3.headerActionUrl, str19, directory$Section3.headerButton, 960));
                                }
                                List list13 = directory$Section3.items;
                                if (text4 != null) {
                                    str2 = str18;
                                    str3 = text4.text;
                                } else {
                                    str2 = str18;
                                    str3 = null;
                                }
                                z5 = true;
                                createListBuilder6.add(new DirectoryListItem.CardSectionViewModel(str19, toItemViewModels(list13, str19, str2, i26, layout5, str3), layout5));
                                if (button != null) {
                                    createListBuilder6.add(new DirectoryListItem.Footer(str8.length() == 0 ? "CARD_FOOTER_ID" : str8, button));
                                }
                                list8.add(new ShopHubResultsListItem.Results(CollectionsKt__CollectionsJVMKt.build(createListBuilder6)));
                            }
                        } else if (i17 == 1) {
                            coroutineSingletons = coroutineSingletons2;
                            if (z2) {
                                shopHubMapperKt$mapSections$12.L$1 = androidStringManager2;
                                shopHubMapperKt$mapSections$12.L$2 = realRecentSearchManager2;
                                shopHubMapperKt$mapSections$12.L$3 = shopHubResultsListItem;
                                shopHubMapperKt$mapSections$12.L$4 = list12;
                                shopHubMapperKt$mapSections$12.L$5 = list;
                                shopHubMapperKt$mapSections$12.L$7 = it;
                                shopHubMapperKt$mapSections$12.L$9 = directory$Section3;
                                shopHubMapperKt$mapSections$12.Z$0 = z2;
                                shopHubMapperKt$mapSections$12.I$0 = i3;
                                shopHubMapperKt$mapSections$12.I$1 = i2;
                                shopHubMapperKt$mapSections$12.I$2 = i25;
                                shopHubMapperKt$mapSections$12.I$3 = i26;
                                shopHubMapperKt$mapSections$12.label = 1;
                                androidStringManager3 = androidStringManager2;
                                obj = JobKt.withContext(realRecentSearchManager2.ioDispatcher, new ShoppingWebBridge$loadUrl$1(realRecentSearchManager2, (Continuation) null, 8), shopHubMapperKt$mapSections$12);
                                if (obj != coroutineSingletons) {
                                    int i28 = i3;
                                    z3 = z2;
                                    shopHubMapperKt$mapSections$1 = shopHubMapperKt$mapSections$12;
                                    i6 = i2;
                                    i5 = i28;
                                    shopHubResultsListItem2 = shopHubResultsListItem;
                                    directory$Section = directory$Section3;
                                    i7 = i25;
                                    list2 = list12;
                                    realRecentSearchManager3 = realRecentSearchManager2;
                                    i8 = i26;
                                    list3 = (List) obj;
                                    if (list3.isEmpty()) {
                                        ListBuilder createListBuilder7 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                        DirectoryListItem.Header header = header(directory$Section, "RECENT_VIEWS_HEADER_ID", "recent_views_id");
                                        if (header != null) {
                                            createListBuilder7.add(header);
                                        }
                                        Section.Layout layout6 = Section.Layout.ONE_ROW;
                                        String str20 = directory$Section.id;
                                        shopHubMapperKt$mapSections$13 = shopHubMapperKt$mapSections$1;
                                        List list14 = list3;
                                        int i29 = i8;
                                        i9 = i7;
                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list14, 10));
                                        Iterator it8 = list14.iterator();
                                        int i30 = 0;
                                        while (it8.hasNext()) {
                                            Object next2 = it8.next();
                                            int i31 = i30 + 1;
                                            if (i30 < 0) {
                                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                throw null;
                                            }
                                            Iterator it9 = it8;
                                            ShoppingRecentlyViewed shoppingRecentlyViewed = (ShoppingRecentlyViewed) next2;
                                            int i32 = i6;
                                            String str21 = shoppingRecentlyViewed.token;
                                            String str22 = shoppingRecentlyViewed.dark_image_url;
                                            int i33 = i5;
                                            String str23 = shoppingRecentlyViewed.light_image_url;
                                            boolean z9 = z3;
                                            Metadata.EntityType entityType = shoppingRecentlyViewed.f1205type;
                                            ImageType imageType = shoppingRecentlyViewed.imageType;
                                            Iterator it10 = it;
                                            List list15 = list2;
                                            ShopHubResultsListItem shopHubResultsListItem7 = shopHubResultsListItem2;
                                            DirectoryListItem.ItemViewModel.Text text7 = new DirectoryListItem.ItemViewModel.Text(new Text(shoppingRecentlyViewed.title, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62), null, 6);
                                            String str24 = shoppingRecentlyViewed.subtitle;
                                            if (str24 != null) {
                                                text = text7;
                                                text2 = new DirectoryListItem.ItemViewModel.Text(new Text(str24, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62), null, 6);
                                            } else {
                                                text = text7;
                                                text2 = null;
                                            }
                                            Recipient recipient = new Recipient(null, false, false, null, null, null, false, false, false, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, -1, 63);
                                            String str25 = shoppingRecentlyViewed.action_url;
                                            int ordinal2 = imageType.ordinal();
                                            if (ordinal2 == 0) {
                                                str = str25;
                                                image = null;
                                                avatarViewModel = null;
                                            } else {
                                                if (ordinal2 != 1) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                Image image4 = new Image(str23, str22, 4);
                                                String str26 = shoppingRecentlyViewed.action_url;
                                                Color color = shoppingRecentlyViewed.accent_color;
                                                str = str25;
                                                avatarViewModel = new AvatarViewModel(image4, color != null ? new ColorModel.Accented(color) : null, (String) null, (String) null, false, true, (String) null, (String) null, (String) null, (AvatarBadgeViewModel) null, str26, false, false, 30617);
                                                image = null;
                                            }
                                            int ordinal3 = imageType.ordinal();
                                            if (ordinal3 == 0) {
                                                image2 = new Image(str23, str22, 4);
                                            } else {
                                                if (ordinal3 != 1) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return image;
                                                }
                                                image2 = image;
                                            }
                                            DirectoryAnalyticsData.EventType eventType = DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM;
                                            DirectoryAnalyticsData.EntityType entityType2 = DirectoryAnalyticsDataKt.toEntityType(entityType);
                                            String str27 = directory$Section.id;
                                            String str28 = directory$Section.serverId;
                                            Text text8 = directory$Section.title;
                                            arrayList.add(new DirectoryListItem.ItemViewModel(str21, recipient, avatarViewModel, text, text2, null, null, null, str, null, new DirectoryAnalyticsData(new DirectoryAnalyticsData.SectionAnalyticsData(str27, str28, text8 != null ? text8.text : null, Integer.valueOf(i29), 8052), new DirectoryAnalyticsData.ItemAnalyticsData(shoppingRecentlyViewed.token, String.valueOf(DirectoryAnalyticsDataKt.toEntityType(entityType)), null, Integer.valueOf(i30), Integer.valueOf(calculateRowIndex(i30, layout6)), Integer.valueOf(calculateColIndex(i30, layout6)), Integer.valueOf(list3.size()), null, null, null, null, null, null, null, null, 1073734567), null, null, entityType2, 412), image2, 2045848));
                                            it8 = it9;
                                            i6 = i32;
                                            i30 = i31;
                                            i5 = i33;
                                            z3 = z9;
                                            it = it10;
                                            list2 = list15;
                                            shopHubResultsListItem2 = shopHubResultsListItem7;
                                        }
                                        i10 = i6;
                                        i11 = i5;
                                        z4 = z3;
                                        it2 = it;
                                        list4 = list2;
                                        shopHubResultsListItem3 = shopHubResultsListItem2;
                                        createListBuilder7.add(new DirectoryListItem.CardAvatarSectionViewModel(str20, arrayList));
                                        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder7);
                                    } else {
                                        build = EmptyList.INSTANCE;
                                        shopHubMapperKt$mapSections$13 = shopHubMapperKt$mapSections$1;
                                        i9 = i7;
                                        i10 = i6;
                                        i11 = i5;
                                        z4 = z3;
                                        it2 = it;
                                        list4 = list2;
                                        shopHubResultsListItem3 = shopHubResultsListItem2;
                                    }
                                    if (!build.isEmpty()) {
                                        list.add(new ShopHubResultsListItem.Results(build));
                                    }
                                    shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$13;
                                    i4 = i9;
                                    realRecentSearchManager2 = realRecentSearchManager3;
                                    androidStringManager2 = androidStringManager3;
                                    i2 = i10;
                                    i12 = i11;
                                    z2 = z4;
                                    it = it2;
                                    createListBuilder = list4;
                                    shopHubResultsListItem = shopHubResultsListItem3;
                                    z5 = true;
                                    coroutineSingletons2 = coroutineSingletons;
                                    i3 = i12;
                                    coroutineSingletons3 = coroutineSingletons2;
                                    identifier = null;
                                    if (!it.hasNext()) {
                                        List list16 = createListBuilder;
                                        List list17 = list;
                                        if (shopHubResultsListItem != null) {
                                            list17.add(shopHubResultsListItem);
                                        }
                                        return CollectionsKt__CollectionsJVMKt.build(list16);
                                    }
                                }
                                return coroutineSingletons;
                            }
                            androidStringManager5 = androidStringManager2;
                            z7 = z2;
                            realRecentSearchManager5 = realRecentSearchManager2;
                            shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                            i18 = i2;
                            i19 = i3;
                            it4 = it;
                            list8 = list;
                            i20 = i25;
                            coroutineSingletons2 = coroutineSingletons;
                            z5 = true;
                        } else {
                            if (i17 == 2) {
                                if (z2) {
                                    shopHubMapperKt$mapSections$12.L$1 = androidStringManager2;
                                    shopHubMapperKt$mapSections$12.L$2 = realRecentSearchManager2;
                                    shopHubMapperKt$mapSections$12.L$3 = shopHubResultsListItem;
                                    shopHubMapperKt$mapSections$12.L$4 = list12;
                                    shopHubMapperKt$mapSections$12.L$5 = list;
                                    shopHubMapperKt$mapSections$12.L$7 = it;
                                    shopHubMapperKt$mapSections$12.L$9 = directory$Section3;
                                    shopHubMapperKt$mapSections$12.Z$0 = z2;
                                    shopHubMapperKt$mapSections$12.I$0 = i3;
                                    shopHubMapperKt$mapSections$12.I$1 = i2;
                                    shopHubMapperKt$mapSections$12.I$2 = i25;
                                    shopHubMapperKt$mapSections$12.I$3 = i26;
                                    shopHubMapperKt$mapSections$12.label = 2;
                                    Object withContext = JobKt.withContext(realRecentSearchManager2.ioDispatcher, new ChatInputView$Content$1$1$1(realRecentSearchManager2, identifier, i27), shopHubMapperKt$mapSections$12);
                                    coroutineSingletons = coroutineSingletons2;
                                    if (withContext != coroutineSingletons) {
                                        list6 = list;
                                        directory$Section2 = directory$Section3;
                                        it3 = it;
                                        z6 = z2;
                                        shopHubMapperKt$mapSections$1 = shopHubMapperKt$mapSections$12;
                                        i14 = i2;
                                        androidStringManager4 = androidStringManager2;
                                        obj = withContext;
                                        i13 = i3;
                                        realRecentSearchManager4 = realRecentSearchManager2;
                                        i16 = i26;
                                        shopHubResultsListItem4 = shopHubResultsListItem;
                                        i15 = i25;
                                        list5 = list12;
                                        list7 = (List) obj;
                                        if (list7.isEmpty()) {
                                            ListBuilder createListBuilder8 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                            shopHubMapperKt$mapSections$14 = shopHubMapperKt$mapSections$1;
                                            shopHubResultsListItem5 = shopHubResultsListItem4;
                                            DirectoryListItem.Header header2 = header(directory$Section2, "RECENT_SEARCHES_HEADER_ID", "recent_searches_id");
                                            if (header2 != null) {
                                                createListBuilder8.add(header2);
                                            }
                                            createListBuilder8.add(toTextRowSectionViewModel(list7, directory$Section2, i16));
                                            build2 = CollectionsKt__CollectionsJVMKt.build(createListBuilder8);
                                        } else {
                                            build2 = EmptyList.INSTANCE;
                                            shopHubMapperKt$mapSections$14 = shopHubMapperKt$mapSections$1;
                                            shopHubResultsListItem5 = shopHubResultsListItem4;
                                        }
                                        if (!build2.isEmpty()) {
                                            list6.add(new ShopHubResultsListItem.Results(build2));
                                        }
                                        androidStringManager2 = androidStringManager4;
                                        realRecentSearchManager2 = realRecentSearchManager4;
                                        z2 = z6;
                                        it = it3;
                                        list = list6;
                                        coroutineSingletons2 = coroutineSingletons;
                                        z5 = true;
                                        i4 = i15;
                                        i2 = i14;
                                        i12 = i13;
                                        createListBuilder = list5;
                                        shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$14;
                                        shopHubResultsListItem = shopHubResultsListItem5;
                                        i3 = i12;
                                        coroutineSingletons3 = coroutineSingletons2;
                                        identifier = null;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                } else {
                                    coroutineSingletons = coroutineSingletons2;
                                    shopHubMapperKt$mapSections$12.L$1 = androidStringManager2;
                                    shopHubMapperKt$mapSections$12.L$2 = realRecentSearchManager2;
                                    shopHubMapperKt$mapSections$12.L$3 = shopHubResultsListItem;
                                    shopHubMapperKt$mapSections$12.L$4 = list12;
                                    shopHubMapperKt$mapSections$12.L$5 = list;
                                    shopHubMapperKt$mapSections$12.L$7 = it;
                                    shopHubMapperKt$mapSections$12.L$9 = null;
                                    shopHubMapperKt$mapSections$12.Z$0 = z2;
                                    shopHubMapperKt$mapSections$12.I$0 = i3;
                                    shopHubMapperKt$mapSections$12.I$1 = i2;
                                    shopHubMapperKt$mapSections$12.I$2 = i25;
                                    shopHubMapperKt$mapSections$12.I$3 = i26;
                                    shopHubMapperKt$mapSections$12.label = 3;
                                    Serializable recentViewsAndSearches = getRecentViewsAndSearches(realRecentSearchManager2, directory$Section3, i26, shopHubMapperKt$mapSections$12);
                                    if (recentViewsAndSearches != coroutineSingletons) {
                                        createListBuilder = list12;
                                        z8 = z2;
                                        shopHubMapperKt$mapSections$1 = shopHubMapperKt$mapSections$12;
                                        i12 = i3;
                                        realRecentSearchManager6 = realRecentSearchManager2;
                                        i23 = i25;
                                        it5 = it;
                                        androidStringManager7 = androidStringManager2;
                                        obj = recentViewsAndSearches;
                                        list10 = list;
                                        i24 = i2;
                                        List list112 = (List) obj;
                                        if (list112 != null) {
                                        }
                                        RealRecentSearchManager realRecentSearchManager72 = realRecentSearchManager6;
                                        shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$1;
                                        z2 = z8;
                                        i4 = i23;
                                        realRecentSearchManager2 = realRecentSearchManager72;
                                        androidStringManager2 = androidStringManager7;
                                        i2 = i24;
                                        it = it5;
                                        coroutineSingletons2 = coroutineSingletons;
                                        z5 = true;
                                        list = list10;
                                        i3 = i12;
                                        coroutineSingletons3 = coroutineSingletons2;
                                        identifier = null;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                            if (i17 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return identifier;
                            }
                            if (text4 == null || (str5 = text4.text) == null) {
                                str5 = androidStringManager2.get(R.string.shop_search_empty_result_title);
                            }
                            if (text3 == null || (str6 = text3.text) == null) {
                                str6 = androidStringManager2.get(R.string.shop_search_empty_result_message);
                            }
                            list.add(new ShopHubResultsListItem.EmptyResult(str5, str6));
                            androidStringManager5 = androidStringManager2;
                            z7 = z2;
                            realRecentSearchManager5 = realRecentSearchManager2;
                            shopHubMapperKt$mapSections$15 = shopHubMapperKt$mapSections$12;
                            i18 = i2;
                            i19 = i3;
                            it4 = it;
                            list8 = list;
                            i20 = i25;
                            z5 = true;
                        }
                        createListBuilder = list12;
                        it = it4;
                        list = list8;
                        z2 = z7;
                        androidStringManager2 = androidStringManager5;
                        i4 = i20;
                        i2 = i18;
                        i12 = i19;
                        realRecentSearchManager2 = realRecentSearchManager5;
                        shopHubMapperKt$mapSections$12 = shopHubMapperKt$mapSections$15;
                        i3 = i12;
                        coroutineSingletons3 = coroutineSingletons2;
                        identifier = null;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        shopHubMapperKt$mapSections$1 = new ShopHubMapperKt$mapSections$1(continuationImpl);
        Object obj2 = shopHubMapperKt$mapSections$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shopHubMapperKt$mapSections$1.label;
        if (i != 0) {
        }
    }

    public static final DirectoryListItem.ItemViewModel.Text toItemViewModelText(Directory$Section.Item.SimpleItem.ItemText itemText) {
        return new DirectoryListItem.ItemViewModel.Text(DirectoryKt.toText(itemText), itemText.highlightRange, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList toItemViewModels(List list, String str, String str2, int i, Section.Layout layout, String str3) {
        Iterator it;
        int i2;
        String str4;
        DirectoryListItem.ItemViewModel itemViewModel;
        Metadata.EntityType entityType;
        Metadata.EntityType entityType2;
        String str5;
        String str6;
        String str7;
        EntityType entityType3;
        String str8;
        Metadata.EntityType entityType4;
        String str9;
        Image image;
        Avatar.Initials initials;
        Color color;
        Avatar.Initials initials2;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            Directory$Section.Item item = (Directory$Section.Item) next;
            if (item instanceof Directory$Section.Item.SimpleItem) {
                Directory$Section.Item.SimpleItem simpleItem = (Directory$Section.Item.SimpleItem) item;
                Directory$Section.Item.SimpleItem.ItemText itemText = simpleItem.title;
                Avatar avatar = simpleItem.profileImage;
                Metadata metadata = simpleItem.metadata;
                String str10 = simpleItem.token;
                if (str10 == null) {
                    str10 = itemText != null ? itemText.text : null;
                    if (str10 == null) {
                        str10 = "";
                    }
                }
                String str11 = str10;
                Recipient recipient = new Recipient(null, false, false, str11, null, null, false, false, false, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, -9, 63);
                DirectoryListItem.ItemViewModel.Text itemViewModelText = itemText != null ? toItemViewModelText(itemText) : null;
                Directory$Section.Item.SimpleItem.ItemText itemText2 = simpleItem.subtitle;
                DirectoryListItem.ItemViewModel.Text itemViewModelText2 = itemText2 != null ? toItemViewModelText(itemText2) : null;
                AvatarViewModel avatarViewModel = new AvatarViewModel(avatar != null ? avatar.picture : null, (avatar == null || (initials = avatar.initials) == null || (color = initials.background_color) == null) ? null : new ColorModel.Accented(color), (avatar == null || (initials2 = avatar.initials) == null) ? null : initials2.initials, (String) null, false, true, (String) null, (String) null, (String) null, (AvatarBadgeViewModel) ((avatar == null || (image = avatar.icon) == null) ? null : new AvatarBadgeViewModel.IconUrl(image, null)), avatar != null ? avatar.action_url : null, false, false, 29585);
                String str12 = simpleItem.actionUrl;
                Button button = simpleItem.button;
                DirectoryAnalyticsData.EventType eventType = DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM;
                String str13 = metadata != null ? metadata.model_version : null;
                DirectoryAnalyticsData.SectionAnalyticsData sectionAnalyticsData = new DirectoryAnalyticsData.SectionAnalyticsData(str, str2, str3, Integer.valueOf(i), 8052);
                if (metadata == null || (str5 = metadata.entity_token) == null) {
                    str5 = null;
                }
                int size = list.size();
                String str14 = metadata != null ? metadata.query_token : null;
                int calculateRowIndex = calculateRowIndex(i3, layout);
                int calculateColIndex = calculateColIndex(i3, layout);
                String str15 = null;
                if (metadata == null || (str6 = metadata.entity_name) == null) {
                    str6 = null;
                }
                if (metadata == null || (str7 = metadata.business_token) == null) {
                    str7 = null;
                }
                it = it2;
                String str16 = (metadata == null || (str9 = metadata.business_name) == null) ? null : str9;
                if (metadata != null) {
                    Metadata.EntityType entityType5 = metadata.entity_type;
                    int i5 = entityType5 == null ? -1 : ShopHubMapperKt$WhenMappings.$EnumSwitchMapping$5[entityType5.ordinal()];
                    i2 = i4;
                    EntityType entityType6 = i5 != 1 ? i5 != 2 ? null : EntityType.Product : EntityType.Store;
                    if (entityType6 != null) {
                        entityType3 = entityType6;
                        String str17 = metadata == null ? metadata.app_feature_name : null;
                        String str18 = metadata == null ? metadata.app_feature_client_route : null;
                        if (metadata == null) {
                            List list3 = metadata.merchant_tags;
                            if (!list3.isEmpty()) {
                                str15 = CollectionsKt.joinToString$default(list3, ",", null, null, 0, null, null, 62);
                            }
                            str8 = str15;
                        } else {
                            str8 = null;
                        }
                        itemViewModel = new DirectoryListItem.ItemViewModel(str11, recipient, avatarViewModel, itemViewModelText, itemViewModelText2, null, null, simpleItem.icon, str12, button, new DirectoryAnalyticsData(sectionAnalyticsData, new DirectoryAnalyticsData.ItemAnalyticsData(str5, null, null, Integer.valueOf(i3), Integer.valueOf(calculateRowIndex), Integer.valueOf(calculateColIndex), Integer.valueOf(size), str14, str6, str7, str16, entityType3, str17, str18, str8, 1065395111), str13, null, (metadata != null || (entityType4 = metadata.entity_type) == null) ? null : DirectoryAnalyticsDataKt.toEntityType(entityType4), 400), null, 2073488);
                    }
                } else {
                    i2 = i4;
                }
                entityType3 = null;
                if (metadata == null) {
                }
                if (metadata == null) {
                }
                if (metadata == null) {
                }
                itemViewModel = new DirectoryListItem.ItemViewModel(str11, recipient, avatarViewModel, itemViewModelText, itemViewModelText2, null, null, simpleItem.icon, str12, button, new DirectoryAnalyticsData(sectionAnalyticsData, new DirectoryAnalyticsData.ItemAnalyticsData(str5, null, null, Integer.valueOf(i3), Integer.valueOf(calculateRowIndex), Integer.valueOf(calculateColIndex), Integer.valueOf(size), str14, str6, str7, str16, entityType3, str17, str18, str8, 1065395111), str13, null, (metadata != null || (entityType4 = metadata.entity_type) == null) ? null : DirectoryAnalyticsDataKt.toEntityType(entityType4), 400), null, 2073488);
            } else {
                it = it2;
                i2 = i4;
                String str19 = null;
                if (!(item instanceof Directory$Section.Item.CardItem)) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(item, "Encountered unsupported item: ");
                    return null;
                }
                Directory$Section.Item.CardItem cardItem = (Directory$Section.Item.CardItem) item;
                Metadata metadata2 = cardItem.metadata;
                String cardItem2 = cardItem.toString();
                Recipient recipient2 = new Recipient(null, false, false, null, null, null, false, false, false, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, -1, 63);
                Directory$Section.Item.SimpleItem.ItemText itemText3 = cardItem.title;
                DirectoryListItem.ItemViewModel.Text itemViewModelText3 = itemText3 != null ? toItemViewModelText(itemText3) : null;
                Directory$Section.Item.SimpleItem.ItemText itemText4 = cardItem.subheader;
                DirectoryListItem.ItemViewModel.Text itemViewModelText4 = itemText4 != null ? toItemViewModelText(itemText4) : null;
                Directory$Section.Item.SimpleItem.ItemText itemText5 = cardItem.captionLeft;
                DirectoryListItem.ItemViewModel.Text itemViewModelText5 = itemText5 != null ? toItemViewModelText(itemText5) : null;
                Directory$Section.Item.SimpleItem.ItemText itemText6 = cardItem.captionRight;
                DirectoryListItem.ItemViewModel.Text itemViewModelText6 = itemText6 != null ? toItemViewModelText(itemText6) : null;
                String str20 = cardItem.actionUrl;
                Image image2 = cardItem.picture;
                DirectoryAnalyticsData.EventType eventType2 = DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM;
                String str21 = metadata2 != null ? metadata2.model_version : null;
                DirectoryAnalyticsData.SectionAnalyticsData sectionAnalyticsData2 = new DirectoryAnalyticsData.SectionAnalyticsData(str, str2, str3, Integer.valueOf(i), 8052);
                String str22 = metadata2 != null ? metadata2.entity_token : null;
                String str23 = metadata2 != null ? metadata2.entity_attributes : null;
                int calculateRowIndex2 = calculateRowIndex(i3, layout);
                int calculateColIndex2 = calculateColIndex(i3, layout);
                int size2 = list.size();
                String obj = (metadata2 == null || (entityType2 = metadata2.entity_type) == null) ? null : entityType2.toString();
                String str24 = metadata2 != null ? metadata2.query_token : null;
                if (metadata2 != null) {
                    List list4 = metadata2.merchant_tags;
                    if (!list4.isEmpty()) {
                        str19 = CollectionsKt.joinToString$default(list4, ",", null, null, 0, null, null, 62);
                    }
                    str4 = str19;
                } else {
                    str4 = null;
                }
                itemViewModel = new DirectoryListItem.ItemViewModel(cardItem2, recipient2, null, itemViewModelText3, itemViewModelText4, itemViewModelText5, itemViewModelText6, null, str20, null, new DirectoryAnalyticsData(sectionAnalyticsData2, new DirectoryAnalyticsData.ItemAnalyticsData(str22, obj, str23, Integer.valueOf(i3), Integer.valueOf(calculateRowIndex2), Integer.valueOf(calculateColIndex2), Integer.valueOf(size2), str24, null, null, null, null, null, null, str4, 1069523847), str21, null, (metadata2 == null || (entityType = metadata2.entity_type) == null) ? null : DirectoryAnalyticsDataKt.toEntityType(entityType), 400), image2, 2045084);
            }
            arrayList.add(itemViewModel);
            it2 = it;
            i3 = i2;
        }
        return arrayList;
    }

    public static final BrowserOrigin toOrigin(ShoppingScreenContext shoppingScreenContext) {
        shoppingScreenContext.getClass();
        if (shoppingScreenContext instanceof ShoppingScreenContext.Directory) {
            return BrowserOrigin.DirectoryBoost;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.DirectorySearch) {
            return BrowserOrigin.DiscoverSearch;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.CardTab) {
            return BrowserOrigin.CardTabBoost;
        }
        if ((shoppingScreenContext instanceof ShoppingScreenContext.ProductSearch) || (shoppingScreenContext instanceof ShoppingScreenContext.BrandsSearch)) {
            return BrowserOrigin.ShopHubSearch;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.MerchantProfile) {
            return ((ShoppingScreenContext.MerchantProfile) shoppingScreenContext).merchantBoostContext instanceof MerchantBoostContext.MerchantProfileBoost ? BrowserOrigin.MerchantProfileBoost : BrowserOrigin.MerchantProfileDiscover;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.DiscoverBnplCarousel) {
            return ((ShoppingScreenContext.DiscoverBnplCarousel) shoppingScreenContext).browserOrigin;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.ThirdPartyOffer) {
            return BrowserOrigin.MerchantProfileDiscover;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.OffersTab) {
            Screen screen = ((ShoppingScreenContext.OffersTab) shoppingScreenContext).parentScreen;
            return screen instanceof OffersScreen$OffersHomeScreen ? BrowserOrigin.OffersTab : screen instanceof MerchantScreen$MerchantProfileScreen ? BrowserOrigin.MerchantProfileDiscover : screen instanceof WalletHomeScreen ? BrowserOrigin.CardTabBoost : BrowserOrigin.OffersTab;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.OffersTimelineSheet) {
            Screen screen2 = ((ShoppingScreenContext.OffersTimelineSheet) shoppingScreenContext).parentScreen;
            return screen2 instanceof OffersScreen$OffersHomeScreen ? BrowserOrigin.OffersTab : screen2 instanceof MerchantScreen$MerchantProfileScreen ? BrowserOrigin.MerchantProfileDiscover : screen2 instanceof WalletHomeScreen ? BrowserOrigin.CardTabBoost : BrowserOrigin.OffersTab;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final int toSpanCount(Section.Layout layout) {
        switch (layout.ordinal()) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
                return 3;
            case 6:
            case 7:
                return 4;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DirectoryListItem.TextRowSectionViewModel toTextRowSectionViewModel(List list, Directory$Section directory$Section, int i) {
        Section.Layout layout = Section.Layout.ONE_COLUMN;
        String str = directory$Section.id;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            String str2 = null;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            String str3 = (String) obj;
            DirectoryListItem.ItemViewModel.Text text = new DirectoryListItem.ItemViewModel.Text(new Text(str3, (TextStyle) null, (TextDecoration) null, (Color) null, (Image) null, 62), null, 6);
            Recipient recipient = new Recipient(0 == true ? 1 : 0, false, false, null, null, null, false, false, false, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, -1, 63);
            DirectoryAnalyticsData.EventType eventType = DirectoryAnalyticsData.EventType.VIEW_PROFILE_DIRECTORY_ITEM;
            String str4 = directory$Section.id;
            String str5 = directory$Section.serverId;
            Text text2 = directory$Section.title;
            if (text2 != null) {
                str2 = text2.text;
            }
            arrayList.add(new DirectoryListItem.ItemViewModel(str3, recipient, null, text, null, null, null, null, null, null, new DirectoryAnalyticsData(new DirectoryAnalyticsData.SectionAnalyticsData(str4, str5, str2, Integer.valueOf(i), 8052), new DirectoryAnalyticsData.ItemAnalyticsData(str3, null, null, Integer.valueOf(i2), Integer.valueOf(calculateRowIndex(i2, layout)), Integer.valueOf(calculateColIndex(i2, layout)), Integer.valueOf(list.size()), null, null, null, null, null, null, null, null, 1073734583), null, null, null, 444), null, 2078684));
            i2 = i3;
        }
        return new DirectoryListItem.TextRowSectionViewModel(str, arrayList, false, layout);
    }

    public static final String getMerchantToken(ShoppingScreenContext shoppingScreenContext) {
        if (shoppingScreenContext instanceof ShoppingScreenContext.DiscoverBnplCarousel) {
            return ((ShoppingScreenContext.DiscoverBnplCarousel) shoppingScreenContext).merchantToken;
        }
        EntityInformation entityInformation = getEntityInformation(shoppingScreenContext);
        if (entityInformation != null) {
            return entityInformation.businessToken;
        }
        return null;
    }
}
