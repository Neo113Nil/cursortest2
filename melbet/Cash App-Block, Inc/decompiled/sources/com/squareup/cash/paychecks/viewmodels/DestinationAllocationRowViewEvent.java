package com.squareup.cash.paychecks.viewmodels;

import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DestinationAllocationRowViewEvent {

    public final class ViewAllocationEvent implements DestinationAllocationRowViewEvent {
        public final AllocationDestination destination;

        public ViewAllocationEvent(AllocationDestination allocationDestination) {
            allocationDestination.getClass();
            this.destination = allocationDestination;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewAllocationEvent) && Intrinsics.areEqual(this.destination, ((ViewAllocationEvent) obj).destination);
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final String toString() {
            return "ViewAllocationEvent(destination=" + this.destination + ")";
        }
    }

    public final class ViewInfoEvent implements DestinationAllocationRowViewEvent {
        public final AllocationDestination destination;

        public ViewInfoEvent(AllocationDestination allocationDestination) {
            allocationDestination.getClass();
            this.destination = allocationDestination;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewInfoEvent) && Intrinsics.areEqual(this.destination, ((ViewInfoEvent) obj).destination);
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final String toString() {
            return "ViewInfoEvent(destination=" + this.destination + ")";
        }
    }
}
