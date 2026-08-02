package com.squareup.cash.moneybot.backend.api.model.chat;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Session {
    public final String id;
    public final String title;
    public final Long updatedAtMs;

    public Session(Long l, String str, String str2) {
        this.id = str;
        this.title = str2;
        this.updatedAtMs = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return this.id.equals(session.id) && Intrinsics.areEqual(this.title, session.title) && Intrinsics.areEqual(this.updatedAtMs, session.updatedAtMs);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.updatedAtMs;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Session(id=", this.id, ", title=", this.title, ", updatedAtMs="), this.updatedAtMs, ")");
    }
}
