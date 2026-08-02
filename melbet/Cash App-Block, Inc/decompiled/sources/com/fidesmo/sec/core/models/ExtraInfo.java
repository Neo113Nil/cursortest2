package com.fidesmo.sec.core.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/fidesmo/sec/core/models/ExtraInfo;", "", "fidesmoPay", "Lcom/fidesmo/sec/core/models/FidesmoPayExtraInfo;", "(Lcom/fidesmo/sec/core/models/FidesmoPayExtraInfo;)V", "getFidesmoPay", "()Lcom/fidesmo/sec/core/models/FidesmoPayExtraInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExtraInfo {

    @SerializedName("fidesmo-pay")
    private final FidesmoPayExtraInfo fidesmoPay;

    public /* synthetic */ ExtraInfo(FidesmoPayExtraInfo fidesmoPayExtraInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fidesmoPayExtraInfo);
    }

    public static /* synthetic */ ExtraInfo copy$default(ExtraInfo extraInfo, FidesmoPayExtraInfo fidesmoPayExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            fidesmoPayExtraInfo = extraInfo.fidesmoPay;
        }
        return extraInfo.copy(fidesmoPayExtraInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final FidesmoPayExtraInfo getFidesmoPay() {
        return this.fidesmoPay;
    }

    public final ExtraInfo copy(FidesmoPayExtraInfo fidesmoPay) {
        return new ExtraInfo(fidesmoPay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExtraInfo) && Intrinsics.areEqual(this.fidesmoPay, ((ExtraInfo) other).fidesmoPay);
    }

    public final FidesmoPayExtraInfo getFidesmoPay() {
        return this.fidesmoPay;
    }

    public int hashCode() {
        FidesmoPayExtraInfo fidesmoPayExtraInfo = this.fidesmoPay;
        if (fidesmoPayExtraInfo == null) {
            return 0;
        }
        return fidesmoPayExtraInfo.hashCode();
    }

    public String toString() {
        return "ExtraInfo(fidesmoPay=" + this.fidesmoPay + ')';
    }

    public ExtraInfo(FidesmoPayExtraInfo fidesmoPayExtraInfo) {
        this.fidesmoPay = fidesmoPayExtraInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtraInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
