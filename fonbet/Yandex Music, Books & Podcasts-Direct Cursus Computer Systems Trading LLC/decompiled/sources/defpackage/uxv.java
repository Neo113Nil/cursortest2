package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class uxv implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ cyv b;

    public /* synthetic */ uxv(cyv cyvVar, int i) {
        this.a = i;
        this.b = cyvVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = this.b.f;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                xdr xdrVar2 = this.b.g;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                xdr xdrVar3 = this.b.h;
                xdrVar3.getClass();
                xdrVar3.m(null, bool3);
                break;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                xdr xdrVar4 = this.b.i;
                xdrVar4.getClass();
                xdrVar4.m(null, bool4);
                break;
            default:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                xdr xdrVar5 = this.b.j;
                xdrVar5.getClass();
                xdrVar5.m(null, bool5);
                break;
        }
        return Unit.a;
    }
}
