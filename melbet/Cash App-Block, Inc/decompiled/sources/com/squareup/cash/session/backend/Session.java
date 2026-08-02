package com.squareup.cash.session.backend;

import com.squareup.moshi.JsonClass;
import com.squareup.protos.franklin.common.SessionStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/session/backend/Session;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Session {
    public final SessionStatus status;
    public final String token;

    public Session(String str, SessionStatus sessionStatus) {
        str.getClass();
        sessionStatus.getClass();
        this.token = str;
        this.status = sessionStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return Intrinsics.areEqual(this.token, session.token) && this.status == session.status;
    }

    public final int hashCode() {
        return this.status.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "Session(token=" + this.token + ", status=" + this.status + ")";
    }
}
