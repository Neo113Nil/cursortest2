package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TextCard {
    public final Icon icon;
    public final String label;
    public final String requestId;
    public final String text;

    public TextCard(Icon icon, String str, String str2, String str3) {
        str3.getClass();
        this.requestId = str;
        this.icon = icon;
        this.label = str2;
        this.text = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextCard)) {
            return false;
        }
        TextCard textCard = (TextCard) obj;
        return Intrinsics.areEqual(this.requestId, textCard.requestId) && Intrinsics.areEqual(this.icon, textCard.icon) && Intrinsics.areEqual(this.label, textCard.label) && Intrinsics.areEqual(this.text, textCard.text);
    }

    public final int hashCode() {
        String str = this.requestId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, (str == null ? 0 : str.hashCode()) * 31, 31);
        Icon icon = this.icon;
        int hashCode = (m + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.label;
        return this.text.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextCard(requestId=");
        sb.append(this.requestId);
        sb.append(", version=0, icon=");
        sb.append(this.icon);
        sb.append(", label=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.label, ", text=", this.text, ")");
    }
}
