package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoLearnComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LearnContentType content_type;
    public final LearnExitSource exit_source;
    public final String identifier;
    public final Integer last_viewed_index;
    public final LinkedHashMap parameters;
    public final Boolean viewed_all_content;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LearnExitSource {
        public static final /* synthetic */ LearnExitSource[] $VALUES;
        public static final LearnExitSource CTA;
        public static final LearnExitSource DISMISS;

        static {
            LearnExitSource learnExitSource = new LearnExitSource("CTA", 0);
            CTA = learnExitSource;
            LearnExitSource learnExitSource2 = new LearnExitSource("DISMISS", 1);
            DISMISS = learnExitSource2;
            $VALUES = new LearnExitSource[]{learnExitSource, learnExitSource2};
        }

        public static LearnExitSource valueOf(String str) {
            return (LearnExitSource) Enum.valueOf(LearnExitSource.class, str);
        }

        public static LearnExitSource[] values() {
            return (LearnExitSource[]) $VALUES.clone();
        }
    }

    public CryptoLearnComplete(Boolean bool, Integer num, LearnExitSource learnExitSource, LearnContentType learnContentType, String str, int i) {
        bool = (i & 1) != 0 ? null : bool;
        num = (i & 2) != 0 ? null : num;
        str = (i & 16) != 0 ? null : str;
        this.viewed_all_content = bool;
        this.last_viewed_index = num;
        this.exit_source = learnExitSource;
        this.content_type = learnContentType;
        this.identifier = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Crypto", "cdf_action", "Learn");
        Countries.putSafe(m, "viewed_all_content", bool);
        Countries.putSafe(m, "last_viewed_index", num);
        Countries.putSafe(m, "exit_source", learnExitSource);
        Countries.putSafe(m, "content_type", learnContentType);
        Countries.putSafe(m, "identifier", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoLearnComplete)) {
            return false;
        }
        CryptoLearnComplete cryptoLearnComplete = (CryptoLearnComplete) obj;
        return Intrinsics.areEqual(this.viewed_all_content, cryptoLearnComplete.viewed_all_content) && Intrinsics.areEqual(this.last_viewed_index, cryptoLearnComplete.last_viewed_index) && this.exit_source == cryptoLearnComplete.exit_source && this.content_type == cryptoLearnComplete.content_type && Intrinsics.areEqual(this.identifier, cryptoLearnComplete.identifier);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Learn Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Boolean bool = this.viewed_all_content;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.last_viewed_index;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        LearnExitSource learnExitSource = this.exit_source;
        int hashCode3 = (this.content_type.hashCode() + ((hashCode2 + (learnExitSource == null ? 0 : learnExitSource.hashCode())) * 31)) * 31;
        String str = this.identifier;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CryptoLearnComplete(viewed_all_content=");
        sb.append(this.viewed_all_content);
        sb.append(", last_viewed_index=");
        sb.append(this.last_viewed_index);
        sb.append(", exit_source=");
        sb.append(this.exit_source);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.append(", identifier=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.identifier, ")");
    }
}
