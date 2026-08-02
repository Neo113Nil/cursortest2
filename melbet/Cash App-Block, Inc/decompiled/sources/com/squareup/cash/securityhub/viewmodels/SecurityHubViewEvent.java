package com.squareup.cash.securityhub.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SecurityHubViewEvent {

    public final class NavigateBack implements SecurityHubViewEvent {
        public static final NavigateBack INSTANCE = new NavigateBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -1950728334;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    public final class ProtectionsEvent implements SecurityHubViewEvent {
        public final ProtectionsSectionViewEvent event;

        public ProtectionsEvent(ProtectionsSectionViewEvent protectionsSectionViewEvent) {
            protectionsSectionViewEvent.getClass();
            this.event = protectionsSectionViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProtectionsEvent) && Intrinsics.areEqual(this.event, ((ProtectionsEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "ProtectionsEvent(event=" + this.event + ")";
        }
    }
}
