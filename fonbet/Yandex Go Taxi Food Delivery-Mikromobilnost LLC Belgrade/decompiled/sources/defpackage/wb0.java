package defpackage;

import androidx.compose.material3.w;
import com.yandex.messaging.ui.settings.folder.addChat.d;
import com.yandex.messaging.ui.settings.folder.addChat.i;

/* loaded from: classes15.dex */
public final class wb0 implements zls {
    public final /* synthetic */ sls A;
    public final /* synthetic */ oz40 B;
    public final /* synthetic */ tse C;
    public final /* synthetic */ w D;
    public final /* synthetic */ sls a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ m3u0 w;
    public final /* synthetic */ m3u0 x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ i z;

    public wb0(sls slsVar, f530 f530Var, oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3, tls tlsVar, i iVar, sls slsVar2, oz40 oz40Var4, tse tseVar, w wVar) {
        this.a = slsVar;
        this.b = f530Var;
        this.c = oz40Var;
        this.w = oz40Var2;
        this.x = oz40Var3;
        this.y = tlsVar;
        this.z = iVar;
        this.A = slsVar2;
        this.B = oz40Var4;
        this.C = tseVar;
        this.D = wVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tic ticVar = (tic) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ticVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        b3b1.a(false, this.a, fidVar, 0, 1);
        qnm qnmVar = qnm.a;
        long a = qnm.c(fidVar).a();
        f530 d = u3a1.d(ljs0.c(this.b, 1.0f), "folder_add_chats_screen");
        tls tlsVar = this.y;
        sls slsVar = this.A;
        m3u0 m3u0Var = this.c;
        m3u0 m3u0Var2 = this.w;
        sls slsVar2 = this.a;
        m3u0 m3u0Var3 = this.x;
        i iVar = this.z;
        dkm0.a(d, wwg.S(1497049140, true, new vb0(ticVar, m3u0Var, m3u0Var2, slsVar2, m3u0Var3, tlsVar, iVar, slsVar), fidVar), null, null, null, 0, a, 0L, null, wwg.S(-651427383, true, new d(iVar, this.b, this.x, this.c, this.B, this.A, this.C, this.D), fidVar), fidVar, 805306416, 444);
        return zy11.a;
    }
}
