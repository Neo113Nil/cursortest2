package com.google.android.play.core.integrity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;

/* loaded from: classes8.dex */
public final class o {
    public String a;
    public Set b;

    public o(String str, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = set;
    }

    public q build() {
        Set set = this.b;
        if (set != null) {
            return new q(this.a, set);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties: verdictOptOut");
        return null;
    }

    public void setRequestHash(String str) {
        this.a = str;
    }
}
