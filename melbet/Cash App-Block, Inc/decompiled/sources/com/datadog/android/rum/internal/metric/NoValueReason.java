package com.datadog.android.rum.internal.metric;

/* loaded from: classes4.dex */
public interface NoValueReason {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class InteractionToNextView implements NoValueReason {
        public static final /* synthetic */ InteractionToNextView[] $VALUES;
        public static final InteractionToNextView DISABLED;
        public static final InteractionToNextView NO_ACTION;
        public static final InteractionToNextView NO_ELIGIBLE_ACTION;
        public static final InteractionToNextView NO_PREVIOUS_VIEW;
        public static final InteractionToNextView UNKNOWN;

        static {
            InteractionToNextView interactionToNextView = new InteractionToNextView("DISABLED", 0);
            DISABLED = interactionToNextView;
            InteractionToNextView interactionToNextView2 = new InteractionToNextView("NO_ACTION", 1);
            NO_ACTION = interactionToNextView2;
            InteractionToNextView interactionToNextView3 = new InteractionToNextView("NO_ELIGIBLE_ACTION", 2);
            NO_ELIGIBLE_ACTION = interactionToNextView3;
            InteractionToNextView interactionToNextView4 = new InteractionToNextView("NO_PREVIOUS_VIEW", 3);
            NO_PREVIOUS_VIEW = interactionToNextView4;
            InteractionToNextView interactionToNextView5 = new InteractionToNextView("UNKNOWN", 4);
            UNKNOWN = interactionToNextView5;
            $VALUES = new InteractionToNextView[]{interactionToNextView, interactionToNextView2, interactionToNextView3, interactionToNextView4, interactionToNextView5};
        }

        public static InteractionToNextView valueOf(String str) {
            return (InteractionToNextView) Enum.valueOf(InteractionToNextView.class, str);
        }

        public static InteractionToNextView[] values() {
            return (InteractionToNextView[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TimeToNetworkSettle implements NoValueReason {
        public static final /* synthetic */ TimeToNetworkSettle[] $VALUES;
        public static final TimeToNetworkSettle NOT_SETTLED_YET;
        public static final TimeToNetworkSettle NO_INITIAL_RESOURCES;
        public static final TimeToNetworkSettle NO_RESOURCES;
        public static final TimeToNetworkSettle UNKNOWN;

        static {
            TimeToNetworkSettle timeToNetworkSettle = new TimeToNetworkSettle("NO_RESOURCES", 0);
            NO_RESOURCES = timeToNetworkSettle;
            TimeToNetworkSettle timeToNetworkSettle2 = new TimeToNetworkSettle("NO_INITIAL_RESOURCES", 1);
            NO_INITIAL_RESOURCES = timeToNetworkSettle2;
            TimeToNetworkSettle timeToNetworkSettle3 = new TimeToNetworkSettle("NOT_SETTLED_YET", 2);
            NOT_SETTLED_YET = timeToNetworkSettle3;
            TimeToNetworkSettle timeToNetworkSettle4 = new TimeToNetworkSettle("UNKNOWN", 3);
            UNKNOWN = timeToNetworkSettle4;
            $VALUES = new TimeToNetworkSettle[]{timeToNetworkSettle, timeToNetworkSettle2, timeToNetworkSettle3, timeToNetworkSettle4};
        }

        public static TimeToNetworkSettle valueOf(String str) {
            return (TimeToNetworkSettle) Enum.valueOf(TimeToNetworkSettle.class, str);
        }

        public static TimeToNetworkSettle[] values() {
            return (TimeToNetworkSettle[]) $VALUES.clone();
        }
    }
}
