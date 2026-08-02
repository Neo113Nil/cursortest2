package com.squareup.cash.qrcodes.viewmodels;

import android.graphics.Bitmap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class QrCodeModel {
    public final String errorMessage;
    public final boolean loading;
    public final Bitmap qrImage;

    public /* synthetic */ QrCodeModel(String str, int i, boolean z) {
        this((i & 4) != 0 ? null : str, (Bitmap) null, (i & 1) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrCodeModel)) {
            return false;
        }
        QrCodeModel qrCodeModel = (QrCodeModel) obj;
        return this.loading == qrCodeModel.loading && Intrinsics.areEqual(this.qrImage, qrCodeModel.qrImage) && Intrinsics.areEqual(this.errorMessage, qrCodeModel.errorMessage);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.loading) * 31;
        Bitmap bitmap = this.qrImage;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str = this.errorMessage;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrCodeModel(loading=");
        sb.append(this.loading);
        sb.append(", qrImage=");
        sb.append(this.qrImage);
        sb.append(", errorMessage=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ")");
    }

    public QrCodeModel(String str, Bitmap bitmap, boolean z) {
        this.loading = z;
        this.qrImage = bitmap;
        this.errorMessage = str;
    }
}
