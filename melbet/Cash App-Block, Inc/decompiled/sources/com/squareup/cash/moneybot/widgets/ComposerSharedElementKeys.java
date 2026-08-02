package com.squareup.cash.moneybot.widgets;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ComposerSharedElementKeys {
    public static final ComposerSharedElementKeys Default = new ComposerSharedElementKeys(ComposerSharedElementKey.Background, ComposerSharedElementKey.SendButton, ComposerSharedElementKey.TextInput, ComposerSharedElementKey.Bounds);
    public final Enum background;
    public final Enum bounds;
    public final Object sendButton;
    public final Object textInput;

    public ComposerSharedElementKeys(Enum r1, ComposerSharedElementKey composerSharedElementKey, ComposerSharedElementKey composerSharedElementKey2, Enum r4) {
        this.background = r1;
        this.sendButton = composerSharedElementKey;
        this.textInput = composerSharedElementKey2;
        this.bounds = r4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerSharedElementKeys)) {
            return false;
        }
        ComposerSharedElementKeys composerSharedElementKeys = (ComposerSharedElementKeys) obj;
        return this.background.equals(composerSharedElementKeys.background) && Intrinsics.areEqual(this.sendButton, composerSharedElementKeys.sendButton) && Intrinsics.areEqual(this.textInput, composerSharedElementKeys.textInput) && this.bounds.equals(composerSharedElementKeys.bounds);
    }

    public final int hashCode() {
        int hashCode = this.background.hashCode() * 31;
        Object obj = this.sendButton;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.textInput;
        return this.bounds.hashCode() + ((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ComposerSharedElementKeys(background=" + this.background + ", sendButton=" + this.sendButton + ", textInput=" + this.textInput + ", bounds=" + this.bounds + ")";
    }
}
