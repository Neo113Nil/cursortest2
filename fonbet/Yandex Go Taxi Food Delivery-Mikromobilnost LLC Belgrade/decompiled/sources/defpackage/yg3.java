package defpackage;

import android.util.Rational;
import java.util.List;

/* loaded from: classes10.dex */
public final class yg3 implements vhw0 {
    public final n34 a;
    public final jzn b;
    public final Rational c;

    public yg3(n34 n34Var, jzn jznVar, Rational rational) {
        this.a = n34Var;
        this.b = jznVar;
        this.c = rational;
    }

    @Override // defpackage.vhw0
    public final Object get() {
        n34 n34Var = this.a;
        int i = n34Var.c;
        if (i == -1) {
            sgb1.g(3, "AudioConfigUtil");
            i = 5;
        } else {
            sgb1.g(3, "AudioConfigUtil");
        }
        int i2 = n34Var.b;
        if (i2 == -1) {
            sgb1.g(3, "AudioConfigUtil");
            i2 = 2;
        } else {
            sgb1.g(3, "AudioConfigUtil");
        }
        int i3 = n34Var.e;
        jzn jznVar = this.b;
        int b = jznVar.b();
        if (i3 == -1) {
            sgb1.g(3, "AudioSrcAdPrflRslvr");
            i3 = b;
        } else {
            sgb1.g(3, "AudioSrcAdPrflRslvr");
        }
        t38 a = bf3.a(n34Var.d, jznVar.f(), i3, i2, this.c);
        sgb1.g(3, "AudioSrcAdPrflRslvr");
        List list = m34.f;
        bc bcVar = new bc();
        bcVar.a = -1;
        bcVar.b = -1;
        bcVar.c = -1;
        bcVar.w = -1;
        bcVar.x = -1;
        bcVar.a = Integer.valueOf(i);
        bcVar.x = Integer.valueOf(i2);
        bcVar.w = Integer.valueOf(i3);
        bcVar.b = Integer.valueOf(a.a);
        bcVar.c = Integer.valueOf(a.b);
        return bcVar.b();
    }
}
