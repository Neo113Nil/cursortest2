package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.home.repository.api.model.webconfig.b0;
import defpackage.aur;
import defpackage.ci0;
import defpackage.fr4;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ g l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e(this.l, continuation, 0);
            default:
                return new e(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((e) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002f, code lost:
    
        if (r8 == r0) goto L25;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.home.feature.webviews.internal.treasury.e eVar;
        int i = this.j;
        g gVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ci0 ci0Var = gVar.x0;
                    this.k = 1;
                    if (ci0Var.e(this) == nm6Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                gVar.j0();
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = gVar.Y.b;
                    this.k = 1;
                    obj = zsd.i0(x0qVar, this);
                    break;
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                b0 b0Var = (b0) obj;
                if (b0Var != null && b0Var.d && (eVar = (com.yandex.plus.home.feature.webviews.internal.treasury.e) gVar.G0.getValue()) != null) {
                    this.k = 2;
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.g;
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "preload()", null);
                    Object V = x97.V(eVar.b, new fr4(eVar, (Continuation) null, 14), this);
                    if (V != nm6Var2) {
                        V = Unit.a;
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
