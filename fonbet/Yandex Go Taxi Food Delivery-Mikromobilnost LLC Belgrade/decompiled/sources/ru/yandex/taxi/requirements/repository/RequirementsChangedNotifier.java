package ru.yandex.taxi.requirements.repository;

import defpackage.ffx;
import defpackage.k4o;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class RequirementsChangedNotifier {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/requirements/repository/RequirementsChangedNotifier$ChangeType;", "", "REMOVE_UNSUPPORTED", "CHANGE_WITH_ADDRESS_REQUIREMENT", "CHANGE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChangeType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ChangeType[] $VALUES;
        public static final ChangeType CHANGE;
        public static final ChangeType CHANGE_WITH_ADDRESS_REQUIREMENT;
        public static final ChangeType REMOVE_UNSUPPORTED;

        static {
            ChangeType changeType = new ChangeType("REMOVE_UNSUPPORTED", 0);
            REMOVE_UNSUPPORTED = changeType;
            ChangeType changeType2 = new ChangeType("CHANGE_WITH_ADDRESS_REQUIREMENT", 1);
            CHANGE_WITH_ADDRESS_REQUIREMENT = changeType2;
            ChangeType changeType3 = new ChangeType("CHANGE", 2);
            CHANGE = changeType3;
            ChangeType[] changeTypeArr = {changeType, changeType2, changeType3};
            $VALUES = changeTypeArr;
            $ENTRIES = kotlin.enums.a.a(changeTypeArr);
        }

        public static ChangeType valueOf(String str) {
            return (ChangeType) Enum.valueOf(ChangeType.class, str);
        }

        public static ChangeType[] values() {
            return (ChangeType[]) $VALUES.clone();
        }
    }
}
