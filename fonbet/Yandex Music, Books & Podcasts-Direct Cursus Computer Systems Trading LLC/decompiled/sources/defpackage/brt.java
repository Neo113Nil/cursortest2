package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class brt extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ crt k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ brt(crt crtVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = crtVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new brt(this.k, continuation, 0);
            default:
                return new brt(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((brt) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        crt crtVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                q3t q3tVar = crtVar.a.a;
                List a = q3tVar.d.a();
                String a2 = q3tVar.n.a();
                a2.getClass();
                ArrayList c = q3tVar.a.c(a2);
                ArrayList arrayList = new ArrayList();
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    iss issVar = (iss) next;
                    if (a.contains(issVar.c) && issVar.f.b()) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                long j = 0;
                while (it2.hasNext()) {
                    j += hag.m(q3tVar.m, (iss) it2.next());
                }
                return new Long(j);
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                crtVar.d.invoke();
                return Unit.a;
        }
    }
}
