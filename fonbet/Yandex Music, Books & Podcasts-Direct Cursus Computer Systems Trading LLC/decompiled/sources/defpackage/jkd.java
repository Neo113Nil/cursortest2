package defpackage;

import defpackage.hmm;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jkd extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ArrayList k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkd(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.k = arrayList;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        jkd jkdVar = new jkd(this.k, continuation);
        jkdVar.j = obj;
        return jkdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jkd) create((hmm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpi b = ((hmm) this.j).b();
        hmm.a aVar = okd.g;
        ArrayList<pkd> arrayList = this.k;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pkd) it.next()).getClass().getName());
        }
        b.g(aVar, CollectionsKt.A0(arrayList2));
        for (pkd pkdVar : arrayList) {
            hkd hkdVar = okd.d;
            hkdVar.getClass();
            String canonicalName = pkdVar.getClass().getCanonicalName();
            if (canonicalName == null) {
                xq0.x("no receiver name");
                return null;
            }
            hmm.a a = hkd.a(hkdVar, canonicalName);
            String canonicalName2 = pkdVar.b().getClass().getCanonicalName();
            if (canonicalName2 == null) {
                xq0.x("no provider name");
                return null;
            }
            b.h(a, canonicalName2);
        }
        return b.c();
    }
}
