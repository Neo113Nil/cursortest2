package com.google.android.play.core.integrity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes.dex */
public final class f extends IntegrityTokenRequest.Builder {
    public String a;
    public Long b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.a;
        if (str != null) {
            return new h(str, this.b);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties: nonce");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Null nonce");
        return null;
    }
}
