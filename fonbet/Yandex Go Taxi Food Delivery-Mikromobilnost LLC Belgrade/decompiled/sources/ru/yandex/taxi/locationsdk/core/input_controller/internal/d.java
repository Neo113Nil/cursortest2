package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.jdt0;
import defpackage.ny61;
import defpackage.rcz;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes9.dex */
public final class d {
    public final List a;
    public final TimestampSelector b;
    public final rcz c;

    public d(List list, TimestampSelector timestampSelector, rcz rczVar) {
        this.a = list;
        this.b = timestampSelector;
        this.c = rczVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25)(1:26))|12|13|(2:15|16)(1:18)))|31|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r7 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, jdt0 jdt0Var, ContinuationImpl continuationImpl) {
        InputLocationProviderImpl$getLastKnownLocationsCatching$1 inputLocationProviderImpl$getLastKnownLocationsCatching$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof InputLocationProviderImpl$getLastKnownLocationsCatching$1) {
            inputLocationProviderImpl$getLastKnownLocationsCatching$1 = (InputLocationProviderImpl$getLastKnownLocationsCatching$1) continuationImpl;
            int i2 = inputLocationProviderImpl$getLastKnownLocationsCatching$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputLocationProviderImpl$getLastKnownLocationsCatching$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inputLocationProviderImpl$getLastKnownLocationsCatching$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputLocationProviderImpl$getLastKnownLocationsCatching$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inputLocationProviderImpl$getLastKnownLocationsCatching$1.L$0 = jdt0Var;
                    inputLocationProviderImpl$getLastKnownLocationsCatching$1.I$0 = 0;
                    inputLocationProviderImpl$getLastKnownLocationsCatching$1.I$1 = 0;
                    inputLocationProviderImpl$getLastKnownLocationsCatching$1.label = 1;
                    ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b bVar = (ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b) jdt0Var;
                    Object a = bVar.a(inputLocationProviderImpl$getLastKnownLocationsCatching$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    jdt0Var = bVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jdt0Var = (jdt0) inputLocationProviderImpl$getLastKnownLocationsCatching$1.L$0;
                    kotlin.b.b(obj);
                }
                Object failure = (Map) obj;
                ru.yandex.taxi.locationsdk.core.utils.a.d(failure, dVar.c, "SourceLocationProviderOrchestrator/getLastKnownLocations", new Pair("sources", ((ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b) jdt0Var).d.toString()));
                return !(failure instanceof Result.Failure) ? kotlin.collections.b.f() : failure;
            }
        }
        inputLocationProviderImpl$getLastKnownLocationsCatching$1 = new InputLocationProviderImpl$getLastKnownLocationsCatching$1(dVar, continuationImpl);
        Object obj2 = inputLocationProviderImpl$getLastKnownLocationsCatching$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputLocationProviderImpl$getLastKnownLocationsCatching$1.label;
        if (i != 0) {
        }
        Object failure2 = (Map) obj2;
        ru.yandex.taxi.locationsdk.core.utils.a.d(failure2, dVar.c, "SourceLocationProviderOrchestrator/getLastKnownLocations", new Pair("sources", ((ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b) jdt0Var).d.toString()));
        if (!(failure2 instanceof Result.Failure)) {
        }
    }
}
