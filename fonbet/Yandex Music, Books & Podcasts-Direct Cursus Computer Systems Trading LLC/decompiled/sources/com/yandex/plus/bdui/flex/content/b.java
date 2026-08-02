package com.yandex.plus.bdui.flex.content;

import com.yandex.plus.bdui.flex.factory.m;
import defpackage.btf;
import defpackage.eg7;
import defpackage.jyr;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.t9f;

/* loaded from: classes4.dex */
public final class b implements t9f {
    public final /* synthetic */ int a = 0;
    public final jyr b;

    public b(com.yandex.plus.bdui.flex.factory.b bVar) {
        this.b = btf.b(bVar);
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                return new a((com.yandex.plus.bdui.content.a) ((t9f) this.b.getValue()).deserialize(eg7Var));
            default:
                eg7Var.getClass();
                return new com.yandex.plus.bdui.flex.scaffold.a((com.yandex.plus.bdui.plus.scaffold.a) ((t9f) this.b.getValue()).deserialize(eg7Var));
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
        }
        return ((t9f) this.b.getValue()).getDescriptor();
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                l6bVar.getClass();
                aVar.getClass();
                ((t9f) this.b.getValue()).serialize(l6bVar, aVar.a);
                break;
            default:
                com.yandex.plus.bdui.flex.scaffold.a aVar2 = (com.yandex.plus.bdui.flex.scaffold.a) obj;
                l6bVar.getClass();
                aVar2.getClass();
                ((t9f) this.b.getValue()).serialize(l6bVar, aVar2.a);
                break;
        }
    }

    public b(m mVar) {
        this.b = btf.b(mVar);
    }
}
