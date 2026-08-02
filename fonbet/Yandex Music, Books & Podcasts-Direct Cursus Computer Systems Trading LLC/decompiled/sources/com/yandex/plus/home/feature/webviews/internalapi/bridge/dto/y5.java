package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class y5 implements r6 {

    @NotNull
    public static final x5 Companion = new x5();
    public static final arf[] c = {null, btf.a(bwf.b, new g4(5))};
    public final String a;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b b;

    public /* synthetic */ y5(int i, String str, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return Intrinsics.d(this.a, y5Var.a) && this.b == y5Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar = this.b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "SuccessScreenShown(trackId=" + this.a + ", offerType=" + this.b + ')';
    }
}
