package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.c;
import ru.yandex.taxi.masstransit.router.MtHubLeadingItemKind;
import ru.yandex.taxi.masstransit.ui.compat.a;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes6.dex */
public final /* synthetic */ class vg30 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ lm30 b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ aj31 w;

    public /* synthetic */ vg30(lm30 lm30Var, tls tlsVar, aj31 aj31Var, int i) {
        this.b = lm30Var;
        this.c = tlsVar;
        this.w = aj31Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00cd, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00d6, code lost:
    
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016b, code lost:
    
        if (r4 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0225, code lost:
    
        if (r2 == r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r3 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00cb, code lost:
    
        if (r3 != null) goto L34;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        zy11 zy11Var;
        MtHubLeadingItemKind mtHubLeadingItemKind;
        int i;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        boolean z;
        boolean z2;
        Object obj3;
        tls tlsVar;
        lm30 lm30Var;
        uo5 uo5Var;
        boolean z3;
        c530 c530Var;
        Object obj4;
        tls tlsVar2;
        Object obj5;
        UiStateDrawableWrapper uiStateDrawableWrapper2;
        int i2 = this.a;
        zy11 zy11Var2 = zy11.a;
        tls tlsVar3 = this.c;
        lm30 lm30Var2 = this.b;
        switch (i2) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                uo5 uo5Var2 = x4c.y;
                uo5 uo5Var3 = x4c.b;
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 3) != 2);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    c530 c530Var2 = c530.a;
                    f530 d = b.d(btsVar, c530Var2);
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
                    qje.W(btsVar, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar4 = d.h;
                    qje.M(btsVar, tlsVar4);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d);
                    MtHubLeadingItemKind mtHubLeadingItemKind2 = lm30Var2.c;
                    m1a0 m1a0Var = lm30Var2.e;
                    zy11Var = zy11Var2;
                    h111 h111Var = lm30Var2.d;
                    if (mtHubLeadingItemKind2 == null) {
                        mtHubLeadingItemKind = mtHubLeadingItemKind2;
                        i = -1;
                    } else {
                        mtHubLeadingItemKind = mtHubLeadingItemKind2;
                        i = bh30.a[mtHubLeadingItemKind2.ordinal()];
                    }
                    if (i == -1) {
                        if (h111Var == null) {
                            uiStateDrawableWrapper = null;
                            break;
                        } else {
                            uiStateDrawableWrapper = h111Var.a;
                            break;
                        }
                    } else {
                        if (i == 1) {
                            if (h111Var == null) {
                                uiStateDrawableWrapper2 = null;
                                break;
                            } else {
                                uiStateDrawableWrapper2 = h111Var.a;
                                break;
                            }
                        } else if (i != 2) {
                            w511.b();
                            return null;
                        }
                        z = false;
                    }
                    int i3 = mtHubLeadingItemKind == null ? -1 : bh30.a[mtHubLeadingItemKind.ordinal()];
                    aj31 aj31Var = this.w;
                    if (i3 != -1) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            if (m1a0Var != null) {
                            }
                        }
                        z2 = false;
                    } else {
                        if (m1a0Var != null) {
                            if (aj31Var != null) {
                            }
                        }
                        z2 = false;
                    }
                    cj6 cj6Var = cj6.a;
                    boolean z4 = z2;
                    Object obj6 = did.a;
                    if (z) {
                        btsVar.e0(1039104625);
                        if (h111Var != null) {
                            btsVar.e0(1039204321);
                            k3r k3rVar = ljs0.b;
                            lm30Var = lm30Var2;
                            z910 d2 = pi6.d(uo5Var3, false);
                            int hashCode2 = Long.hashCode(btsVar.T);
                            r1b0 o2 = btsVar.o();
                            f530 d3 = b.d(btsVar, k3rVar);
                            btsVar.i0();
                            uo5Var = uo5Var3;
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            qje.W(btsVar, wlsVar, d2);
                            qje.W(btsVar, wlsVar2, o2);
                            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar4);
                            qje.W(btsVar, wlsVar4, d3);
                            f530 a2 = cj6Var.a(c530Var2, uo5Var2);
                            boolean e = btsVar.e(h111Var) | btsVar.k(tlsVar3);
                            Object Q = btsVar.Q();
                            if (!e) {
                                obj5 = obj6;
                                break;
                            } else {
                                obj5 = obj6;
                            }
                            Q = new ve30(h111Var, tlsVar3);
                            btsVar.o0(Q);
                            z3 = false;
                            obj3 = obj5;
                            tlsVar = tlsVar3;
                            c.d(h111Var, an91.m(q791.b(a2, null, null, false, null, new awk0(0), (sls) Q, 12), 12.0f, 0.0f, 2), btsVar, 0);
                            btsVar.t(true);
                            btsVar.t(false);
                        } else {
                            obj3 = obj6;
                            tlsVar = tlsVar3;
                            lm30Var = lm30Var2;
                            uo5Var = uo5Var3;
                            z3 = false;
                            btsVar.e0(1039891436);
                            btsVar.t(false);
                        }
                        btsVar.t(z3);
                    } else {
                        obj3 = obj6;
                        tlsVar = tlsVar3;
                        lm30Var = lm30Var2;
                        uo5Var = uo5Var3;
                        z3 = false;
                        btsVar.e0(1039899372);
                        btsVar.t(false);
                    }
                    if (z4) {
                        btsVar.e0(1039944136);
                        if (m1a0Var == null || aj31Var == null) {
                            c530Var = c530Var2;
                            obj4 = obj3;
                            tlsVar2 = tlsVar;
                            btsVar.e0(1040432076);
                            btsVar.t(z3);
                        } else {
                            btsVar.e0(1040078428);
                            k3r k3rVar2 = ljs0.b;
                            z910 d4 = pi6.d(uo5Var, z3);
                            int hashCode3 = Long.hashCode(btsVar.T);
                            r1b0 o3 = btsVar.o();
                            f530 d5 = b.d(btsVar, k3rVar2);
                            btsVar.i0();
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            qje.W(btsVar, wlsVar, d4);
                            qje.W(btsVar, wlsVar2, o3);
                            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar4);
                            qje.W(btsVar, wlsVar4, d5);
                            f530 a3 = cj6Var.a(c530Var2, uo5Var2);
                            tlsVar2 = tlsVar;
                            boolean k = btsVar.k(tlsVar2);
                            Object Q2 = btsVar.Q();
                            if (!k) {
                                obj4 = obj3;
                                break;
                            } else {
                                obj4 = obj3;
                            }
                            Q2 = new kiu(17, tlsVar2);
                            btsVar.o0(Q2);
                            f530 m = an91.m(q791.b(a3, null, null, false, null, new awk0(0), (sls) Q2, 12), 12.0f, 0.0f, 2);
                            c530Var = c530Var2;
                            a.a(m, m1a0Var, false, aj31Var, btsVar, 0, 4);
                            btsVar.t(true);
                            z3 = false;
                            btsVar.t(false);
                        }
                        btsVar.t(z3);
                    } else {
                        c530Var = c530Var2;
                        obj4 = obj3;
                        tlsVar2 = tlsVar;
                        btsVar.e0(1040440012);
                        btsVar.t(z3);
                    }
                    x2y x2yVar = new x2y(1.0f, true);
                    boolean k2 = btsVar.k(tlsVar2);
                    Object Q3 = btsVar.Q();
                    if (k2 || Q3 == obj4) {
                        Q3 = new kiu(18, tlsVar2);
                        btsVar.o0(Q3);
                    }
                    lm30 lm30Var3 = lm30Var;
                    ohb1.b(x2yVar, false, null, (sls) Q3, wwg.S(-1646823287, true, new wg30(0, lm30Var3), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    if (lm30Var3.f != null) {
                        btsVar.e0(1040669257);
                        oeb1.c(btsVar, ljs0.m(c530Var, 8.0f));
                        ButtonSize buttonSize = ButtonSize.L;
                        ButtonForm buttonForm = ButtonForm.Circle;
                        ButtonStyle buttonStyle = ButtonStyle.Ghost;
                        boolean k3 = btsVar.k(tlsVar2);
                        Object Q4 = btsVar.Q();
                        if (k3 || Q4 == obj4) {
                            Q4 = new kiu(19, tlsVar2);
                            btsVar.o0(Q4);
                        }
                        x8d.a.getClass();
                        d17.c(null, false, buttonSize, buttonStyle, buttonForm, (sls) Q4, x8d.b, btsVar, 1600896, 3);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1040979660);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    zy11Var = zy11Var2;
                    btsVar.Y();
                }
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                c.b(lm30Var2, tlsVar3, this.w, (fid) obj, vng.O(1));
                return zy11Var2;
        }
    }

    public /* synthetic */ vg30(lm30 lm30Var, aj31 aj31Var, tls tlsVar) {
        this.b = lm30Var;
        this.w = aj31Var;
        this.c = tlsVar;
    }
}
