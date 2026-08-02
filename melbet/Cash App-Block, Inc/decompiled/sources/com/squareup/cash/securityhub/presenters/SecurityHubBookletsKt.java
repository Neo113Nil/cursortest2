package com.squareup.cash.securityhub.presenters;

import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securityhub.screens.BookletId;
import com.squareup.cash.securityhub.viewmodels.BookletSummary;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes7.dex */
public abstract class SecurityHubBookletsKt {
    public static final Map RELATED_BOOKLET_IDS;

    static {
        BookletId bookletId = BookletId.BUILT_IN_PROTECTIONS;
        BookletId bookletId2 = BookletId.SECURITY_FEATURES;
        BookletId bookletId3 = BookletId.SPOT_SCAMS;
        Pair pair = new Pair(bookletId, CollectionsKt__CollectionsKt.listOf((Object[]) new BookletId[]{bookletId2, bookletId3}));
        BookletId bookletId4 = BookletId.COMMON_SCAMS;
        BookletId bookletId5 = BookletId.PREVENT_FRAUD;
        RELATED_BOOKLET_IDS = MapsKt__MapsKt.mapOf(pair, new Pair(bookletId4, CollectionsKt__CollectionsKt.listOf((Object[]) new BookletId[]{bookletId3, bookletId5})), new Pair(bookletId3, CollectionsKt__CollectionsKt.listOf((Object[]) new BookletId[]{bookletId4, bookletId5})), new Pair(bookletId5, CollectionsKt__CollectionsKt.listOf((Object[]) new BookletId[]{bookletId4, bookletId})), new Pair(bookletId2, CollectionsKt__CollectionsKt.listOf((Object[]) new BookletId[]{bookletId, bookletId4})));
    }

    public static final ArrayList relatedBooklets(BookletId bookletId, AndroidStringManager androidStringManager) {
        BookletSummary bookletSummary;
        androidStringManager.getClass();
        Iterable<BookletId> iterable = (Iterable) MapsKt__MapsKt.getValue(RELATED_BOOKLET_IDS, bookletId);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (BookletId bookletId2 : iterable) {
            bookletId2.getClass();
            int ordinal = bookletId2.ordinal();
            if (ordinal == 0) {
                bookletSummary = new BookletSummary(bookletId2, androidStringManager.get(R.string.booklet_built_in_protections_summary_title), androidStringManager.get(R.string.booklet_built_in_protections_summary_subtitle), TrustHubImageUrls.ARTICLE_PROTECTIONS);
            } else if (ordinal == 1) {
                bookletSummary = new BookletSummary(bookletId2, androidStringManager.get(R.string.booklet_common_scams_summary_title), androidStringManager.get(R.string.booklet_common_scams_summary_subtitle), TrustHubImageUrls.ARTICLE_COMMON_SCAMS);
            } else if (ordinal == 2) {
                bookletSummary = new BookletSummary(bookletId2, androidStringManager.get(R.string.booklet_spot_scams_summary_title), androidStringManager.get(R.string.booklet_spot_scams_summary_subtitle), TrustHubImageUrls.ARTICLE_SPOT_SCAMS);
            } else if (ordinal == 3) {
                bookletSummary = new BookletSummary(bookletId2, androidStringManager.get(R.string.booklet_prevent_fraud_summary_title), androidStringManager.get(R.string.booklet_prevent_fraud_summary_subtitle), TrustHubImageUrls.ARTICLE_PREVENT_FRAUD);
            } else {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                bookletSummary = new BookletSummary(bookletId2, androidStringManager.get(R.string.booklet_security_features_summary_title), androidStringManager.get(R.string.booklet_security_features_summary_subtitle), TrustHubImageUrls.ARTICLE_SECURITY_FEATURES);
            }
            arrayList.add(bookletSummary);
        }
        return arrayList;
    }
}
