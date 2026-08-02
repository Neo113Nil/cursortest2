package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ExpressivePaymentDetailsModel {
    public final boolean isSender;
    public final String note;
    public final HeaderAvatar recipient;

    public ExpressivePaymentDetailsModel(HeaderAvatar headerAvatar, boolean z, String str) {
        str.getClass();
        this.recipient = headerAvatar;
        this.isSender = z;
        this.note = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpressivePaymentDetailsModel)) {
            return false;
        }
        ExpressivePaymentDetailsModel expressivePaymentDetailsModel = (ExpressivePaymentDetailsModel) obj;
        return Intrinsics.areEqual(this.recipient, expressivePaymentDetailsModel.recipient) && this.isSender == expressivePaymentDetailsModel.isSender && Intrinsics.areEqual(this.note, expressivePaymentDetailsModel.note);
    }

    public final int hashCode() {
        HeaderAvatar headerAvatar = this.recipient;
        return this.note.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((headerAvatar == null ? 0 : headerAvatar.hashCode()) * 31, 31, this.isSender);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpressivePaymentDetailsModel(recipient=");
        sb.append(this.recipient);
        sb.append(", isSender=");
        sb.append(this.isSender);
        sb.append(", note=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.note, ")");
    }
}
