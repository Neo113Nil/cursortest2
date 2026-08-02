package com.mikepenz.markdown.model;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DefaultMarkdownAnimation {
    public final Function1 animateTextSize;

    public DefaultMarkdownAnimation(Function1 function1) {
        function1.getClass();
        this.animateTextSize = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultMarkdownAnimation.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.animateTextSize, ((DefaultMarkdownAnimation) obj).animateTextSize);
    }

    public final int hashCode() {
        return this.animateTextSize.hashCode();
    }
}
