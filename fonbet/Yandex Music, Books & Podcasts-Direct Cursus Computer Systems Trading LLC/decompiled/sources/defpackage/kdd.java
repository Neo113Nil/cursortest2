package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;

/* loaded from: classes5.dex */
public final class kdd extends aur implements ryc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdd(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.j = i;
        this.m = obj;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.j) {
            case 0:
                kdd kddVar = new kdd(4, 0, (Continuation) obj4);
                kddVar.k = (List) obj;
                kddVar.l = (List) obj2;
                kddVar.m = (egd) obj3;
                return kddVar.invokeSuspend(Unit.a);
            case 1:
                kdd kddVar2 = new kdd((jfd) this.m, (Continuation) obj4, 1);
                kddVar2.k = (ijd) obj;
                kddVar2.l = (pjd) obj2;
                return kddVar2.invokeSuspend(Unit.a);
            case 2:
                kdd kddVar3 = new kdd(4, 2, (Continuation) obj4);
                kddVar3.k = (Pair) obj;
                kddVar3.l = (x7q) obj2;
                kddVar3.m = (e6l) obj3;
                return kddVar3.invokeSuspend(Unit.a);
            case 3:
                kdd kddVar4 = new kdd((a3m) this.m, (Continuation) obj4, 3);
                kddVar4.k = (cvf) obj2;
                kddVar4.l = (cvf) obj3;
                return kddVar4.invokeSuspend(Unit.a);
            default:
                kdd kddVar5 = new kdd(4, 4, (Continuation) obj4);
                kddVar5.k = (String) obj;
                kddVar5.l = (CurrentStreamType) obj2;
                kddVar5.m = (CurrentVideoType) obj3;
                return kddVar5.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        cfd cfdVar;
        cfd cfdVar2;
        switch (this.j) {
            case 0:
                List list = (List) this.k;
                List list2 = (List) this.l;
                egd egdVar = (egd) this.m;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ArrayList g0 = CollectionsKt.g0(CollectionsKt.g0(u75.i(egdVar), list), list2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = g0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((ggd) next).a())) {
                        arrayList.add(next);
                    }
                }
                return CollectionsKt.o0(CollectionsKt.o0(arrayList, new zda(11)), new zda(12));
            case 1:
                ijd ijdVar = (ijd) this.k;
                pjd pjdVar = (pjd) this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (ijdVar instanceof gjd) {
                    cfdVar = cfd.a;
                } else if (ijdVar instanceof cjd) {
                    cfdVar = cfd.b;
                } else if (ijdVar instanceof hjd) {
                    cfdVar = cfd.b;
                } else {
                    if (!(ijdVar instanceof fjd)) {
                        b6e.s();
                        return null;
                    }
                    fjd fjdVar = (fjd) ijdVar;
                    if (fjdVar instanceof ejd) {
                        cfdVar = cfd.c;
                    } else {
                        if (!(fjdVar instanceof djd)) {
                            b6e.s();
                            return null;
                        }
                        cfdVar = cfd.d;
                    }
                }
                if (pjdVar instanceof njd) {
                    cfdVar2 = cfd.a;
                } else if (pjdVar instanceof jjd) {
                    cfdVar2 = cfd.b;
                } else if (pjdVar instanceof ojd) {
                    cfdVar2 = cfd.b;
                } else {
                    if (!(pjdVar instanceof mjd)) {
                        b6e.s();
                        return null;
                    }
                    mjd mjdVar = (mjd) pjdVar;
                    if (mjdVar instanceof kjd) {
                        cfdVar2 = cfd.c;
                    } else {
                        if (!(mjdVar instanceof ljd)) {
                            b6e.s();
                            return null;
                        }
                        cfdVar2 = cfd.d;
                    }
                }
                ssg.a(4, null, "new discovery conditions: " + cfdVar2 + ". calculated from " + pjdVar, null);
                return new bfd(cfdVar, cfdVar2);
            case 2:
                Pair pair = (Pair) this.k;
                x7q x7qVar = (x7q) this.l;
                e6l e6lVar = (e6l) this.m;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                v8n v8nVar = (v8n) pair.a;
                a0q a0qVar = (a0q) pair.b;
                if (a0qVar != null && !Intrinsics.d(e6lVar, b6l.a)) {
                    if (e6lVar instanceof c6l) {
                        if (x7qVar != null) {
                            k7q k7qVar = x7qVar.a;
                            k7qVar.getClass();
                            if (Intrinsics.d(k7qVar instanceof v8n ? (v8n) k7qVar : null, v8nVar)) {
                                return a8l.b;
                            }
                        }
                    } else {
                        if (!(e6lVar instanceof d6l)) {
                            b6e.s();
                            return null;
                        }
                        if (Intrinsics.d((a0q) wdg.A(((d6l) e6lVar).a, i9w.e), a0qVar)) {
                            return p6g.C(e6lVar) ? a8l.c : a8l.d;
                        }
                    }
                }
                return a8l.a;
            case 3:
                cvf cvfVar = (cvf) this.k;
                cvf cvfVar2 = (cvf) this.l;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                a3m a3mVar = (a3m) this.m;
                int i = cvfVar.a;
                int i2 = cvfVar2.a;
                m3m m3mVar = a3mVar.b;
                m3mVar.getClass();
                m3mVar.H(new ro6(i, i2, m3mVar, 1));
                return Unit.a;
            default:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                return new wb6((String) this.k, (CurrentStreamType) this.l, (CurrentVideoType) this.m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kdd(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }
}
