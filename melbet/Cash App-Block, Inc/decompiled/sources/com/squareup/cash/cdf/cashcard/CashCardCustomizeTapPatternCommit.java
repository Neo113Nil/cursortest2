package com.squareup.cash.cdf.cashcard;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CashCardCustomizeTapPatternCommit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Double pattern_density;
    public final Integer unique_stamp_count;
    public final Integer unique_stroke_count;

    public CashCardCustomizeTapPatternCommit(Double d, Integer num, Integer num2) {
        this.pattern_density = d;
        this.unique_stroke_count = num;
        this.unique_stamp_count = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "pattern_density", d);
        Countries.putSafe(m, "unique_stroke_count", num);
        Countries.putSafe(m, "unique_stamp_count", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashCardCustomizeTapPatternCommit)) {
            return false;
        }
        CashCardCustomizeTapPatternCommit cashCardCustomizeTapPatternCommit = (CashCardCustomizeTapPatternCommit) obj;
        return this.pattern_density.equals(cashCardCustomizeTapPatternCommit.pattern_density) && this.unique_stroke_count.equals(cashCardCustomizeTapPatternCommit.unique_stroke_count) && this.unique_stamp_count.equals(cashCardCustomizeTapPatternCommit.unique_stamp_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize TapPatternCommit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.unique_stamp_count.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.pattern_density.hashCode() * 31, 31, this.unique_stroke_count);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashCardCustomizeTapPatternCommit(pattern_density=");
        sb.append(this.pattern_density);
        sb.append(", unique_stroke_count=");
        sb.append(this.unique_stroke_count);
        sb.append(", unique_stamp_count=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.unique_stamp_count, ")");
    }
}
