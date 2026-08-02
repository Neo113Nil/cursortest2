package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import android.net.Uri;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l4 implements r6 {

    @NotNull
    public static final f4 Companion = new f4();
    public static final arf[] g;
    public final String a;
    public final Uri b;
    public final k4 c;
    public final i4 d;
    public final boolean e;
    public final com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q f;

    static {
        bwf bwfVar = bwf.b;
        g = new arf[]{null, btf.a(bwfVar, new b0(27)), btf.a(bwfVar, new b0(28)), btf.a(bwfVar, new b0(29)), null, null};
    }

    public /* synthetic */ l4(int i, String str, Uri uri, k4 k4Var, i4 i4Var, boolean z, com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar) {
        if (30 != (i & 30)) {
            u7g.V(i, 30, e4.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = uri;
        this.c = k4Var;
        this.d = i4Var;
        this.e = z;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = qVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return Intrinsics.d(this.a, l4Var.a) && Intrinsics.d(this.b, l4Var.b) && this.c == l4Var.c && this.d == l4Var.d && this.e == l4Var.e && Intrinsics.d(this.f, l4Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int e = k5r.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.e);
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.q qVar = this.f;
        return e + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "OpenUrl(trackId=" + this.a + ", url=" + this.b + ", urlType=" + this.c + ", openType=" + this.d + ", needAuth=" + this.e + ", options=" + this.f + ')';
    }
}
