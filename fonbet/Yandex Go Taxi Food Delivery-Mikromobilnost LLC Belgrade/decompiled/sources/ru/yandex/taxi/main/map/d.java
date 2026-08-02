package ru.yandex.taxi.main.map;

import defpackage.jtq0;
import defpackage.ny61;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class d {
    public final ru.yandex.taxi.experiments.addressttl.a a;
    public final jtq0 b;

    public d(ru.yandex.taxi.experiments.addressttl.a aVar, jtq0 jtq0Var) {
        this.a = aVar;
        this.b = jtq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Long l, ContinuationImpl continuationImpl) {
        MainScreenAddressTtlInteractor$isAddressOutdated$1 mainScreenAddressTtlInteractor$isAddressOutdated$1;
        Object obj;
        int i;
        Long l2;
        TimeUnit timeUnit;
        if (continuationImpl instanceof MainScreenAddressTtlInteractor$isAddressOutdated$1) {
            mainScreenAddressTtlInteractor$isAddressOutdated$1 = (MainScreenAddressTtlInteractor$isAddressOutdated$1) continuationImpl;
            int i2 = mainScreenAddressTtlInteractor$isAddressOutdated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenAddressTtlInteractor$isAddressOutdated$1.label = i2 - Integer.MIN_VALUE;
                obj = mainScreenAddressTtlInteractor$isAddressOutdated$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenAddressTtlInteractor$isAddressOutdated$1.label;
                ru.yandex.taxi.experiments.addressttl.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mainScreenAddressTtlInteractor$isAddressOutdated$1.L$0 = l;
                    mainScreenAddressTtlInteractor$isAddressOutdated$1.label = 1;
                    obj = aVar.b(mainScreenAddressTtlInteractor$isAddressOutdated$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        timeUnit = (TimeUnit) mainScreenAddressTtlInteractor$isAddressOutdated$1.L$1;
                        l2 = (Long) mainScreenAddressTtlInteractor$isAddressOutdated$1.L$0;
                        kotlin.b.b(obj);
                        long millis = timeUnit.toMillis(((Number) obj).intValue());
                        long d = this.b.d();
                        if (l2 == null) {
                            return Boolean.valueOf(d > l2.longValue() + millis);
                        }
                        return Boolean.FALSE;
                    }
                    l = (Long) mainScreenAddressTtlInteractor$isAddressOutdated$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                mainScreenAddressTtlInteractor$isAddressOutdated$1.L$0 = l;
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                mainScreenAddressTtlInteractor$isAddressOutdated$1.L$1 = timeUnit2;
                mainScreenAddressTtlInteractor$isAddressOutdated$1.label = 2;
                Object a = aVar.a(mainScreenAddressTtlInteractor$isAddressOutdated$1);
                if (a != coroutineSingletons) {
                    l2 = l;
                    timeUnit = timeUnit2;
                    obj = a;
                    long millis2 = timeUnit.toMillis(((Number) obj).intValue());
                    long d2 = this.b.d();
                    if (l2 == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        mainScreenAddressTtlInteractor$isAddressOutdated$1 = new MainScreenAddressTtlInteractor$isAddressOutdated$1(this, continuationImpl);
        obj = mainScreenAddressTtlInteractor$isAddressOutdated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenAddressTtlInteractor$isAddressOutdated$1.label;
        ru.yandex.taxi.experiments.addressttl.a aVar2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
