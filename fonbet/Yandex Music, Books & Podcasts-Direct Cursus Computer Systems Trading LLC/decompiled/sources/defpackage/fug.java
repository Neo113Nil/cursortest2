package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class fug implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ xmo b;

    public /* synthetic */ fug(xmo xmoVar, int i) {
        this.a = i;
        this.b = xmoVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                ssg.a(4, null, "LoginTrigger: user logged in -> perform", null);
                Object emit = this.b.emit("LoginTrigger", continuation);
                if (emit != nm6.a) {
                    break;
                }
                break;
            default:
                ssg.a(3, null, "LogoutTrigger: logout detected -> perform", null);
                Object emit2 = this.b.emit("LogoutTrigger", continuation);
                if (emit2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
