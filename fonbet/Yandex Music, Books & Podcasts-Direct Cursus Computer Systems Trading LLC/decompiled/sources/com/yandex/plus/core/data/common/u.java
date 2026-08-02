package com.yandex.plus.core.data.common;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class u {
    @NotNull
    public final <T> t9f serializer(@NotNull final t9f t9fVar) {
        t9fVar.getClass();
        return new p3d(t9fVar) { // from class: com.yandex.plus.core.data.common.t
            public final /* synthetic */ t9f a;

            @NotNull
            private final mhp descriptor;

            {
                t9fVar.getClass();
                j5m j5mVar = new j5m("com.yandex.plus.core.data.common.PlusThemedColor", this, 2);
                j5mVar.k("light", false);
                j5mVar.k("dark", false);
                this.descriptor = j5mVar;
                this.a = t9fVar;
            }

            @Override // defpackage.p3d
            public final t9f[] childSerializers() {
                t9f t9fVar2 = this.a;
                return new t9f[]{ff7.C(t9fVar2), ff7.C(t9fVar2)};
            }

            @Override // defpackage.t9f
            public final Object deserialize(eg7 eg7Var) {
                int i;
                k kVar;
                k kVar2;
                eg7Var.getClass();
                mhp mhpVar = this.descriptor;
                tq5 c = eg7Var.c(mhpVar);
                boolean m = c.m();
                t9f t9fVar2 = this.a;
                k kVar3 = null;
                if (m) {
                    t9f t9fVar3 = t9fVar2;
                    kVar = (k) c.n(mhpVar, 0, t9fVar3, null);
                    kVar2 = (k) c.n(mhpVar, 1, t9fVar3, null);
                    i = 3;
                } else {
                    boolean z = true;
                    int i2 = 0;
                    k kVar4 = null;
                    while (z) {
                        int w = c.w(mhpVar);
                        if (w == -1) {
                            z = false;
                        } else if (w == 0) {
                            kVar3 = (k) c.n(mhpVar, 0, t9fVar2, kVar3);
                            i2 |= 1;
                        } else {
                            if (w != 1) {
                                l1j.g(w);
                                return null;
                            }
                            kVar4 = (k) c.n(mhpVar, 1, t9fVar2, kVar4);
                            i2 |= 2;
                        }
                    }
                    i = i2;
                    kVar = kVar3;
                    kVar2 = kVar4;
                }
                c.b(mhpVar);
                return new v(i, kVar, kVar2);
            }

            @Override // defpackage.t9f
            public final mhp getDescriptor() {
                return this.descriptor;
            }

            @Override // defpackage.t9f
            public final void serialize(l6b l6bVar, Object obj) {
                v vVar = (v) obj;
                l6bVar.getClass();
                vVar.getClass();
                mhp mhpVar = this.descriptor;
                wq5 c = l6bVar.c(mhpVar);
                t9f t9fVar2 = this.a;
                c.q(mhpVar, 0, t9fVar2, vVar.a);
                c.q(mhpVar, 1, t9fVar2, vVar.b);
                c.b(mhpVar);
            }

            @Override // defpackage.p3d
            public final t9f[] typeParametersSerializers() {
                return new t9f[]{this.a};
            }
        };
    }
}
