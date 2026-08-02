package com.squareup.cash.moneybot.backend.api.model.chat;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SessionPage {
    public final Long nextCursor;
    public final ArrayList sessions;

    public SessionPage(ArrayList arrayList, Long l) {
        this.sessions = arrayList;
        this.nextCursor = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionPage)) {
            return false;
        }
        SessionPage sessionPage = (SessionPage) obj;
        return this.sessions.equals(sessionPage.sessions) && Intrinsics.areEqual(this.nextCursor, sessionPage.nextCursor);
    }

    public final int hashCode() {
        int hashCode = this.sessions.hashCode() * 31;
        Long l = this.nextCursor;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "SessionPage(sessions=" + this.sessions + ", nextCursor=" + this.nextCursor + ")";
    }
}
