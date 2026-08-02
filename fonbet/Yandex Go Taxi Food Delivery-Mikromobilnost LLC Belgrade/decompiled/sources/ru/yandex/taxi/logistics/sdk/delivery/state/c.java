package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.a7i;
import defpackage.jw40;
import defpackage.vpr;
import defpackage.x6i;
import defpackage.z6i;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        z6i z6iVar;
        jw40 c;
        a7i a7iVar = (a7i) obj;
        boolean z = a7iVar instanceof x6i;
        zy11 zy11Var = zy11.a;
        d dVar = this.a;
        if (z) {
            x6i x6iVar = (x6i) a7iVar;
            jw40 c2 = x6iVar.c();
            if (c2 != null) {
                b bVar = (b) dVar.b;
                Object a = androidx.datastore.preferences.core.b.a(bVar.b(bVar.a), new DeliveryAlertsDataStoreImpl$addAlert$2(x6iVar.a(), bVar.b.d(c2), bVar, null), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (a != coroutineSingletons) {
                    a = zy11Var;
                }
                if (a == coroutineSingletons) {
                    return a;
                }
            }
        } else if ((a7iVar instanceof z6i) && (c = (z6iVar = (z6i) a7iVar).c()) != null) {
            b bVar2 = (b) dVar.b;
            Object a2 = androidx.datastore.preferences.core.b.a(bVar2.b(bVar2.a), new DeliveryAlertsDataStoreImpl$addAlert$2(z6iVar.a(), bVar2.b.d(c), bVar2, null), continuation);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (a2 != coroutineSingletons2) {
                a2 = zy11Var;
            }
            if (a2 == coroutineSingletons2) {
                return a2;
            }
        }
        return zy11Var;
    }
}
