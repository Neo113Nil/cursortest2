package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class jy5 extends xmm {
    public final rmb d;
    public final o e;
    public final by5 f;
    public final thj g;
    public final xdr h;

    public jy5(String str, s63 s63Var, rmb rmbVar, o oVar) {
        str.getClass();
        this.d = rmbVar;
        this.e = oVar;
        this.f = (by5) s63Var.a;
        thj thjVar = new thj(pkb.Concert, str, 1, 1, "");
        this.g = thjVar;
        this.h = ydr.a(new py5(false, thjVar));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.f;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof qy5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        iy5 iy5Var;
        int i;
        rj6 rj6Var;
        ArrayList arrayList;
        if (cg6Var instanceof iy5) {
            iy5Var = (iy5) cg6Var;
            int i2 = iy5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iy5Var.l = i2 - Integer.MIN_VALUE;
                Object obj = iy5Var.j;
                nm6 nm6Var = nm6.a;
                i = iy5Var.l;
                by5 by5Var = this.f;
                thj thjVar = this.g;
                xdr xdrVar = this.h;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        py5 py5Var = new py5(true, thjVar);
                        xdrVar.getClass();
                        xdrVar.m(null, py5Var);
                    }
                    iy5Var.l = 1;
                    obj = this.e.a(by5Var, z, iy5Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        py5 py5Var2 = new py5(false, thjVar);
                        xdrVar.getClass();
                        xdrVar.m(null, py5Var2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(by5Var);
                }
                zx5 zx5Var = (zx5) ((qj6) rj6Var).a;
                String str = zx5Var.a;
                ly5 ly5Var = zx5Var.e;
                String str2 = zx5Var.b;
                String str3 = zx5Var.c;
                if ((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0)) {
                    str2 = null;
                } else if (str2 == null || str2.length() == 0) {
                    str2 = str3;
                } else if (str3 != null && str3.length() != 0) {
                    str2 = ouj.o(str2, ", ", str3);
                }
                List<f5i> list = zx5Var.d;
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (f5i f5iVar : list) {
                        String str4 = f5iVar.a;
                        Object obj2 = hashMap.get(str4);
                        if (obj2 == null) {
                            ArrayList arrayList2 = new ArrayList();
                            hashMap.put(str4, arrayList2);
                            obj2 = arrayList2;
                        }
                        ((ArrayList) obj2).add(Integer.valueOf(f5iVar.b));
                    }
                    ArrayList arrayList3 = new ArrayList(hashMap.size());
                    for (Map.Entry entry : hashMap.entrySet()) {
                        arrayList3.add(new g5i((String) entry.getKey(), (ArrayList) entry.getValue()));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                qy5 qy5Var = new qy5(new oy5(str, str2, arrayList, ly5Var != null ? c.r(ly5Var.a, "%%", "1000,500", false) : null, ly5Var != null ? ly5Var.b : null), thjVar);
                xdrVar.getClass();
                xdrVar.m(null, qy5Var);
                rmb.h(this.d, 1, 2);
                return new d73(by5Var);
            }
        }
        iy5Var = new iy5(this, cg6Var);
        Object obj3 = iy5Var.j;
        nm6 nm6Var2 = nm6.a;
        i = iy5Var.l;
        by5 by5Var2 = this.f;
        thj thjVar2 = this.g;
        xdr xdrVar2 = this.h;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (rj6Var instanceof qj6) {
        }
    }
}
