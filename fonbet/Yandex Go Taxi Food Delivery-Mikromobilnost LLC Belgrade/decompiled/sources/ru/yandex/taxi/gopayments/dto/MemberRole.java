package ru.yandex.taxi.gopayments.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.sh10;
import defpackage.w410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/gopayments/dto/MemberRole;", "", "Companion", "sh10", "OWNER", "USER", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MemberRole {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MemberRole[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final sh10 Companion;
    public static final MemberRole OWNER;
    public static final MemberRole UNKNOWN;
    public static final MemberRole USER;

    static {
        MemberRole memberRole = new MemberRole("OWNER", 0);
        OWNER = memberRole;
        MemberRole memberRole2 = new MemberRole("USER", 1);
        USER = memberRole2;
        MemberRole memberRole3 = new MemberRole("UNKNOWN", 2);
        UNKNOWN = memberRole3;
        MemberRole[] memberRoleArr = {memberRole, memberRole2, memberRole3};
        $VALUES = memberRoleArr;
        $ENTRIES = a.a(memberRoleArr);
        Companion = new sh10();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(14));
    }

    public static MemberRole valueOf(String str) {
        return (MemberRole) Enum.valueOf(MemberRole.class, str);
    }

    public static MemberRole[] values() {
        return (MemberRole[]) $VALUES.clone();
    }
}
