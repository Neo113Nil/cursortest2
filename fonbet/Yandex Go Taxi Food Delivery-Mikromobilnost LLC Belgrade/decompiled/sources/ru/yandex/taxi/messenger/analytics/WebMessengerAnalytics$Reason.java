package ru.yandex.taxi.messenger.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/messenger/analytics/WebMessengerAnalytics$Reason", "", "Lru/yandex/taxi/messenger/analytics/WebMessengerAnalytics$Reason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CloseTapped", "StatusChanged", "OtherChatOpened", "BackPressed", "Unknown", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebMessengerAnalytics$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebMessengerAnalytics$Reason[] $VALUES;
    public static final WebMessengerAnalytics$Reason BackPressed;
    public static final WebMessengerAnalytics$Reason CloseTapped;
    public static final WebMessengerAnalytics$Reason OtherChatOpened;
    public static final WebMessengerAnalytics$Reason StatusChanged;
    public static final WebMessengerAnalytics$Reason Unknown;
    private final String eventValue;

    static {
        WebMessengerAnalytics$Reason webMessengerAnalytics$Reason = new WebMessengerAnalytics$Reason("CloseTapped", 0, "close_tapped");
        CloseTapped = webMessengerAnalytics$Reason;
        WebMessengerAnalytics$Reason webMessengerAnalytics$Reason2 = new WebMessengerAnalytics$Reason("StatusChanged", 1, "status_changed");
        StatusChanged = webMessengerAnalytics$Reason2;
        WebMessengerAnalytics$Reason webMessengerAnalytics$Reason3 = new WebMessengerAnalytics$Reason("OtherChatOpened", 2, "other_chat_opened");
        OtherChatOpened = webMessengerAnalytics$Reason3;
        WebMessengerAnalytics$Reason webMessengerAnalytics$Reason4 = new WebMessengerAnalytics$Reason("BackPressed", 3, "back_pressed");
        BackPressed = webMessengerAnalytics$Reason4;
        WebMessengerAnalytics$Reason webMessengerAnalytics$Reason5 = new WebMessengerAnalytics$Reason("Unknown", 4, "unknown");
        Unknown = webMessengerAnalytics$Reason5;
        WebMessengerAnalytics$Reason[] webMessengerAnalytics$ReasonArr = {webMessengerAnalytics$Reason, webMessengerAnalytics$Reason2, webMessengerAnalytics$Reason3, webMessengerAnalytics$Reason4, webMessengerAnalytics$Reason5};
        $VALUES = webMessengerAnalytics$ReasonArr;
        $ENTRIES = a.a(webMessengerAnalytics$ReasonArr);
    }

    public WebMessengerAnalytics$Reason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static WebMessengerAnalytics$Reason valueOf(String str) {
        return (WebMessengerAnalytics$Reason) Enum.valueOf(WebMessengerAnalytics$Reason.class, str);
    }

    public static WebMessengerAnalytics$Reason[] values() {
        return (WebMessengerAnalytics$Reason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
