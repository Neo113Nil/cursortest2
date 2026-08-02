package defpackage;

import defpackage.hmm;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class c1f {
    public final String a;
    public final aur b;
    public final cc7 c;
    public final jyr d;
    public final jyr e;

    /* JADX WARN: Multi-variable type inference failed */
    public c1f(String str, Function1 function1, cc7 cc7Var) {
        cc7Var.getClass();
        this.a = str;
        this.b = (aur) function1;
        this.c = cc7Var;
        this.d = btf.b(new sxd(15));
        this.e = btf.b(new sxd(16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (defpackage.ec7.c(r7, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hmm.a[] aVarArr, cg6 cg6Var) {
        y0f y0fVar;
        int i;
        wb7 wb7Var;
        if (cg6Var instanceof y0f) {
            y0fVar = (y0f) cg6Var;
            int i2 = y0fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = y0fVar.k;
                Object obj2 = nm6.a;
                i = y0fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    y0fVar.j = aVarArr;
                    y0fVar.m = 1;
                    obj = b(y0fVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVarArr = y0fVar.j;
                    qgg.h0(obj);
                }
                wb7Var = (wb7) obj;
                if (wb7Var != null) {
                    return Unit.a;
                }
                lhd lhdVar = new lhd(9, aVarArr);
                y0fVar.j = null;
                y0fVar.m = 2;
            }
        }
        y0fVar = new y0f(this, cg6Var);
        Object obj3 = y0fVar.k;
        Object obj22 = nm6.a;
        i = y0fVar.m;
        if (i != 0) {
        }
        wb7Var = (wb7) obj3;
        if (wb7Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [aur, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        z0f z0fVar;
        int i;
        String str;
        if (continuation instanceof z0f) {
            z0fVar = (z0f) continuation;
            int i2 = z0fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0fVar.l = i2 - Integer.MIN_VALUE;
                Object obj = z0fVar.j;
                nm6 nm6Var = nm6.a;
                i = z0fVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    z0fVar.l = 1;
                    obj = this.b.invoke(z0fVar);
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
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                return ((dc7) this.c).c(str, this.a);
            }
        }
        z0fVar = new z0f(this, continuation);
        Object obj2 = z0fVar.j;
        nm6 nm6Var2 = nm6.a;
        i = z0fVar.l;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    public final x0f c(hmm.a aVar, Class cls) {
        hmm.a aVar2;
        Class cls2;
        aVar.getClass();
        Map map = (Map) this.e.getValue();
        Object obj = map.get(aVar);
        if (obj == null) {
            aVar2 = aVar;
            cls2 = cls;
            x0f x0fVar = new x0f(aVar2, cls2, new a1f(1, 0, c1f.class, this, "getCurrentUserDataStore", "getCurrentUserDataStore(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"), new b1f(this, aVar, null), (d1f) this.d.getValue());
            map.put(aVar2, x0fVar);
            obj = x0fVar;
        } else {
            aVar2 = aVar;
            cls2 = cls;
        }
        x0f x0fVar2 = (x0f) obj;
        Class cls3 = x0fVar2.b;
        if (cls3.equals(cls2)) {
            return x0fVar2;
        }
        throw new IllegalStateException(("ItemsStorage key " + aVar2 + " is already registered for " + cls3 + ", cannot reuse it for " + cls2).toString());
    }
}
