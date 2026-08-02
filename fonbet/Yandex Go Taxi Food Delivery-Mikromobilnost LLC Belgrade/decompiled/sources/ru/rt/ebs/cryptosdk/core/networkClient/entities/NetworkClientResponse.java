package ru.rt.ebs.cryptosdk.core.networkClient.entities;

import defpackage.jl40;
import defpackage.unr0;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/networkClient/entities/NetworkClientResponse;", "", Constants.INTENT_PARAM_RESPONSE_CODE, "", "headers", "", "", "", "bodyStream", "Ljava/io/InputStream;", "<init>", "(ILjava/util/Map;Ljava/io/InputStream;)V", "getResponseCode", "()I", "getHeaders", "()Ljava/util/Map;", "getBodyStream", "()Ljava/io/InputStream;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NetworkClientResponse {
    private final InputStream bodyStream;
    private final Map<String, List<String>> headers;
    private final int responseCode;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkClientResponse(int i, Map<String, ? extends List<String>> map, InputStream inputStream) {
        this.responseCode = i;
        this.headers = map;
        this.bodyStream = inputStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkClientResponse copy$default(NetworkClientResponse networkClientResponse, int i, Map map, InputStream inputStream, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkClientResponse.responseCode;
        }
        if ((i2 & 2) != 0) {
            map = networkClientResponse.headers;
        }
        if ((i2 & 4) != 0) {
            inputStream = networkClientResponse.bodyStream;
        }
        return networkClientResponse.copy(i, map, inputStream);
    }

    /* renamed from: component1, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    public final Map<String, List<String>> component2() {
        return this.headers;
    }

    /* renamed from: component3, reason: from getter */
    public final InputStream getBodyStream() {
        return this.bodyStream;
    }

    public final NetworkClientResponse copy(int responseCode, Map<String, ? extends List<String>> headers, InputStream bodyStream) {
        return new NetworkClientResponse(responseCode, headers, bodyStream);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkClientResponse)) {
            return false;
        }
        NetworkClientResponse networkClientResponse = (NetworkClientResponse) other;
        return this.responseCode == networkClientResponse.responseCode && jl40.l(this.headers, networkClientResponse.headers) && jl40.l(this.bodyStream, networkClientResponse.bodyStream);
    }

    public final InputStream getBodyStream() {
        return this.bodyStream;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public int hashCode() {
        return this.bodyStream.hashCode() + unr0.d(Integer.hashCode(this.responseCode) * 31, 31, this.headers);
    }

    public String toString() {
        return "NetworkClientResponse(responseCode=" + this.responseCode + ", headers=" + this.headers + ", bodyStream=" + this.bodyStream + Extension.C_BRAKE;
    }
}
