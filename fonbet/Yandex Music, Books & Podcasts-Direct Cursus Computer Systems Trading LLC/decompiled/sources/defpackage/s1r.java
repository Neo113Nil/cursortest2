package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s1r implements jic {
    public final y1r a;
    public final uf7 b;
    public final tm0 c;
    public final cxo d = a.b;

    public s1r(y1r y1rVar, uf7 uf7Var, tm0 tm0Var) {
        this.a = y1rVar;
        this.b = uf7Var;
        this.c = tm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(s1r s1rVar, rwo rwoVar, float f, float f2, p1r p1rVar, cg6 cg6Var) {
        r1r r1rVar;
        int i;
        if (cg6Var instanceof r1r) {
            r1rVar = (r1r) cg6Var;
            int i2 = r1rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1rVar.l = i2 - Integer.MIN_VALUE;
                r1r r1rVar2 = r1rVar;
                Object obj = r1rVar2.j;
                nm6 nm6Var = nm6.a;
                i = r1rVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                        return wdp.J(f, f2, 28);
                    }
                    r1rVar2.l = 1;
                    uf7 uf7Var = s1rVar.b;
                    obj = (Math.abs(ghh.m(uf7Var, 0.0f, f2)) >= Math.abs(f) ? new rp7(uf7Var) : new gao(s1rVar.c)).r(rwoVar, new Float(f), new Float(f2), p1rVar, r1rVar2);
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
                return ((qm0) obj).b;
            }
        }
        r1rVar = new r1r(s1rVar, cg6Var);
        r1r r1rVar22 = r1rVar;
        Object obj2 = r1rVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = r1rVar22.l;
        if (i != 0) {
        }
        return ((qm0) obj2).b;
    }

    @Override // defpackage.jic
    public Object a(rwo rwoVar, float f, cg6 cg6Var) {
        return d(rwoVar, f, rvr.w, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rwo rwoVar, float f, Function1 function1, cg6 cg6Var) {
        o1r o1rVar;
        int i;
        Function1 function12;
        if (cg6Var instanceof o1r) {
            o1rVar = (o1r) cg6Var;
            int i2 = o1rVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1rVar.m = i2 - Integer.MIN_VALUE;
                Object obj = o1rVar.k;
                nm6 nm6Var = nm6.a;
                i = o1rVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    nm7 nm7Var = new nm7(this, f, function1, rwoVar, null);
                    o1rVar.j = function1;
                    o1rVar.m = 1;
                    obj = x97.V(this.d, nm7Var, o1rVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = o1rVar.j;
                    qgg.h0(obj);
                }
                qm0 qm0Var = (qm0) obj;
                function12.invoke(new Float(0.0f));
                return qm0Var;
            }
        }
        o1rVar = new o1r(this, cg6Var);
        Object obj2 = o1rVar.k;
        nm6 nm6Var2 = nm6.a;
        i = o1rVar.m;
        if (i != 0) {
        }
        qm0 qm0Var2 = (qm0) obj2;
        function12.invoke(new Float(0.0f));
        return qm0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(rwo rwoVar, float f, Function1 function1, cg6 cg6Var) {
        q1r q1rVar;
        int i;
        if (cg6Var instanceof q1r) {
            q1rVar = (q1r) cg6Var;
            int i2 = q1rVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1rVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q1rVar.j;
                Object obj2 = nm6.a;
                i = q1rVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    q1rVar.l = 1;
                    obj = c(rwoVar, f, function1, q1rVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                qm0 qm0Var = (qm0) obj;
                return new Float(qm0Var.a.floatValue() != 0.0f ? ((Number) qm0Var.b.a()).floatValue() : 0.0f);
            }
        }
        q1rVar = new q1r(this, cg6Var);
        Object obj3 = q1rVar.j;
        Object obj22 = nm6.a;
        i = q1rVar.l;
        if (i != 0) {
        }
        qm0 qm0Var2 = (qm0) obj3;
        return new Float(qm0Var2.a.floatValue() != 0.0f ? ((Number) qm0Var2.b.a()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1r) {
            s1r s1rVar = (s1r) obj;
            if (Intrinsics.d(s1rVar.c, this.c) && Intrinsics.d(s1rVar.b, this.b) && Intrinsics.d(s1rVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
