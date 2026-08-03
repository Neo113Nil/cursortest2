package com.createyourself.policy;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PolicyController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/createyourself/policy/PolicyDecision;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Accepted", "Declined", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class PolicyDecision {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PolicyDecision[] $VALUES;
    public static final PolicyDecision None = new PolicyDecision("None", 0);
    public static final PolicyDecision Accepted = new PolicyDecision("Accepted", 1);
    public static final PolicyDecision Declined = new PolicyDecision("Declined", 2);

    private static final /* synthetic */ PolicyDecision[] $values() {
        return new PolicyDecision[]{None, Accepted, Declined};
    }

    public static EnumEntries<PolicyDecision> getEntries() {
        return $ENTRIES;
    }

    private PolicyDecision(String str, int i) {
    }

    static {
        PolicyDecision[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PolicyDecision valueOf(String str) {
        return (PolicyDecision) Enum.valueOf(PolicyDecision.class, str);
    }

    public static PolicyDecision[] values() {
        return (PolicyDecision[]) $VALUES.clone();
    }
}
