package defpackage;

/* loaded from: classes3.dex */
public final class xwc {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public xwc(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
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
        wwc wwcVar;
        int i;
        qkj qkjVar;
        String str;
        String str2;
        if (cg6Var instanceof wwc) {
            wwcVar = (wwc) cg6Var;
            int i2 = wwcVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wwcVar.n = i2 - Integer.MIN_VALUE;
                Object obj = wwcVar.l;
                nm6 nm6Var = nm6.a;
                i = wwcVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    qkj b = ((k5m) this.a.getValue()).b();
                    sw0 sw0Var = (sw0) this.b.getValue();
                    wwcVar.j = b;
                    wwcVar.k = "music_freemium_banner";
                    wwcVar.n = 1;
                    Object a = ((ww0) sw0Var).a(wwcVar);
                    if (a != nm6Var) {
                        qkjVar = b;
                        obj = a;
                        str = "music_freemium_banner";
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
                String str3 = wwcVar.k;
                qkj qkjVar2 = wwcVar.j;
                qgg.h0(obj);
                str = str3;
                qkjVar = qkjVar2;
                str2 = (String) obj;
                jyr jyrVar = this.c;
                if (str2 == null) {
                    str2 = ((mh7) jyrVar.getValue()).a();
                }
                rkj rkjVar = new rkj(22, str, null, str2, null, ((mh7) jyrVar.getValue()).b());
                wwcVar.j = null;
                wwcVar.k = null;
                wwcVar.n = 2;
                Object a2 = qkjVar.a(rkjVar, wwcVar);
                return a2 != nm6Var ? nm6Var : a2;
            }
        }
        wwcVar = new wwc(this, cg6Var);
        Object obj2 = wwcVar.l;
        nm6 nm6Var2 = nm6.a;
        i = wwcVar.n;
        if (i != 0) {
        }
        str2 = (String) obj2;
        jyr jyrVar2 = this.c;
        if (str2 == null) {
        }
        rkj rkjVar2 = new rkj(22, str, null, str2, null, ((mh7) jyrVar2.getValue()).b());
        wwcVar.j = null;
        wwcVar.k = null;
        wwcVar.n = 2;
        Object a22 = qkjVar.a(rkjVar2, wwcVar);
        if (a22 != nm6Var2) {
        }
    }
}
