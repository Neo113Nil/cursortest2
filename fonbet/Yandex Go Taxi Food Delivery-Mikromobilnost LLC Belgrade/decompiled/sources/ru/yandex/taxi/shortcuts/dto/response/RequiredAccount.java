package ru.yandex.taxi.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vci0;
import defpackage.w9j0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/shortcuts/dto/response/RequiredAccount;", "", "Companion", "w9j0", "NOT_REQUIRED", "ANY", "NOT_PHONISH", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RequiredAccount {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequiredAccount[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final RequiredAccount ANY;
    public static final w9j0 Companion;
    public static final RequiredAccount NOT_PHONISH;
    public static final RequiredAccount NOT_REQUIRED;

    static {
        RequiredAccount requiredAccount = new RequiredAccount("NOT_REQUIRED", 0);
        NOT_REQUIRED = requiredAccount;
        RequiredAccount requiredAccount2 = new RequiredAccount("ANY", 1);
        ANY = requiredAccount2;
        RequiredAccount requiredAccount3 = new RequiredAccount("NOT_PHONISH", 2);
        NOT_PHONISH = requiredAccount3;
        RequiredAccount[] requiredAccountArr = {requiredAccount, requiredAccount2, requiredAccount3};
        $VALUES = requiredAccountArr;
        $ENTRIES = a.a(requiredAccountArr);
        Companion = new w9j0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(14));
    }

    public static RequiredAccount valueOf(String str) {
        return (RequiredAccount) Enum.valueOf(RequiredAccount.class, str);
    }

    public static RequiredAccount[] values() {
        return (RequiredAccount[]) $VALUES.clone();
    }
}
