package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wc {
    public final String a;
    public final rf b;
    public final me c;

    public wc(String str, rf rfVar, me meVar) {
        str.getClass();
        this.a = str;
        this.b = rfVar;
        this.c = meVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return Intrinsics.d(this.a, wcVar.a) && Intrinsics.d(this.b, wcVar.b) && Intrinsics.d(this.c, wcVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rf rfVar = this.b;
        int hashCode2 = (hashCode + (rfVar == null ? 0 : rfVar.hashCode())) * 31;
        me meVar = this.c;
        return hashCode2 + (meVar != null ? meVar.hashCode() : 0);
    }

    public final String toString() {
        return "Notification(__typename=" + this.a + ", plaqueIconNotification=" + this.b + ", plaqueCounterNotification=" + this.c + ')';
    }
}
