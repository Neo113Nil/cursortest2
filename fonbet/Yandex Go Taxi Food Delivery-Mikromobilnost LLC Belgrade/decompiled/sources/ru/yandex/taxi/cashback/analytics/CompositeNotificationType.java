package ru.yandex.taxi.cashback.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/cashback/analytics/CompositeNotificationType;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PARTIAL", "FULL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CompositeNotificationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompositeNotificationType[] $VALUES;
    public static final CompositeNotificationType FULL;
    public static final CompositeNotificationType PARTIAL;
    private final String type;

    static {
        CompositeNotificationType compositeNotificationType = new CompositeNotificationType("PARTIAL", 0, "partial");
        PARTIAL = compositeNotificationType;
        CompositeNotificationType compositeNotificationType2 = new CompositeNotificationType("FULL", 1, "full");
        FULL = compositeNotificationType2;
        CompositeNotificationType[] compositeNotificationTypeArr = {compositeNotificationType, compositeNotificationType2};
        $VALUES = compositeNotificationTypeArr;
        $ENTRIES = a.a(compositeNotificationTypeArr);
    }

    public CompositeNotificationType(String str, int i, String str2) {
        this.type = str2;
    }

    public static CompositeNotificationType valueOf(String str) {
        return (CompositeNotificationType) Enum.valueOf(CompositeNotificationType.class, str);
    }

    public static CompositeNotificationType[] values() {
        return (CompositeNotificationType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
