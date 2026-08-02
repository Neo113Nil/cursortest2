package com.squareup.cash.onboarding.accountpicker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class AliasViewModel {
    public final String aliasId;
    public final String text;

    /* renamed from: type, reason: collision with root package name */
    public final AliasType f1176type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class AliasType {
        public static final /* synthetic */ AliasType[] $VALUES;
        public static final AliasType EMAIL;
        public static final AliasType TEXT;

        static {
            AliasType aliasType = new AliasType("EMAIL", 0);
            EMAIL = aliasType;
            AliasType aliasType2 = new AliasType("TEXT", 1);
            TEXT = aliasType2;
            $VALUES = new AliasType[]{aliasType, aliasType2};
        }

        public static AliasType valueOf(String str) {
            return (AliasType) Enum.valueOf(AliasType.class, str);
        }

        public static AliasType[] values() {
            return (AliasType[]) $VALUES.clone();
        }
    }

    public AliasViewModel(String str, AliasType aliasType, String str2) {
        this.text = str;
        this.f1176type = aliasType;
        this.aliasId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasViewModel)) {
            return false;
        }
        AliasViewModel aliasViewModel = (AliasViewModel) obj;
        return this.text.equals(aliasViewModel.text) && this.f1176type == aliasViewModel.f1176type && this.aliasId.equals(aliasViewModel.aliasId);
    }

    public final int hashCode() {
        return this.aliasId.hashCode() + ((this.f1176type.hashCode() + (this.text.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AliasViewModel(text=");
        sb.append(this.text);
        sb.append(", type=");
        sb.append(this.f1176type);
        sb.append(", aliasId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.aliasId, ")");
    }
}
