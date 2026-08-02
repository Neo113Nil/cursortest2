package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class GlobalSettings {
    public final String header;
    public final List rows;
    public final String subtitle;

    public GlobalSettings(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        this.header = str;
        this.subtitle = str2;
        this.rows = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSettings)) {
            return false;
        }
        GlobalSettings globalSettings = (GlobalSettings) obj;
        return Intrinsics.areEqual(this.header, globalSettings.header) && this.subtitle.equals(globalSettings.subtitle) && Intrinsics.areEqual(this.rows, globalSettings.rows);
    }

    public final int hashCode() {
        return this.rows.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GlobalSettings(header=", this.header, ", subtitle=", this.subtitle, ", rows="), this.rows, ")");
    }
}
