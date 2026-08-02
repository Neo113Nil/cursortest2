package ru.yandex.taxi.requirements.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/requirements/analytics/RequirementRemoveSource;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "BUBBLE", "LIST", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementRemoveSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RequirementRemoveSource[] $VALUES;
    public static final RequirementRemoveSource BUBBLE;
    public static final RequirementRemoveSource LIST;
    private final String value;

    static {
        RequirementRemoveSource requirementRemoveSource = new RequirementRemoveSource("BUBBLE", 0, "bubble");
        BUBBLE = requirementRemoveSource;
        RequirementRemoveSource requirementRemoveSource2 = new RequirementRemoveSource("LIST", 1, "list");
        LIST = requirementRemoveSource2;
        RequirementRemoveSource[] requirementRemoveSourceArr = {requirementRemoveSource, requirementRemoveSource2};
        $VALUES = requirementRemoveSourceArr;
        $ENTRIES = kotlin.enums.a.a(requirementRemoveSourceArr);
    }

    public RequirementRemoveSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static RequirementRemoveSource valueOf(String str) {
        return (RequirementRemoveSource) Enum.valueOf(RequirementRemoveSource.class, str);
    }

    public static RequirementRemoveSource[] values() {
        return (RequirementRemoveSource[]) $VALUES.clone();
    }
}
