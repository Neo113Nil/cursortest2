package defpackage;

import com.yandex.music.core.ui.compose.b;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.sloth.ui.c;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class rt5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rt5(p pVar, int i, a aVar, c cVar) {
        this.a = 4;
        this.c = pVar;
        this.b = i;
        this.d = aVar;
        this.e = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        final int i2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                wct wctVar = (wct) obj4;
                final lvf lvfVar = (lvf) obj3;
                final ut5 ut5Var = (ut5) obj2;
                bsf bsfVar = (bsf) obj;
                bsfVar.getClass();
                if (!(wctVar instanceof gt5)) {
                    if (!(wctVar instanceof ft5)) {
                        b6e.s();
                        return null;
                    }
                    for (int i3 = 0; i3 < 20; i3++) {
                        bsf.X(bsfVar, null, new wn5(new tt5(r2, wctVar), -1478441111, true), 7);
                    }
                } else if (lvfVar != null) {
                    bsfVar.Y(lvfVar.d(), new u8b(9, lvfVar), new u8b(8, lvfVar), new wn5(new ryc() { // from class: st5
                        @Override // defpackage.ryc
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int intValue = ((Integer) obj6).intValue();
                            hq5 hq5Var = (hq5) obj7;
                            int intValue2 = ((Integer) obj8).intValue();
                            ((dsf) obj5).getClass();
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                            }
                            if ((intValue2 & 145) == 144) {
                                oq5 oq5Var = (oq5) hq5Var;
                                if (oq5Var.z()) {
                                    oq5Var.S();
                                    return Unit.a;
                                }
                            }
                            ht5 ht5Var = (ht5) lvf.this.c(intValue);
                            if (ht5Var == null) {
                                return Unit.a;
                            }
                            int i4 = i2;
                            Object spdVar = new spd(intValue % i4, intValue / i4, intValue);
                            oq5 oq5Var2 = (oq5) hq5Var;
                            oq5Var2.Z(966469337);
                            ct5 ct5Var = ht5Var.b;
                            ut5 ut5Var2 = ut5Var;
                            boolean h = oq5Var2.h(ut5Var2) | oq5Var2.h(ht5Var) | oq5Var2.h(spdVar);
                            Object K = oq5Var2.K();
                            Object obj9 = gq5.a;
                            if (h || K == obj9) {
                                K = new vd(13, ut5Var2, ht5Var, spdVar);
                                oq5Var2.k0(K);
                            }
                            Function0 function0 = (Function0) K;
                            boolean z = ut5Var2.g;
                            boolean h2 = oq5Var2.h(ut5Var2) | oq5Var2.h(ht5Var) | oq5Var2.h(spdVar);
                            Object K2 = oq5Var2.K();
                            if (h2 || K2 == obj9) {
                                K2 = new sh1(24, ut5Var2, ht5Var, spdVar);
                                oq5Var2.k0(K2);
                            }
                            qwp.i(ct5Var, function0, z, b.b(androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K2, 15), "concert_card"), intValue), oq5Var2, 8);
                            oq5Var2.p(false);
                            return Unit.a;
                        }
                    }, -1435900376, true));
                }
                return Unit.a;
            case 1:
                qls qlsVar = (qls) obj;
                qlsVar.getClass();
                ((j6i) obj4).l(null, (mqs) obj3, this.b, (String) obj2, qlsVar);
                return Unit.a;
            case 2:
                ksk kskVar = (ksk) obj4;
                ksk kskVar2 = (ksk) obj3;
                mfh mfhVar = (mfh) obj2;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                jskVar.d(kskVar, 0, 0, 0.0f);
                if (kskVar2 != null) {
                    int i4 = kskVar.a;
                    int s0 = mfhVar.s0(v7g.y(2.5d)) + (i2 - kskVar2.b);
                    jskVar.d(kskVar2, i4, s0 >= 0 ? s0 : 0, 0.0f);
                }
                return Unit.a;
            case 3:
                sdr sdrVar = (sdr) obj2;
                jsk jskVar2 = (jsk) obj;
                jskVar2.getClass();
                float f = qzv.a;
                int i5 = -((u6k) obj3).h();
                int i6 = 0;
                for (Object obj5 : (ArrayList) obj4) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        u75.n();
                        throw null;
                    }
                    ksk kskVar3 = (ksk) obj5;
                    jsk.g(jskVar2, kskVar3, (i6 == 0 ? 0 : Float.valueOf((((Number) sdrVar.getValue()).floatValue() * r5.h()) + i5)).intValue(), (i2 - kskVar3.b) / 2);
                    i5 += (int) (kskVar3.a * 0.6666667f);
                    i6 = i7;
                }
                return Unit.a;
            default:
                com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c cVar = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.radio.button.c) obj;
                cVar.getClass();
                ((p) obj4).u(i2, cVar, (a) obj3, (c) obj2);
                return Unit.a;
        }
    }

    public /* synthetic */ rt5(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }
}
