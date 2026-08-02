package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements com.yandex.plus.bdui.plus.content.c {
    public final String a;
    public final boolean b;

    public c(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.a, cVar.a) && this.b == cVar.b;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final String getName() {
        return this.a;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final Object getValue() {
        return Boolean.valueOf(this.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBooleanParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return dfi.j(sb, this.b, ')');
    }
}
