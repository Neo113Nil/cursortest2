package defpackage;

import ru.cprocsp.NGate.tools.Constants;
import yads.gn0;

/* loaded from: classes7.dex */
public final /* synthetic */ class x191 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hn71 b;

    public /* synthetic */ x191(hn71 hn71Var, int i, long j, long j2) {
        this.a = 2;
        this.b = hn71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        hn71 hn71Var = this.b;
        switch (i) {
            case 0:
                gn0 gn0Var = (gn0) hn71Var.c;
                int i2 = rf71.a;
                gn0Var.a.getClass();
                ep71 ep71Var = gn0Var.a.p;
                ep71Var.y(ep71Var.A(), Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND, new yx61(24));
                break;
            case 1:
                gn0 gn0Var2 = (gn0) hn71Var.c;
                int i3 = rf71.a;
                ep71 ep71Var2 = gn0Var2.a.p;
                ep71Var2.y(ep71Var2.A(), Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, new yx61(27));
                break;
            case 2:
                gn0 gn0Var3 = (gn0) hn71Var.c;
                int i4 = rf71.a;
                ep71 ep71Var3 = gn0Var3.a.p;
                ep71Var3.y(ep71Var3.A(), 1011, new yx61(25));
                break;
            case 3:
                gn0 gn0Var4 = (gn0) hn71Var.c;
                int i5 = rf71.a;
                gn0Var4.a.getClass();
                ep71 ep71Var4 = gn0Var4.a.p;
                ep71Var4.y(ep71Var4.A(), 1007, new dp71(0));
                break;
            case 4:
                gn0 gn0Var5 = (gn0) hn71Var.c;
                int i6 = rf71.a;
                ep71 ep71Var5 = gn0Var5.a.p;
                ep71Var5.y(ep71Var5.A(), 1010, new yx61(19));
                break;
            case 5:
                gn0 gn0Var6 = (gn0) hn71Var.c;
                int i7 = rf71.a;
                ep71 ep71Var6 = gn0Var6.a.p;
                ep71Var6.y(ep71Var6.A(), 1012, new dp71(11));
                break;
            case 6:
                gn0 gn0Var7 = (gn0) hn71Var.c;
                int i8 = rf71.a;
                ep71 ep71Var7 = gn0Var7.a.p;
                ep71Var7.y(ep71Var7.A(), 1014, new yx61(23));
                break;
            default:
                gn0 gn0Var8 = (gn0) hn71Var.c;
                int i9 = rf71.a;
                ep71 ep71Var8 = gn0Var8.a.p;
                ep71Var8.y(ep71Var8.A(), 1029, new dp71(3));
                break;
        }
    }

    public /* synthetic */ x191(hn71 hn71Var, long j) {
        this.a = 4;
        this.b = hn71Var;
    }

    public /* synthetic */ x191(hn71 hn71Var, Object obj, int i) {
        this.a = i;
        this.b = hn71Var;
    }

    public /* synthetic */ x191(hn71 hn71Var, String str, long j, long j2) {
        this.a = 1;
        this.b = hn71Var;
    }

    public /* synthetic */ x191(hn71 hn71Var, qd81 qd81Var, ko81 ko81Var) {
        this.a = 0;
        this.b = hn71Var;
    }
}
