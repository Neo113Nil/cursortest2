package com.squareup.cash.account.types;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface PrincipalAccountToken {

    /* loaded from: classes4.dex */
    public final class None implements PrincipalAccountToken {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -1077014412;
        }

        public final String toString() {
            return "None";
        }
    }

    public final class Some implements PrincipalAccountToken {
        public final String accountToken;
        public final String switchingIdentifier;

        public Some(String str, String str2) {
            str.getClass();
            this.accountToken = str;
            this.switchingIdentifier = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Some)) {
                return false;
            }
            Some some = (Some) obj;
            return Intrinsics.areEqual(this.accountToken, some.accountToken) && Intrinsics.areEqual(this.switchingIdentifier, some.switchingIdentifier);
        }

        public final int hashCode() {
            int hashCode = this.accountToken.hashCode() * 31;
            String str = this.switchingIdentifier;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Some(accountToken=", this.accountToken, ", switchingIdentifier=", this.switchingIdentifier, ")");
        }
    }
}
