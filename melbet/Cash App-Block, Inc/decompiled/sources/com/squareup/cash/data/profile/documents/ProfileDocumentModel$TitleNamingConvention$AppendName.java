package com.squareup.cash.data.profile.documents;

import com.fillr.browsersdk.model.FillrWidgetFactory;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class ProfileDocumentModel$TitleNamingConvention$AppendName extends FillrWidgetFactory {
    public final String dependentName;

    public ProfileDocumentModel$TitleNamingConvention$AppendName(String str) {
        this.dependentName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileDocumentModel$TitleNamingConvention$AppendName) && this.dependentName.equals(((ProfileDocumentModel$TitleNamingConvention$AppendName) obj).dependentName);
    }

    public final int hashCode() {
        return this.dependentName.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AppendName(dependentName=", this.dependentName, ")");
    }
}
