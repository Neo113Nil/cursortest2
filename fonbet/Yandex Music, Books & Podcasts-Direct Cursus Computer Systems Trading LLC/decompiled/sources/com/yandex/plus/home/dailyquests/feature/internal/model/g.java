package com.yandex.plus.home.dailyquests.feature.internal.model;

import android.text.SpannedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public final String a;
    public final SpannedString b;

    public g(String str, SpannedString spannedString) {
        this.a = str;
        this.b = spannedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SpannedString spannedString = this.b;
        return hashCode + (spannedString != null ? spannedString.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarPart(chainIntervalText=" + this.a + ", rewardText=" + ((Object) this.b) + ')';
    }
}
