package defpackage;

import android.content.res.Resources;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class mk3 extends bfu {
    public final ix6 k;
    public final xdr l;
    public final fkn m;

    public mk3(frt frtVar, xrt xrtVar, Resources resources, ix6 ix6Var, r93 r93Var) {
        resources.getClass();
        this.k = ix6Var;
        String string = resources.getString(R.string.authorize_btn);
        string.getClass();
        xdr a = ydr.a(new kk3(string));
        this.l = a;
        this.m = new fkn(a);
        if (((Boolean) r93Var.invoke()).booleanValue()) {
            ox6.B(frtVar.d(), ot0.F(this), new gl(16, this, resources));
        } else {
            ox6.B(zsd.b0(frtVar.g()), ot0.F(this), new tl0(7, this, xrtVar, resources));
        }
        x97.y(ot0.F(this), null, null, new lk3(xrtVar, null, 0), 3);
    }
}
