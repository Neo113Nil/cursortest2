package ru.yandex.taxi.maas.impl.ride.exitchoice;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq00;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lbl00;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseOverlay$pinIconFlow$1", f = "MaasExitChooseOverlay.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MaasExitChooseOverlay$pinIconFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasExitChooseOverlay$pinIconFlow$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MaasExitChooseOverlay$pinIconFlow$1 maasExitChooseOverlay$pinIconFlow$1 = new MaasExitChooseOverlay$pinIconFlow$1(this.this$0, continuation);
        maasExitChooseOverlay$pinIconFlow$1.L$0 = obj;
        return maasExitChooseOverlay$pinIconFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasExitChooseOverlay$pinIconFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r1.emit(r3, r23) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r3 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            com.yandex.go.pin.api.widget.b bVar = dVar.W;
            sq00 sq00Var = new sq00(dVar.Z.b(false), null, false, null, null, null, null, false, false, null, null, 0.0f, 8190);
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            e = bVar.e(sq00Var, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
            e = obj;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
