package ru.yandex.taxi.scooters.presentation.arbitrary_destination.data;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w33;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1 scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ScootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1) {
            scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1 = (ScootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1) continuation;
            int i2 = scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!jl40.l(((w33) obj).a, zzs.f)) {
                        scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.L$0 = null;
                        scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.L$1 = null;
                        scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.L$2 = null;
                        scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.L$3 = null;
                        scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1 = new ScootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersArbitraryDestinationRepository$listenArbitraryDestination$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
