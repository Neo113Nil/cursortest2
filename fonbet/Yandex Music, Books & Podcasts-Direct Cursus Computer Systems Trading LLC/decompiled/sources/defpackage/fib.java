package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fib implements o3c {
    public final /* synthetic */ int a;
    public final szm b;

    public /* synthetic */ fib(szm szmVar, int i) {
        this.a = i;
        this.b = szmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        int i = this.a;
        szm szmVar = this.b;
        switch (i) {
            case 0:
                return new eib((uzm) ((soe) szmVar).a);
            case 1:
                aec aecVar = (aec) ((soe) szmVar).a;
                aecVar.getClass();
                slp slpVar = slp.a;
                return slp.a(aecVar);
            case 2:
                Context context = (Context) ((soe) szmVar).a;
                context.getClass();
                return dmm.b(new xyn(lhb.y), new ji7(context, 1), 6);
            case 3:
                Context context2 = (Context) ((soe) szmVar).a;
                context2.getClass();
                return dmm.b(new xyn(lhb.z), new ji7(context2, 2), 6);
            case 4:
                return new flg((Context) ((soe) szmVar).a);
            case 5:
                return new hmp((Context) ((soe) szmVar).a);
            default:
                return new ipp((wb7) szmVar.get());
        }
    }
}
