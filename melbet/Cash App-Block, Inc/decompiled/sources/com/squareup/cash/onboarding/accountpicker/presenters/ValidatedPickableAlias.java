package com.squareup.cash.onboarding.accountpicker.presenters;

import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasViewModel;
import com.squareup.protos.franklin.api.UiAlias;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class ValidatedPickableAlias {
    public final String canonicalText;
    public final String formatted;
    public final UiAlias proto;

    /* renamed from: type, reason: collision with root package name */
    public final AliasViewModel.AliasType f1175type;

    public ValidatedPickableAlias(String str, String str2, AliasViewModel.AliasType aliasType, UiAlias uiAlias) {
        this.formatted = str;
        this.canonicalText = str2;
        this.f1175type = aliasType;
        this.proto = uiAlias;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidatedPickableAlias)) {
            return false;
        }
        ValidatedPickableAlias validatedPickableAlias = (ValidatedPickableAlias) obj;
        return this.formatted.equals(validatedPickableAlias.formatted) && this.canonicalText.equals(validatedPickableAlias.canonicalText) && this.f1175type == validatedPickableAlias.f1175type && this.proto.equals(validatedPickableAlias.proto);
    }

    public final int hashCode() {
        return this.proto.hashCode() + ((this.f1175type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.formatted.hashCode() * 31, 31, this.canonicalText)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ValidatedPickableAlias(formatted=", this.formatted, ", canonicalText=", this.canonicalText, ", type=");
        m.append(this.f1175type);
        m.append(", proto=");
        m.append(this.proto);
        m.append(")");
        return m.toString();
    }
}
