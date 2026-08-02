package ru.yandex.taxi.logistics.sdk.delivery.edit;

import defpackage.a7i;
import defpackage.c7i;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.vpr;
import defpackage.z6i;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ tse b;

    public a(b bVar, tse tseVar) {
        this.a = bVar;
        this.b = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(a7i a7iVar, Continuation continuation) {
        DeliveryEditInteractorImpl$edit$1$1$emit$1 deliveryEditInteractorImpl$edit$1$1$emit$1;
        int i;
        if (continuation instanceof DeliveryEditInteractorImpl$edit$1$1$emit$1) {
            deliveryEditInteractorImpl$edit$1$1$emit$1 = (DeliveryEditInteractorImpl$edit$1$1$emit$1) continuation;
            int i2 = deliveryEditInteractorImpl$edit$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryEditInteractorImpl$edit$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryEditInteractorImpl$edit$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryEditInteractorImpl$edit$1$1$emit$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n0 n0Var = bVar.d;
                    deliveryEditInteractorImpl$edit$1$1$emit$1.L$0 = a7iVar;
                    deliveryEditInteractorImpl$edit$1$1$emit$1.label = 1;
                    if (n0Var.emit(a7iVar, deliveryEditInteractorImpl$edit$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a7iVar = (a7i) deliveryEditInteractorImpl$edit$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                a7iVar.getClass();
                if (!(a7iVar instanceof z6i)) {
                    c7i c7iVar = bVar.c;
                    String a = a7iVar.a();
                    r0 r0Var = c7iVar.a;
                    r0Var.m(null, v4r0.f((Set) r0Var.getValue(), a));
                    kotlinx.coroutines.a.n(this.b.getCoroutineContext()).a(null);
                }
                return zy11.a;
            }
        }
        deliveryEditInteractorImpl$edit$1$1$emit$1 = new DeliveryEditInteractorImpl$edit$1$1$emit$1(this, continuation);
        Object obj2 = deliveryEditInteractorImpl$edit$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryEditInteractorImpl$edit$1$1$emit$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        a7iVar.getClass();
        if (!(a7iVar instanceof z6i)) {
        }
        return zy11.a;
    }
}
