package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k5q implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5q b;

    public /* synthetic */ k5q(n5q n5qVar, int i) {
        this.a = i;
        this.b = n5qVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        n7q n7qVar;
        switch (this.a) {
            case 0:
                gzk gzkVar = (gzk) obj;
                n5q n5qVar = this.b;
                n5qVar.b.Q(gzkVar);
                if (gzkVar.b == tnl.d) {
                    l6q l6qVar = (l6q) n5qVar.c;
                    ((hjr) l6qVar.k.getValue()).g = null;
                    ((pvs) l6qVar.j.getValue()).getClass();
                }
                break;
            default:
                hzk hzkVar = (hzk) obj;
                n5q n5qVar2 = this.b;
                j6q j6qVar = n5qVar2.c;
                mwk mwkVar = n5qVar2.f.b;
                l6q l6qVar2 = (l6q) j6qVar;
                l6qVar2.getClass();
                hzkVar.getClass();
                mwkVar.getClass();
                d6l x = p6g.x((e6l) l6qVar2.a.c.getValue());
                if (x == null || (n7qVar = x.a) == null) {
                    ssg.a(6, "SharedPlayerErrorHandler", "general playback error queueState is null", hzkVar);
                } else {
                    wdg.A(n7qVar, new lum(l6qVar2, hzkVar, mwkVar));
                }
                break;
        }
        return Unit.a;
    }
}
