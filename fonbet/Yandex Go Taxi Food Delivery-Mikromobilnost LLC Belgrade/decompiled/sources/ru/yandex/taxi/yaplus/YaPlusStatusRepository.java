package ru.yandex.taxi.yaplus;

import defpackage.k4o;
import kotlin.Metadata;

/* loaded from: classes10.dex */
public final class YaPlusStatusRepository {
    public volatile JoinPlusStatus a = JoinPlusStatus.NOT_JOINED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/yaplus/YaPlusStatusRepository$JoinPlusStatus;", "", "NOT_JOINED", "GOT_PLUS", "PROCESSING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class JoinPlusStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ JoinPlusStatus[] $VALUES;
        public static final JoinPlusStatus GOT_PLUS;
        public static final JoinPlusStatus NOT_JOINED;
        public static final JoinPlusStatus PROCESSING;

        static {
            JoinPlusStatus joinPlusStatus = new JoinPlusStatus("NOT_JOINED", 0);
            NOT_JOINED = joinPlusStatus;
            JoinPlusStatus joinPlusStatus2 = new JoinPlusStatus("GOT_PLUS", 1);
            GOT_PLUS = joinPlusStatus2;
            JoinPlusStatus joinPlusStatus3 = new JoinPlusStatus("PROCESSING", 2);
            PROCESSING = joinPlusStatus3;
            JoinPlusStatus[] joinPlusStatusArr = {joinPlusStatus, joinPlusStatus2, joinPlusStatus3};
            $VALUES = joinPlusStatusArr;
            $ENTRIES = kotlin.enums.a.a(joinPlusStatusArr);
        }

        public static JoinPlusStatus valueOf(String str) {
            return (JoinPlusStatus) Enum.valueOf(JoinPlusStatus.class, str);
        }

        public static JoinPlusStatus[] values() {
            return (JoinPlusStatus[]) $VALUES.clone();
        }
    }
}
