package com.squareup.cash.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public final class GetLinkForAccount {
    public final long created_at_ms;
    public final long id;
    public final long signin_group_id;

    public GetLinkForAccount(long j, long j2, long j3) {
        this.id = j;
        this.signin_group_id = j2;
        this.created_at_ms = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLinkForAccount)) {
            return false;
        }
        GetLinkForAccount getLinkForAccount = (GetLinkForAccount) obj;
        return this.id == getLinkForAccount.id && this.signin_group_id == getLinkForAccount.signin_group_id && this.created_at_ms == getLinkForAccount.created_at_ms;
    }

    public final long getCreated_at_ms() {
        return this.created_at_ms;
    }

    public final long getId() {
        return this.id;
    }

    public final long getSignin_group_id() {
        return this.signin_group_id;
    }

    public final int hashCode() {
        return Long.hashCode(this.created_at_ms) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.id) * 31, 31, this.signin_group_id);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.id, "GetLinkForAccount(id=", ", signin_group_id=");
        m1149m.append(this.signin_group_id);
        return Boxes$$ExternalSyntheticOutline1.m(this.created_at_ms, ", created_at_ms=", ")", m1149m);
    }
}
