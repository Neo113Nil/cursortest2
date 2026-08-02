package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class t5p implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6p b;

    public /* synthetic */ t5p(b6p b6pVar, int i) {
        this.a = i;
        this.b = b6pVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.K().a((String) obj);
                break;
            case 1:
                if (((aal) obj) == aal.b) {
                    xdr xdrVar = this.b.q;
                    Boolean bool = Boolean.FALSE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                }
                break;
            case 2:
                this.b.L();
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                b6p b6pVar = this.b;
                if (b6pVar.getLifecycle().b() == lyf.e && booleanValue) {
                    xdr xdrVar2 = b6pVar.K().l;
                    Boolean bool2 = Boolean.FALSE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool2);
                }
                break;
        }
        return Unit.a;
    }
}
