package androidx.core.backported.fixes;

import androidx.compose.material.TextKt$$ExternalSyntheticLambda0;
import java.util.Set;

/* loaded from: classes3.dex */
public final class KnownIssue {
    public final Integer alias;
    public final Set manuallyTestedFingerprints;
    public final TextKt$$ExternalSyntheticLambda0 precondition;

    public KnownIssue(Set set, TextKt$$ExternalSyntheticLambda0 textKt$$ExternalSyntheticLambda0) {
        set.getClass();
        this.alias = 5;
        this.manuallyTestedFingerprints = set;
        this.precondition = textKt$$ExternalSyntheticLambda0;
    }

    public final boolean equals(Object obj) {
        return obj instanceof KnownIssue;
    }

    public final int hashCode() {
        return Long.hashCode(398591036L);
    }

    public final String toString() {
        Integer num = this.alias;
        if (num == null) {
            return "398591036 without alias";
        }
        return "398591036 with alias " + num.intValue();
    }
}
