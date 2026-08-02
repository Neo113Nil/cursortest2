package com.yandex.plus.bdui.plus.action;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements x {
    public final com.yandex.plus.core.templating.render.z a;

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return Intrinsics.d(this.a, ((v) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Renderable(renderable=" + this.a + ')';
    }
}
