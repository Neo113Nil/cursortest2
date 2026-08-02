package com.squareup.cash.investing.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DiscoveryHeader {
    public final String description;
    public final long id;
    public final String text;

    public DiscoveryHeader(long j, String str, String str2) {
        str.getClass();
        this.id = j;
        this.text = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryHeader)) {
            return false;
        }
        DiscoveryHeader discoveryHeader = (DiscoveryHeader) obj;
        return this.id == discoveryHeader.id && Intrinsics.areEqual(this.text, discoveryHeader.text) && Intrinsics.areEqual(this.description, discoveryHeader.description);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.text);
        String str = this.description;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(re$$ExternalSyntheticOutline0.m("DiscoveryHeader(id=", this.id, ", text=", this.text), ", description=", this.description, ")");
    }
}
