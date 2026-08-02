package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class rqs implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ brs b;

    public /* synthetic */ rqs(brs brsVar, int i) {
        this.a = i;
        this.b = brsVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n7q n7qVar;
        int i = this.a;
        brs brsVar = this.b;
        switch (i) {
            case 0:
                jyr jyrVar = brsVar.w;
                ass assVar = (ass) jyrVar.getValue();
                eca ecaVar = eca.d;
                mqs mqsVar = brsVar.a;
                ovs ovsVar = brsVar.h;
                eca i2 = d51.i(mqsVar, ovsVar != null ? brs.r(ovsVar) : null);
                xdr xdrVar = assVar.e;
                wba a = assVar.c.a(i2.a(), null);
                if (a instanceof tba) {
                    mwj mwjVar = new mwj(new Pair(i2, urs.a));
                    xdrVar.getClass();
                    xdrVar.m(null, mwjVar);
                } else if (a instanceof vba) {
                    mwj mwjVar2 = new mwj(new Pair(i2, vrs.a));
                    xdrVar.getClass();
                    xdrVar.m(null, mwjVar2);
                } else {
                    if (!a.equals(sba.a) && !a.equals(uba.a)) {
                        b6e.s();
                        return null;
                    }
                    mwj mwjVar3 = new mwj(new Pair(i2, trs.a));
                    xdrVar.getClass();
                    xdrVar.m(null, mwjVar3);
                }
                ass assVar2 = (ass) jyrVar.getValue();
                Context context = brsVar.e;
                m mVar = brsVar.d;
                qe3 y = brsVar.l.y();
                boolean a2 = ((lwc) brsVar.x.getValue()).a();
                assVar2.getClass();
                context.getClass();
                y.getClass();
                return new zrs(assVar2.e, assVar2, context, mVar, y, a2);
            default:
                d6l x = p6g.x((e6l) ((oq7) brsVar.v.getValue()).a.c.getValue());
                return Boolean.valueOf((x == null || (n7qVar = x.a) == null) ? false : vut.E(n7qVar));
        }
    }
}
