package com.gamericefishpro.space.qa;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends IntegrityTokenRequest {
    public final String a;
    public final Long b;

    public i(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj != this) {
            if (obj instanceof IntegrityTokenRequest) {
                IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
                if (!this.a.equals(integrityTokenRequest.b()) || ((l = this.b) != null ? !l.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() != null)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (!(obj instanceof i)) {
                return z;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        return ((iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b).concat(", network=null").concat("}");
    }
}
