package com.squareup.cash.clientrouting.validation;

/* loaded from: classes6.dex */
public abstract class ValidatorResult {

    public final class Allowed extends ValidatorResult {
        public static final Allowed INSTANCE = new Allowed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Allowed);
        }

        public final int hashCode() {
            return -774662983;
        }

        public final String toString() {
            return "Allowed";
        }
    }

    public final class NotAllowed extends ValidatorResult {
        public final Reason reason;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Reason {
            public static final /* synthetic */ Reason[] $VALUES;
            public static final Reason ACCOUNT_IDENTIFIER_NOT_SUPPLIED;
            public static final Reason CASH_APP_PAY_ONBOARDING;
            public static final Reason LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED;

            static {
                Reason reason = new Reason("ACCOUNT_IDENTIFIER_NOT_SUPPLIED", 0);
                ACCOUNT_IDENTIFIER_NOT_SUPPLIED = reason;
                Reason reason2 = new Reason("BTCX_ROUTE_NOT_ALLOWED", 1);
                Reason reason3 = new Reason("CASH_APP_PAY_ONBOARDING", 2);
                CASH_APP_PAY_ONBOARDING = reason3;
                Reason reason4 = new Reason("LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED", 3);
                LOGGED_IN_ROUTE_ACCOUNT_NOT_AUTHENTICATED = reason4;
                $VALUES = new Reason[]{reason, reason2, reason3, reason4, new Reason("LOGGED_OUT_ROUTE_ACCOUNT_AUTHENTICATED", 4)};
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }
        }

        public NotAllowed(Reason reason) {
            this.reason = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotAllowed) && this.reason == ((NotAllowed) obj).reason;
        }

        public final Reason getReason() {
            return this.reason;
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final String toString() {
            return "NotAllowed(reason=" + this.reason + ")";
        }
    }
}
