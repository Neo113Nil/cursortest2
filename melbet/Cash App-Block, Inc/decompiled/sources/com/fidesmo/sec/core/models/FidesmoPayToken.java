package com.fidesmo.sec.core.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/fidesmo/sec/core/models/FidesmoPayToken;", "", "pan", "", "expiry", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExpiry", "()Ljava/lang/String;", "getPan", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FidesmoPayToken {
    private final String expiry;
    private final String pan;
    private final String status;

    public /* synthetic */ FidesmoPayToken(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ FidesmoPayToken copy$default(FidesmoPayToken fidesmoPayToken, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fidesmoPayToken.pan;
        }
        if ((i & 2) != 0) {
            str2 = fidesmoPayToken.expiry;
        }
        if ((i & 4) != 0) {
            str3 = fidesmoPayToken.status;
        }
        return fidesmoPayToken.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpiry() {
        return this.expiry;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final FidesmoPayToken copy(String pan, String expiry, String status) {
        return new FidesmoPayToken(pan, expiry, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FidesmoPayToken)) {
            return false;
        }
        FidesmoPayToken fidesmoPayToken = (FidesmoPayToken) other;
        return Intrinsics.areEqual(this.pan, fidesmoPayToken.pan) && Intrinsics.areEqual(this.expiry, fidesmoPayToken.expiry) && Intrinsics.areEqual(this.status, fidesmoPayToken.status);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final String getPan() {
        return this.pan;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.pan;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expiry;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FidesmoPayToken(pan=");
        sb.append(this.pan);
        sb.append(", expiry=");
        sb.append(this.expiry);
        sb.append(", status=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.status, ')');
    }

    public FidesmoPayToken(String str, String str2, String str3) {
        this.pan = str;
        this.expiry = str2;
        this.status = str3;
    }

    public FidesmoPayToken() {
        this(null, null, null, 7, null);
    }
}
