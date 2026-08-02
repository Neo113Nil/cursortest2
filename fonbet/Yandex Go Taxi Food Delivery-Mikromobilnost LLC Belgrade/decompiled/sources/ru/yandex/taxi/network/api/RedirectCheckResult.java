package ru.yandex.taxi.network.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/network/api/RedirectCheckResult;", "", "Success", "Dismissed", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedirectCheckResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RedirectCheckResult[] $VALUES;
    public static final RedirectCheckResult Dismissed;
    public static final RedirectCheckResult Success;

    static {
        RedirectCheckResult redirectCheckResult = new RedirectCheckResult("Success", 0);
        Success = redirectCheckResult;
        RedirectCheckResult redirectCheckResult2 = new RedirectCheckResult("Dismissed", 1);
        Dismissed = redirectCheckResult2;
        RedirectCheckResult[] redirectCheckResultArr = {redirectCheckResult, redirectCheckResult2};
        $VALUES = redirectCheckResultArr;
        $ENTRIES = kotlin.enums.a.a(redirectCheckResultArr);
    }

    public static RedirectCheckResult valueOf(String str) {
        return (RedirectCheckResult) Enum.valueOf(RedirectCheckResult.class, str);
    }

    public static RedirectCheckResult[] values() {
        return (RedirectCheckResult[]) $VALUES.clone();
    }
}
