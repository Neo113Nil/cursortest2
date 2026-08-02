package com.squareup.cash.db;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Session {
    public final String account_token;
    public final String app_token;
    public final boolean onboarded;
    public final Long session_status;
    public final String session_token;
    public final String target_account_token;

    public Session(String str, String str2, String str3, String str4, Long l, boolean z) {
        this.app_token = str;
        this.account_token = str2;
        this.target_account_token = str3;
        this.session_token = str4;
        this.session_status = l;
        this.onboarded = z;
    }

    public static Session copy$default(Session session, String str, String str2, String str3, String str4, Long l, boolean z, int i) {
        if ((i & 1) != 0) {
            str = session.app_token;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = session.account_token;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = session.target_account_token;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = session.session_token;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            l = session.session_status;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            z = session.onboarded;
        }
        session.getClass();
        session.getClass();
        return new Session(str5, str6, str7, str8, l2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return Intrinsics.areEqual(this.app_token, session.app_token) && Intrinsics.areEqual(this.account_token, session.account_token) && Intrinsics.areEqual(this.target_account_token, session.target_account_token) && Intrinsics.areEqual(this.session_token, session.session_token) && Intrinsics.areEqual(this.session_status, session.session_status) && this.onboarded == session.onboarded;
    }

    public final int hashCode() {
        String str = this.app_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.account_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target_account_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.session_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.session_status;
        return Long.hashCode(1L) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (l != null ? l.hashCode() : 0)) * 31, 31, this.onboarded);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Session(app_token=", this.app_token, ", account_token=", this.account_token, ", target_account_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.target_account_token, ", session_token=", this.session_token, ", session_status=");
        m.append(this.session_status);
        m.append(", onboarded=");
        m.append(this.onboarded);
        m.append(", id=1)");
        return m.toString();
    }
}
