package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class ta2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta2(List list, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.k = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ta2(this.k, continuation, 0);
            case 1:
                return new ta2(this.k, continuation, 1);
            case 2:
                return new ta2(this.k, continuation, 2);
            default:
                return new ta2(this.k, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((ta2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        List list = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return list;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                nnk D = nnk.D();
                List o0 = CollectionsKt.o0(list, new dl4(20));
                ArrayList arrayList = new ArrayList(v75.o(o0, 10));
                Iterator it = o0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t2m) it.next()).a);
                }
                psd psdVar = new psd(2);
                psdVar.b = "Dislikes";
                psdVar.a("Loading dislikes");
                D.getClass();
                Timber.v("get list of full tracks from server", new Object[0]);
                l0t l0tVar = (l0t) D.b;
                l0tVar.getClass();
                rj6 rj6Var = (rj6) x97.D(g.a, new h0t(l0tVar, arrayList, psdVar, null, 0));
                if (rj6Var instanceof qj6) {
                    return (List) ((qj6) rj6Var).a;
                }
                Timber.e("Failed to get list of full tracks", new Object[0]);
                return null;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ssg.a(6, "EntityStorage", "Not yet implemented : fetchVideoClips videoClipIds=".concat(CollectionsKt.X(list, null, null, null, null, 63)), null);
                return c5b.a;
            default:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                aoi.c().d(list);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta2(List list, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = list;
    }
}
