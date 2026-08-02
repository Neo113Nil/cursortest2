package defpackage;

import com.yandex.media.ynison.service.e0;

/* loaded from: classes3.dex */
public final class b7o {
    public final wmg a;
    public final cbn b;

    public b7o(wmg wmgVar, cbn cbnVar) {
        this.a = wmgVar;
        this.b = cbnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (r9.l() <= 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        a7o a7oVar;
        int i;
        e0 e0Var;
        if (cg6Var instanceof a7o) {
            a7oVar = (a7o) cg6Var;
            int i2 = a7oVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a7oVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a7oVar.j;
                nm6 nm6Var = nm6.a;
                i = a7oVar.l;
                boolean z = false;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = this.b.a().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal == 4) {
                                        a7oVar.l = 1;
                                        obj = x97.V(dm6.b, new fcn(this.a.a, null, 0), a7oVar);
                                        if (obj == nm6Var) {
                                            return nm6Var;
                                        }
                                    } else if (ordinal != 5) {
                                        b6e.s();
                                        return null;
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                e0Var = (e0) obj;
                if (e0Var != null) {
                }
                return Boolean.valueOf(z);
            }
        }
        a7oVar = new a7o(this, cg6Var);
        Object obj2 = a7oVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a7oVar.l;
        boolean z2 = false;
        if (i != 0) {
        }
        e0Var = (e0) obj2;
        if (e0Var != null) {
        }
        return Boolean.valueOf(z2);
    }
}
