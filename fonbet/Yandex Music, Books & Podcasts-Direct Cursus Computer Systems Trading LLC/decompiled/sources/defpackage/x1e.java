package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.y;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class x1e {
    public final jnb a;
    public final kpj b;
    public final Context c;
    public final y d;
    public final qyf e;
    public final kxi f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final ybf j;
    public final jyr k;
    public qvk l;

    public x1e(jnb jnbVar, zh zhVar, kpj kpjVar) {
        gs4 i0 = wdp.i0(jnbVar);
        Context requireContext = jnbVar.requireContext();
        requireContext.getClass();
        y parentFragmentManager = jnbVar.getParentFragmentManager();
        parentFragmentManager.getClass();
        zhVar.getClass();
        kpjVar.getClass();
        nyf nyfVar = (nyf) i0.a;
        this.a = jnbVar;
        this.b = kpjVar;
        this.c = requireContext;
        this.d = parentFragmentManager;
        this.e = wyf.F(nyfVar);
        this.f = (kxi) i0.d;
        bdt I = hag.I(mza.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = btf.b(new zya(15, this, zhVar));
        this.i = l18Var.b(hag.I(mvv.class), true);
        this.j = new ybf(ern.a(dvv.class), new r71((jfu) i0.b, 6), new pva(9, new v1e(0, this)));
        this.k = l18Var.b(hag.I(m4l.class), true);
        nyfVar.a(new ao7(1, kyf.ON_DESTROY, this));
    }

    public final void a(List list, boolean z, Bundle bundle, String str) {
        list.getClass();
        str.getClass();
        if (bundle == null) {
            b(list, z, null, str);
            return;
        }
        dyd a = dyd.a(bundle);
        if (a == null || a.c) {
            return;
        }
        b(list, z, (xpt) a.b, str);
        a.c = true;
    }

    public final void b(List list, boolean z, xpt xptVar, String str) {
        qvk qvkVar = this.l;
        if (qvkVar == null) {
            qvkVar = new qvk();
            qvkVar.a(new h88(this.c, false));
            this.l = qvkVar;
        }
        qvk qvkVar2 = qvkVar;
        qvkVar2.b = new w1e(z, this, 0);
        x97.y(this.e, null, null, new ov(qvkVar2, (Object) this, str, list, xptVar, (Continuation) null, 25), 3);
    }
}
