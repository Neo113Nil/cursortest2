package ru.yandex.taxi.styling;

import com.yandex.go.zone.model.ZoneMode;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.e430;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.zonemodes.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Le430;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.styling.ModeStylesRepositoryImpl$styleForOrderHolder$1", f = "ModeStylesRepositoryImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ModeStylesRepositoryImpl$styleForOrderHolder$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeStylesRepositoryImpl$styleForOrderHolder$1(c cVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ModeStylesRepositoryImpl$styleForOrderHolder$1 modeStylesRepositoryImpl$styleForOrderHolder$1 = new ModeStylesRepositoryImpl$styleForOrderHolder$1(this.this$0, this.$orderHolder, continuation);
        modeStylesRepositoryImpl$styleForOrderHolder$1.L$0 = obj;
        return modeStylesRepositoryImpl$styleForOrderHolder$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ModeStylesRepositoryImpl$styleForOrderHolder$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0.a;
            o2y0 o2y0Var = this.$orderHolder;
            this.L$0 = vprVar;
            this.label = 1;
            obj = jVar.f(o2y0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        e430 c = this.this$0.b.c((ZoneMode) obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
