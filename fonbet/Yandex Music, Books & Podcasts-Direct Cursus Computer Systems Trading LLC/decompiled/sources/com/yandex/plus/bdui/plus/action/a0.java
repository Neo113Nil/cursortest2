package com.yandex.plus.bdui.plus.action;

import com.yandex.passport.sloth.command.data.k0;
import defpackage.btf;
import defpackage.jyr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends a implements s {
    public static final jyr f = btf.b(new k0(22));
    public final com.yandex.plus.bdui.action.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.bdui.query.b bVar, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.log.api.b bVar2) {
        super(com.yandex.plus.bdui.query.c.b, fVar, bVar, (y) f.getValue(), bVar2);
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.e = aVar;
    }

    @Override // com.yandex.plus.bdui.plus.action.a
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a0) && super.equals(obj)) {
            return Intrinsics.d(this.e, ((a0) obj).e);
        }
        return false;
    }

    @Override // com.yandex.plus.bdui.plus.action.a
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        com.yandex.plus.bdui.action.a aVar = this.e;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
