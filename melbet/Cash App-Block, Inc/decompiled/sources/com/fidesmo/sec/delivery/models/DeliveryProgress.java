package com.fidesmo.sec.delivery.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.fidesmo.sec.core.models.ParametrisedTranslation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006#"}, d2 = {"Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "", "currentStep", "", "totalSteps", "message", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "estimatedDuration", "image", "", "(IILcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/Integer;Ljava/lang/String;)V", "getCurrentStep", "()I", "getEstimatedDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "getMessage", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getTotalSteps", "component1", "component2", "component3", "component4", "component5", "copy", "(IILcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/Integer;Ljava/lang/String;)Lcom/fidesmo/sec/delivery/models/DeliveryProgress;", "equals", "", "other", "hashCode", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryProgress {
    private final int currentStep;
    private final Integer estimatedDuration;
    private String image;
    private final ParametrisedTranslation message;
    private final int totalSteps;

    public /* synthetic */ DeliveryProgress(int i, int i2, ParametrisedTranslation parametrisedTranslation, Integer num, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : parametrisedTranslation, (i3 & 8) != 0 ? 0 : num, (i3 & 16) != 0 ? null : str);
    }

    public static /* synthetic */ DeliveryProgress copy$default(DeliveryProgress deliveryProgress, int i, int i2, ParametrisedTranslation parametrisedTranslation, Integer num, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deliveryProgress.currentStep;
        }
        if ((i3 & 2) != 0) {
            i2 = deliveryProgress.totalSteps;
        }
        if ((i3 & 4) != 0) {
            parametrisedTranslation = deliveryProgress.message;
        }
        if ((i3 & 8) != 0) {
            num = deliveryProgress.estimatedDuration;
        }
        if ((i3 & 16) != 0) {
            str = deliveryProgress.image;
        }
        String str2 = str;
        ParametrisedTranslation parametrisedTranslation2 = parametrisedTranslation;
        return deliveryProgress.copy(i, i2, parametrisedTranslation2, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* renamed from: component3, reason: from getter */
    public final ParametrisedTranslation getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getEstimatedDuration() {
        return this.estimatedDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final DeliveryProgress copy(int currentStep, int totalSteps, ParametrisedTranslation message, Integer estimatedDuration, String image) {
        return new DeliveryProgress(currentStep, totalSteps, message, estimatedDuration, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryProgress)) {
            return false;
        }
        DeliveryProgress deliveryProgress = (DeliveryProgress) other;
        return this.currentStep == deliveryProgress.currentStep && this.totalSteps == deliveryProgress.totalSteps && Intrinsics.areEqual(this.message, deliveryProgress.message) && Intrinsics.areEqual(this.estimatedDuration, deliveryProgress.estimatedDuration) && Intrinsics.areEqual(this.image, deliveryProgress.image);
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final Integer getEstimatedDuration() {
        return this.estimatedDuration;
    }

    public final String getImage() {
        return this.image;
    }

    public final ParametrisedTranslation getMessage() {
        return this.message;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalSteps, Integer.hashCode(this.currentStep) * 31, 31);
        ParametrisedTranslation parametrisedTranslation = this.message;
        int hashCode = (m + (parametrisedTranslation == null ? 0 : parametrisedTranslation.hashCode())) * 31;
        Integer num = this.estimatedDuration;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.image;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeliveryProgress(currentStep=");
        sb.append(this.currentStep);
        sb.append(", totalSteps=");
        sb.append(this.totalSteps);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", estimatedDuration=");
        sb.append(this.estimatedDuration);
        sb.append(", image=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.image, ')');
    }

    public DeliveryProgress(int i, int i2, ParametrisedTranslation parametrisedTranslation, Integer num, String str) {
        this.currentStep = i;
        this.totalSteps = i2;
        this.message = parametrisedTranslation;
        this.estimatedDuration = num;
        this.image = str;
    }

    public DeliveryProgress() {
        this(0, 0, null, null, null, 31, null);
    }
}
