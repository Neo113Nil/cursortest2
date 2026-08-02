package com.squareup.cash.moneybot.genie;

import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.genie.protos.Node;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class ResolvedModifiers {
    public final Modifier modifier;
    public final Node overlay;
    public final ResolvedStyle style;

    public ResolvedModifiers(Modifier modifier, ResolvedStyle resolvedStyle, Node node) {
        modifier.getClass();
        this.modifier = modifier;
        this.style = resolvedStyle;
        this.overlay = node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedModifiers)) {
            return false;
        }
        ResolvedModifiers resolvedModifiers = (ResolvedModifiers) obj;
        return Intrinsics.areEqual(this.modifier, resolvedModifiers.modifier) && this.style.equals(resolvedModifiers.style) && Intrinsics.areEqual(this.overlay, resolvedModifiers.overlay);
    }

    public final int hashCode() {
        int hashCode = (this.style.hashCode() + (this.modifier.hashCode() * 31)) * 31;
        Node node = this.overlay;
        return hashCode + (node == null ? 0 : node.hashCode());
    }

    public final String toString() {
        return "ResolvedModifiers(modifier=" + this.modifier + ", style=" + this.style + ", overlay=" + this.overlay + ")";
    }
}
