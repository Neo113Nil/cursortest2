package defpackage;

import com.yandex.music.core.ui.compose.a;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class lz3 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ b04 b;

    public /* synthetic */ lz3(b04 b04Var, int i) {
        this.a = i;
        this.b = b04Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                final int intValue = ((Integer) obj).intValue();
                final so1 so1Var = (so1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                so1Var.getClass();
                oq5 oq5Var = (oq5) ((hq5) obj3);
                final b04 b04Var = this.b;
                int i3 = (intValue2 & 14) ^ 6;
                boolean h = oq5Var.h(b04Var) | oq5Var.h(so1Var) | ((i3 > 4 && oq5Var.d(intValue)) || (intValue2 & 6) == 4);
                Object K = oq5Var.K();
                Object obj5 = gq5.a;
                if (h || K == obj5) {
                    K = new z2(b04Var, so1Var, intValue, 11);
                    oq5Var.k0(K);
                }
                yci b = b.b(a.b(vci.a, null, 0L, 0.0f, null, (Function2) K, 15), intValue);
                boolean h2 = oq5Var.h(b04Var) | oq5Var.h(so1Var) | ((i3 > 4 && oq5Var.d(intValue)) || (intValue2 & 6) == 4);
                Object K2 = oq5Var.K();
                if (h2 || K2 == obj5) {
                    final int i4 = 0;
                    K2 = new Function0() { // from class: pz3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    int i5 = intValue;
                                    b04Var.a(so1Var.a, i5);
                                    break;
                                default:
                                    int i6 = intValue;
                                    b04Var.b(so1Var.a, i6);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                }
                Function0 function0 = (Function0) K2;
                boolean h3 = oq5Var.h(b04Var) | oq5Var.h(so1Var) | ((i3 > 4 && oq5Var.d(intValue)) || (intValue2 & 6) == 4);
                Object K3 = oq5Var.K();
                if (h3 || K3 == obj5) {
                    final int i5 = 1;
                    K3 = new Function0() { // from class: pz3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    int i52 = intValue;
                                    b04Var.a(so1Var.a, i52);
                                    break;
                                default:
                                    int i6 = intValue;
                                    b04Var.b(so1Var.a, i6);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K3);
                }
                zo1.d(so1Var, function0, b, (Function0) K3, oq5Var, (intValue2 >> 3) & 14, 0);
                break;
            case 1:
                final int intValue3 = ((Integer) obj).intValue();
                final dz3 dz3Var = (dz3) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                dz3Var.getClass();
                if ((intValue4 & 6) == 0) {
                    i = (((oq5) hq5Var).d(intValue3) ? 4 : 2) | intValue4;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= (intValue4 & 64) == 0 ? ((oq5) hq5Var).f(dz3Var) : ((oq5) hq5Var).h(dz3Var) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(i & 1, (i & 147) != 146)) {
                    q91 c = dz3Var.c();
                    final b04 b04Var2 = this.b;
                    int i6 = i & 112;
                    int i7 = i & 14;
                    boolean h4 = oq5Var2.h(b04Var2) | (i6 == 32 || ((i & 64) != 0 && oq5Var2.h(dz3Var))) | (i7 == 4);
                    Object K4 = oq5Var2.K();
                    Object obj6 = gq5.a;
                    if (h4 || K4 == obj6) {
                        final int i8 = 1;
                        K4 = new Function2() { // from class: nz3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                int i9 = i8;
                                boolean booleanValue = ((Boolean) obj7).booleanValue();
                                String str = (String) obj8;
                                switch (i9) {
                                    case 0:
                                        str.getClass();
                                        b04Var2.c(dz3Var.d(), intValue3, booleanValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        b04Var2.c(dz3Var.d(), intValue3, booleanValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(K4);
                    }
                    yci b2 = b.b(a.b(vci.a, null, 0L, 0.0f, null, (Function2) K4, 15), intValue3);
                    boolean h5 = oq5Var2.h(b04Var2) | (i6 == 32 || ((i & 64) != 0 && oq5Var2.h(dz3Var))) | (i7 == 4);
                    Object K5 = oq5Var2.K();
                    if (h5 || K5 == obj6) {
                        K5 = new oz3(b04Var2, dz3Var, intValue3, 2);
                        oq5Var2.k0(K5);
                    }
                    Function0 function02 = (Function0) K5;
                    boolean h6 = (i6 == 32 || ((i & 64) != 0 && oq5Var2.h(dz3Var))) | oq5Var2.h(b04Var2) | (i7 == 4);
                    Object K6 = oq5Var2.K();
                    if (h6 || K6 == obj6) {
                        K6 = new oz3(b04Var2, dz3Var, intValue3, 3);
                        oq5Var2.k0(K6);
                    }
                    wct.a(c, function02, b2, false, (Function0) K6, oq5Var2, 0, 8);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                final int intValue5 = ((Integer) obj).intValue();
                final dz3 dz3Var2 = (dz3) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                dz3Var2.getClass();
                if ((intValue6 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).d(intValue5) ? 4 : 2) | intValue6;
                } else {
                    i2 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i2 |= (intValue6 & 64) == 0 ? ((oq5) hq5Var2).f(dz3Var2) : ((oq5) hq5Var2).h(dz3Var2) ? 32 : 16;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(i2 & 1, (i2 & 147) != 146)) {
                    final b04 b04Var3 = this.b;
                    int i9 = i2 & 112;
                    int i10 = i2 & 14;
                    boolean h7 = oq5Var3.h(b04Var3) | (i9 == 32 || ((i2 & 64) != 0 && oq5Var3.h(dz3Var2))) | (i10 == 4);
                    Object K7 = oq5Var3.K();
                    Object obj7 = gq5.a;
                    if (h7 || K7 == obj7) {
                        final int i11 = 0;
                        K7 = new Function2() { // from class: nz3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj72, Object obj8) {
                                int i92 = i11;
                                boolean booleanValue = ((Boolean) obj72).booleanValue();
                                String str = (String) obj8;
                                switch (i92) {
                                    case 0:
                                        str.getClass();
                                        b04Var3.c(dz3Var2.d(), intValue5, booleanValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        b04Var3.c(dz3Var2.d(), intValue5, booleanValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var3.k0(K7);
                    }
                    yci b3 = b.b(a.b(vci.a, null, 0L, 0.0f, null, (Function2) K7, 15), intValue5);
                    boolean h8 = oq5Var3.h(b04Var3) | (i9 == 32 || ((i2 & 64) != 0 && oq5Var3.h(dz3Var2))) | (i10 == 4);
                    Object K8 = oq5Var3.K();
                    if (h8 || K8 == obj7) {
                        K8 = new oz3(b04Var3, dz3Var2, intValue5, 0);
                        oq5Var3.k0(K8);
                    }
                    Function0 function03 = (Function0) K8;
                    boolean h9 = (i9 == 32 || ((i2 & 64) != 0 && oq5Var3.h(dz3Var2))) | oq5Var3.h(b04Var3) | (i10 == 4);
                    Object K9 = oq5Var3.K();
                    if (h9 || K9 == obj7) {
                        K9 = new oz3(b04Var3, dz3Var2, intValue5, 1);
                        oq5Var3.k0(K9);
                    }
                    vq2.h(b04Var3, dz3Var2, intValue5, function03, b3, (Function0) K9, oq5Var3, i9 | ((i2 << 6) & 896));
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
