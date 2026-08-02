package com.squareup.cash.shopping.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.glance.appwidget.IgnoreResultKt;

/* loaded from: classes7.dex */
public final class InjectJavascriptViewModel$InjectJsViewModel extends IgnoreResultKt {
    public final String javascript;
    public final int version;

    public InjectJavascriptViewModel$InjectJsViewModel(String str, int i) {
        this.javascript = str;
        this.version = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InjectJavascriptViewModel$InjectJsViewModel)) {
            return false;
        }
        InjectJavascriptViewModel$InjectJsViewModel injectJavascriptViewModel$InjectJsViewModel = (InjectJavascriptViewModel$InjectJsViewModel) obj;
        return this.javascript.equals(injectJavascriptViewModel$InjectJsViewModel.javascript) && this.version == injectJavascriptViewModel$InjectJsViewModel.version;
    }

    public final int hashCode() {
        return Integer.hashCode(this.version) + (this.javascript.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("InjectJsViewModel(javascript=", this.version, this.javascript, ", version=", ")");
    }
}
