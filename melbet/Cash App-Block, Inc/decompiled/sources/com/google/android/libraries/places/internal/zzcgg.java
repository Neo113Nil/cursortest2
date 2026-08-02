package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzcgg implements zzbxz {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTION_RESET("connection reset"),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTION_TIMED_OUT("connection timed out"),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTION_ABORTED("connection aborted"),
    /* JADX INFO: Fake field, exist only in values array */
    SOCKET_ERROR("socket error"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN("unknown");

    public final String zzg;

    zzcgg(String str) {
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.zzbxz
    public final String zza() {
        return this.zzg;
    }
}
