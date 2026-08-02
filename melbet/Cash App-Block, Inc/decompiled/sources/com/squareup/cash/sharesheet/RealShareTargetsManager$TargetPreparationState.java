package com.squareup.cash.sharesheet;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class RealShareTargetsManager$TargetPreparationState {

    public final class FailedToLoad extends RealShareTargetsManager$TargetPreparationState {
        public final String failureMessage;
        public final ShareTarget target;

        public FailedToLoad(ShareTarget shareTarget, String str) {
            str.getClass();
            this.target = shareTarget;
            this.failureMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedToLoad)) {
                return false;
            }
            FailedToLoad failedToLoad = (FailedToLoad) obj;
            return this.target.equals(failedToLoad.target) && Intrinsics.areEqual(this.failureMessage, failedToLoad.failureMessage);
        }

        @Override // com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState
        public final ShareTarget getTarget() {
            return this.target;
        }

        public final int hashCode() {
            return this.failureMessage.hashCode() + (this.target.hashCode() * 31);
        }

        public final String toString() {
            return "FailedToLoad(target=" + this.target + ", failureMessage=" + this.failureMessage + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class Loading extends RealShareTargetsManager$TargetPreparationState {
        public final ShareTarget target;

        public Loading(ShareTarget shareTarget) {
            this.target = shareTarget;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.target.equals(((Loading) obj).target);
        }

        @Override // com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState
        public final ShareTarget getTarget() {
            return this.target;
        }

        public final int hashCode() {
            return this.target.hashCode();
        }

        public final String toString() {
            return "Loading(target=" + this.target + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class Ready extends RealShareTargetsManager$TargetPreparationState {
        public final ShareTarget target;

        public Ready(ShareTarget shareTarget) {
            this.target = shareTarget;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && this.target.equals(((Ready) obj).target);
        }

        @Override // com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState
        public final ShareTarget getTarget() {
            return this.target;
        }

        public final int hashCode() {
            return this.target.hashCode();
        }

        public final String toString() {
            return "Ready(target=" + this.target + ")";
        }
    }

    public abstract ShareTarget getTarget();
}
