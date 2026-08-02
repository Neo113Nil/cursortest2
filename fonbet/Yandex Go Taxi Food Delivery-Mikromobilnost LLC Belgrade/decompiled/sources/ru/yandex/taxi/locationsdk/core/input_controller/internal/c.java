package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.jdt0;
import defpackage.ny61;
import defpackage.q6z;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ jdt0 b;

    public c(vpr vprVar, jdt0 jdt0Var) {
        this.a = vprVar;
        this.b = jdt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        InputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1 inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof InputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1) {
            inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1 = (InputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1) continuation;
            int i2 = inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (((ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b) this.b).d.contains(new q6z(((q6z) entry.getKey()).a))) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.L$0 = null;
                    inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.L$1 = null;
                    inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.L$2 = null;
                    inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.L$3 = null;
                    inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.I$0 = 0;
                    inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap, inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1) == coroutineSingletons) {
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
        inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1 = new InputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1(this, continuation);
        Object obj22 = inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputLocationProviderImpl$requestUpdatesCatching$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
