package com.mikepenz.markdown.model;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DefaultMarkdownExtendedSpans {
    public final Function2 extendedSpans;

    public DefaultMarkdownExtendedSpans(Function2 function2) {
        this.extendedSpans = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultMarkdownExtendedSpans.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.extendedSpans, ((DefaultMarkdownExtendedSpans) obj).extendedSpans);
    }

    public final int hashCode() {
        Function2 function2 = this.extendedSpans;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }
}
