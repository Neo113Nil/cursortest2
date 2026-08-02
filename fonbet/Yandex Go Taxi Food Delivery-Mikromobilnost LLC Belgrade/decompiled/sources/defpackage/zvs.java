package defpackage;

import kotlin.Result;

/* loaded from: classes12.dex */
public final class zvs implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kol0 b;

    public /* synthetic */ zvs(kol0 kol0Var, int i) {
        this.a = i;
        this.b = kol0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        kol0 kol0Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                kol0Var.resumeWith(zy11Var);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                kol0Var.resumeWith(bool);
                break;
            case 2:
                kol0Var.resumeWith(((Boolean) obj).booleanValue() ? "" : null);
                break;
            case 3:
                kol0Var.resumeWith((gf50) obj);
                break;
            default:
                ((Result) obj).getClass();
                kol0Var.resumeWith(zy11Var);
                break;
        }
        return zy11Var;
    }
}
