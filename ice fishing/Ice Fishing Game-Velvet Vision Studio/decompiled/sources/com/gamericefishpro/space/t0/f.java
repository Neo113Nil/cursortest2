package com.gamericefishpro.space.t0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlin.coroutines.f, m2 {
    public static final com.gamericefishpro.space.bb.s e = new com.gamericefishpro.space.bb.s(28);
    public static final /* synthetic */ f i = new f(1);
    public static final f v = new f(2);
    public static final f w = new f(3);
    public static final f y = new f(4);
    public static final f z = new f(5);
    public final /* synthetic */ int d;

    public /* synthetic */ f(int i2) {
        this.d = i2;
    }

    public static final void b(f fVar) {
        com.gamericefishpro.space.si.n0 n0Var;
        Object obj;
        com.gamericefishpro.space.z0.b bVar;
        com.gamericefishpro.space.si.n0 n0Var2 = u1.z;
        do {
            n0Var = u1.z;
            obj = (com.gamericefishpro.space.w0.c) n0Var.getValue();
            bVar = (com.gamericefishpro.space.z0.b) obj;
            com.gamericefishpro.space.y0.b bVarH = bVar.v;
            com.gamericefishpro.space.z0.a aVar = (com.gamericefishpro.space.z0.a) bVarH.get(fVar);
            if (aVar != null) {
                Object obj2 = aVar.a;
                Object obj3 = aVar.b;
                com.gamericefishpro.space.y0.i iVar = bVarH.v;
                com.gamericefishpro.space.y0.i iVarV = iVar.v(fVar != null ? fVar.hashCode() : 0, 0, fVar);
                if (iVar != iVarV) {
                    bVarH = iVarV == null ? com.gamericefishpro.space.y0.b.y : new com.gamericefishpro.space.y0.b(iVarV, bVarH.w - 1);
                }
                com.gamericefishpro.space.a1.b bVar2 = com.gamericefishpro.space.a1.b.a;
                if (obj2 != bVar2) {
                    Object obj4 = bVarH.get(obj2);
                    Intrinsics.b(obj4);
                    bVarH = bVarH.h(obj2, new com.gamericefishpro.space.z0.a(((com.gamericefishpro.space.z0.a) obj4).a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = bVarH.get(obj3);
                    Intrinsics.b(obj5);
                    bVarH = bVarH.h(obj3, new com.gamericefishpro.space.z0.a(obj2, ((com.gamericefishpro.space.z0.a) obj5).b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.e : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.i;
                }
                bVar = new com.gamericefishpro.space.z0.b(obj6, obj2, bVarH);
            }
            if (obj == bVar) {
                return;
            }
            com.gamericefishpro.space.d6.a aVar2 = com.gamericefishpro.space.ti.c.b;
            if (obj == null) {
                obj = aVar2;
            }
        } while (!n0Var.j(obj, bVar));
    }

    @Override // com.gamericefishpro.space.t0.m2
    public boolean a(Object obj, Object obj2) {
        switch (this.d) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return Intrinsics.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.d) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                return super.toString();
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return "StructuralEqualityPolicy";
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return "Empty";
        }
    }
}
