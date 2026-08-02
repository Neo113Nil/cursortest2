package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class xvc implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ xvc(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aa10 w;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        float f = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    sya1.a(rya1.a(ea91.b(btsVar, f1h0.ic_compass_24), false), ira1.i(c530Var, 360.0f - f), ohb1.e(btsVar, kyh0.discovery_accessibility_restore_map_rotation), null, btsVar, 0, 8);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(1 & intValue2, (intValue2 & 17) != 16)) {
                    sya1.a(rya1.a(ea91.b(btsVar2, f1h0.ic_compass_24), false), ira1.i(c530Var, 360.0f - f), "", null, btsVar2, 384, 8);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(1 & intValue3, (intValue3 & 17) != 16)) {
                    o4b1.b(mt71.m(f1h0.ic_compass_24, 0, btsVar3), null, ira1.i(c530Var, 360.0f - f), null, null, 0.0f, null, btsVar3, 56, 120);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                o l0 = ((x910) obj2).l0(((n8e) obj3).a);
                w = ((k) obj).w(l0.a, m810.b(l0.b * f), b.f(), new q83(l0, 8));
                return w;
        }
    }
}
