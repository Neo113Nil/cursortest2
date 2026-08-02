package defpackage;

import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ h11(Function1 function1, Function1 function12, int i) {
        this.a = i;
        this.b = function1;
        this.c = function12;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                final u01 u01Var = (u01) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                u01Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(u01Var) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    q6k q6kVar = u01Var.a;
                    boolean z = q6kVar instanceof fw;
                    final Function1 function1 = this.b;
                    Object obj4 = gq5.a;
                    if (z) {
                        oq5Var.Z(825887363);
                        yci a = a.a(vci.a, "album_list_item");
                        ru ruVar = ((fw) q6kVar).k;
                        int i = intValue & 14;
                        boolean f = oq5Var.f(function1) | (i == 4);
                        Object K = oq5Var.K();
                        if (f || K == obj4) {
                            final int i2 = 0;
                            K = new Function0() { // from class: j11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            function1.invoke(u01Var.b);
                                            break;
                                        case 1:
                                            function1.invoke(u01Var.b);
                                            break;
                                        default:
                                            function1.invoke(u01Var.b);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var.k0(K);
                        }
                        Function0 function0 = (Function0) K;
                        final Function1 function12 = this.c;
                        boolean f2 = oq5Var.f(function12) | (i == 4);
                        Object K2 = oq5Var.K();
                        if (f2 || K2 == obj4) {
                            final int i3 = 1;
                            K2 = new Function0() { // from class: j11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            function12.invoke(u01Var.b);
                                            break;
                                        case 1:
                                            function12.invoke(u01Var.b);
                                            break;
                                        default:
                                            function12.invoke(u01Var.b);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var.k0(K2);
                        }
                        ghh.a(ruVar, function0, a, null, null, null, (Function0) K2, oq5Var, 384, 56);
                        oq5Var.p(false);
                    } else {
                        if (!(q6kVar instanceof gw)) {
                            throw vz1.i(oq5Var, -804645134, false);
                        }
                        oq5Var.Z(826291417);
                        kbj kbjVar = ((gw) q6kVar).k;
                        boolean f3 = oq5Var.f(function1) | ((intValue & 14) == 4);
                        Object K3 = oq5Var.K();
                        if (f3 || K3 == obj4) {
                            final int i4 = 2;
                            K3 = new Function0() { // from class: j11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            function1.invoke(u01Var.b);
                                            break;
                                        case 1:
                                            function1.invoke(u01Var.b);
                                            break;
                                        default:
                                            function1.invoke(u01Var.b);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var.k0(K3);
                        }
                        p6g.d(kbjVar, (Function0) K3, null, 0L, null, null, true, null, null, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 444);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                final ggq ggqVar = (ggq) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ggqVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(ggqVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    jd1 jd1Var = ggqVar.a;
                    final Function1 function13 = this.b;
                    int i5 = intValue2 & 14;
                    boolean f4 = oq5Var2.f(function13) | (i5 == 4);
                    Object K4 = oq5Var2.K();
                    Object obj5 = gq5.a;
                    if (f4 || K4 == obj5) {
                        final int i6 = 0;
                        K4 = new Function0() { // from class: qgq
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        function13.invoke(ggqVar.b);
                                        break;
                                    default:
                                        function13.invoke(ggqVar.b);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(K4);
                    }
                    Function0 function02 = (Function0) K4;
                    final Function1 function14 = this.c;
                    boolean f5 = oq5Var2.f(function14) | (i5 == 4);
                    Object K5 = oq5Var2.K();
                    if (f5 || K5 == obj5) {
                        final int i7 = 1;
                        K5 = new Function0() { // from class: qgq
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        function14.invoke(ggqVar.b);
                                        break;
                                    default:
                                        function14.invoke(ggqVar.b);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(K5);
                    }
                    jf0.b(function02, jd1Var, null, null, null, (Function0) K5, oq5Var2, 0, 28);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }
}
