package com.squareup.cash.passkeys.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Passkey {
    public final long createdAtMillis;
    public final String id;
    public final Long lastUsedAtMillis;
    public final String name;

    public Passkey(String str, String str2, long j, Long l) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
        this.createdAtMillis = j;
        this.lastUsedAtMillis = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Passkey)) {
            return false;
        }
        Passkey passkey = (Passkey) obj;
        return Intrinsics.areEqual(this.id, passkey.id) && Intrinsics.areEqual(this.name, passkey.name) && this.createdAtMillis == passkey.createdAtMillis && Intrinsics.areEqual(this.lastUsedAtMillis, passkey.lastUsedAtMillis);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name), 31, this.createdAtMillis);
        Long l = this.lastUsedAtMillis;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Passkey(id=", this.id, ", name=", this.name, ", createdAtMillis=");
        m.append(this.createdAtMillis);
        m.append(", lastUsedAtMillis=");
        m.append(this.lastUsedAtMillis);
        m.append(")");
        return m.toString();
    }
}
