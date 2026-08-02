package ru.yandex.taxi.settings.support;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/settings/support/SupportPushMessageInteractor$UpdateMessagesStatus", "", "Lru/yandex/taxi/settings/support/SupportPushMessageInteractor$UpdateMessagesStatus;", "UPDATED", "PARTIALLY", "NOT_UPDATED", "NOT_APPLICABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SupportPushMessageInteractor$UpdateMessagesStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportPushMessageInteractor$UpdateMessagesStatus[] $VALUES;
    public static final SupportPushMessageInteractor$UpdateMessagesStatus NOT_APPLICABLE;
    public static final SupportPushMessageInteractor$UpdateMessagesStatus NOT_UPDATED;
    public static final SupportPushMessageInteractor$UpdateMessagesStatus PARTIALLY;
    public static final SupportPushMessageInteractor$UpdateMessagesStatus UPDATED;

    static {
        SupportPushMessageInteractor$UpdateMessagesStatus supportPushMessageInteractor$UpdateMessagesStatus = new SupportPushMessageInteractor$UpdateMessagesStatus("UPDATED", 0);
        UPDATED = supportPushMessageInteractor$UpdateMessagesStatus;
        SupportPushMessageInteractor$UpdateMessagesStatus supportPushMessageInteractor$UpdateMessagesStatus2 = new SupportPushMessageInteractor$UpdateMessagesStatus("PARTIALLY", 1);
        PARTIALLY = supportPushMessageInteractor$UpdateMessagesStatus2;
        SupportPushMessageInteractor$UpdateMessagesStatus supportPushMessageInteractor$UpdateMessagesStatus3 = new SupportPushMessageInteractor$UpdateMessagesStatus("NOT_UPDATED", 2);
        NOT_UPDATED = supportPushMessageInteractor$UpdateMessagesStatus3;
        SupportPushMessageInteractor$UpdateMessagesStatus supportPushMessageInteractor$UpdateMessagesStatus4 = new SupportPushMessageInteractor$UpdateMessagesStatus("NOT_APPLICABLE", 3);
        NOT_APPLICABLE = supportPushMessageInteractor$UpdateMessagesStatus4;
        SupportPushMessageInteractor$UpdateMessagesStatus[] supportPushMessageInteractor$UpdateMessagesStatusArr = {supportPushMessageInteractor$UpdateMessagesStatus, supportPushMessageInteractor$UpdateMessagesStatus2, supportPushMessageInteractor$UpdateMessagesStatus3, supportPushMessageInteractor$UpdateMessagesStatus4};
        $VALUES = supportPushMessageInteractor$UpdateMessagesStatusArr;
        $ENTRIES = kotlin.enums.a.a(supportPushMessageInteractor$UpdateMessagesStatusArr);
    }

    public static SupportPushMessageInteractor$UpdateMessagesStatus valueOf(String str) {
        return (SupportPushMessageInteractor$UpdateMessagesStatus) Enum.valueOf(SupportPushMessageInteractor$UpdateMessagesStatus.class, str);
    }

    public static SupportPushMessageInteractor$UpdateMessagesStatus[] values() {
        return (SupportPushMessageInteractor$UpdateMessagesStatus[]) $VALUES.clone();
    }
}
