package ru.rt.ebs.cryptosdk.core.verification.esia.entities.models;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaCompleteResult;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", ClidProvider.STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getState", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EsiaCompleteResult {
    private final String code;
    private final String state;

    public EsiaCompleteResult(String str, String str2) {
        this.code = str;
        this.state = str2;
    }

    public static /* synthetic */ EsiaCompleteResult copy$default(EsiaCompleteResult esiaCompleteResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = esiaCompleteResult.code;
        }
        if ((i & 2) != 0) {
            str2 = esiaCompleteResult.state;
        }
        return esiaCompleteResult.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final EsiaCompleteResult copy(String code, String state) {
        return new EsiaCompleteResult(code, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsiaCompleteResult)) {
            return false;
        }
        EsiaCompleteResult esiaCompleteResult = (EsiaCompleteResult) other;
        return jl40.l(this.code, esiaCompleteResult.code) && jl40.l(this.state, esiaCompleteResult.state);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode() + (this.code.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("EsiaCompleteResult(code=", this.code, ", state=", this.state, Extension.C_BRAKE);
    }
}
