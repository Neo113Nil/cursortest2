package com.squareup.cash.bugreporting.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BugReport {
    public final String description;
    public final DiagnosticAttachments diagnosticAttachments;
    public final List screenshots;
    public final String title;

    public BugReport(String str, String str2, List list, DiagnosticAttachments diagnosticAttachments) {
        list.getClass();
        this.title = str;
        this.description = str2;
        this.screenshots = list;
        this.diagnosticAttachments = diagnosticAttachments;
    }

    public static BugReport copy$default(BugReport bugReport, String str, String str2, List list, DiagnosticAttachments diagnosticAttachments, int i) {
        if ((i & 1) != 0) {
            str = bugReport.title;
        }
        if ((i & 2) != 0) {
            str2 = bugReport.description;
        }
        bugReport.getClass();
        if ((i & 8) != 0) {
            list = bugReport.screenshots;
        }
        if ((i & 16) != 0) {
            diagnosticAttachments = bugReport.diagnosticAttachments;
        }
        bugReport.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        return new BugReport(str, str2, list, diagnosticAttachments);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugReport)) {
            return false;
        }
        BugReport bugReport = (BugReport) obj;
        return this.title.equals(bugReport.title) && this.description.equals(bugReport.description) && Intrinsics.areEqual(this.screenshots, bugReport.screenshots) && this.diagnosticAttachments.equals(bugReport.diagnosticAttachments);
    }

    public final int hashCode() {
        return this.diagnosticAttachments.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 961, this.description), 31, this.screenshots);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BugReport(title=", this.title, ", description=", this.description, ", owner=null, screenshots=");
        m.append(this.screenshots);
        m.append(", diagnosticAttachments=");
        m.append(this.diagnosticAttachments);
        m.append(")");
        return m.toString();
    }
}
