package defpackage;

import androidx.compose.animation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class i5v implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ i5v(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                jlf jlfVar = (jlf) obj2;
                int intValue = ((Integer) obj4).intValue();
                ((cl0) obj).getClass();
                jlfVar.getClass();
                int i = (intValue >> 3) & 14;
                o2g.w(jlfVar, this.b, this.c, (hq5) obj3, i);
                break;
            default:
                jlf jlfVar2 = (jlf) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                ((am0) obj).getClass();
                jlfVar2.getClass();
                oq5 oq5Var = (oq5) ((hq5) obj3);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new t0v(10);
                    oq5Var.k0(K);
                }
                a.b(jlfVar2, null, (Function1) K, null, "WaveSettingContentChangeAnimation", null, ild.C(1991584525, new i5v(this.b, this.c, 0), oq5Var), oq5Var, ((intValue2 >> 3) & 14) | 1597824, 42);
                break;
        }
        return Unit.a;
    }
}
