package defpackage;

import com.yx360.design.compose.atoms.DsButton$Style;

/* loaded from: classes11.dex */
public final class xde implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ xde(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                yx91.a(null, null, 0L, this.b, null, null, null, null, fidVar, 54, 492);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        break;
                    }
                }
                mo91.g(ohb1.e(fidVar2, oyh0.folders_empty_state_action_button), this.b, DsButton$Style.Neutral, u3a1.d(c530.a, "folder_edit_add_chats_button"), null, false, false, fidVar2, 384, 496);
                break;
        }
        return zy11Var;
    }
}
