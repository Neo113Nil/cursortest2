package defpackage;

import com.yandex.music.core.ui.compose.a;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class w04 implements ryc {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w04(ynn ynnVar, f14 f14Var, boolean z) {
        this.c = ynnVar;
        this.d = f14Var;
        this.b = z;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.a) {
            case 0:
                vci vciVar = vci.a;
                ynn ynnVar = (ynn) this.c;
                final f14 f14Var = (f14) this.d;
                boolean z = this.b;
                final int intValue = ((Integer) obj).intValue();
                final c24 c24Var = (c24) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                Object obj5 = gq5.a;
                c24Var.getClass();
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).f(c24Var) ? 32 : 16;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (!oq5Var.P(i & 1, (i & 147) != 146)) {
                    oq5Var.S();
                } else if (c24Var instanceof t14) {
                    oq5Var.Z(-1921728014);
                    rab rabVar = ((t14) c24Var).a;
                    yci b = b.b(vciVar, intValue);
                    int i2 = i & 112;
                    int i3 = i & 14;
                    boolean f = oq5Var.f(f14Var) | (i2 == 32) | (i3 == 4);
                    Object K = oq5Var.K();
                    if (f || K == obj5) {
                        final int i4 = 0;
                        K = new Function2() { // from class: s04
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i5 = i4;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                String str = (String) obj7;
                                switch (i5) {
                                    case 0:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((t14) c24Var).b, intValue, str);
                                        break;
                                    case 1:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((u14) c24Var).b, intValue, str);
                                        break;
                                    case 2:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((a24) c24Var).b, intValue, str);
                                        break;
                                    case 3:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((x14) c24Var).d, intValue, str);
                                        break;
                                    case 4:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((z14) c24Var).b.a, intValue, str);
                                        break;
                                    case 5:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((v14) c24Var).d, intValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((w14) c24Var).d, intValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K);
                    }
                    yci b2 = a.b(b, ynnVar, 0L, 0.0f, null, (Function2) K, 14);
                    boolean f2 = oq5Var.f(f14Var) | (i2 == 32) | (i3 == 4);
                    Object K2 = oq5Var.K();
                    if (f2 || K2 == obj5) {
                        final int i5 = 1;
                        K2 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K2);
                    }
                    Function0 function0 = (Function0) K2;
                    boolean f3 = oq5Var.f(f14Var) | (i2 == 32) | (i3 == 4);
                    Object K3 = oq5Var.K();
                    if (f3 || K3 == obj5) {
                        final int i6 = 5;
                        K3 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K3);
                    }
                    irf.a(0, 0, oq5Var, rabVar, b2, function0, (Function0) K3, z);
                    oq5Var.p(false);
                } else if (c24Var instanceof u14) {
                    oq5Var.Z(-1920960144);
                    q91 q91Var = ((u14) c24Var).a;
                    yci b3 = b.b(vciVar, intValue);
                    int i7 = i & 112;
                    int i8 = i & 14;
                    boolean f4 = oq5Var.f(f14Var) | (i7 == 32) | (i8 == 4);
                    Object K4 = oq5Var.K();
                    if (f4 || K4 == obj5) {
                        final int i9 = 1;
                        K4 = new Function2() { // from class: s04
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i52 = i9;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                String str = (String) obj7;
                                switch (i52) {
                                    case 0:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((t14) c24Var).b, intValue, str);
                                        break;
                                    case 1:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((u14) c24Var).b, intValue, str);
                                        break;
                                    case 2:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((a24) c24Var).b, intValue, str);
                                        break;
                                    case 3:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((x14) c24Var).d, intValue, str);
                                        break;
                                    case 4:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((z14) c24Var).b.a, intValue, str);
                                        break;
                                    case 5:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((v14) c24Var).d, intValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((w14) c24Var).d, intValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K4);
                    }
                    yci b4 = a.b(b3, ynnVar, 0L, 0.0f, null, (Function2) K4, 14);
                    boolean f5 = oq5Var.f(f14Var) | (i7 == 32) | (i8 == 4);
                    Object K5 = oq5Var.K();
                    if (f5 || K5 == obj5) {
                        final int i10 = 6;
                        K5 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K5);
                    }
                    Function0 function02 = (Function0) K5;
                    boolean f6 = oq5Var.f(f14Var) | (i7 == 32) | (i8 == 4);
                    Object K6 = oq5Var.K();
                    if (f6 || K6 == obj5) {
                        final int i11 = 7;
                        K6 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K6);
                    }
                    wct.a(q91Var, function02, b4, z, (Function0) K6, oq5Var, 0, 0);
                    oq5Var.p(false);
                } else if (c24Var instanceof a24) {
                    oq5Var.Z(-1920188275);
                    rab rabVar2 = ((a24) c24Var).a;
                    yci b5 = b.b(vciVar, intValue);
                    int i12 = i & 112;
                    int i13 = i & 14;
                    boolean f7 = oq5Var.f(f14Var) | (i12 == 32) | (i13 == 4);
                    Object K7 = oq5Var.K();
                    if (f7 || K7 == obj5) {
                        final int i14 = 2;
                        K7 = new Function2() { // from class: s04
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i52 = i14;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                String str = (String) obj7;
                                switch (i52) {
                                    case 0:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((t14) c24Var).b, intValue, str);
                                        break;
                                    case 1:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((u14) c24Var).b, intValue, str);
                                        break;
                                    case 2:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((a24) c24Var).b, intValue, str);
                                        break;
                                    case 3:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((x14) c24Var).d, intValue, str);
                                        break;
                                    case 4:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((z14) c24Var).b.a, intValue, str);
                                        break;
                                    case 5:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((v14) c24Var).d, intValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((w14) c24Var).d, intValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K7);
                    }
                    yci b6 = a.b(b5, ynnVar, 0L, 0.0f, null, (Function2) K7, 14);
                    boolean f8 = oq5Var.f(f14Var) | (i12 == 32) | (i13 == 4);
                    Object K8 = oq5Var.K();
                    if (f8 || K8 == obj5) {
                        final int i15 = 9;
                        K8 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K8);
                    }
                    Function0 function03 = (Function0) K8;
                    boolean f9 = (i12 == 32) | oq5Var.f(f14Var) | (i13 == 4);
                    Object K9 = oq5Var.K();
                    if (f9 || K9 == obj5) {
                        final int i16 = 10;
                        K9 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K9);
                    }
                    swf.j(0, 0, oq5Var, rabVar2, b6, function03, (Function0) K9, z);
                    oq5Var.p(false);
                } else if (c24Var instanceof x14) {
                    oq5Var.Z(-1919419723);
                    x14 x14Var = (x14) c24Var;
                    z6a Q = y9w.Q(x14Var.d, x14Var.b, oq5Var);
                    v1g v1gVar = x14Var.a;
                    w3g w3gVar = (w3g) gld.M(Q.b(), oq5Var).getValue();
                    yci b7 = b.b(vciVar, intValue);
                    int i17 = i & 112;
                    int i18 = i & 14;
                    boolean f10 = oq5Var.f(f14Var) | (i17 == 32) | (i18 == 4);
                    Object K10 = oq5Var.K();
                    if (f10 || K10 == obj5) {
                        final int i19 = 3;
                        K10 = new Function2() { // from class: s04
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i52 = i19;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                String str = (String) obj7;
                                switch (i52) {
                                    case 0:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((t14) c24Var).b, intValue, str);
                                        break;
                                    case 1:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((u14) c24Var).b, intValue, str);
                                        break;
                                    case 2:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((a24) c24Var).b, intValue, str);
                                        break;
                                    case 3:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((x14) c24Var).d, intValue, str);
                                        break;
                                    case 4:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((z14) c24Var).b.a, intValue, str);
                                        break;
                                    case 5:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((v14) c24Var).d, intValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((w14) c24Var).d, intValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K10);
                    }
                    yci b8 = a.b(b7, ynnVar, 0L, 0.0f, null, (Function2) K10, 14);
                    boolean f11 = oq5Var.f(f14Var) | (i17 == 32) | (i18 == 4);
                    Object K11 = oq5Var.K();
                    if (f11 || K11 == obj5) {
                        final int i20 = 8;
                        K11 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i20) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K11);
                    }
                    Function0 function04 = (Function0) K11;
                    boolean f12 = oq5Var.f(f14Var) | (i17 == 32) | (i18 == 4);
                    Object K12 = oq5Var.K();
                    if (f12 || K12 == obj5) {
                        final int i21 = 11;
                        K12 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i21) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K12);
                    }
                    y1g.d(function04, v1gVar, w3gVar, b8, z, (Function0) K12, oq5Var, 0, 0);
                    oq5Var.p(false);
                } else if (c24Var instanceof z14) {
                    oq5Var.Z(-1918326260);
                    rmk rmkVar = ((z14) c24Var).a;
                    yci b9 = b.b(vciVar, intValue);
                    int i22 = i & 112;
                    int i23 = i & 14;
                    boolean f13 = oq5Var.f(f14Var) | (i22 == 32) | (i23 == 4);
                    Object K13 = oq5Var.K();
                    if (f13 || K13 == obj5) {
                        final int i24 = 4;
                        K13 = new Function2() { // from class: s04
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i52 = i24;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                String str = (String) obj7;
                                switch (i52) {
                                    case 0:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((t14) c24Var).b, intValue, str);
                                        break;
                                    case 1:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((u14) c24Var).b, intValue, str);
                                        break;
                                    case 2:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((a24) c24Var).b, intValue, str);
                                        break;
                                    case 3:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((x14) c24Var).d, intValue, str);
                                        break;
                                    case 4:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((z14) c24Var).b.a, intValue, str);
                                        break;
                                    case 5:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((v14) c24Var).d, intValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((w14) c24Var).d, intValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K13);
                    }
                    yci b10 = a.b(b9, ynnVar, 0L, 0.0f, null, (Function2) K13, 14);
                    boolean f14 = oq5Var.f(f14Var) | (i22 == 32) | (i23 == 4);
                    Object K14 = oq5Var.K();
                    if (f14 || K14 == obj5) {
                        final int i25 = 12;
                        K14 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K14);
                    }
                    Function0 function05 = (Function0) K14;
                    boolean f15 = oq5Var.f(f14Var) | (i22 == 32) | (i23 == 4);
                    Object K15 = oq5Var.K();
                    if (f15 || K15 == obj5) {
                        final int i26 = 13;
                        K15 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K15);
                    }
                    wdg.c(rmkVar, function05, b10, (Function0) K15, oq5Var, 0);
                    oq5Var.p(false);
                } else if (c24Var instanceof v14) {
                    oq5Var.Z(-1917623893);
                    v14 v14Var = (v14) c24Var;
                    z6a Q2 = y9w.Q(v14Var.d, v14Var.b, oq5Var);
                    se4 se4Var = v14Var.a;
                    w3g w3gVar2 = (w3g) gld.M(Q2.b(), oq5Var).getValue();
                    yci b11 = b.b(vciVar, intValue);
                    int i27 = i & 112;
                    int i28 = i & 14;
                    boolean f16 = oq5Var.f(f14Var) | (i27 == 32) | (i28 == 4);
                    Object K16 = oq5Var.K();
                    if (f16 || K16 == obj5) {
                        final int i29 = 5;
                        K16 = new Function2() { // from class: s04
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i52 = i29;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                String str = (String) obj7;
                                switch (i52) {
                                    case 0:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((t14) c24Var).b, intValue, str);
                                        break;
                                    case 1:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((u14) c24Var).b, intValue, str);
                                        break;
                                    case 2:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((a24) c24Var).b, intValue, str);
                                        break;
                                    case 3:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((x14) c24Var).d, intValue, str);
                                        break;
                                    case 4:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((z14) c24Var).b.a, intValue, str);
                                        break;
                                    case 5:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((v14) c24Var).d, intValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((w14) c24Var).d, intValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K16);
                    }
                    yci b12 = a.b(b11, ynnVar, 0L, 0.0f, null, (Function2) K16, 14);
                    boolean f17 = oq5Var.f(f14Var) | (i27 == 32) | (i28 == 4);
                    Object K17 = oq5Var.K();
                    if (f17 || K17 == obj5) {
                        final int i30 = 14;
                        K17 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i30) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K17);
                    }
                    Function0 function06 = (Function0) K17;
                    boolean f18 = oq5Var.f(f14Var) | (i27 == 32) | (i28 == 4);
                    Object K18 = oq5Var.K();
                    if (f18 || K18 == obj5) {
                        final int i31 = 15;
                        K18 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i31) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K18);
                    }
                    wdp.L(se4Var, w3gVar2, function06, (Function0) K18, b12, oq5Var, 0);
                    oq5Var.p(false);
                } else if (c24Var instanceof w14) {
                    oq5Var.Z(-1916628514);
                    w14 w14Var = (w14) c24Var;
                    z6a Q3 = y9w.Q(w14Var.d, w14Var.b, oq5Var);
                    v1g v1gVar2 = w14Var.a;
                    w3g w3gVar3 = (w3g) gld.M(Q3.b(), oq5Var).getValue();
                    yci b13 = b.b(vciVar, intValue);
                    int i32 = i & 112;
                    int i33 = i & 14;
                    boolean f19 = oq5Var.f(f14Var) | (i32 == 32) | (i33 == 4);
                    Object K19 = oq5Var.K();
                    if (f19 || K19 == obj5) {
                        final int i34 = 6;
                        K19 = new Function2() { // from class: s04
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                int i52 = i34;
                                boolean booleanValue = ((Boolean) obj6).booleanValue();
                                String str = (String) obj7;
                                switch (i52) {
                                    case 0:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((t14) c24Var).b, intValue, str);
                                        break;
                                    case 1:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((u14) c24Var).b, intValue, str);
                                        break;
                                    case 2:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((a24) c24Var).b, intValue, str);
                                        break;
                                    case 3:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((x14) c24Var).d, intValue, str);
                                        break;
                                    case 4:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((z14) c24Var).b.a, intValue, str);
                                        break;
                                    case 5:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((v14) c24Var).d, intValue, str);
                                        break;
                                    default:
                                        str.getClass();
                                        f14Var.f(booleanValue, ((w14) c24Var).d, intValue, str);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K19);
                    }
                    yci b14 = a.b(b13, ynnVar, 0L, 0.0f, null, (Function2) K19, 14);
                    boolean f20 = oq5Var.f(f14Var) | (i32 == 32) | (i33 == 4);
                    Object K20 = oq5Var.K();
                    if (f20 || K20 == obj5) {
                        final int i35 = 0;
                        K20 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i35) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K20);
                    }
                    Function0 function07 = (Function0) K20;
                    boolean f21 = oq5Var.f(f14Var) | (i32 == 32) | (i33 == 4);
                    Object K21 = oq5Var.K();
                    if (f21 || K21 == obj5) {
                        final int i36 = 2;
                        K21 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i36) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K21);
                    }
                    p1g.c(function07, v1gVar2, w3gVar3, b14, z, (Function0) K21, oq5Var, 0, 0);
                    oq5Var.p(false);
                } else if (c24Var instanceof y14) {
                    oq5Var.Z(-1915572375);
                    y14 y14Var = (y14) c24Var;
                    z6a Q4 = y9w.Q(y14Var.b, y14Var.c, oq5Var);
                    x1g x1gVar = y14Var.a;
                    w3g w3gVar4 = (w3g) gld.M(Q4.b(), oq5Var).getValue();
                    int i37 = i & 112;
                    int i38 = i & 14;
                    boolean f22 = oq5Var.f(f14Var) | (i37 == 32) | (i38 == 4);
                    Object K22 = oq5Var.K();
                    if (f22 || K22 == obj5) {
                        final int i39 = 3;
                        K22 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i39) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K22);
                    }
                    Function0 function08 = (Function0) K22;
                    boolean f23 = oq5Var.f(f14Var) | (i37 == 32) | (i38 == 4);
                    Object K23 = oq5Var.K();
                    if (f23 || K23 == obj5) {
                        final int i40 = 4;
                        K23 = new Function0() { // from class: t04
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i40) {
                                    case 0:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 1:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 2:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 3:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 4:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 5:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 6:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 7:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 8:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 9:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 10:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 11:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 12:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    case 13:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                    case 14:
                                        f14Var.d(c24Var, intValue);
                                        break;
                                    default:
                                        f14Var.g(c24Var, intValue);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K23);
                    }
                    w1g.a(function08, x1gVar, w3gVar4, null, z, (Function0) K23, oq5Var, 0, 8);
                    oq5Var.p(false);
                } else {
                    if (!(c24Var instanceof b24)) {
                        throw vz1.i(oq5Var, -1863102116, false);
                    }
                    oq5Var.Z(-1914858414);
                    Object K24 = oq5Var.K();
                    if (K24 == obj5) {
                        K24 = gld.R(g.a, oq5Var);
                        oq5Var.k0(K24);
                    }
                    mm6 mm6Var = (mm6) K24;
                    b24 b24Var = (b24) c24Var;
                    boolean f24 = oq5Var.f(b24Var.b);
                    Object K25 = oq5Var.K();
                    if (f24 || K25 == obj5) {
                        dou douVar = b24Var.b;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(k6l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        k6l k6lVar = (k6l) qdcVar.C(I);
                        bdt I2 = hag.I(uwu.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        uwu uwuVar = (uwu) qdcVar2.C(I2);
                        bdt I3 = hag.I(qwu.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        qwu qwuVar = (qwu) qdcVar3.C(I3);
                        bdt I4 = hag.I(zy7.class);
                        qdc qdcVar4 = l18Var.a;
                        qdcVar4.getClass();
                        K25 = f14Var.e(douVar, mm6Var, k6lVar, uwuVar, qwuVar, intValue, (zy7) qdcVar4.C(I4));
                        oq5Var.k0(K25);
                    }
                    y1g.a(b24Var.a, (owu) K25, null, null, oq5Var, 0, 12);
                    oq5Var.p(false);
                }
                return Unit.a;
            case 1:
                boolean z2 = this.b;
                sai saiVar = (sai) this.c;
                qxp qxpVar = (qxp) this.d;
                hq5 hq5Var2 = (hq5) obj3;
                if ((eta.d((Integer) obj4, (ua5) obj, (sai) obj2) & 129) == 128) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean g = oq5Var3.g(z2) | oq5Var3.f(saiVar);
                Object K26 = oq5Var3.K();
                if (g || K26 == gq5.a) {
                    vb4 vb4Var = new vb4(z2, new xiu(12, new ub4(0, saiVar, sai.class, "hide", "hide()V", 0, 1), (xzi) ((jzi) qxpVar.a).a));
                    oq5Var3.k0(vb4Var);
                    K26 = vb4Var;
                }
                h4a.d((vb4) K26, oq5Var3, 0);
                return Unit.a;
            default:
                qmv qmvVar = (qmv) this.c;
                boolean z3 = this.b;
                q0v q0vVar = (q0v) this.d;
                hq5 hq5Var3 = (hq5) obj3;
                int d = eta.d((Integer) obj4, (ua5) obj, (sai) obj2);
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(d & 1, (d & 129) != 128)) {
                    u1g.t(qmvVar.a, z3, q0vVar, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ w04(qmv qmvVar, boolean z, q0v q0vVar) {
        this.c = qmvVar;
        this.b = z;
        this.d = q0vVar;
    }

    public /* synthetic */ w04(boolean z, sai saiVar, qxp qxpVar) {
        this.b = z;
        this.c = saiVar;
        this.d = qxpVar;
    }
}
