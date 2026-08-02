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
public final class BookletInteractTapButton implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final BookletButtonLocation button_location;
    public final String button_text;
    public final String content_token;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BookletButtonLocation {
        public static final /* synthetic */ BookletButtonLocation[] $VALUES;
        public static final BookletButtonLocation BOTTOM;
        public static final BookletButtonLocation TOP;

        static {
            BookletButtonLocation bookletButtonLocation = new BookletButtonLocation("TOP", 0);
            TOP = bookletButtonLocation;
            BookletButtonLocation bookletButtonLocation2 = new BookletButtonLocation("BOTTOM", 1);
            BOTTOM = bookletButtonLocation2;
            $VALUES = new BookletButtonLocation[]{bookletButtonLocation, bookletButtonLocation2};
        }

        public static BookletButtonLocation valueOf(String str) {
            return (BookletButtonLocation) Enum.valueOf(BookletButtonLocation.class, str);
        }

        public static BookletButtonLocation[] values() {
            return (BookletButtonLocation[]) $VALUES.clone();
        }
    }

    public BookletInteractTapButton(String str, String str2, String str3, BookletButtonLocation bookletButtonLocation, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        bookletButtonLocation = (i & 16) != 0 ? null : bookletButtonLocation;
        this.content_token = str;
        this.flow_token = str2;
        this.button_text = str3;
        this.button_location = bookletButtonLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Booklet", "cdf_action", "Interact");
        Countries.putSafe(m, "content_token", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "button_text", str3);
        Countries.putSafe(m, "button_location", bookletButtonLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookletInteractTapButton)) {
            return false;
        }
        BookletInteractTapButton bookletInteractTapButton = (BookletInteractTapButton) obj;
        return Intrinsics.areEqual(this.content_token, bookletInteractTapButton.content_token) && Intrinsics.areEqual(this.flow_token, bookletInteractTapButton.flow_token) && Intrinsics.areEqual(this.button_text, bookletInteractTapButton.button_text) && this.button_location == bookletInteractTapButton.button_location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Booklet Interact TapButton";
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
        String str3 = this.button_text;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BookletButtonLocation bookletButtonLocation = this.button_location;
        return hashCode3 + (bookletButtonLocation != null ? bookletButtonLocation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BookletInteractTapButton(content_token=", this.content_token, ", flow_token=", this.flow_token, ", referrer_flow_token=null, button_text=");
        m.append(this.button_text);
        m.append(", button_location=");
        m.append(this.button_location);
        m.append(")");
        return m.toString();
    }
}
