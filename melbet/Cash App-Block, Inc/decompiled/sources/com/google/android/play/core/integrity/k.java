package com.google.android.play.core.integrity;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class k {
    public final long a;

    public k(long j) {
        this.a = j;
    }

    public static i builder() {
        i iVar = new i();
        iVar.c = (byte) (iVar.c | 2);
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) ((j >>> 32) ^ j)) ^ 1000003) * (-721379959);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.a, ", webViewRequestMode=0, sessionId=null}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
