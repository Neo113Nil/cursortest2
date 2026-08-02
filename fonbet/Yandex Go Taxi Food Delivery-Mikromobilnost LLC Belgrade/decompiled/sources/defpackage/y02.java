package defpackage;

import com.yandex.go.user_profile.ui.am.u;

/* loaded from: classes14.dex */
public final /* synthetic */ class y02 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;
    public final /* synthetic */ int c;

    public /* synthetic */ y02(u uVar, int i, int i2) {
        this.a = i2;
        this.b = uVar;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        u uVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                uVar.c(fidVar, vng.O(i2 | 1));
                break;
            default:
                uVar.e(fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
