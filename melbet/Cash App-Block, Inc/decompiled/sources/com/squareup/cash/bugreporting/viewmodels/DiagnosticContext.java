package com.squareup.cash.bugreporting.viewmodels;

import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class DiagnosticContext {
    public final View contentRootView;
    public final Activity context;

    public DiagnosticContext(Activity activity, View view) {
        this.context = activity;
        this.contentRootView = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiagnosticContext)) {
            return false;
        }
        DiagnosticContext diagnosticContext = (DiagnosticContext) obj;
        return this.context.equals(diagnosticContext.context) && Intrinsics.areEqual(this.contentRootView, diagnosticContext.contentRootView);
    }

    public final int hashCode() {
        int hashCode = this.context.hashCode() * 31;
        View view = this.contentRootView;
        return hashCode + (view == null ? 0 : view.hashCode());
    }

    public final String toString() {
        return "DiagnosticContext(context=" + this.context + ", contentRootView=" + this.contentRootView + ")";
    }
}
