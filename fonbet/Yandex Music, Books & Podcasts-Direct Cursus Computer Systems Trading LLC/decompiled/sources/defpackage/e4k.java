package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class e4k implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ e4k(int i, Function0 function0, boolean z) {
        this.a = i;
        this.b = z;
        this.c = function0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    if (z) {
                        oq5Var.Z(1479417503);
                        aae.a(this.c, a.a(vci.a, "sort_by_button"), false, zc4.d, oq5Var, 24624, 12);
                    } else {
                        oq5Var.Z(1468082229);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                yci yciVar = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar.getClass();
                oq5 oq5Var2 = (oq5) ((hq5) obj2);
                oq5Var2.Z(476272603);
                String M = rvf.M(z ? R.string.video_clips_hide_controls_description : R.string.video_clips_show_controls_description, oq5Var2);
                boolean f = oq5Var2.f(M);
                Function0 function0 = this.c;
                boolean f2 = f | oq5Var2.f(function0);
                Object K = oq5Var2.K();
                if (f2 || K == gq5.a) {
                    K = new n4u(M, function0, 1);
                    oq5Var2.k0(K);
                }
                yci b = nfp.b(yciVar, false, (Function1) K);
                oq5Var2.p(false);
                return b;
        }
    }
}
