package com.squareup.cash.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Storage_link {
    public final String account_token;
    public final long created_at_ms;
    public final long id;
    public final long signin_group_id;

    public Storage_link(long j, String str, long j2, long j3) {
        this.account_token = str;
        this.id = j;
        this.signin_group_id = j2;
        this.created_at_ms = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Storage_link)) {
            return false;
        }
        Storage_link storage_link = (Storage_link) obj;
        return Intrinsics.areEqual(this.account_token, storage_link.account_token) && this.id == storage_link.id && this.signin_group_id == storage_link.signin_group_id && this.created_at_ms == storage_link.created_at_ms;
    }

    public final int hashCode() {
        String str = this.account_token;
        return Long.hashCode(this.created_at_ms) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.id), 31, this.signin_group_id);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Storage_link(account_token=", this.account_token, ", id=", this.id);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.signin_group_id, ", signin_group_id=", ", created_at_ms=", m);
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.created_at_ms, ")", m);
    }
}
