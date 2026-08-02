package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes5.dex */
public final class bsk extends ceg {
    public final wdg g;
    public zdg h;
    public r76 i;

    public bsk(wdg wdgVar) {
        super(0);
        this.i = r76.d;
        this.g = wdgVar;
    }

    @Override // defpackage.ceg
    public final sgr a(ydg ydgVar) {
        Boolean bool;
        List list = ydgVar.a;
        if (list.isEmpty()) {
            sgr i = sgr.o.i("NameResolver returned no usable address. addrs=" + list + ", attrs=" + ydgVar.b);
            p(i);
            return i;
        }
        Object obj = ydgVar.c;
        if ((obj instanceof zrk) && (bool = ((zrk) obj).a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        zdg zdgVar = this.h;
        if (zdgVar == null) {
            t1f C = ime.C();
            C.U(list);
            ime imeVar = new ime((List) C.b, (xu1) C.c, (Object[][]) C.d);
            wdg wdgVar = this.g;
            zdg K = wdgVar.K(imeVar);
            K.H(new owd(3, this, K));
            this.h = K;
            ask askVar = new ask(xdg.b(K, null));
            r76 r76Var = r76.a;
            this.i = r76Var;
            wdgVar.Z(r76Var, askVar);
            K.D();
        } else {
            zdgVar.Q(list);
        }
        return sgr.e;
    }

    @Override // defpackage.ceg
    public final void p(sgr sgrVar) {
        zdg zdgVar = this.h;
        if (zdgVar != null) {
            zdgVar.F();
            this.h = null;
        }
        ask askVar = new ask(xdg.a(sgrVar));
        r76 r76Var = r76.c;
        this.i = r76Var;
        this.g.Z(r76Var, askVar);
    }

    @Override // defpackage.ceg
    public final void x() {
        zdg zdgVar = this.h;
        if (zdgVar != null) {
            zdgVar.D();
        }
    }

    @Override // defpackage.ceg
    public final void y() {
        zdg zdgVar = this.h;
        if (zdgVar != null) {
            zdgVar.F();
        }
    }
}
