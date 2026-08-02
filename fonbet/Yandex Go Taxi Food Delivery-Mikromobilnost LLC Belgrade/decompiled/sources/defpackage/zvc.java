package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.taxi.shared.pin.PinSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class zvc implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ zvc(float f, f530 f530Var, ButtonSize buttonSize, sls slsVar, int i) {
        this.a = 0;
        this.b = f;
        this.c = f530Var;
        this.w = buttonSize;
        this.x = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wob1.a(this.b, (f530) obj5, (ButtonSize) obj4, (sls) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                sl91.a((String) obj5, (String) obj4, (Long) obj3, this.b, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                f530 f530Var = (f530) obj5;
                PinSize pinSize = (PinSize) obj4;
                a aVar = (a) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 b = m4m0.b(ljs0.a(f530Var, pinSize.getElementSize(), pinSize.getElementSize()), ((ldc) btsVar.m(k2z.b)).a, cyk0.c(this.b));
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
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
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    aVar.invoke(cj6.a, btsVar, 6);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                z9b1.a((f530) obj5, (jt1) obj4, (nhe) obj3, this.b, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                dpb1.b((f530) obj5, (sls) obj3, this.b, (sls) obj4, (fid) obj, vng.O(3073));
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                u7a1.d((f530) obj5, (y9o) obj4, this.b, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ zvc(float f, int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = f;
    }

    public /* synthetic */ zvc(f530 f530Var, y9o y9oVar, float f, f530 f530Var2, int i) {
        this.a = 5;
        this.c = f530Var;
        this.w = y9oVar;
        this.b = f;
        this.x = f530Var2;
    }

    public /* synthetic */ zvc(f530 f530Var, sls slsVar, float f, sls slsVar2, int i) {
        this.a = 4;
        this.c = f530Var;
        this.x = slsVar;
        this.b = f;
        this.w = slsVar2;
    }

    public /* synthetic */ zvc(f530 f530Var, PinSize pinSize, float f, a aVar) {
        this.a = 2;
        this.c = f530Var;
        this.w = pinSize;
        this.b = f;
        this.x = aVar;
    }
}
