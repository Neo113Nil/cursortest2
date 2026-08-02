package defpackage;

import androidx.compose.ui.platform.a;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class m3e implements tyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m3e(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [yci] */
    /* JADX WARN: Type inference failed for: r5v8, types: [yci] */
    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        ?? r5;
        ?? r4;
        int i2;
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                o3e o3eVar = (o3e) this.c;
                pyc pycVar = (pyc) this.d;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                Integer num2 = (Integer) obj2;
                int intValue2 = num2.intValue();
                Integer num3 = (Integer) obj3;
                int intValue3 = num3.intValue();
                hq5 hq5Var = (hq5) obj4;
                int intValue4 = ((Integer) obj5).intValue();
                if ((intValue4 & 6) == 0) {
                    i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue4;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue2) ? 32 : 16;
                }
                if ((intValue4 & 384) == 0) {
                    i |= ((oq5) hq5Var).d(intValue3) ? 256 : 128;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 1171) != 1170)) {
                    int i3 = i & 112;
                    int i4 = i & 896;
                    boolean z = ((i & 14) == 4) | (i3 == 32) | (i4 == 256);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (z || K == kjnVar) {
                        K = new spd(intValue2, intValue3, intValue);
                        oq5Var.k0(K);
                    }
                    spd spdVar = (spd) K;
                    ed5 ed5Var = (ed5) list.get(intValue);
                    boolean z2 = ed5Var instanceof po6;
                    vci vciVar = vci.a;
                    if (z2) {
                        oq5Var.Z(-361528335);
                        po6 po6Var = (po6) ed5Var;
                        bg5 b = o3eVar.b(list, spdVar, oq5Var, 0);
                        yci b2 = b.b(a.a(vciVar, "track_item"), intValue);
                        boolean z3 = (i4 == 256) | (i3 == 32);
                        Object K2 = oq5Var.K();
                        if (z3 || K2 == kjnVar) {
                            K2 = new k3e(intValue3, intValue2, 0);
                            oq5Var.k0(K2);
                        }
                        yci b3 = nfp.b(b2, false, (Function1) K2);
                        if (pycVar != null && (r4 = (yci) pycVar.invoke(num, num2, num3)) != 0) {
                            vciVar = r4;
                        }
                        vut.i(po6Var, b, b3.f(vciVar), oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        if (!(ed5Var instanceof raj)) {
                            throw vz1.i(oq5Var, 1512356917, false);
                        }
                        oq5Var.Z(-360634481);
                        raj rajVar = (raj) ed5Var;
                        wdj d = o3eVar.d(list, spdVar, oq5Var);
                        yci b4 = b.b(a.a(vciVar, "track_item"), intValue);
                        boolean z4 = (i4 == 256) | (i3 == 32);
                        Object K3 = oq5Var.K();
                        if (z4 || K3 == kjnVar) {
                            K3 = new k3e(intValue3, intValue2, 1);
                            oq5Var.k0(K3);
                        }
                        yci b5 = nfp.b(b4, false, (Function1) K3);
                        if (pycVar != null && (r5 = (yci) pycVar.invoke(num, num2, num3)) != 0) {
                            vciVar = r5;
                        }
                        o5g.d(rajVar, d, b5.f(vciVar), oq5Var, 0);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                kwq kwqVar = (kwq) this.b;
                vvo vvoVar = (vvo) this.c;
                hvq hvqVar = (hvq) this.d;
                xsq xsqVar = (xsq) obj;
                ml4 ml4Var = (ml4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                hq5 hq5Var2 = (hq5) obj4;
                int intValue6 = ((Integer) obj5).intValue();
                xsqVar.getClass();
                ml4Var.getClass();
                if ((intValue6 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).f(xsqVar) ? 4 : 2) | intValue6;
                } else {
                    i2 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).f(ml4Var) ? 32 : 16;
                }
                if ((intValue6 & 384) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue5) ? 256 : 128;
                }
                if ((i2 & 1171) == 1170) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                v3g.p(kwqVar.a.a, vvoVar, xsqVar, intValue5, hvqVar, ml4Var, hq5Var2, ((i2 << 6) & 896) | ((i2 << 3) & 7168) | ((i2 << 12) & 458752));
                return Unit.a;
        }
    }
}
