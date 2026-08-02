package defpackage;

import com.yandex.passport.api.h;
import com.yandex.plus.core.locale.b;

/* loaded from: classes3.dex */
public final class j6m implements d6m {
    public final cib a;
    public final z6m b;
    public final hv0 c;
    public final mm6 d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final xdr h;
    public final x0q i;
    public final xdr j;
    public final x0q k;

    public j6m(cib cibVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, z6m z6mVar, hv0 hv0Var) {
        tf6 e = gld.e(dm6.b);
        this.a = cibVar;
        this.b = z6mVar;
        this.c = hv0Var;
        this.d = e;
        this.e = jyrVar;
        this.f = jyrVar2;
        this.g = jyrVar3;
        xdr a = ydr.a(t6m.a);
        this.h = a;
        x0q b = y0q.b(0, 0, null, 7);
        this.i = b;
        this.j = a;
        this.k = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        e6m e6mVar;
        int i;
        h hVar;
        if (cg6Var instanceof e6m) {
            e6mVar = (e6m) cg6Var;
            int i2 = e6mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e6mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = e6mVar.k;
                nm6 nm6Var = nm6.a;
                i = e6mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    h hVar2 = (h) ((hvl) this.a.b).invoke();
                    frt frtVar = (frt) this.f.getValue();
                    e6mVar.j = hVar2;
                    e6mVar.m = 1;
                    Object f = frtVar.f(e6mVar);
                    if (f == nm6Var) {
                        return nm6Var;
                    }
                    hVar = hVar2;
                    obj = f;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar = e6mVar.j;
                    qgg.h0(obj);
                }
                return b.d(hVar, Long.parseLong(((xxq) obj).a));
            }
        }
        e6mVar = new e6m(this, cg6Var);
        Object obj2 = e6mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = e6mVar.m;
        if (i != 0) {
        }
        return b.d(hVar, Long.parseLong(((xxq) obj2).a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        f6m f6mVar;
        Object obj;
        int i;
        if (cg6Var instanceof f6m) {
            f6mVar = (f6m) cg6Var;
            int i2 = f6mVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f6mVar.l = i2 - Integer.MIN_VALUE;
                obj = f6mVar.j;
                nm6 nm6Var = nm6.a;
                i = f6mVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    jyr jyrVar = p6m.f;
                    if (o6m.c()) {
                        f6mVar.l = 1;
                        obj = this.c.invoke(f6mVar);
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    f6mVar.l = 2;
                    Object a = this.b.a(f6mVar);
                    return a == nm6Var ? nm6Var : a;
                }
                return Boolean.FALSE;
            }
        }
        f6mVar = new f6m(this, cg6Var);
        obj = f6mVar.j;
        nm6 nm6Var2 = nm6.a;
        i = f6mVar.l;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boolean.FALSE;
    }
}
