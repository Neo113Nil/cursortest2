package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ob {
    public final mb a;
    public final nb b;

    public ob(mb mbVar, nb nbVar) {
        this.a = mbVar;
        this.b = nbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return Intrinsics.d(this.a, obVar.a) && Intrinsics.d(this.b, obVar.b);
    }

    public final int hashCode() {
        mb mbVar = this.a;
        int hashCode = (mbVar == null ? 0 : mbVar.hashCode()) * 31;
        nb nbVar = this.b;
        return hashCode + (nbVar != null ? nbVar.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentButtonAsset(badgeText=" + this.a + ", subtitleText=" + this.b + ')';
    }
}
