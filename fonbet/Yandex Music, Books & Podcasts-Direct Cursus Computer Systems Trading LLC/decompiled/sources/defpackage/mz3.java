package defpackage;

import androidx.compose.ui.platform.a;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class mz3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ mz3(int i) {
        this.a = 7;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                vq2.m(this.b, rvf.R(1), (hq5) obj);
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                vq2.g(this.b, rvf.R(1), (hq5) obj);
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                vq2.o(this.b, rvf.R(1), (hq5) obj);
                return Unit.a;
            case 3:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                String lowerCase = rvf.M(this.b, hq5Var).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                yci a = a.a(vci.a, "music_history_context_heading");
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new kz5(18);
                    oq5Var2.k0(K);
                }
                xcs.b(lowerCase, nfp.b(a, false, (Function1) K), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var2, 0, 0, 131068);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                zsd.p(this.b, rvf.R(1), (hq5) obj);
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                gld.E(this.b, rvf.R(1), (hq5) obj);
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                y5g.E(this.b, rvf.R(1), (hq5) obj);
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                v7g.j(rvf.R(this.b | 1), (hq5) obj);
                return Unit.a;
            default:
                owv owvVar = (owv) obj;
                String str = (String) obj2;
                owvVar.getClass();
                str.getClass();
                mwv mwvVar = owvVar instanceof mwv ? (mwv) owvVar : null;
                hwv hwvVar = mwvVar != null ? (hwv) CollectionsKt.S(mwvVar.a, this.b) : null;
                return Boolean.valueOf(Intrinsics.d(hwvVar != null ? hwvVar.a : null, str));
        }
    }

    public /* synthetic */ mz3(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public /* synthetic */ mz3(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
    }
}
