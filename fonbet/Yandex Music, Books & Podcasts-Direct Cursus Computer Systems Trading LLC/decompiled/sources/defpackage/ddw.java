package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ddw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ldw b;

    public /* synthetic */ ddw(ldw ldwVar, int i) {
        this.a = i;
        this.b = ldwVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                vat vatVar = (vat) obj;
                nyn nynVar = (nyn) vatVar.a;
                aaq aaqVar = (aaq) vatVar.b;
                xdr xdrVar = this.b.j;
                jcw jcwVar = new jcw("repeat: " + nynVar, aaqVar.getId(), nynVar);
                xdrVar.getClass();
                xdrVar.m(null, jcwVar);
                break;
            case 1:
                vat vatVar2 = (vat) obj;
                Boolean bool = (Boolean) vatVar2.a;
                boolean booleanValue = bool.booleanValue();
                aaq aaqVar2 = (aaq) vatVar2.b;
                xdr xdrVar2 = this.b.h;
                jcw jcwVar2 = new jcw("playing: " + booleanValue, aaqVar2.getId(), bool);
                xdrVar2.getClass();
                xdrVar2.m(null, jcwVar2);
                break;
            case 2:
                vat vatVar3 = (vat) obj;
                icw icwVar = (icw) vatVar3.a;
                aaq aaqVar3 = (aaq) vatVar3.b;
                String str = icwVar.a;
                if (str != null) {
                    xdr xdrVar3 = this.b.e;
                    StringBuilder l = f1d.l(icwVar.b, "entity: ", aaqVar3.getId(), " at ", " playable: ");
                    l.append(str);
                    jcw jcwVar3 = new jcw(l.toString(), aaqVar3.getId(), icwVar);
                    xdrVar3.getClass();
                    xdrVar3.m(null, jcwVar3);
                    break;
                } else {
                    break;
                }
            case 3:
                vat vatVar4 = (vat) obj;
                int intValue = ((Number) vatVar4.a).intValue();
                aaq aaqVar4 = (aaq) vatVar4.b;
                xdr xdrVar4 = this.b.g;
                jcw jcwVar4 = new jcw(k5r.i(intValue, "edit: hashCode="), aaqVar4.getId(), new Integer(intValue));
                xdrVar4.getClass();
                xdrVar4.m(null, jcwVar4);
                break;
            default:
                vat vatVar5 = (vat) obj;
                List list = (List) vatVar5.a;
                aaq aaqVar5 = (aaq) vatVar5.b;
                xdr xdrVar5 = this.b.i;
                jcw jcwVar5 = new jcw("shuffle: " + list, aaqVar5.getId(), list);
                xdrVar5.getClass();
                xdrVar5.m(null, jcwVar5);
                break;
        }
        return Unit.a;
    }
}
