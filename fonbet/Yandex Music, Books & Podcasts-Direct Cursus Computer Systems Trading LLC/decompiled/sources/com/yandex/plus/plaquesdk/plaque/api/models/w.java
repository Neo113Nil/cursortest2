package com.yandex.plus.plaquesdk.plaque.api.models;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {
    public final CharSequence a;
    public final l b;

    public w(CharSequence charSequence, l lVar) {
        charSequence.getClass();
        lVar.getClass();
        this.a = charSequence;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.b, wVar.b) && Intrinsics.d(this.a.toString(), wVar.a.toString());
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
