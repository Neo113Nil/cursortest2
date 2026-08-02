package com.squareup.cash.activity.viewmodels;

import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;

/* loaded from: classes5.dex */
public final class UpdateSearchQuery implements ActivityTabViewEvent {
    public final TextFieldStateInputFieldText newQuery;

    public UpdateSearchQuery(TextFieldStateInputFieldText textFieldStateInputFieldText) {
        this.newQuery = textFieldStateInputFieldText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateSearchQuery) && this.newQuery.equals(((UpdateSearchQuery) obj).newQuery);
    }

    public final int hashCode() {
        return this.newQuery.textFieldState.hashCode();
    }

    public final String toString() {
        return "UpdateSearchQuery(newQuery=" + this.newQuery + ")";
    }
}
