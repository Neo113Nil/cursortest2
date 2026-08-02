package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ot4 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ poi b;

    public /* synthetic */ ot4(poi poiVar, int i) {
        this.a = i;
        this.b = poiVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Float f = (Float) obj;
                if (f != null) {
                    ((t6k) this.b).h(f.floatValue());
                }
                break;
            case 1:
                Float f2 = (Float) obj;
                if (f2 != null) {
                    ((t6k) this.b).h(f2.floatValue());
                }
                break;
            case 2:
                ((t6k) this.b).h(((Number) obj).floatValue());
                break;
            case 3:
                Float f3 = (Float) obj;
                if (f3 != null) {
                    ((t6k) this.b).h(f3.floatValue());
                }
                break;
            default:
                Float f4 = (Float) obj;
                if (f4 != null) {
                    ((t6k) this.b).h(f4.floatValue());
                }
                break;
        }
        return Unit.a;
    }
}
