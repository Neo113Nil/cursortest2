package defpackage;

import android.view.View;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mwb implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jub b;
    public final /* synthetic */ View c;

    public /* synthetic */ mwb(jub jubVar, View view, int i) {
        this.a = i;
        this.b = jubVar;
        this.c = view;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Pair pair = (Pair) obj;
                Boolean bool = (Boolean) pair.a;
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
                wxc wxcVar = this.b.d.g;
                xdr xdrVar = wxcVar.d;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                if (!booleanValue) {
                    wxcVar.a(false);
                }
                this.c.setKeepScreenOn(booleanValue2);
                break;
            default:
                Pair pair2 = (Pair) obj;
                Boolean bool2 = (Boolean) pair2.a;
                boolean booleanValue3 = bool2.booleanValue();
                boolean booleanValue4 = ((Boolean) pair2.b).booleanValue();
                wxc wxcVar2 = this.b.d.g;
                xdr xdrVar2 = wxcVar2.d;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                if (!booleanValue3) {
                    wxcVar2.a(false);
                }
                this.c.setKeepScreenOn(booleanValue4);
                break;
        }
        return Unit.a;
    }
}
