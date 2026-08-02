package com.squareup.cash.core.navigationcontainer.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MainScreensViewModel$Tab {
    public final long badgeCount;
    public final MainScreensViewEvent clickEvent;
    public final String contentAccessibilityText;
    public final Icon icon;
    public final Function1 screenMatcher;
    public final String stateAccessibilityText;
    public final String stateId;
    public final boolean supportsFlatTabs;
    public final TooltipTarget tooltipTarget;
    public final String tooltipText;

    public interface Icon {

        public final class Activity implements Icon {
            public static final Activity INSTANCE = new Activity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Activity);
            }

            public final int hashCode() {
                return 317610777;
            }

            public final String toString() {
                return "Activity";
            }
        }

        public final class Card implements Icon {
            public static final Card INSTANCE = new Card();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Card);
            }

            public final int hashCode() {
                return -1383434214;
            }

            public final String toString() {
                return "Card";
            }
        }

        public final class FullBadge implements Icon {
            public final long count;

            public FullBadge(long j) {
                this.count = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FullBadge) || this.count != ((FullBadge) obj).count) {
                    return false;
                }
                Activity activity = Activity.INSTANCE;
                return activity.equals(activity);
            }

            public final int hashCode() {
                return (Long.hashCode(this.count) * 31) + 317610777;
            }

            public final String toString() {
                return "FullBadge(count=" + this.count + ", selectedIcon=" + Activity.INSTANCE + ")";
            }
        }

        public final class Local implements Icon {
            public static final Local INSTANCE = new Local();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Local);
            }

            public final int hashCode() {
                return 71926689;
            }

            public final String toString() {
                return "Local";
            }
        }

        public final class Money implements Icon {
            public static final Money INSTANCE = new Money();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Money);
            }

            public final int hashCode() {
                return 72860918;
            }

            public final String toString() {
                return "Money";
            }
        }

        public final class PaymentDollar implements Icon {
            public static final PaymentDollar INSTANCE = new PaymentDollar();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PaymentDollar);
            }

            public final int hashCode() {
                return -2078566248;
            }

            public final String toString() {
                return "PaymentDollar";
            }
        }

        public final class PaymentGeneric implements Icon {
            public static final PaymentGeneric INSTANCE = new PaymentGeneric();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PaymentGeneric);
            }

            public final int hashCode() {
                return -1928137349;
            }

            public final String toString() {
                return "PaymentGeneric";
            }
        }

        public final class PaymentPound implements Icon {
            public static final PaymentPound INSTANCE = new PaymentPound();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PaymentPound);
            }

            public final int hashCode() {
                return 1883703088;
            }

            public final String toString() {
                return "PaymentPound";
            }
        }

        public final class Text implements Icon {
            public final String text;

            public Text(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && Intrinsics.areEqual(this.text, ((Text) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(text=", this.text, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TooltipTarget {
        public static final /* synthetic */ TooltipTarget[] $VALUES;
        public static final TooltipTarget Activity;
        public static final TooltipTarget Local;
        public static final TooltipTarget Money;
        public static final TooltipTarget Send;

        static {
            TooltipTarget tooltipTarget = new TooltipTarget("Activity", 0);
            Activity = tooltipTarget;
            TooltipTarget tooltipTarget2 = new TooltipTarget("Card", 1);
            TooltipTarget tooltipTarget3 = new TooltipTarget("Money", 2);
            Money = tooltipTarget3;
            TooltipTarget tooltipTarget4 = new TooltipTarget("Send", 3);
            Send = tooltipTarget4;
            TooltipTarget tooltipTarget5 = new TooltipTarget("Local", 4);
            Local = tooltipTarget5;
            $VALUES = new TooltipTarget[]{tooltipTarget, tooltipTarget2, tooltipTarget3, tooltipTarget4, tooltipTarget5};
        }

        public static TooltipTarget valueOf(String str) {
            return (TooltipTarget) Enum.valueOf(TooltipTarget.class, str);
        }

        public static TooltipTarget[] values() {
            return (TooltipTarget[]) $VALUES.clone();
        }
    }

    public MainScreensViewModel$Tab(String str, Icon icon, long j, String str2, String str3, String str4, Function1 function1, MainScreensViewEvent mainScreensViewEvent, TooltipTarget tooltipTarget, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str2, str3, str4);
        this.stateId = str;
        this.icon = icon;
        this.badgeCount = j;
        this.contentAccessibilityText = str2;
        this.stateAccessibilityText = str3;
        this.tooltipText = str4;
        this.screenMatcher = function1;
        this.clickEvent = mainScreensViewEvent;
        this.tooltipTarget = tooltipTarget;
        this.supportsFlatTabs = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainScreensViewModel$Tab)) {
            return false;
        }
        MainScreensViewModel$Tab mainScreensViewModel$Tab = (MainScreensViewModel$Tab) obj;
        return Intrinsics.areEqual(this.stateId, mainScreensViewModel$Tab.stateId) && Intrinsics.areEqual(this.icon, mainScreensViewModel$Tab.icon) && this.badgeCount == mainScreensViewModel$Tab.badgeCount && Intrinsics.areEqual(this.contentAccessibilityText, mainScreensViewModel$Tab.contentAccessibilityText) && Intrinsics.areEqual(this.stateAccessibilityText, mainScreensViewModel$Tab.stateAccessibilityText) && Intrinsics.areEqual(this.tooltipText, mainScreensViewModel$Tab.tooltipText) && Intrinsics.areEqual(this.screenMatcher, mainScreensViewModel$Tab.screenMatcher) && Intrinsics.areEqual(this.clickEvent, mainScreensViewModel$Tab.clickEvent) && this.tooltipTarget == mainScreensViewModel$Tab.tooltipTarget && this.supportsFlatTabs == mainScreensViewModel$Tab.supportsFlatTabs;
    }

    public final Function1 getScreenMatcher() {
        return this.screenMatcher;
    }

    public final boolean getSupportsFlatTabs() {
        return this.supportsFlatTabs;
    }

    public final TooltipTarget getTooltipTarget() {
        return this.tooltipTarget;
    }

    public final int hashCode() {
        int hashCode = (this.clickEvent.hashCode() + Recorder$$ExternalSyntheticOutline1.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.icon.hashCode() + (this.stateId.hashCode() * 31)) * 31, 31, this.badgeCount), 31, this.contentAccessibilityText), 31, this.stateAccessibilityText), 31, this.tooltipText), 31, this.screenMatcher)) * 31;
        TooltipTarget tooltipTarget = this.tooltipTarget;
        return Boolean.hashCode(this.supportsFlatTabs) + ((hashCode + (tooltipTarget == null ? 0 : tooltipTarget.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tab(stateId=");
        sb.append(this.stateId);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", badgeCount=");
        Fragment$5$$ExternalSyntheticOutline0.m(this.badgeCount, ", contentAccessibilityText=", this.contentAccessibilityText, sb);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", stateAccessibilityText=", this.stateAccessibilityText, ", tooltipText=", this.tooltipText);
        sb.append(", screenMatcher=");
        sb.append(this.screenMatcher);
        sb.append(", clickEvent=");
        sb.append(this.clickEvent);
        sb.append(", tooltipTarget=");
        sb.append(this.tooltipTarget);
        sb.append(", supportsFlatTabs=");
        sb.append(this.supportsFlatTabs);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MainScreensViewModel$Tab(String str, Icon icon, long j, String str2, String str3, String str4, Function1 function1, MainScreensViewEvent mainScreensViewEvent, TooltipTarget tooltipTarget) {
        this(str, icon, j, str2, str3, str4, function1, mainScreensViewEvent, tooltipTarget, false);
    }
}
