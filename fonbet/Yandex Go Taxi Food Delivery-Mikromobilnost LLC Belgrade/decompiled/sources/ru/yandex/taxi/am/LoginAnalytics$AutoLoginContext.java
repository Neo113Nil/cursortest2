package ru.yandex.taxi.am;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/am/LoginAnalytics$AutoLoginContext", "", "Lru/yandex/taxi/am/LoginAnalytics$AutoLoginContext;", "SMARTLOCK", "NOTIFICATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoginAnalytics$AutoLoginContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LoginAnalytics$AutoLoginContext[] $VALUES;
    public static final LoginAnalytics$AutoLoginContext NOTIFICATION;
    public static final LoginAnalytics$AutoLoginContext SMARTLOCK;

    static {
        LoginAnalytics$AutoLoginContext loginAnalytics$AutoLoginContext = new LoginAnalytics$AutoLoginContext("SMARTLOCK", 0);
        SMARTLOCK = loginAnalytics$AutoLoginContext;
        LoginAnalytics$AutoLoginContext loginAnalytics$AutoLoginContext2 = new LoginAnalytics$AutoLoginContext("NOTIFICATION", 1);
        NOTIFICATION = loginAnalytics$AutoLoginContext2;
        LoginAnalytics$AutoLoginContext[] loginAnalytics$AutoLoginContextArr = {loginAnalytics$AutoLoginContext, loginAnalytics$AutoLoginContext2};
        $VALUES = loginAnalytics$AutoLoginContextArr;
        $ENTRIES = kotlin.enums.a.a(loginAnalytics$AutoLoginContextArr);
    }

    public static LoginAnalytics$AutoLoginContext valueOf(String str) {
        return (LoginAnalytics$AutoLoginContext) Enum.valueOf(LoginAnalytics$AutoLoginContext.class, str);
    }

    public static LoginAnalytics$AutoLoginContext[] values() {
        return (LoginAnalytics$AutoLoginContext[]) $VALUES.clone();
    }
}
