package ru.yandex.taxi.logistics.sdk.promotions.impl.domain;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.s9s0;
import defpackage.st2;
import defpackage.tje;
import defpackage.wq4;
import defpackage.xq4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.promotions.impl.data.e;

/* loaded from: classes5.dex */
public final class a {
    public final e a;
    public final ike b;

    public a(e eVar, st2 st2Var) {
        this.a = eVar;
        this.b = bvf0.a(cvw.U(jl40.a(), st2Var.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008a -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        BannersShownPolicyInteractor$filterValid$1 bannersShownPolicyInteractor$filterValid$1;
        int i;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        if (continuationImpl instanceof BannersShownPolicyInteractor$filterValid$1) {
            bannersShownPolicyInteractor$filterValid$1 = (BannersShownPolicyInteractor$filterValid$1) continuationImpl;
            int i4 = bannersShownPolicyInteractor$filterValid$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bannersShownPolicyInteractor$filterValid$1.label = i4 - Integer.MIN_VALUE;
                Object obj = bannersShownPolicyInteractor$filterValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersShownPolicyInteractor$filterValid$1.label;
                if (i != 0) {
                    b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = bannersShownPolicyInteractor$filterValid$1.I$1;
                    i3 = bannersShownPolicyInteractor$filterValid$1.I$0;
                    xq4 xq4Var = (xq4) bannersShownPolicyInteractor$filterValid$1.L$6;
                    Object next = bannersShownPolicyInteractor$filterValid$1.L$5;
                    it = (Iterator) bannersShownPolicyInteractor$filterValid$1.L$4;
                    collection = (Collection) bannersShownPolicyInteractor$filterValid$1.L$3;
                    b.b(obj);
                    s9s0 s9s0Var = (s9s0) obj;
                    wq4 wq4Var = xq4Var.e;
                    boolean z = s9s0Var.a >= wq4Var.a;
                    boolean z2 = s9s0Var.b >= wq4Var.c;
                    boolean z3 = s9s0Var.c >= wq4Var.b;
                    if (z && z2 && z3) {
                        collection.add(next);
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        xq4Var = (xq4) next;
                        String str = xq4Var.a;
                        bannersShownPolicyInteractor$filterValid$1.L$0 = null;
                        bannersShownPolicyInteractor$filterValid$1.L$1 = null;
                        bannersShownPolicyInteractor$filterValid$1.L$2 = null;
                        bannersShownPolicyInteractor$filterValid$1.L$3 = collection;
                        bannersShownPolicyInteractor$filterValid$1.L$4 = it;
                        bannersShownPolicyInteractor$filterValid$1.L$5 = next;
                        bannersShownPolicyInteractor$filterValid$1.L$6 = xq4Var;
                        bannersShownPolicyInteractor$filterValid$1.I$0 = i3;
                        bannersShownPolicyInteractor$filterValid$1.I$1 = i2;
                        bannersShownPolicyInteractor$filterValid$1.I$2 = 0;
                        bannersShownPolicyInteractor$filterValid$1.label = 1;
                        obj = this.a.d(str, bannersShownPolicyInteractor$filterValid$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        s9s0 s9s0Var2 = (s9s0) obj;
                        wq4 wq4Var2 = xq4Var.e;
                        if (s9s0Var2.a >= wq4Var2.a) {
                        }
                        if (s9s0Var2.b >= wq4Var2.c) {
                        }
                        if (s9s0Var2.c >= wq4Var2.b) {
                        }
                        if (z) {
                            collection.add(next);
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        bannersShownPolicyInteractor$filterValid$1 = new BannersShownPolicyInteractor$filterValid$1(this, continuationImpl);
        Object obj2 = bannersShownPolicyInteractor$filterValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersShownPolicyInteractor$filterValid$1.label;
        if (i != 0) {
        }
    }

    public final void b(String str) {
        tje.N(this.b, null, null, new BannersShownPolicyInteractor$onShown$1(this, str, null), 3);
    }

    public final void c(String str) {
        tje.N(this.b, null, null, new BannersShownPolicyInteractor$onTapped$1(this, str, null), 3);
    }
}
