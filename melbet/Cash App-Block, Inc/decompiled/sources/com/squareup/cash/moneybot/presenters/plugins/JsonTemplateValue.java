package com.squareup.cash.moneybot.presenters.plugins;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public interface JsonTemplateValue {

    public final class RawValue implements JsonTemplateValue {
        public final String value;

        public RawValue(String str) {
            this.value = str;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.JsonTemplateValue
        public final String asJsonFragment() {
            return this.value;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.JsonTemplateValue
        public final String asJsonLiteral() {
            return this.value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RawValue) && this.value.equals(((RawValue) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RawValue(value=", this.value, ")");
        }
    }

    public final class StringValue implements JsonTemplateValue {
        public final String value;

        public StringValue(String str) {
            str.getClass();
            this.value = str;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.JsonTemplateValue
        public final String asJsonFragment() {
            String json = TemplateCardPresenterKt.JSON_STRING_ADAPTER.toJson(this.value);
            json.getClass();
            return StringsKt.removeSurrounding(json);
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.JsonTemplateValue
        public final String asJsonLiteral() {
            String json = TemplateCardPresenterKt.JSON_STRING_ADAPTER.toJson(this.value);
            json.getClass();
            return json;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && Intrinsics.areEqual(this.value, ((StringValue) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StringValue(value=", this.value, ")");
        }
    }

    String asJsonFragment();

    String asJsonLiteral();
}
