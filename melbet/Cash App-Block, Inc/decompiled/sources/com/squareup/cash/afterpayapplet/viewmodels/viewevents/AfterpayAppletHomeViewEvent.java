package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletHomeViewEvent {

    public interface AfterpayAppletBalanceHeroSectionEvent extends AfterpayAppletHomeViewEvent {

        public final class DateTapped implements AfterpayAppletBalanceHeroSectionEvent {
            public final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate;

            public DateTapped(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate) {
                calendarDate.getClass();
                this.calendarDate = calendarDate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DateTapped) && Intrinsics.areEqual(this.calendarDate, ((DateTapped) obj).calendarDate);
            }

            public final int hashCode() {
                return this.calendarDate.hashCode();
            }

            public final String toString() {
                return "DateTapped(calendarDate=" + this.calendarDate + ")";
            }
        }

        public final class RequestMoreDates implements AfterpayAppletBalanceHeroSectionEvent {
            public final int currentDateIndex;

            public RequestMoreDates(int i) {
                this.currentDateIndex = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RequestMoreDates) && this.currentDateIndex == ((RequestMoreDates) obj).currentDateIndex;
            }

            public final int hashCode() {
                return Integer.hashCode(this.currentDateIndex);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentDateIndex, "RequestMoreDates(currentDateIndex=", ")");
            }
        }

        public final class ScrollToWeek implements AfterpayAppletBalanceHeroSectionEvent {
            public final List weekDates;

            public ScrollToWeek(List list) {
                list.getClass();
                this.weekDates = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScrollToWeek) && Intrinsics.areEqual(this.weekDates, ((ScrollToWeek) obj).weekDates);
            }

            public final int hashCode() {
                return this.weekDates.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("ScrollToWeek(weekDates=", ")", this.weekDates);
            }
        }
    }

    /* loaded from: classes8.dex */
    public final class CardClicked implements AfterpayAppletHomeViewEvent {
        public final int cardPosition;
        public final AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent content;

        public CardClicked(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent, int i) {
            this.content = afterpayCardContent;
            this.cardPosition = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardClicked)) {
                return false;
            }
            CardClicked cardClicked = (CardClicked) obj;
            return Intrinsics.areEqual(this.content, cardClicked.content) && this.cardPosition == cardClicked.cardPosition;
        }

        public final int hashCode() {
            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent = this.content;
            return Integer.hashCode(this.cardPosition) + ((afterpayCardContent == null ? 0 : afterpayCardContent.hashCode()) * 31);
        }

        public final String toString() {
            return "CardClicked(content=" + this.content + ", cardPosition=" + this.cardPosition + ")";
        }
    }

    public final class CarouselTileTapped implements AfterpayAppletHomeViewEvent, AfterpayAnalyticsAppletTappedEvent {
        public final List analyticsAppletTappedEvent;
        public final EngagedItemToken engagedItemToken;
        public final Tap tap;

        public CarouselTileTapped(Tap tap, EngagedItemToken engagedItemToken, List list) {
            tap.getClass();
            this.tap = tap;
            this.engagedItemToken = engagedItemToken;
            this.analyticsAppletTappedEvent = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CarouselTileTapped)) {
                return false;
            }
            CarouselTileTapped carouselTileTapped = (CarouselTileTapped) obj;
            return Intrinsics.areEqual(this.tap, carouselTileTapped.tap) && Intrinsics.areEqual(this.engagedItemToken, carouselTileTapped.engagedItemToken) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, carouselTileTapped.analyticsAppletTappedEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent
        public final List getAnalyticsAppletTappedEvent() {
            return this.analyticsAppletTappedEvent;
        }

        public final int hashCode() {
            int hashCode = this.tap.hashCode() * 31;
            EngagedItemToken engagedItemToken = this.engagedItemToken;
            int hashCode2 = (hashCode + (engagedItemToken == null ? 0 : engagedItemToken.hashCode())) * 31;
            List list = this.analyticsAppletTappedEvent;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CarouselTileTapped(tap=");
            sb.append(this.tap);
            sb.append(", engagedItemToken=");
            sb.append(this.engagedItemToken);
            sb.append(", analyticsAppletTappedEvent=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.analyticsAppletTappedEvent, ")");
        }
    }

    public final class GoBack implements AfterpayAppletHomeViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1498445996;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class HelpButtonTapped implements AfterpayAppletHomeViewEvent {
        public static final HelpButtonTapped INSTANCE = new HelpButtonTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpButtonTapped);
        }

        public final int hashCode() {
            return 1108497764;
        }

        public final String toString() {
            return "HelpButtonTapped";
        }
    }

    public final class LegalSectionUrlTapped implements AfterpayAppletHomeViewEvent {
        public final String actionUrl;

        public LegalSectionUrlTapped(String str) {
            str.getClass();
            this.actionUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LegalSectionUrlTapped) && Intrinsics.areEqual(this.actionUrl, ((LegalSectionUrlTapped) obj).actionUrl);
        }

        public final int hashCode() {
            return this.actionUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LegalSectionUrlTapped(actionUrl=", this.actionUrl, ")");
        }
    }

    public final class PaymentButtonTapped implements AfterpayAppletHomeViewEvent, AfterpayAnalyticsAppletTappedEvent {
        public final List analyticsAppletTappedEvent;
        public final Tap tap;

        public PaymentButtonTapped(Tap tap) {
            List analyticsTapEventsSpec = tap.getAnalyticsTapEventsSpec();
            this.tap = tap;
            this.analyticsAppletTappedEvent = analyticsTapEventsSpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentButtonTapped)) {
                return false;
            }
            PaymentButtonTapped paymentButtonTapped = (PaymentButtonTapped) obj;
            return Intrinsics.areEqual(this.tap, paymentButtonTapped.tap) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, paymentButtonTapped.analyticsAppletTappedEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent
        public final List getAnalyticsAppletTappedEvent() {
            return this.analyticsAppletTappedEvent;
        }

        public final int hashCode() {
            int hashCode = this.tap.hashCode() * 31;
            List list = this.analyticsAppletTappedEvent;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "PaymentButtonTapped(tap=" + this.tap + ", analyticsAppletTappedEvent=" + this.analyticsAppletTappedEvent + ")";
        }
    }

    public final class PrepurchaseToggleTapped implements AfterpayAppletHomeViewEvent {
        public static final PrepurchaseToggleTapped INSTANCE = new PrepurchaseToggleTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrepurchaseToggleTapped);
        }

        public final int hashCode() {
            return 715359999;
        }

        public final String toString() {
            return "PrepurchaseToggleTapped";
        }
    }

    public final class PrepurchaseToggleViewed implements AfterpayAppletHomeViewEvent {
        public static final PrepurchaseToggleViewed INSTANCE = new PrepurchaseToggleViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrepurchaseToggleViewed);
        }

        public final int hashCode() {
            return 779685495;
        }

        public final String toString() {
            return "PrepurchaseToggleViewed";
        }
    }

    public final class Refresh implements AfterpayAppletHomeViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 1712884246;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class TryAgainTapped implements AfterpayAppletHomeViewEvent {
        public static final TryAgainTapped INSTANCE = new TryAgainTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainTapped);
        }

        public final int hashCode() {
            return -2068687434;
        }

        public final String toString() {
            return "TryAgainTapped";
        }
    }

    public final class TapActionEvent implements AfterpayAppletHomeViewEvent, AfterpayAnalyticsAppletTappedEvent, AfterpayAppletRetroOrderSelectionViewEvent, AfterpayAppletUpsellSheetViewEvent {
        public final List analyticsAppletTappedEvent;
        public final Tap tap;

        public TapActionEvent(Tap tap, List list) {
            tap.getClass();
            this.tap = tap;
            this.analyticsAppletTappedEvent = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapActionEvent)) {
                return false;
            }
            TapActionEvent tapActionEvent = (TapActionEvent) obj;
            return Intrinsics.areEqual(this.tap, tapActionEvent.tap) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, tapActionEvent.analyticsAppletTappedEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent
        public final List getAnalyticsAppletTappedEvent() {
            return this.analyticsAppletTappedEvent;
        }

        public final int hashCode() {
            int hashCode = this.tap.hashCode() * 31;
            List list = this.analyticsAppletTappedEvent;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return "TapActionEvent(tap=" + this.tap + ", analyticsAppletTappedEvent=" + this.analyticsAppletTappedEvent + ")";
        }

        public /* synthetic */ TapActionEvent(Tap tap) {
            this(tap, tap.getAnalyticsTapEventsSpec());
        }
    }
}
