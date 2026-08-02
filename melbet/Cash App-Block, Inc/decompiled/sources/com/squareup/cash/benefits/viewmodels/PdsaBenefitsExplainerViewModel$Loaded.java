package com.squareup.cash.benefits.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PdsaBenefitsExplainerViewModel$Loaded {
    public final String body;
    public final String primaryButtonText;
    public final String title;

    public PdsaBenefitsExplainerViewModel$Loaded(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.body = str2;
        this.primaryButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdsaBenefitsExplainerViewModel$Loaded)) {
            return false;
        }
        PdsaBenefitsExplainerViewModel$Loaded pdsaBenefitsExplainerViewModel$Loaded = (PdsaBenefitsExplainerViewModel$Loaded) obj;
        return Intrinsics.areEqual(this.title, pdsaBenefitsExplainerViewModel$Loaded.title) && Intrinsics.areEqual(this.body, pdsaBenefitsExplainerViewModel$Loaded.body) && Intrinsics.areEqual(this.primaryButtonText, pdsaBenefitsExplainerViewModel$Loaded.primaryButtonText);
    }

    public final int hashCode() {
        return this.primaryButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", body=", this.body, ", primaryButtonText="), this.primaryButtonText, ")");
    }
}
