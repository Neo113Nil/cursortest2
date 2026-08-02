package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import ru.yandex.video.m3.preload_manager.k;

/* loaded from: classes6.dex */
public final class snm {
    public final nnm a;
    public final Set b;
    public final b9w c;
    public List d;
    public final String e;
    public final /* synthetic */ k f;

    public snm(k kVar, nnm nnmVar, xiu xiuVar, lf0 lf0Var) {
        xiuVar.getClass();
        this.f = kVar;
        this.a = nnmVar;
        this.b = vop.d(lf0Var);
        tao taoVar = kVar.d;
        str strVar = ((inm) ((kgk) taoVar.e).s).h;
        strVar.c = true;
        r2e r2eVar = strVar.h;
        s9f[] s9fVarArr = str.i;
        int height = ((SurfaceSize) r2eVar.getValue(strVar, s9fVarArr[0])).getHeight();
        dnm dnmVar = nnmVar.b;
        int min = Math.min(height, dnmVar.c.intValue());
        strVar.c = true;
        int min2 = Math.min(((SurfaceSize) r2eVar.getValue(strVar, s9fVarArr[0])).getWidth(), dnmVar.b.intValue());
        onh d = onh.d(nnmVar.k);
        b1t a = ((a1t) ((Function1) taoVar.a).invoke(nnmVar.a)).a(new ah3(min2, min));
        yk2 yk2Var = (yk2) taoVar.c;
        rsb rsbVar = (rsb) taoVar.b;
        ip3 ip3Var = (ip3) taoVar.d;
        int i = b9w.n;
        gnh gnhVar = d.b;
        gnhVar.getClass();
        this.c = new b9w(d, dvt.R(gnhVar.a, gnhVar.b) == 4 ? null : new to7(ip3Var, u2c.a).d(d), new xzi(rsbVar.a(dvt.q(null), new rre(20), new x2i(20), new rj7(7), new rj7(8))), a, yk2Var);
        this.e = nnmVar.l;
        dnmVar.getClass();
    }
}
