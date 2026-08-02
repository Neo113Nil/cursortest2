package com.squareup.cash.earnings.viewmodels.payers;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PayerTaggingPromptViewModel {
    public final Color accentColor;
    public final String confirmLabel;
    public final String imageUrl;
    public final String message;
    public final String monogram;
    public final String notNowLabel;
    public final String title;

    public PayerTaggingPromptViewModel(String str, Color color, String str2, String str3, String str4, String str5, String str6) {
        re$$ExternalSyntheticOutline0.m1432m(str4, str5, str6);
        this.monogram = str;
        this.accentColor = color;
        this.imageUrl = str2;
        this.title = str3;
        this.message = str4;
        this.notNowLabel = str5;
        this.confirmLabel = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayerTaggingPromptViewModel)) {
            return false;
        }
        PayerTaggingPromptViewModel payerTaggingPromptViewModel = (PayerTaggingPromptViewModel) obj;
        return Intrinsics.areEqual(this.monogram, payerTaggingPromptViewModel.monogram) && Intrinsics.areEqual(this.accentColor, payerTaggingPromptViewModel.accentColor) && Intrinsics.areEqual(this.imageUrl, payerTaggingPromptViewModel.imageUrl) && this.title.equals(payerTaggingPromptViewModel.title) && Intrinsics.areEqual(this.message, payerTaggingPromptViewModel.message) && Intrinsics.areEqual(this.notNowLabel, payerTaggingPromptViewModel.notNowLabel) && Intrinsics.areEqual(this.confirmLabel, payerTaggingPromptViewModel.confirmLabel);
    }

    public final int hashCode() {
        String str = this.monogram;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Color color = this.accentColor;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        String str2 = this.imageUrl;
        return this.confirmLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.title), 31, this.message), 31, this.notNowLabel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayerTaggingPromptViewModel(monogram=");
        sb.append(this.monogram);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", imageUrl=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.imageUrl, ", title=", this.title, ", message=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.message, ", notNowLabel=", this.notNowLabel, ", confirmLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.confirmLabel, ")");
    }
}
