package defpackage;

import androidx.compose.ui.graphics.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class no5 implements tyc {
    public final /* synthetic */ int a;

    public /* synthetic */ no5(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        final int i6 = 1;
        switch (this.a) {
            case 0:
                dh3 dh3Var = (dh3) obj;
                ges gesVar = (ges) obj2;
                ges gesVar2 = (ges) obj3;
                hq5 hq5Var = (hq5) obj4;
                int intValue = ((Integer) obj5).intValue();
                dh3Var.getClass();
                gesVar.getClass();
                gesVar2.getClass();
                if ((intValue & 6) == 0) {
                    i = (((oq5) hq5Var).f(dh3Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((oq5) hq5Var).f(gesVar) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i |= ((oq5) hq5Var).f(gesVar2) ? 256 : 128;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 1171) != 1170)) {
                    iz2 iz2Var = b2c.b;
                    vci vciVar = vci.a;
                    yci a = dh3Var.a(vciVar, iz2Var);
                    String M = rvf.M(R.string.mixes_block_item_title_view_all_button, oq5Var);
                    agr agrVar = eq0.a;
                    xcs.b(M, a, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, gesVar, oq5Var, 0, ((i << 15) & 3670016) | 48, 63480);
                    xcs.b(rvf.M(R.string.mixes_block_item_description_view_all_button, oq5Var), dh3Var.a(vciVar, b2c.h), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, gesVar2, oq5Var, 0, ((i << 12) & 3670016) | 3120, 55288);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                final int intValue2 = ((Integer) obj).intValue();
                yci yciVar = (yci) obj2;
                final o3k o3kVar = (o3k) obj3;
                hq5 hq5Var2 = (hq5) obj4;
                int intValue3 = ((Integer) obj5).intValue();
                yciVar.getClass();
                o3kVar.getClass();
                if ((intValue3 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).d(intValue2) ? 4 : 2) | intValue3;
                } else {
                    i2 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).f(yciVar) ? 32 : 16;
                }
                if ((intValue3 & 384) == 0) {
                    i2 |= ((oq5) hq5Var2).f(o3kVar) ? 256 : 128;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
                    long j = crj.a;
                    final Object[] objArr = null == true ? 1 : 0;
                    g0g.d(2131232105, 48, j, oq5Var2, a.a(yciVar, new Function1() { // from class: krj
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i7 = objArr;
                            zco zcoVar = (zco) obj6;
                            zcoVar.getClass();
                            switch (i7) {
                                case 0:
                                    o3k o3kVar2 = o3kVar;
                                    o3kVar2.getClass();
                                    float k = o3kVar2.k() + (o3kVar2.j() - intValue2);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k);
                                    zcoVar.a(1 - ((Math.abs(k) - 0.25f) / 0.25f));
                                    break;
                                default:
                                    o3k o3kVar3 = o3kVar;
                                    o3kVar3.getClass();
                                    float k2 = o3kVar3.k() + (o3kVar3.j() - intValue2);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k2);
                                    zcoVar.a(1 - (Math.abs(k2) / 0.5f));
                                    break;
                            }
                            return Unit.a;
                        }
                    }));
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                final int intValue4 = ((Integer) obj).intValue();
                yci yciVar2 = (yci) obj2;
                final o3k o3kVar2 = (o3k) obj3;
                hq5 hq5Var3 = (hq5) obj4;
                int intValue5 = ((Integer) obj5).intValue();
                yciVar2.getClass();
                o3kVar2.getClass();
                if ((intValue5 & 6) == 0) {
                    i3 = (((oq5) hq5Var3).d(intValue4) ? 4 : 2) | intValue5;
                } else {
                    i3 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i3 |= ((oq5) hq5Var3).f(yciVar2) ? 32 : 16;
                }
                if ((intValue5 & 384) == 0) {
                    i3 |= ((oq5) hq5Var3).f(o3kVar2) ? 256 : 128;
                }
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(i3 & 1, (i3 & 1171) != 1170)) {
                    a0g.i(0, oq5Var3, a.a(yciVar2, new Function1() { // from class: krj
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i7 = i6;
                            zco zcoVar = (zco) obj6;
                            zcoVar.getClass();
                            switch (i7) {
                                case 0:
                                    o3k o3kVar22 = o3kVar2;
                                    o3kVar22.getClass();
                                    float k = o3kVar22.k() + (o3kVar22.j() - intValue4);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k);
                                    zcoVar.a(1 - ((Math.abs(k) - 0.25f) / 0.25f));
                                    break;
                                default:
                                    o3k o3kVar3 = o3kVar2;
                                    o3kVar3.getClass();
                                    float k2 = o3kVar3.k() + (o3kVar3.j() - intValue4);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k2);
                                    zcoVar.a(1 - (Math.abs(k2) / 0.5f));
                                    break;
                            }
                            return Unit.a;
                        }
                    }), u75.h(2131232510, 2131232511, 2131232512, 2131232513, 2131232514));
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                final int intValue6 = ((Integer) obj).intValue();
                yci yciVar3 = (yci) obj2;
                final o3k o3kVar3 = (o3k) obj3;
                hq5 hq5Var4 = (hq5) obj4;
                int intValue7 = ((Integer) obj5).intValue();
                yciVar3.getClass();
                o3kVar3.getClass();
                if ((intValue7 & 6) == 0) {
                    i4 = (((oq5) hq5Var4).d(intValue6) ? 4 : 2) | intValue7;
                } else {
                    i4 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i4 |= ((oq5) hq5Var4).f(yciVar3) ? 32 : 16;
                }
                if ((intValue7 & 384) == 0) {
                    i4 |= ((oq5) hq5Var4).f(o3kVar3) ? 256 : 128;
                }
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(i4 & 1, (i4 & 1171) != 1170)) {
                    long j2 = crj.b;
                    final Object[] objArr2 = null == true ? 1 : 0;
                    g0g.d(2131231147, 48, j2, oq5Var4, androidx.compose.foundation.a.b(a.a(yciVar3, new Function1() { // from class: krj
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i7 = objArr2;
                            zco zcoVar = (zco) obj6;
                            zcoVar.getClass();
                            switch (i7) {
                                case 0:
                                    o3k o3kVar22 = o3kVar3;
                                    o3kVar22.getClass();
                                    float k = o3kVar22.k() + (o3kVar22.j() - intValue6);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k);
                                    zcoVar.a(1 - ((Math.abs(k) - 0.25f) / 0.25f));
                                    break;
                                default:
                                    o3k o3kVar32 = o3kVar3;
                                    o3kVar32.getClass();
                                    float k2 = o3kVar32.k() + (o3kVar32.j() - intValue6);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k2);
                                    zcoVar.a(1 - (Math.abs(k2) / 0.5f));
                                    break;
                            }
                            return Unit.a;
                        }
                    }), crj.c, vnj.i));
                } else {
                    oq5Var4.S();
                }
                break;
            default:
                final int intValue8 = ((Integer) obj).intValue();
                yci yciVar4 = (yci) obj2;
                final o3k o3kVar4 = (o3k) obj3;
                hq5 hq5Var5 = (hq5) obj4;
                int intValue9 = ((Integer) obj5).intValue();
                yciVar4.getClass();
                o3kVar4.getClass();
                if ((intValue9 & 6) == 0) {
                    i5 = (((oq5) hq5Var5).d(intValue8) ? 4 : 2) | intValue9;
                } else {
                    i5 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i5 |= ((oq5) hq5Var5).f(yciVar4) ? 32 : 16;
                }
                if ((intValue9 & 384) == 0) {
                    i5 |= ((oq5) hq5Var5).f(o3kVar4) ? 256 : 128;
                }
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(i5 & 1, (i5 & 1171) != 1170)) {
                    a0g.i(0, oq5Var5, a.a(yciVar4, new Function1() { // from class: krj
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i7 = i6;
                            zco zcoVar = (zco) obj6;
                            zcoVar.getClass();
                            switch (i7) {
                                case 0:
                                    o3k o3kVar22 = o3kVar4;
                                    o3kVar22.getClass();
                                    float k = o3kVar22.k() + (o3kVar22.j() - intValue8);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k);
                                    zcoVar.a(1 - ((Math.abs(k) - 0.25f) / 0.25f));
                                    break;
                                default:
                                    o3k o3kVar32 = o3kVar4;
                                    o3kVar32.getClass();
                                    float k2 = o3kVar32.k() + (o3kVar32.j() - intValue8);
                                    zcoVar.x(Float.intBitsToFloat((int) (zcoVar.p >> 32)) * k2);
                                    zcoVar.a(1 - (Math.abs(k2) / 0.5f));
                                    break;
                            }
                            return Unit.a;
                        }
                    }), u75.h(2131231018, 2131231019, 2131231020, 2131231021, 2131231022));
                } else {
                    oq5Var5.S();
                }
                break;
        }
        return Unit.a;
    }
}
