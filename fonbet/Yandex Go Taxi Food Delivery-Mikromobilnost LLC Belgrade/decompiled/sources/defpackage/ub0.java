package defpackage;

import com.yandex.messaging.ui.settings.folder.addChat.i;
import com.yx360.design.compose.atoms.DsButtonClose$Type;

/* loaded from: classes15.dex */
public final class ub0 implements zls {
    public final /* synthetic */ sls a;
    public final /* synthetic */ m3u0 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ i w;
    public final /* synthetic */ sls x;

    public ub0(sls slsVar, m3u0 m3u0Var, tls tlsVar, i iVar, sls slsVar2) {
        this.a = slsVar;
        this.b = m3u0Var;
        this.c = tlsVar;
        this.w = iVar;
        this.x = slsVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        ((Number) obj3).intValue();
        zrm zrmVar = new zrm(0, DsButtonClose$Type.Close, this.a);
        String e = ohb1.e(fidVar, oyh0.folder_add_chat_title);
        m3u0 m3u0Var = this.b;
        ac0 ac0Var = (ac0) m3u0Var.getValue();
        bts btsVar = (bts) fidVar;
        btsVar.e0(-269919211);
        String d = ac0Var instanceof yb0 ? ohb1.d(oyh0.folder_add_chat_chosen_count, new Object[]{Integer.valueOf(((ac0) m3u0Var.getValue()).d()), Integer.valueOf(((ac0) m3u0Var.getValue()).c())}, btsVar) : null;
        btsVar.t(false);
        csm.c(true, null, e, d, zrmVar, wwg.S(74036937, true, new tb0(this.c, this.w, this.x, m3u0Var, 0), btsVar), btsVar, 196614, 2);
        return zy11.a;
    }
}
