package com.braze.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.o;
import bo.app.p;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b'\u0010!\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/braze/models/BannerPendingDismissal;", "", "", "seen0", "", "bannerId", "stableKey", "", "dismissalTimeMs", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/BannerPendingDismissal;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBannerId", "getBannerId$annotations", "()V", "getStableKey", "getStableKey$annotations", "J", "getDismissalTimeMs", "()J", "getDismissalTimeMs$annotations", "Companion", "bo/app/o", "bo/app/p", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class BannerPendingDismissal {
    public static final p Companion = new p();
    private final String bannerId;
    private final long dismissalTimeMs;
    private final String stableKey;

    public /* synthetic */ BannerPendingDismissal(int i, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            TuplesKt.throwMissingFieldException(i, 5, o.a.getDescriptor());
            throw null;
        }
        this.bannerId = str;
        if ((i & 2) == 0) {
            this.stableKey = null;
        } else {
            this.stableKey = str2;
        }
        this.dismissalTimeMs = j;
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(BannerPendingDismissal self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.bannerId);
        if (output.shouldEncodeElementDefault(serialDesc) || self.stableKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.stableKey);
        }
        output.encodeLongElement(serialDesc, 2, self.dismissalTimeMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerPendingDismissal)) {
            return false;
        }
        BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) other;
        return Intrinsics.areEqual(this.bannerId, bannerPendingDismissal.bannerId) && Intrinsics.areEqual(this.stableKey, bannerPendingDismissal.stableKey) && this.dismissalTimeMs == bannerPendingDismissal.dismissalTimeMs;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final long getDismissalTimeMs() {
        return this.dismissalTimeMs;
    }

    public final String getStableKey() {
        return this.stableKey;
    }

    public int hashCode() {
        int hashCode = this.bannerId.hashCode() * 31;
        String str = this.stableKey;
        return Long.hashCode(this.dismissalTimeMs) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.dismissalTimeMs, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BannerPendingDismissal(bannerId=", this.bannerId, ", stableKey=", this.stableKey, ", dismissalTimeMs="));
    }
}
