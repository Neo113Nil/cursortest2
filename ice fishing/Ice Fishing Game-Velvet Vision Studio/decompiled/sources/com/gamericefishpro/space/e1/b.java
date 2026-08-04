package com.gamericefishpro.space.e1;

import com.gamericefishpro.space.f1.q;
import com.gamericefishpro.space.t0.x1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements x1 {
    public j d;
    public f e;
    public String i;
    public Object v;
    public Object[] w;
    public e y;
    public final com.gamericefishpro.space.a3.b z = new com.gamericefishpro.space.a3.b(2, this);

    public b(j jVar, f fVar, String str, Object obj, Object[] objArr) {
        this.d = jVar;
        this.e = fVar;
        this.i = str;
        this.v = obj;
        this.w = objArr;
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void a() {
        b();
    }

    public final void b() {
        String strA;
        f fVar = this.e;
        if (this.y != null) {
            throw new IllegalArgumentException(("entry(" + this.y + ") is not null").toString());
        }
        if (fVar != null) {
            com.gamericefishpro.space.a3.b bVar = this.z;
            Object objInvoke = bVar.invoke();
            if (objInvoke == null || fVar.c(objInvoke)) {
                this.y = fVar.f(this.i, bVar);
                return;
            }
            if (objInvoke instanceof q) {
                q qVar = (q) objInvoke;
                if (qVar.a() == com.gamericefishpro.space.t0.f.v || qVar.a() == com.gamericefishpro.space.t0.f.z || qVar.a() == com.gamericefishpro.space.t0.f.w) {
                    strA = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = k.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void d() {
        e eVar = this.y;
        if (eVar != null) {
            ((com.gamericefishpro.space.a8.c) eVar).J();
        }
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void e() {
        e eVar = this.y;
        if (eVar != null) {
            ((com.gamericefishpro.space.a8.c) eVar).J();
        }
    }
}
