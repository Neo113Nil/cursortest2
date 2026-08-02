package com.squareup.cash.notifications.intents;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashNotificationIntents {
    public final Intent content;
    public final Intent delete;

    public CashNotificationIntents(Intent intent, Intent intent2) {
        this.content = intent;
        this.delete = intent2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashNotificationIntents)) {
            return false;
        }
        CashNotificationIntents cashNotificationIntents = (CashNotificationIntents) obj;
        return this.content.equals(cashNotificationIntents.content) && Intrinsics.areEqual(this.delete, cashNotificationIntents.delete);
    }

    public final int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        Intent intent = this.delete;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "CashNotificationIntents(content=" + this.content + ", delete=" + this.delete + ")";
    }
}
