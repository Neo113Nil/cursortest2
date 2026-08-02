package com.squareup.cash.billssubscriptions.fixtures;

import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.billssubscriptions.viewmodels.model.CategoryFilter;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantCatalog;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantLinkingStatus;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes5.dex */
public abstract class FakeMerchants {
    public static final MerchantCatalog catalog;
    public static final List categoryFilters;
    public static final List forYou;
    public static final List recurring;

    static {
        MerchantLinkingStatus merchantLinkingStatus = MerchantLinkingStatus.NOT_LINKED;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Merchant[]{new Merchant("CVS", "$5", "grocery", merchantLinkingStatus), new Merchant("Spotify", "$16.99", "streaming", merchantLinkingStatus), new Merchant("Doordash", "$69", "popular", merchantLinkingStatus)});
        recurring = listOf;
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Merchant[]{new Merchant("Lyft", null, "transport", merchantLinkingStatus), new Merchant("Whole Foods", null, "grocery", merchantLinkingStatus), new Merchant("Disney+", null, "streaming", merchantLinkingStatus)});
        forYou = listOf2;
        List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new CategoryFilter[]{new CategoryFilter("for_you", "For you"), new CategoryFilter("popular", "Popular"), new CategoryFilter("grocery", "Grocery"), new CategoryFilter("streaming", "Streaming"), new CategoryFilter("transport", "Transport")});
        categoryFilters = listOf3;
        catalog = new MerchantCatalog(CollectionsKt__CollectionsKt.listOf((Object[]) new MerchantSection[]{new MerchantSection("Connect recurring payments", listOf), new MerchantSection("For you", listOf2)}), listOf3);
        BenefitsHubViewKt$$ExternalSyntheticLambda2 benefitsHubViewKt$$ExternalSyntheticLambda2 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(14);
        if (!listOf.isEmpty()) {
            ArrayList arrayList = new ArrayList(listOf);
            arrayList.set(0, benefitsHubViewKt$$ExternalSyntheticLambda2.invoke(arrayList.get(0)));
            listOf = arrayList;
        }
        MerchantSection merchantSection = new MerchantSection("Connect recurring payments", listOf);
        BenefitsHubViewKt$$ExternalSyntheticLambda2 benefitsHubViewKt$$ExternalSyntheticLambda22 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(15);
        if (!listOf2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(listOf2);
            arrayList2.set(0, benefitsHubViewKt$$ExternalSyntheticLambda22.invoke(arrayList2.get(0)));
            listOf2 = arrayList2;
        }
        new MerchantCatalog(CollectionsKt__CollectionsKt.listOf((Object[]) new MerchantSection[]{merchantSection, new MerchantSection("For you", listOf2)}), listOf3);
    }
}
