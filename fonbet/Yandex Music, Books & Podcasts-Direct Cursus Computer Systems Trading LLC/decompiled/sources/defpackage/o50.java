package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class o50 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvf b;

    public /* synthetic */ o50(fvf fvfVar, int i) {
        this.a = i;
        this.b = fvfVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        int i = this.a;
        fvf fvfVar = this.b;
        switch (i) {
            case 0:
                apo apoVar = fvf.w;
                Object m = fvfVar.m(0, 0, continuation);
                if (m != nm6.a) {
                    break;
                }
                break;
            case 1:
                apo apoVar2 = fvf.w;
                Object f = fvfVar.f(0, 0, continuation);
                if (f != nm6.a) {
                    break;
                }
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                apo apoVar3 = fvf.w;
                Object m2 = fvfVar.m(intValue, 0, continuation);
                if (m2 != nm6.a) {
                    break;
                }
                break;
            case 3:
                ((Boolean) obj).getClass();
                Object F = vwb.F(fvfVar, continuation);
                if (F != nm6.a) {
                    break;
                }
                break;
            case 4:
                ((Boolean) obj).getClass();
                Object C = cxb.C(fvfVar, continuation);
                if (C != nm6.a) {
                    break;
                }
                break;
            case 5:
                int intValue2 = ((Number) obj).intValue();
                apo apoVar4 = fvf.w;
                Object f2 = fvfVar.f(intValue2, 0, continuation);
                if (f2 != nm6.a) {
                    break;
                }
                break;
            case 6:
                Object m3 = fvfVar.m(0, 0, continuation);
                if (m3 != nm6.a) {
                    break;
                }
                break;
            default:
                int intValue3 = ((Number) obj).intValue();
                if (fvfVar.h() != intValue3 || fvfVar.i() != 0) {
                    Object f3 = fvfVar.f(intValue3 + 1, 0, continuation);
                    if (f3 != nm6.a) {
                        break;
                    }
                } else {
                    Iterator it = fvfVar.j().k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((cvf) obj2).a == intValue3) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Object g = neg.g(fvfVar, ((cvf) obj2) != null ? r3.q : 0.0f, weo.S(800, 0, null, 6), continuation);
                    if (g != nm6.a) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
