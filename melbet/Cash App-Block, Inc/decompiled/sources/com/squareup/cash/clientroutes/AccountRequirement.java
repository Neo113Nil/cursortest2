package com.squareup.cash.clientroutes;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AccountRequirement {
    public final String accountIdentifierParameterName;
    public final Value value;
    public final String valueParameterName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Value {
        public static final /* synthetic */ Value[] $VALUES;
        public static final Value NONE;
        public static final Value PROMPT_IF_NEEDED;
        public static final Value REQUIRED;

        static {
            Value value = new Value("NONE", 0);
            NONE = value;
            Value value2 = new Value("PROMPT_IF_NEEDED", 1);
            PROMPT_IF_NEEDED = value2;
            Value value3 = new Value("REQUIRED", 2);
            REQUIRED = value3;
            $VALUES = new Value[]{value, value2, value3};
        }

        public static Value valueOf(String str) {
            return (Value) Enum.valueOf(Value.class, str);
        }

        public static Value[] values() {
            return (Value[]) $VALUES.clone();
        }
    }

    public AccountRequirement(Value value, String str, String str2) {
        value.getClass();
        str.getClass();
        str2.getClass();
        this.value = value;
        this.valueParameterName = str;
        this.accountIdentifierParameterName = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountRequirement)) {
            return false;
        }
        AccountRequirement accountRequirement = (AccountRequirement) obj;
        return this.value == accountRequirement.value && Intrinsics.areEqual(this.valueParameterName, accountRequirement.valueParameterName) && Intrinsics.areEqual(this.accountIdentifierParameterName, accountRequirement.accountIdentifierParameterName);
    }

    public final String getAccountIdentifierParameterName() {
        return this.accountIdentifierParameterName;
    }

    public final Value getValue() {
        return this.value;
    }

    public final String getValueParameterName() {
        return this.valueParameterName;
    }

    public final int hashCode() {
        return this.accountIdentifierParameterName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value.hashCode() * 31, 31, this.valueParameterName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountRequirement(value=");
        sb.append(this.value);
        sb.append(", valueParameterName=");
        sb.append(this.valueParameterName);
        sb.append(", accountIdentifierParameterName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accountIdentifierParameterName, ")");
    }
}
