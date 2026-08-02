package ru.rt.ebs.cryptosdk.core.verification.consumer.entities.models;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/consumer/entities/models/ResVrfResponse;", "", "", "cookieVrf", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final /* data */ class ResVrfResponse {

    /* renamed from: a, reason: from kotlin metadata */
    @ysq0("cookievrf")
    private final String cookieVrf;

    public ResVrfResponse(String str) {
        this.cookieVrf = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getCookieVrf() {
        return this.cookieVrf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResVrfResponse) && jl40.l(this.cookieVrf, ((ResVrfResponse) obj).cookieVrf);
    }

    public final int hashCode() {
        return this.cookieVrf.hashCode();
    }

    public final String toString() {
        return oyr.p("ResVrfResponse(cookieVrf=", this.cookieVrf, Extension.C_BRAKE);
    }
}
