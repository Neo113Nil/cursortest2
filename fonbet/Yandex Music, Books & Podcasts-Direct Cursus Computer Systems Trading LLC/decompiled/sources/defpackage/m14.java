package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class m14 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ n14 b;

    public /* synthetic */ m14(n14 n14Var, int i) {
        this.a = i;
        this.b = n14Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object e = ((p44) this.b.d.getValue()).e((f24) obj, "likes", continuation);
                if (e != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object e2 = ((p44) this.b.d.getValue()).e(f24.d, "downloads", continuation);
                if (e2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object e3 = ((p44) this.b.d.getValue()).e(f24.e, "editor", continuation);
                if (e3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
