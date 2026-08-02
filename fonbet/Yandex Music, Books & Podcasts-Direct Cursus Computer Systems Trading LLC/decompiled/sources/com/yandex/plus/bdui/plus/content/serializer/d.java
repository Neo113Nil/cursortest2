package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements com.yandex.plus.bdui.plus.content.d {
    public final String a;
    public final int b;

    public d(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && this.b == dVar.b;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final String getName() {
        return this.a;
    }

    @Override // com.yandex.plus.bdui.plus.content.g
    public final Object getValue() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleColorParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return vz1.r(sb, this.b, ')');
    }
}
