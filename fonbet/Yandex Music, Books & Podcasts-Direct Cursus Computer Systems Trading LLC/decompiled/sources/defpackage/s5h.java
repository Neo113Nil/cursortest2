package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class s5h implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5h b;

    public /* synthetic */ s5h(t5h t5hVar, int i) {
        this.a = i;
        this.b = t5hVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.r.l((List) obj);
                break;
            default:
                this.b.m.l((x5h) obj);
                break;
        }
        return Unit.a;
    }
}
