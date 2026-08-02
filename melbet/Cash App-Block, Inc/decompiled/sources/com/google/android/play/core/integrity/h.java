package com.google.android.play.core.integrity;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class h extends IntegrityTokenRequest {
    public final String a;
    public final Long b;

    public h(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntegrityTokenRequest)) {
            return false;
        }
        IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
        if (!this.a.equals(integrityTokenRequest.nonce())) {
            return false;
        }
        Long l = this.b;
        return l == null ? integrityTokenRequest.cloudProjectNumber() == null : l.equals(integrityTokenRequest.cloudProjectNumber());
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        return (l == null ? 0 : l.hashCode()) ^ (hashCode * 1000003);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrityTokenRequest{nonce=");
        sb.append(this.a);
        sb.append(", cloudProjectNumber=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.b, "}");
    }
}
