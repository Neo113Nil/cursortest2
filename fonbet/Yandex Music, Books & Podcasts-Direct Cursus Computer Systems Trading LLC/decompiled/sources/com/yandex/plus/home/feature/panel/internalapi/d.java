package com.yandex.plus.home.feature.panel.internalapi;

import android.util.SparseArray;
import android.view.View;
import com.yandex.plus.bdui.flex.ui.s;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.tf6;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y2x;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ s m;
    public final /* synthetic */ View n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, View view, boolean z, Continuation continuation) {
        super(2, continuation);
        this.m = sVar;
        this.n = view;
        this.l = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d(this.m, this.n, this.l, continuation);
            default:
                return new d(this.l, this.m, this.n, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((d) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                s sVar = this.m;
                SparseArray sparseArray = (SparseArray) sVar.e;
                com.yandex.plus.core.analytics.logging.d dVar = (com.yandex.plus.core.analytics.logging.d) sVar.b;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                boolean b = dVar.b(aVar);
                View view = this.n;
                if (b) {
                    dVar.a(aVar, "PlusViewAwarenessDetectorImpl", "detectViewAware() view=" + view, null);
                }
                boolean z = com.yandex.plus.bdui.flex.ui.a.q(view) > 0.8f;
                if (z && sparseArray.get(view.getId()) == null) {
                    sparseArray.put(view.getId(), x97.y((tf6) sVar.c, null, null, new d(this.l, sVar, view, (Continuation) null), 3));
                } else if (!z) {
                    int id = view.getId();
                    Object obj2 = sparseArray.get(id);
                    if (obj2 != null) {
                        sparseArray.remove(id);
                    } else {
                        obj2 = null;
                    }
                    r2f r2fVar = (r2f) obj2;
                    if (r2fVar != null) {
                        r2fVar.g(null);
                    }
                }
                ((SparseArray) sVar.d).remove(view.getId());
                break;
            default:
                s sVar2 = this.m;
                SparseArray sparseArray2 = (SparseArray) sVar2.g;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    if (!this.l) {
                        this.k = 1;
                        if (y2x.o(1500L, this) == nm6Var2) {
                        }
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                View view2 = this.n;
                s.d(sVar2, view2);
                com.yandex.plus.home.common.utils.flow.b bVar = (com.yandex.plus.home.common.utils.flow.b) sparseArray2.get(view2.getId());
                if (bVar != null) {
                    bVar.a.a(new Pair(Boolean.TRUE, Unit.a));
                }
                com.yandex.plus.home.common.utils.flow.b bVar2 = (com.yandex.plus.home.common.utils.flow.b) sparseArray2.get(view2.getId());
                if (bVar2 != null) {
                    bVar2.a.a(new Pair(Boolean.FALSE, null));
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z, s sVar, View view, Continuation continuation) {
        super(2, continuation);
        this.l = z;
        this.m = sVar;
        this.n = view;
    }
}
