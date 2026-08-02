package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class zt2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ pyc d;
    public final /* synthetic */ ik e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ zt2(Function2 function2, Function0 function0, pyc pycVar, ik ikVar, Function0 function02, Function1 function1, int i) {
        this.a = i;
        this.b = function2;
        this.c = function0;
        this.d = pycVar;
        this.e = ikVar;
        this.f = function02;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wn5 wn5Var = null;
        int i = 3;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((3 & ((Integer) obj2).intValue()) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                etn.l(t2b.a.a(null), ild.C(1080733721, new zt2(this.b, this.c, this.d, this.e, this.f, this.g, 1), hq5Var), hq5Var, 56);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                Function2 function2 = this.b;
                Function0 function0 = this.c;
                pyc pycVar = this.d;
                ik ikVar = this.e;
                if (function2 == null) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    oq5Var3.Z(1063528651);
                    yci a = a.a(vci.a, "top_app_bar");
                    n5g a2 = mp0.a(oq5Var3);
                    if (function0 == null) {
                        oq5Var3.Z(1064030075);
                    } else {
                        oq5Var3.Z(1064030076);
                        wn5Var = ild.C(-1909830904, new zk(6, function0), oq5Var3);
                    }
                    oq5Var3.p(false);
                    sp0.b(ild.C(688767458, new dk(ikVar, i), oq5Var3), a2, a, wn5Var, pycVar, svd.a(oq5Var3), ((dq0) oq5Var3.j(eq0.a)).b.a, u7g.E(R.dimen.elevation_toolbar, oq5Var3), oq5Var3, 390);
                    oq5Var3.p(false);
                } else {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(1064430565);
                    if (function0 == null) {
                        oq5Var4.Z(1064757211);
                    } else {
                        oq5Var4.Z(1064757212);
                        wn5Var = ild.C(501288477, new zk(7, function0), oq5Var4);
                    }
                    oq5Var4.p(false);
                    xp3.i(ikVar, function2, this.f, this.g, wn5Var, pycVar, null, 0L, 0L, 0.0f, oq5Var4, 0);
                    oq5Var4.p(false);
                }
        }
        return Unit.a;
    }
}
