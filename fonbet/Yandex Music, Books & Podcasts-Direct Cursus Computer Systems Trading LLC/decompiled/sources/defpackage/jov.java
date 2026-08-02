package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class jov implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pov b;

    public /* synthetic */ jov(pov povVar, int i) {
        this.a = i;
        this.b = povVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                tlv tlvVar = (tlv) obj;
                this.b.e.l(tlvVar);
                ssg.a(4, "WidgetSharedViewModel", "Widget state was updated: " + tlvVar, null);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = this.b.h;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 2:
                slv slvVar = (slv) obj;
                this.b.f.l(slvVar);
                ssg.a(4, "WidgetSharedViewModel", "[init] new state was received " + slvVar, null);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue = bool2.booleanValue();
                xdr xdrVar2 = this.b.g;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                ssg.a(4, "WidgetSharedViewModel", "[playerLoadingStateListener] _playerLoadingState is " + booleanValue, null);
                break;
        }
        return Unit.a;
    }
}
