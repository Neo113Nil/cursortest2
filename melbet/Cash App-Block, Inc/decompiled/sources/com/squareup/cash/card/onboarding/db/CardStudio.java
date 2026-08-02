package com.squareup.cash.card.onboarding.db;

import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardStudio {
    public final long _id;
    public final CardTheme card_theme;
    public final boolean cashtag_enabled;
    public final TouchData touch_data;

    public CardStudio(long j, TouchData touchData, CardTheme cardTheme, boolean z) {
        this._id = j;
        this.touch_data = touchData;
        this.card_theme = cardTheme;
        this.cashtag_enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStudio)) {
            return false;
        }
        CardStudio cardStudio = (CardStudio) obj;
        return this._id == cardStudio._id && Intrinsics.areEqual(this.touch_data, cardStudio.touch_data) && Intrinsics.areEqual(this.card_theme, cardStudio.card_theme) && this.cashtag_enabled == cardStudio.cashtag_enabled;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this._id) * 31;
        TouchData touchData = this.touch_data;
        int hashCode2 = (hashCode + (touchData == null ? 0 : touchData.hashCode())) * 31;
        CardTheme cardTheme = this.card_theme;
        return Boolean.hashCode(this.cashtag_enabled) + ((hashCode2 + (cardTheme != null ? cardTheme.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CardStudio(_id=" + this._id + ", touch_data=" + this.touch_data + ", card_theme=" + this.card_theme + ", cashtag_enabled=" + this.cashtag_enabled + ")";
    }
}
