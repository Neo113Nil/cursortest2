package com.squareup.cash.fillr.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class FillrWebManager$FillrVersions {
    public final String widgetVersion;

    public FillrWebManager$FillrVersions(String str) {
        str.getClass();
        this.widgetVersion = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FillrWebManager$FillrVersions) && Intrinsics.areEqual(this.widgetVersion, ((FillrWebManager$FillrVersions) obj).widgetVersion);
    }

    public final int hashCode() {
        return (this.widgetVersion.hashCode() * 31) + 1449500838;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FillrVersions(widgetVersion=", this.widgetVersion, ", sdkVersion=11.2.0)");
    }
}
