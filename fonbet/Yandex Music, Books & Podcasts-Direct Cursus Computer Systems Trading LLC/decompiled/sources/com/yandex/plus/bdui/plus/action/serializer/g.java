package com.yandex.plus.bdui.plus.action.serializer;

import com.yandex.passport.sloth.command.data.k0;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.q5f;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final arf[] e = {null, null, null, btf.a(bwf.b, new k0(26))};
    public final String a;
    public final String b;
    public final q5f c;
    public final com.yandex.plus.bdui.query.b d;

    public /* synthetic */ g(int i, String str, String str2, q5f q5fVar, com.yandex.plus.bdui.query.b bVar) {
        if (13 != (i & 13)) {
            u7g.V(i, 13, e.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = q5fVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b) && Intrinsics.d(this.c, gVar.c) && Intrinsics.d(this.d, gVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        q5f q5fVar = this.c;
        int hashCode3 = (hashCode2 + (q5fVar == null ? 0 : q5fVar.a.hashCode())) * 31;
        com.yandex.plus.bdui.query.b bVar = this.d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "CloseDto(status=" + this.a + ", fallbackReason=" + this.b + ", data=" + this.c + ", query=" + this.d + ')';
    }

    public g(String str, String str2, q5f q5fVar, com.yandex.plus.bdui.query.b bVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = q5fVar;
        this.d = bVar;
    }
}
