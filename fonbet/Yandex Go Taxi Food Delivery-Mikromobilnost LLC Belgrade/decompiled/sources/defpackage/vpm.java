package defpackage;

import com.yx360.design.view.base.DsComposeView;

/* loaded from: classes4.dex */
public final class vpm implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DsComposeView b;

    public /* synthetic */ vpm(DsComposeView dsComposeView, int i) {
        this.a = i;
        this.b = dsComposeView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        oz40 oz40Var;
        oz40 oz40Var2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DsComposeView dsComposeView = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                dsComposeView.ComposeContent(fidVar, 0);
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                }
                oz40Var = dsComposeView.imageLoader;
                tb61 tb61Var = (tb61) oz40Var.getValue();
                oz40Var2 = dsComposeView.videoLoader;
                if (oz40Var2.getValue() != null) {
                    ny61.u();
                    return null;
                }
                if (tb61Var != null) {
                    bts btsVar3 = (bts) fidVar2;
                    btsVar3.e0(-263554771);
                    dya1.a(tb61Var, wwg.S(410957606, true, new vpm(dsComposeView, i2), btsVar3), btsVar3, 48);
                    btsVar3.t(false);
                    return zy11Var;
                }
                bts btsVar4 = (bts) fidVar2;
                btsVar4.e0(-263206207);
                dsComposeView.ComposeContent(btsVar4, 0);
                btsVar4.t(false);
                return zy11Var;
        }
    }
}
