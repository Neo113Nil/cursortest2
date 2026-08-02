package ru.yandex.taxi.network.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/network/api/models/CheckType;", "", "Captcha", "AuthChallenge", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckType[] $VALUES;
    public static final CheckType AuthChallenge;
    public static final CheckType Captcha;

    static {
        CheckType checkType = new CheckType("Captcha", 0);
        Captcha = checkType;
        CheckType checkType2 = new CheckType("AuthChallenge", 1);
        AuthChallenge = checkType2;
        CheckType[] checkTypeArr = {checkType, checkType2};
        $VALUES = checkTypeArr;
        $ENTRIES = a.a(checkTypeArr);
    }

    public static CheckType valueOf(String str) {
        return (CheckType) Enum.valueOf(CheckType.class, str);
    }

    public static CheckType[] values() {
        return (CheckType[]) $VALUES.clone();
    }
}
