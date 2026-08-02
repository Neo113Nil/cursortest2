package com.google.android.play.core.integrity;

/* loaded from: classes4.dex */
public final class av extends IntegrityTokenResponse {
    public final String a;

    public av(String str) {
        this.a = str;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.a;
    }
}
