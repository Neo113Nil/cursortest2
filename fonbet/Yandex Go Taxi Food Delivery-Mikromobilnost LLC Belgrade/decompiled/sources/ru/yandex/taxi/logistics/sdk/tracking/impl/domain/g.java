package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.gri;
import defpackage.j00;
import defpackage.ny61;
import defpackage.un;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MessengerInteractor$special$$inlined$mapNotNull$1$2$1 messengerInteractor$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof MessengerInteractor$special$$inlined$mapNotNull$1$2$1) {
            messengerInteractor$special$$inlined$mapNotNull$1$2$1 = (MessengerInteractor$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = messengerInteractor$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerInteractor$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = messengerInteractor$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerInteractor$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.b.getClass();
                    ArrayList b = j00.b((gri) obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof un) {
                            arrayList.add(next);
                        }
                    }
                    Object R = kotlin.collections.a.R(arrayList);
                    if (R != null) {
                        messengerInteractor$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        messengerInteractor$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        messengerInteractor$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        messengerInteractor$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        messengerInteractor$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        messengerInteractor$special$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        messengerInteractor$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(R, messengerInteractor$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        messengerInteractor$special$$inlined$mapNotNull$1$2$1 = new MessengerInteractor$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = messengerInteractor$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerInteractor$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
