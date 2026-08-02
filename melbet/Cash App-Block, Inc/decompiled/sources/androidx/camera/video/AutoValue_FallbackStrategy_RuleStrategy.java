package androidx.camera.video;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AutoValue_FallbackStrategy_RuleStrategy {
    public static final AutoValue_FallbackStrategy_RuleStrategy NONE = new AutoValue_FallbackStrategy_RuleStrategy(AutoValue_Quality_ConstantQuality.NONE, 0);
    public final AutoValue_Quality_ConstantQuality fallbackQuality;
    public final int fallbackRule;

    public AutoValue_FallbackStrategy_RuleStrategy(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality, int i) {
        if (autoValue_Quality_ConstantQuality == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null fallbackQuality");
            throw null;
        }
        this.fallbackQuality = autoValue_Quality_ConstantQuality;
        this.fallbackRule = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_FallbackStrategy_RuleStrategy)) {
            return false;
        }
        AutoValue_FallbackStrategy_RuleStrategy autoValue_FallbackStrategy_RuleStrategy = (AutoValue_FallbackStrategy_RuleStrategy) obj;
        return this.fallbackQuality.equals(autoValue_FallbackStrategy_RuleStrategy.fallbackQuality) && this.fallbackRule == autoValue_FallbackStrategy_RuleStrategy.fallbackRule;
    }

    public final int hashCode() {
        return this.fallbackRule ^ ((this.fallbackQuality.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.fallbackQuality);
        sb.append(", fallbackRule=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fallbackRule, "}", sb);
    }
}
