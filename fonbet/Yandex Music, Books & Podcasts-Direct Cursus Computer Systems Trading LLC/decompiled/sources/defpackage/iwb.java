package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class iwb implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jtm b;

    public /* synthetic */ iwb(jtm jtmVar, int i) {
        this.a = i;
        this.b = jtmVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.b.setValue(bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.b.setValue(bool2);
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.b.setValue(bool3);
                break;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.b.setValue(bool4);
                break;
            case 4:
                this.b.setValue(obj);
                break;
            case 5:
                this.b.setValue(obj);
                break;
            case 6:
                this.b.setValue(obj);
                break;
            case 7:
                this.b.setValue(obj);
                break;
            default:
                this.b.setValue(new Long(((Number) obj).longValue()));
                break;
        }
        return Unit.a;
    }
}
