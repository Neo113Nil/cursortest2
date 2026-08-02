package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class s4s implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5s b;

    public /* synthetic */ s4s(c5s c5sVar, int i) {
        this.a = i;
        this.b = c5sVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                ot0.A(j4s.b.e(), "take_charge_notification_show", null);
                Object V = x97.V(dm6.b(), new r4s(this.b, null, 0), continuation);
                if (V != nm6.a) {
                    break;
                }
                break;
            case 1:
                ((Boolean) obj).getClass();
                Object V2 = x97.V(dm6.b(), new t4s(this.b, null, 0), continuation);
                if (V2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                ((Boolean) obj).getClass();
                Object V3 = x97.V(dm6.b(), new r4s(this.b, null, 1), continuation);
                if (V3 != nm6.a) {
                    break;
                }
                break;
            default:
                ((Boolean) obj).getClass();
                ot0.A(j4s.b.e(), "take_charge_popup_show", null);
                Object V4 = x97.V(dm6.b(), new r4s(this.b, null, 2), continuation);
                if (V4 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
