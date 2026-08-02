package defpackage;

import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public class s8x extends c implements jyc {
    public final boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8x(l8x l8xVar) {
        super(true);
        boolean z = true;
        Q(l8xVar);
        hpb M = M();
        ipb ipbVar = M instanceof ipb ? (ipb) M : null;
        if (ipbVar != null) {
            c cVar = ipbVar.z;
            cVar = cVar == null ? null : cVar;
            if (cVar != null) {
                while (!cVar.G()) {
                    hpb M2 = cVar.M();
                    ipb ipbVar2 = M2 instanceof ipb ? (ipb) M2 : null;
                    if (ipbVar2 != null) {
                        cVar = ipbVar2.z;
                        if (cVar == null) {
                            cVar = null;
                        }
                        if (cVar == null) {
                        }
                    }
                }
                this.x = z;
            }
        }
        z = false;
        this.x = z;
    }

    @Override // kotlinx.coroutines.c
    public final boolean G() {
        return this.x;
    }

    @Override // kotlinx.coroutines.c
    public final boolean J() {
        return true;
    }

    public final boolean j0() {
        return T(zy11.a);
    }
}
