package ru.yandex.taxi.statebar.controller;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/statebar/controller/NotificatorReporter$MessageType", "", "Lru/yandex/taxi/statebar/controller/NotificatorReporter$MessageType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SERVER_ERROR", "CLIENT_ERROR", "NETWORK_ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificatorReporter$MessageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NotificatorReporter$MessageType[] $VALUES;
    public static final NotificatorReporter$MessageType CLIENT_ERROR;
    public static final NotificatorReporter$MessageType NETWORK_ERROR;
    public static final NotificatorReporter$MessageType SERVER_ERROR;
    private final String value;

    static {
        NotificatorReporter$MessageType notificatorReporter$MessageType = new NotificatorReporter$MessageType("SERVER_ERROR", 0, "serverError");
        SERVER_ERROR = notificatorReporter$MessageType;
        NotificatorReporter$MessageType notificatorReporter$MessageType2 = new NotificatorReporter$MessageType("CLIENT_ERROR", 1, "clientError");
        CLIENT_ERROR = notificatorReporter$MessageType2;
        NotificatorReporter$MessageType notificatorReporter$MessageType3 = new NotificatorReporter$MessageType("NETWORK_ERROR", 2, "networkConnectionError");
        NETWORK_ERROR = notificatorReporter$MessageType3;
        NotificatorReporter$MessageType[] notificatorReporter$MessageTypeArr = {notificatorReporter$MessageType, notificatorReporter$MessageType2, notificatorReporter$MessageType3};
        $VALUES = notificatorReporter$MessageTypeArr;
        $ENTRIES = kotlin.enums.a.a(notificatorReporter$MessageTypeArr);
    }

    public NotificatorReporter$MessageType(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificatorReporter$MessageType valueOf(String str) {
        return (NotificatorReporter$MessageType) Enum.valueOf(NotificatorReporter$MessageType.class, str);
    }

    public static NotificatorReporter$MessageType[] values() {
        return (NotificatorReporter$MessageType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
