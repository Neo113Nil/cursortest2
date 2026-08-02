package com.squareup.cash.bugreporting.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BugReportingViewModel {

    public final class Loading extends BugReportingViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1027575611;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready extends BugReportingViewModel {
        public final String description;
        public final DiagnosticAttachments diagnosticAttachments;
        public final boolean diagnosticAttachmentsExpanded;
        public final String email;
        public final boolean isGeneratingTitle;
        public final boolean isSubmitting;
        public final boolean primaryButtonEnabled;
        public final List screenshots;
        public final String submitError;
        public final String title;
        public final boolean titleGenerationFailed;

        public Ready(String str, String str2, String str3, List list, boolean z, boolean z2, String str4, DiagnosticAttachments diagnosticAttachments, boolean z3, boolean z4, boolean z5) {
            str.getClass();
            list.getClass();
            diagnosticAttachments.getClass();
            this.email = str;
            this.title = str2;
            this.description = str3;
            this.screenshots = list;
            this.primaryButtonEnabled = z;
            this.isSubmitting = z2;
            this.submitError = str4;
            this.diagnosticAttachments = diagnosticAttachments;
            this.diagnosticAttachmentsExpanded = z3;
            this.isGeneratingTitle = z4;
            this.titleGenerationFailed = z5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.email, ready.email) && this.title.equals(ready.title) && this.description.equals(ready.description) && Intrinsics.areEqual(this.screenshots, ready.screenshots) && this.primaryButtonEnabled == ready.primaryButtonEnabled && this.isSubmitting == ready.isSubmitting && Intrinsics.areEqual(this.submitError, ready.submitError) && Intrinsics.areEqual(this.diagnosticAttachments, ready.diagnosticAttachments) && this.diagnosticAttachmentsExpanded == ready.diagnosticAttachmentsExpanded && this.isGeneratingTitle == ready.isGeneratingTitle && this.titleGenerationFailed == ready.titleGenerationFailed;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.email.hashCode() * 31, 31, this.title), 31, this.description), 31, this.screenshots), 31, this.primaryButtonEnabled), 31, this.isSubmitting);
            String str = this.submitError;
            return Boolean.hashCode(this.titleGenerationFailed) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.diagnosticAttachments.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.diagnosticAttachmentsExpanded), 31, this.isGeneratingTitle);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ready(email=", this.email, ", title=", this.title, ", description=");
            NavAction$$ExternalSyntheticOutline0.m(this.description, ", screenshots=", ", primaryButtonEnabled=", m, this.screenshots);
            re$$ExternalSyntheticOutline0.m(m, this.primaryButtonEnabled, ", isSubmitting=", this.isSubmitting, ", submitError=");
            m.append(this.submitError);
            m.append(", diagnosticAttachments=");
            m.append(this.diagnosticAttachments);
            m.append(", diagnosticAttachmentsExpanded=");
            re$$ExternalSyntheticOutline0.m(m, this.diagnosticAttachmentsExpanded, ", isGeneratingTitle=", this.isGeneratingTitle, ", titleGenerationFailed=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.titleGenerationFailed, ")");
        }
    }

    public final class Success extends BugReportingViewModel {
        public final String identifier;
        public final String message;
        public final String title;
        public final String url;

        public Success(String str, String str2, String str3, String str4) {
            str.getClass();
            this.title = str;
            this.message = str2;
            this.identifier = str3;
            this.url = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.title, success.title) && this.message.equals(success.message) && Intrinsics.areEqual(this.identifier, success.identifier) && Intrinsics.areEqual(this.url, success.url);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
            String str = this.identifier;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.url;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(title=", this.title, ", message=", this.message, ", identifier="), this.identifier, ", url=", this.url, ")");
        }
    }
}
