package ru.yandex.taxi.scooters.presentation.loading;

import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, long j, ContinuationImpl continuationImpl) {
        ScootersLoadingExtensionsKt$dismissAfterDelay$1 scootersLoadingExtensionsKt$dismissAfterDelay$1;
        int i;
        if (continuationImpl instanceof ScootersLoadingExtensionsKt$dismissAfterDelay$1) {
            scootersLoadingExtensionsKt$dismissAfterDelay$1 = (ScootersLoadingExtensionsKt$dismissAfterDelay$1) continuationImpl;
            int i2 = scootersLoadingExtensionsKt$dismissAfterDelay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLoadingExtensionsKt$dismissAfterDelay$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLoadingExtensionsKt$dismissAfterDelay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLoadingExtensionsKt$dismissAfterDelay$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersLoadingExtensionsKt$dismissAfterDelay$1.L$0 = bVar;
                    scootersLoadingExtensionsKt$dismissAfterDelay$1.J$0 = j;
                    scootersLoadingExtensionsKt$dismissAfterDelay$1.label = 1;
                    if (kotlinx.coroutines.a.i(j, scootersLoadingExtensionsKt$dismissAfterDelay$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) scootersLoadingExtensionsKt$dismissAfterDelay$1.L$0;
                    kotlin.b.b(obj);
                }
                bVar.i();
                return zy11.a;
            }
        }
        scootersLoadingExtensionsKt$dismissAfterDelay$1 = new ScootersLoadingExtensionsKt$dismissAfterDelay$1(continuationImpl);
        Object obj2 = scootersLoadingExtensionsKt$dismissAfterDelay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLoadingExtensionsKt$dismissAfterDelay$1.label;
        if (i != 0) {
        }
        bVar.i();
        return zy11.a;
    }
}
