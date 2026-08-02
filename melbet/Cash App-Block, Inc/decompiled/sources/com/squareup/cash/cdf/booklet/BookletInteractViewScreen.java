package com.squareup.cash.cdf.booklet;

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
public final class BookletInteractViewScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String content_token;
    public final String flow_token;
    public final BookletOrigin origin;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BookletOrigin {
        public static final /* synthetic */ BookletOrigin[] $VALUES;
        public static final BookletOrigin PAYCHECKS;
        public static final BookletOrigin SPENDING;

        static {
            BookletOrigin bookletOrigin = new BookletOrigin("PAYCHECKS", 0);
            PAYCHECKS = bookletOrigin;
            BookletOrigin bookletOrigin2 = new BookletOrigin("DEEP_LINK", 1);
            BookletOrigin bookletOrigin3 = new BookletOrigin("SPENDING", 2);
            SPENDING = bookletOrigin3;
            $VALUES = new BookletOrigin[]{bookletOrigin, bookletOrigin2, bookletOrigin3};
        }

        public static BookletOrigin valueOf(String str) {
            return (BookletOrigin) Enum.valueOf(BookletOrigin.class, str);
        }

        public static BookletOrigin[] values() {
            return (BookletOrigin[]) $VALUES.clone();
        }
    }

    public BookletInteractViewScreen(String str, String str2, BookletOrigin bookletOrigin, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        bookletOrigin = (i & 8) != 0 ? null : bookletOrigin;
        this.content_token = str;
        this.flow_token = str2;
        this.origin = bookletOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Booklet", "cdf_action", "Interact");
        Countries.putSafe(m, "content_token", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "origin", bookletOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookletInteractViewScreen)) {
            return false;
        }
        BookletInteractViewScreen bookletInteractViewScreen = (BookletInteractViewScreen) obj;
        return Intrinsics.areEqual(this.content_token, bookletInteractViewScreen.content_token) && Intrinsics.areEqual(this.flow_token, bookletInteractViewScreen.flow_token) && this.origin == bookletInteractViewScreen.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Booklet Interact ViewScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.content_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        BookletOrigin bookletOrigin = this.origin;
        return hashCode2 + (bookletOrigin != null ? bookletOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BookletInteractViewScreen(content_token=", this.content_token, ", flow_token=", this.flow_token, ", referrer_flow_token=null, origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
