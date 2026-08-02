package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class cmv {
    public final frt a;
    public final rus b;
    public final b8u c;

    public cmv(frt frtVar, rus rusVar, b8u b8uVar) {
        this.a = frtVar;
        this.b = rusVar;
        this.c = b8uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        amv amvVar;
        int i;
        if (cg6Var instanceof amv) {
            amvVar = (amv) cg6Var;
            int i2 = amvVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                amvVar.m = i2 - Integer.MIN_VALUE;
                Object obj = amvVar.k;
                nm6 nm6Var = nm6.a;
                i = amvVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    amvVar.j = str;
                    amvVar.m = 1;
                    obj = this.a.f(amvVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return CollectionsKt.firstOrNull((List) obj);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = amvVar.j;
                    qgg.h0(obj);
                }
                String str2 = ((xxq) obj).a;
                str2.getClass();
                List c = t75.c(str);
                amvVar.j = null;
                amvVar.m = 2;
                obj = this.b.e(amvVar, str2, c);
            }
        }
        amvVar = new amv(this, cg6Var);
        Object obj2 = amvVar.k;
        nm6 nm6Var2 = nm6.a;
        i = amvVar.m;
        if (i != 0) {
        }
        String str22 = ((xxq) obj2).a;
        str22.getClass();
        List c2 = t75.c(str);
        amvVar.j = null;
        amvVar.m = 2;
        obj2 = this.b.e(amvVar, str22, c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        bmv bmvVar;
        int i;
        if (cg6Var instanceof bmv) {
            bmvVar = (bmv) cg6Var;
            int i2 = bmvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bmvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bmvVar.j;
                nm6 nm6Var = nm6.a;
                i = bmvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bmvVar.l = 1;
                    obj = this.c.a(str, bmvVar);
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
                return jf0.F((rj6) obj);
            }
        }
        bmvVar = new bmv(this, cg6Var);
        Object obj2 = bmvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bmvVar.l;
        if (i != 0) {
        }
        return jf0.F((rj6) obj2);
    }
}
