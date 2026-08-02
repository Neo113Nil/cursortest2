package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class xfj implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ dgj b;

    public /* synthetic */ xfj(dgj dgjVar, int i) {
        this.a = i;
        this.b = dgjVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.g.l((List) obj);
                break;
            default:
                List list = (List) obj;
                ouj.B("install notifications: ", list, 3, "NotificationTabTriggerController", null);
                dgj dgjVar = this.b;
                CopyOnWriteArrayList copyOnWriteArrayList = dgjVar.f;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(list);
                dgjVar.a();
                break;
        }
        return Unit.a;
    }
}
