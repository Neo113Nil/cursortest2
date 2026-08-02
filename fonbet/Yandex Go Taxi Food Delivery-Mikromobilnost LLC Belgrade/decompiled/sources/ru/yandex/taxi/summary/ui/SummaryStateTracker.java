package ru.yandex.taxi.summary.ui;

import defpackage.bvf0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class SummaryStateTracker {
    public final r0 a = bvf0.c(SolidSummaryState.HIDDEN);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/summary/ui/SummaryStateTracker$SolidSummaryState;", "", "HIDDEN", "COLLAPSED", "EXPANDED", "TRANSITIONING", "shared"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SolidSummaryState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SolidSummaryState[] $VALUES;
        public static final SolidSummaryState COLLAPSED;
        public static final SolidSummaryState EXPANDED;
        public static final SolidSummaryState HIDDEN;
        public static final SolidSummaryState TRANSITIONING;

        static {
            SolidSummaryState solidSummaryState = new SolidSummaryState("HIDDEN", 0);
            HIDDEN = solidSummaryState;
            SolidSummaryState solidSummaryState2 = new SolidSummaryState("COLLAPSED", 1);
            COLLAPSED = solidSummaryState2;
            SolidSummaryState solidSummaryState3 = new SolidSummaryState("EXPANDED", 2);
            EXPANDED = solidSummaryState3;
            SolidSummaryState solidSummaryState4 = new SolidSummaryState("TRANSITIONING", 3);
            TRANSITIONING = solidSummaryState4;
            SolidSummaryState[] solidSummaryStateArr = {solidSummaryState, solidSummaryState2, solidSummaryState3, solidSummaryState4};
            $VALUES = solidSummaryStateArr;
            $ENTRIES = a.a(solidSummaryStateArr);
        }

        public static SolidSummaryState valueOf(String str) {
            return (SolidSummaryState) Enum.valueOf(SolidSummaryState.class, str);
        }

        public static SolidSummaryState[] values() {
            return (SolidSummaryState[]) $VALUES.clone();
        }
    }

    public final SolidSummaryState a() {
        return (SolidSummaryState) this.a.getValue();
    }
}
