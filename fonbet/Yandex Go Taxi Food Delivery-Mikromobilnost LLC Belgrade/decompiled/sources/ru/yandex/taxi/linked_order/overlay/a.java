package ru.yandex.taxi.linked_order.overlay;

import defpackage.mly;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wl40;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ mly b;

    public a(vpr vprVar, mly mlyVar) {
        this.a = vprVar;
        this.b = mlyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedMultiOrderOverlay$start$$inlined$map$1$2$1 linkedMultiOrderOverlay$start$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LinkedMultiOrderOverlay$start$$inlined$map$1$2$1) {
            linkedMultiOrderOverlay$start$$inlined$map$1$2$1 = (LinkedMultiOrderOverlay$start$$inlined$map$1$2$1) continuation;
            int i2 = linkedMultiOrderOverlay$start$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedMultiOrderOverlay$start$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedMultiOrderOverlay$start$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedMultiOrderOverlay$start$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    List list = ((wl40) obj).b;
                    linkedMultiOrderOverlay$start$$inlined$map$1$2$1.L$0 = null;
                    linkedMultiOrderOverlay$start$$inlined$map$1$2$1.L$1 = null;
                    linkedMultiOrderOverlay$start$$inlined$map$1$2$1.L$2 = null;
                    linkedMultiOrderOverlay$start$$inlined$map$1$2$1.L$3 = null;
                    linkedMultiOrderOverlay$start$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(list, linkedMultiOrderOverlay$start$$inlined$map$1$2$1) == coroutineSingletons) {
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
        linkedMultiOrderOverlay$start$$inlined$map$1$2$1 = new LinkedMultiOrderOverlay$start$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedMultiOrderOverlay$start$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedMultiOrderOverlay$start$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
