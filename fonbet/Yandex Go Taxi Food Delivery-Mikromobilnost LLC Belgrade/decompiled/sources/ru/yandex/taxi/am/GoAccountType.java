package ru.yandex.taxi.am;

import com.yandex.auth.LegacyAccountType;
import defpackage.k4o;
import defpackage.xlt;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/am/GoAccountType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "xlt", "Yandex", "Lite", "Phonish", "Social", "None", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GoAccountType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GoAccountType[] $VALUES;
    public static final xlt Companion;
    public static final GoAccountType Lite;
    public static final GoAccountType None;
    public static final GoAccountType Phonish;
    public static final GoAccountType Social;
    public static final GoAccountType Yandex;
    private final String value;

    static {
        GoAccountType goAccountType = new GoAccountType("Yandex", 0, "yandex");
        Yandex = goAccountType;
        GoAccountType goAccountType2 = new GoAccountType("Lite", 1, "lite");
        Lite = goAccountType2;
        GoAccountType goAccountType3 = new GoAccountType("Phonish", 2, "phonish");
        Phonish = goAccountType3;
        GoAccountType goAccountType4 = new GoAccountType("Social", 3, LegacyAccountType.STRING_SOCIAL);
        Social = goAccountType4;
        GoAccountType goAccountType5 = new GoAccountType("None", 4, "none");
        None = goAccountType5;
        GoAccountType[] goAccountTypeArr = {goAccountType, goAccountType2, goAccountType3, goAccountType4, goAccountType5};
        $VALUES = goAccountTypeArr;
        $ENTRIES = kotlin.enums.a.a(goAccountTypeArr);
        Companion = new xlt();
    }

    public GoAccountType(String str, int i, String str2) {
        this.value = str2;
    }

    public static GoAccountType valueOf(String str) {
        return (GoAccountType) Enum.valueOf(GoAccountType.class, str);
    }

    public static GoAccountType[] values() {
        return (GoAccountType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
