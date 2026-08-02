package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.cash.activity.backend.loader.OrderActivityData;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes5.dex */
public final class FilteredActivitiesManager$activities$lambda$0$1$$inlined$sortedBy$1 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((OrderActivityData) obj).activityItemDisplayDateMs), Long.valueOf(((OrderActivityData) obj2).activityItemDisplayDateMs));
    }
}
