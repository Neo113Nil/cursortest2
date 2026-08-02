package com.squareup.cash.blockers.treehouse.viewmodels;

import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class TreehouseBlockerEvent {

    /* loaded from: classes5.dex */
    public final class Advance extends TreehouseBlockerEvent {
        public static final Advance INSTANCE = new Advance();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Advance);
        }

        public final int hashCode() {
            return 1831105766;
        }

        public final String toString() {
            return "Advance";
        }
    }

    /* loaded from: classes5.dex */
    public final class AdvanceToBlocker extends TreehouseBlockerEvent {
        public final BlockerDescriptor nextBlockerDescriptor;
        public final boolean replaceCurrent;

        public AdvanceToBlocker(BlockerDescriptor blockerDescriptor, boolean z) {
            blockerDescriptor.getClass();
            this.nextBlockerDescriptor = blockerDescriptor;
            this.replaceCurrent = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvanceToBlocker)) {
                return false;
            }
            AdvanceToBlocker advanceToBlocker = (AdvanceToBlocker) obj;
            return Intrinsics.areEqual(this.nextBlockerDescriptor, advanceToBlocker.nextBlockerDescriptor) && this.replaceCurrent == advanceToBlocker.replaceCurrent;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.replaceCurrent) + (this.nextBlockerDescriptor.hashCode() * 31);
        }

        public final String toString() {
            return "AdvanceToBlocker(nextBlockerDescriptor=" + this.nextBlockerDescriptor + ", replaceCurrent=" + this.replaceCurrent + ")";
        }
    }

    public final class Dismiss extends TreehouseBlockerEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 339377902;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class Retreat extends TreehouseBlockerEvent {
        public static final Retreat INSTANCE = new Retreat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retreat);
        }

        public final int hashCode() {
            return -233920981;
        }

        public final String toString() {
            return "Retreat";
        }
    }
}
