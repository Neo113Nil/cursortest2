package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class s3 {

    @NotNull
    public static final r3 Companion = new r3();
    public static final arf[] b = {btf.a(bwf.b, new com.yandex.passport.api.exception.l(26))};
    public final String a;

    public /* synthetic */ s3(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            u7g.V(i, 1, q3.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3) && Intrinsics.d(this.a, ((s3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tag(url=" + ((Object) com.yandex.passport.common.url.b.m(this.a)) + ')';
    }
}
