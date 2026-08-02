package com.squareup.cash.paychecks.viewmodels;

import app.cash.broadway.screen.Screen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DistributePaycheckViewEvent {

    public final class AllocationRowViewEvent implements DistributePaycheckViewEvent {
        public final DestinationAllocationRowViewEvent event;

        public AllocationRowViewEvent(DestinationAllocationRowViewEvent destinationAllocationRowViewEvent) {
            destinationAllocationRowViewEvent.getClass();
            this.event = destinationAllocationRowViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllocationRowViewEvent) && Intrinsics.areEqual(this.event, ((AllocationRowViewEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "AllocationRowViewEvent(event=" + this.event + ")";
        }
    }

    public final class Exit implements DistributePaycheckViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 143051946;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class Help implements DistributePaycheckViewEvent {
        public static final Help INSTANCE = new Help();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Help);
        }

        public final int hashCode() {
            return 143123149;
        }

        public final String toString() {
            return "Help";
        }
    }

    public final class OnDialogResult implements DistributePaycheckViewEvent {
        public final Object args;
        public final Screen screen;

        public OnDialogResult(Screen screen, Object obj) {
            screen.getClass();
            this.screen = screen;
            this.args = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDialogResult)) {
                return false;
            }
            OnDialogResult onDialogResult = (OnDialogResult) obj;
            return Intrinsics.areEqual(this.screen, onDialogResult.screen) && Intrinsics.areEqual(this.args, onDialogResult.args);
        }

        public final int hashCode() {
            int hashCode = this.screen.hashCode() * 31;
            Object obj = this.args;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "OnDialogResult(screen=" + this.screen + ", args=" + this.args + ")";
        }
    }
}
