package com.yandex.passport.internal.filter;

import defpackage.eg7;
import defpackage.ekr;
import defpackage.ff7;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.wsd;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m implements t9f {
    public static final m a = new m();
    public static final wsd b;
    public static final mhp c;

    static {
        ff7.N(ekr.a);
        wsd o = ff7.o(tkr.a, u.Companion.serializer());
        b = o;
        c = o.e;
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return (Map) b.deserialize(eg7Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return c;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        Map map = (Map) obj;
        l6bVar.getClass();
        map.getClass();
        b.serialize(l6bVar, map);
    }
}
