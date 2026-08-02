package com.yandex.plus.core.templating.render;

import defpackage.ouj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w implements y {
    public final String a;

    public /* synthetic */ w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return Intrinsics.d(this.a, ((w) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "String(value=", this.a);
    }
}
