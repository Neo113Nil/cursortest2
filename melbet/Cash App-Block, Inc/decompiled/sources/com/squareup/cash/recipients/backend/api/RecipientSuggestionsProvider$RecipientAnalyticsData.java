package com.squareup.cash.recipients.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RecipientSuggestionsProvider$RecipientAnalyticsData {
    public final Integer absoluteIndex;
    public final Bucket bucket;
    public final GenerationStrategy generationStrategy;
    public final Integer matchedAliasLength;
    public final Boolean mlSearchEnabled;
    public final Integer searchTextLength;
    public final String searchType;
    public final String section;
    public final Integer sectionIndex;
    public final Integer sectionTotal;
    public final SuggestionStrategy suggestionStrategy;
    public final Integer total;
    public final Boolean useCashCustomerSearchServiceEnabled;

    public RecipientSuggestionsProvider$RecipientAnalyticsData(Bucket bucket, GenerationStrategy generationStrategy, Integer num, Integer num2, Boolean bool, Boolean bool2, String str, Integer num3, Integer num4, Integer num5, Integer num6, SuggestionStrategy suggestionStrategy, String str2) {
        this.bucket = bucket;
        this.generationStrategy = generationStrategy;
        this.absoluteIndex = num;
        this.total = num2;
        this.useCashCustomerSearchServiceEnabled = bool;
        this.mlSearchEnabled = bool2;
        this.section = str;
        this.sectionIndex = num3;
        this.sectionTotal = num4;
        this.searchTextLength = num5;
        this.matchedAliasLength = num6;
        this.suggestionStrategy = suggestionStrategy;
        this.searchType = str2;
    }

    public static RecipientSuggestionsProvider$RecipientAnalyticsData copy$default(RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData, Bucket bucket, Integer num, Integer num2, String str, Integer num3, Integer num4, Integer num5, Integer num6, SuggestionStrategy suggestionStrategy, String str2, int i) {
        GenerationStrategy generationStrategy = GenerationStrategy.FAVORITE;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        Bucket bucket2 = (i & 1) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.bucket : bucket;
        if ((i & 2) != 0) {
            generationStrategy = recipientSuggestionsProvider$RecipientAnalyticsData.generationStrategy;
        }
        GenerationStrategy generationStrategy2 = generationStrategy;
        Integer num7 = (i & 4) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.absoluteIndex : num;
        Integer num8 = (i & 8) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.total : num2;
        if ((i & 16) != 0) {
            bool = recipientSuggestionsProvider$RecipientAnalyticsData.useCashCustomerSearchServiceEnabled;
        }
        Boolean bool3 = bool;
        if ((i & 32) != 0) {
            bool2 = recipientSuggestionsProvider$RecipientAnalyticsData.mlSearchEnabled;
        }
        return new RecipientSuggestionsProvider$RecipientAnalyticsData(bucket2, generationStrategy2, num7, num8, bool3, bool2, (i & 64) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.section : str, (i & 128) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.sectionIndex : num3, (i & 256) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.sectionTotal : num4, (i & 512) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.searchTextLength : num5, (i & 1024) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.matchedAliasLength : num6, (i & 2048) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.suggestionStrategy : suggestionStrategy, (i & PKIFailureInfo.certRevoked) != 0 ? recipientSuggestionsProvider$RecipientAnalyticsData.searchType : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientSuggestionsProvider$RecipientAnalyticsData)) {
            return false;
        }
        RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData = (RecipientSuggestionsProvider$RecipientAnalyticsData) obj;
        return this.bucket == recipientSuggestionsProvider$RecipientAnalyticsData.bucket && this.generationStrategy == recipientSuggestionsProvider$RecipientAnalyticsData.generationStrategy && Intrinsics.areEqual(this.absoluteIndex, recipientSuggestionsProvider$RecipientAnalyticsData.absoluteIndex) && Intrinsics.areEqual(this.total, recipientSuggestionsProvider$RecipientAnalyticsData.total) && Intrinsics.areEqual(this.useCashCustomerSearchServiceEnabled, recipientSuggestionsProvider$RecipientAnalyticsData.useCashCustomerSearchServiceEnabled) && Intrinsics.areEqual(this.mlSearchEnabled, recipientSuggestionsProvider$RecipientAnalyticsData.mlSearchEnabled) && Intrinsics.areEqual(this.section, recipientSuggestionsProvider$RecipientAnalyticsData.section) && Intrinsics.areEqual(this.sectionIndex, recipientSuggestionsProvider$RecipientAnalyticsData.sectionIndex) && Intrinsics.areEqual(this.sectionTotal, recipientSuggestionsProvider$RecipientAnalyticsData.sectionTotal) && Intrinsics.areEqual(this.searchTextLength, recipientSuggestionsProvider$RecipientAnalyticsData.searchTextLength) && Intrinsics.areEqual(this.matchedAliasLength, recipientSuggestionsProvider$RecipientAnalyticsData.matchedAliasLength) && this.suggestionStrategy == recipientSuggestionsProvider$RecipientAnalyticsData.suggestionStrategy && Intrinsics.areEqual(this.searchType, recipientSuggestionsProvider$RecipientAnalyticsData.searchType);
    }

    public final int hashCode() {
        Bucket bucket = this.bucket;
        int hashCode = (bucket == null ? 0 : bucket.hashCode()) * 31;
        GenerationStrategy generationStrategy = this.generationStrategy;
        int hashCode2 = (hashCode + (generationStrategy == null ? 0 : generationStrategy.hashCode())) * 31;
        Integer num = this.absoluteIndex;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.total;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.useCashCustomerSearchServiceEnabled;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.mlSearchEnabled;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.section;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.sectionIndex;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sectionTotal;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.searchTextLength;
        int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.matchedAliasLength;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        SuggestionStrategy suggestionStrategy = this.suggestionStrategy;
        int hashCode12 = (hashCode11 + (suggestionStrategy == null ? 0 : suggestionStrategy.hashCode())) * 961;
        String str2 = this.searchType;
        return (hashCode12 + (str2 != null ? str2.hashCode() : 0)) * 887503681;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecipientAnalyticsData(bucket=");
        sb.append(this.bucket);
        sb.append(", generationStrategy=");
        sb.append(this.generationStrategy);
        sb.append(", absoluteIndex=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.absoluteIndex, ", total=", this.total, ", useCashCustomerSearchServiceEnabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.useCashCustomerSearchServiceEnabled, ", mlSearchEnabled=", this.mlSearchEnabled, ", section=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section, ", sectionIndex=", this.sectionIndex, ", sectionTotal=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.sectionTotal, ", searchTextLength=", this.searchTextLength, ", matchedAliasLength=");
        sb.append(this.matchedAliasLength);
        sb.append(", suggestionStrategy=");
        sb.append(this.suggestionStrategy);
        sb.append(", remoteSuggestionType=null, searchType=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.searchType, ", queryToken=null, matchedFields=null, isMultipleAccountHolder=null, isFirstLinkedAccount=null, accountHolderToken=null, isLinkedAccount=null)");
    }

    public /* synthetic */ RecipientSuggestionsProvider$RecipientAnalyticsData(GenerationStrategy generationStrategy) {
        this(null, generationStrategy, null, null, null, null, null, null, null, null, null, null, null);
    }
}
