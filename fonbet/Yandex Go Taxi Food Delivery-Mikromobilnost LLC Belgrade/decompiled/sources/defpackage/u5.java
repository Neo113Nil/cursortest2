package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.n;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.yandex.go.design.compose.spinner.SpinnerState;
import com.yandex.passport.api.h;
import com.yandex.xplat.common.YSError;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes12.dex */
public final /* synthetic */ class u5 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5(nf4 nf4Var, cn90 cn90Var, String str) {
        this.a = 27;
        this.c = nf4Var;
        this.b = str;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        p5v0 p5v0Var = (p5v0) this.c;
        Object obj4 = (tls) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = 0;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            for (f7v0 f7v0Var : p5v0Var.a) {
                AppColor$Palette appColor$Palette = AppColor$Palette.ControlMinor;
                xw91 xw91Var = ((nx2) btsVar.m(uy2.c)).b;
                byk0 c = cyk0.c(13.0f);
                c530 c530Var = c530.a;
                f530 c2 = bzk0.c(c530Var, appColor$Palette, c);
                boolean k = btsVar.k(obj4) | btsVar.e(f7v0Var);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new j0(i, obj4, f7v0Var);
                    btsVar.o0(Q);
                }
                f530 l = an91.l(q791.d(c2, true, null, null, (sls) Q, 14), 14.0f, 13.0f);
                lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, l);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, a);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d);
                if (f7v0Var.a != null) {
                    btsVar.e0(-1238320219);
                    v0b1.a(mja1.a(f7v0Var.a, null, 6), ljs0.m(an91.o(c530Var, 0.0f, 0.0f, 5.0f, 0.0f, 11), 14.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1238120982);
                    btsVar.t(false);
                }
                jeb1.f(f7v0Var.b, null, null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar).h.a, btsVar, 805306368, 48, 13822);
                btsVar.t(true);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        we weVar = (we) this.c;
        tls tlsVar = (tls) this.b;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        int i = 0;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            String str = weVar.d;
            if (str == null || str.length() == 0) {
                btsVar.e0(1791057710);
                btsVar.t(false);
            } else {
                btsVar.e0(1790757878);
                boolean k = btsVar.k(tlsVar);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new o0(7, tlsVar);
                    btsVar.o0(Q);
                }
                d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), true, ButtonSize.XS, ButtonStyle.Minor, ButtonForm.Circle, (sls) Q, wwg.S(-1120450712, true, new le(str, i), btsVar), btsVar, 1573248, 0);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        nvi0 nvi0Var = (nvi0) this.c;
        CharSequence charSequence = (CharSequence) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 14.0f, 0.0f, 14.0f, 0.0f, 10);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (nvi0Var != null) {
                btsVar.e0(620804713);
                v0b1.a(nvi0Var, an91.o(c530Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                btsVar.t(false);
            } else {
                btsVar.e0(620912345);
                btsVar.t(false);
            }
            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 1, 0, xya1.e(btsVar).h.b, null, btsVar, 0, 6, 11262);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final Object f(Object obj, Object obj2, Object obj3) {
        f530 f530Var;
        bts btsVar;
        Object obj4;
        c530 c530Var;
        final int i;
        Object obj5;
        final ?? r7;
        Object obj6;
        qh0 qh0Var = (qh0) this.c;
        final tls tlsVar = (tls) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i2 = 1;
        bts btsVar2 = (bts) fidVar;
        boolean V = btsVar2.V(intValue & 1, (intValue & 17) != 16);
        dmw0 dmw0Var = btsVar2.a;
        if (V) {
            c530 c530Var2 = c530.a;
            float f = 1.0f;
            f530 c = ljs0.c(c530Var2, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            f530 o2 = an91.o(c530Var2, 8.0f, 4.0f, 8.0f, 0.0f, 8);
            c530 c530Var3 = c530Var2;
            boolean b = btsVar2.b(4.0f) | btsVar2.c(2) | btsVar2.a(false);
            Object Q = btsVar2.Q();
            Object obj7 = did.a;
            Object obj8 = Q;
            if (b || Q == obj7) {
                Object jg0Var = new jg0(i2);
                btsVar2.o0(jg0Var);
                obj8 = jg0Var;
            }
            z910 z910Var = (z910) obj8;
            Object obj9 = obj7;
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d2 = b.d(btsVar2, o2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, z910Var);
            qje.W(btsVar2, wlsVar2, o3);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar4, d2);
            btsVar2.e0(180112298);
            for (final lh0 lh0Var : qh0Var.b) {
                if (lh0Var.b) {
                    btsVar2.e0(1565680810);
                    f530 c2 = ljs0.c(c530Var3, f);
                    boolean k = btsVar2.k(tlsVar) | btsVar2.k(lh0Var);
                    Object Q2 = btsVar2.Q();
                    if (k) {
                        obj4 = obj9;
                    } else {
                        obj4 = obj9;
                        if (Q2 != obj4) {
                            r7 = 1;
                            obj6 = Q2;
                            a S = wwg.S(1049102843, r7, new zls() { // from class: di0
                                @Override // defpackage.zls
                                public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                    int i3 = r7;
                                    zy11 zy11Var = zy11.a;
                                    lh0 lh0Var2 = lh0Var;
                                    switch (i3) {
                                        case 0:
                                            fid fidVar2 = (fid) obj11;
                                            int intValue2 = ((Integer) obj12).intValue();
                                            bts btsVar3 = (bts) fidVar2;
                                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                btsVar3.Y();
                                                break;
                                            } else {
                                                jeb1.f(lh0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.a, btsVar3, 0, 0, 16382);
                                                break;
                                            }
                                        default:
                                            fid fidVar3 = (fid) obj11;
                                            int intValue3 = ((Integer) obj12).intValue();
                                            bts btsVar4 = (bts) fidVar3;
                                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                btsVar4.Y();
                                                break;
                                            } else {
                                                jeb1.f(lh0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.b, btsVar4, 0, 0, 16382);
                                                break;
                                            }
                                    }
                                    return zy11Var;
                                }
                            }, btsVar2);
                            c530Var = c530Var3;
                            ohb1.b(c2, false, null, (sls) obj6, S, btsVar2, 24582, 6);
                            btsVar2.t(false);
                        }
                    }
                    r7 = 1;
                    final boolean z = true ? 1 : 0;
                    Object obj10 = new sls() { // from class: ci0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i3 = z;
                            zy11 zy11Var = zy11.a;
                            lh0 lh0Var2 = lh0Var;
                            tls tlsVar3 = tlsVar;
                            switch (i3) {
                                case 0:
                                    tlsVar3.invoke(lh0Var2.c);
                                    break;
                                default:
                                    tlsVar3.invoke(lh0Var2.c);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(obj10);
                    obj6 = obj10;
                    a S2 = wwg.S(1049102843, r7, new zls() { // from class: di0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj102, Object obj11, Object obj12) {
                            int i3 = r7;
                            zy11 zy11Var = zy11.a;
                            lh0 lh0Var2 = lh0Var;
                            switch (i3) {
                                case 0:
                                    fid fidVar2 = (fid) obj11;
                                    int intValue2 = ((Integer) obj12).intValue();
                                    bts btsVar3 = (bts) fidVar2;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        jeb1.f(lh0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.a, btsVar3, 0, 0, 16382);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj11;
                                    int intValue3 = ((Integer) obj12).intValue();
                                    bts btsVar4 = (bts) fidVar3;
                                    if (!btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        jeb1.f(lh0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.b, btsVar4, 0, 0, 16382);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar2);
                    c530Var = c530Var3;
                    ohb1.b(c2, false, null, (sls) obj6, S2, btsVar2, 24582, 6);
                    btsVar2.t(false);
                } else {
                    obj4 = obj9;
                    c530Var = c530Var3;
                    btsVar2.e0(1565957640);
                    f530 c3 = ljs0.c(c530Var, f);
                    boolean k2 = btsVar2.k(tlsVar) | btsVar2.k(lh0Var);
                    Object Q3 = btsVar2.Q();
                    if (k2 || Q3 == obj4) {
                        i = 0;
                        Object obj11 = new sls() { // from class: ci0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i3 = i;
                                zy11 zy11Var = zy11.a;
                                lh0 lh0Var2 = lh0Var;
                                tls tlsVar3 = tlsVar;
                                switch (i3) {
                                    case 0:
                                        tlsVar3.invoke(lh0Var2.c);
                                        break;
                                    default:
                                        tlsVar3.invoke(lh0Var2.c);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(obj11);
                        obj5 = obj11;
                    } else {
                        i = 0;
                        obj5 = Q3;
                    }
                    ulb1.a(c3, false, null, (sls) obj5, wwg.S(-189569052, true, new zls() { // from class: di0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj102, Object obj112, Object obj12) {
                            int i3 = i;
                            zy11 zy11Var = zy11.a;
                            lh0 lh0Var2 = lh0Var;
                            switch (i3) {
                                case 0:
                                    fid fidVar2 = (fid) obj112;
                                    int intValue2 = ((Integer) obj12).intValue();
                                    bts btsVar3 = (bts) fidVar2;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        jeb1.f(lh0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.a, btsVar3, 0, 0, 16382);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj112;
                                    int intValue3 = ((Integer) obj12).intValue();
                                    bts btsVar4 = (bts) fidVar3;
                                    if (!btsVar4.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        jeb1.f(lh0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.b, btsVar4, 0, 0, 16382);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar2), btsVar2, 24582, 6);
                    btsVar2.t(i);
                }
                obj9 = obj4;
                c530Var3 = c530Var;
                f = 1.0f;
            }
            Object obj12 = obj9;
            c530 c530Var4 = c530Var3;
            btsVar2.t(false);
            btsVar2.t(true);
            oh0 oh0Var = qh0Var.c;
            if (oh0Var == null) {
                btsVar2.e0(-1951046904);
                btsVar2.t(false);
                btsVar = btsVar2;
            } else {
                btsVar2.e0(-1951046903);
                f530 j = vfc.j(x4c.H, an91.l(c530Var4, 16.0f, 9.0f));
                if (oh0Var.b != null) {
                    btsVar2.e0(1035371666);
                    boolean k3 = btsVar2.k(tlsVar) | btsVar2.k(oh0Var);
                    Object Q4 = btsVar2.Q();
                    Object obj13 = Q4;
                    if (k3 || Q4 == obj12) {
                        Object qg0Var = new qg0(tlsVar, oh0Var, 2);
                        btsVar2.o0(qg0Var);
                        obj13 = qg0Var;
                    }
                    f530Var = q791.d(c530Var4, false, null, null, (sls) obj13, 15);
                    btsVar2.t(false);
                } else {
                    f530Var = c530Var4;
                    btsVar2.e0(1035457846);
                    btsVar2.t(false);
                }
                qgy.b(oh0Var.a, null, j.k(f530Var), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, 0, 0, 12282);
                bts btsVar3 = btsVar2;
                btsVar3.t(false);
                btsVar = btsVar3;
            }
            btsVar.t(true);
        } else {
            btsVar2.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        n81 n81Var = (n81) this.c;
        tls tlsVar = (tls) this.b;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            doa1.d(ibp0Var, n81Var, null, tlsVar, btsVar, intValue & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ix0 ix0Var = (ix0) this.c;
        jfv jfvVar = (jfv) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            v0b1.a(ix0Var.a.a, null, null, null, wwg.S(390508851, true, new tn1(9, ix0Var), btsVar), jfvVar, null, null, 0.0f, 0, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 974);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        byk0 byk0Var = (byk0) this.c;
        PlainAddress plainAddress = (PlainAddress) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            c530 c530Var = c530.a;
            f530 c = bzk0.c(ljs0.m(an91.o(c530Var, 12.0f, 0.0f, 8.0f, 0.0f, 10), 40.0f), AppColor$Palette.ControlMinor, byk0Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            String str = plainAddress.getAddress().n;
            if (str == null) {
                btsVar.e0(1959121789);
                btsVar.t(false);
            } else {
                btsVar.e0(1959121790);
                v0b1.a(mja1.a(str, null, 6), cj6.a.a(c530Var, x4c.y), null, null, null, null, null, mhe.e, 0.0f, 0, btsVar, 12582912, 892);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        z91 z91Var = (z91) this.c;
        tls tlsVar = (tls) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            yrl.e(null, null, btsVar, 0, 7);
            doa1.b(z91Var.b, null, tlsVar, btsVar, 0, 2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        xp1 xp1Var = (xp1) this.c;
        tls tlsVar = (tls) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (jl40.l(xp1Var, wp1.a)) {
            btsVar.e0(1717036291);
            com.yandex.go.ai_widget.ui.a.j(tlsVar, btsVar, 0);
            btsVar.t(false);
        } else if (xp1Var instanceof vp1) {
            btsVar.e0(1717038634);
            com.yandex.go.ai_widget.ui.a.g((vp1) xp1Var, tlsVar, btsVar, 0);
            btsVar.t(false);
        } else {
            if (!(xp1Var instanceof up1)) {
                throw unr0.y(1717034600, btsVar, false);
            }
            btsVar.e0(1717041259);
            com.yandex.go.ai_widget.ui.a.f((up1) xp1Var, tlsVar, btsVar, 0);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        LayoutDirection layoutDirection = (LayoutDirection) this.c;
        a aVar = (a) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            sb2.b(j.n.a(layoutDirection), aVar, btsVar, 8);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.b;
        z12 z12Var = (z12) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new a0(7, tlsVar);
                btsVar.o0(Q);
            }
            f530 b = xm91.b(c530.a, (tls) Q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            msa1.h(z12Var.a, z12Var.b, z12Var.c, btsVar, 0);
            xo70 xo70Var = z12Var.d;
            if (xo70Var instanceof vo70) {
                btsVar.e0(1047625414);
                msa1.a((vo70) xo70Var, tlsVar, btsVar, 0);
                btsVar.t(false);
            } else {
                if (!(xo70Var instanceof wo70)) {
                    throw unr0.y(1047622835, btsVar, false);
                }
                btsVar.e0(1047627849);
                msa1.e((wo70) xo70Var, tlsVar, btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.b;
        wo70 wo70Var = (wo70) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            f530 k = an91.k(ljs0.c(c530.a, 1.0f), 8.0f);
            boolean k2 = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k2 || Q == did.a) {
                Q = new o0(23, tlsVar);
                btsVar.o0(Q);
            }
            ohb1.b(k, false, null, (sls) Q, wwg.S(-1994599146, true, new bj0(12, wo70Var), btsVar), btsVar, 24582, 6);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        wp2 wp2Var = (wp2) this.c;
        qor qorVar = (qor) this.b;
        f530 f530Var = (f530) obj;
        ((Integer) obj3).getClass();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(1874411276);
        fwi fwiVar = (fwi) btsVar.m(j.h);
        boolean b = btsVar.b(24.0f);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (b || Q == o430Var) {
            Q = Float.valueOf(fwiVar.w0(24.0f));
            btsVar.o0(Q);
        }
        float floatValue = ((Number) Q).floatValue();
        long n = tje.n(wp2Var, btsVar);
        boolean b2 = btsVar.b(floatValue) | btsVar.k(qorVar) | btsVar.d(n);
        Object Q2 = btsVar.Q();
        if (b2 || Q2 == o430Var) {
            Q2 = new eg2(floatValue, qorVar, n);
            btsVar.o0(Q2);
        }
        f530 i = bb1.i(f530Var, (tls) Q2);
        btsVar.t(false);
        return i;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        nf4 nf4Var = (nf4) this.c;
        String str = (String) this.b;
        tls tlsVar = (tls) obj2;
        tls tlsVar2 = (tls) obj3;
        try {
            i3y i3yVar = np90.a;
            h.a(nf4Var.a).a(str);
            tlsVar.invoke(Boolean.TRUE);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getName();
            }
            tlsVar2.invoke(new YSError(message, th));
        }
        return zy11.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        j690 j690Var = (j690) this.c;
        bjy bjyVar = (bjy) this.b;
        dj6 dj6Var = (dj6) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        long j = dj6Var.b;
        int i = 4;
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.g(n8e.i(j));
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.g(n8e.h(j));
                btsVar.o0(Q2);
            }
            yx40 yx40Var2 = (yx40) Q2;
            f530 j2 = an91.j(c530.a, j690Var);
            Pair[] pairArr = (Pair[]) bjyVar.a.toArray(new Pair[0]);
            f530 b = cj6.a.b(m4m0.a(j2, ru.yandex.taxi.logistics.sdk.ui.component.misc.b.e((Pair[]) Arrays.copyOf(pairArr, pairArr.length), yx40Var.getIntValue(), yx40Var2.getIntValue(), bjyVar.b, 0), null, 6));
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new w04(i, yx40Var2, yx40Var);
                btsVar.o0(Q3);
            }
            pi6.a(xm91.b(b, (tls) Q3), btsVar, 0);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.b;
        fao faoVar = (fao) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        so5 so5Var = x4c.H;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            k3r k3rVar = ljs0.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.n(c530Var, 56.0f, 64.0f), 16.0f);
            boolean k2 = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k2 || Q == o430Var) {
                Q = new s140(24, tlsVar);
                btsVar.o0(Q);
            }
            sya1.a(vza1.c(), q791.b(k, null, null, false, null, new awk0(0), (sls) Q, 12), null, null, btsVar, 0, 12);
            uic uicVar = uic.a;
            oeb1.c(btsVar, uicVar.b(c530Var, 1.0f, true));
            nvi0 nvi0Var = faoVar.d;
            if (nvi0Var == null) {
                btsVar.e0(1412914376);
                btsVar.t(false);
            } else {
                btsVar.e0(1412914377);
                v0b1.a(nvi0Var, uicVar.a(so5Var, c530Var), null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1020);
                btsVar = btsVar;
                btsVar.t(false);
            }
            bts btsVar2 = btsVar;
            jeb1.f(ohb1.e(btsVar, faoVar.a), uicVar.a(so5Var, an91.m(c530Var, 16.0f, 0.0f, 2)), null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.d, btsVar2, 0, 0, 16252);
            jeb1.f(ohb1.e(btsVar2, faoVar.c), uicVar.a(so5Var, an91.m(an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 2)), null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 0, 0, 16252);
            oeb1.c(btsVar2, uicVar.b(c530Var, 1.0f, true));
            f530 d2 = i9a1.d(an91.o(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2));
            boolean k3 = btsVar2.k(tlsVar);
            Object Q2 = btsVar2.Q();
            if (k3 || Q2 == o430Var) {
                Q2 = new s140(25, tlsVar);
                btsVar2.o0(Q2);
            }
            ohb1.b(d2, false, null, (sls) Q2, wwg.S(1859971281, true, new wg30(19, faoVar), btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
            btsVar2.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        iwl0 iwl0Var = (iwl0) this.c;
        tls tlsVar = (tls) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            k3r k3rVar = ljs0.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            nwa1.a(iwl0Var, tlsVar, an91.m(ljs0.c(c530.a, 1.0f).k(new x2y(1.0f, true)), 16.0f, 0.0f, 2), btsVar, 0);
            nwa1.c(iwl0Var.f, tlsVar, btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        exl0 exl0Var = (exl0) this.c;
        tls tlsVar = (tls) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            k3r k3rVar = ljs0.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            twa1.a(exl0Var, tlsVar, ljs0.c(c530.a, 1.0f).k(new x2y(1.0f, true)), btsVar, 0);
            twa1.c(exl0Var, tlsVar, btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        eyl0 eyl0Var = (eyl0) this.c;
        tls tlsVar = (tls) this.b;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            f530 c = bzk0.c(ljs0.c, AppColor$Palette.Background, qke.q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            if (eyl0Var instanceof dyl0) {
                btsVar.e0(1985601637);
                fu91.e((dyl0) eyl0Var, tlsVar, btsVar, 0);
                btsVar.t(false);
            } else {
                if (!(eyl0Var instanceof cyl0)) {
                    throw unr0.y(1985599534, btsVar, false);
                }
                btsVar.e0(1985604670);
                fu91.d((cyl0) eyl0Var, tlsVar, btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object w(Object obj, Object obj2, Object obj3) {
        tls tlsVar = (tls) this.b;
        h141 h141Var = (h141) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            k3r k3rVar = ljs0.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            c530 c530Var = c530.a;
            f530 k = an91.k(ljs0.n(c530Var, 64.0f, 64.0f), 20.0f);
            boolean k2 = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k2 || Q == o430Var) {
                Q = new fc01(10, tlsVar);
                btsVar.o0(Q);
            }
            sya1.a(vza1.c(), q791.b(k, null, null, false, null, new awk0(0), (sls) Q, 12), null, null, btsVar, 0, 12);
            uic uicVar = uic.a;
            oeb1.c(btsVar, uicVar.b(c530Var, 1.0f, true));
            f530 m = ljs0.m(c530Var, 120.0f);
            so5 so5Var = x4c.H;
            o4b1.b(mt71.m(h141Var.a, 0, btsVar), null, uicVar.a(so5Var, m), null, null, 0.0f, null, btsVar, 56, 120);
            f530 a2 = uicVar.a(so5Var, an91.m(c530Var, 16.0f, 0.0f, 2));
            String e = ohb1.e(btsVar, h141Var.b);
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(e, a2, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 384, 0, 16248);
            jeb1.f(ohb1.e(btsVar, h141Var.c), uicVar.a(so5Var, an91.m(an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 2)), appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 384, 0, 16248);
            oeb1.c(btsVar, uicVar.b(c530Var, 1.0f, true));
            f530 d2 = i9a1.d(an91.o(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2));
            boolean k3 = btsVar.k(tlsVar);
            Object Q2 = btsVar.Q();
            if (k3 || Q2 == o430Var) {
                Q2 = new fc01(11, tlsVar);
                btsVar.o0(Q2);
            }
            ohb1.b(d2, false, null, (sls) Q2, wwg.S(2007418118, true, new jvx0(27, h141Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v10, types: [f530, qor] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v110, types: [int] */
    /* JADX WARN: Type inference failed for: r3v120 */
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r1;
        boolean z;
        ?? r14;
        final ?? r11;
        Object obj4;
        final ?? r142;
        Object obj5;
        zy11 zy11Var;
        tls tlsVar;
        boolean z2;
        int i;
        ?? r3;
        boolean z3;
        int i2 = this.a;
        int i3 = 18;
        cj6 cj6Var = cj6.a;
        g43 g43Var = lr20.c;
        Object obj6 = did.a;
        c530 c530Var = c530.a;
        zy11 zy11Var2 = zy11.a;
        Object obj7 = this.b;
        Object obj8 = this.c;
        switch (i2) {
            case 0:
                e6 e6Var = (e6) obj8;
                tls tlsVar2 = (tls) obj7;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                ?? r0 = (bts) fidVar;
                boolean V = r0.V(intValue & 1, (intValue & 17) != 16);
                dmw0 dmw0Var = r0.a;
                if (V) {
                    so5 so5Var = x4c.G;
                    sic a = qic.a(g43Var, so5Var, r0, 0);
                    int hashCode = Long.hashCode(r0.T);
                    r1b0 o = r0.o();
                    c530 c530Var2 = c530.a;
                    f530 d = b.d(r0, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    r0.i0();
                    if (r0.S) {
                        r0.n(slsVar);
                    } else {
                        r0.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(r0, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(r0, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(r0, wlsVar3, valueOf);
                    tls tlsVar3 = d.h;
                    qje.M(r0, tlsVar3);
                    wls wlsVar4 = d.d;
                    qje.W(r0, wlsVar4, d);
                    w1d.a.getClass();
                    crb1.b(null, w1d.b, null, w1d.c, null, null, null, r0, 3120, HProv.PP_NK_SYNC);
                    yrl.b(0, 7, r0, null);
                    f530 u = pw91.u(ljs0.c, pw91.o(r0), 14);
                    sic a2 = qic.a(g43Var, so5Var, r0, 0);
                    int hashCode2 = Long.hashCode(r0.T);
                    r1b0 o2 = r0.o();
                    f530 d2 = b.d(r0, u);
                    r0.i0();
                    if (r0.S) {
                        r0.n(slsVar);
                    } else {
                        r0.r0();
                    }
                    qje.W(r0, wlsVar, a2);
                    qje.W(r0, wlsVar2, o2);
                    vfc.v(hashCode2, r0, wlsVar3, r0, tlsVar3);
                    qje.W(r0, wlsVar4, d2);
                    so5 so5Var2 = x4c.H;
                    f530 o3 = an91.o(new ypu(so5Var2), 0.0f, 48.0f, 0.0f, 40.0f, 5);
                    sic a3 = qic.a(g43Var, so5Var2, r0, 48);
                    int hashCode3 = Long.hashCode(r0.T);
                    r1b0 o4 = r0.o();
                    f530 d3 = b.d(r0, o3);
                    r0.i0();
                    if (r0.S) {
                        r0.n(slsVar);
                    } else {
                        r0.r0();
                    }
                    qje.W(r0, wlsVar, a3);
                    qje.W(r0, wlsVar2, o4);
                    vfc.v(hashCode3, r0, wlsVar3, r0, tlsVar3);
                    qje.W(r0, wlsVar4, d3);
                    f530 i4 = ljs0.i(new ypu(so5Var2), 128.0f);
                    boolean k = r0.k(tlsVar2);
                    Object Q = r0.Q();
                    Object obj9 = Q;
                    if (k || Q == obj6) {
                        o0 o0Var = new o0(1, tlsVar2);
                        r0.o0(o0Var);
                        obj9 = o0Var;
                    }
                    sls slsVar2 = (sls) obj9;
                    boolean k2 = r0.k(tlsVar2);
                    Object Q2 = r0.Q();
                    Object obj10 = Q2;
                    if (k2 || Q2 == obj6) {
                        o0 o0Var2 = new o0(2, tlsVar2);
                        r0.o0(o0Var2);
                        obj10 = o0Var2;
                    }
                    o4b1.b(mt71.m(x0h0.logo_about, 0, r0), null, q791.f(i4, null, new awk0(0), null, (sls) obj10, null, slsVar2, 300), null, null, 0.0f, null, r0, 56, 120);
                    String str = e6Var.a;
                    String str2 = e6Var.d;
                    String str3 = e6Var.c;
                    if (str.length() > 0) {
                        r0.e0(396081304);
                        z = true;
                        r14 = 0;
                        vnb1.a(null, null, wwg.S(633600108, true, new tn1(2, e6Var), r0), r0, 384);
                        r1 = 0;
                        r0.t(false);
                    } else {
                        r1 = 0;
                        z = true;
                        r14 = 0;
                        r0.e0(396436874);
                        r0.t(false);
                    }
                    r0.t(z);
                    uj91.b(r14, r14, r0, r1, 3);
                    r0.e0(50945684);
                    r0.t(r1);
                    r0.e0(50995780);
                    boolean k3 = r0.k(tlsVar2);
                    Object Q3 = r0.Q();
                    Object obj11 = Q3;
                    if (k3 || Q3 == obj6) {
                        o0 o0Var3 = new o0(3, tlsVar2);
                        r0.o0(o0Var3);
                        obj11 = o0Var3;
                    }
                    f530 d4 = q791.d(c530Var2, false, null, null, (sls) obj11, 15);
                    a aVar = w1d.d;
                    a aVar2 = na01.a;
                    ydb1.a(d4, null, aVar, null, aVar2, null, null, false, r0, 384, MSException.ERROR_MORE_DATA);
                    yrl.b(0, 7, r0, null);
                    r0.t(false);
                    r0.e0(51581556);
                    r0.t(false);
                    boolean k4 = r0.k(tlsVar2);
                    Object Q4 = r0.Q();
                    Object obj12 = Q4;
                    if (k4 || Q4 == obj6) {
                        o0 o0Var4 = new o0(4, tlsVar2);
                        r0.o0(o0Var4);
                        obj12 = o0Var4;
                    }
                    ydb1.a(q791.d(c530Var2, false, null, null, (sls) obj12, 15), null, w1d.e, null, aVar2, null, null, false, r0, 384, MSException.ERROR_MORE_DATA);
                    yrl.b(0, 7, r0, null);
                    r0.e0(971504764);
                    for (mn0 mn0Var : e6Var.b) {
                        boolean k5 = r0.k(tlsVar2) | r0.k(mn0Var);
                        Object Q5 = r0.Q();
                        if (k5 || Q5 == obj6) {
                            Q5 = new j0(1, tlsVar2, mn0Var);
                            r0.o0(Q5);
                        }
                        ydb1.a(q791.d(c530Var2, false, null, null, (sls) Q5, 15), null, wwg.S(1155818503, true, new bj0(2, mn0Var), r0), null, na01.a, null, null, false, r0, 384, MSException.ERROR_MORE_DATA);
                        yrl.b(0, 7, r0, null);
                    }
                    r0.t(false);
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    oeb1.c(r0, ljs0.b(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 32.0f, 1));
                    if (str3.length() > 0) {
                        r0.e0(52301934);
                        jeb1.f(str3, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(r0).h.a, r0, 384, 0, 16376);
                        r0.t(false);
                    } else {
                        r0.e0(52532884);
                        r0.t(false);
                    }
                    if (str2.length() > 0) {
                        r0.e0(52600185);
                        f530 o5 = an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2);
                        boolean k6 = r0.k(tlsVar2);
                        Object Q6 = r0.Q();
                        Object obj13 = Q6;
                        if (k6 || Q6 == obj6) {
                            o0 o0Var5 = new o0(5, tlsVar2);
                            r0.o0(o0Var5);
                            obj13 = o0Var5;
                        }
                        jeb1.f(str2, q791.f(o5, null, new awk0(0), null, (sls) obj13, null, y5.a, 300), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(r0).h.a, r0, 384, 0, 16376);
                        r0.t(false);
                    } else {
                        r0.e0(52974324);
                        r0.t(false);
                    }
                    WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                    oeb1.c(r0, o9a1.e(c530Var2, vuz.o(r0).e));
                    r0.t(true);
                    r0.t(true);
                } else {
                    r0.Y();
                }
                return zy11Var2;
            case 1:
                ge geVar = (ge) obj8;
                final tls tlsVar4 = (tls) obj7;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ?? r02 = (bts) fidVar2;
                boolean V2 = r02.V(intValue2 & 1, (intValue2 & 17) != 16);
                dmw0 dmw0Var2 = r02.a;
                if (V2) {
                    k3r k3rVar = ljs0.c;
                    sic a4 = qic.a(g43Var, x4c.G, r02, 0);
                    int hashCode4 = Long.hashCode(r02.T);
                    r1b0 o6 = r02.o();
                    f530 d5 = b.d(r02, k3rVar);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    r02.i0();
                    if (r02.S) {
                        r02.n(slsVar3);
                    } else {
                        r02.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(r02, wlsVar5, a4);
                    wls wlsVar6 = d.e;
                    qje.W(r02, wlsVar6, o6);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    wls wlsVar7 = d.g;
                    qje.W(r02, wlsVar7, valueOf2);
                    tls tlsVar5 = d.h;
                    qje.M(r02, tlsVar5);
                    wls wlsVar8 = d.d;
                    f530 c = ljs0.c(n.d(r02, d5, wlsVar8, 1.0f, true), 1.0f);
                    sic a5 = qic.a(lr20.e, x4c.H, r02, 54);
                    int hashCode5 = Long.hashCode(r02.T);
                    r1b0 o7 = r02.o();
                    f530 d6 = b.d(r02, c);
                    r02.i0();
                    if (r02.S) {
                        r02.n(slsVar3);
                    } else {
                        r02.r0();
                    }
                    qje.W(r02, wlsVar5, a5);
                    qje.W(r02, wlsVar6, o7);
                    vfc.v(hashCode5, r02, wlsVar7, r02, tlsVar5);
                    qje.W(r02, wlsVar8, d6);
                    f530 m = ljs0.m(c530Var, 64.0f);
                    SpinnerState spinnerState = geVar.b;
                    List list = geVar.c;
                    ffb1.d(m, spinnerState, null, r02, 6, 4);
                    oeb1.c(r02, ljs0.e(c530Var, 40.0f));
                    jeb1.f(geVar.a, an91.m(ljs0.w(c530Var, 3), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(r02).g.a, r02, 48, 0, 16380);
                    r02.t(true);
                    r02.e0(1399366124);
                    int i5 = 0;
                    for (Object obj14 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            scc.m();
                            throw null;
                        }
                        final fe feVar = (fe) obj14;
                        if (i5 > 0) {
                            tse0.s(r02, 1446308262, c530Var, 4.0f, r02);
                            r02.t(false);
                        } else {
                            r02.e0(1446387064);
                            r02.t(false);
                        }
                        if (feVar.b) {
                            r02.e0(1446441097);
                            f530 m2 = an91.m(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 2);
                            boolean k7 = r02.k(tlsVar4) | r02.k(feVar);
                            Object Q7 = r02.Q();
                            if (k7 || Q7 == obj6) {
                                r142 = 0;
                                final boolean z4 = false ? 1 : 0;
                                sls slsVar4 = new sls() { // from class: ae
                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int i7 = z4;
                                        zy11 zy11Var3 = zy11.a;
                                        fe feVar2 = feVar;
                                        tls tlsVar6 = tlsVar4;
                                        switch (i7) {
                                            case 0:
                                                tlsVar6.invoke(feVar2.c);
                                                break;
                                            default:
                                                tlsVar6.invoke(feVar2.c);
                                                break;
                                        }
                                        return zy11Var3;
                                    }
                                };
                                r02.o0(slsVar4);
                                obj5 = slsVar4;
                            } else {
                                r142 = 0;
                                obj5 = Q7;
                            }
                            ohb1.b(m2, false, null, (sls) obj5, wwg.S(-1741975793, true, new zls() { // from class: be
                                @Override // defpackage.zls
                                public final Object invoke(Object obj15, Object obj16, Object obj17) {
                                    int i7 = r142;
                                    zy11 zy11Var3 = zy11.a;
                                    fe feVar2 = feVar;
                                    switch (i7) {
                                        case 0:
                                            fid fidVar3 = (fid) obj16;
                                            int intValue3 = ((Integer) obj17).intValue();
                                            bts btsVar = (bts) fidVar3;
                                            if (!btsVar.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                btsVar.Y();
                                                break;
                                            } else {
                                                jeb1.f(feVar2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 0, 0, 16382);
                                                break;
                                            }
                                        default:
                                            fid fidVar4 = (fid) obj16;
                                            int intValue4 = ((Integer) obj17).intValue();
                                            bts btsVar2 = (bts) fidVar4;
                                            if (!btsVar2.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                btsVar2.Y();
                                                break;
                                            } else {
                                                jeb1.f(feVar2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                                break;
                                            }
                                    }
                                    return zy11Var3;
                                }
                            }, r02), r02, 24582, 6);
                            r02.t(r142);
                        } else {
                            r02.e0(1446737736);
                            f530 m3 = an91.m(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 2);
                            boolean k8 = r02.k(tlsVar4) | r02.k(feVar);
                            Object Q8 = r02.Q();
                            if (k8 || Q8 == obj6) {
                                r11 = 1;
                                final boolean z5 = true ? 1 : 0;
                                sls slsVar5 = new sls() { // from class: ae
                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int i7 = z5;
                                        zy11 zy11Var3 = zy11.a;
                                        fe feVar2 = feVar;
                                        tls tlsVar6 = tlsVar4;
                                        switch (i7) {
                                            case 0:
                                                tlsVar6.invoke(feVar2.c);
                                                break;
                                            default:
                                                tlsVar6.invoke(feVar2.c);
                                                break;
                                        }
                                        return zy11Var3;
                                    }
                                };
                                r02.o0(slsVar5);
                                obj4 = slsVar5;
                            } else {
                                r11 = 1;
                                obj4 = Q8;
                            }
                            ulb1.a(m3, false, null, (sls) obj4, wwg.S(392313030, r11, new zls() { // from class: be
                                @Override // defpackage.zls
                                public final Object invoke(Object obj15, Object obj16, Object obj17) {
                                    int i7 = r11;
                                    zy11 zy11Var3 = zy11.a;
                                    fe feVar2 = feVar;
                                    switch (i7) {
                                        case 0:
                                            fid fidVar3 = (fid) obj16;
                                            int intValue3 = ((Integer) obj17).intValue();
                                            bts btsVar = (bts) fidVar3;
                                            if (!btsVar.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                btsVar.Y();
                                                break;
                                            } else {
                                                jeb1.f(feVar2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 0, 0, 16382);
                                                break;
                                            }
                                        default:
                                            fid fidVar4 = (fid) obj16;
                                            int intValue4 = ((Integer) obj17).intValue();
                                            bts btsVar2 = (bts) fidVar4;
                                            if (!btsVar2.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                btsVar2.Y();
                                                break;
                                            } else {
                                                jeb1.f(feVar2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                                break;
                                            }
                                    }
                                    return zy11Var3;
                                }
                            }, r02), r02, 24582, 6);
                            r02.t(false);
                        }
                        i5 = i6;
                    }
                    r02.t(false);
                    if (list.isEmpty()) {
                        r02.e0(431517916);
                        r02.t(false);
                    } else {
                        tse0.s(r02, 431462178, c530Var, 8.0f, r02);
                        r02.t(false);
                    }
                    r02.t(true);
                } else {
                    r02.Y();
                }
                return zy11Var2;
            case 2:
                qja qjaVar = (qja) obj8;
                tls tlsVar6 = (tls) obj7;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar3;
                boolean V3 = btsVar.V(intValue3 & 1, (intValue3 & 17) != 16);
                dmw0 dmw0Var3 = btsVar.a;
                if (!V3) {
                    btsVar.Y();
                } else if (qjaVar instanceof nja) {
                    btsVar.e0(883829450);
                    btsVar.t(false);
                    tlsVar6.invoke(new ija(((nja) qjaVar).a));
                } else if (jl40.l(qjaVar, oja.a)) {
                    btsVar.e0(883990991);
                    k3r k3rVar2 = ljs0.c;
                    z910 d7 = pi6.d(x4c.y, false);
                    int hashCode6 = Long.hashCode(btsVar.T);
                    r1b0 o8 = btsVar.o();
                    f530 d8 = b.d(btsVar, k3rVar2);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (dmw0Var3 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar6);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar9 = d.f;
                    qje.W(btsVar, wlsVar9, d7);
                    wls wlsVar10 = d.e;
                    qje.W(btsVar, wlsVar10, o8);
                    Integer valueOf3 = Integer.valueOf(hashCode6);
                    wls wlsVar11 = d.g;
                    qje.W(btsVar, wlsVar11, valueOf3);
                    tls tlsVar7 = d.h;
                    qje.M(btsVar, tlsVar7);
                    wls wlsVar12 = d.d;
                    qje.W(btsVar, wlsVar12, d8);
                    sic a6 = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode7 = Long.hashCode(btsVar.T);
                    r1b0 o9 = btsVar.o();
                    f530 d9 = b.d(btsVar, c530Var);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar6);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar9, a6);
                    qje.W(btsVar, wlsVar10, o9);
                    vfc.v(hashCode7, btsVar, wlsVar11, btsVar, tlsVar7);
                    qje.W(btsVar, wlsVar12, d9);
                    ffb1.c(SpinnerSize.LARGE, new ypu(x4c.H), null, null, btsVar, 6, 12);
                    oeb1.c(btsVar, ljs0.e(c530Var, 26.0f));
                    jeb1.f(ohb1.e(btsVar, kyh0.chargers_activating_subscription_loading_title), an91.m(c530Var, 16.0f, 0.0f, 2), null, uh6.E(20), 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).f.c, btsVar, 3120, 0, 16244);
                    tse0.t(btsVar, true, true, false);
                } else {
                    if (!(qjaVar instanceof pja)) {
                        throw unr0.y(721246083, btsVar, false);
                    }
                    btsVar.e0(884627018);
                    btsVar.t(false);
                    tlsVar6.invoke(new hja(((pja) qjaVar).a));
                }
                return zy11Var2;
            case 3:
                hxb hxbVar = (hxb) obj8;
                tls tlsVar8 = (tls) obj7;
                bj6 bj6Var = (bj6) obj;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((bts) fidVar4).k(bj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar4;
                if (btsVar2.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                    k3r k3rVar3 = ljs0.c;
                    sic a7 = qic.a(g43Var, x4c.G, btsVar2, 0);
                    int hashCode8 = Long.hashCode(btsVar2.T);
                    r1b0 o10 = btsVar2.o();
                    f530 d10 = b.d(btsVar2, k3rVar3);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar7);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a7);
                    qje.W(btsVar2, d.e, o10);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode8));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d10);
                    u5d.a.getClass();
                    crb1.b(null, u5d.b, null, wwg.S(-1941168068, true, new tbb(3, hxbVar), btsVar2), null, null, null, btsVar2, 3120, HProv.PP_NK_SYNC);
                    if (hxbVar instanceof exb) {
                        btsVar2.e0(1514969801);
                        fmb1.c(ljs0.c(an91.m(c530Var, 16.0f, 0.0f, 2).k(ljs0.b), 1.0f), (exb) hxbVar, tlsVar8, btsVar2, 6);
                        btsVar2.t(false);
                    } else {
                        if (!(hxbVar instanceof gxb)) {
                            throw unr0.y(-505320330, btsVar2, false);
                        }
                        btsVar2.e0(1515227969);
                        fmb1.h(ljs0.c(an91.m(c530Var, 16.0f, 0.0f, 2).k(ljs0.b), 1.0f), btsVar2, 6);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                    gxb gxbVar = hxbVar instanceof gxb ? (gxb) hxbVar : null;
                    fxb fxbVar = gxbVar != null ? gxbVar.c : null;
                    if (fxbVar != null) {
                        btsVar2.e0(1154807890);
                        fmb1.i(bj6Var.a(c530Var, x4c.B), fxbVar, tlsVar8, btsVar2, 0);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(1154957806);
                        btsVar2.t(false);
                    }
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 4:
                dge dgeVar = (dge) obj8;
                tls tlsVar9 = (tls) obj7;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar5;
                boolean V4 = btsVar3.V(intValue5 & 1, (intValue5 & 17) != 16);
                dmw0 dmw0Var4 = btsVar3.a;
                if (!V4) {
                    btsVar3.Y();
                    return zy11Var2;
                }
                f530 k9 = an91.k(fj91.c(ljs0.c(c530Var, 1.0f), IntrinsicSize.Min), 8.0f);
                lhl0 a8 = khl0.a(lr20.a, x4c.E, btsVar3, 48);
                int hashCode9 = Long.hashCode(btsVar3.T);
                r1b0 o11 = btsVar3.o();
                f530 d11 = b.d(btsVar3, k9);
                ohd.G1.getClass();
                sls slsVar8 = d.b;
                if (dmw0Var4 == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar8);
                } else {
                    btsVar3.r0();
                }
                wls wlsVar13 = d.f;
                qje.W(btsVar3, wlsVar13, a8);
                wls wlsVar14 = d.e;
                qje.W(btsVar3, wlsVar14, o11);
                Integer valueOf4 = Integer.valueOf(hashCode9);
                wls wlsVar15 = d.g;
                qje.W(btsVar3, wlsVar15, valueOf4);
                tls tlsVar10 = d.h;
                qje.M(btsVar3, tlsVar10);
                wls wlsVar16 = d.d;
                qje.W(btsVar3, wlsVar16, d11);
                age ageVar = dgeVar.a;
                if (ageVar == null) {
                    btsVar3.e0(649304539);
                    btsVar3.t(false);
                    zy11Var = zy11Var2;
                    z2 = false;
                    tlsVar = tlsVar9;
                } else {
                    btsVar3.e0(649304540);
                    zy11Var = zy11Var2;
                    f530 m4 = an91.m(ljs0.q(c530Var, 145.0f).k(ljs0.b), 8.0f, 0.0f, 2);
                    z910 d12 = pi6.d(x4c.x, false);
                    tlsVar = tlsVar9;
                    int hashCode10 = Long.hashCode(btsVar3.T);
                    r1b0 o12 = btsVar3.o();
                    f530 d13 = b.d(btsVar3, m4);
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar8);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, wlsVar13, d12);
                    qje.W(btsVar3, wlsVar14, o12);
                    vfc.v(hashCode10, btsVar3, wlsVar15, btsVar3, tlsVar10);
                    qje.W(btsVar3, wlsVar16, d13);
                    if (ageVar instanceof bge) {
                        btsVar3.e0(-1003249097);
                        bge bgeVar = (bge) ageVar;
                        i891.c(6, btsVar3, ljs0.c(c530Var, 1.0f), bgeVar.b, bgeVar.a);
                        z2 = false;
                        btsVar3.t(false);
                    } else {
                        if (!ageVar.equals(cge.a)) {
                            throw unr0.y(1214561139, btsVar3, false);
                        }
                        btsVar3.e0(-1002994556);
                        com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 27.0f), null, false, null, null, null, false, btsVar3, 6, 254);
                        z2 = false;
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                    btsVar3.t(z2);
                }
                btsVar3.e0(-1780145520);
                zfe zfeVar = dgeVar.b.a;
                boolean z6 = zfeVar.d;
                f530 k10 = new x2y(1.0f, true).k(z6 ? ofb1.b(c530Var, z2, null, 15) : c530Var);
                ButtonStyle buttonStyle = ButtonStyle.Main;
                boolean z7 = zfeVar.c && !z6;
                tls tlsVar11 = tlsVar;
                boolean k11 = btsVar3.k(tlsVar11) | btsVar3.e(zfeVar);
                Object Q9 = btsVar3.Q();
                Object obj15 = Q9;
                if (k11 || Q9 == obj6) {
                    jhd jhdVar = new jhd(10, tlsVar11, zfeVar);
                    btsVar3.o0(jhdVar);
                    obj15 = jhdVar;
                }
                d17.c(k10, z7, null, buttonStyle, null, (sls) obj15, wwg.S(221809600, true, new ota(9, zfeVar), btsVar3), btsVar3, 1575936, 20);
                btsVar3.t(false);
                btsVar3.t(true);
                return zy11Var;
            case 5:
                abz abzVar = (abz) obj8;
                tls tlsVar12 = (tls) obj7;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar6;
                if (btsVar4.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    k3r k3rVar4 = ljs0.c;
                    sic a9 = qic.a(g43Var, x4c.G, btsVar4, 0);
                    int hashCode11 = Long.hashCode(btsVar4.T);
                    r1b0 o13 = btsVar4.o();
                    f530 d14 = b.d(btsVar4, k3rVar4);
                    ohd.G1.getClass();
                    sls slsVar9 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar9);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a9);
                    qje.W(btsVar4, d.e, o13);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode11));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d14);
                    kkz kkzVar = abzVar.a;
                    uic uicVar = uic.a;
                    if (kkzVar != null) {
                        btsVar4.e0(126680774);
                        i = 0;
                        raz.e(abzVar.a, uicVar.a(x4c.H, c530Var), btsVar4, 0);
                        btsVar4.t(false);
                    } else {
                        i = 0;
                        tse0.s(btsVar4, 126843524, c530Var, 64.0f, btsVar4);
                        btsVar4.t(false);
                    }
                    oeb1.c(btsVar4, uicVar.b(c530Var, 0.3f, true));
                    raz.b(abzVar, uicVar.b(c530Var, 1.0f, true), btsVar4, i);
                    raz.a(i, btsVar4, tlsVar12, abzVar, null);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var2;
            case 6:
                f530 f530Var = (f530) obj8;
                zls zlsVar = (zls) obj7;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar7;
                if (btsVar5.V(intValue7 & 1, (intValue7 & 17) != 16)) {
                    f530 k12 = bzk0.c(ljs0.c, AppColor$Palette.Background, qke.q).k(f530Var);
                    Object Q10 = btsVar5.Q();
                    if (Q10 == obj6) {
                        Q10 = a12.k;
                        btsVar5.o0(Q10);
                    }
                    f530 a10 = exw0.a(k12, zy11Var2, (PointerInputEventHandler) Q10);
                    z910 d15 = pi6.d(x4c.b, false);
                    int hashCode12 = Long.hashCode(btsVar5.T);
                    r1b0 o14 = btsVar5.o();
                    f530 d16 = b.d(btsVar5, a10);
                    ohd.G1.getClass();
                    sls slsVar10 = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar10);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, d15);
                    qje.W(btsVar5, d.e, o14);
                    qje.W(btsVar5, d.g, Integer.valueOf(hashCode12));
                    qje.M(btsVar5, d.h);
                    qje.W(btsVar5, d.d, d16);
                    ly3.x(6, zlsVar, cj6Var, btsVar5, true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var2;
            case 7:
                return s(obj, obj2, obj3);
            case 8:
                yeg0 yeg0Var = (yeg0) obj8;
                tls tlsVar13 = (tls) obj7;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar8;
                if (btsVar6.V(intValue8 & 1, (intValue8 & 17) != 16)) {
                    k3r k3rVar5 = ljs0.c;
                    f530 c2 = bzk0.c(k3rVar5, new up2(iq2.f), qke.q);
                    z910 d17 = pi6.d(x4c.b, false);
                    int hashCode13 = Long.hashCode(btsVar6.T);
                    r1b0 o15 = btsVar6.o();
                    f530 d18 = b.d(btsVar6, c2);
                    ohd.G1.getClass();
                    sls slsVar11 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar11);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, d17);
                    qje.W(btsVar6, d.e, o15);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode13));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d18);
                    xeg0 xeg0Var = yeg0Var.a;
                    if (xeg0Var instanceof veg0) {
                        btsVar6.e0(-1696304166);
                        if (((Boolean) btsVar6.m(n.a)).booleanValue()) {
                            z3 = false;
                            btsVar6.e0(-1696105673);
                            btsVar6.t(false);
                        } else {
                            btsVar6.e0(-1696264238);
                            boolean k13 = btsVar6.k(tlsVar13);
                            Object Q11 = btsVar6.Q();
                            Object obj16 = Q11;
                            if (k13 || Q11 == obj6) {
                                gv40 gv40Var = new gv40(i3, tlsVar13);
                                btsVar6.o0(gv40Var);
                                obj16 = gv40Var;
                            }
                            ydy.a(null, (tls) obj16, btsVar6, 6);
                            z3 = false;
                            btsVar6.t(false);
                        }
                        com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a.d(48, btsVar6, tlsVar13, k3rVar5);
                        btsVar6.t(z3);
                        r3 = z3;
                    } else if ((xeg0Var instanceof weg0) || (xeg0Var instanceof ueg0)) {
                        r3 = 0;
                        btsVar6.e0(-1695927020);
                        com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a.b(yeg0Var, tlsVar13, k3rVar5, btsVar6, 384);
                        btsVar6.t(false);
                    } else {
                        if (!(xeg0Var instanceof teg0)) {
                            throw unr0.y(1330752517, btsVar6, false);
                        }
                        btsVar6.e0(-1695736866);
                        com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a.c(384, btsVar6, tlsVar13, k3rVar5, yeg0Var.b);
                        r3 = 0;
                        btsVar6.t(false);
                    }
                    com.yandex.go.masstransit.sdk.ble.impl.qrscan.scan.ui.a.f(an91.o(cj6Var.a(c530Var, x4c.c), 0.0f, 60.0f, 0.0f, 0.0f, 13), btsVar6, r3);
                    xeg0 xeg0Var2 = yeg0Var.a;
                    dda1.c(xeg0Var2 instanceof teg0, yeg0Var.c, (xeg0Var2 instanceof weg0) || (xeg0Var2 instanceof ueg0), tlsVar13, an91.o(ljs0.c(cj6Var.a(c530Var, x4c.B), 1.0f), 0.0f, 0.0f, 0.0f, 44.0f, 7), btsVar6, 48);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var2;
            case 9:
                return t(obj, obj2, obj3);
            case 10:
                return u(obj, obj2, obj3);
            case 11:
                return v(obj, obj2, obj3);
            case 12:
                return w(obj, obj2, obj3);
            case 13:
                return b(obj, obj2, obj3);
            case 14:
                return d(obj, obj2, obj3);
            case 15:
                return e(obj, obj2, obj3);
            case 16:
                return f(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            case 19:
                return j(obj, obj2, obj3);
            case 20:
                return k(obj, obj2, obj3);
            case 21:
                return l(obj, obj2, obj3);
            case 22:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ((fgd) obj8).a(HapticEffect.ClickMedium);
                ((tls) obj7).invoke(new mp1((do1) obj, (AiWidgetEvaluationSwipeDirection) obj2, booleanValue));
                return zy11Var2;
            case 23:
                return m(obj, obj2, obj3);
            case 24:
                return n(obj, obj2, obj3);
            case 25:
                return o(obj, obj2, obj3);
            case 26:
                return p(obj, obj2, obj3);
            case 27:
                return q(obj, obj2, obj3);
            case 28:
                return r(obj, obj2, obj3);
            default:
                o15 o15Var = (o15) obj8;
                n351 n351Var = (n351) obj7;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar9;
                if (btsVar7.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    o15Var.e(n351Var, btsVar7, 64);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
        }
    }

    public /* synthetic */ u5(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ u5(tls tlsVar, int i, Object obj) {
        this.a = i;
        this.b = tlsVar;
        this.c = obj;
    }

    public /* synthetic */ u5(abz abzVar, tls tlsVar) {
        this.a = 5;
        this.c = abzVar;
        this.b = tlsVar;
    }
}
