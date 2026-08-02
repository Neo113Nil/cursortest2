package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public interface AddAliasViewEvent {

    public final class AddAlias implements AddAliasViewEvent {
        public final AliasItem result;

        public AddAlias(AliasItem aliasItem) {
            aliasItem.getClass();
            this.result = aliasItem;
        }
    }

    public final class Exit implements AddAliasViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1010962674;
        }

        public final String toString() {
            return "Exit";
        }
    }
}
