package io.flutter.plugins.camerax;

import defpackage.dsj0;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/flutter/plugins/camerax/ResolutionStrategyFallbackRule;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "dsj0", "CLOSEST_HIGHER", "CLOSEST_HIGHER_THEN_LOWER", "CLOSEST_LOWER", "CLOSEST_LOWER_THEN_HIGHER", JCP.RAW_PREFIX, "UNKNOWN", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResolutionStrategyFallbackRule {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResolutionStrategyFallbackRule[] $VALUES;
    public static final ResolutionStrategyFallbackRule CLOSEST_HIGHER;
    public static final ResolutionStrategyFallbackRule CLOSEST_HIGHER_THEN_LOWER;
    public static final ResolutionStrategyFallbackRule CLOSEST_LOWER;
    public static final ResolutionStrategyFallbackRule CLOSEST_LOWER_THEN_HIGHER;
    public static final dsj0 Companion;
    public static final ResolutionStrategyFallbackRule NONE;
    public static final ResolutionStrategyFallbackRule UNKNOWN;
    private final int raw;

    static {
        ResolutionStrategyFallbackRule resolutionStrategyFallbackRule = new ResolutionStrategyFallbackRule("CLOSEST_HIGHER", 0, 0);
        CLOSEST_HIGHER = resolutionStrategyFallbackRule;
        ResolutionStrategyFallbackRule resolutionStrategyFallbackRule2 = new ResolutionStrategyFallbackRule("CLOSEST_HIGHER_THEN_LOWER", 1, 1);
        CLOSEST_HIGHER_THEN_LOWER = resolutionStrategyFallbackRule2;
        ResolutionStrategyFallbackRule resolutionStrategyFallbackRule3 = new ResolutionStrategyFallbackRule("CLOSEST_LOWER", 2, 2);
        CLOSEST_LOWER = resolutionStrategyFallbackRule3;
        ResolutionStrategyFallbackRule resolutionStrategyFallbackRule4 = new ResolutionStrategyFallbackRule("CLOSEST_LOWER_THEN_HIGHER", 3, 3);
        CLOSEST_LOWER_THEN_HIGHER = resolutionStrategyFallbackRule4;
        ResolutionStrategyFallbackRule resolutionStrategyFallbackRule5 = new ResolutionStrategyFallbackRule(JCP.RAW_PREFIX, 4, 4);
        NONE = resolutionStrategyFallbackRule5;
        ResolutionStrategyFallbackRule resolutionStrategyFallbackRule6 = new ResolutionStrategyFallbackRule("UNKNOWN", 5, 5);
        UNKNOWN = resolutionStrategyFallbackRule6;
        ResolutionStrategyFallbackRule[] resolutionStrategyFallbackRuleArr = {resolutionStrategyFallbackRule, resolutionStrategyFallbackRule2, resolutionStrategyFallbackRule3, resolutionStrategyFallbackRule4, resolutionStrategyFallbackRule5, resolutionStrategyFallbackRule6};
        $VALUES = resolutionStrategyFallbackRuleArr;
        $ENTRIES = kotlin.enums.a.a(resolutionStrategyFallbackRuleArr);
        Companion = new dsj0();
    }

    public ResolutionStrategyFallbackRule(String str, int i, int i2) {
        this.raw = i2;
    }

    public static ResolutionStrategyFallbackRule valueOf(String str) {
        return (ResolutionStrategyFallbackRule) Enum.valueOf(ResolutionStrategyFallbackRule.class, str);
    }

    public static ResolutionStrategyFallbackRule[] values() {
        return (ResolutionStrategyFallbackRule[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
