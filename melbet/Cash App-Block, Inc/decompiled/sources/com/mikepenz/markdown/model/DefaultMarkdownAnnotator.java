package com.mikepenz.markdown.model;

/* loaded from: classes4.dex */
public final class DefaultMarkdownAnnotator {
    public final DefaultMarkdownAnnotatorConfig config;

    public DefaultMarkdownAnnotator(DefaultMarkdownAnnotatorConfig defaultMarkdownAnnotatorConfig) {
        this.config = defaultMarkdownAnnotatorConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DefaultMarkdownAnnotator.class == obj.getClass() && this.config.equals(((DefaultMarkdownAnnotator) obj).config);
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }
}
