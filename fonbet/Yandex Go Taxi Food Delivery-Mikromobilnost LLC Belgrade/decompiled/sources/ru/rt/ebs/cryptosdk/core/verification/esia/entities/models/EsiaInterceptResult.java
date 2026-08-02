package ru.rt.ebs.cryptosdk.core.verification.esia.entities.models;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.m2a1;
import defpackage.unr0;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.EsiaVerificationEbsException;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00065"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaInterceptResult;", "", "contentType", "", "encoding", "headers", "", "inputStream", "Ljava/io/InputStream;", "redirectUrl", "error", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/EsiaVerificationEbsException;", "esiaCompleteResult", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaCompleteResult;", "esiaErrorResult", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaErrorResult;", "redirectFrom", "redirectTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/io/InputStream;Ljava/lang/String;Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/EsiaVerificationEbsException;Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaCompleteResult;Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaErrorResult;Ljava/lang/String;Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "getEncoding", "getHeaders", "()Ljava/util/Map;", "getInputStream", "()Ljava/io/InputStream;", "getRedirectUrl", "getError", "()Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/EsiaVerificationEbsException;", "getEsiaCompleteResult", "()Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaCompleteResult;", "getEsiaErrorResult", "()Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaErrorResult;", "getRedirectFrom", "getRedirectTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EsiaInterceptResult {
    private final String contentType;
    private final String encoding;
    private final EsiaVerificationEbsException error;
    private final EsiaCompleteResult esiaCompleteResult;
    private final EsiaErrorResult esiaErrorResult;
    private final Map<String, String> headers;
    private final InputStream inputStream;
    private final String redirectFrom;
    private final String redirectTo;
    private final String redirectUrl;

    public /* synthetic */ EsiaInterceptResult(String str, String str2, Map map, InputStream inputStream, String str3, EsiaVerificationEbsException esiaVerificationEbsException, EsiaCompleteResult esiaCompleteResult, EsiaErrorResult esiaErrorResult, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? b.f() : map, (i & 8) != 0 ? null : inputStream, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : esiaVerificationEbsException, (i & 64) != 0 ? null : esiaCompleteResult, (i & 128) != 0 ? null : esiaErrorResult, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5);
    }

    public static /* synthetic */ EsiaInterceptResult copy$default(EsiaInterceptResult esiaInterceptResult, String str, String str2, Map map, InputStream inputStream, String str3, EsiaVerificationEbsException esiaVerificationEbsException, EsiaCompleteResult esiaCompleteResult, EsiaErrorResult esiaErrorResult, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = esiaInterceptResult.contentType;
        }
        if ((i & 2) != 0) {
            str2 = esiaInterceptResult.encoding;
        }
        if ((i & 4) != 0) {
            map = esiaInterceptResult.headers;
        }
        if ((i & 8) != 0) {
            inputStream = esiaInterceptResult.inputStream;
        }
        if ((i & 16) != 0) {
            str3 = esiaInterceptResult.redirectUrl;
        }
        if ((i & 32) != 0) {
            esiaVerificationEbsException = esiaInterceptResult.error;
        }
        if ((i & 64) != 0) {
            esiaCompleteResult = esiaInterceptResult.esiaCompleteResult;
        }
        if ((i & 128) != 0) {
            esiaErrorResult = esiaInterceptResult.esiaErrorResult;
        }
        if ((i & 256) != 0) {
            str4 = esiaInterceptResult.redirectFrom;
        }
        if ((i & 512) != 0) {
            str5 = esiaInterceptResult.redirectTo;
        }
        String str6 = str4;
        String str7 = str5;
        EsiaCompleteResult esiaCompleteResult2 = esiaCompleteResult;
        EsiaErrorResult esiaErrorResult2 = esiaErrorResult;
        String str8 = str3;
        EsiaVerificationEbsException esiaVerificationEbsException2 = esiaVerificationEbsException;
        return esiaInterceptResult.copy(str, str2, map, inputStream, str8, esiaVerificationEbsException2, esiaCompleteResult2, esiaErrorResult2, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRedirectTo() {
        return this.redirectTo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEncoding() {
        return this.encoding;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* renamed from: component4, reason: from getter */
    public final InputStream getInputStream() {
        return this.inputStream;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final EsiaVerificationEbsException getError() {
        return this.error;
    }

    /* renamed from: component7, reason: from getter */
    public final EsiaCompleteResult getEsiaCompleteResult() {
        return this.esiaCompleteResult;
    }

    /* renamed from: component8, reason: from getter */
    public final EsiaErrorResult getEsiaErrorResult() {
        return this.esiaErrorResult;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRedirectFrom() {
        return this.redirectFrom;
    }

    public final EsiaInterceptResult copy(String contentType, String encoding, Map<String, String> headers, InputStream inputStream, String redirectUrl, EsiaVerificationEbsException error, EsiaCompleteResult esiaCompleteResult, EsiaErrorResult esiaErrorResult, String redirectFrom, String redirectTo) {
        return new EsiaInterceptResult(contentType, encoding, headers, inputStream, redirectUrl, error, esiaCompleteResult, esiaErrorResult, redirectFrom, redirectTo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsiaInterceptResult)) {
            return false;
        }
        EsiaInterceptResult esiaInterceptResult = (EsiaInterceptResult) other;
        return jl40.l(this.contentType, esiaInterceptResult.contentType) && jl40.l(this.encoding, esiaInterceptResult.encoding) && jl40.l(this.headers, esiaInterceptResult.headers) && jl40.l(this.inputStream, esiaInterceptResult.inputStream) && jl40.l(this.redirectUrl, esiaInterceptResult.redirectUrl) && jl40.l(this.error, esiaInterceptResult.error) && jl40.l(this.esiaCompleteResult, esiaInterceptResult.esiaCompleteResult) && jl40.l(this.esiaErrorResult, esiaInterceptResult.esiaErrorResult) && jl40.l(this.redirectFrom, esiaInterceptResult.redirectFrom) && jl40.l(this.redirectTo, esiaInterceptResult.redirectTo);
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final EsiaVerificationEbsException getError() {
        return this.error;
    }

    public final EsiaCompleteResult getEsiaCompleteResult() {
        return this.esiaCompleteResult;
    }

    public final EsiaErrorResult getEsiaErrorResult() {
        return this.esiaErrorResult;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final InputStream getInputStream() {
        return this.inputStream;
    }

    public final String getRedirectFrom() {
        return this.redirectFrom;
    }

    public final String getRedirectTo() {
        return this.redirectTo;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        int d = unr0.d(m2a1.a(this.encoding, this.contentType.hashCode() * 31), 31, this.headers);
        InputStream inputStream = this.inputStream;
        int a = m2a1.a(this.redirectUrl, (d + (inputStream == null ? 0 : inputStream.hashCode())) * 31);
        EsiaVerificationEbsException esiaVerificationEbsException = this.error;
        int hashCode = (a + (esiaVerificationEbsException == null ? 0 : esiaVerificationEbsException.hashCode())) * 31;
        EsiaCompleteResult esiaCompleteResult = this.esiaCompleteResult;
        int hashCode2 = (hashCode + (esiaCompleteResult == null ? 0 : esiaCompleteResult.hashCode())) * 31;
        EsiaErrorResult esiaErrorResult = this.esiaErrorResult;
        int hashCode3 = (hashCode2 + (esiaErrorResult == null ? 0 : esiaErrorResult.hashCode())) * 31;
        String str = this.redirectFrom;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redirectTo;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.contentType;
        String str2 = this.encoding;
        Map<String, String> map = this.headers;
        InputStream inputStream = this.inputStream;
        String str3 = this.redirectUrl;
        EsiaVerificationEbsException esiaVerificationEbsException = this.error;
        EsiaCompleteResult esiaCompleteResult = this.esiaCompleteResult;
        EsiaErrorResult esiaErrorResult = this.esiaErrorResult;
        String str4 = this.redirectFrom;
        String str5 = this.redirectTo;
        StringBuilder v = b64.v("EsiaInterceptResult(contentType=", str, ", encoding=", str2, ", headers=");
        v.append(map);
        v.append(", inputStream=");
        v.append(inputStream);
        v.append(", redirectUrl=");
        v.append(str3);
        v.append(", error=");
        v.append(esiaVerificationEbsException);
        v.append(", esiaCompleteResult=");
        v.append(esiaCompleteResult);
        v.append(", esiaErrorResult=");
        v.append(esiaErrorResult);
        v.append(", redirectFrom=");
        return g8e.r(v, str4, ", redirectTo=", str5, Extension.C_BRAKE);
    }

    public EsiaInterceptResult(String str, String str2, Map<String, String> map, InputStream inputStream, String str3, EsiaVerificationEbsException esiaVerificationEbsException, EsiaCompleteResult esiaCompleteResult, EsiaErrorResult esiaErrorResult, String str4, String str5) {
        this.contentType = str;
        this.encoding = str2;
        this.headers = map;
        this.inputStream = inputStream;
        this.redirectUrl = str3;
        this.error = esiaVerificationEbsException;
        this.esiaCompleteResult = esiaCompleteResult;
        this.esiaErrorResult = esiaErrorResult;
        this.redirectFrom = str4;
        this.redirectTo = str5;
    }

    public EsiaInterceptResult() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
