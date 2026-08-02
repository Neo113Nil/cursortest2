package com.squareup.cash.banking.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class RecurringDepositsViewModel {
    public final BalanceBasedAddCash balanceBasedAddCash;
    public final ScheduledAddCash scheduledAddCash;
    public final String title;

    public final class BalanceBasedAddCash {
        public final String ctaButtonLabel;
        public final State state;
        public final String title;
        public final String toggleDescription;

        public interface State {

            /* loaded from: classes7.dex */
            public final class Disabled implements State {
                public static final Disabled INSTANCE = new Disabled();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Disabled);
                }

                public final int hashCode() {
                    return 50124417;
                }

                public final String toString() {
                    return "Disabled";
                }
            }

            /* loaded from: classes7.dex */
            public final class Enabled implements State {
                public final String incrementAmount;
                public final String minimumBalance;

                public Enabled(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.minimumBalance = str;
                    this.incrementAmount = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Enabled)) {
                        return false;
                    }
                    Enabled enabled = (Enabled) obj;
                    return Intrinsics.areEqual(this.minimumBalance, enabled.minimumBalance) && Intrinsics.areEqual(this.incrementAmount, enabled.incrementAmount);
                }

                public final int hashCode() {
                    return this.incrementAmount.hashCode() + (this.minimumBalance.hashCode() * 31);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Enabled(minimumBalance=", this.minimumBalance, ", incrementAmount=", this.incrementAmount, ")");
                }
            }

            /* loaded from: classes7.dex */
            public final class Locked implements State {
                public final String clientRoute;
                public final String message;
                public final String negativeButtonLabel;
                public final String positiveButtonLabel;
                public final String title;

                public Locked(String str, String str2, String str3, String str4, String str5) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                    this.title = str;
                    this.message = str2;
                    this.positiveButtonLabel = str3;
                    this.negativeButtonLabel = str4;
                    this.clientRoute = str5;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Locked)) {
                        return false;
                    }
                    Locked locked = (Locked) obj;
                    return Intrinsics.areEqual(this.title, locked.title) && Intrinsics.areEqual(this.message, locked.message) && Intrinsics.areEqual(this.positiveButtonLabel, locked.positiveButtonLabel) && Intrinsics.areEqual(this.negativeButtonLabel, locked.negativeButtonLabel) && Intrinsics.areEqual(this.clientRoute, locked.clientRoute);
                }

                public final int hashCode() {
                    return this.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButtonLabel), 31, this.negativeButtonLabel);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Locked(title=", this.title, ", message=", this.message, ", positiveButtonLabel=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.positiveButtonLabel, ", negativeButtonLabel=", this.negativeButtonLabel, ", clientRoute=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.clientRoute, ")");
                }
            }
        }

        public BalanceBasedAddCash(State state, String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.state = state;
            this.title = str;
            this.toggleDescription = str2;
            this.ctaButtonLabel = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceBasedAddCash)) {
                return false;
            }
            BalanceBasedAddCash balanceBasedAddCash = (BalanceBasedAddCash) obj;
            return this.state.equals(balanceBasedAddCash.state) && Intrinsics.areEqual(this.title, balanceBasedAddCash.title) && Intrinsics.areEqual(this.toggleDescription, balanceBasedAddCash.toggleDescription) && Intrinsics.areEqual(this.ctaButtonLabel, balanceBasedAddCash.ctaButtonLabel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.state.hashCode() * 31, 31, this.title), 31, this.toggleDescription);
            String str = this.ctaButtonLabel;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BalanceBasedAddCash(state=");
            sb.append(this.state);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", toggleDescription=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.toggleDescription, ", ctaButtonLabel=", this.ctaButtonLabel, ")");
        }
    }

    public final class ScheduledAddCash {
        public final String ctaButtonLabel;
        public final Source source;
        public final State state;
        public final String title;
        public final String toggleDescription;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes7.dex */
        public final class Source {
            public static final /* synthetic */ Source[] $VALUES;
            public static final Source PROFILE;
            public static final Source SYNC_VALUE;

            static {
                Source source = new Source("SYNC_VALUE", 0);
                SYNC_VALUE = source;
                Source source2 = new Source("PROFILE", 1);
                PROFILE = source2;
                $VALUES = new Source[]{source, source2};
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        public interface State {

            public final class Disabled implements State {
                public static final Disabled INSTANCE = new Disabled();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Disabled);
                }

                public final int hashCode() {
                    return 592386921;
                }

                public final String toString() {
                    return "Disabled";
                }
            }

            public final class Enabled implements State {
                public final String amount;
                public final String frequency;

                public Enabled(String str, String str2) {
                    this.amount = str;
                    this.frequency = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Enabled)) {
                        return false;
                    }
                    Enabled enabled = (Enabled) obj;
                    return Intrinsics.areEqual(this.amount, enabled.amount) && Intrinsics.areEqual(this.frequency, enabled.frequency);
                }

                public final int hashCode() {
                    String str = this.amount;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.frequency;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Enabled(amount=", this.amount, ", frequency=", this.frequency, ")");
                }
            }
        }

        public ScheduledAddCash(State state, String str, String str2, Source source, String str3) {
            str.getClass();
            str2.getClass();
            this.state = state;
            this.title = str;
            this.toggleDescription = str2;
            this.source = source;
            this.ctaButtonLabel = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduledAddCash)) {
                return false;
            }
            ScheduledAddCash scheduledAddCash = (ScheduledAddCash) obj;
            return this.state.equals(scheduledAddCash.state) && Intrinsics.areEqual(this.title, scheduledAddCash.title) && Intrinsics.areEqual(this.toggleDescription, scheduledAddCash.toggleDescription) && this.source == scheduledAddCash.source && Intrinsics.areEqual(this.ctaButtonLabel, scheduledAddCash.ctaButtonLabel);
        }

        public final int hashCode() {
            int hashCode = (this.source.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.state.hashCode() * 31, 31, this.title), 31, this.toggleDescription)) * 31;
            String str = this.ctaButtonLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScheduledAddCash(state=");
            sb.append(this.state);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", toggleDescription=");
            sb.append(this.toggleDescription);
            sb.append(", source=");
            sb.append(this.source);
            sb.append(", ctaButtonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.ctaButtonLabel, ")");
        }
    }

    public RecurringDepositsViewModel(String str, ScheduledAddCash scheduledAddCash, BalanceBasedAddCash balanceBasedAddCash) {
        str.getClass();
        this.title = str;
        this.scheduledAddCash = scheduledAddCash;
        this.balanceBasedAddCash = balanceBasedAddCash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringDepositsViewModel)) {
            return false;
        }
        RecurringDepositsViewModel recurringDepositsViewModel = (RecurringDepositsViewModel) obj;
        return Intrinsics.areEqual(this.title, recurringDepositsViewModel.title) && Intrinsics.areEqual(this.scheduledAddCash, recurringDepositsViewModel.scheduledAddCash) && Intrinsics.areEqual(this.balanceBasedAddCash, recurringDepositsViewModel.balanceBasedAddCash);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ScheduledAddCash scheduledAddCash = this.scheduledAddCash;
        int hashCode2 = (hashCode + (scheduledAddCash == null ? 0 : scheduledAddCash.hashCode())) * 31;
        BalanceBasedAddCash balanceBasedAddCash = this.balanceBasedAddCash;
        return hashCode2 + (balanceBasedAddCash != null ? balanceBasedAddCash.hashCode() : 0);
    }

    public final String toString() {
        return "RecurringDepositsViewModel(title=" + this.title + ", scheduledAddCash=" + this.scheduledAddCash + ", balanceBasedAddCash=" + this.balanceBasedAddCash + ")";
    }
}
