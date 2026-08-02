package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.franklin.api.HelpItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface VerifyHelpViewEvent {

    public final class CancelClick implements VerifyHelpViewEvent {
        public static final CancelClick INSTANCE = new CancelClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClick);
        }

        public final int hashCode() {
            return -1033328321;
        }

        public final String toString() {
            return "CancelClick";
        }
    }

    public final class HelpItemSelected implements VerifyHelpViewEvent {
        public final HelpItem result;

        public HelpItemSelected(HelpItem helpItem) {
            helpItem.getClass();
            this.result = helpItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpItemSelected) && Intrinsics.areEqual(this.result, ((HelpItemSelected) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "HelpItemSelected(result=" + this.result + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class VerifyHelpItemSelected implements VerifyHelpViewEvent {
        public final VerifyHelpItem result;

        public VerifyHelpItemSelected(VerifyHelpItem verifyHelpItem) {
            verifyHelpItem.getClass();
            this.result = verifyHelpItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerifyHelpItemSelected) && this.result == ((VerifyHelpItemSelected) obj).result;
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "VerifyHelpItemSelected(result=" + this.result + ")";
        }
    }
}
