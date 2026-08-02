package com.yandex.plus.bdui.plus.action.serializer;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();
    public final String a;

    public /* synthetic */ e0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, c0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.a, ((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("SharedDto(sharedActionId="), this.a, ')');
    }
}
