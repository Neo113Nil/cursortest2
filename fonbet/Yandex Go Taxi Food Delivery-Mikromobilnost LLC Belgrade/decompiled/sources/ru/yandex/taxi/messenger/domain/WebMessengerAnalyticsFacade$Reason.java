package ru.yandex.taxi.messenger.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/messenger/domain/WebMessengerAnalyticsFacade$Reason", "", "Lru/yandex/taxi/messenger/domain/WebMessengerAnalyticsFacade$Reason;", "CLOSE_TAPPED", "STATUS_CHANGED", "OTHER_CHAT_OPENED", "BACK_PRESSED", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebMessengerAnalyticsFacade$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebMessengerAnalyticsFacade$Reason[] $VALUES;
    public static final WebMessengerAnalyticsFacade$Reason BACK_PRESSED;
    public static final WebMessengerAnalyticsFacade$Reason CLOSE_TAPPED;
    public static final WebMessengerAnalyticsFacade$Reason OTHER_CHAT_OPENED;
    public static final WebMessengerAnalyticsFacade$Reason STATUS_CHANGED;
    public static final WebMessengerAnalyticsFacade$Reason UNKNOWN;

    static {
        WebMessengerAnalyticsFacade$Reason webMessengerAnalyticsFacade$Reason = new WebMessengerAnalyticsFacade$Reason("CLOSE_TAPPED", 0);
        CLOSE_TAPPED = webMessengerAnalyticsFacade$Reason;
        WebMessengerAnalyticsFacade$Reason webMessengerAnalyticsFacade$Reason2 = new WebMessengerAnalyticsFacade$Reason("STATUS_CHANGED", 1);
        STATUS_CHANGED = webMessengerAnalyticsFacade$Reason2;
        WebMessengerAnalyticsFacade$Reason webMessengerAnalyticsFacade$Reason3 = new WebMessengerAnalyticsFacade$Reason("OTHER_CHAT_OPENED", 2);
        OTHER_CHAT_OPENED = webMessengerAnalyticsFacade$Reason3;
        WebMessengerAnalyticsFacade$Reason webMessengerAnalyticsFacade$Reason4 = new WebMessengerAnalyticsFacade$Reason("BACK_PRESSED", 3);
        BACK_PRESSED = webMessengerAnalyticsFacade$Reason4;
        WebMessengerAnalyticsFacade$Reason webMessengerAnalyticsFacade$Reason5 = new WebMessengerAnalyticsFacade$Reason("UNKNOWN", 4);
        UNKNOWN = webMessengerAnalyticsFacade$Reason5;
        WebMessengerAnalyticsFacade$Reason[] webMessengerAnalyticsFacade$ReasonArr = {webMessengerAnalyticsFacade$Reason, webMessengerAnalyticsFacade$Reason2, webMessengerAnalyticsFacade$Reason3, webMessengerAnalyticsFacade$Reason4, webMessengerAnalyticsFacade$Reason5};
        $VALUES = webMessengerAnalyticsFacade$ReasonArr;
        $ENTRIES = kotlin.enums.a.a(webMessengerAnalyticsFacade$ReasonArr);
    }

    public static WebMessengerAnalyticsFacade$Reason valueOf(String str) {
        return (WebMessengerAnalyticsFacade$Reason) Enum.valueOf(WebMessengerAnalyticsFacade$Reason.class, str);
    }

    public static WebMessengerAnalyticsFacade$Reason[] values() {
        return (WebMessengerAnalyticsFacade$Reason[]) $VALUES.clone();
    }
}
