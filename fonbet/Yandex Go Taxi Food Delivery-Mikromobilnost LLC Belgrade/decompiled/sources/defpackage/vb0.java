package defpackage;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import com.yandex.messaging.ui.settings.folder.addChat.i;

/* loaded from: classes15.dex */
public final class vb0 implements wls {
    public final /* synthetic */ sls A;
    public final /* synthetic */ tic a;
    public final /* synthetic */ m3u0 b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ m3u0 x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ i z;

    public vb0(tic ticVar, m3u0 m3u0Var, m3u0 m3u0Var2, sls slsVar, m3u0 m3u0Var3, tls tlsVar, i iVar, sls slsVar2) {
        this.a = ticVar;
        this.b = m3u0Var;
        this.c = m3u0Var2;
        this.w = slsVar;
        this.x = m3u0Var3;
        this.y = tlsVar;
        this.z = iVar;
        this.A = slsVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        g.b(this.a, (((Boolean) this.b.getValue()).booleanValue() && ((Boolean) this.c.getValue()).booleanValue()) ? false : true, null, k.d(sb2.K(100, 0, null, 6), null, 14), k.l(sb2.K(200, 0, null, 6), null, 14), null, wwg.S(-228203428, true, new ub0(this.w, this.x, this.y, this.z, this.A), fidVar), fidVar, 1600512, 18);
        return zy11.a;
    }
}
