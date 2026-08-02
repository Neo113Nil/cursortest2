package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.dfi;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class e2 implements r6 {

    @NotNull
    public static final d2 Companion = new d2();
    public final String a;

    public /* synthetic */ e2(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && Intrinsics.d(this.a, ((e2) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("CloseCurrentWebView(trackId="), this.a, ')');
    }
}
