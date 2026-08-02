package defpackage;

import android.net.Uri;

/* loaded from: classes7.dex */
public final class rd81 extends de71 {
    public final /* synthetic */ n171 a;
    public final /* synthetic */ no71 w;
    public final /* synthetic */ mq81 x;

    public rd81(mq81 mq81Var, n171 n171Var, no71 no71Var) {
        this.x = mq81Var;
        this.a = n171Var;
        this.w = no71Var;
    }

    @Override // defpackage.de71
    public final Object b() {
        tn81 tn81Var;
        tn81Var = this.x.b;
        n171 n171Var = this.a;
        bh81 bh81Var = new bh81(n171Var);
        nl81.a.getAndIncrement();
        bh81Var.b = 0L;
        ef71 ef71Var = new ef71(bh81Var, this.w);
        try {
            ef71Var.a.Q(ef71Var.b);
            ef71Var.w = true;
            Uri uri = n171Var.z;
            uri.getClass();
            Object a = tn81Var.a(uri, ef71Var);
            rf71.m(ef71Var);
            return (dh81) a;
        } catch (Throwable th) {
            rf71.m(ef71Var);
            throw th;
        }
    }
}
