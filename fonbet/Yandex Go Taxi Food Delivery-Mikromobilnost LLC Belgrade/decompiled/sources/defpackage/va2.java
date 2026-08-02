package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final /* synthetic */ class va2 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ va2(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float min;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                f6w f6wVar = (f6w) obj;
                f6w f6wVar2 = (f6w) obj2;
                float f = zl10.a;
                int i2 = f6wVar2.a;
                int i3 = f6wVar2.d;
                int i4 = f6wVar2.c;
                int i5 = f6wVar2.b;
                int i6 = f6wVar.c;
                int i7 = f6wVar.b;
                int i8 = f6wVar.d;
                int i9 = f6wVar.a;
                float f2 = 1.0f;
                if (i2 < i6) {
                    if (i4 <= i9) {
                        min = 1.0f;
                    } else if (f6wVar2.d() != 0) {
                        min = (((Math.min(f6wVar.c, i4) + Math.max(i9, i2)) / 2) - i2) / f6wVar2.d();
                    }
                    if (i5 < i8) {
                        if (i3 > i7) {
                            if (f6wVar2.b() != 0) {
                                f2 = (((Math.min(i8, i3) + Math.max(i7, i5)) / 2) - i5) / f6wVar2.b();
                            }
                        }
                        oz40Var.setValue(new jw01(jl40.b(min, f2)));
                        return zy11Var;
                    }
                    f2 = 0.0f;
                    oz40Var.setValue(new jw01(jl40.b(min, f2)));
                    return zy11Var;
                }
                min = 0.0f;
                if (i5 < i8) {
                }
                f2 = 0.0f;
                oz40Var.setValue(new jw01(jl40.b(min, f2)));
                return zy11Var;
            case 1:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    Object Q = btsVar.Q();
                    if (Q == did.a) {
                        Q = new ps20(15);
                        btsVar.o0(Q);
                    }
                    f530 b = fnq0.b(c530.a, false, (tls) Q);
                    z910 d = pi6.d(x4c.b, false);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, b);
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
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar);
                    }
                    qje.W(btsVar, d.d, d2);
                    xvz.u(0, (wls) oz40Var.getValue(), btsVar, true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                ArrayList arrayList = new ArrayList((List) oz40Var.getValue());
                arrayList.add(intValue3, arrayList.remove(intValue2));
                oz40Var.setValue(arrayList);
                return zy11Var;
        }
    }
}
