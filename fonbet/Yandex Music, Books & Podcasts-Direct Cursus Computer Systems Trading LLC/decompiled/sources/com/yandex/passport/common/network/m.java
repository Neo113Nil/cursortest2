package com.yandex.passport.common.network;

import defpackage.eg7;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.t9f;

/* loaded from: classes4.dex */
public final class m implements t9f {
    public final /* synthetic */ int a;
    public final t9f b;
    public final mhp c;

    public m(t9f t9fVar, int i) {
        this.a = i;
        t9fVar.getClass();
        switch (i) {
            case 1:
                this.b = t9fVar;
                this.c = t9fVar.getDescriptor();
                break;
            default:
                this.b = t9fVar;
                this.c = t9fVar.getDescriptor();
                break;
        }
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                return new f((h0) this.b.deserialize(eg7Var));
            default:
                eg7Var.getClass();
                return new h(this.b.deserialize(eg7Var));
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        switch (this.a) {
            case 0:
                f fVar = (f) obj;
                l6bVar.getClass();
                fVar.getClass();
                this.b.serialize(l6bVar, fVar.a);
                break;
            default:
                h hVar = (h) obj;
                l6bVar.getClass();
                hVar.getClass();
                this.b.serialize(l6bVar, hVar.a);
                break;
        }
    }
}
