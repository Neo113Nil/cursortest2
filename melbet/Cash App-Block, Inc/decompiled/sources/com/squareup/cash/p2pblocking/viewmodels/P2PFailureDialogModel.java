package com.squareup.cash.p2pblocking.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PFailureDialogModel {
    public final String dismissButtonText;
    public final String message;
    public final String title;

    public P2PFailureDialogModel(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.dismissButtonText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PFailureDialogModel)) {
            return false;
        }
        P2PFailureDialogModel p2PFailureDialogModel = (P2PFailureDialogModel) obj;
        return Intrinsics.areEqual(this.title, p2PFailureDialogModel.title) && Intrinsics.areEqual(this.message, p2PFailureDialogModel.message) && Intrinsics.areEqual(this.dismissButtonText, p2PFailureDialogModel.dismissButtonText);
    }

    public final int hashCode() {
        return this.dismissButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("P2PFailureDialogModel(title=", this.title, ", message=", this.message, ", dismissButtonText="), this.dismissButtonText, ")");
    }
}
