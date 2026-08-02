package com.squareup.cash.datefilterbar.backend.real;

import coil3.size.DimensionKt;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.util.clock.AndroidClock;
import java.time.LocalDate;
import java.util.List;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes5.dex */
public final class RealDateFilterGenerator {
    public final AndroidClock clock;

    public RealDateFilterGenerator(AndroidClock androidClock) {
        this.clock = androidClock;
    }

    public final List generateMonthlyFilters(long j) {
        AndroidClock androidClock = this.clock;
        LocalDate millisToLocalDate = DimensionKt.millisToLocalDate(j, androidClock.timeZone());
        LocalDate nowLocalDate = DimensionKt.nowLocalDate(androidClock);
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(new SessionQueries$$ExternalSyntheticLambda1(1, false), millisToLocalDate), new PoolGoalMetKt$$ExternalSyntheticLambda6(nowLocalDate, nowLocalDate.getMonth(), nowLocalDate.getYear(), 9)), new SessionQueries$$ExternalSyntheticLambda1(2, false)));
    }
}
