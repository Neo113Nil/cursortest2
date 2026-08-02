package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface GpsLocationConsentBlockerViewEvent {

    public final class BlockerActionClicked implements GpsLocationConsentBlockerViewEvent {
        public final BlockerAction action;

        public BlockerActionClicked(BlockerAction blockerAction) {
            blockerAction.getClass();
            this.action = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockerActionClicked) && Intrinsics.areEqual(this.action, ((BlockerActionClicked) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("BlockerActionClicked(action=", this.action, ")");
        }
    }

    public final class Cancel implements GpsLocationConsentBlockerViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1934844778;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class OpenHalfSheet implements GpsLocationConsentBlockerViewEvent {
        public static final OpenHalfSheet INSTANCE = new OpenHalfSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenHalfSheet);
        }

        public final int hashCode() {
            return -716506074;
        }

        public final String toString() {
            return "OpenHalfSheet";
        }
    }
}
