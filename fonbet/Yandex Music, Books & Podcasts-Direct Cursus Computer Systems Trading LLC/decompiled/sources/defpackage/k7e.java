package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes3.dex */
public final class k7e extends cjq {
    @Override // defpackage.cjq
    public final boolean a(qr1 qr1Var) {
        kzm kzmVar = kzm.b;
        sr1 sr1Var = qr1Var.b;
        sr1Var.getClass();
        String I = sr1Var.c.I(new efo(6, sr1Var).toString());
        byte[] bytes = I.getBytes();
        dt1 dt1Var = qr1Var.e;
        StringUtil.LF.concat(I);
        v7g.S(dt1Var, bytes, new jtc(qr1Var.g, (Object) null));
        es6 es6Var = new es6();
        es6Var.c = qr1Var;
        es6Var.a = new qzc(2, (byte) 0);
        jtc jtcVar = new jtc(8);
        qr1Var.e.c(jtcVar);
        jtcVar.b = es6Var;
        return true;
    }

    @Override // defpackage.cjq
    public final void c(qr1 qr1Var) {
        kzm kzmVar = kzm.b;
        sa7 sa7Var = qr1Var.f.o;
        if (sa7Var instanceof al4) {
            sa7Var.end();
        }
    }
}
