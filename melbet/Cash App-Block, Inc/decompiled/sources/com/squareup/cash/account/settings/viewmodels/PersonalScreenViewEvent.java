package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface PersonalScreenViewEvent {

    /* loaded from: classes7.dex */
    public final class AliasEvent implements PersonalScreenViewEvent {
        public final AliasesSectionEvent event;

        public AliasEvent(AliasesSectionEvent aliasesSectionEvent) {
            aliasesSectionEvent.getClass();
            this.event = aliasesSectionEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AliasEvent) && Intrinsics.areEqual(this.event, ((AliasEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "AliasEvent(event=" + this.event + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class AppMessageEvent implements PersonalScreenViewEvent {
        public final AppMessageViewEvent event;

        public AppMessageEvent(AppMessageViewEvent appMessageViewEvent) {
            appMessageViewEvent.getClass();
            this.event = appMessageViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AppMessageEvent) && Intrinsics.areEqual(this.event, ((AppMessageEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "AppMessageEvent(event=" + this.event + ")";
        }
    }

    /* loaded from: classes6.dex */
    public abstract class AutoFillEvent implements PersonalScreenViewEvent {
    }

    /* loaded from: classes7.dex */
    public final class Close implements PersonalScreenViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1220834924;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ProUpgradeClick implements PersonalScreenViewEvent {
        public final boolean isBusiness;

        public ProUpgradeClick(boolean z) {
            this.isBusiness = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProUpgradeClick) && this.isBusiness == ((ProUpgradeClick) obj).isBusiness;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isBusiness);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ProUpgradeClick(isBusiness=", ")", this.isBusiness);
        }
    }

    public final class ReplaceAddress implements PersonalScreenViewEvent {
        public static final ReplaceAddress INSTANCE = new ReplaceAddress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReplaceAddress);
        }

        public final int hashCode() {
            return -2001831764;
        }

        public final String toString() {
            return "ReplaceAddress";
        }
    }
}
