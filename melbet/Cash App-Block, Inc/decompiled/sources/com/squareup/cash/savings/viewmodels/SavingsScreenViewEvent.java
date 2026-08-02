package com.squareup.cash.savings.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.core.view.ViewGroupKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.savingsgoal.SavingsGoalRemoveRemove;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public interface SavingsScreenViewEvent {

    public interface BalanceSeenEvent extends SavingsScreenViewEvent {

        /* loaded from: classes6.dex */
        public final class GeneralBalanceSeen implements BalanceSeenEvent {
            public final Money amount;

            public GeneralBalanceSeen(Money money) {
                this.amount = money;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GeneralBalanceSeen) && this.amount.equals(((GeneralBalanceSeen) obj).amount);
            }

            public final int hashCode() {
                return this.amount.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "GeneralBalanceSeen(amount=", ")");
            }
        }

        /* loaded from: classes6.dex */
        public final class GoalBalanceSeen implements BalanceSeenEvent {
            public final Money amount;
            public final float progress;
            public final Money remainingBalance;
            public final String token;

            public GoalBalanceSeen(String str, float f, Money money, Money money2) {
                str.getClass();
                this.token = str;
                this.progress = f;
                this.remainingBalance = money;
                this.amount = money2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GoalBalanceSeen)) {
                    return false;
                }
                GoalBalanceSeen goalBalanceSeen = (GoalBalanceSeen) obj;
                return Intrinsics.areEqual(this.token, goalBalanceSeen.token) && Float.compare(this.progress, goalBalanceSeen.progress) == 0 && this.remainingBalance.equals(goalBalanceSeen.remainingBalance) && this.amount.equals(goalBalanceSeen.amount);
            }

            public final int hashCode() {
                return this.amount.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.remainingBalance, CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, this.token.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                return "GoalBalanceSeen(token=" + this.token + ", progress=" + this.progress + ", remainingBalance=" + this.remainingBalance + ", amount=" + this.amount + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class SavingsAndGoalBalanceSeen implements BalanceSeenEvent {
            public final Money amount;
            public final float progress;
            public final Money remainingBalance;
            public final String token;

            public SavingsAndGoalBalanceSeen(String str, float f, Money money, Money money2) {
                str.getClass();
                this.token = str;
                this.progress = f;
                this.remainingBalance = money;
                this.amount = money2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SavingsAndGoalBalanceSeen)) {
                    return false;
                }
                SavingsAndGoalBalanceSeen savingsAndGoalBalanceSeen = (SavingsAndGoalBalanceSeen) obj;
                return Intrinsics.areEqual(this.token, savingsAndGoalBalanceSeen.token) && Float.compare(this.progress, savingsAndGoalBalanceSeen.progress) == 0 && this.remainingBalance.equals(savingsAndGoalBalanceSeen.remainingBalance) && this.amount.equals(savingsAndGoalBalanceSeen.amount);
            }

            public final int hashCode() {
                return this.amount.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.remainingBalance, CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, this.token.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                return "SavingsAndGoalBalanceSeen(token=" + this.token + ", progress=" + this.progress + ", remainingBalance=" + this.remainingBalance + ", amount=" + this.amount + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class SavingsBalanceSeen implements BalanceSeenEvent {
            public final Money amount;

            public SavingsBalanceSeen(Money money) {
                this.amount = money;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsBalanceSeen) && this.amount.equals(((SavingsBalanceSeen) obj).amount);
            }

            public final int hashCode() {
                return this.amount.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "SavingsBalanceSeen(amount=", ")");
            }
        }
    }

    public final class Clicked implements SavingsScreenViewEvent {
        public final Event analyticsEvent;
        public final CdfEvent cdfEvent;
        public final String clientRoute;

        public Clicked(String str, CdfEvent cdfEvent, SavingsGoalRemoveRemove savingsGoalRemoveRemove) {
            this.clientRoute = str;
            this.cdfEvent = cdfEvent;
            this.analyticsEvent = savingsGoalRemoveRemove;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clicked)) {
                return false;
            }
            Clicked clicked = (Clicked) obj;
            return Intrinsics.areEqual(this.clientRoute, clicked.clientRoute) && Intrinsics.areEqual(this.cdfEvent, clicked.cdfEvent) && Intrinsics.areEqual(this.analyticsEvent, clicked.analyticsEvent);
        }

        public final int hashCode() {
            int hashCode = this.clientRoute.hashCode() * 31;
            CdfEvent cdfEvent = this.cdfEvent;
            int hashCode2 = (hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode())) * 31;
            Event event = this.analyticsEvent;
            return hashCode2 + (event != null ? event.hashCode() : 0);
        }

        public final String toString() {
            return "Clicked(clientRoute=" + this.clientRoute + ", cdfEvent=" + this.cdfEvent + ", analyticsEvent=" + this.analyticsEvent + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class DisclosureUrlClicked implements SavingsScreenViewEvent {
        public final String url;

        public DisclosureUrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureUrlClicked) && Intrinsics.areEqual(this.url, ((DisclosureUrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureUrlClicked(url=", this.url, ")");
        }
    }

    public final class Exit implements SavingsScreenViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -1255219196;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class GoalCelebrationSeen implements SavingsScreenViewEvent {
        public final String completionToken;
        public final String goalToken;

        public GoalCelebrationSeen(String str, String str2) {
            str.getClass();
            this.goalToken = str;
            this.completionToken = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoalCelebrationSeen)) {
                return false;
            }
            GoalCelebrationSeen goalCelebrationSeen = (GoalCelebrationSeen) obj;
            return Intrinsics.areEqual(this.goalToken, goalCelebrationSeen.goalToken) && Intrinsics.areEqual(this.completionToken, goalCelebrationSeen.completionToken);
        }

        public final int hashCode() {
            int hashCode = this.goalToken.hashCode() * 31;
            String str = this.completionToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("GoalCelebrationSeen(goalToken=", this.goalToken, ", completionToken=", this.completionToken, ")");
        }
    }

    public final class RemoveActiveGoal implements SavingsScreenViewEvent {
        public final String goalToken;

        public RemoveActiveGoal(String str) {
            str.getClass();
            this.goalToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveActiveGoal) && Intrinsics.areEqual(this.goalToken, ((RemoveActiveGoal) obj).goalToken);
        }

        public final int hashCode() {
            return this.goalToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoveActiveGoal(goalToken=", this.goalToken, ")");
        }
    }

    public final class SavingsCardEvent implements SavingsScreenViewEvent {
        public final UpsellCardEvent event;

        /* renamed from: type, reason: collision with root package name */
        public final CardType f1198type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class CardType {
            public static final /* synthetic */ CardType[] $VALUES;
            public static final CardType COMPACT;
            public static final CardType FULL;

            static {
                CardType cardType = new CardType("FULL", 0);
                FULL = cardType;
                CardType cardType2 = new CardType("COMPACT", 1);
                COMPACT = cardType2;
                $VALUES = new CardType[]{cardType, cardType2};
            }

            public static CardType valueOf(String str) {
                return (CardType) Enum.valueOf(CardType.class, str);
            }

            public static CardType[] values() {
                return (CardType[]) $VALUES.clone();
            }
        }

        public SavingsCardEvent(UpsellCardEvent upsellCardEvent, CardType cardType) {
            upsellCardEvent.getClass();
            this.event = upsellCardEvent;
            this.f1198type = cardType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsCardEvent)) {
                return false;
            }
            SavingsCardEvent savingsCardEvent = (SavingsCardEvent) obj;
            return Intrinsics.areEqual(this.event, savingsCardEvent.event) && this.f1198type == savingsCardEvent.f1198type;
        }

        public final int hashCode() {
            return this.f1198type.hashCode() + (this.event.hashCode() * 31);
        }

        public final String toString() {
            return "SavingsCardEvent(event=" + this.event + ", type=" + this.f1198type + ")";
        }
    }

    public final class SavingsHeaderClicked implements SavingsScreenViewEvent {
        public final ViewGroupKt event;

        public SavingsHeaderClicked(ViewGroupKt viewGroupKt) {
            viewGroupKt.getClass();
            this.event = viewGroupKt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SavingsHeaderClicked) && Intrinsics.areEqual(this.event, ((SavingsHeaderClicked) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "SavingsHeaderClicked(event=" + this.event + ")";
        }
    }

    public final class SeeAllActivitiesEvent implements SavingsScreenViewEvent {
        public static final SeeAllActivitiesEvent INSTANCE = new SeeAllActivitiesEvent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeAllActivitiesEvent);
        }

        public final int hashCode() {
            return 1060980313;
        }

        public final String toString() {
            return "SeeAllActivitiesEvent";
        }
    }

    public final class TransferInClicked implements SavingsScreenViewEvent {
        public final TransferConfig.TransferInConfig config;

        public TransferInClicked(TransferConfig.TransferInConfig transferInConfig) {
            transferInConfig.getClass();
            this.config = transferInConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransferInClicked) && Intrinsics.areEqual(this.config, ((TransferInClicked) obj).config);
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final String toString() {
            return "TransferInClicked(config=" + this.config + ")";
        }
    }

    public final class TransferOutClicked implements SavingsScreenViewEvent {
        public final TransferConfig.TransferOutConfig config;

        public TransferOutClicked(TransferConfig.TransferOutConfig transferOutConfig) {
            transferOutConfig.getClass();
            this.config = transferOutConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransferOutClicked) && Intrinsics.areEqual(this.config, ((TransferOutClicked) obj).config);
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final String toString() {
            return "TransferOutClicked(config=" + this.config + ")";
        }
    }
}
