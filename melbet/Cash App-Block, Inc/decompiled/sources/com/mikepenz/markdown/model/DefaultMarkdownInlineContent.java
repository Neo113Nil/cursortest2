package com.mikepenz.markdown.model;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DefaultMarkdownInlineContent {
    public final Map inlineContent;

    public DefaultMarkdownInlineContent(Map map) {
        map.getClass();
        this.inlineContent = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultMarkdownInlineContent.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.inlineContent, ((DefaultMarkdownInlineContent) obj).inlineContent);
    }

    public final int hashCode() {
        return this.inlineContent.hashCode();
    }
}
