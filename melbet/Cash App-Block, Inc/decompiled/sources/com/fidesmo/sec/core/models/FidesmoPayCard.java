package com.fidesmo.sec.core.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/fidesmo/sec/core/models/FidesmoPayCard;", "", "pan", "", "(Ljava/lang/String;)V", "getPan", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FidesmoPayCard {
    private final String pan;

    public /* synthetic */ FidesmoPayCard(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ FidesmoPayCard copy$default(FidesmoPayCard fidesmoPayCard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fidesmoPayCard.pan;
        }
        return fidesmoPayCard.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    public final FidesmoPayCard copy(String pan) {
        return new FidesmoPayCard(pan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FidesmoPayCard) && Intrinsics.areEqual(this.pan, ((FidesmoPayCard) other).pan);
    }

    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        String str = this.pan;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("FidesmoPayCard(pan="), this.pan, ')');
    }

    public FidesmoPayCard(String str) {
        this.pan = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FidesmoPayCard() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
