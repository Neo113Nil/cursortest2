package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class yha implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ zha b;

    public /* synthetic */ yha(zha zhaVar, int i) {
        this.a = i;
        this.b = zhaVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.o.l((List) obj);
                break;
            default:
                this.b.m.l((cia) obj);
                break;
        }
        return Unit.a;
    }
}
