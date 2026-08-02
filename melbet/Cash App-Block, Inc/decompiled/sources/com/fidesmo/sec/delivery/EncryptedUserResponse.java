package com.fidesmo.sec.delivery;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/fidesmo/sec/delivery/EncryptedUserResponse;", "", "response", "", "", "key", "", "(Ljava/util/Map;[B)V", "getKey", "()[B", "getResponse", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EncryptedUserResponse {
    private final byte[] key;
    private final Map<String, String> response;

    public EncryptedUserResponse(Map<String, String> map, byte[] bArr) {
        bArr.getClass();
        this.response = map;
        this.key = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EncryptedUserResponse copy$default(EncryptedUserResponse encryptedUserResponse, Map map, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            map = encryptedUserResponse.response;
        }
        if ((i & 2) != 0) {
            bArr = encryptedUserResponse.key;
        }
        return encryptedUserResponse.copy(map, bArr);
    }

    public final Map<String, String> component1() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getKey() {
        return this.key;
    }

    public final EncryptedUserResponse copy(Map<String, String> response, byte[] key) {
        key.getClass();
        return new EncryptedUserResponse(response, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedUserResponse)) {
            return false;
        }
        EncryptedUserResponse encryptedUserResponse = (EncryptedUserResponse) other;
        return Intrinsics.areEqual(this.response, encryptedUserResponse.response) && Intrinsics.areEqual(this.key, encryptedUserResponse.key);
    }

    public final byte[] getKey() {
        return this.key;
    }

    public final Map<String, String> getResponse() {
        return this.response;
    }

    public int hashCode() {
        Map<String, String> map = this.response;
        return Arrays.hashCode(this.key) + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public String toString() {
        return "EncryptedUserResponse(response=" + this.response + ", key=" + Arrays.toString(this.key) + ')';
    }

    public /* synthetic */ EncryptedUserResponse(Map map, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, bArr);
    }
}
