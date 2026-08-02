package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.overlays.OverlaysKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Header$Avatar$Url extends OverlaysKt {
    public final String url;

    public Header$Avatar$Url(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Header$Avatar$Url) && Intrinsics.areEqual(this.url, ((Header$Avatar$Url) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(url=", this.url, ")");
    }
}
