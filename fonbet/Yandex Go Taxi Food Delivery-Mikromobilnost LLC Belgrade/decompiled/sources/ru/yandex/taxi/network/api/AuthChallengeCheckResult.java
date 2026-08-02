package ru.yandex.taxi.network.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/network/api/AuthChallengeCheckResult;", "", "Success", "Dismissed", "AlreadyDone", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthChallengeCheckResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuthChallengeCheckResult[] $VALUES;
    public static final AuthChallengeCheckResult AlreadyDone;
    public static final AuthChallengeCheckResult Dismissed;
    public static final AuthChallengeCheckResult Success;

    static {
        AuthChallengeCheckResult authChallengeCheckResult = new AuthChallengeCheckResult("Success", 0);
        Success = authChallengeCheckResult;
        AuthChallengeCheckResult authChallengeCheckResult2 = new AuthChallengeCheckResult("Dismissed", 1);
        Dismissed = authChallengeCheckResult2;
        AuthChallengeCheckResult authChallengeCheckResult3 = new AuthChallengeCheckResult("AlreadyDone", 2);
        AlreadyDone = authChallengeCheckResult3;
        AuthChallengeCheckResult[] authChallengeCheckResultArr = {authChallengeCheckResult, authChallengeCheckResult2, authChallengeCheckResult3};
        $VALUES = authChallengeCheckResultArr;
        $ENTRIES = kotlin.enums.a.a(authChallengeCheckResultArr);
    }

    public static AuthChallengeCheckResult valueOf(String str) {
        return (AuthChallengeCheckResult) Enum.valueOf(AuthChallengeCheckResult.class, str);
    }

    public static AuthChallengeCheckResult[] values() {
        return (AuthChallengeCheckResult[]) $VALUES.clone();
    }
}
