package com.yandex.plus.webview.internal;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e(this.k, continuation, 0);
            default:
                return new e(this.k, continuation, 1);
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

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        f fVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                Iterator it = fVar.s.iterator();
                while (it.hasNext()) {
                    ((com.yandex.plus.webview.api.contract.d) it.next()).h();
                }
                super/*com.yandex.plus.webview.core.h*/.f();
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                Iterator it2 = fVar.s.iterator();
                while (it2.hasNext()) {
                    ((com.yandex.plus.webview.api.contract.d) it2.next()).c();
                }
                super/*com.yandex.plus.webview.core.h*/.k();
                break;
        }
        return Unit.a;
    }
}
