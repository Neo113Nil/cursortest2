package defpackage;

import android.graphics.Canvas;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.slot.SlotSize;
import com.ybsdk.widgets.common.PinCodeDotsView;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;

/* loaded from: classes11.dex */
public final /* synthetic */ class y740 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y740(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        qkj0 qkj0Var = (qkj0) this.b;
        tls tlsVar = (tls) this.c;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            zla1.f(ibp0Var, qkj0Var, null, tlsVar, btsVar, intValue & 14);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        dhk0 dhk0Var = (dhk0) this.b;
        ygk0 ygk0Var = (ygk0) this.c;
        ibk0 ibk0Var = (ibk0) obj;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        ComposeView composeView = dhk0Var.a;
        if (ibk0Var instanceof n9k0) {
            int u = tje.u(24, composeView.getContext());
            ibk0Var = n9k0.c((n9k0) ibk0Var, new m9k0(composeView, -(composeView.getWidth() + intValue + u), (composeView.getHeight() - intValue2) + u));
        }
        dhk0Var.b.a(ibk0Var, ygk0Var.l);
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        String str = (String) this.b;
        ety0 ety0Var = (ety0) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            btsVar.Y();
        } else if (str.length() > 0) {
            btsVar.e0(-1848325777);
            jeb1.d(a5l0.e(str, btsVar), null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, false, 2, 0, null, null, ety0Var, btsVar, 384, 48, 30714);
            btsVar.t(false);
        } else {
            btsVar.e0(-1848153510);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        fum0 fum0Var = (fum0) this.b;
        bum0 bum0Var = (bum0) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            ydb1.a(bzk0.c(ymb1.l(fj91.d(an91.m(c530.a, 16.0f, 0.0f, 2), IntrinsicSize.Min), cyk0.a), fum0Var.c.c.b, qke.q), null, wwg.S(-2041620467, true, new pdf0(26, bum0Var), btsVar), null, null, null, SlotSize.XS, false, btsVar, 1573248, 186);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        float f;
        o430 o430Var;
        xrn0 xrn0Var = (xrn0) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        boolean V = btsVar.V(intValue & 1, (intValue & 17) != 16);
        dmw0 dmw0Var = btsVar.a;
        if (V) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            c530 c530Var2 = c530Var;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            CharSequence charSequence = xrn0Var.a;
            List list = xrn0Var.c;
            int i = 2;
            qgy.b(charSequence, null, an91.m(c530Var2, 16.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 384, 0, 12282);
            bts btsVar2 = btsVar;
            if (xrn0Var.b.length() > 0) {
                btsVar2.e0(-465048565);
                qgy.b(xrn0Var.b, null, an91.m(c530Var2, 16.0f, 0.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, 3456, 0, 12274);
                btsVar2 = btsVar2;
                btsVar2.t(false);
            } else {
                btsVar2.e0(-464841702);
                btsVar2.t(false);
            }
            oeb1.c(btsVar2, ljs0.e(c530Var2, 16.0f));
            boolean isEmpty = list.isEmpty();
            o430 o430Var2 = did.a;
            if (isEmpty) {
                f = 8.0f;
                o430Var = o430Var2;
                btsVar2.e0(-463543174);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-464726165);
                btsVar2.e0(1786123897);
                float H = ((fwi) btsVar2.m(j.h)).H((int) (((k651) btsVar2.m(j.u)).a() >> 32));
                btsVar2.t(false);
                float f2 = (H - (list.size() <= 2 ? 40.0f : 48.0f)) / 2.0f;
                f530 c = ljs0.c(c530Var2, 1.0f);
                i43 i43Var = new i43(8.0f, true, new quz(11));
                l690 b = an91.b(16.0f, 0.0f, 2);
                boolean k = btsVar2.k(xrn0Var) | btsVar2.k(tlsVar) | btsVar2.b(f2);
                Object Q = btsVar2.Q();
                if (k || Q == o430Var2) {
                    Q = new b92(xrn0Var, tlsVar, f2, i);
                    btsVar2.o0(Q);
                }
                f = 8.0f;
                bts btsVar3 = btsVar2;
                o430Var = o430Var2;
                adb1.b(c, null, b, i43Var, null, null, false, null, (tls) Q, btsVar3, 24966, 490);
                btsVar2 = btsVar3;
                btsVar2.t(false);
            }
            final wrn0 wrn0Var = xrn0Var.d;
            if (wrn0Var != null) {
                btsVar2.e0(-463434333);
                boolean z = wrn0Var.a;
                boolean k2 = btsVar2.k(tlsVar) | btsVar2.k(wrn0Var);
                Object Q2 = btsVar2.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new tmm0(19, tlsVar, wrn0Var);
                    btsVar2.o0(Q2);
                }
                sls slsVar2 = (sls) Q2;
                final int i2 = 0;
                final int i3 = 1;
                bts btsVar4 = btsVar2;
                c530Var2 = c530Var2;
                ydb1.a(q791.d(c530Var2, false, null, null, slsVar2, 15), wwg.S(-1125787431, true, new zls() { // from class: irn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i4 = i2;
                        zy11 zy11Var = zy11.a;
                        wrn0 wrn0Var2 = wrn0Var;
                        switch (i4) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj4;
                                fid fidVar2 = (fid) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(wrn0Var2.b, null, 6), null, null, null, null, 0.0f, 0, null, btsVar5, intValue2 & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var = (ebp0) obj4;
                                fid fidVar3 = (fid) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar6 = (bts) fidVar3;
                                if (!btsVar6.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, wrn0Var2.c, null, null, null, 0, 0, wrn0Var2.d, null, null, 0, 0, null, btsVar6, intValue3 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar2), wwg.S(1535956670, true, new zls() { // from class: irn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        wrn0 wrn0Var2 = wrn0Var;
                        switch (i4) {
                            case 0:
                                ibp0 ibp0Var = (ibp0) obj4;
                                fid fidVar2 = (fid) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar5 = (bts) fidVar2;
                                if (!btsVar5.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar5.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(wrn0Var2.b, null, 6), null, null, null, null, 0.0f, 0, null, btsVar5, intValue2 & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var = (ebp0) obj4;
                                fid fidVar3 = (fid) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar6 = (bts) fidVar3;
                                if (!btsVar6.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    m9b1.b(ebp0Var, wrn0Var2.c, null, null, null, 0, 0, wrn0Var2.d, null, null, 0, 0, null, btsVar6, intValue3 & 14, 0, 32638);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar2), null, wwg.S(-1869198627, true, new yon0(slsVar2, z, 0), btsVar2), x4c.E, SlotSize.L, false, btsVar4, 25008, 8);
                btsVar2 = btsVar4;
                btsVar2.t(false);
            } else {
                tse0.s(btsVar2, -463058613, c530Var2, f, btsVar2);
                btsVar2.t(false);
            }
            f530 o3 = an91.o(c530Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2);
            int i4 = 2;
            boolean b2 = btsVar2.b(4.0f) | btsVar2.c(2) | btsVar2.a(false);
            Object Q3 = btsVar2.Q();
            if (b2 || Q3 == o430Var) {
                Q3 = new cpn0(i4);
                btsVar2.o0(Q3);
            }
            z910 z910Var = (z910) Q3;
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o4 = btsVar2.o();
            f530 d2 = b.d(btsVar2, o3);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, z910Var);
            qje.W(btsVar2, wlsVar2, o4);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar4, d2);
            boolean k3 = btsVar2.k(tlsVar);
            Object Q4 = btsVar2.Q();
            if (k3 || Q4 == o430Var) {
                Q4 = new wzl0(21, tlsVar);
                btsVar2.o0(Q4);
            }
            ulb1.a(null, false, null, (sls) Q4, wwg.S(-1484146205, true, new pdf0(27, xrn0Var), btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            btsVar2.t(true);
            btsVar2.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        CharSequence e;
        s1p0 s1p0Var = (s1p0) this.b;
        k1p0 k1p0Var = ((m1p0) this.c).f;
        ebp0 ebp0Var = (ebp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            if (s1p0Var.e) {
                btsVar.e0(139989642);
                e = ohb1.e(btsVar, kyh0.scooters_passes_purchasing);
                btsVar.t(false);
            } else {
                btsVar.e0(139922930);
                btsVar.t(false);
                e = k1p0Var.a;
            }
            CharSequence charSequence = e;
            CharSequence charSequence2 = k1p0Var.b;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            m9b1.b(ebp0Var, charSequence, null, null, null, 0, 0, charSequence2, null, null, 0, 0, null, btsVar, intValue & 14, 0, 32638);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        CharSequence charSequence = (CharSequence) this.b;
        wp2 wp2Var = (wp2) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 14.0f, 0.0f, 10.0f, 0.0f, 10);
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
            qgy.b(charSequence, null, null, wp2Var, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16374);
            sya1.a(rlb1.c(), an91.o(c530Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), null, wp2Var, btsVar, 48, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        ani0 ani0Var = (ani0) this.b;
        Anchor anchor = (Anchor) this.c;
        ((Integer) obj3).getClass();
        qip0 qip0Var = (qip0) ani0Var.a;
        bts btsVar = (bts) ((fid) obj2);
        if (qip0Var == null) {
            btsVar.e0(1263245526);
            btsVar.t(false);
        } else {
            btsVar.e0(1263245527);
            d5b1.c(qip0Var, anchor, btsVar, 0);
            btsVar.t(false);
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        x9q0 x9q0Var = (x9q0) this.b;
        tls tlsVar = (tls) this.c;
        v9q0 v9q0Var = (v9q0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(v9q0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            for (w9q0 w9q0Var : x9q0Var.a) {
                boolean l = jl40.l(w9q0Var, x9q0Var.b);
                boolean k = btsVar.k(tlsVar) | btsVar.e(w9q0Var);
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = new nao0(19, tlsVar, w9q0Var);
                    btsVar.o0(Q);
                }
                t9q0.a(v9q0Var, l, (sls) Q, wwg.S(-1223083951, true, new w7o0(9, w9q0Var), btsVar), btsVar, (intValue & 14) | 24624);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        s8r0 s8r0Var = (s8r0) this.b;
        wp2 wp2Var = (wp2) this.c;
        ibp0 ibp0Var = (ibp0) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(ibp0Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            udb1.c(ibp0Var, s8r0Var.c, null, wp2Var, btsVar, intValue & 14, 6);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        psr0 psr0Var = (psr0) this.b;
        tls tlsVar = (tls) this.c;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
            ccb1.a(psr0Var, tlsVar, null, btsVar, 0, 4);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        u0s0 u0s0Var = (u0s0) this.b;
        a aVar = (a) this.c;
        bj6 bj6Var = (bj6) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(bj6Var) ? 4 : 2;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 19) != 18)) {
            Iterator it = u0s0Var.d.a.iterator();
            while (it.hasNext()) {
                ey91.c(bj6Var, (g0s0) it.next(), aVar, btsVar, intValue & 14);
            }
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x09cb, code lost:
    
        if (r3 != false) goto L298;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // defpackage.zls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy11 onSizeChanged$lambda$18$lambda$17;
        ?? r8;
        int i = this.a;
        int i2 = 14;
        int i3 = 18;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                j940 j940Var = (j940) obj5;
                tls tlsVar = (tls) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    qpb1.b(6, btsVar, tlsVar, an91.o(c530.a, 0.0f, 12.0f, 0.0f, 0.0f, 13), j940Var.g);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ZoneId zoneId = (ZoneId) obj5;
                DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) obj4;
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                String str = (String) obj2;
                String str2 = (String) obj3;
                if (!jl40.l(zonedDateTime.toLocalDate(), LocalDate.now(zoneId))) {
                    str = jl40.l(zonedDateTime.toLocalDate(), LocalDate.now(zoneId).plusDays(1L)) ? str2 : zonedDateTime.format(dateTimeFormatter);
                }
                return str == null ? zonedDateTime.format(dateTimeFormatter) : str;
            case 2:
                cu40 cu40Var = (cu40) obj5;
                tls tlsVar2 = (tls) obj4;
                bj6 bj6Var = (bj6) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    jm91.c(cu40Var, tlsVar2, btsVar2, 0);
                    f530 a = bj6Var.a(i9a1.d(an91.o(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2)), x4c.B);
                    boolean k = btsVar2.k(tlsVar2);
                    Object Q = btsVar2.Q();
                    if (k || Q == o430Var) {
                        Q = new s140(20, tlsVar2);
                        btsVar2.o0(Q);
                    }
                    ohb1.b(a, false, null, (sls) Q, wwg.S(54523072, true, new wg30(i3, cu40Var), btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                sv40 sv40Var = (sv40) obj5;
                tls tlsVar3 = (tls) obj4;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ArrayList arrayList = sv40Var.g;
                    btsVar3.e0(1059817098);
                    vqr.c(ljs0.c(an91.m(c530Var, 14.0f, 0.0f, 2), 1.0f), new i43(4.0f, true, new quz(11)), new i43(4.0f, true, new quz(11)), null, 0, 0, wwg.S(-1915545748, true, new y740(4, arrayList, tlsVar3), btsVar3), btsVar3, 1573302, 56);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj5;
                tls tlsVar4 = (tls) obj4;
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        yqb1.d((tsq) it.next(), tlsVar4, btsVar4, 6);
                    }
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 5:
                hoy0 hoy0Var = (hoy0) obj5;
                co60 co60Var = (co60) obj4;
                wls wlsVar = (wls) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= fidVar5.e(wlsVar) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    z910 d = pi6.d(x4c.x, false);
                    int hashCode = Long.hashCode(btsVar5.T);
                    r1b0 o = btsVar5.o();
                    f530 d2 = b.d(btsVar5, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, d);
                    qje.W(btsVar5, d.e, o);
                    wls wlsVar2 = d.g;
                    if (btsVar5.S || !jl40.l(btsVar5.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar5, hashCode, wlsVar2);
                    }
                    qje.W(btsVar5, d.d, d2);
                    if (hoy0Var.a.b.length() == 0) {
                        btsVar5.e0(437014755);
                        ymb1.e(co60Var.d, null, ((el51) btsVar5.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar5, 0, HProv.ALG_TYPE_SECURECHANNEL, 57338);
                        btsVar5.t(false);
                    } else {
                        btsVar5.e0(437247317);
                        btsVar5.t(false);
                    }
                    xvz.u(intValue5 & 14, wlsVar, btsVar5, true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 6:
                androidx.compose.foundation.pager.d dVar = (androidx.compose.foundation.pager.d) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float floatValue3 = ((Float) obj3).floatValue();
                boolean b = dr31.b(dVar, floatValue);
                if (dVar.n().e != Orientation.Vertical && layoutDirection != LayoutDirection.Ltr) {
                    b = !b;
                }
                int i4 = dVar.n().b;
                float a2 = i4 == 0 ? 0.0f : dr31.a(dVar) / i4;
                float f = a2 - ((int) a2);
                char c = Math.abs(floatValue) < dVar.n.w0(400.0f) ? (char) 0 : floatValue > 0.0f ? (char) 1 : (char) 2;
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            floatValue3 = 0.0f;
                        }
                        floatValue3 = floatValue2;
                    }
                }
                if (Math.abs(f) <= 0.5f) {
                    float abs = Math.abs(a2);
                    fwi fwiVar = dVar.n;
                    z890 z890Var = a990.a;
                    return abs < Math.abs(Math.min(fwiVar.w0(56.0f), ((float) dVar.p()) / 2.0f) / ((float) dVar.p())) ? Float.valueOf(floatValue3) : Float.valueOf(floatValue3);
                }
                break;
            case 7:
                wj90 wj90Var = (wj90) obj5;
                ety0 ety0Var = (ety0) obj4;
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    qgy.b(wj90Var.a, null, an91.m(c530Var, 14.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar6, 384, 0, 12282);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 8:
                sja0 sja0Var = (sja0) obj5;
                tls tlsVar5 = (tls) obj4;
                fid fidVar7 = (fid) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                bts btsVar7 = (bts) fidVar7;
                boolean V = btsVar7.V(intValue7 & 1, (intValue7 & 17) != 16);
                dmw0 dmw0Var = btsVar7.a;
                if (V) {
                    f530 c2 = ljs0.c(c530Var, 1.0f);
                    sic a3 = qic.a(lr20.c, x4c.G, btsVar7, 0);
                    int hashCode2 = Long.hashCode(btsVar7.T);
                    r1b0 o2 = btsVar7.o();
                    f530 d3 = b.d(btsVar7, c2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar2);
                    } else {
                        btsVar7.r0();
                    }
                    wls wlsVar3 = d.f;
                    qje.W(btsVar7, wlsVar3, a3);
                    wls wlsVar4 = d.e;
                    qje.W(btsVar7, wlsVar4, o2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    wls wlsVar5 = d.g;
                    qje.W(btsVar7, wlsVar5, valueOf);
                    tls tlsVar6 = d.h;
                    qje.M(btsVar7, tlsVar6);
                    wls wlsVar6 = d.d;
                    qje.W(btsVar7, wlsVar6, d3);
                    if (sja0Var.d.length() > 0) {
                        btsVar7.e0(-837340125);
                        v0b1.a(mja1.a(sja0Var.d, null, 6), ljs0.e(ljs0.c(c530Var, 1.0f), 128.0f), null, null, null, null, null, mhe.a, 0.0f, 0, btsVar7, 12582960, 892);
                        ly3.B(c530Var, 16.0f, btsVar7, false);
                    } else {
                        btsVar7.e0(-837059513);
                        btsVar7.t(false);
                    }
                    String str3 = sja0Var.a;
                    ety0 ety0Var2 = xya1.d(btsVar7).e.d;
                    AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                    jeb1.f(str3, an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 12.0f, 2), appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar7, 432, 0, 16376);
                    jeb1.f(sja0Var.b, an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 16.0f, 2), appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar7).g.a, btsVar7, 432, 0, 16376);
                    f530 k2 = an91.k(c530Var, 8.0f);
                    boolean b2 = btsVar7.b(4.0f) | btsVar7.a(false);
                    Object Q2 = btsVar7.Q();
                    if (b2 || Q2 == o430Var) {
                        Q2 = new jg0(26);
                        btsVar7.o0(Q2);
                    }
                    z910 z910Var = (z910) Q2;
                    int hashCode3 = Long.hashCode(btsVar7.T);
                    r1b0 o3 = btsVar7.o();
                    f530 d4 = b.d(btsVar7, k2);
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar2);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, wlsVar3, z910Var);
                    qje.W(btsVar7, wlsVar4, o3);
                    vfc.v(hashCode3, btsVar7, wlsVar5, btsVar7, tlsVar6);
                    qje.W(btsVar7, wlsVar6, d4);
                    boolean k3 = btsVar7.k(tlsVar5);
                    Object Q3 = btsVar7.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new s140(29, tlsVar5);
                        btsVar7.o0(Q3);
                    }
                    ohb1.b(null, false, null, (sls) Q3, wwg.S(-622365411, true, new wg30(28, sja0Var), btsVar7), btsVar7, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    btsVar7.t(true);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 9:
                kk2 kk2Var = (kk2) obj5;
                Map map = (Map) obj4;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar8 = (fid) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((bts) fidVar8).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                    p9b1.d(ebp0Var, kk2Var, map, null, null, xya1.e(btsVar8).g.a, 0, 0, null, null, null, 0, 0, btsVar8, intValue8 & 14, 16364);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 10:
                tls tlsVar7 = (tls) obj4;
                w7b0 w7b0Var = (w7b0) obj5;
                fid fidVar9 = (fid) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 17) != 16)) {
                    lhl0 a4 = khl0.a(lr20.a, x4c.D, btsVar9, 0);
                    int hashCode4 = Long.hashCode(btsVar9.T);
                    r1b0 o4 = btsVar9.o();
                    f530 d5 = b.d(btsVar9, c530Var);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar9.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar9.i0();
                    if (btsVar9.S) {
                        btsVar9.n(slsVar3);
                    } else {
                        btsVar9.r0();
                    }
                    qje.W(btsVar9, d.f, a4);
                    qje.W(btsVar9, d.e, o4);
                    qje.W(btsVar9, d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar9, d.h);
                    qje.W(btsVar9, d.d, d5);
                    oeb1.c(btsVar9, ljs0.q(c530Var, 2.0f));
                    pa90 m = mt71.m(dzg0.info_icon, 0, btsVar9);
                    c36 c36Var = new c36(tje.n(AppColor$Palette.TextMinor, btsVar9), 5);
                    f530 l = ymb1.l(ljs0.m(c530Var, 16.0f), cyk0.a);
                    boolean k4 = btsVar9.k(tlsVar7) | btsVar9.k(w7b0Var);
                    Object Q4 = btsVar9.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new d4b0(tlsVar7, w7b0Var);
                        btsVar9.o0(Q4);
                    }
                    o4b1.b(m, ohb1.e(btsVar9, kyh0.common_details), q791.d(l, false, null, null, (sls) Q4, 15), null, null, 0.0f, c36Var, btsVar9, 8, 56);
                    btsVar9.t(true);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 11:
                onSizeChanged$lambda$18$lambda$17 = PinCodeDotsView.onSizeChanged$lambda$18$lambda$17((Canvas) obj5, (PinCodeDotsView) obj4, ((Integer) obj).intValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                return onSizeChanged$lambda$18$lambda$17;
            case 12:
                qqf0 qqf0Var = (qqf0) obj5;
                tls tlsVar8 = (tls) obj4;
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar10 = (fid) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((bts) fidVar10).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                    xnf0.e(ibp0Var, qqf0Var, null, tlsVar8, btsVar10, intValue10 & 14);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 13:
                a8a a8aVar = (a8a) obj5;
                wls wlsVar7 = (wls) obj4;
                fid fidVar11 = (fid) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 17) != 16)) {
                    n9a n9aVar = a8aVar.h;
                    c530 c530Var2 = c530.a;
                    if (n9aVar != null) {
                        btsVar11.e0(-1131747523);
                        f530 o5 = an91.o(c530Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                        boolean z = a8aVar.h.b;
                        boolean k5 = btsVar11.k(wlsVar7) | btsVar11.e(a8aVar);
                        Object Q5 = btsVar11.Q();
                        Object obj6 = Q5;
                        if (k5 || Q5 == o430Var) {
                            ugd0 ugd0Var = new ugd0(i2, wlsVar7, a8aVar);
                            btsVar11.o0(ugd0Var);
                            obj6 = ugd0Var;
                        }
                        ijb1.b(z, o5, szw0.d, null, null, (tls) obj6, false, btsVar11, 48, 88);
                        btsVar11.t(false);
                    } else {
                        btsVar11.e0(-1131440344);
                        lhl0 a5 = khl0.a(lr20.b, x4c.E, btsVar11, 54);
                        int hashCode5 = Long.hashCode(btsVar11.T);
                        r1b0 o6 = btsVar11.o();
                        f530 d6 = b.d(btsVar11, c530Var2);
                        ohd.G1.getClass();
                        sls slsVar4 = d.b;
                        if (btsVar11.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar11.i0();
                        if (btsVar11.S) {
                            btsVar11.n(slsVar4);
                        } else {
                            btsVar11.r0();
                        }
                        qje.W(btsVar11, d.f, a5);
                        qje.W(btsVar11, d.e, o6);
                        qje.W(btsVar11, d.g, Integer.valueOf(hashCode5));
                        qje.M(btsVar11, d.h);
                        qje.W(btsVar11, d.d, d6);
                        tn9 tn9Var = a8aVar.f;
                        if (tn9Var == null) {
                            btsVar11.e0(1293972402);
                            r8 = 0;
                            btsVar11.t(false);
                        } else {
                            r8 = 0;
                            btsVar11.e0(1293972403);
                            o9a1.b(tn9Var.a, rzo.d(tn9Var.b), btsVar11, 6);
                            btsVar11.t(false);
                        }
                        if (a8aVar.g == null) {
                            btsVar11.e0(1294183233);
                            btsVar11.t(r8);
                        } else {
                            btsVar11.e0(1294183234);
                            o4b1.b(mt71.m(dzg0.chevron_next, r8, btsVar11), null, ljs0.m(c530Var2, 24.0f), null, mhe.e, 0.0f, null, btsVar11, 25016, 104);
                            btsVar11.t(r8);
                        }
                        oeb1.c(btsVar11, ljs0.q(c530Var2, 8.0f));
                        btsVar11.t(true);
                        btsVar11.t(r8);
                    }
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 14:
                final zgi0 zgi0Var = (zgi0) obj5;
                tls tlsVar9 = (tls) obj4;
                fid fidVar12 = (fid) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                bts btsVar12 = (bts) fidVar12;
                boolean V2 = btsVar12.V(intValue12 & 1, (intValue12 & 17) != 16);
                dmw0 dmw0Var2 = btsVar12.a;
                if (V2) {
                    c530 c530Var3 = c530.a;
                    f530 c3 = ljs0.c(c530Var3, 1.0f);
                    sic a6 = qic.a(lr20.c, x4c.G, btsVar12, 0);
                    int hashCode6 = Long.hashCode(btsVar12.T);
                    r1b0 o7 = btsVar12.o();
                    f530 d7 = b.d(btsVar12, c3);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar5);
                    } else {
                        btsVar12.r0();
                    }
                    wls wlsVar8 = d.f;
                    qje.W(btsVar12, wlsVar8, a6);
                    wls wlsVar9 = d.e;
                    qje.W(btsVar12, wlsVar9, o7);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    wls wlsVar10 = d.g;
                    qje.W(btsVar12, wlsVar10, valueOf2);
                    tls tlsVar10 = d.h;
                    qje.M(btsVar12, tlsVar10);
                    wls wlsVar11 = d.d;
                    qje.W(btsVar12, wlsVar11, d7);
                    o4b1.b(mt71.m(f1h0.ic_cross_ban, 0, btsVar12), null, an91.n(c530Var3, 10.0f, 10.0f, 10.0f, 8.0f), null, null, 0.0f, null, btsVar12, 440, 120);
                    jeb1.f(zgi0Var.a, an91.o(c530Var3, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar12).e.d, btsVar12, 48, 0, 16380);
                    jeb1.f(zgi0Var.b, an91.o(c530Var3, 16.0f, 0.0f, 16.0f, 12.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar12).g.a, btsVar12, 48, 0, 16380);
                    f530 c4 = ljs0.c(an91.k(c530Var3, 8.0f), 1.0f);
                    lhl0 a7 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar12, 6);
                    int hashCode7 = Long.hashCode(btsVar12.T);
                    r1b0 o8 = btsVar12.o();
                    f530 d8 = b.d(btsVar12, c4);
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar5);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(btsVar12, wlsVar8, a7);
                    qje.W(btsVar12, wlsVar9, o8);
                    vfc.v(hashCode7, btsVar12, wlsVar10, btsVar12, tlsVar10);
                    qje.W(btsVar12, wlsVar11, d8);
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean k6 = btsVar12.k(tlsVar9) | btsVar12.e(zgi0Var);
                    Object Q6 = btsVar12.Q();
                    if (k6 || Q6 == o430Var) {
                        Q6 = new agc0(22, tlsVar9, zgi0Var);
                        btsVar12.o0(Q6);
                    }
                    sls slsVar6 = (sls) Q6;
                    final int i5 = 0;
                    ulb1.a(x2yVar, false, null, slsVar6, wwg.S(-228172288, true, new zls() { // from class: wgi0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i6 = i5;
                            zy11 zy11Var2 = zy11.a;
                            c530 c530Var4 = c530.a;
                            zgi0 zgi0Var2 = zgi0Var;
                            switch (i6) {
                                case 0:
                                    fid fidVar13 = (fid) obj8;
                                    int intValue13 = ((Integer) obj9).intValue();
                                    bts btsVar13 = (bts) fidVar13;
                                    if (!btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                                        btsVar13.Y();
                                        break;
                                    } else {
                                        jeb1.f(zgi0Var2.c, an91.m(c530Var4, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, null, btsVar13, 805306416, 48, 30204);
                                        break;
                                    }
                                default:
                                    fid fidVar14 = (fid) obj8;
                                    int intValue14 = ((Integer) obj9).intValue();
                                    bts btsVar14 = (bts) fidVar14;
                                    if (!btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                                        btsVar14.Y();
                                        break;
                                    } else {
                                        jeb1.f(zgi0Var2.d, an91.m(c530Var4, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar14).g.b, btsVar14, 805306416, 48, 13820);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar12), btsVar12, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    x2y x2yVar2 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    boolean k7 = btsVar12.k(tlsVar9);
                    Object Q7 = btsVar12.Q();
                    if (k7 || Q7 == o430Var) {
                        Q7 = new ukb0(11, tlsVar9);
                        btsVar12.o0(Q7);
                    }
                    final int i6 = r14 ? 1 : 0;
                    ohb1.b(x2yVar2, false, null, (sls) Q7, wwg.S(-2003100526, true, new zls() { // from class: wgi0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i62 = i6;
                            zy11 zy11Var2 = zy11.a;
                            c530 c530Var4 = c530.a;
                            zgi0 zgi0Var2 = zgi0Var;
                            switch (i62) {
                                case 0:
                                    fid fidVar13 = (fid) obj8;
                                    int intValue13 = ((Integer) obj9).intValue();
                                    bts btsVar13 = (bts) fidVar13;
                                    if (!btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                                        btsVar13.Y();
                                        break;
                                    } else {
                                        jeb1.f(zgi0Var2.c, an91.m(c530Var4, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, null, btsVar13, 805306416, 48, 30204);
                                        break;
                                    }
                                default:
                                    fid fidVar14 = (fid) obj8;
                                    int intValue14 = ((Integer) obj9).intValue();
                                    bts btsVar14 = (bts) fidVar14;
                                    if (!btsVar14.V(intValue14 & 1, (intValue14 & 17) != 16)) {
                                        btsVar14.Y();
                                        break;
                                    } else {
                                        jeb1.f(zgi0Var2.d, an91.m(c530Var4, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.e(btsVar14).g.b, btsVar14, 805306416, 48, 13820);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar12), btsVar12, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    btsVar12.t(true);
                    btsVar12.t(true);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 15:
                tls tlsVar11 = (tls) obj4;
                dhi0 dhi0Var = (dhi0) obj5;
                fid fidVar13 = (fid) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 17) != 16)) {
                    lhl0 a8 = khl0.a(lr20.a, x4c.D, btsVar13, 0);
                    int hashCode8 = Long.hashCode(btsVar13.T);
                    r1b0 o9 = btsVar13.o();
                    c530 c530Var4 = c530.a;
                    f530 d9 = b.d(btsVar13, c530Var4);
                    ohd.G1.getClass();
                    sls slsVar7 = d.b;
                    if (btsVar13.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar13.i0();
                    if (btsVar13.S) {
                        btsVar13.n(slsVar7);
                    } else {
                        btsVar13.r0();
                    }
                    qje.W(btsVar13, d.f, a8);
                    qje.W(btsVar13, d.e, o9);
                    qje.W(btsVar13, d.g, Integer.valueOf(hashCode8));
                    qje.M(btsVar13, d.h);
                    qje.W(btsVar13, d.d, d9);
                    f530 o10 = an91.o(c530Var4, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    ButtonStyle buttonStyle = ButtonStyle.Floating;
                    ButtonForm buttonForm = ButtonForm.Circle;
                    ButtonSize buttonSize = ButtonSize.XS;
                    boolean k8 = btsVar13.k(tlsVar11);
                    Object Q8 = btsVar13.Q();
                    if (k8 || Q8 == o430Var) {
                        Q8 = new ukb0(26, tlsVar11);
                        btsVar13.o0(Q8);
                    }
                    d17.c(o10, false, buttonSize, buttonStyle, buttonForm, (sls) Q8, wwg.S(-221273496, true, new nhi0(dhi0Var, 3), btsVar13), btsVar13, 1600902, 2);
                    f530 o11 = an91.o(c530Var4, 4.0f, 0.0f, 16.0f, 0.0f, 10);
                    boolean k9 = btsVar13.k(tlsVar11);
                    Object Q9 = btsVar13.Q();
                    if (k9 || Q9 == o430Var) {
                        Q9 = new ukb0(13, tlsVar11);
                        btsVar13.o0(Q9);
                    }
                    d17.c(o11, false, buttonSize, buttonStyle, buttonForm, (sls) Q9, wwg.S(-1858562657, true, new nhi0(dhi0Var, r14 ? 1 : 0), btsVar13), btsVar13, 1600902, 2);
                    btsVar13.t(true);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 16:
                tls tlsVar12 = (tls) obj4;
                shi0 shi0Var = (shi0) obj5;
                ibp0 ibp0Var2 = (ibp0) obj;
                fid fidVar14 = (fid) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((bts) fidVar14).k(ibp0Var2) ? 4 : 2;
                }
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 19) != 18)) {
                    boolean k10 = btsVar14.k(tlsVar12);
                    Object Q10 = btsVar14.Q();
                    if (k10 || Q10 == o430Var) {
                        Q10 = new ukb0(22, tlsVar12);
                        btsVar14.o0(Q10);
                    }
                    d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var2.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), true, ButtonSize.XS, ButtonStyle.Minor, ButtonForm.Circle, (sls) Q10, wwg.S(1269858956, true, new phi0(shi0Var, 3), btsVar14), btsVar14, 1573248, 0);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 17:
                return b(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return e(obj, obj2, obj3);
            case 20:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                return o(obj, obj2, obj3);
            default:
                IconSpotSize iconSpotSize = (IconSpotSize) obj5;
                u92 u92Var = (u92) obj4;
                fid fidVar15 = (fid) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 17) != 16)) {
                    o4b1.c(u92Var, null, ljs0.m(c530Var, iconSpotSize.getIconSize()), null, mhe.e, 0.0f, null, 0, btsVar15, 24624, 232);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ y740(tls tlsVar, int i, Object obj) {
        this.a = i;
        this.c = tlsVar;
        this.b = obj;
    }
}
