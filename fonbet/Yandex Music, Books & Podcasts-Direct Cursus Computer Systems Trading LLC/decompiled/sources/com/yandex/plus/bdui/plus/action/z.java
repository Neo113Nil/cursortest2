package com.yandex.plus.bdui.plus.action;

import com.yandex.passport.sloth.command.data.k0;
import defpackage.btf;
import defpackage.jyr;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class z extends a implements s {
    public static final jyr f = btf.b(new k0(21));
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.bdui.query.e eVar, boolean z, com.yandex.plus.log.api.b bVar) {
        super(com.yandex.plus.bdui.query.c.c, fVar, eVar, (y) f.getValue(), bVar);
        fVar.getClass();
        eVar.getClass();
        bVar.getClass();
        this.e = z;
    }

    @Override // com.yandex.plus.bdui.plus.action.a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && super.equals(obj)) {
            return this.e == ((z) obj).e;
        }
        return false;
    }

    @Override // com.yandex.plus.bdui.plus.action.a
    public final int hashCode() {
        return k5r.e(super.hashCode() * 31, 31, this.e);
    }
}
