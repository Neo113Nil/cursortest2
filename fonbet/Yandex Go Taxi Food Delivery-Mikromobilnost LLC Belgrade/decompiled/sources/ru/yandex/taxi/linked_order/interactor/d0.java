package ru.yandex.taxi.linked_order.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.cwa1;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.s35;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;

    public d0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1 linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1;
        int i;
        Point point;
        Pair pair;
        if (continuation instanceof LinkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1) {
            linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1 = (LinkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1) continuation;
            int i2 = linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s35 s35Var = (s35) obj;
                    zzs zzsVar = s35Var.a;
                    if (s35Var.d) {
                        zzsVar = null;
                    }
                    if (zzsVar != null) {
                        if ((!jl40.l(zzsVar, zzs.f) ? zzsVar : null) != null) {
                            point = cwa1.d(zzsVar);
                            zzs zzsVar2 = s35Var.b;
                            pair = new Pair(point, (jl40.l(zzsVar2, zzs.f) ? zzsVar2 : null) == null ? cwa1.d(zzsVar2) : null);
                            linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$0 = null;
                            linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$1 = null;
                            linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$2 = null;
                            linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$3 = null;
                            linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(pair, linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    point = null;
                    zzs zzsVar22 = s35Var.b;
                    pair = new Pair(point, (jl40.l(zzsVar22, zzs.f) ? zzsVar22 : null) == null ? cwa1.d(zzsVar22) : null);
                    linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$0 = null;
                    linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$1 = null;
                    linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$2 = null;
                    linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.L$3 = null;
                    linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1) == coroutineSingletons) {
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
        linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1 = new LinkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlayDataInteractor$listenSourceDestination$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
