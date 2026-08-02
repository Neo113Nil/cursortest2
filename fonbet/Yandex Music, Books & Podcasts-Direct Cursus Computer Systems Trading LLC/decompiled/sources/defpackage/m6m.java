package defpackage;

import com.yandex.passport.api.g;

/* loaded from: classes6.dex */
public final class m6m {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public m6m() {
        bdt I = hag.I(g.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(frt.class), true);
        this.c = l18Var.b(hag.I(cc7.class), true);
        this.d = l18Var.b(hag.I(z66.class), true);
        this.e = btf.b(new hvl(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        l6m l6mVar;
        int i;
        if (cg6Var instanceof l6m) {
            l6mVar = (l6m) cg6Var;
            int i2 = l6mVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6mVar.l = i2 - Integer.MIN_VALUE;
                Object obj = l6mVar.j;
                nm6 nm6Var = nm6.a;
                i = l6mVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    frt frtVar = (frt) this.b.getValue();
                    l6mVar.l = 1;
                    obj = frtVar.k(l6mVar);
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
                yxc yxcVar = (yxc) obj;
                return Boolean.valueOf(yxcVar == null ? yxcVar.h : false);
            }
        }
        l6mVar = new l6m(this, cg6Var);
        Object obj2 = l6mVar.j;
        nm6 nm6Var2 = nm6.a;
        i = l6mVar.l;
        if (i != 0) {
        }
        yxc yxcVar2 = (yxc) obj2;
        return Boolean.valueOf(yxcVar2 == null ? yxcVar2.h : false);
    }
}
