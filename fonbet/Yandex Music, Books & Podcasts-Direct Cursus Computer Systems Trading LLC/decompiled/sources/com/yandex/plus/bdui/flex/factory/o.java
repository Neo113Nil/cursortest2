package com.yandex.plus.bdui.flex.factory;

import defpackage.avf;
import defpackage.c5b;
import defpackage.eg7;
import defpackage.ern;
import defpackage.l6b;
import defpackage.md;
import defpackage.mhp;
import defpackage.ohp;
import defpackage.pg;
import defpackage.t5a;
import defpackage.t9f;
import defpackage.xq0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class o implements t9f {
    public final /* synthetic */ int a;
    public final ohp b;

    public o(com.yandex.plus.bdui.flex.utils.b bVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = avf.w("com.yandex.plus.bdui.action.Action", new mhp[0]);
                break;
            case 2:
                this.b = avf.w("com.yandex.plus.bdui.query.DocumentQuery", new mhp[0]);
                break;
            default:
                this.b = avf.w("com.yandex.plus.bdui.query.ActionQuery", new mhp[0]);
                break;
        }
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        pg pgVar;
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                t9f b = eg7Var.a().b(ern.a(pg.class), c5b.a);
                if (b != null && (pgVar = (pg) eg7Var.e(b)) != null) {
                    String str = pgVar.a;
                    Map map = pgVar.b;
                    Map map2 = pgVar.c;
                    str.getClass();
                    map.getClass();
                    break;
                } else {
                    xq0.q("flex.core.action.remote.ActionQuery deserializer not found!");
                    break;
                }
            case 1:
                eg7Var.getClass();
                t9f b2 = eg7Var.a().b(ern.a(md.class), c5b.a);
                if (b2 != null && (r4 = (md) eg7Var.e(b2)) != null) {
                    break;
                } else {
                    xq0.q("flex.core.model.Action deserializer not found!");
                    break;
                }
                break;
            default:
                eg7Var.getClass();
                t9f b3 = eg7Var.a().b(ern.a(t5a.class), c5b.a);
                if (b3 != null && (r4 = (t5a) eg7Var.e(b3)) != null) {
                    break;
                } else {
                    xq0.q("flex.core.query.DocumentQuery deserializer not found!");
                    break;
                }
                break;
        }
        return null;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        Object eVar;
        switch (this.a) {
            case 0:
                com.yandex.plus.bdui.query.b bVar = (com.yandex.plus.bdui.query.b) obj;
                l6bVar.getClass();
                bVar.getClass();
                t9f b = l6bVar.a().b(ern.a(pg.class), c5b.a);
                if (b == null) {
                    xq0.q("flex.core.action.remote.ActionQuery serializer not found!");
                    break;
                } else {
                    l6bVar.v(b, new pg(bVar.a, bVar.b, bVar.c));
                    break;
                }
            case 1:
                com.yandex.plus.bdui.action.a aVar = (com.yandex.plus.bdui.action.a) obj;
                l6bVar.getClass();
                aVar.getClass();
                t9f b2 = l6bVar.a().b(ern.a(md.class), c5b.a);
                if (b2 == null) {
                    xq0.q("flex.core.model.Action serializer not found!");
                    break;
                } else {
                    com.yandex.plus.bdui.flex.action.j jVar = aVar instanceof com.yandex.plus.bdui.flex.action.j ? (com.yandex.plus.bdui.flex.action.j) aVar : null;
                    if (jVar == null || (eVar = jVar.a) == null) {
                        eVar = new com.yandex.plus.bdui.flex.action.e(aVar, null);
                    }
                    l6bVar.v(b2, eVar);
                    break;
                }
                break;
            default:
                com.yandex.plus.bdui.query.e eVar2 = (com.yandex.plus.bdui.query.e) obj;
                l6bVar.getClass();
                eVar2.getClass();
                t9f b3 = l6bVar.a().b(ern.a(t5a.class), c5b.a);
                if (b3 == null) {
                    xq0.q("flex.core.query.DocumentQuery serializer not found!");
                    break;
                } else {
                    l6bVar.v(b3, new t5a(eVar2.a, eVar2.b, eVar2.c));
                    break;
                }
        }
    }
}
