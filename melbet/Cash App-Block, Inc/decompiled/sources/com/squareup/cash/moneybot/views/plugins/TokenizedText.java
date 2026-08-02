package com.squareup.cash.moneybot.views.plugins;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class TokenizedText {
    public final LinkedHashMap inlineContent;
    public final AnnotatedString text;
    public final ArrayList tokens;

    public TokenizedText(AnnotatedString annotatedString, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.text = annotatedString;
        this.tokens = arrayList;
        this.inlineContent = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenizedText)) {
            return false;
        }
        TokenizedText tokenizedText = (TokenizedText) obj;
        return this.text.equals(tokenizedText.text) && this.tokens.equals(tokenizedText.tokens) && this.inlineContent.equals(tokenizedText.inlineContent);
    }

    public final int hashCode() {
        return this.inlineContent.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.tokens, this.text.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TokenizedText(text=" + ((Object) this.text) + ", tokens=" + this.tokens + ", inlineContent=" + this.inlineContent + ")";
    }
}
