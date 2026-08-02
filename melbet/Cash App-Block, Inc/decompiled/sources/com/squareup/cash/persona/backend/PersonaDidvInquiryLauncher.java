package com.squareup.cash.persona.backend;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonaDidvInquiryLauncher {

    /* loaded from: classes9.dex */
    public final class Inquiry {
        public final String inquiryId;
        public final String sessionToken;

        public Inquiry(String str, String str2) {
            this.inquiryId = str;
            this.sessionToken = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inquiry)) {
                return false;
            }
            Inquiry inquiry = (Inquiry) obj;
            return Intrinsics.areEqual(this.inquiryId, inquiry.inquiryId) && Intrinsics.areEqual(this.sessionToken, inquiry.sessionToken);
        }

        public final int hashCode() {
            String str = this.inquiryId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sessionToken;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Inquiry(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ")");
        }
    }

    public abstract class InquiryResult {

        public final class Cancel extends InquiryResult {
            public final String inquiryId;
            public final String sessionToken;

            public Cancel(String str, String str2) {
                this.inquiryId = str;
                this.sessionToken = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cancel)) {
                    return false;
                }
                Cancel cancel = (Cancel) obj;
                return Intrinsics.areEqual(this.inquiryId, cancel.inquiryId) && Intrinsics.areEqual(this.sessionToken, cancel.sessionToken);
            }

            public final int hashCode() {
                String str = this.inquiryId;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.sessionToken;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Cancel(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ")");
            }
        }

        public final class Complete extends InquiryResult {
            public final String inquiryId;
            public final String status;

            public Complete(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.inquiryId = str;
                this.status = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) obj;
                return Intrinsics.areEqual(this.inquiryId, complete.inquiryId) && Intrinsics.areEqual(this.status, complete.status);
            }

            public final int hashCode() {
                return this.status.hashCode() + (this.inquiryId.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Complete(inquiryId=", this.inquiryId, ", status=", this.status, ")");
            }
        }

        public final class Error extends InquiryResult {
            public final String debugMessage;

            public Error(String str) {
                str.getClass();
                this.debugMessage = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.debugMessage, ((Error) obj).debugMessage);
            }

            public final int hashCode() {
                return this.debugMessage.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(debugMessage=", this.debugMessage, ")");
            }
        }
    }
}
