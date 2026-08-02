package ru.yandex.taxi.maas.api.deeplink;

import defpackage.k4o;
import defpackage.v100;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/maas/api/deeplink/MaasMode;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "v100", "TO_METRO", "FROM_METRO", "ROUTE", "ACCOUNT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaasMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MaasMode[] $VALUES;
    public static final MaasMode ACCOUNT;
    public static final v100 Companion;
    public static final MaasMode FROM_METRO;
    public static final MaasMode ROUTE;
    public static final MaasMode TO_METRO;
    private final String value;

    static {
        MaasMode maasMode = new MaasMode("TO_METRO", 0, "ride_to_metro");
        TO_METRO = maasMode;
        MaasMode maasMode2 = new MaasMode("FROM_METRO", 1, "ride_from_metro");
        FROM_METRO = maasMode2;
        MaasMode maasMode3 = new MaasMode("ROUTE", 2, "route");
        ROUTE = maasMode3;
        MaasMode maasMode4 = new MaasMode("ACCOUNT", 3, "account");
        ACCOUNT = maasMode4;
        MaasMode[] maasModeArr = {maasMode, maasMode2, maasMode3, maasMode4};
        $VALUES = maasModeArr;
        $ENTRIES = a.a(maasModeArr);
        Companion = new v100();
    }

    public MaasMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MaasMode valueOf(String str) {
        return (MaasMode) Enum.valueOf(MaasMode.class, str);
    }

    public static MaasMode[] values() {
        return (MaasMode[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
