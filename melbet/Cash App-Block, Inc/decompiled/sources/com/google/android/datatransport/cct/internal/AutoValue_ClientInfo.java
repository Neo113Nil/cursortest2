package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;

/* loaded from: classes4.dex */
public final class AutoValue_ClientInfo extends ClientInfo {
    public final AutoValue_AndroidClientInfo androidClientInfo;

    public AutoValue_ClientInfo(AutoValue_AndroidClientInfo autoValue_AndroidClientInfo) {
        this.androidClientInfo = autoValue_AndroidClientInfo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        Object obj2 = ClientInfo.ClientType.ANDROID_FIREBASE;
        if (obj2.equals(obj2)) {
            return this.androidClientInfo.equals(((AutoValue_ClientInfo) clientInfo).androidClientInfo);
        }
        return false;
    }

    public final int hashCode() {
        return this.androidClientInfo.hashCode() ^ ((ClientInfo.ClientType.ANDROID_FIREBASE.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ClientInfo.ClientType.ANDROID_FIREBASE + ", androidClientInfo=" + this.androidClientInfo + "}";
    }
}
