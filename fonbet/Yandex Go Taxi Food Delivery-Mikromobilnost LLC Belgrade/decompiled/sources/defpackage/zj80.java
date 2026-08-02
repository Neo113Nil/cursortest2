package defpackage;

import androidx.core.view.OneShotPreDrawListener;

/* loaded from: classes5.dex */
public final /* synthetic */ class zj80 implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ani b;
    public final /* synthetic */ g65 c;

    public /* synthetic */ zj80(g65 g65Var, ani aniVar) {
        this.c = g65Var;
        this.b = aniVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g65 g65Var = this.c;
        ani aniVar = this.b;
        switch (i) {
            case 0:
                fr frVar = g65Var.d;
                if (frVar != null) {
                    ((tls) aniVar.V).invoke(frVar);
                    break;
                }
                break;
            default:
                String str = g65Var.c.a;
                yj80 yj80Var = (yj80) ((zo31) aniVar.R);
                OneShotPreDrawListener.add(yj80Var.c, new sd30(19, aniVar, str));
                yj80Var.a.setClipToOutline(true);
                aniVar.c0(false);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ zj80(ani aniVar, g65 g65Var) {
        this.b = aniVar;
        this.c = g65Var;
    }
}
