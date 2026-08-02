package defpackage;

import android.view.ViewStructure;
import androidx.compose.foundation.lazy.a;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class lh0 extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh0(int i, Object obj) {
        super(4);
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r8 <= r6) goto L31;
     */
    @Override // defpackage.ryc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        char c;
        float f;
        switch (this.r) {
            case 0:
                int i2 = ((oqc) obj3).a;
                int i3 = ((pqc) obj4).a;
                mh0 mh0Var = (mh0) this.s;
                odt b = ((rpc) mh0Var.e).b((qpc) obj, (tqc) obj2, i2, i3);
                if (!(b instanceof ndt)) {
                    lum lumVar = new lum(b, mh0Var.j);
                    mh0Var.j = lumVar;
                    Object obj5 = lumVar.c;
                    obj5.getClass();
                    break;
                } else {
                    Object obj6 = ((ndt) b).a;
                    obj6.getClass();
                    break;
                }
            case 1:
                dsf dsfVar = (dsf) obj;
                ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(dsfVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 131) != 130)) {
                    ((wn5) this.s).invoke(dsfVar, oq5Var, Integer.valueOf(intValue & 14));
                } else {
                    oq5Var.S();
                }
                break;
            case 2:
                a aVar = (a) obj;
                ((Number) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(aVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 131) != 130)) {
                    ((pyc) this.s).invoke(aVar, oq5Var2, Integer.valueOf(intValue2 & 14));
                } else {
                    oq5Var2.S();
                }
                break;
            case 3:
                dsf dsfVar2 = (dsf) obj;
                int intValue3 = ((Number) obj2).intValue();
                hq5 hq5Var3 = (hq5) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i = (((oq5) hq5Var3).f(dsfVar2) ? 4 : 2) | intValue4;
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= ((oq5) hq5Var3).d(intValue3) ? 32 : 16;
                }
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(i & 1, (i & 147) != 146)) {
                    oq5Var3.Z(489052636);
                    swf.g(0, oq5Var3);
                    oq5Var3.p(false);
                } else {
                    oq5Var3.S();
                }
                break;
            case 4:
                int intValue5 = ((Number) obj).intValue();
                int intValue6 = ((Number) obj2).intValue();
                ((ViewStructure) this.s).setDimens(intValue5, intValue6, 0, 0, ((Number) obj3).intValue() - intValue5, ((Number) obj4).intValue() - intValue6);
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wof wofVar = (wof) obj2;
                long j = ((enj) obj3).a;
                zdp zdpVar = (zdp) obj4;
                xep xepVar = (xep) this.s;
                long j2 = wofVar.j();
                float f2 = (int) (j2 >> 32);
                float f3 = (int) (j2 & 4294967295L);
                int i4 = (int) (j >> 32);
                float intBitsToFloat = Float.intBitsToFloat(i4);
                if (0.0f <= intBitsToFloat && intBitsToFloat <= f2) {
                    c = ' ';
                    f = f2;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    if (0.0f <= intBitsToFloat2) {
                        break;
                    }
                } else {
                    c = ' ';
                    f = f2;
                }
                float intBitsToFloat3 = Float.intBitsToFloat(i4) < 0.0f ? 0.0f : Float.intBitsToFloat(i4) > f ? f : Float.intBitsToFloat(i4);
                int i5 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i5) < 0.0f) {
                    f3 = 0.0f;
                } else if (Float.intBitsToFloat(i5) <= f3) {
                    f3 = Float.intBitsToFloat(i5);
                }
                j = (Float.floatToRawIntBits(intBitsToFloat3) << c) | (Float.floatToRawIntBits(f3) & 4294967295L);
                long a = xep.a(xepVar, wofVar, j);
                if ((9223372034707292159L & a) != 9205357640488583168L) {
                    xepVar.l(booleanValue);
                    xepVar.r = null;
                    xepVar.p(a, 9205357640488583168L, false, zdpVar);
                    yoc.b(xepVar.h);
                    xepVar.n(false);
                }
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                String str4 = (String) obj4;
                eta.r(str, str2, str3, str4);
                qne q0 = gut.q0(str, str3, str2, str4);
                x60 x60Var = (x60) ((g0c) ((z6u) this.s).d);
                x60Var.getClass();
                x60Var.a(q0);
                break;
        }
        return Unit.a;
    }
}
