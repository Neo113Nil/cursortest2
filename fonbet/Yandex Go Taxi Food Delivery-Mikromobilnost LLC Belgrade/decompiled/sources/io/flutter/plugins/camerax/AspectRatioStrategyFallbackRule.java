package io.flutter.plugins.camerax;

import defpackage.k4o;
import defpackage.t83;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/flutter/plugins/camerax/AspectRatioStrategyFallbackRule;", "", "", "raw", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "t83", "AUTO", JCP.RAW_PREFIX, "UNKNOWN", "camera_android_camerax_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AspectRatioStrategyFallbackRule {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AspectRatioStrategyFallbackRule[] $VALUES;
    public static final AspectRatioStrategyFallbackRule AUTO;
    public static final t83 Companion;
    public static final AspectRatioStrategyFallbackRule NONE;
    public static final AspectRatioStrategyFallbackRule UNKNOWN;
    private final int raw;

    static {
        AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule = new AspectRatioStrategyFallbackRule("AUTO", 0, 0);
        AUTO = aspectRatioStrategyFallbackRule;
        AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule2 = new AspectRatioStrategyFallbackRule(JCP.RAW_PREFIX, 1, 1);
        NONE = aspectRatioStrategyFallbackRule2;
        AspectRatioStrategyFallbackRule aspectRatioStrategyFallbackRule3 = new AspectRatioStrategyFallbackRule("UNKNOWN", 2, 2);
        UNKNOWN = aspectRatioStrategyFallbackRule3;
        AspectRatioStrategyFallbackRule[] aspectRatioStrategyFallbackRuleArr = {aspectRatioStrategyFallbackRule, aspectRatioStrategyFallbackRule2, aspectRatioStrategyFallbackRule3};
        $VALUES = aspectRatioStrategyFallbackRuleArr;
        $ENTRIES = kotlin.enums.a.a(aspectRatioStrategyFallbackRuleArr);
        Companion = new t83();
    }

    public AspectRatioStrategyFallbackRule(String str, int i, int i2) {
        this.raw = i2;
    }

    public static AspectRatioStrategyFallbackRule valueOf(String str) {
        return (AspectRatioStrategyFallbackRule) Enum.valueOf(AspectRatioStrategyFallbackRule.class, str);
    }

    public static AspectRatioStrategyFallbackRule[] values() {
        return (AspectRatioStrategyFallbackRule[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRaw() {
        return this.raw;
    }
}
