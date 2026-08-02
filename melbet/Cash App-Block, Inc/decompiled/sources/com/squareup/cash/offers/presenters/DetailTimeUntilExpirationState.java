package com.squareup.cash.offers.presenters;

import app.cash.paraphrase.FormattedResource;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class DetailTimeUntilExpirationState {
    public final FormattedResource formattedResource;
    public final boolean isExpired;
    public final boolean useServerCaptionTemplate;

    public DetailTimeUntilExpirationState(FormattedResource formattedResource, boolean z, boolean z2) {
        this.formattedResource = formattedResource;
        this.useServerCaptionTemplate = z;
        this.isExpired = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailTimeUntilExpirationState)) {
            return false;
        }
        DetailTimeUntilExpirationState detailTimeUntilExpirationState = (DetailTimeUntilExpirationState) obj;
        return Intrinsics.areEqual(this.formattedResource, detailTimeUntilExpirationState.formattedResource) && this.useServerCaptionTemplate == detailTimeUntilExpirationState.useServerCaptionTemplate && this.isExpired == detailTimeUntilExpirationState.isExpired;
    }

    public final int hashCode() {
        FormattedResource formattedResource = this.formattedResource;
        return Boolean.hashCode(this.isExpired) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((formattedResource == null ? 0 : formattedResource.hashCode()) * 31, 31, this.useServerCaptionTemplate);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailTimeUntilExpirationState(formattedResource=");
        sb.append(this.formattedResource);
        sb.append(", useServerCaptionTemplate=");
        sb.append(this.useServerCaptionTemplate);
        sb.append(", isExpired=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isExpired, ")");
    }
}
