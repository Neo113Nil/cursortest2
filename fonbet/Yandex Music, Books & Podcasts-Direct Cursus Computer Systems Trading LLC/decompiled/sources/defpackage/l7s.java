package defpackage;

/* loaded from: classes3.dex */
public final class l7s {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public l7s() {
        bdt I = hag.I(k5m.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(sw0.class), true);
        this.c = l18Var.b(hag.I(mh7.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        k7s k7sVar;
        int i;
        qkj qkjVar;
        String str;
        String str2;
        if (cg6Var instanceof k7s) {
            k7sVar = (k7s) cg6Var;
            int i2 = k7sVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k7sVar.n = i2 - Integer.MIN_VALUE;
                Object obj = k7sVar.l;
                nm6 nm6Var = nm6.a;
                i = k7sVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    qkj b = ((k5m) this.a.getValue()).b();
                    sw0 sw0Var = (sw0) this.b.getValue();
                    k7sVar.j = b;
                    k7sVar.k = "music_paywall_screen";
                    k7sVar.n = 1;
                    Object a = ((ww0) sw0Var).a(k7sVar);
                    if (a != nm6Var) {
                        qkjVar = b;
                        obj = a;
                        str = "music_paywall_screen";
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = k7sVar.k;
                qkj qkjVar2 = k7sVar.j;
                qgg.h0(obj);
                str = str3;
                qkjVar = qkjVar2;
                str2 = (String) obj;
                jyr jyrVar = this.c;
                if (str2 == null) {
                    str2 = ((mh7) jyrVar.getValue()).a();
                }
                rkj rkjVar = new rkj(22, str, null, str2, null, ((mh7) jyrVar.getValue()).b());
                k7sVar.j = null;
                k7sVar.k = null;
                k7sVar.n = 2;
                Object a2 = qkjVar.a(rkjVar, k7sVar);
                return a2 != nm6Var ? nm6Var : a2;
            }
        }
        k7sVar = new k7s(this, cg6Var);
        Object obj2 = k7sVar.l;
        nm6 nm6Var2 = nm6.a;
        i = k7sVar.n;
        if (i != 0) {
        }
        str2 = (String) obj2;
        jyr jyrVar2 = this.c;
        if (str2 == null) {
        }
        rkj rkjVar2 = new rkj(22, str, null, str2, null, ((mh7) jyrVar2.getValue()).b());
        k7sVar.j = null;
        k7sVar.k = null;
        k7sVar.n = 2;
        Object a22 = qkjVar.a(rkjVar2, k7sVar);
        if (a22 != nm6Var2) {
        }
    }
}
