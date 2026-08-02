package com.squareup.cash.marketing.components;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/marketing/components/InvalidCardUpsellIllustrationError;", "Lcom/squareup/cash/observability/types/ReportedError;", "components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InvalidCardUpsellIllustrationError extends ReportedError {
    public final Set features;
    public final String illustrationName;
    public final String message;

    public InvalidCardUpsellIllustrationError(String str) {
        str.getClass();
        this.illustrationName = str;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.DesignSystems.INSTANCE);
        this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid illustration: ", str, ". Valid illustrations start with MessagingCards");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvalidCardUpsellIllustrationError) && Intrinsics.areEqual(this.illustrationName, ((InvalidCardUpsellIllustrationError) obj).illustrationName);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.illustrationName.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvalidCardUpsellIllustrationError(illustrationName=", this.illustrationName, ")");
    }
}
