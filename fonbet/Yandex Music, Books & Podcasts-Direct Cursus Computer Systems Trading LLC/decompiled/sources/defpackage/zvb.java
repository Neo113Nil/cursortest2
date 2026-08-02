package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class zvb implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jub b;

    public /* synthetic */ zvb(jub jubVar, int i) {
        this.a = i;
        this.b = jubVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                wxc wxcVar = this.b.d.g;
                xdr xdrVar = wxcVar.d;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                if (!booleanValue) {
                    wxcVar.a(false);
                }
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                wxc wxcVar2 = this.b.d.g;
                xdr xdrVar2 = wxcVar2.d;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                if (!booleanValue2) {
                    wxcVar2.a(false);
                }
                break;
        }
        return Unit.a;
    }
}
