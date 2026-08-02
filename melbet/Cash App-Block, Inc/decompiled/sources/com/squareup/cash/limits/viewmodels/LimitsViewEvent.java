package com.squareup.cash.limits.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LimitsViewEvent {

    public final class ExitFlow implements LimitsViewEvent {
        public static final ExitFlow INSTANCE = new ExitFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitFlow);
        }

        public final int hashCode() {
            return 413796760;
        }

        public final String toString() {
            return "ExitFlow";
        }
    }

    public final class LimitsInlineMessageEvent implements LimitsViewEvent {
        public final LimitsInlineMessageViewEvent event;

        public LimitsInlineMessageEvent(LimitsInlineMessageViewEvent limitsInlineMessageViewEvent) {
            limitsInlineMessageViewEvent.getClass();
            this.event = limitsInlineMessageViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LimitsInlineMessageEvent) && Intrinsics.areEqual(this.event, ((LimitsInlineMessageEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "LimitsInlineMessageEvent(event=" + this.event + ")";
        }
    }

    public final class LimitsSectionSelectedEvent implements LimitsViewEvent {
        public final LimitViewModel model;

        public LimitsSectionSelectedEvent(LimitViewModel limitViewModel) {
            limitViewModel.getClass();
            this.model = limitViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LimitsSectionSelectedEvent) && Intrinsics.areEqual(this.model, ((LimitsSectionSelectedEvent) obj).model);
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "LimitsSectionSelectedEvent(model=" + this.model + ")";
        }
    }
}
