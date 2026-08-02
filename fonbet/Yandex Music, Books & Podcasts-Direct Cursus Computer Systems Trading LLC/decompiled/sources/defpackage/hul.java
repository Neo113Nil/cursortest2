package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class hul extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ jul l;
    public final /* synthetic */ cvl m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hul(jul julVar, cvl cvlVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = julVar;
        this.m = cvlVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new hul(this.l, this.m, continuation, 0);
            default:
                return new hul(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((hul) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                try {
                    if (i == 0) {
                        qgg.h0(obj);
                        oul oulVar = this.l.b;
                        cvl cvlVar = this.m;
                        this.k = 1;
                        obj = oulVar.b.e(cvlVar, this);
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
                    l18 l18Var = l18.b;
                    ArrayList a = cus.a((cvl) obj);
                    ssg.a(2, null, "loadPlaylistTracks(): " + a.size() + " tracks", null);
                    return a;
                } catch (Throwable th) {
                    ssg.a(7, null, th + " loadPlaylistTracks()", null);
                    throw th;
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    jul julVar = this.l;
                    knn knnVar = julVar.c;
                    cvl cvlVar2 = this.m;
                    cvlVar2.getClass();
                    Collection collection = (Collection) ((AtomicReference) knnVar.b).get();
                    Boolean valueOf = collection != null ? Boolean.valueOf(collection.contains(cvlVar2.e())) : null;
                    ssg.a(2, null, String.format("isUnseen(): %s = %s", Arrays.copyOf(new Object[]{cvlVar2, valueOf}, 2)), null);
                    if (valueOf == null || valueOf.booleanValue()) {
                        knn knnVar2 = julVar.c;
                        ssg.a(2, null, String.format("markAsSeen(): %s", Arrays.copyOf(new Object[]{cvlVar2}, 1)), null);
                        AtomicReference atomicReference = (AtomicReference) knnVar2.b;
                        Collection collection2 = (Collection) atomicReference.get();
                        if (collection2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : collection2) {
                                if (!Intrinsics.d((String) obj2, cvlVar2.e())) {
                                    arrayList.add(obj2);
                                }
                            }
                            atomicReference.set(arrayList);
                        }
                        oul oulVar2 = julVar.b;
                        this.k = 1;
                        if (oulVar2.b(cvlVar2, this) == nm6Var2) {
                            return nm6Var2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
