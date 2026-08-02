package com.yandex.plus.bdui.flex.utils;

import defpackage.su4;
import defpackage.vz1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public final com.yandex.plus.bdui.shared.b a;
    public final com.yandex.plus.bdui.shared.b b;
    public final Set c;
    public final Set d;

    public d(com.yandex.plus.bdui.shared.b bVar, com.yandex.plus.bdui.shared.b bVar2, Set set, Set set2) {
        bVar.getClass();
        set.getClass();
        set2.getClass();
        this.a = bVar;
        this.b = bVar2;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && this.b.equals(dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + su4.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RenderInfo(shared=");
        sb.append(this.a);
        sb.append(", sharedRendered=");
        sb.append(this.b);
        sb.append(", sharedRenderables=");
        sb.append(this.c);
        sb.append(", contentRenderables=");
        return vz1.v(sb, this.d, ')');
    }
}
