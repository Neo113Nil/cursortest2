package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.concert.ConcertActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class r31 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s31 b;
    public final /* synthetic */ thj c;
    public final /* synthetic */ s26 d;

    public /* synthetic */ r31(s31 s31Var, thj thjVar, s26 s26Var, int i) {
        this.a = i;
        this.b = s31Var;
        this.c = thjVar;
        this.d = s26Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.a;
        s26 s26Var = this.d;
        thj thjVar = this.c;
        s31 s31Var = this.b;
        switch (i) {
            case 0:
                rmb.j(s31Var.c, wjb.ConcertScreen, thjVar, null, 12);
                bnd bndVar = s31Var.d;
                h06 h06Var = s26Var.a;
                int i2 = ConcertActivity.w0;
                hn5 hn5Var = (hn5) bndVar.b;
                hn5Var.startActivity(bkp.j0(hn5Var, h06Var.a, null));
                break;
            default:
                rmb.j(s31Var.c, wjb.ConcertPurchaseScreen, thjVar, null, 12);
                bnd bndVar2 = s31Var.d;
                h06 h06Var2 = s26Var.a;
                String str2 = h06Var2.h;
                if (str2 != null && (str = (String) avf.R(str2)) != null) {
                    a0g.D((hn5) bndVar2.b, h06Var2.a, str);
                }
                break;
        }
        return Unit.a;
    }
}
