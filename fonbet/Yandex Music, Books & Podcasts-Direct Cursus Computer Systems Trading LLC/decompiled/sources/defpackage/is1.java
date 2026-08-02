package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class is1 {
    public final Object a;
    public final x2i b;
    public final cce c;

    public is1(Object obj, x2i x2iVar, cce cceVar) {
        this.a = obj;
        this.b = x2iVar;
        this.c = cceVar;
    }

    public final boolean equals(Object obj) {
        boolean d;
        if (this != obj) {
            if (obj instanceof is1) {
                is1 is1Var = (is1) obj;
                Object obj2 = is1Var.a;
                this.b.getClass();
                Object obj3 = this.a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof rce) && (obj2 instanceof rce)) {
                        rce rceVar = (rce) obj3;
                        rce rceVar2 = (rce) obj2;
                        if (!Intrinsics.d(rceVar.a, rceVar2.a) || !rceVar.b.equals(rceVar2.b) || !Intrinsics.d(rceVar.e, rceVar2.e) || !Intrinsics.d(rceVar.f, rceVar2.f) || rceVar.g != rceVar2.g || !Intrinsics.d(rceVar.i, rceVar2.i) || !Intrinsics.d(rceVar.k, rceVar2.k) || rceVar.m != rceVar2.m || rceVar.n != rceVar2.n || rceVar.o != rceVar2.o || rceVar.p != rceVar2.p || rceVar.q != rceVar2.q || rceVar.r != rceVar2.r || rceVar.s != rceVar2.s || !rceVar.y.equals(rceVar2.y) || rceVar.z != rceVar2.z || rceVar.h != rceVar2.h || !rceVar.A.equals(rceVar2.A)) {
                            d = false;
                        }
                    } else {
                        d = Intrinsics.d(obj3, obj2);
                    }
                    if (d || !Intrinsics.d(this.c, is1Var.c)) {
                    }
                }
                d = true;
                if (d) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        this.b.getClass();
        Object obj = this.a;
        if (obj instanceof rce) {
            rce rceVar = (rce) obj;
            int hashCode = (rceVar.b.hashCode() + (rceVar.a.hashCode() * 31)) * 961;
            xwh xwhVar = rceVar.e;
            int hashCode2 = (hashCode + (xwhVar != null ? xwhVar.hashCode() : 0)) * 31;
            String str = rceVar.f;
            r2 = rceVar.A.a.hashCode() + ((rceVar.h.hashCode() + ((rceVar.z.hashCode() + ((rceVar.y.hashCode() + ((rceVar.s.hashCode() + ((rceVar.r.hashCode() + ((rceVar.q.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e((k5r.d((rceVar.g.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 961, 31, rceVar.i) + Arrays.hashCode(rceVar.k.a)) * 31, 31, rceVar.m), 31, rceVar.n), 31, rceVar.o), 31, rceVar.p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else if (obj != null) {
            r2 = obj.hashCode();
        }
        return this.c.hashCode() + (r2 * 31);
    }
}
