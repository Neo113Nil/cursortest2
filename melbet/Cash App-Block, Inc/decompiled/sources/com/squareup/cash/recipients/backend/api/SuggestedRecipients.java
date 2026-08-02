package com.squareup.cash.recipients.backend.api;

import com.squareup.protos.franklin.common.RecipientGroup;
import com.squareup.protos.franklin.ui.UiControl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SuggestedRecipients {
    public final List recipients;

    public SuggestedRecipients(List list) {
        UiControl.Type.Companion companion = RecipientGroup.Companion;
        list.getClass();
        this.recipients = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedRecipients)) {
            return false;
        }
        UiControl.Type.Companion companion = RecipientGroup.Companion;
        return Intrinsics.areEqual(this.recipients, ((SuggestedRecipients) obj).recipients);
    }

    public final int hashCode() {
        return this.recipients.hashCode() + (RecipientGroup.RECENTS.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestedRecipients(group=" + RecipientGroup.RECENTS + ", recipients=" + this.recipients + ")";
    }
}
