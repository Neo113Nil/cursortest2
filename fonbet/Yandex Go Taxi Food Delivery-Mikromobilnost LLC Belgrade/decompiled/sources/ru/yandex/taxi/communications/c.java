package ru.yandex.taxi.communications;

import defpackage.ny61;
import defpackage.s66;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.storage.CommunicationsCacheMode;

/* loaded from: classes9.dex */
public final class c {
    public final s66 a;

    public c(s66 s66Var) {
        this.a = s66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        GoCommunicationsCacheModeRepository$getCacheMode$1 goCommunicationsCacheModeRepository$getCacheMode$1;
        int i;
        if (continuationImpl instanceof GoCommunicationsCacheModeRepository$getCacheMode$1) {
            goCommunicationsCacheModeRepository$getCacheMode$1 = (GoCommunicationsCacheModeRepository$getCacheMode$1) continuationImpl;
            int i2 = goCommunicationsCacheModeRepository$getCacheMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goCommunicationsCacheModeRepository$getCacheMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goCommunicationsCacheModeRepository$getCacheMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goCommunicationsCacheModeRepository$getCacheMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    goCommunicationsCacheModeRepository$getCacheMode$1.label = 1;
                    obj = this.a.b.b(goCommunicationsCacheModeRepository$getCacheMode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return !((Boolean) obj).booleanValue() ? CommunicationsCacheMode.RAM : CommunicationsCacheMode.DISK;
            }
        }
        goCommunicationsCacheModeRepository$getCacheMode$1 = new GoCommunicationsCacheModeRepository$getCacheMode$1(this, continuationImpl);
        Object obj2 = goCommunicationsCacheModeRepository$getCacheMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goCommunicationsCacheModeRepository$getCacheMode$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
