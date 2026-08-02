package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SlottedCard {
    public final String animationKey;
    public final String label;
    public final String requestId;
    public final SlotContent slotContent;
    public final String subtext;
    public final String text;

    public SlottedCard(String str, String str2, String str3, SlotContent slotContent, String str4, String str5) {
        this.requestId = str;
        this.label = str2;
        this.text = str3;
        this.slotContent = slotContent;
        this.subtext = str4;
        this.animationKey = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlottedCard)) {
            return false;
        }
        SlottedCard slottedCard = (SlottedCard) obj;
        return Intrinsics.areEqual(this.requestId, slottedCard.requestId) && this.label.equals(slottedCard.label) && this.text.equals(slottedCard.text) && Intrinsics.areEqual(this.slotContent, slottedCard.slotContent) && this.subtext.equals(slottedCard.subtext) && Intrinsics.areEqual(this.animationKey, slottedCard.animationKey);
    }

    public final int hashCode() {
        String str = this.requestId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.label), 31, this.text);
        SlotContent slotContent = this.slotContent;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (slotContent == null ? 0 : slotContent.hashCode())) * 31, 31, this.subtext);
        String str2 = this.animationKey;
        return m2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SlottedCard(requestId=", this.requestId, ", version=0, label=", this.label, ", text=");
        m.append(this.text);
        m.append(", slotContent=");
        m.append(this.slotContent);
        m.append(", subtext=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.subtext, ", animationKey=", this.animationKey, ")");
    }
}
