package com.squareup.cash.performance;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.ui.Modifier;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes6.dex */
public abstract class JankStatsAggregatorKt {
    public static final String access$simplifyTag(String str) {
        Iterable list;
        MatcherMatchResult find = new Regex("^([A-Za-z0-9_.$]+)\\(").find(str);
        if (find != null) {
            return (String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(1);
        }
        MatcherMatchResult find2 = new Regex("^([A-Za-z0-9_.$]+)@").find(str);
        if (find2 == null) {
            return "Parse Failed";
        }
        List split$default = StringsKt.split$default((CharSequence) ((MatcherMatchResult$groupValues$1) find2.getGroupValues()).get(1), new char[]{'.'}, 6);
        if (!split$default.isEmpty()) {
            ListIterator listIterator = split$default.listIterator(split$default.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    list = CollectionsKt.toList(split$default);
                    break;
                }
                if (Character.isLowerCase(((String) listIterator.previous()).charAt(0))) {
                    listIterator.next();
                    int size = split$default.size() - listIterator.nextIndex();
                    if (size == 0) {
                        list = EmptyList.INSTANCE;
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                        list = arrayList;
                    }
                }
            }
        } else {
            list = EmptyList.INSTANCE;
        }
        return CollectionsKt.joinToString$default(list, ".", null, null, 0, null, null, 62);
    }

    public static final Modifier trackScrollPerformance(PerformanceMeasureScrollPerformance.Element element, ScrollableState scrollableState, float f, ContextScope contextScope, MainPaymentView$Content$2$1 mainPaymentView$Content$2$1) {
        scrollableState.getClass();
        return new ScrollPerformanceElement(element, scrollableState, f, contextScope, mainPaymentView$Content$2$1);
    }
}
