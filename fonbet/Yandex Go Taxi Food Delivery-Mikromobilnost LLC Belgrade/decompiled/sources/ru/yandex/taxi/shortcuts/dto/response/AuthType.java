package ru.yandex.taxi.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.q03;
import defpackage.ul3;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/shortcuts/dto/response/AuthType;", "", "Companion", "ul3", "COOKIES", "OAUTH", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AuthType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuthType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final AuthType COOKIES;
    public static final ul3 Companion;
    public static final AuthType OAUTH;

    static {
        AuthType authType = new AuthType("COOKIES", 0);
        COOKIES = authType;
        AuthType authType2 = new AuthType("OAUTH", 1);
        OAUTH = authType2;
        AuthType[] authTypeArr = {authType, authType2};
        $VALUES = authTypeArr;
        $ENTRIES = a.a(authTypeArr);
        Companion = new ul3();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(7));
    }

    public static AuthType valueOf(String str) {
        return (AuthType) Enum.valueOf(AuthType.class, str);
    }

    public static AuthType[] values() {
        return (AuthType[]) $VALUES.clone();
    }
}
