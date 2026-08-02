package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Brief {
    public final String markdownText;
    public final String requestId;
    public final String title;

    public Brief(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.requestId = str;
        this.title = str2;
        this.markdownText = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Brief)) {
            return false;
        }
        Brief brief = (Brief) obj;
        return Intrinsics.areEqual(this.requestId, brief.requestId) && Intrinsics.areEqual(this.title, brief.title) && Intrinsics.areEqual(this.markdownText, brief.markdownText);
    }

    public final int hashCode() {
        String str = this.requestId;
        return this.markdownText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.title);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Brief(requestId=", this.requestId, ", version=0, title=", this.title, ", markdownText="), this.markdownText, ")");
    }
}
