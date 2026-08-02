package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/EbsToken;", "", "verificationToken", "", "tokenExpires", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVerificationToken", "()Ljava/lang/String;", "getTokenExpires", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EbsToken {
    private final String tokenExpires;
    private final String verificationToken;

    public /* synthetic */ EbsToken(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ EbsToken copy$default(EbsToken ebsToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ebsToken.verificationToken;
        }
        if ((i & 2) != 0) {
            str2 = ebsToken.tokenExpires;
        }
        return ebsToken.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVerificationToken() {
        return this.verificationToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenExpires() {
        return this.tokenExpires;
    }

    public final EbsToken copy(String verificationToken, String tokenExpires) {
        return new EbsToken(verificationToken, tokenExpires);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbsToken)) {
            return false;
        }
        EbsToken ebsToken = (EbsToken) other;
        return jl40.l(this.verificationToken, ebsToken.verificationToken) && jl40.l(this.tokenExpires, ebsToken.tokenExpires);
    }

    public final String getTokenExpires() {
        return this.tokenExpires;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public int hashCode() {
        return this.tokenExpires.hashCode() + (this.verificationToken.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("EbsToken(verificationToken=", this.verificationToken, ", tokenExpires=", this.tokenExpires, Extension.C_BRAKE);
    }

    public EbsToken(String str, String str2) {
        this.verificationToken = str;
        this.tokenExpires = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EbsToken() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
