package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class qsl extends aur implements Function2 {
    public int j;
    public final /* synthetic */ btl k;
    public final /* synthetic */ String l;
    public final /* synthetic */ long m;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsl(btl btlVar, String str, long j, ArrayList arrayList, int i, Continuation continuation) {
        super(2, continuation);
        this.k = btlVar;
        this.l = str;
        this.m = j;
        this.n = arrayList;
        this.o = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new qsl(this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qsl) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            i2m i2mVar = this.k.d;
            Integer num = new Integer(this.o);
            this.j = 1;
            if (i2mVar.a(this.l, this.m, this.n, num, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
