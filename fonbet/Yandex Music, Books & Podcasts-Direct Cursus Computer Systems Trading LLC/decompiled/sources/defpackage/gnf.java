package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class gnf extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ wsu k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gnf(wsu wsuVar, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = wsuVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gnf(this.k, continuation, 0);
            case 1:
                return new gnf(this.k, continuation, 1);
            default:
                return new gnf(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((gnf) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        wsu wsuVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                List list = wsuVar.a;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jzs) it.next()).a);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                break;
        }
        return new fzu(wsuVar);
    }
}
