package com.squareup.cash.history.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ReportAbuseViewModel {
    public final Action action;
    public final String actionButtonText;
    public final boolean actionInProgress;
    public final String cancelButtonText;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Action {
        public static final /* synthetic */ Action[] $VALUES;
        public static final Action BLOCK;
        public static final Action UNBLOCK;

        static {
            Action action = new Action("BLOCK", 0);
            BLOCK = action;
            Action action2 = new Action("UNBLOCK", 1);
            UNBLOCK = action2;
            $VALUES = new Action[]{action, action2};
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public ReportAbuseViewModel(String str, String str2, String str3, String str4, Action action, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str2, str3, str4);
        this.title = str;
        this.subtitle = str2;
        this.actionButtonText = str3;
        this.cancelButtonText = str4;
        this.action = action;
        this.actionInProgress = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportAbuseViewModel)) {
            return false;
        }
        ReportAbuseViewModel reportAbuseViewModel = (ReportAbuseViewModel) obj;
        return Intrinsics.areEqual(this.title, reportAbuseViewModel.title) && Intrinsics.areEqual(this.subtitle, reportAbuseViewModel.subtitle) && Intrinsics.areEqual(this.actionButtonText, reportAbuseViewModel.actionButtonText) && Intrinsics.areEqual(this.cancelButtonText, reportAbuseViewModel.cancelButtonText) && this.action == reportAbuseViewModel.action && this.actionInProgress == reportAbuseViewModel.actionInProgress;
    }

    public final int hashCode() {
        String str = this.title;
        return Boolean.hashCode(this.actionInProgress) + ((this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.subtitle), 31, this.actionButtonText), 31, this.cancelButtonText)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReportAbuseViewModel(title=", this.title, ", subtitle=", this.subtitle, ", actionButtonText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.actionButtonText, ", cancelButtonText=", this.cancelButtonText, ", action=");
        m.append(this.action);
        m.append(", actionInProgress=");
        m.append(this.actionInProgress);
        m.append(")");
        return m.toString();
    }
}
