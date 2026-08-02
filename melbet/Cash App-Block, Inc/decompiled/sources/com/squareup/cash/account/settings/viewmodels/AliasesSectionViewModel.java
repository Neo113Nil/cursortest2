package com.squareup.cash.account.settings.viewmodels;

import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class AliasesSectionViewModel {
    public final LinkedHashMap aliases;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class AliasState {
        public static final /* synthetic */ AliasState[] $VALUES;
        public static final AliasState DISPLAYED;
        public static final AliasState HIDDEN;
        public static final AliasState REMOVED;

        static {
            AliasState aliasState = new AliasState("DISPLAYED", 0);
            DISPLAYED = aliasState;
            AliasState aliasState2 = new AliasState("HIDDEN", 1);
            HIDDEN = aliasState2;
            AliasState aliasState3 = new AliasState("REMOVED", 2);
            REMOVED = aliasState3;
            $VALUES = new AliasState[]{aliasState, aliasState2, aliasState3};
        }

        public static AliasState valueOf(String str) {
            return (AliasState) Enum.valueOf(AliasState.class, str);
        }

        public static AliasState[] values() {
            return (AliasState[]) $VALUES.clone();
        }
    }

    public AliasesSectionViewModel(LinkedHashMap linkedHashMap) {
        this.aliases = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AliasesSectionViewModel) && this.aliases.equals(((AliasesSectionViewModel) obj).aliases);
    }

    public final int hashCode() {
        return this.aliases.hashCode();
    }

    public final String toString() {
        return "AliasesSectionViewModel(aliases=" + this.aliases + ")";
    }
}
