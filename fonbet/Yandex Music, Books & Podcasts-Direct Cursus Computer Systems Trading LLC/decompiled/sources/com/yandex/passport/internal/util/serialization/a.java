package com.yandex.passport.internal.util.serialization;

import com.yandex.passport.common.core.b;
import defpackage.avf;
import defpackage.csm;
import defpackage.eg7;
import defpackage.gsm;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.t9f;

/* loaded from: classes4.dex */
public final class a implements t9f {
    public static final a a = new a();
    public static final gsm b = avf.g("Environment", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        com.yandex.passport.common.core.a aVar = b.b;
        int h = eg7Var.h();
        aVar.getClass();
        return com.yandex.passport.common.core.a.b(h);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b bVar = (b) obj;
        l6bVar.getClass();
        bVar.getClass();
        l6bVar.C(bVar.a);
    }
}
