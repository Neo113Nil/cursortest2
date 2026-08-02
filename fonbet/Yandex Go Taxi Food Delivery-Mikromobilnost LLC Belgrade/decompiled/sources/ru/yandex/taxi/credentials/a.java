package ru.yandex.taxi.credentials;

import defpackage.ny61;
import defpackage.szv0;
import defpackage.uwq0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ExternalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1 externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ExternalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1) {
            externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1 = (ExternalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1) continuation;
            int i2 = externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<uwq0> b = ((szv0) obj).b();
                    ArrayList arrayList = new ArrayList();
                    for (uwq0 uwq0Var : b) {
                        String str = uwq0Var.h;
                        Pair pair = str == null ? null : new Pair(str, uwq0Var.I);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.L$0 = null;
                    externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.L$1 = null;
                    externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.L$2 = null;
                    externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.L$3 = null;
                    externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1 = new ExternalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1(this, continuation);
        Object obj22 = externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServiceAdjustRepositoryImpl$onResume$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
