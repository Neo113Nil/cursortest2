package ru.yandex.taxi.eatskit.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mvt;
import defpackage.rzt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/eatskit/dto/GrantResult;", "", "Companion", "rzt", "GRANTED", "DENIED", "DONT_ASK_AGAIN", "UNAVAILABLE", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GrantResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GrantResult[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final rzt Companion;
    public static final GrantResult DENIED;
    public static final GrantResult DONT_ASK_AGAIN;
    public static final GrantResult GRANTED;
    public static final GrantResult UNAVAILABLE;

    static {
        GrantResult grantResult = new GrantResult("GRANTED", 0);
        GRANTED = grantResult;
        GrantResult grantResult2 = new GrantResult("DENIED", 1);
        DENIED = grantResult2;
        GrantResult grantResult3 = new GrantResult("DONT_ASK_AGAIN", 2);
        DONT_ASK_AGAIN = grantResult3;
        GrantResult grantResult4 = new GrantResult("UNAVAILABLE", 3);
        UNAVAILABLE = grantResult4;
        GrantResult[] grantResultArr = {grantResult, grantResult2, grantResult3, grantResult4};
        $VALUES = grantResultArr;
        $ENTRIES = kotlin.enums.a.a(grantResultArr);
        Companion = new rzt();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(9));
    }

    public static GrantResult valueOf(String str) {
        return (GrantResult) Enum.valueOf(GrantResult.class, str);
    }

    public static GrantResult[] values() {
        return (GrantResult[]) $VALUES.clone();
    }
}
