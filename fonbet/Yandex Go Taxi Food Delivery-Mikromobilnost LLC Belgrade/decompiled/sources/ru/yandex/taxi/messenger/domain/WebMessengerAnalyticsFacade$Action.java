package ru.yandex.taxi.messenger.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"ru/yandex/taxi/messenger/domain/WebMessengerAnalyticsFacade$Action", "", "Lru/yandex/taxi/messenger/domain/WebMessengerAnalyticsFacade$Action;", "CALL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebMessengerAnalyticsFacade$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebMessengerAnalyticsFacade$Action[] $VALUES;
    public static final WebMessengerAnalyticsFacade$Action CALL;

    static {
        WebMessengerAnalyticsFacade$Action webMessengerAnalyticsFacade$Action = new WebMessengerAnalyticsFacade$Action("CALL", 0);
        CALL = webMessengerAnalyticsFacade$Action;
        WebMessengerAnalyticsFacade$Action[] webMessengerAnalyticsFacade$ActionArr = {webMessengerAnalyticsFacade$Action};
        $VALUES = webMessengerAnalyticsFacade$ActionArr;
        $ENTRIES = kotlin.enums.a.a(webMessengerAnalyticsFacade$ActionArr);
    }

    public static WebMessengerAnalyticsFacade$Action valueOf(String str) {
        return (WebMessengerAnalyticsFacade$Action) Enum.valueOf(WebMessengerAnalyticsFacade$Action.class, str);
    }

    public static WebMessengerAnalyticsFacade$Action[] values() {
        return (WebMessengerAnalyticsFacade$Action[]) $VALUES.clone();
    }
}
