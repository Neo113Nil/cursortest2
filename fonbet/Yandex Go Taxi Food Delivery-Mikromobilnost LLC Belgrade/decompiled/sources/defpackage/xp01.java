package defpackage;

import android.net.Uri;

/* loaded from: classes3.dex */
public final /* synthetic */ class xp01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq01 b;

    public /* synthetic */ xp01(vq01 vq01Var, int i) {
        this.a = i;
        this.b = vq01Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        vq01 vq01Var = this.b;
        switch (i) {
            case 0:
                return (Boolean) vq01Var.invoke(((Uri) obj).toString());
            default:
                n70 n70Var = (n70) obj;
                ((d261) n70Var.N).b.setActionHandler(new xp01(vq01Var, 0));
                n70Var.W(new ns3(n70Var, 23));
                return zy11.a;
        }
    }
}
