package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class akg extends aur implements Function2 {
    public int j;
    public final /* synthetic */ fkg k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akg(fkg fkgVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.k = fkgVar;
        this.l = str;
        this.m = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new akg(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((akg) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        fkg fkgVar = this.k;
        if (i == 0) {
            qgg.h0(obj);
            pjc data = ((wb7) fkgVar.b.getValue()).getData();
            this.j = 1;
            obj = zsd.g0(data, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        fkgVar.getClass();
        hmm.a aVar = new hmm.a(fkg.e(this.l, this.m));
        lpi lpiVar = (lpi) ((hmm) obj);
        lpiVar.getClass();
        return lpiVar.a.get(aVar);
    }
}
