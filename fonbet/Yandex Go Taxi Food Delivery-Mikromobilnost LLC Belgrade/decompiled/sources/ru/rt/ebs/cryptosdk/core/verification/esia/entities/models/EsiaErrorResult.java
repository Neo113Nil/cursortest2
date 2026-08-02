package ru.rt.ebs.cryptosdk.core.verification.esia.entities.models;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaErrorResult;", "", "error", "", "errorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getErrorDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EsiaErrorResult {
    private final String error;
    private final String errorDescription;

    public EsiaErrorResult(String str, String str2) {
        this.error = str;
        this.errorDescription = str2;
    }

    public static /* synthetic */ EsiaErrorResult copy$default(EsiaErrorResult esiaErrorResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = esiaErrorResult.error;
        }
        if ((i & 2) != 0) {
            str2 = esiaErrorResult.errorDescription;
        }
        return esiaErrorResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final EsiaErrorResult copy(String error, String errorDescription) {
        return new EsiaErrorResult(error, errorDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsiaErrorResult)) {
            return false;
        }
        EsiaErrorResult esiaErrorResult = (EsiaErrorResult) other;
        return jl40.l(this.error, esiaErrorResult.error) && jl40.l(this.errorDescription, esiaErrorResult.errorDescription);
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public int hashCode() {
        return this.errorDescription.hashCode() + (this.error.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("EsiaErrorResult(error=", this.error, ", errorDescription=", this.errorDescription, Extension.C_BRAKE);
    }
}
