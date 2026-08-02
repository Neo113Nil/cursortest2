package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/locationsdk/processor_on_jump_or_divergence/internal/processor/model/GroupType;", "", "Primary", "Alternative", "Reference", "processor-on-jump-or-divergence"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GroupType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GroupType[] $VALUES;
    public static final GroupType Alternative;
    public static final GroupType Primary;
    public static final GroupType Reference;

    static {
        GroupType groupType = new GroupType("Primary", 0);
        Primary = groupType;
        GroupType groupType2 = new GroupType("Alternative", 1);
        Alternative = groupType2;
        GroupType groupType3 = new GroupType("Reference", 2);
        Reference = groupType3;
        GroupType[] groupTypeArr = {groupType, groupType2, groupType3};
        $VALUES = groupTypeArr;
        $ENTRIES = a.a(groupTypeArr);
    }

    public static GroupType valueOf(String str) {
        return (GroupType) Enum.valueOf(GroupType.class, str);
    }

    public static GroupType[] values() {
        return (GroupType[]) $VALUES.clone();
    }
}
