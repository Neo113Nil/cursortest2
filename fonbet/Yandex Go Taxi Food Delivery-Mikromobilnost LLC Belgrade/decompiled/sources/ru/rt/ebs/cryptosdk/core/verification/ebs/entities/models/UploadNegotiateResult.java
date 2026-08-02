package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/UploadNegotiateResult;", "", "ebsRedirectUrl", "", "ebsToken", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/EbsToken;", "<init>", "(Ljava/lang/String;Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/EbsToken;)V", "getEbsRedirectUrl", "()Ljava/lang/String;", "getEbsToken", "()Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/EbsToken;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UploadNegotiateResult {
    private final String ebsRedirectUrl;
    private final EbsToken ebsToken;

    public UploadNegotiateResult(String str, EbsToken ebsToken) {
        this.ebsRedirectUrl = str;
        this.ebsToken = ebsToken;
    }

    public static /* synthetic */ UploadNegotiateResult copy$default(UploadNegotiateResult uploadNegotiateResult, String str, EbsToken ebsToken, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadNegotiateResult.ebsRedirectUrl;
        }
        if ((i & 2) != 0) {
            ebsToken = uploadNegotiateResult.ebsToken;
        }
        return uploadNegotiateResult.copy(str, ebsToken);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEbsRedirectUrl() {
        return this.ebsRedirectUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final EbsToken getEbsToken() {
        return this.ebsToken;
    }

    public final UploadNegotiateResult copy(String ebsRedirectUrl, EbsToken ebsToken) {
        return new UploadNegotiateResult(ebsRedirectUrl, ebsToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadNegotiateResult)) {
            return false;
        }
        UploadNegotiateResult uploadNegotiateResult = (UploadNegotiateResult) other;
        return jl40.l(this.ebsRedirectUrl, uploadNegotiateResult.ebsRedirectUrl) && jl40.l(this.ebsToken, uploadNegotiateResult.ebsToken);
    }

    public final String getEbsRedirectUrl() {
        return this.ebsRedirectUrl;
    }

    public final EbsToken getEbsToken() {
        return this.ebsToken;
    }

    public int hashCode() {
        return this.ebsToken.hashCode() + (this.ebsRedirectUrl.hashCode() * 31);
    }

    public String toString() {
        return "UploadNegotiateResult(ebsRedirectUrl=" + this.ebsRedirectUrl + ", ebsToken=" + this.ebsToken + Extension.C_BRAKE;
    }
}
