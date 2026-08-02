package com.datadog.android.rum.internal.domain.scope;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RumScopeKey {
    public final String id;
    public final String name;
    public final String url;

    public RumScopeKey(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.id = str;
        this.url = str2;
        this.name = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumScopeKey)) {
            return false;
        }
        RumScopeKey rumScopeKey = (RumScopeKey) obj;
        return Intrinsics.areEqual(this.id, rumScopeKey.id) && Intrinsics.areEqual(this.url, rumScopeKey.url) && Intrinsics.areEqual(this.name, rumScopeKey.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.url);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RumScopeKey(id=", this.id, ", url=", this.url, ", name="), this.name, ")");
    }
}
