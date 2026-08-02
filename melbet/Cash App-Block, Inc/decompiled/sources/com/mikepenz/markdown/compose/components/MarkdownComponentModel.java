package com.mikepenz.markdown.compose.components;

import com.mikepenz.markdown.model.DefaultMarkdownTypography;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes9.dex */
public final class MarkdownComponentModel {
    public final String content;
    public final PersistentMap extra;
    public final ASTNodeImpl node;
    public final DefaultMarkdownTypography typography;

    public MarkdownComponentModel(String str, ASTNodeImpl aSTNodeImpl, DefaultMarkdownTypography defaultMarkdownTypography, PersistentMap persistentMap) {
        str.getClass();
        aSTNodeImpl.getClass();
        defaultMarkdownTypography.getClass();
        persistentMap.getClass();
        this.content = str;
        this.node = aSTNodeImpl;
        this.typography = defaultMarkdownTypography;
        this.extra = persistentMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarkdownComponentModel)) {
            return false;
        }
        MarkdownComponentModel markdownComponentModel = (MarkdownComponentModel) obj;
        return Intrinsics.areEqual(this.content, markdownComponentModel.content) && Intrinsics.areEqual(this.node, markdownComponentModel.node) && Intrinsics.areEqual(this.typography, markdownComponentModel.typography) && Intrinsics.areEqual(this.extra, markdownComponentModel.extra);
    }

    public final int hashCode() {
        return this.extra.hashCode() + ((this.typography.hashCode() + ((this.node.hashCode() + (this.content.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MarkdownComponentModel(content=" + this.content + ", node=" + this.node + ", typography=" + this.typography + ", extra=" + this.extra + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MarkdownComponentModel(String str, ASTNodeImpl aSTNodeImpl, DefaultMarkdownTypography defaultMarkdownTypography) {
        this(str, aSTNodeImpl, defaultMarkdownTypography, r0);
        PersistentOrderedMap persistentOrderedMap = PersistentOrderedMap.EMPTY;
        persistentOrderedMap.getClass();
    }
}
