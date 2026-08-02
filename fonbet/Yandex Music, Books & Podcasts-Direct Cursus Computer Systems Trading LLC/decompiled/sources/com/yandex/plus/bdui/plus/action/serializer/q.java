package com.yandex.plus.bdui.plus.action.serializer;

import com.yandex.passport.sloth.command.data.k0;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();
    public static final arf[] c = {btf.a(bwf.b, new k0(29)), null};
    public final com.yandex.plus.bdui.query.e a;
    public final Boolean b;

    public /* synthetic */ q(int i, com.yandex.plus.bdui.query.e eVar, Boolean bool) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o.a.getDescriptor());
            throw null;
        }
        this.a = eVar;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.a, qVar.a) && Intrinsics.d(this.b, qVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NextDocumentDto(documentQuery=");
        sb.append(this.a);
        sb.append(", skipPreview=");
        return com.appsflyer.internal.k.p(sb, this.b, ')');
    }

    public q(com.yandex.plus.bdui.query.e eVar, Boolean bool) {
        eVar.getClass();
        this.a = eVar;
        this.b = bool;
    }
}
