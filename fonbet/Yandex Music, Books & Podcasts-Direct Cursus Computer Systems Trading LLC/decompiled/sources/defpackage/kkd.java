package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kkd extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ Set k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkd(Set set, Continuation continuation) {
        super(2, continuation);
        this.k = set;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        kkd kkdVar = new kkd(this.k, continuation);
        kkdVar.j = obj;
        return kkdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kkd) create((hmm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        hmm hmmVar = (hmm) this.j;
        Set set = (Set) hmmVar.a(okd.g);
        if (set != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (!this.k.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                lpi b = hmmVar.b();
                b.g(okd.g, wop.h(set, arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b.f(hkd.a(okd.d, (String) it.next()));
                }
                return b.c();
            }
        }
        return hmmVar;
    }
}
