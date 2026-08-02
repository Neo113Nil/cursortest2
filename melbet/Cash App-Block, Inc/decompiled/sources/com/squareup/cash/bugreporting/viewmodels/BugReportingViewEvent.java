package com.squareup.cash.bugreporting.viewmodels;

import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.fileupload.api.UriString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BugReportingViewEvent {

    public final class AddMoreScreenshots extends BugReportingViewEvent {
        public final FilePickerResult result;

        public AddMoreScreenshots(FilePickerResult filePickerResult) {
            filePickerResult.getClass();
            this.result = filePickerResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddMoreScreenshots) && Intrinsics.areEqual(this.result, ((AddMoreScreenshots) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "AddMoreScreenshots(result=" + this.result + ")";
        }
    }

    public final class Continue extends BugReportingViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return 931567159;
        }

        public final String toString() {
            return "Continue";
        }
    }

    public final class DescriptionChanged extends BugReportingViewEvent {
        public final String description;

        public DescriptionChanged(String str) {
            str.getClass();
            this.description = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DescriptionChanged) && Intrinsics.areEqual(this.description, ((DescriptionChanged) obj).description);
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DescriptionChanged(description=", this.description, ")");
        }
    }

    public final class GoBack extends BugReportingViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -171876481;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class OpenTicketUrl extends BugReportingViewEvent {
        public final String url;

        public OpenTicketUrl(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTicketUrl) && this.url.equals(((OpenTicketUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenTicketUrl(url=", this.url, ")");
        }
    }

    public final class RemoveScreenshot extends BugReportingViewEvent {
        public final String uri;

        public RemoveScreenshot(String str) {
            str.getClass();
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveScreenshot) && Intrinsics.areEqual(this.uri, ((RemoveScreenshot) obj).uri);
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoveScreenshot(uri=", UriString.m3554toStringimpl(this.uri), ")");
        }
    }

    public final class ShareTicketUrl extends BugReportingViewEvent {
        public static final ShareTicketUrl INSTANCE = new ShareTicketUrl();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareTicketUrl);
        }

        public final int hashCode() {
            return -577392844;
        }

        public final String toString() {
            return "ShareTicketUrl";
        }
    }

    public final class Submit extends BugReportingViewEvent {
        public final DeviceMetrics deviceMetrics;
        public final DiagnosticContext diagnosticContext;

        public Submit(DeviceMetrics deviceMetrics, DiagnosticContext diagnosticContext) {
            deviceMetrics.getClass();
            this.deviceMetrics = deviceMetrics;
            this.diagnosticContext = diagnosticContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) obj;
            return Intrinsics.areEqual(this.deviceMetrics, submit.deviceMetrics) && Intrinsics.areEqual(this.diagnosticContext, submit.diagnosticContext);
        }

        public final int hashCode() {
            int hashCode = this.deviceMetrics.hashCode() * 31;
            DiagnosticContext diagnosticContext = this.diagnosticContext;
            return hashCode + (diagnosticContext == null ? 0 : diagnosticContext.hashCode());
        }

        public final String toString() {
            return "Submit(deviceMetrics=" + this.deviceMetrics + ", diagnosticContext=" + this.diagnosticContext + ")";
        }
    }

    public final class TitleChanged extends BugReportingViewEvent {
        public final String title;

        public TitleChanged(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TitleChanged) && Intrinsics.areEqual(this.title, ((TitleChanged) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TitleChanged(title=", this.title, ")");
        }
    }

    public final class ToggleAllDiagnosticAttachments extends BugReportingViewEvent {
        public static final ToggleAllDiagnosticAttachments INSTANCE = new ToggleAllDiagnosticAttachments();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleAllDiagnosticAttachments);
        }

        public final int hashCode() {
            return 1137209196;
        }

        public final String toString() {
            return "ToggleAllDiagnosticAttachments";
        }
    }

    public final class ToggleDiagnosticAttachment extends BugReportingViewEvent {
        public final DiagnosticAttachment attachment;

        public ToggleDiagnosticAttachment(DiagnosticAttachment diagnosticAttachment) {
            this.attachment = diagnosticAttachment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleDiagnosticAttachment) && this.attachment == ((ToggleDiagnosticAttachment) obj).attachment;
        }

        public final int hashCode() {
            return this.attachment.hashCode();
        }

        public final String toString() {
            return "ToggleDiagnosticAttachment(attachment=" + this.attachment + ")";
        }
    }

    public final class ToggleDiagnosticAttachmentsExpanded extends BugReportingViewEvent {
        public static final ToggleDiagnosticAttachmentsExpanded INSTANCE = new ToggleDiagnosticAttachmentsExpanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleDiagnosticAttachmentsExpanded);
        }

        public final int hashCode() {
            return -697756962;
        }

        public final String toString() {
            return "ToggleDiagnosticAttachmentsExpanded";
        }
    }
}
