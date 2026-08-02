package com.yandex.passport.sloth.command.data;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();
    public static final arf[] b = {btf.a(bwf.b, new k0(0))};
    public final String a;

    public /* synthetic */ n0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, l0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        boolean d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        String str = ((n0) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                d = true;
            }
            d = false;
        } else {
            if (str != null) {
                d = Intrinsics.d(str2, str);
            }
            d = false;
        }
        return d;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SamlSsoAuthData(authUrl=");
        String str = this.a;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.common.url.b.m(str)));
        sb.append(')');
        return sb.toString();
    }
}
