package ru.yandex.taxi.map.overlay.pickup;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.overlay.pickup.PickupPointMapObject$highlightPointAnimation$1", f = "PickupPointMapObject.kt", l = {47, 48}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PickupPointMapObject$highlightPointAnimation$1 extends SuspendLambda implements wls {
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupPointMapObject$highlightPointAnimation$1 pickupPointMapObject$highlightPointAnimation$1 = new PickupPointMapObject$highlightPointAnimation$1(2, continuation);
        pickupPointMapObject$highlightPointAnimation$1.L$0 = obj;
        return pickupPointMapObject$highlightPointAnimation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupPointMapObject$highlightPointAnimation$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (kotlinx.coroutines.a.i(60, r7) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0049 -> B:6:0x004c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            i = 0;
            if (i < 5) {
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.I$0;
                kotlin.b.b(obj);
                i = i2 + 1;
                if (i < 5) {
                    return zy11.a;
                }
                Integer num = new Integer(i);
                this.L$0 = vprVar;
                this.I$0 = i;
                this.label = 1;
                if (vprVar.emit(num, this) != coroutineSingletons) {
                    i2 = i;
                    this.L$0 = vprVar;
                    this.I$0 = i2;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            i2 = this.I$0;
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.I$0 = i2;
            this.label = 2;
        }
    }
}
