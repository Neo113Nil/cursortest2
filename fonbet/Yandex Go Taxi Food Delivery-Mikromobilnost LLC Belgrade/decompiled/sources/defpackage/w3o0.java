package defpackage;

import java.util.List;

/* loaded from: classes13.dex */
public final /* synthetic */ class w3o0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ pxm0 c;

    public /* synthetic */ w3o0(List list, pxm0 pxm0Var, int i) {
        this.a = i;
        this.b = list;
        this.c = pxm0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        pxm0 pxm0Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                ((klo0) obj).a.r(new w3o0(list, pxm0Var, 2));
                break;
            case 1:
                ((j4o0) obj).x(list, pxm0Var);
                break;
            case 2:
                ((muo0) obj).n1(new s6k0(list, pxm0Var, null));
                break;
            default:
                ((muo0) obj).n1(new s6k0(list, pxm0Var, null));
                break;
        }
        return zy11Var;
    }
}
